public enum State {
        PARTIAL,
        COMPLETE,
        BLANK;
    

    private State state = BLANK;
    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
