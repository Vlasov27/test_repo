package testing;

public class Human {
    private int height;
    private boolean isWorker;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
        } else {
            System.out.println("Недопустимое значение возраста, по умолчанию - 0");
        }
    }

    public Human(int height, boolean isWorker, int age) {
        this.height = height;
        this.isWorker = isWorker;
        this.age = age;
    }

    public boolean isWorker() {

        return isWorker;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWorker(boolean worker) {
        isWorker = worker;
    }

    public void work() {
        isWorker = true;
    }

    public void rellax() {
        isWorker = false;
    }

    public void grow(int vallue) {
        height += vallue;

    }
}
