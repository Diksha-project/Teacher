import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
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

public String toString(){
return name +", Id:-"+ id+ ", Age:-" +age+ ", Subject:-" +subject;
}
}


 public class Xyz{
public static void main(String args[]) {
int option=7;
int n=2;
Scanner sc = new Scanner(System.in);
ArrayList <Teacher> techr = new ArrayList<Teacher>();


while(option!=0){
System.out.println("Choose an option number from below lists: \n 1.Create a new Teacher.\n 2.Remove a Teacher.\n 3.Count the number of teachers.\n4.Display name of all the teachers and their subject. \n 5.Given specific Id, display detail of the specific teacher. \n 0. Exit");
option = sc.nextInt();

switch(option){

case 1:

System.out.println("enter your teacher details");


for(int i=0;i<4;i++){
int id = sc.nextInt();

sc.nextLine();

int age = sc.nextInt();
sc.nextLine();

String name = sc.nextLine();
String subject = sc.nextLine();

techr.add( new Teacher(id,age,name,subject));
}

for(Teacher t : techr){
System.out.println(t);
}
break;

case 2:
System.out.println("enter teacher id that you want to remove");
int ID = sc.nextInt();
for(int i=0;i<techr.size();i++){
if(ID == techr.get(i).getId()){
techr.remove(i);
}
}
for(Teacher t : techr){
System.out.println(t);
}
break;
case 3:
int res = techr.size();
System.out.println("Total number of teacher is:- "+ res);
break;

case 4:
for(int i=0;i<techr.size();i++){
System.out.println("Teacher name is:- " +techr.get(i).getName()+ ",  Subject is:- "+ techr.get(i).getSubject());
}
break;

case 5:
System.out.println("enter teacher Id");
int id= sc.nextInt();
sc.nextLine();

for(int i=0;i<techr.size();i++){
if(techr.get(i).getId() == id){
System.out.println(techr.get(i).getName());
System.out.println(techr.get(i).getAge());
System.out.println(techr.get(i).getSubject());
}
}
break;




}
}
}
}

