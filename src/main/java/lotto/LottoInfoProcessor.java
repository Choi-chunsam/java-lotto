package lotto;

public class LottoInfoProcessor {

    private final Lottos lottos;

    public LottoInfoProcessor(Lottos lottos) {
        this.lottos = lottos;
    }

    public String printBuyingCountingInfo(){
        return lottos.getLottos().size() + "개를 구매하셨습니다.";
    }

    public void printBuyingLottoNumInfo(){
        lottos.getLottos().stream().forEach(lotto -> System.out.println(lotto));
    }

}
