public class Main {
    public static void main(String[] args) {
    User user = new User.Bulder().setFirstName(" Андрей").setAge(36).setIsFinishedCourse(false).setLastName("Власов").build();
        System.out.println(user.getFirstName() + " " + " " + user.getLastName() + " " + user.getAge() + " лет "  + user.isFinishedCourse());

//        User.Example example = user.new Example();
//        example.append(user.getLastName()). append(user.getFirstName()).append(user.getAge());
//
//        System.out.println(example.getText());
    }
}
