public abstract class Kingdom {
    protected String name;

    public Kingdom(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void enter(); // Abstract method for entering the kingdom
    public abstract void startQuest();
}   