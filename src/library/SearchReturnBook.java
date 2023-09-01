/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

/**
 *
 * @author Vhaoo
 */
public class SearchReturnBook {
        private String id;
       private String mid;
       private String mname;
       private String bame;
       private String returndate;
       private String elp;
       private String fine;
        public  String getId()
     {
         return this.id;
     }
     public void setId(String id)
     {
         this.id=id;
     }
      public  String getMemberid()
     {
         return this.mid;
     }
     public void SetMemberid(String mid)
     {
         this.mid=mid;
     }
      public  String getMname()
     {
         return this.mname;
     }
     public void SetMname(String mname)
     {
         this.mname=mname;
     }
      public  String getBame()
     {
         return this.bame;
     }
     public void SetBame(String bame)
     {
         this.bame=bame;
     }
      public  String getReturndate()
     {
         return this.returndate;
     }
     public void SetReturndate(String returndate)
     {
         this.returndate=returndate;
     }
      public  String getElp()
     {
         return this.elp;
     }
     public void SetElp(String elp)
     {
         this.elp=elp;
     }
      public  String getFine()
     {
         return this.fine;
     }
     public void SetFine(String fine)
     {
         this.fine=fine;
     }
     
    public SearchReturnBook(){};
      public SearchReturnBook(String id,String mid , String mname ,String bame,String returndate,String elp , String fine )
      {
       this.id=id;
       this.mid=mid;
       this.mname=mname;
       this.bame=bame;
       this.returndate=returndate;
       this.elp=elp;
       this.fine=fine;
      };
       
       
}
