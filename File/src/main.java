import java.io.File;
import java.io.FileWriter;

public class main {
	
	  public static void main(final String[] args) {
	        final String chemin = "tmp.txt";
	        final File fichier =new File(chemin); 
	        try {
	            // Creation du fichier
	            fichier.createNewFile();
	            // creation d'un writer (un �crivain)
	            final FileWriter writer = new FileWriter(fichier);
	            try {
	                writer.write("ceci est un texte\n");
	                writer.write("encore et encore");
	            } finally {
	                // quoiqu'il arrive, on ferme le fichier
	                writer.close();
	            }
	        } catch (Exception e) {
	            System.out.println("Impossible de creer le fichier");
	        }
	    }
}
