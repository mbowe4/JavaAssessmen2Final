package com.zipcodewilmington.assessment2.part3;

public enum RockPaperScissors {
    ROCK("Scissors", "Paper"),
    PAPER("Rock", "Scissors" ),
    SCISSORS("Paper", "Rock"),
    ;

    private String winningSign;
    private String losingSign;


    RockPaperScissors(String winningSign, String losingSign) {
        this.winningSign = winningSign;
        this.losingSign = losingSign;
    }

    public RockPaperScissors getRockLosingSign() {
        return SCISSORS;
    }

    public RockPaperScissors getRockWinningSign() {
        return PAPER;
    }

    public RockPaperScissors getWinningSign() {
        switch (new RockPaperScissors) {

        }
    }

    public RockPaperScissors getLosingSign() {

        return RockPaperScissors.SCISSORS;
    }


}
