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
	
	// I have added a print output text to each SaveAs options with an addition of the path it has been saved too.
	private void saveAsDocX(String path) {
		System.out.println("DocX has been saved to: " + path);
		
	}

	// ToDo : Private !
	private void saveAsXPS(String path) {
		System.out.println("XPS has been saved to: " + path);
		
	}

	// ToDo : Private !
	private void saveAsPDF(String path) {
		System.out.println("PDF has been saved to: " + path);
		
	}

	// ToDo : get / set Methods ?
}
