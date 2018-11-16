package jliu2882;

public class JackOLantern {
    private String[][] faceFeatures;

    public JackOLantern(String[][] faceFeatures){
        this.faceFeatures = faceFeatures;
    }

    public void edit(String replace, int row, int column){
        faceFeatures[row][column] = replace;
    }

    public void fill(String str){
        for(String[] row : faceFeatures){
            for(String column : row){
                column =  str;
            }
        }
    }

    public String toString(){
        String result = "";
        for(String[] row : faceFeatures){
            for(String column : row){
                result+=column;
            }
           result+="\n";
        }
        return result;
    }
}
