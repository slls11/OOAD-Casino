package src;
/*  Game class creates the game and allows the user to select the game from the command line

 */
import java.util.ArrayList;
import java.util.Scanner;
import src.Observer.*;

public class Game implements Log_output{

    // Attributes
    int gameNumber = 1;
    String gameType;
    double bet;

    // Methods
    public void setGameType(){
        out("Welcome to our BlackJack/Poker Simulator");

        Scanner in = new Scanner(System.in);

        while (true) {
            out("Enter 1 to play BlackJack or 2 for Poker. Press Enter button to exit.");

            // if input is the enter button, exit loop
            String input = in.nextLine();
            if (input.length() == 0) {
                break;
            }

            // break up each item in input and analyzes to see if it's a number
            // if it is a num, select that game and start it
            try {
                int num = Integer.parseInt(input);
                if (num == 1){
                    out("BlackJack Selected");
                    this.gameType = "BlackJack";

                    /* THIS CAN BE MOVED INTO OWN START BLACKJACK METHOD */

                    // create variables for blackjack
                    Player player = new Player("User", 2, 1000.0);
                    out("Player: User has been created");
                    ArrayList<Player> players = new ArrayList<>();
                    players.add(player);
                    out("Dealer: Dealer has been created");
                    Dealer dealer = Dealer.getDealer();

                    // create BlackJack game
                    boolean run = true;
                    while (run) {

                        /* Create logger and game tracker number */
                        int log_game_number = 1;
                        Logger logger = new Logger("BlackJack", log_game_number);

                        Blackjack blackJack = new Blackjack(gameNumber, players, dealer);
                        Player user = blackJack.getUser();
                        out("Player BankRoll is: $"+ user.getBankRoll());
                        user.setBet(blackJack.betSize(user));
                        blackJack.dealHand(user, dealer, logger);
                        blackJack.playerChoice(user, dealer, logger);

                        // end of game, call logger functions
                        logger.notifyAllObservers();
                        logger.writeToFile("BlackJack", log_game_number);
                        log_game_number++;

                        out("");
                        out("Do you want to play again? Yes(1) or No(2):");
                        String play = in.nextLine();

                        try {
                            int play_again = Integer.parseInt(play);
                            if (play_again == 1){
                                out("Starting game again");
                            } else if (play_again == 2) {
                                out("Exiting BlackJack");
                                out("Game summary in logger .txt files");
                                run = false;
                                break;
                            }
                            else{
                                out(input + " is not a valid input, enter Yes(1) or No(2).");
                            }
                        } catch (NumberFormatException e) {
                            out(input + " is not a valid input, enter Yes(1) or No(2).");
                        }
                    }
                    /* END: THIS CAN BE MOVED INTO OWN START BLACKJACK METHOD */
                    break;
                }
                else if (num == 2){
                    out("Poker Selected");
                    out("Poker is still under development, please check back later...");
                    this.gameType = "Poker";
                    break;
                }
                else{
                    out("Input not accepted, please Try Again.");
                }
                }
                catch (NumberFormatException e) {
                    out(input + " is not a valid input.");
                }
            }
        in.close();
    }



}
