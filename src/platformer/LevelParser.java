/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platformer;

import platformer.objekte.Level;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Logger;

/**
 * LevelParser.java Zweck: Ermöglicht das Speichern und laden eines Levels in
 * einer Binären Datei.
 *
 * @author Julian Blazek
 */
public class LevelParser {

    private Object level;
    private Level lvlobject;
    private File leveldat;

    public Level readLevel() {
        FileInputStream stream = null;
        try {
            lvlobject = new Level();
            Object load = null;
            stream = new FileInputStream(leveldat);
            ObjectInputStream objinput = new ObjectInputStream(stream);
            lvlobject = (Level) objinput.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LevelParser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(LevelParser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } finally {
            try {
                stream.close();
            } catch (IOException ex) {
                Logger.getLogger(LevelParser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
        return lvlobject;
    }

    public void writeLevel(Level level) {

        try {
            lvlobject = level;
            FileOutputStream stream;
            stream = new FileOutputStream(leveldat);
            try (ObjectOutputStream objout = new ObjectOutputStream(stream)) {
                objout.writeObject(level);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(LevelParser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LevelParser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }

    public LevelParser(File leveldatei) {
        leveldat = leveldatei;
        lvlobject = new Level();
    }

}
