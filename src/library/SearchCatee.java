/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

/**
 *
 * @author ASUS
 */
public class SearchCatee {
       private String id;
       private String catname;


   
     public  String getId()
     {
         return this.id;
     }
     public void setId(String id)
     {
         this.id=id;
     }
      public  String getCatname()
     {
         return this.catname;
     }
     public void SetCatname(String catname)
     {
         this.catname=catname;
     }

     public SearchCatee(){};
      public SearchCatee(String id,String catname)
      {
       this.id=id;
       this.catname=catname;
      };
}
