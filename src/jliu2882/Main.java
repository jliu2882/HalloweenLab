package jliu2882;

public class Main {

    public static void main(String[] args) {
        int rows = 5;
        int columns = 5;
        String[][] faceFeatures = new String[rows][columns];
	    JackOLantern spook = new JackOLantern(faceFeatures);
	    spook.fill("@");
	    System.out.println(spook.toString());
    }
}
