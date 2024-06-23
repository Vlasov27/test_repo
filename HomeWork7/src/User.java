public class User {
    private int age;
    private String firstName;
    private String lastName;
    private boolean isFinishedCourse;

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public boolean isFinishedCourse() {
        return isFinishedCourse;
    }

    private User(Bulder bulder) {
        this.firstName = bulder.firstName;
        this.lastName = bulder.lastName;
        this.age = bulder.age;
        this.isFinishedCourse = bulder.isFinishedCourse;
    }

    static class Bulder {
        private int age;
        private String firstName;
        private String lastName;
        private boolean isFinishedCourse;

        public Bulder setFirstName (String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Bulder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Bulder setAge(int age) {
            this.age = age;
            return this;
        }

        public Bulder setIsFinishedCourse(boolean isFinishedCourse) {
            this.isFinishedCourse = isFinishedCourse;
            return this;

        }
        public User build() {
            return new User(this);
        }



    }
    public class Example {
        private String text = "";

        public Example append(String text) {
            this.text += text;
            return this;
        }
        public String getText() {
            return text;
        }
    }
}






