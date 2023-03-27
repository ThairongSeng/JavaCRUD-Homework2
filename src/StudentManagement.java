import java.util.ArrayList;
import java.util.Scanner;
public class StudentManagement {

    static void pressEnterKey(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ========================Press Enter to continue========================");
        scanner.nextLine();
    }
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int option=0;
        do{
            System.out.println("----------------------------Student System-----------------------");
            System.out.println("1.  Insert Student to System");
            System.out.println("2.  Update Student Information");
            System.out.println("3.  Search Student Information");
            System.out.println("4.  Delete Student Information");
            System.out.println("5.  Show Student Information");
            System.out.println("6.  Exit program");
            System.out.print(">>> Choose option from 1 - 6 : ");
            String strOption;
                strOption = input.nextLine();
            try {
                option = Integer.parseInt(strOption);
                if(option<=0)
                {
                    System.out.println("You can't input negative number..!");
                }
            } catch (Exception ex) {
                option = 0;
                System.out.println("You can't input letter, just only positive number..!");
            }
            switch (option) {
                case 1 -> {
                    System.out.println("---------------------------Insert Student to System---------------------------");
                    Student newStudent = new Student();
                    newStudent.inputInformation(input);
                    students.add(newStudent);
                    System.out.println("Successfully Added..!");
                    input.nextLine();
                    pressEnterKey();
                }
                case 2 -> {
                    System.out.println("---------------------------Update Student Information---------------------------");
                   if(!students.isEmpty())
                   {
                       int updateID=0;
                       boolean isStudentExist = false;
                       boolean found = false;
                       do{
                           System.out.print("Input ID to update : ");
                           String strID;
                           try{
                               strID = input.next();
                               updateID = Integer.parseInt(strID);
                               isStudentExist=true;
                           }catch (Exception ex){
                               System.out.println("Invalid ID....");
                           }
                       }while(!isStudentExist);

                       for(int i=0; i<students.size(); i++)
                       {
                           if(updateID==students.get(i).id)
                           {
                               found=true;
                               Student updateStudent = new Student();
                               updateStudent.setId(students.get(i).id);
                               updateStudent.updateInfoStudent(input);
                               students.set(i,updateStudent);
                               System.out.println("Successfully updated..!");
                               input.nextLine();
                               pressEnterKey();
                           }
                       }
                       if(!found)
                       {
                           System.out.println("Student with ID ="+updateID+" was not found...");
                       }

                   }
                   else{
                       System.out.println("There is no student in the list ....");
                   }
                }
                case 3 -> {
                    int searchOption;
                    System.out.println("--------------------------- Search Student Information---------------------------");
                    System.out.println("1. Search By ID ");
                    System.out.println("2. Search By Name ");
                    System.out.println("3. Exit....");

                    System.out.print("Choose option 1 - 3 : ");
                    searchOption = input.nextInt();
                        switch(searchOption){
                            case 1 :
                                int searchID;
                                boolean isStudentExist = false;
                                System.out.println("----------------------- Search By ID----------------------- ");
                                System.out.print("Enter ID to search : ");
                                searchID = input.nextInt();

                                for(int i = 0; i < students.size(); i++){
                                    if(searchID== students.get(i).id){
                                        isStudentExist = true;
                                        students.get(i).outputInformation();
                                    }
                                } if(!isStudentExist){
                                System.out.print("Student with ID = "+searchID+" doesn't exist !!!");
                            }
                                pressEnterKey();
                                break;
                            case 2 :
                                String searchName ;
                                boolean isStudentExistName = false;
                                System.out.println("----------------------- Search By Name ----------------------- ");
                                System.out.print("Enter name to search : ");
                                input.nextLine();   searchName = input.nextLine();

                                for(int i =0; i < students.size(); i++){
                                    if(searchName.equals(students.get(i).name)){
                                        isStudentExistName = true;
                                        students.get(i).outputInformation();
                                    }
                                }
                                if(!isStudentExistName)
                                {
                                    System.out.println("Student name "+searchName+" doesn't found...");
                                }
                        }
                        input.nextLine();
                }
                case 4 -> {
                    System.out.println("---------------------------Delete Student Information---------------------------");
                    int deleteID;
                    boolean isStudentExist = false;
                    System.out.print("Enter ID to Delete : ");
                    deleteID = input.nextInt();

                    for(int i = 0; i < students.size(); i++){
                        if(deleteID== students.get(i).id){
                            isStudentExist = true;
                            students.remove(i);
                            System.out.println("You've already deleted this student,..");
                            pressEnterKey();
                            input.nextLine();
                        }
                    } if(!isStudentExist){
                        System.out.print("Student with ID = "+deleteID+" doesn't exist !!!");
                    }
                }
                case 5 -> {
                    System.out.println("---------------------------Show Student Information---------------------------");
                    for(int i=0; i<students.size(); i++)
                    {
                        students.get(i).outputInformation();
                    }
                }
                case 6 -> {
                    System.out.println("---------------------------THANK YOU SO MUCH FOR USING MY CONSOLE APP---------------------------");

                }
            }
        }while(option!=6);
    }
}
