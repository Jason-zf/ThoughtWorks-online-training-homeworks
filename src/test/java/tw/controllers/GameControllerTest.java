package tw.controllers;

import org.junit.Before;
import org.junit.Test;
import tw.commands.GuessInputCommand;
import tw.core.Answer;
import tw.core.Game;
import tw.core.GameStatus;
import tw.core.model.GuessResult;
import tw.views.GameView;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.regex.Pattern;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

/**
 * 在GameControllerTest文件中完成GameController中对应的单元测试
 */
public class GameControllerTest {
    private GameController gameController;
    private ByteArrayOutputStream outputStream;
    private GuessInputCommand guessInputCommand;
    private Game game;
    private GameView gameView;

    private boolean compareTwoStringIgnoreNewlineBreak(String string1, String string2) {
        Pattern pattern = Pattern.compile("\r|\r\n|\n");
        string1 = pattern.matcher(string1).replaceAll("");
        string2 = pattern.matcher(string2).replaceAll("");
        return string1.equals(string2);
    }

    @Before
    public void setGameController() {
        game = mock(Game.class);
        gameView = spy(new GameView());
        guessInputCommand = mock(GuessInputCommand.class);
        gameController = new GameController(game, gameView);
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void should_out_print_game_start_info_when_begin_game() throws IOException {

        gameController.beginGame();

        String expected = "------Guess Number Game, You have 6 chances to guess!  ------";
        assertTrue(compareTwoStringIgnoreNewlineBreak(expected, outputStream.toString()));
    }

    @Test
    public void should_print_fail_when_game_status_is_fail() throws IOException {
        String expected = "Game Status: fail";

        when(game.checkContinue()).thenReturn(false);
        when(game.checkStatus()).thenReturn(GameStatus.FAIL);

        gameController.play(guessInputCommand);
        assertTrue(compareTwoStringIgnoreNewlineBreak(expected, outputStream.toString()));
    }

    @Test
    public void should_return_success_when_game_status_is_success() throws IOException {
        String expected = "Game Status: success";

        when(game.checkContinue()).thenReturn(false);
        when(game.checkStatus()).thenReturn(GameStatus.SUCCESS);

        gameController.play(guessInputCommand);
        assertTrue(compareTwoStringIgnoreNewlineBreak(expected, outputStream.toString()));
    }

    @Test
    public void should_return_correct_result_when_game_status_is_continue() throws IOException {
        GuessResult guessResult = new GuessResult("1A0B", Answer.createAnswer("1 5 6 7"));

        when(game.checkContinue()).thenReturn(true).thenReturn(false);
        when(game.checkStatus()).thenReturn(GameStatus.CONTINUE);
        when(guessInputCommand.input()).thenReturn(Answer.createAnswer("1 5 6 7"));
        when(game.guess(guessInputCommand.input())).thenReturn(guessResult);
        when(game.guessHistory()).thenReturn(Arrays.asList(guessResult));

        gameController.play(guessInputCommand);
        String expected = "Guess Result: 1A0B" + "Guess History:" + "[Guess Numbers: 1 5 6 7, Guess Result: 1A0B]" + "Game Status: continue";
        assertTrue(compareTwoStringIgnoreNewlineBreak(expected, outputStream.toString()));
    }

}