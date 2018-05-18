import java.lang.Exception;
import java.io.IOException;
import java.io.FileInputStream;

public class Exceptions {
    public  void finallyClause (String path) {
        FileInputStream stream = null;
        try {
            stream = new FileInputStream(path);
        }
        catch (IOException ioe){
            throw new RuntimeException(ioe);
        }
        finally {
            if (stream != null) {
                try{
                    stream.close();
                }
                catch (IOException ioe) {
                }
            }
        }
    }

    public void finalyClause (String path) {
        try (FileInputStream stream = new FileInputStream(path)) {
            
        }
        catch (IOException ioe) {
            throw new RuntimeException();
        }
    }
}

