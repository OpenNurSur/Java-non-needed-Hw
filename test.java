/* 
* The file J_Review.java contains a class that represents your hiring profile as presented to potential employers.
* 
* 1) In the main() method, create a variable called "name" that holds your name, as a sequence of characters.
* 2) Create a variable called "age" that holds your age as a whole number.
* 3) Create a variable called "desiredSalary" that holds your desired salary per year to a precision of two decimal points.
* 4) Create a variable called "willingToRelocate" that holds a true or false value
* 5) Create a variable called "lookingForJob" that holds whether or not you are currently open to job offers.
* 6) Create a variable called "sector" that indicates whether you're seeking jobs in the S (for "service") H (for "hospitality") or P (for "private") sectors.
*/

public class test {
    public static void main(String[] args){
       String name = "Nour";
       int age = 16;
       double desiredSalary = 50008468.5;
       boolean willingToRelocate = true;
       char sector = 'S';
       

       say(name);
       System.out.println(age);
       say(desiredSalary);
       say(willingToRelocate);
    }
    public static void say(String text){
        System.out.println(text);
    }
}
