public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getFullName(){
        return String.format("%s  %s", this.firstName, this.lastName);
    }
}
