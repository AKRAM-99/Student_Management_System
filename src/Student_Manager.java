import java.util.*;
public class Student_Manager {
    ArrayList<Student> students=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    public void menu(){
        while(true){
            System.out.println("-------------------------------\n");
            System.out.println("Welcome to the Student Manager\n");
            System.out.println("Please Enter you choice to continue: \n");
            System.out.println("1. Add Student\n");
            System.out.println("2. Delete Student\n");
            System.out.println("3. View Students\n");
            System.out.println("4. Exit\n");
            System.out.println("Enter your choice: ");
            int choice=sc.nextInt();
            switch(choice) {
                case 1:
                    add();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    view();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }

    public void add(){
        System.out.println("Enter Student ID: ");
        String id=sc.next();
        sc.nextLine();
        System.out.println("Enter Student Name: ");
        String name=sc.nextLine();
        System.out.println("Enter Student Age: ");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Student Course: ");
        String course=sc.nextLine();

        Student s=new Student(id,name,age,course);
        students.add(s);
        System.out.println("Student "+name+" added successfully.\n");
    }
    public void delete(){
        System.out.println("Enter Student ID to delete: ");
        String id=sc.next();
        sc.nextLine();

        for(int i=0;i<students.size();i++){
            if(students.get(i).getId().equals(id)){
                students.remove(i);
                System.out.println("Student "+id+" deleted successfully\n");
                return;
            }
        }
        System.out.println("Student "+id+" not found\n");

    }
    public void view(){
        if(students.isEmpty()){
            System.out.println("No Students to Display");
            return;
        }
        System.out.println("ID | Name | Age | Course ");
        System.out.println("-------------------------");
        for(Student s:students){
            System.out.println(s.getId()+" | "+s.getName()+" | "+s.getAge()+" | "+s.getCourse());
        }
        System.out.println();
    }

}
