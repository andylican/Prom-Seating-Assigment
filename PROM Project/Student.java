/*
 * Student.java
 * Version 1
 * @author Andy Li
 * March 1, 2020
 * Creates a student object
 */

//import statements
import java.util.ArrayList;

public class Student {
    
    //variables
    private String name;
    private String id;
    private ArrayList<Student> partners;
    private boolean paid;
    private String userName;
    private String password;
    
    //Constructors
    
    /**
     * Student
     * This constructor creates a student with partners
     * @param 2 strings representing the student's name and id, and an arraylist of students representing his/her partners
     */
    public Student(String name, String id, ArrayList<Student> partners){
        this.name = name;
        this.id = id;
        this.partners = partners;
    }
    
    /**
     * Student
     * This constructor creates a student without partners
     * @param 2 strings representing the student's name and id
     */
    public Student(String name, String id){
        this.name = name;
        this.id = id;
        partners = new ArrayList<Student>();
    }
    
    /**
     * Student
     * This constructor creates a student without partners but with a username and password and status of payment
     * @param 4 strings representing the student's name, id, username, and password, and a boolean representing status of payment
     */
    public Student(String name, String id,String userName, String password, boolean paid){
        this.name = name;
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.paid = paid;
        partners = new ArrayList<Student>();
    }
    
    /**
     * Student
     * This constructor creates a student without partners but with a username and password
     * @param 4 strings representing the student's name, id, username, and password
     */
    public Student(String name, String id,String userName, String password){
        this.name = name;
        this.id = id;
        this.userName = userName;
        this.password = password;
        partners = new ArrayList<Student>();
    }
    
    //Methods
    
    /**
     * getName()
     * This method gets the name of the student
     * @return A string representing their name
     */
    public String getName(){
        return name;
    }
    
    /**
     * getId()
     * This method gets the id of the student
     * @return A string representing their ID
     */
    public String getId(){
        return id;
    }
    
    /**
     * getPartners()
     * This method gets the arraylist of the partners of the student
     * @return An arraylist of students, representing their partners
     */
    public ArrayList<Student> getPartners(){
        return partners;
    }
    
    /**
     * setPartners()
     * This method sets the partners of the student
     * @param An arraylist of students, representing their partners
     */
    public void setPartners(ArrayList<Student> partners){
        this.partners = partners;
    } 
    
    /**
     * hasPaid()
     * This method returns true if the student has paid or false if not
     * @return: A boolean representing their status of payment
     */
    public boolean hasPaid(){
        return paid;
    }
    
    /**
     * setPaid()
     * This method sets if the student has paid or not
     * @param A boolean representing their status of payment
     */
    public void setPaid(boolean hasPaid){
        paid = hasPaid;
    }
    
    /**
     * equals()
     * This method checks if the student has the same attributes as the given student
     * @param A student representing the given student
     * @return: A boolean representing whether the student is the same or not
     */
    public boolean equals(Student s){
        if ( (s.getName()).equals(name) && ( (s.getId()).equals(id)) ) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * getUserName()
     * This method gets the userName of the student
     * @return A string representing their userName 
     */
    public String getUserName(){
        return userName;
    }
    
    /**
     * getPassword()
     * This method gets the password of the student
     * @return A string representing their password
     */
    public String getPassword(){
        return password;
    }
    
    /**
     * toString()
     * This method returns a string of the formatted info of the student
     * @return A string, representing the student's information
     */
    @Override
    public String toString() {
        return String.format("(%s, ID: %s)", this.name, this.id);
    }
    
}
// end of Student Class