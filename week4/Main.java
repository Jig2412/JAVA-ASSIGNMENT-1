public class Main {
    
    public static void main(String[] args){
        //StudentRecord Question:
       /* StudentRecord s1 = new StudentRecord("ram","S101",67);
        StudentRecord s2 = new StudentRecord("rohan","S102",97);
        StudentRecord s3 = new StudentRecord("sohan","S103",43);

        System.out.println(s1);
        System.out.println(s1.getClassification());
        System.out.println(s1.hasPassed());

        System.out.println(s2);
        System.out.println(s2.getClassification());
        System.out.println(s2.hasPassed());

        System.out.println(s3);
        System.out.println(s3.getClassification());
        System.out.println(s3.hasPassed());

        s3.setMark(80);
        System.out.println(s3.getClassification());
        System.out.println(s3.hasPassed());

        boolean result = s3.setMark(150);

        System.out.println("Invalid update successful: " + result);
        System.out.println(s3);
        */

        //BankRecord
       /*  BankAccount a1 = new BankAccount("A101", "Jigar");
        BankAccount a2 = new BankAccount("A102", "Rahul");

        
        System.out.println("Positive deposit: " + a1.deposit(500));
        System.out.println(a1);

        
        System.out.println("Zero deposit: " + a1.deposit(0));
        System.out.println(a1);

        
        System.out.println("Negative deposit: " + a1.deposit(-100));
        System.out.println(a1);

        
        System.out.println("Valid withdrawal: " + a1.withdraw(200));
        System.out.println(a1);

        
        System.out.println("Excessive withdrawal: " + a1.withdraw(1000));
        System.out.println(a1);

        
        System.out.println(a2);*/

        //Rectangle Model
        /*RectangleModel r1 = new RectangleModel();
        RectangleModel r2 = new RectangleModel(5);
        RectangleModel r3 = new RectangleModel(5,10);

        System.out.println(r1);
    System.out.println(r2);
    System.out.println(r3); 
    */


   // BookLoan
    /*Book b1 = new Book("Harry Potter", "J.K. Rowling", "B101");
    Book b2 = new Book("The Hobbit", "J.R.R. Tolkien", "B102");

    
    b1.borrowBook();

    
    b1.borrowBook();

    
    b1.returnBook();

    
    b1.returnBook();

    
    b2.borrowBook();

    System.out.println(b1);
    System.out.println(b2); */

    //Product Inventory
    /* ProductInventory p1 = new ProductInventory("P01", "Pen", 10.0, 5);
    ProductInventory p2 = new ProductInventory("P02", "Book", 50.0, 10);
    ProductInventory p3 = new ProductInventory("P03", "Bag", 500.0, 2);

   
    p1.restock(5);
    p2.sell(3);

    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);

   
    System.out.println("Total products: " + ProductInventory.getProductCount()); */

    //CourseEnrollment
    /*
    CourseEnrollment c1 = new CourseEnrollment("C101", "Java", 3);
    System.out.println(c1);

   
    c1.enroll();
    c1.enroll();
    System.out.println(c1);

   
    c1.enroll();
    System.out.println(c1);

   
    System.out.println(c1.enroll());

   
    System.out.println(c1.withdraw());

   
    CourseEnrollment c2 = new CourseEnrollment("C102", "Python", 2);
    System.out.println(c2.withdraw()); */

    //Stringfundamental

    /* System.out.println(hasText(null));
        System.out.println(hasText(""));
        System.out.println(hasText("   "));
        System.out.println(hasText("Java"));

        System.out.println(normalizeCourseCode(" cs101 "));

        System.out.println(countOccurrences("banana",'a'));

        System.out.println(lengthOfLastWord("Hello World   "));

        char[] a={'h','e','l','l','o'};
        reverseString(a);
        System.out.println(a);
         */

        //string tool kit 
        /*System.out.println(reverse("Hello"));

        System.out.println(repeat("Hi", 3));

        System.out.println(joinWords(new String[]{"Java", "OOP", "Lab"}, "-"));

        System.out.println(removeCharacterAt("Hello", 1));

        System.out.println(replaceCharacterAt("Hello", 1, 'a'));

        System.out.println(buildNumberedList(new String[]{"Java", "Python", "C++"}));

        StringBuilder sb = new StringBuilder("Hello");
        String result = sb.toString();

        sb.append(" World");

        System.out.println(result);
        System.out.println(sb); */


    

    }

}


