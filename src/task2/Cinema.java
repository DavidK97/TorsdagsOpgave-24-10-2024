package task2;


public class Cinema {
    String[][] seats;

    // Række 0, sæde 0 er altid reserveret til direktøren og skal derfor have værdien X
    // Sæder, der ikke er reserveret, har værdien "O"
    public Cinema(int rows, int seats) {
        this.seats = new String[rows][seats]; // 1. seats double Array'et skal instantieres som det første
        for(int i = 0; i < rows; i++) {  //2. Der mangler et loop der tildeler værdien "0" til alle sæder der ikke er reserveret
            for(int j = 0; j < seats; j++) {
                this.seats[i][j] = "0";
            }
        }
        this.seats[0][0] = "X";
    }

    public int getRows() {
        return seats.length - 1; //3. Vi må minus med 1 da vi ellers "ryger" ud af indexet, fordi salen egentlig kun er 9X19
    }

    public int getSeats() {
        return seats[0].length - 1; //4. Vi må minus med 1 da vi ellers "ryger" ud af indexet, fordi salen egentlig kun er 9X19
    }

    // If the seat is not yet reserved, it's value is O.
    // In that case, change the value to X and return true.
    // If the seat is already reserved, return false.
    public boolean reserve(int row, int seat) {
        if (seats[row][seat].equals("0")) {
            seats[row][seat] = "X";
            return true;
        }
        return false;
    }

    public boolean cancelReservation(int row, int seat) {
        if (seats[row][seat].equals("X")) { //Lille x rettet til stort X
            seats[row][seat] = "0";  //bogstavet O rettes til 0
            return true;
        }
        return false;
    }

    public String toString() {
        String result = "";  //Dette kan ikke starte som null, da null ikke kan plusses med en String, som der sker længere nede
        for (int i = 0; i < seats.length; i++) {
            result += "|";
            for (int j = 0; j < seats[i].length; j++) {
                result += seats[i][j] + "|";
            }
            result += "\n";
        }
        return result;
    }
}