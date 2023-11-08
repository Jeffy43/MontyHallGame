public class MontyHall{
    private String guess;
    private String behindguess;
    private String door1 = "";
    private String door2 = "";
    private String door3 = "";
    private String winDoor;
    boolean reveal1;
    boolean reveal2;
    boolean reveal3;
    boolean swap;
    //randomly assigns on door to car and the rest to goat
    public void generate() {
        int a = (int) (Math.random() * 3);
        if (a == 0) {
            door1 = "Car";
            winDoor = "door 1";
            door2 = "Goat";
            door3 = "Goat";
        } else if (a == 1) {
            door1 = "Goat";
            door2 = "Car";
            winDoor = "door 2";
            door3 = "Goat";
        } else {
            door1 = "Goat";
            door2 = "Goat";
            door3 = "Car";
            winDoor = "door 3";
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

        if (behindguess.equals("Car")) {
            if (a > 0) {
                statement = "The other goat is in " + other2;
                if(other.equals("door 1")){
                    reveal1 = true;
                }else{
                    reveal2 = true;
                }
            } else {
                statement = "The other goat is in " + other;
                if(other2.equals("door 2")){
                    reveal2 = true;
                }else{
                    reveal3 = true;
                }
            }
        } else {
            if (guess.equals("door 1") && door2.equals("Goat")) {
                statement = "The other goat is in door 2.";
                reveal2 = true;
            } else if (guess.equals("door 1") && door3.equals("Goat")) {
                statement = "The other goat is in door 3.";
                reveal3 = true;
            } else if (guess.equals("door 2") && door3.equals("Goat")) {
                statement = "The other goat is in door 3.";
                reveal3 = true;
            }else if (guess.equals("door 2") && door1.equals("Goat")) {
                statement = "The other goat is in door 1.";
                reveal1 = true;
            }else if (guess.equals("door 3") && door1.equals("Goat")) {
                statement = "The other goat is in door 1.";
                reveal1 = true;
            }else{
                statement = "The other goat is in door 2.";
                reveal2 = true;
            }
        }
        return statement + door1 + door2 + door3;
    }


    public void swap(){
        if(guess.equals("door 1")){
                if(reveal2){
                    guess = "door 3";
                    System.out.println("Guess switched from 1 to 3.");
                }else{
                    guess = "door 2";
                    System.out.println("Guess switched from 1 to 2.");
                }
            }else if(guess.equals("door 2")){
                if(reveal3){
                    guess = "door 1";
                    System.out.println("Guess switched from 2 to 1.");
                }else{
                    guess = "door 3";
                    System.out.println("Guess switched from 2 to 3.");
                }
            }else{
                if(reveal1){
                    guess = "door 2";
                    System.out.println("Guess switched from 3 to 2.");
                }else{
                    guess = "door 1";
                    System.out.println("Guess switched from 3 to 1.");
                }
            }
        }

        public String decision(){
            if(winDoor.equals(guess)){
                return "You won the car!";
            }else{
                return "The car is behind " + winDoor + ". You lost! (Or you could say you won a goat!)" + behindguess;
            }
        }
    }


