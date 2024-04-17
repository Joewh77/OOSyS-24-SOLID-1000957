package ljmu.vets;

/** Represents a saving option.
 * @author Joe Whittaker
 * @version 4.26.0
 * @since 1.0
*/

public class SavedAs {

public void saveAs(FileType fileType, String path) {
		switch (fileType) {
			case DOCX : {
				saveAsDocX(path);
				break;
			}
			case XPS : {
				saveAsXPS(path);
				break;
			}
			case PDF : {
				saveAsPDF(path);
				break;
			}
		}
	}
	
	// ToDo : Private !
	private void saveAsDocX(String path) {
		
	}

	// ToDo : Private !
	private void saveAsXPS(String path) {
		
	}

	// ToDo : Private !
	private void saveAsPDF(String path) {
		
	}

	// ToDo : get / set Methods ?
}
