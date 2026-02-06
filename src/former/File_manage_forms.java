
package former;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.ObjectInputStream;
public class File_manage_forms {
 
    
    public void saveToFile(ArrayList<Forms> list) {
            try{
            FileOutputStream fileOut =new
            FileOutputStream ("SavedKontaktLista.ser");
            ObjectOutputStream out = new ObjectOutputStream (fileOut);
            out.writeObject (list) ; 
            out.flush();
            out.close();
            fileOut.close(); 
            }
            catch (IOException exe) 
            { System.out.println(":D"); }
            }
           

            public ArrayList<Forms> readfromfile(){
                ArrayList<Forms> list=null;
             try{
             FileInputStream fileIn = new 
             FileInputStream("savedKontaktLista.ser");
             ObjectInputStream oin = new ObjectInputStream(fileIn);
             list = (ArrayList<Forms>)oin.readObject();
             oin.close();
             fileIn.close();
             
             
             }
             
             catch (IOException exe) {
             System.out.println("Kanin");}
             
             catch (ClassNotFoundException exe) {
             System.out.println("ClassNotFoundException is caught");
             }
              return list;
             } 
            
             }

