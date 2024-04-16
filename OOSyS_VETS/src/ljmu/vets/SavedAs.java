package ljmu.vets;

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
