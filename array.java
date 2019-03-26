/*
 *Write a simple java class that stores the information of N students(half boys
 *and half girls) in a school. Each student has name, gender, scores of maths, 
 *english and science. In that program display the name of allthe girls whose 
 *average score in maths, science and english is better than the average score 
 *of the boy who topped the science paper.Use OOPs concept. Generate distinct 
 *random names and random scores using some random function
*/
package student;

 class Stud{
   public String name;
   public String gender;
   public int mscore;
   public int sscore;
   public int escore;
   
   Stud(String name,String gender,int mscore,int sscore,int escore){
       this.name= name;
       this.gender=gender;
       this.mscore=mscore;
       this.sscore=sscore;
       this.escore=escore;
   }
   /**/
   public void ShowGirls(Stud[] s ){
       Stud[] girl = new Stud[5];
       int girlctr = 0;
       int boyctr = 0;
       Stud[] boys = new Stud[5];
       for (int i =0;i<s.length;i++){
           if(s[i].gender == "female"){
               girl[girlctr] = s[i];
               girlctr++;
           }else{
               boys[boyctr] = s[i];
               boyctr++;
           }
       }
       int max = 0;
       for (int k = 0; k<boys.length;k++){
          if(boys[k].sscore>max){
              max = boys[k].sscore;
          }
       }
       
       for(int i =0;i< girl.length;i++)
       {
           double average= (girl[i].mscore+girl[i].sscore+ girl[i].escore)/3;
           if(average>max){
               System.out.println(girl[i].name);
           }
       }
    }
}
 public class Student {
 public static void main(String[] args) {
      Stud[] arr;
      arr= new Stud[10];
      arr[0]= new Stud("Aahana","female",40,50,30);
      arr[1]= new Stud("Shivanya","female",30,30,30);
      arr[2]= new Stud("Aarohi","female",50,50,30);
      arr[3]= new Stud("Kritika","female",75,95,85);
      arr[4]= new Stud("Sudha","female",45,50,40);
      arr[5]= new Stud("Softy","male",30,40,30);
      arr[6]= new Stud("Karan","male",40,48,40);
      arr[7]= new Stud("Prem","male",50,30,30);
      arr[8]= new Stud("Arjun","male",35,50,35);
      arr[9]= new Stud("Om","male",50,30,30);
      
      arr[0].ShowGirls(arr);
        
    }
    
}
