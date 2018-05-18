public class Equals {
    
    private final String name;
    private final int age; 

    public Equals (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if ( o == null || o.getClass() != this.getClass() ) {
            return false;
        }

        Equals passedObject = (Equals) o;
        return checkAge(passedObject) && checkName(passedObject);
    }

    @Override public int hashCode() {
        int result = 1;
        result = 31 * result + age.hashCode();
        result = 31 * result + name == null ? 0 : name.hashCode();
        return result;
    }

    public boolean CheckAge(Equals passedObject) {
        return (this.age == passedObject.age);
    }

    public boolean CheckName(Equals passedObject) {
        return (this.name == null ? passedObject.name == null : passedObject.name == this.name)
    }
}
