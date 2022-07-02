package practice1;

public abstract class Box {

    protected int money;

    protected Box(int money) {
        this.money = money;
    }

    protected void removeMoney() {
        money = 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    protected abstract void open(Role role);

}
