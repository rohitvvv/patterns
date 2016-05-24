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
   private User(UserBuilder builder){
	   this.firstName=builder.firstName;
	   this.lastName=builder.lastName;
	   this.age=builder.age;
	   this.phone=builder.phone;
   }
   public int getAge(){
	   return age;
   }
   public int phone(){
	   return phone;
   }
   public static class UserBuilder{
	   private String firstName;
	   private String lastName;
	   private int age;
	   private int phone;
	   public UserBuilder(String fname,String lname){
		   this.firstName=fname;
		   this.lastName=lname;
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
   public static void main(String...args){
	   User user = new User.UserBuilder("rohit","vaidya").setAge(10).setPhone(123).build();
	   System.out.println(user.getAge());
   }
}
