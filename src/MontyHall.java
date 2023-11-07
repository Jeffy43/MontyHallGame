public class MontyHall{
    private String guess;
    private String behindguess;
    private String door1 = "";
    private String door2 = "";
    private String door3 = "";
    boolean reveal1;
    boolean reveal2;
    boolean reveal3;
    boolean swap;
    //randomly assigns on door to car and the rest to goat
    public void generate() {
        int a = (int) (Math.random() * 3);
        if (a == 0) {
            door1 = "Car";
            door2 = "Goat";
            door3 = "Goat";
        } else if (a == 1) {
            door1 = "Goat";
            door2 = "Car";
            door3 = "Goat";
        } else {
            door1 = "Goat";
            door2 = "Goat";
            door3 = "Car";
        }
    }
    //assigns guess to what is behind the door they chose
    public MontyHall(int guess){
        if (guess == 1) {
            this.guess = "door 1";
            this.behindguess = door1;
            reveal1 = true;
        } else if (guess == 2) {
            this.guess = "door 2";
            this.behindguess = door2;
            reveal2 = true;

        } else {
            this.guess = "door 3";
            this.behindguess = door3;
            reveal3 = true;

        }
    }

    public MontyHall(String swap){
        if(swap.equals("Yes")){
            this.swap = true;
        }else{
            this.swap = false;
        }
    }

    public String otherGoat() {
        int a = (int) (Math.random() * 2);
        String statement = "";
        String other = "";
        String other2 = "";

        if (door1.equals("Goat")) {
            other = "door 1";
        } else if (door2.equals("Goat")) {
            other = "door 2";
        }

        if (door2.equals("Goat")) {
            other2 = "door 2";
        } else if (door3.equals("Goat")) {
            other2 = "door 3";
        }

        if (guess.equals("Car")) {
            if (a > 0) {
                statement = "The other goat is in " + other;
                if(other.equals("door 1")){
                    reveal1 = true;
                }else{
                    reveal2 = true;
                }
            } else {
                statement = "The other goat is in " + other2;
                if(other2.equals("door 2")){
                    reveal2 = true;
                }else{
                    reveal3 = true;
                }
            }
        } else {
            if (guess.equals("door1") && door2.equals("Goat")) {
                statement = "The other goat is in door 2.";
            } else if (guess.equals("door1") && door3.equals("Goat")) {
                statement = "The other goat is in door 3.";
            } else if (guess.equals("door2") && door3.equals("Goat")) {
                statement = "The other goat is in door 3.";
            }else if (guess.equals("door2") && door1.equals("Goat")) {
                statement = "The other goat is in door 1.";
            }else if (guess.equals("door3") && door1.equals("Goat")) {
                statement = "The other goat is in door 1.";
            }else{
                statement = "The other goat is in door 2.";
            }
        }
        return statement;
    }

    public void swap(){
        if(swap){
            if(guess.equals("door 1")){
                if(reveal2){
                    this.guess = "door 3";
                }else{
                    this.guess = "door 2";
                }
            }
            if(guess.equals("door 2")){
                if(reveal3){
                    this.guess = "door 1";
                }else{
                    this.guess = "door 3";
                }
            }
            if(guess.equals("door 3")){
                if(reveal1){
                    this.guess = "door 2";
                }else{
                    this.guess = "door 1";
                }
            }
        }
        System.out.println(this.guess);
    }
}