package com.alp.converter;

import com.alp.db.DbHelper;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 * @author Alper
 */
public class FileToBlob {
    public static void main(String[] args) {
        try{
            DbHelper db       = new DbHelper();
            Connection con    = db.connectDb();
            Statement st      =  con.createStatement();
            ResultSet rs      = st.executeQuery("SELECT DOSYA_YOLU FROM UKBS.PBS_PERSONEL@ukbs where dosya_yolu is not null");
            BufferedReader br = null;
            String basePath   = "X:\\personel";
            while(rs.next()){
               
               updateToDB(basePath +"\\" + rs.getString("DOSYA_YOLU"),rs.getString("MERNIS_NO")); 
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void updateToDB(String dosyaPath,String mernisNo){
        byte[] bytes;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buf = new byte[1024];
        try {
           File file = new File(dosyaPath);
           Image image = ImageIO.read(file);
        } catch (IOException ex) {
            Logger.getLogger(FileToBlob.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
