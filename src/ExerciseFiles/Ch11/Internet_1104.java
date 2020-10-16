package ExerciseFiles.Ch11;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Internet_1104 {

	private static final String FLOWERS_FEED = "http://services.hanselandpetal.com/feeds/flowers.xml";
	
	public static void main(String[] args) throws IOException {
		
		InputStream iStream = null;
		
		BufferedInputStream bis = null;
		
		try {
			URL url = new URL(FLOWERS_FEED);
			
			iStream = url.openStream();
			
			bis = new BufferedInputStream(iStream);
			
			StringBuilder sb = new StringBuilder();
			
			while (true) {
				int data = bis.read();
				
				if (data == -1) {
					break;
				} else {
					sb.append((char)data);
				}
			}
			
			System.out.println(sb);
		
		} catch (MalformedURLException e) {
			e.printStackTrace();
		
		} catch (IOException e) {
			e.printStackTrace();
		
		}finally {
			iStream.close();
			
			bis.close();
		}
	}

}
