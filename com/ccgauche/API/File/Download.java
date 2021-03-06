package com.ccgauche.API.File;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class Download {
	
	private String URL;
	
	public Download(String URL) {
		this.setURL(URL);
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}
	
	public void createFlux(String ouputFile) {
		InputStream input = null;
        FileOutputStream writeFile = null;
        try{
            URL url = new URL(URL);
            URLConnection connection = url.openConnection();
            int fileLength = connection.getContentLength();
            if (fileLength == -1){
                System.out.println("Invalide URL or file.");
                return;
            }
            input = connection.getInputStream();
            String fileName = ouputFile;
            writeFile = new FileOutputStream(fileName);
            byte[] buffer = new byte[1024];
            int read;
            while ((read = input.read(buffer)) > 0)
                writeFile.write(buffer, 0, read);
            writeFile.flush();
        }catch (IOException e){
            System.out.println("Error while trying to download the file.");
            e.printStackTrace();
        }finally{
            try{
                writeFile.close();
                input.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
	}
}
