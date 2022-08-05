
package bank;

public class User {
    
  private String name;
  private String pas;
  
  public User(){
      
      this.name = "ali";
      this.pas = "1234";
  }
  
  public boolean login (String n, String p ){
      
      if (this.name.equals(n) && this.pas.equals(p)){
          return false;
      }
      
      else{
          return true;
      }
  }
    
    
}
