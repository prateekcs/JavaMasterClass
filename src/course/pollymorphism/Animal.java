package course.pollymorphism;

public abstract class Animal {
    public String getMinSpeed() {
        return minSpeed;
    }

    public void setMinSpeed(String minSpeed) {
        this.minSpeed = minSpeed;
    }

    private String minSpeed;

    public abstract void eat();
    public abstract void run();
}
