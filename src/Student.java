import java.util.Scanner;

public class Student {
         int id;
         String name, gender, address;
         float java, spring, database, git, ui;

        Student(){}
        public Student(int id, String name, String gender, String address, float java, float spring, float database, float git, float ui) {
            this.id = id;
            this.name = name;
            this.gender = gender;
            this.address = address;
            this.java = java;
            this.spring = spring;
            this.database = database;
            this.git = git;
            this.ui = ui;
        }



    float total()
        {
            return (java+spring+ui+database+git);
        }
        float avg()
        {
            return total()/5;
        }
//        Scanner input = new Scanner(System.in);
        void inputInformation(Scanner input)
        {
            boolean isIDValid = false;
            do {
                String strId;
                System.out.print("Input student  ID : ");
                try {
                    strId = input.next();
                    id = Integer.parseInt(strId);
                    if(id<=0)
                    {
                        System.out.println("ID can't be a negative number..");
                    }else{
                        isIDValid=true;
                    }
                } catch (Exception ex) {
                    System.out.println(" Invalid ID format....");
                }
            } while (!isIDValid);
            input.nextLine();
            System.out.print("Input student name :  "); name=input.nextLine();
            System.out.print("Input student gender :  "); gender=input.nextLine();
            System.out.print("Input student address :  "); address=input.nextLine();

            boolean isJavaScore = false;
            do {
                String strJava;
                System.out.print("Input java score  :  ");
                try {
                    strJava = input.next();
                    java = Float.parseFloat(strJava);
                    if(java<0)
                    {
                        System.out.println("Score can't be a negative number..");
                    }else{
                        isJavaScore=true;
                    }

                } catch (Exception ex) {
                    System.out.println(" Invalid Java format....");
                }
            } while (!isJavaScore);

            boolean isSpring = false;
            do {
                String strSpring;
                System.out.print("Input spring score :  ");
                try {
                    strSpring = input.next();
                    spring = Float.parseFloat(strSpring);
                    isSpring=true;
                } catch (NumberFormatException ex) {
                    System.out.println(" Invalid Spring format....");
                }
            } while (!isSpring);

            boolean isUI = false;
            do {
                String strUI;
                System.out.print("Input ui score :  ");
                try {
                    strUI = input.next();
                    ui = Float.parseFloat(strUI);
                    if(ui<0)
                    {
                        System.out.println("Score can't be a negative number..");
                    }else{
                        isUI=true;
                    }
                } catch (NumberFormatException ex) {
                    System.out.println(" Invalid UI format....");
                }
            } while (!isUI);

            boolean isDatabase = false;
            do {
                String strDatabase;
                System.out.print("Input database score :  ");
                try {
                    strDatabase = input.next();
                    database = Float.parseFloat(strDatabase);
                    if(database<0)
                    {
                        System.out.println("Score can't be a negative number..");
                    }else{
                        isDatabase=true;
                    }
                } catch (NumberFormatException ex) {
                    System.out.println(" Invalid Database format....");
                }
            } while (!isDatabase);

            boolean isGit = false;
            do {
                String strGit;
                System.out.print("Input Git score :  ");
                try {
                    strGit = input.next();
                    git = Float.parseFloat(strGit);
                    if(git<0)
                    {
                        System.out.println("Score can't be a negative number..");
                    }else{
                        isGit=true;
                    }
                } catch (NumberFormatException ex) {
                    System.out.println(" Invalid Git format....");
                }
            } while (!isGit);

        }
        void  updateInfoStudent(Scanner input)
        {
            System.out.print("Input new student name :  "); input.nextLine(); name=input.nextLine();
            System.out.print("Input new student gender :  "); gender=input.nextLine();
            System.out.print("Input new student address :  "); address=input.nextLine();

            boolean isJavaScore = false;
            do {
                String strJava;
                System.out.print("Input new java score  :  ");
                try {
                    strJava = input.next();
                    java = Float.parseFloat(strJava);
                    if(java<0)
                    {
                        System.out.println("Java score can't be a negative number..");;
                    }else{
                        isJavaScore=true;
                    }

                } catch (Exception ex) {
                    System.out.println(" Invalid Java format....");
                }
            } while (!isJavaScore);

            boolean isSpring = false;
            do {
                String strSpring;
                System.out.print("Input new spring score :  ");
                try {
                    strSpring = input.next();
                    spring = Float.parseFloat(strSpring);
                    if(spring<0)
                    {
                        System.out.println("Java score can't be a negative number..");;
                    }else{
                        isSpring=true;
                    }
                } catch (NumberFormatException ex) {
                    System.out.println(" Invalid Spring format....");
                }
            } while (!isSpring);

            boolean isUI = false;
            do {
                String strUI;
                System.out.print("Input new ui score :  ");
                try {
                    strUI = input.next();
                    ui = Float.parseFloat(strUI);
                    if(ui<0)
                    {
                        System.out.println("Java score can't be a negative number..");;
                    }else{
                        isUI=true;
                    }
                } catch (NumberFormatException ex) {
                    System.out.println(" Invalid UI format....");
                }
            } while (!isUI);

            boolean isDatabase = false;
            do {
                String strDatabase;
                System.out.print("Input new database score :  ");
                try {
                    strDatabase = input.next();
                    database = Float.parseFloat(strDatabase);
                    if(database<0)
                    {
                        System.out.println("Java score can't be a negative number..");;
                    }else{
                        isDatabase=true;
                    }
                } catch (NumberFormatException ex) {
                    System.out.println(" Invalid Database format....");
                }
            } while (!isDatabase);

            boolean isGit = false;
            do {
                String strGit;
                System.out.print("Input new Git score :  ");
                try {
                    strGit = input.next();
                    git = Float.parseFloat(strGit);
                    if(git<0)
                    {
                        System.out.println("Java score can't be a negative number..");;
                    }else{
                        isGit=true;
                    }
                } catch (NumberFormatException ex) {
                    System.out.println(" Invalid Git format....");
                }
            } while (!isGit);
        }

        void outputInformation()
        {
//            System.out.println(String.format("%-15s %-20s %-20s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s","ID","Name", "Gender","Address","Java","Spring","UI","Database","Git","Total","Average"));
            System.out.println(String.format("%-15s %-20s %-20s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s",id,name, gender,address,java,spring,ui,database,git,total(),avg()));
        }
    public void setId(int id) {
        this.id = id;
    }
}
