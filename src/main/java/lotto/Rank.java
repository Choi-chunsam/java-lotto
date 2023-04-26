package lotto;

import java.text.DecimalFormat;

public enum Rank {
    FIRST(6,false,2_000_000_000),
    SECOND(5,true,30_000_000),
    THIRD(5,false,1_500_000),
    FOURTH(4,false,50_000),
    FIFTH(3,false,5_000);



    private final int matchCount;
    private final boolean matchBonus;
    private final int prizeMoney;


    Rank(int matchCount,boolean matchBonus,int prizeMoney){
        this.matchCount = matchCount;
        this.matchBonus = matchBonus;
        this.prizeMoney = prizeMoney;
    }

    public static Rank valueOf(int matchCount,boolean matchBonus){
        for(Rank rank: values()){
            if(rank.matchCount == matchCount && rank.matchBonus == matchBonus){
                return rank;
            }
        }

        return null;
    }

    public int getMatchCount() {
        return matchCount;
    }



    public String getPrizeMoney() {
        DecimalFormat formatter = new DecimalFormat("#,###");
        return formatter.format(prizeMoney);
    }
}
