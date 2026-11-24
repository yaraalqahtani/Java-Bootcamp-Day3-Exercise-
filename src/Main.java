//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
//    1.Write a program that checks the role of the user
//    If the role is admin print "welcome admin"
//    If the role is superuser print "welcome superuser"
//    If the role is user print "welcome user" (tip:
//    use if else)
    Scanner input = new Scanner(System.in);
    System.out.println("checks the role of the user");

    String txt = input.nextLine();
    if (txt.equalsIgnoreCase("admin")) {
        System.out.println("welcome admin");
    } else if (txt.equalsIgnoreCase("superuser")) {
        System.out.println("welcome superuser ");
    } else {
        System.out.println("welcome user ");
    }

//2.Take three numbers from the user and print the greatest number.
//        Test Data
//Input the 1st number: 25
//Input the 2nd number: 78
//Input the 3rd number: 87
System.out.println("enter num 1");
    int num1 = input.nextInt();
    System.out.println("enter num 2");
    int num2 = input.nextInt();
    System.out.println("enter num 3");
    int num3 = input.nextInt();
    if  (num1>num2&&num1>num3){
             System.out.println("it is the greatest  "+num1);
          }


    else if (num2>num1&&num2>num3) {
        System.out.println("it is the greatest  "+num2);
    }
        else{
            System.out.println("it is the greatest  "+num3);
        }

//    3.Write a Java program that generates an integer between 1 and 7
//    and displays the name of the weekday.
//            Test Data
//    number: 4
//    Expected Output:
//    Wednesday
    System.out.println("enter day number " +
            "   1 for Sunday " +
            "   2 for Monday"+
            "   3 for Tuesday "+
            "   4 for Wednesday"+
            "   5 for Thursday"+
            "   6 for Friday"+
          "   7 for Saturday"  );
int day=input.nextInt();
        switch (day){
            case 1 :
                System.out.println("Sunday");
                break;
            case 2 :
                System.out.println("Monday");
                break;
            case 3 :
                System.out.println("Tuesday");
                break;
            case 4 :
                System.out.println("Wednesday");
                break;
            case 5 :
                System.out.println("Thursday ");
                break;
            case 6 :
                System.out.println("Friday ");
                break;
            case 7:
                System.out.println("Saturday ");
                break;
            default:
                System.out.println("wrong number ");

        }

//    4.
//    Write a program that takes a numeric score as input and prints
//    the corresponding letter grade using the following grading scale:
//    A: 90-100
//    B: 80-89
//    C: 70-79
//    D: 60-69  F:
//    0-59
//    Enter your numeric score: 85
//    Numeric Score: 85
//    Letter Grade: B
    System.out.println("your numeric score");
    int x=input.nextInt();
    if (x>=90){
        System.out.println("your letter grade is A");
    }
         else if (x>=80) {
        System.out.println("your letter grade is B");
    }

    else if (x>=70) {
        System.out.println("your letter grade is C");
}
    else if (x>=60) {
        System.out.println("your letter grade is D");
    }
    else  {
        System.out.println("your letter grade is F");
    }

//    5.
//    Write a Java program that takes a person's age as input and
//    categorizes them into one of three age categories: "Child,"
//    "Teenager," or "Adult" using an if statement.
//            use an if statement to categorize the age based on the following criteria:
//• If the age is less than 13, categorize them as a "Child."
//• If the age is between 13 and 19 (inclusive), categorize them as a
//    "Teenager."
//• If the age is 20 or older, categorize them as an "Adult."
//    Sample Output:
//    Enter your age: 25
//    You are an Adult.
    System.out.println("enter your age ");
    int age =input.nextInt();
    if (age<13){
        System.out.println("child");
    }
    else if (age<=19) {
        System.out.println("Teenager");
    }
    else {
        System.out.println("Adult");
    }

}