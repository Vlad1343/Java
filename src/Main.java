// public class Main {
//   public static void main(String[] args) {
//     System.out.println("Hello world!");
//     System.out.println("First lesson");
//     System.out.print("Try now");
//     System.out.println("Try now2");

//     String name = "John";
//     System.out.println(name);

//     int name_2 = 5;
//     System.out.println(name_2);

//     int mynum;
//     mynum = 15;
//     System.out.println(mynum);
//     mynum = 20;
//     System.out.println(mynum);

//     // final int mynum = 15;
    
//     String namename = "James";
//     System.out.println(namename);

//     int first = 5;
//     int second = 6;
//     System.out.println(first + second);

//     System.out.println("Hello\n");
//     System.out.println("\tPizza is tasty");

//     System.out.println("\"Hello\"");
//     System.out.println("\n\\Hello\\");

//     int x = 5, y = 6, z = 50;
//     System.out.println(x + y + z);

//     int x1, y1, z1;
//     x1 = y1 = z1 = 50;
//     System.out.println(x + y + z);


    
//   }


// }

// public class Main{
//   public static void main(String[] args){

    // String studentName = "John Doe";
    // int studentID = 15;
    // int studentAge = 23;
    // float studentFee = 75.25f;
    // char studentGrade = 'B';

    // System.out.println("Student name: " + studentName);
    // System.out.println("Student id: " + studentID);
    // System.out.println("Student age: " + studentAge);
    // System.out.println("Student fee: " + studentFee);
    // System.out.println("Student grade: " + studentGrade);

    // long myNum1 = 15000000000L;
    // System.out.println(myNum1);

    // float myNum2 = 5.75f;
    // System.out.println(myNum2);

    // double myNum = 19.99d;
    // System.out.println(myNum);

    // char myGrade = 'B';
    // System.out.println(myGrade);

//     int items = 50;
//     float costPerItem = 9.99f;
//     float totalCost = items * costPerItem;
//     char currency = '$';

//     System.out.println("Number of items: " + items);
//     System.out.println("Cost per item: " + costPerItem + currency);
//     System.out.println("Total cost = " + totalCost + currency);
//   }
// }


// public class Main {
//   public static void main(String[] args) {
//     double myDouble = 9.78d;
//     int myInt = (int) myDouble;

//     System.out.println(myDouble); 
//     System.out.println(myInt);      
//   }
// }

// public class Main{
//   public static void main(String[] args){
    // int maxScore = 500;
    // int userScore = 423;
    // float percentage = (float) userScore / maxScore * 100.0f;
    // System.out.println("User's percentage is " + percentage);


    // double myDouble = 9.78d;
    // System.out.println(myDouble);
    // int myInt = (int) myDouble;
    // System.out.println(myInt);

    // int x = 4;
    // boolean game = x < 5 && x < 10; //and
    // System.out.println(game);
    // boolean game1 = x < 5 || x < 10; //or
    // System.out.println(game1);
    // boolean game2 = !(x < 5 && x < 10); //not
    // System.out.println(game2);

    
//   }
// }

