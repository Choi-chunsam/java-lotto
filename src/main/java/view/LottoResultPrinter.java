package view;

import lotto.LottoInfoProcessor;
import lotto.LottoResultMaker;

public class LottoResultPrinter {

    LottoInfoProcessor lottoInfoProcessor;
    LottoResultMaker lottoResultMaker;

    public LottoResultPrinter(LottoInfoProcessor lottoInfoProcessor, LottoResultMaker lottoResultMaker) {
        this.lottoInfoProcessor = lottoInfoProcessor;
        this.lottoResultMaker = lottoResultMaker;
    }

    public void printLottoBuyingInfo(){
        lottoInfoProcessor.printBuyingLottoNumInfo();
    }
    public void printLottoCountingInfo(){
        lottoInfoProcessor.printBuyingCountingInfo();
    }

    public void printLottoResult(){
    }
}
