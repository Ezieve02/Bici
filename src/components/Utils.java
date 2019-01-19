package components;

import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;

public class Utils {
    public static Utils instance;

    public static Utils getInstance(){
        if (instance == null)
            instance = new Utils();

        return instance;
    }

    public Font creaFont(){
        try {
            return Font.createFont(Font.TRUETYPE_FONT,
                    new FileInputStream(new File("res/circular.ttf"))).deriveFont(Font.BOLD, 35);
        }catch (Exception ex){
            ex.printStackTrace();
        }

        return null;
    }
}