// import java.util.Scanner;
// public class Main{
//   public static void main(String[] args){

    // Scanner scanner = new Scanner(System.in);
    // System.out.println("What is your name?");
    // String name = scanner.nextLine();
    
    // System.out.println("How old are you? ");
    // int age = scanner.nextInt();
    // scanner.nextLine();
    
    // System.out.println("What is your favourite food? ");
    // String food = scanner.nextLine();
    
    // System.out.println("Hello " + name);
    // System.out.println("You are " + age + " years old");
    // System.out.println("Your favourite food is " + food);


    // String txt = "Hello";
    // System.out.println(txt.length());

    // String txt1 = "Hello World";
    // System.out.println(txt1.toUpperCase());
    // System.out.println(txt1.toLowerCase());

    // String txt2 = "Please locate where 'locate' occurs!";
    // System.out.println(txt2.indexOf("locate"));

    // String firstName = "John ";
    // String lastName = "Doe";
    // System.out.println(firstName.concat(lastName));

    // String txt = "We are the so-called \"Vikings\" from the north.";
    // System.out.println(txt);
    // String txt1 = "It\'s alright.";
    // System.out.println(txt1);
    // String txt2 = "The character \\ is called backslash.";
    // System.out.println(txt2);

    // // /n = new line, /t = tab, /b = backspace, /r = carriage return, /f = form feed

    // System.out.println(Math.max(5,10));
    // System.out.println(Math.min(5,10));
    // System.out.println(Math.sqrt(64));
    // System.out.println(Math.abs(-100));
    
    // System.out.println(Math.random());
    // int randomNum = (int)(Math.random() * 101);
    // System.out.println(randomNum);


    // int myAge = 25;
    // int votingAge = 18;

    // if (myAge >= votingAge) {
    //   System.out.println("Old enough to vote!");
    // } 
    // else {
    //   System.out.println("Not old enough to vote.");
    // }

    // int x = 50;
    // int y = 50;
    // if (x == y) {
    //   System.out.println("1");
    // } 
    // else if (x > y) {
    //   System.out.println("2");
    // } 
    // else {
    //   System.out.println("3");
    // }  
    
    // int time = 20;
    // String result = (time < 18) ? "Good day." : "Good evening.";
    // System.out.println(result);


    // int day = 4;
    // switch (day) {
    //   case 1:
    //     System.out.println("Monday");
    //     break;
    //   case 2:
    //     System.out.println("Tuesday");
    //     break;
    //   case 3:
    //     System.out.println("Wednesday");
    //     break;
    //   case 4:
    //     System.out.println("Thursday");
    //     break;
    //   case 5:
    //     System.out.println("Friday");
    //     break;
    //   case 6:
    //     System.out.println("Saturday");
    //     break;
    //   case 7:
    //     System.out.println("Sunday");
    //     break;
    //   default:
    //     System.out.println("Looking forward to the Weekend");
    // }



//     int friend = 10;
//     friend = friend % 3;
//     System.out.println(friend);

//     int friend1 = 15;
//     friend1++;
//     System.out.println(friend1);
    
//   }
  
// }


// import java.swing.JOptionPane;
// public class Main{
//   public static void main(String[] args){
//     String name = JOptionPane.showInputDialog("Enter your name");
//     JOptionPane.showMessageDialog(null, "Hello "+ "name");
//     int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
//     JOptionPane.showMessageDialog(null, "You are "+ age + " years old");

//     double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
//     JOptionPane.showMessageDialog(null, "You are "+ heigh + " cm tall");

