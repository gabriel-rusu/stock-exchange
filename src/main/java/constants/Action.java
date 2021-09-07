package constants;

public enum Action {
    PLOT("Plot"),
    COMPARE("Compare all");
    

    String v;

    Action(String actionName) {
        this.v = actionName;
    }

    public String v() {
        return v;
    }
}
