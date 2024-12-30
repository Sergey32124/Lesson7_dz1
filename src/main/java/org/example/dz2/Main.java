package org.example.dz2;

public class Main {
    public static void main(String[]args){
        Student student=new Student("Bil", 19,5);
        Student student1=new Student("Mikle", 15,3);
        Student student2=new Student("Kil", 16,4);
        Student student3=new Student("Lir", 17,2);
        Student student4=new Student("Pol", 14,5);
        Student student5=new Student("Til", 13,4);
        Student student6=new Student("Rol", 12,5);

        Student[]masStudent={student,student1,student2,student3,student4,student5,student6};

        for (Student s:masStudent){
            if(s.getAge()<=17){
                System.out.println(s);
            }
        }
    }
}
