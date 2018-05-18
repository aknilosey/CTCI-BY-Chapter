public class precheck {

    private final String name;
    private final int age;
    private final String level;

    public precheck (String name, int age, String level) {
        this.name = name;
        this.age = age;
        this.level = level;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getLevel() {
        return this.level;
    }

    @Override public boolean equals (Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || o.getClass() != this.getClass() {
            return false;
        }

        precheck check = (precheck) o;

        return checkName(check) && checkAge(check) && checkLevel(check);


    }

    @Override public int hashCode() {
        int result = 1;
        result = 31 * result + this.age;
        result = 31 * result + this.name.hashCode();
        result = 31 * result + this.level.hashCode();
        return result;
    }


    private boolean checkName(precheck check) {
        return (this.name == null ? check.name == null : this.name == check.name);
    }

    private boolean checkAge(precheck check) {
        return (this.age == check.age);
    }

    private boolean checkLevel(precheck check) {
        return (this.level == null ? check.level == null : this.level == check.level)
    }    
}

