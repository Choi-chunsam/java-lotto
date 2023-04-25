package lotto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LottoMakerTest {
    @DisplayName("로또를 만들어낸다.")
    @Test
    public void makeLotto(){
        LottoMaker maker = new LottoMaker(1000);
        Lottos lottos = maker.makeLottos();

        assertThat(lottos).isNotNull();

    }

    @DisplayName("금액에 따른 로또의 갯수를 맞춰준다.")
    @Test
    public void countingCheckByMoney(){
        LottoMaker maker = new LottoMaker(2000);
        Lottos lottos = maker.makeLottos();
        int lottoCounting = lottos.getLottos().size();

        Assertions.assertEquals(lottoCounting,2);
    }
}
