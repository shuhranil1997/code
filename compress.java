/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package projectnew;
import java.io.*;
import java.util.zip.GZIPInputStream;

/**
 *
 * @author hp
 */
public class compress {
    
    public static void method (File file) throws IOException{
        
        String fileDirectory =file.getParent();
        System.out.println(fileDirectory);
        FileInputStream fis=new FileInputStream(file);
        FileOutputStream fos=new FileOutputStream(fileDirectory+"/decompress.txt");
        GZIPInputStream gis=new GZIPInputStream(fis);
        byte [] buffer=new byte[1024];
        int len;
        while((len=gis.read(buffer))!=-1)
        {
            fos.write(buffer,0,len);
        }
        gis.close();
        fis.close();
        fos.close();
    }
    public static void main(String [] args) throws IOException{
        File path=new File("C:\\Users\\hp\\Documents\\NetBeansProjects\\compressdecompressnew\\build\\classes\\projectnew\\compressed.gz");
        method(path);
        
    }
    
}
