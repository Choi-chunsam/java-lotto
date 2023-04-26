package lotto;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class LottoResultMaker {
    private final Lottos buyinglottos;
    private final WinningLotto winningNumbers;

    public LottoResultMaker(Lottos buyinglottos, WinningLotto winningNumbers) {
        this.buyinglottos = buyinglottos;
        this.winningNumbers = winningNumbers;
    }

    public Map<Rank,Integer> makeResult(){
        Map<Rank,Integer> result = new EnumMap<Rank, Integer>(Rank.class);

        for(Lotto lotto: buyinglottos.getLottos()){
            Rank rank = winningNumbers.match(lotto);
            result.merge(rank, 1, Integer::sum);
        }
        return result;
    }
}
