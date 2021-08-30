import java.util.*;


class Teacher{
int id,age;
String name,subject;


Teacher(int id, int age,String name, String subject){
super();
this.id = id;
this.age = age;
this.name = name;
this.subject = subject;
}




public int getId(){
return id;
}
public void setId(int id){
this.id=id;
}
public int getAge(){
return age;
}
public void setAge(int age){
this.age=age;
}
public String getName(){
return name;
}
public void setName(String name){
this.name = name;
}
public String getSubject(){
return subject;
}
public void setSubject(String subject){
this.subject = subject;
}
}


 public class Abc{
public static void main(String args[]){
int option=7;
int n;


Scanner sc = new Scanner(System.in);
System.out.println("enter total number of  teachers");
n= sc.nextInt();

System.out.println("enter your teacher details");

Teacher techr[] = new Teacher[n];
for(int i=0;i<n;i++){
int id = sc.nextInt();

sc.nextLine();
int age = sc.nextInt();
sc.nextLine();

String name = sc.nextLine();
String subject = sc.nextLine();

techr[i] = new Teacher(id,age,name,subject);
}

while(option!=0){
System.out.println("Choose an option number from below lists: \n 1.Create a new Teacher.\n 2.Remove a Teacher.\n 3.Count the number of teachers.\n4.Display name of all the teachers and their subject. \n 5.Given specific Id, display detail of the specific teacher. \n 0. Exit");
option = sc.nextInt();

switch(option){

case 1:


break;

case 2:
System.out.println("Enter your teacher id that you want to remove");
int ID = sc.nextInt();
sc.nextLine();
for(int i=0;i<n;i++){
if(techr[i].getId() == ID){

}

}
break;


case 3:
int res= techr.length;
System.out.println("Total number of teacheris->"+res);
break;

case 5:
System.out.println("enter teacher Id");
int id= sc.nextInt();
sc.nextLine();

for(int i=0;i<n;i++){
if(techr[i].getId() == id){
System.out.println(techr[i].getName());
System.out.println(techr[i].getAge());
System.out.println(techr[i].getSubject());
}
}
break;


case 4:

for(int i=0;i<n;i++){
System.out.println("Teacher name is " +techr[i].getName()+"  ,Subject ->"+techr[i].getSubject());
break;


}
}
}

}

}