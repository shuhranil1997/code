/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectnew;
import java.io.*;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author hp
 */
public class decompress {
    public static void method (File file) throws IOException{
        
        String fileDirectory =file.getParent();
        System.out.println(fileDirectory);
        FileInputStream fis=new FileInputStream(file);
        FileOutputStream fos=new FileOutputStream(fileDirectory+"/compressed.gz");
        GZIPOutputStream gzipOS=new GZIPOutputStream(fos);
        byte [] buffer=new byte[1024];
        int len;
        while((len=fis.read(buffer))!=-1)
        {
            gzipOS.write(buffer,0,len);
        }
        gzipOS.close();
        fis.close();
        fos.close();
    }
    public static void main(String [] args) throws IOException{
        File path=new File("C:\\Users\\hp\\Documents\\NetBeansProjects\\compressdecompressnew\\src\\projectnew\\text.java");
        method(path);
        
    }
    
    
}
