/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class UserDAO {
    
   private String Fname,Mname,Lname;
   int age;
   private String Civilstatus, Gender, Address;
//   public UserDAO( String Fname, String Mname, String Lname, int age){
//       
//       this.Fname = Fname;
//       this.Mname = Mname;
//       this.Lname = Lname;
//       this.age = age; 
//   } 
   
   
   public String getFname(){
       return Fname;
   }
   public void setFname(String Fname){
       this.Fname = Fname;
   }
   
   
   public String getMname(){
       return Mname;
   }
   public void setMname(String Mname){
       this.Mname = Mname;
   }
   
   
   public String getLname(){
       return Lname;
   }
   public void setLname(String Lname){
       this.Lname = Lname;
   }
   
   
   public int getage(){
       return age;
   }
   public void setage(int age){
       this.age = age;
   }
   
    public String getCivilstatus(){
       return Civilstatus;
   }
   public void setCivilstatus(String Civilstatus){
       this.Civilstatus = Civilstatus;
   }
   
    public String getGender(){
       return Gender;
   }
   public void setGender(String Gender){
       this.Gender = Gender;
   }
   
    public String getAddress(){
       return Address;
   }
   public void setAddress(String Address){
       this.Address = Address;
   }
}
