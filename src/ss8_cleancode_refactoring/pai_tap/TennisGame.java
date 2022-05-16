package ss8_cleancode_refactoring.pai_tap;

public class TennisGame {

    public static String getScore(String firstPlayerName, String SecondPlayerName, int firstPersonScore, int secondPersonScore) {
        String score = "";
        int tempScore = 0;
        if (firstPersonScore == secondPersonScore) {
            score = result(firstPersonScore);
        } else if (firstPersonScore >= 4 || secondPersonScore >= 4) {
            score = win(firstPersonScore, secondPersonScore);
        } else {
            score = currentScore(firstPersonScore, secondPersonScore, score);
        }
        return score;
    }

    public static String result(int firstPersonScore) {
        String score;
        switch (firstPersonScore) {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;
        }
        return score;
    }

    public static String win(int firstPersonScore, int secondPersonScore) {
        String score;
        int minusResult = firstPersonScore - secondPersonScore;
        if (minusResult == 1) {
            score = "Advantage player1";
        } else if (minusResult == -1) {
            score = "Advantage player2";
        } else if (minusResult >= 2) {
            score = "Win for player1";
        } else {
            score = "Win for player2";
        }
        return score;
    }

    public static String currentScore(int firstPersonScore, int secondPersonScore, String score) {
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = firstPersonScore;
            else {
                score += "-";
                tempScore = secondPersonScore;
            }
            switch (tempScore) {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }
}
