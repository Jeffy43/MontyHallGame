public class MontyHall {
    private String guess;
    private String gate1;
    private String gate2;
    private String gate3;

    public MontyHall(int guess) {
        if (guess == 1) {
            this.guess = gate1;
        } else if (guess == 2) {
            this.guess = gate2;
        } else {
            this.guess = gate3;
        }
    }

    public void generate() {
        int a = (int) (Math.random() * 3);
        int b = a - 1;
        int c = a + 1;
        if (a > b && a > c) {
            gate1 = "Car";
        } else if (b > a && b > c) {
            gate2 = "Car";
        } else {
            gate3 = "Car";
        }
        if (gate1.isEmpty()) {
            gate1 = "Goat";
        }
        if (gate2.isEmpty()) {
            gate2 = "Goat";
        }
        if (gate3.isEmpty()) {
            gate3 = "Goat";
        }
    }
    public String otherGoat(){
        int a = (int)(Math.random()*2);
        String other;
        if(guess.equals(gate1)) {
            if (a > 0) {
                other = "Gate 1";
            } else {
                other = "gate 2";
            }
        }else {

        }
    }
}
