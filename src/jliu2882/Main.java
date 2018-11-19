package jliu2882;

public class Main {

    public static void main(String[] args) {
        int rows = 5;
        int columns = 10;
        String[][] faceFeatures = new String[rows][columns];
	    JackOLantern spook = new JackOLantern(faceFeatures);
	    spook.fill("@");
	    spook.round();
	    //was trying to make algorithm to do eyes, etc.. but wasn't usable for all values of rows and column
        spook.edit("*",1,3);
        spook.edit("*",1,6);
        for(int i=0; i<  6  ;i++) {
            spook.edit("=", 3, i+2);
        }
        System.out.println(spook.toString());
    }
}
