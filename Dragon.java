public class Dragon extends Monster {
    private boolean isBoss;
    private boolean isStunned;

    public Dragon(String name, int monsterHealth, int hearts) {
        super("Ygor", 10, 3);
    }

    public boolean isBoss() {
        return this.isBoss;
    }

    public boolean isStunned() {
        return this.isStunned;
    }
}