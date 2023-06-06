
package Week1.src;


public class Main {
    public static void main(String[] args) {
   /*     Cse cse=new Cse();
        System.out.println("Enter Department Size");
        Scanner sc= new Scanner(System.in);
        int depSize=sc.nextInt();
       // int depSize=cse.getDepartmenSize(250);
        System.out.println("Department Size is:"+depSize);



        Student student1=new Student();
        //Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.nextLine();
        student1.setName(name);
        name=student1.getName();
        System.out.println(" Given Name is\t"+  name);

        int age;
        float weight;
        float height;
        // System.out.printf("Hello and welcome!");
        Person p=new Person();
        System.out.println("Object created");

        System.out.println("Enter age, weight, height");
        p.age=sc.nextInt();
        p.weight=sc.nextFloat();
        p.height= sc.nextFloat();

        System.out.println("Age is"+p.age);
        System.out.println("Weight is"+p.weight);
        System.out.println("height is"+p.height);
        double bmi=p.calculation();
        System.out.println("BMI is"+bmi);

        Weather w=new Weather();
        w.temperature();
        Summer s=new Summer();
        s.temperature();
        Weather wea=new Summer();
        wea.temperature();

        Product product=new Product();
        System.out.printf("Enter price for each item");
        //Scanner sc=new Scanner(System.in);
        double price=sc.nextDouble();
        product.setPrice(price);
        System.out.printf("Enter quantity");
        int quantity=sc.nextInt();
        double totalPrice=product.getPrice(quantity);
        System.out.println("Total price of cart is:" +totalPrice);
*/

//        Interface
     Rectangle re=new Rectangle();
     System.out.println("Goes to interface 1");
    int Area=re.calculateArea(2,6);
        System.out.println("Area is:"+ Area);
    System.out.println("Goes to interface 2");
        int Perimeter=re.calculatePerimeter(2,6);
        System.out.println("Perimeter is:"+Perimeter);

//        Constructor

        Childclass c=new Childclass();
        Childclass c1=new Childclass (56);
        Childclass c2=new Childclass (5,4);




        System.out.println("count= "+c1.count);
        System.out.println("val= "+c1.val);
        System.out.println("val= "+c2.val);

//static
Employee e1=new Employee();

System.out.println("Age is "+Employee.age());

//Final


        TheEnd end=new TheEnd();
        int k=end.getValue(5);
        System.out.println("product= " +k);
    }
    }