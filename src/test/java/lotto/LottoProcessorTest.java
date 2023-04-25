package lotto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LottoProcessorTest {

    Lottos lottos;

    @BeforeEach
    void makeLottos(){
        LottoMaker maker = new LottoMaker(2000);
        lottos = maker.makeLottos();
    }


    @DisplayName("처리기가 몇개를 구매하는 보여준다.")
    @Test
    void printBuyingCountingInfo() {

        LottoInfoProcessor processor = new LottoInfoProcessor(lottos);
        String info = processor.printBuyingCountingInfo();
        Assertions.assertEquals(info,"2개를 구매하셨습니다.");
    }
    @DisplayName("처리기가 만든 로또들이 어떤 번호인지 알려준다.")
    @Test
    void printBuyingLottoNumInfo() {

        LottoInfoProcessor processor = new LottoInfoProcessor(lottos);
        processor.printBuyingLottoNumInfo();
    }
}