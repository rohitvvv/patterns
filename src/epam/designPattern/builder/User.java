package epam.designPattern.builder;
/**
 * Design pattern example to demonstrate Builder pattern
 * @author rvaidya
 *
 */
public class User {
  private String firstName;
  private String lastName;
  private int age;
  private int phone;
  /**
   * Prevent access to the constructor
   * Use builder to construct the object
   * @param builder
   */
  private User(UserBuilder builder){
     this.firstName=builder.firstName;
     this.lastName=builder.lastName;
     this.age=builder.age;
     this.phone=builder.phone;
  }
  /**
   * Accessor for Age
   * @return Integer Age
   */
  public int getAge(){
	  return age;
  }
  /**
   * Accessor for phone
   * @return
   */
  public int getPhone(){
	  return phone;
  }
  /**
   * Accessor for First Name
   * @return
   */
  public String getFirstName(){
	  return firstName;
  }
  /**
   * Accessor for Last Name
   * @return
   */
  public String getLastName(){
	  return lastName;
  }
  
  public static class UserBuilder{
	  private String firstName;
	  private String lastName;
	  private int age;
	  private int phone;
	  public UserBuilder(String firstName,String lastName){
		  this.firstName=firstName;
		  this.lastName=lastName;
	  }
	  public UserBuilder setAge(int age){
		  this.age=age;
		  return this;
	  }
	  public UserBuilder setPhone(int phone){
		  this.phone=phone;
		  return this;
	  }
	  public User build(){
		  return new User(this);
	  }
  }
  
  public static void main(String...strings){
	  //Create new instance of builder which will build the User object
	  User rohit = new User.UserBuilder("Rohit","Vaidya").setAge(10).setPhone(123456).build();
      System.out.println(rohit.firstName);
      System.out.println(rohit.age);
  }

}
