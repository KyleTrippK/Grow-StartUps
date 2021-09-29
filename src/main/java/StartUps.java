public class StartUps {
    private String name;
    private String startupName;
    private String category;
    private int capitalNeeded;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartupName() {
        return startupName;
    }

    public void setStartupName(String startupName) {
        this.startupName = startupName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getCapitalNeeded() {
        return capitalNeeded;
    }

    public void setCapitalNeeded(int capitalNeeded) {
        this.capitalNeeded = capitalNeeded;
    }

    public StartUps(String name, String startupName, String category, int capitalNeeded){

        this.name = name;
        this.category = category;
        this.startupName = startupName;
        this.capitalNeeded = capitalNeeded;
    }
}
