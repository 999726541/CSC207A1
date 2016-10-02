package directory_reader;

import java.io.File;
import javax.swing.JFileChooser;

/**
 * Select, read, and print the contents of a directory.
 */
public class DirectoryReader {

	/**
	 * Select a directory, then print the full path to the directory and its
	 * contents, one per line. Prefix the contents with a hyphen and a space.
	 *
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {

		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		int returnVal = fileChooser.showOpenDialog(null);
		
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File file = fileChooser.getSelectedFile();
			System.out.println(file);
			
			// TODO: print the contents of the selected directory, one per
			// line. Prefix each line with a hyphen and a space: "- ".
			//Component[] file1 = fileChooser.getComponents();
			File[] list_of_file = file.listFiles();
			for(File element : list_of_file) {
				if (element.isFile()) {
					System.out.println("- "+element.getName());
				} else {
					//System.out.println("- "+element.getName()+"/");
				}
			}
			
		}
	}
}