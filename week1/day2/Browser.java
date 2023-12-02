package week1.day2;

public class Browser {
	
	public String launchBrowser(String browserName) {
		System.out.println("Browser launched successfully"+ browserName);
		return browserName;
	}
    public void loadurl() {
    	System.out.println("Application url loaded successfully");
	}
	public static void main(String[] args) {
		Browser launch= new Browser();
		launch.launchBrowser("browserName");
		launch.loadurl();

	}

}
