package lotto;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LottoMaker {

    private final int countingNumByMoney; //금액에 따른 로또의 갯수

    public LottoMaker(int money) {
        if(money%1000!=0)
            throw new IllegalArgumentException("[ERROR]천원단위로 입력하세요");

        this.countingNumByMoney = money/1000;
    }

    private Lotto makeLotto(){
        //오름차순으로 만든다.
        List<Integer> lottoNum = Randoms.pickUniqueNumbersInRange(1,45,6)
                .stream().sorted().collect(Collectors.toList());
        Lotto lotto = new Lotto(lottoNum);
        return lotto;
    }

    public Lottos makeLottos(){
        List<Lotto> lottos = new ArrayList<>();
        for(int i=0;i<countingNumByMoney;i++){
            lottos.add(makeLotto());
        }
        return new Lottos(lottos);
    }


}
