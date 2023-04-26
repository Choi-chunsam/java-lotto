package lotto;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class WinningLottoTest {
    @Test
    public void createWinningLotto(){
        Lotto lotto = new Lotto(List.of(1,2,3,4,5,6));
        int bonusNum = 10;
        WinningLotto winningLotto = new WinningLotto(lotto,bonusNum);

        assertThat(winningLotto).isNotNull();

    }
}
