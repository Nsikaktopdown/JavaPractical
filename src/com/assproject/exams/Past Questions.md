## SECTION A
- 1(a) Explain the following concept with a vivid illustration:"
A variable that can hold a reference to an obiect of c l a s s A can also hold a reference to an object belonging to any subclass of A'
```java

```
- (b) Consider the following code and explain the concept of polymorphism identifying hidden and overridden methods, and overloaded member(s).
```java
overridden methods
- magnitude and diameter methods
```

- (c) Where could the keyword S u p e r be used? Use S u p e r
to resolve overloading issues in (b) above.
```java
public class Object extends myClass {


    // constructor
    public Object() {
        super.area(1.0F);
        super.speed(9);
    }


    @Override
    public void diameter(int x) {
        System.out.println("SHow 2");
    }

    public static void magnitude(int x) {

    }

}
```
- (d) What makes constructor necessary in object programming?
```
The purpose of a constructor is to ensure that the object being created starts with valid and
appropriate initial values for its attributes or properties.
```

- (e) Explain why a constructor call is different from an ordinary subroutine or function call.
- (f) Compare the 'possibility' of terminating a constructor call in Java and C++.
- (g) Briefly discuss issues that give object-oriented programming edge over previous traditional programming models. Your discussion should be centred on type, data, operations and functions.

25 Marks

## SECTION B
- .1(a) Describe five object-oriented programming (OOP) concepts that apply toJava programming.
- (b) Java is a strongly typed language. Discuss
- (c) Describe a data item scope, using a block of codes. Your program code should demonstrate the behaviour of both
  local and global data items.
```java
public class DataItem {

    // Global variable
    private int number;

    private void displayNumber(){
        number = 0;
        String name; // local variable
    }

    private void validateName(){
        number = 6;

    }
}

```  
- (d) Write a source code to create an abstract class Employees, having one abstract method paySalary;
  then create classes CoreStaff and ContractStaff that implements the abstract method of the super class.
```java
abstract class Employees {
    abstract void paySalary();
}

class CoreStaff extends Employees {

    @Override
    void paySalary() {

    }
}

class ContractStaff extends Employees {

    @Override
    void paySalary() {

    }
}

```  
- (e) Write a simple java code to demonstrate how the JOptionPane class can be used to accept GUI input from an end "user. 17 Marks

- 2(a) Write an interactive Java program that creates a method to calculate gross pay of staff, the method should receive a single parameter.
 Given that Gross Pay = Hours Worked X Standard Rate. (Hint: Assuming Standard Rate = 57.92) (b) With the aid of a diagram, describe the program development process.
```java
public class GrossPayApp {

    final static float standardRate = 57.92F;

    public static void calculateGrossPay(int workHours) {
        double grossPay = workHours * standardRate;
        System.out.println("Your gross pay is: $" + grossPay);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your work hours");
        int workHours = scanner.nextInt();
        calculateGrossPay(workHours);

    }

}
```
- (c) List 4 types of brackets used in Java programming language and explain their individual use.
```java
[array]. {scope}, (arguments)
```
- (d) Defined a method that displays the address of your university, then demonstrate how this method can be called. 14 Marks
```java
 public void displayAddress(){
   System.out.println("University of Port Harcourt, \n East/West Road, \n PMB 5323 Choba, Rivers State");
  }
```

- 3. (a)With a single line of code each, illustrate how static and non static methods can be used.
```java
public class StaticImplementation {

    public  static void staticMethod(){

    }

    public  void nonStatic(){

    }

    public static void main(String[] args) {
        // static methods can call from a static context
        staticMethod();
        
    }
}

```
- (b) State four requirements in the standard naming convention for Java Identifiers.
- (c) Using the appropriate library, create a class that includes the showMessageDialog() method.Use this method to display any message of your choice that includes an integer value.The integer value should be initiated. (Note: Make use of comments and concatenation operators.)
- (d) Name ten valid Java keywords and ten valid data identifiers.14 Marks

- 4.(a) What are the four data types accepted for declaring integer numbers in Java(, what differentiates one data type from the other?
- (b) Using appropriate examples differentiate a syntax error from a logic error.
- (c) What is the output from the following statement: `System.out.print("\\\\Can\b\\we\n\\go\t\\fishing?");`
```java
\\Ca\we
\go	\fishing?

```
- (d) Convert the variable yearlyBudget = 3095.65 to an integer. State the difference between implicit conversion and explicit conversion.
```java
float yearlyBudget = (int) 3095.65;
```
