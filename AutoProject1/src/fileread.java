import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class fileread {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		    BufferedReader br = new BufferedReader(new FileReader("C:/AllData/id_rsa.pub"));
		    StringBuilder sb = new StringBuilder();
		        String line = br.readLine();
		        
		        System.out.println("...br.readLine()...."+br.readLine());

		        while (line != null) {
		            sb.append(line);
		            sb.append("\n");
		            line = br.readLine();
		            System.out.println("...line...."+line);
		        
		      
		    }
		        System.out.println("...key line...."+line);
		        br.close();
		        
		}

	}


