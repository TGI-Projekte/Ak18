/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import erstesgame.Erstesgame;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.ini4j.*;

/**
 *
 * @author Julian
 */
public class InitConfig {
    private static Wini iniconf;
    public static void initIni(File pIniloc){
        //Trying to create the ini File
        Erstesgame.print("Trying to create config..");
        try{
            if(pIniloc.createNewFile()){
                Erstesgame.print("Successfully created config file..");
                writedefault(pIniloc);
            }
        }
        catch(IOException e){
            Erstesgame.print("Error creating config..");
        }
        
    }
    public static void recreate(File pIniloc){
        //deleting the ini and initializing it again
        pIniloc.delete();
        initIni(pIniloc);
    }
    public static void writedefault(File pIniloc){
        //creating a Wini object
         try {
            iniconf = new Wini(pIniloc);
        } catch (IOException ex) {
            Logger.getLogger(InitConfig.class.getName()).log(Level.SEVERE, null, ex);
        }
        //values to write
        iniconf.put("Main", "versioncreated", Erstesgame.version);
        iniconf.put("GUI", "fullscreen", 1);
        //trys to save ini
        try {
            iniconf.store();
        } catch (IOException ex) {
            Logger.getLogger(InitConfig.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}