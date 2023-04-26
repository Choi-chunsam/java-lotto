package lotto;

import java.util.List;

public class WinningLotto {
    private final Lotto winningLottoNumber;
    private final int bonusNum;

    public WinningLotto(Lotto winningLotto, int bonusNum) {
        this.winningLottoNumber = winningLotto;
        this.bonusNum = bonusNum;
    }

    public Rank match(Lotto lotto){
        List<Integer> numbers = lotto.getNumbers();
        int count = (int)numbers.stream()
                .filter(num -> winningLottoNumber.getNumbers().contains(num))
                .count();
        if(count == 5){
            if(numbers.contains(bonusNum)){
                return Rank.valueOf(count,true);
            }
        }

        return Rank.valueOf(count,false);
    }

    public int getBonusNum() {
        return bonusNum;
    }
}
