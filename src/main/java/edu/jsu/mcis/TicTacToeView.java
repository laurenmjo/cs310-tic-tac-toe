package edu.jsu.mcis;

public class TicTacToeView {

    private TicTacToeModel model;
    
    /* CONSTRUCTOR */
	
    public TicTacToeView(TicTacToeModel model) {
        
        this.model = model;
        
    }
	
    public void viewModel() {
        
        /* Print the board to the console (see examples) */
        
        /* INSERT YOUR CODE HERE */
            System.out.print("\n\n");

            for (int k = 0; k < model.getWidth(); k++) {

                System.out.print(k);

            }

            System.out.print("\n\n");

            for(int i = 0; i < model.getWidth();i++) {

                System.out.print(i + " ");

                for (int j = 0; j < model.getWidth();j++) {

                    System.out.print(model.getMark(i,j));

                }

                System.out.print("\n");

            }

            System.out.print("\n\n");

    }

    public void showNextMovePrompt() {

        /* Display a prompt for the player's next move (see examples) */

        /* INSERT YOUR CODE HERE */
            if(model.isXTurn() == true){
                System.out.println("Player 1 (X) move");
            }
            else{
                System.out.println("Player 2 (O) move");
            }

    }

    public void showInputError() {

        /* Display an error if input is invalid (see examples) */

        /* INSERT YOUR CODE HERE */
            System.out.println("Invalid input! Try again.");

    }

    public void showResult(String r) {

        /* Display final winner */

        System.out.println(r + "!");

    }
	
}