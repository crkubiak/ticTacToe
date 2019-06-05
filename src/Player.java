public class Player {

    private int[] choices;
    private String name;

    public Player(String name) {
        this.choices = new int[]{0, 0, 0, 0, 0};
        this.name = name;
    }

    public int[] takeTurn(int choice) {
        for (int i = 0; i < choices.length; i++){
            if (this.choices[i] == 0){
                this.choices[i] = choice;
                break;
            }
        }
        return this.choices;
    }
}
