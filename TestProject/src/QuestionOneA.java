import java.io.File;

/*firstly create a file ./src/test/WordMeaning.properties at this location and paste below things in it:

Apple=a fruit, a tech firm

Table=contains rows and columns when used in context of computers

Orange=a fruit*/


public class QuestionOneA {
	public void doesFileExist(){
		File f = new File(./src/test/WordMeaning.properties);
		try {
		if(f.exists()) {
		System.out.println("File exists at this location");
		}}
		 
		 catch (Exception e) {
		      System.out.println("File not found");
		    }
		}

		 }


