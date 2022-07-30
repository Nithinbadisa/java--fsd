package vrtualkey;

public class MainFile {
public static void main(String[] args) {
		
		
		FileOperations.createMainFolderIfNotPresent("main");
		
		MenuOptions.printWelcomeScreen("virtualkey", "nithinkumar");
		
		HandleOptions.handleWelcomeScreenInput();
	}

}
