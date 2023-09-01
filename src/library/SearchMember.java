/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

/**
 *
 * @author Vhaoo
 */
public class SearchMember {
   private String id;
    private String name;
    private String phone;
     private String address;

   
     public  String getId()
     {
         return this.id;
     }
     public void setId(String id)
     {
         this.id=id;
     }
      public  String getName()
     {
         return this.name;
     }
     public void SetName(String name)
     {
         this.name=name;
     }
      public  String getPhone()
     {
         return this.phone;
     }
     public void SetPhone(String phone)
     {
         this.phone=phone;
     }
      public  String getAddress()
     {
         return this.address;
     }
     public void SetAddress(String address)
     {
         this.address=address;
     }
    public SearchMember(){};
      public SearchMember(String id,String name , String phone ,String address)
      {
       this.id=id;
       this.name=name;
       this.phone=phone;
        this.address=address;
      }; 
}
