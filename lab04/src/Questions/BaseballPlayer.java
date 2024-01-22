/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import java.text.NumberFormat;
import java.text.DecimalFormat;

/**
 *
 * @author ryan.wetzstein
 */
public class BaseballPlayer {

    //instance variables//
    private String name;
    private int number;
    private int singles;
    private int doubles;
    private int triples;
    private int homeRuns;
    private int atBats;
    private int walks;
    private int sacrificeFlies;

    //constructor// 
    public BaseballPlayer(String name, int number, int singles, int doubles, int triples, int homeRuns, int atBats, int walks, int sacrificeFlies) {
        this.name = name;
        this.number = number;
        this.singles = singles;
        this.doubles = doubles;
        this.triples = triples;
        this.homeRuns = homeRuns;
        this.atBats = atBats;
        this.walks = walks;
        this.sacrificeFlies = sacrificeFlies;
    }

    public double getBattingAverage() {
        double battingAverage = ((singles + doubles + triples + homeRuns) / atBats);
        return battingAverage;
    }

    public double getSluggingPercantage() {

        double sluggingPercentage = ((1 * singles) + (2 * doubles) + (3 * triples) + (4 * homeRuns)) / atBats;
        return sluggingPercentage;
    }

    public double getOnBasePercentage() {
        double onBasePercentage = (singles + doubles + triples + homeRuns + walks) / (atBats + walks + sacrificeFlies);
        return onBasePercentage;
    }

    public String getFormattedBattingAverage() {
        DecimalFormat formattedBAverage = new DecimalFormat(".000");
        double battingAverage = ((singles + doubles + triples + homeRuns) / atBats);
        String formattedBattingAverage = formattedBAverage.format(battingAverage);
        return formattedBattingAverage;
    }

    public String getFormattedSluggingPercentage() {
        DecimalFormat formattedSAverage = new DecimalFormat(".000");
        double sluggingPercentage = ((1 * singles) + (2 * doubles) + (3 * triples) + (4 * homeRuns)) / atBats;
        String formattedSluggingPercentage = formattedSAverage.format(sluggingPercentage);
        return formattedSluggingPercentage;

    }
    
    public String getFormattedOnBasePercentage() {
        DecimalFormat formattedONBAverage = new DecimalFormat(".000");
        double onBasePercentage = (singles + doubles + triples + homeRuns + walks) / (atBats + walks + sacrificeFlies);
        String formattedOnBasePercentage = formattedONBAverage.format(onBasePercentage);
        return formattedOnBasePercentage;
    }
}
