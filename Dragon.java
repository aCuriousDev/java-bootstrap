public class Dragon extends Monster {
    private boolean isBoss;
    private boolean isStunned;

    public Dragon(String name, int monsterHealth, int hearts, int attack) {
        super("Ygor", 10, 3, 6);
    }


    // Je voudrai déduire les 6pv de son attaque au PV du player; puis je voudrai perdre un coeur et remettre le compteur à 10PV.

    public boolean isBoss() {
        return this.isBoss;
    }

    public boolean isStunned() {
        return this.isStunned;
    }
}