import java.io.*;
import java.net.*;
 
public class dsClient {
 
    public static void main(String[] args) {
        try{
            Socket s = new Socket("localhost", 50000);
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            DataOutputStream out = new DataOutputStream(s.getOutputStream());
 
            out.write(("HELO" + "\n").getBytes());
 
            String str=in.readLine();
 
            String username = System.getProperty("user.name");
            out.write(("AUTH " + username + "\n").getBytes());
 
            str=in.readLine();
            System.out.println(str);
 
            out.write(("REDY\n").getBytes());
 
            str=in.readLine();
            System.out.println(str);
            
            out.write(("GETS All\n").getBytes());
 
            str=in.readLine();
            System.out.println(str);
            
            out.write(("OK\n").getBytes());
 
            str=in.readLine();
            System.out.println(str);
            
            out.write(("OK\n").getBytes());
 
            str=in.readLine();
            System.out.println(str);
            
            out.write(("OK\n").getBytes());
 
            str=in.readLine();
            System.out.println(str);
            
            out.write(("OK\n").getBytes());
 
            str=in.readLine();
            System.out.println(str);
            
            out.write(("OK\n").getBytes());
 
            str=in.readLine();
            System.out.println(str);
            
            out.write(("OK\n").getBytes());
 
            str=in.readLine();
            System.out.println(str);
            
            out.write(("OK\n").getBytes());
 
            str=in.readLine();
            System.out.println(str);
            
            out.write(("OK\n").getBytes());
 
            str=in.readLine();
            System.out.println(str);
 
            out.write(("QUIT\n").getBytes());
 
            str=in.readLine();
 
            in.close();
            out.close();
            s.close();
 
        } catch (IOException e) { e.printStackTrace(); System.exit(1); }
    }
}