//   }
// }
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) throws Exception {
    // double x = 3.6;
    // double y = -10;
    // double z = Math.max(x,y);
    // System.out.println(z);
    // double q = Math.round(x);
    // System.out.println(q);
    // double qq = Math.ceil(x);
    // System.out.println(qq);
    // double qqq = Math.floor(x);
    // System.out.println(qqq);

    // double x;
    // double y;
    // double z;
    // Scanner scanner = new Scanner(System.in);
    // System.out.println("Enter size x: ");
    // x = scanner.nextDouble();
    // System.out.println("Enter size y: ");
    // y = scanner.nextDouble();
    // z = Math.sqrt((x*x)+(y*y));
    // System.out.println("The hypotenuse is: "+z);
    // scanner.close();

//     int i = 0;
// while (i < 5) {
//   System.out.println(i);
//   i++;
// }

// int a = 0;
// do {
//   System.out.println(a);
//   a++;
// }
// while (a < 5);

// int countdown = 3;

// while (countdown > 0) {
//   System.out.println(countdown);
//   countdown--;
// }

// System.out.println("Happy New Year!!");

// int dice = 1;

// while (dice <= 6) {
//   if (dice < 6) {
//     System.out.println("No Yatzy.");
//   } else {
//     System.out.println("Yatzy!");
//   }
//   dice = dice + 1;
// }

// for (int i = 0; i < 5; i++) {
//   System.out.println(i);
// }

// for (int i = 0; i <= 10; i = i + 2) {
//   System.out.println(i);
// }


// for (int i = 1; i <= 2; i++) {
//   System.out.println("Outer: " + i); 
// }

// for (int j = 1; j <= 3; j++) {
//     System.out.println(" Inner: " + j);
// }

// String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
// for (String i : cars) {
//   System.out.println(i);
// }

// int number = 2;
// for (int i = 1; i <= 10; i++) {
//   System.out.println(number + " x " + i + " = " + (number * i));
// } 

// for (int i = 0; i < 10; i++) {
//   if (i == 4) {
//     break;
//   }
//   System.out.println(i);
// }

// for (int i = 0; i < 10; i++) {
//   if (i == 4) {
//     continue;
//   }
//   System.out.println(i);
// }

// int i = 0;
// while (i < 10) {
//   if (i == 4) {
//     i++;
//     continue;
//   }
//   System.out.println(i);
//   i++;
// }

// String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
// System.out.println(cars[0]);
// cars[0] = "Opel";
// System.out.println(cars[0]);
// System.out.println(cars.length);

// int[] myNum = {10, 20, 30, 40};
// System.out.println(myNum[1]);

//   }
// }

// import java.util.Random;
// import java.util.Scanner;
// public class Main {
//   public static void main(String[] args) {

    // Random random = new Random();
    //int x = random.nextInt(6)+1;
    //double y = random.nextDouble();
    // boolean z = random.nextBoolean();
    // System.out.println(z);
    //System.out.println(y);
    //System.out.println(x);

    // //&& - and, || - or, ! - not
    // int temp = 2;
    // if(temp>30){
    //   System.out.println("It is hot outside");
    // }
    // else if(temp>=20 && temp <=30){
    //   System.out.println("It is warm outside");
    // }
    // else{
    //   System.out.println("It is cold outside");
    // }
    

    // Scanner scanner = new Scanner(System.in);
    // System.out.println("You are playing a game. Press q out Q to quit");
    // String response = scanner.next();
    // if(response.equals("q") || response.equals("Q")){
    //   System.out.println("You quit the game");
    // }
    // else{
    //   System.out.println("You are still playing");
    // }


    // Scanner scanner = new Scanner(System.in);
    // String name = "";
    // while(name.isEmpty()) {
    //   System.out.println("Enter your name: ");
    //   name = scanner.nextLine();
    // }
    // System.out.println("Hello "+name);

    // Scanner scanner = new Scanner(System.in);
    // String name = "";
    // do{
    //   System.out.println("Enter your name: ");
    //   name = scanner.nextLine();
    // }
    //   while(name.isEmpty());
    // System.out.println("Hello "+name);


    // for(int i = 10; i>=0; i-=2) {
    //   System.out.println(i);
    // }
    // System.out.println("Happy New Year!");



    // Scanner scanner = new Scanner(System.in);
    // int rows;
    // int columns;
    // String symbol = "";

    // System.out.println("Enter # of rows: ");
    // rows = scanner.nextInt();
    // System.out.println("Enter # of columns: ");
    // columns = scanner.nextInt();
    // System.out.println("Enter symbol to use: ");
    // symbol = scanner.next();

    // for (int i=1; i<=rows; i++){
    //   System.out.println();
    //   for(int j=1; j<=columns; j++){
    //     System.out.print(symbol);
    //   }
    // }
    


    // String[] cars = {"Camaro", "Tesla", "Mazda", "BMW"};
    // cars[0] = "Mustang";
    // System.out.println(cars[0]);


    // String[] cars = new String[3];
    // cars[0] = "Tesla";
    // cars[1] = "BMW";
    // cars[2] = "Mazda";
    // System.out.println(cars[2]);

    // for(int i=0; i<cars.length; i++){
    //   System.out.println(cars[i]);
    // }


//     String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
// for (String i : cars) {
//   System.out.println(i);
// }



// int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
// float avg, sum = 0;
// int length = ages.length;

// for (int age : ages) {
//   sum += age;
// }

// avg = sum / length;
// System.out.println("The average age is: " + avg);


// int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
// int lowestAge = ages[0];

// for (int age : ages) {
//   if (lowestAge > age) {
//     lowestAge = age;
//   }
// }

// System.out.println("The lowest age in the array is: " + lowestAge);



// int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
// System.out.println(myNumbers[1][2]);
// //myNumbers[1][2] = 9;
// System.out.println(myNumbers[1][2]);

// for (int i = 0; i < myNumbers.length; ++i) {
//   for (int j = 0; j < myNumbers[i].length; ++j) {
//     System.out.println(myNumbers[i][j]);
//   }
// }

// for (int[] row : myNumbers) {
//   for (int i : row) {
//     System.out.println(i);
//   }
// }  

//   }
// }



// public class Main{
//   public static void main(String[] args){

    // String[][] cars = new String[3][3];
    // cars[0][0] = "Mazda";
    // cars[0][1] = "Tesla";
    // cars[0][2] = "Camaro";
    // cars[1][0] = "Mustang";
    // cars[1][1] = "BMW";
    // cars[1][2] = "Ferrari";
    // cars[2][0] = "Lambo";
    // cars[2][1] = "Mercedes";
    // cars[2][2] = "Buggati";
    // for(int i=0; i<cars.length; i++){
    //   System.out.println();
    //   for(int j=0; j<cars[i].length; j++){
    //     System.out.println(cars[i][j]+" ");
    //   }
    // }

//     String[][] cars = {
//       {"Mazda","Tesla"},
//       {"Mustang","Camaro"},
//       {"Lambo","Buggati"}
//   };
// for(int i=0; i<cars.length; i++){
//       System.out.println();
//       for(int j=0; j<cars[i].length; j++){
//         System.out.println(cars[i][j]+" ");
//       }
//     }



// String name = "Vlad";
// boolean result = name.equals("Vlad");
// boolean result1 = name.equalsIgnoreCase("vlad");
// System.out.println(result);
// System.out.println(result1);

// int result = name.length();
// char result = name.charAt(0);
// int result = name.indexOf("l");
// boolean result = name.isEmpty();
// String result = name.toUpperCase();
// String result = name.toLowerCase();
// String result = name.trim();
// String result = name.replace("d", "ss");
// System.out.println(result);


// Boolean a = true;
// Character b = '$';
// Integer c = 123;
// Double d = 3.14;
// String e = "Vlad";

//   } 
// }

// public class Main {
//   static void myMethod() {
//     System.out.println("I just got executed!");
//   }

//   public static void main(String[] args) {
//     myMethod();
//   }
// }

// public class Main {
//   static void myMethod(String fname, int age) {
//     System.out.println(fname + " is " + age);
//   }

//   public static void main(String[] args) {
//     myMethod("Liam", 5);
//     myMethod("Jenny", 8);
//     myMethod("Anja", 31);
//   }
// }

// public class Main {

//   static void checkAge(int age) {

//  if (age < 18) {
//       System.out.println("Access denied - You are not old enough!");

//     } else {
//       System.out.println("Access granted - You are old enough!");
//     }

//   }

//   public static void main(String[] args) {
//     checkAge(20);
//     checkAge(18);
//     checkAge(14);
//   }
// }

// public class Main {
//   static int myMethod(int x) {
//     return 5 + x;
//   }

//   public static void main(String[] args) {
//     System.out.println(myMethod(3));
//   }
// }

// public class Main {
//   static int myMethod(int x, int y) {
//     return x + y;
//   }

//   public static void main(String[] args) {
//     int z = myMethod(5,3);
//     System.out.println(z);
//     // System.out.println(myMethod(5, 3));
//   }
// }

// import java.util.ArrayList;
// public class Main{
//     public static void main(String[] args){
        // ArrayList<String> food = new ArrayList<String>();
        // food.add("pizza");
        // food.add("ham");
        // food.add("hotdog");

        // food.set(0, "sushi");
        // food.remove(2);
        // food.clear();

        // for(int i=0; i<food.size(); i++){
        //     System.out.println(food.get(i));
        // }


        // ArrayList<ArrayList<String>> groceryList = new ArrayList();

        // ArrayList<String> bakeryList = new ArrayList();
        // bakeryList.add("pasta");
        // bakeryList.add("bread");
        // bakeryList.add("candies");
        
        // ArrayList<String> produceList = new ArrayList();
        // produceList.add("tomato");
        // produceList.add("peppers");
        // produceList.add("banana");

        // ArrayList<String> drinksList = new ArrayList();
        // drinksList.add("water");
        // drinksList.add("tea");

        // groceryList.add(bakeryList);
        // groceryList.add(produceList);
        // groceryList.add(drinksList);
        
        // System.out.println(groceryList.get(2).get(1));

        
        
        // String[] animals = {"cat", "dog", "bird", "rat"};
        // for(String i : animals){
        //     System.out.println(i);
        // }
        // // : == in

        // ArrayList<String> animals = new ArrayList<String>();
        // animals.add("cat");
        // animals.add("dog");
        // animals.add("bird");
        // animals.add("rat");

        // for(String i : animals){
        //     System.out.println(i);
        // }

//     }
// }


// public class Main{
//     public static void main(String[] args){
//         String name = "Bro";
//         int age = 21;
//         hello(name, age);

//     }
//     static void hello(String title, int age) {
//         System.out.println("Hello "+title);
//         System.out.println("You are "+age);
//     }

// }


// public class Main{
//     public static void main(String[] args){
//         int x = 3;
//         int y = 4;
//         int z = add(x,y);
//         System.out.println(add(x,y));
//     }

//     static int add(int x, int y) {
//         return x + y;
//     }
// }

// public class Main{
//     public static void main(String[] args){
//         double x = add(1.3,2.5,5.7);

//     }

    
//     static int add(int a, int b){
//         System.out.println("Method number 1");
//         return a + b;
//     }    
//     static int add(int a, int b, int c){
//         System.out.println("Method number 2");
//         return a + b + c;
//     }
//     static double add(int a, int b, int c, int d){
//         System.out.println("Method number 3");
//         return a + b + c + d;
//     }    
//     static double add(double a, double b){
//         System.out.println("Method number 4");
//         return a + b;
//     }    
//     static double add(double a, double b, double c){
//         System.out.println("Method number 5");
//         return a + b + c;
//     }
//     static double add(double a, double b, double c, double d){
//         System.out.println("Method number 6");
//         return a + b + c + d;
//     }    

// }

// public class Main{
// static int plusMethodInt(int x, int y) {
//   return x + y;
// }

// static double plusMethodDouble(double x, double y) {
//   return x + y;
// }

// public static void main(String[] args) {
//   int myNum1 = plusMethodInt(8, 5);
//   double myNum2 = plusMethodDouble(4.3, 6.26);
//   System.out.println("int: " + myNum1);
//   System.out.println("double: " + myNum2);
// }
// }

// import javafx.scene.chart.PieChartBuilder;

// public class Main{
//     public static void main(String[] args){
        // System.out.printf("%d Hello",123);
        // boolean myBoolean = true;
        // char myChar = '@';
        // String myString = "Vlad";
        // int myInt = 50;
        // double myDouble = -1000;

        // System.out.printf("%b", myBoolean);
        // System.out.printf("%c", myChar);
        // System.out.printf("%s", myString);
        // System.out.printf("%d", myInt);
        // System.out.printf("%f", myDouble);

        // System.out.printf("Hello %-10s",myString);
        // System.out.printf("You have this much money: %.1f",myDouble);
        // System.out.printf("You have this much money: %+f",myDouble);
        // System.out.printf("You have this much money: %,.2f",myDouble);


        // final double PI = 3.14159;
        // PI = 4;
        // System.out.println(PI);


        // Car myCar1 = new Car();
        // Car myCar2 = new Car();
        // System.out.println(myCar1.model);
        // System.out.println(myCar1.make);
        // System.out.println();
        // System.out.println(myCar2.model);
        // System.out.println(myCar2.make);        

        // myCar.drive();
        // myCar.brake();


        // Human human = new Human("Rick", 65, 70);
        // Human human2 = new Human("Morty", 16, 50);

        // // System.out.println(human2.name);
        // human.eat();
        // human2.drink();


//         DiceRoller diceRoller = new DiceRoller();




//     }
// }