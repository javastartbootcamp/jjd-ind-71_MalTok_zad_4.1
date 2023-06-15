package pl.javastart.task;

public class Televisor {
    private boolean tvOn;

    public Televisor(boolean tvOn) {
        this.tvOn = tvOn;
    }

    public boolean isTvSwitchedOn() {
        return tvOn;
    }

    public void setTvSwitchedOn(boolean tvSwitchedOn) {
        this.tvOn = tvSwitchedOn;
    }

    public void turnOn() {
        tvOn = true;
    }

    public void turnOff() {
        tvOn = false;
    }

    public void showStatus() {
        System.out.println("Czy telewizor jest włączony? " + tvOn);
    }
}
