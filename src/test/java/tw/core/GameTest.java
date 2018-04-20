package tw.core;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import tw.core.exception.OutOfRangeAnswerException;
import tw.core.generator.AnswerGenerator;
import tw.core.model.GuessResult;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

/**
 * 在GameTest文件中完成Game中对应的单元测试
 */


public class GameTest {
    private Game game;
    private AnswerGenerator answerGenerator;
    private Game spy;

    @Before
    public void setGame() throws OutOfRangeAnswerException {
        answerGenerator = mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(Answer.createAnswer("1 2 3 4"));
        game = new Game(answerGenerator);
        spy = spy(game);
    }

    @Test
    public void should_not_throw_exception_when_correct_new_game() {
        int num = 0;
        try {
            game = new Game(answerGenerator);
        } catch (OutOfRangeAnswerException e) {
            e.printStackTrace();
            num++;
        }
        assertEquals(0, num);
    }

    @Test
    public void should_return_4A0B_when_guess_1_2_3_4() {
        String result = "4A0B";
        String input = "1 2 3 4";
        GuessResult guessResult = game.guess(Answer.createAnswer(input));

        assertEquals(result, guessResult.getResult());
        assertEquals(input, guessResult.getInputAnswer().toString());
    }

    @Test
    public void should_return_1A2B_when_guess_1_3_2_3() {
        String result = "1A2B";
        String input = "1 5 2 3";

        GuessResult guessResult = game.guess(Answer.createAnswer(input));

        assertEquals(result, guessResult.getResult());
        assertEquals(input, guessResult.getInputAnswer().toString());
    }

    @Test
    public void should_return_continue_when_check_status_is_continue() {
        GuessResult guessResult = game.guess(Answer.createAnswer("1 2 3 5"));

        assertEquals(GameStatus.CONTINUE, game.checkStatus());
        assertEquals("3A0B",guessResult.getResult());
    }

    @Test
    public void should_return_success_when_check_status_is_success() {
        GuessResult guessResult = game.guess(Answer.createAnswer("1 2 3 4"));

        assertEquals(GameStatus.SUCCESS, game.checkStatus());
        assertEquals("4A0B",guessResult.getResult());
    }

    @Test
    public void should_return_fail_when_check_status_is_fail() {
        for (int i = 0; i < 6; ++i) {
            GuessResult guessResult = game.guess(Answer.createAnswer("1 2 3 5"));
        }

        assertEquals(GameStatus.FAIL, game.checkStatus());
    }

    @Test
    public void should_return_true_when_checkContinue_status_is_continue() {
        when(spy.checkStatus()).thenReturn(GameStatus.CONTINUE);

        assertTrue(game.checkContinue());
    }

    @Test
    public void should_return_false_when_checkContinue_status_is_fail_or_success() {
        when(spy.checkStatus()).thenReturn(GameStatus.FAIL).thenReturn(GameStatus.SUCCESS);

        assertFalse(spy.checkContinue());
        assertFalse(spy.checkContinue());
    }

    @Test
    public void should_return_all_guess_results_when_get_history() {
        GuessResult guessResult = game.guess(Answer.createAnswer("1 2 3 4"));

        assertEquals(Arrays.asList(guessResult),game.guessHistory());
    }

}
