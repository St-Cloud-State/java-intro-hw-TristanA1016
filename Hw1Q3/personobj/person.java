package personobj;

public class person{

    private String firstName;
    private String lastName;
    private String id;

    public person(String first, String last, String id){
        this.firstName = first;
        this.lastName = last;
        this.id = id;
    }

    public String getFirst(){
        return firstName;
    }
    public String getLast(){
        return lastName;
    }
    public String getID(){
        return id;
    }
    public void setFirst(String first){
        this.firstName = first;
    }
    public void setLast(String last){
        this.lastName = last;
    }
    public void setID(String id){
        this.id = id;
    }
    public String toString(){
        return firstName + " " + lastName + ": " + id;
    }
}