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
        for(int i = 0; i < faceFeatures.length;i++){
            for(int j =0; j < faceFeatures[i].length;j++){
                faceFeatures[i][j] = str;
            }
        }
    }

    public void round(){
        edit(" ",0,0);
        edit(" ",faceFeatures.length-1,faceFeatures[0].length-1);
        edit(" ",faceFeatures.length-1,0);
        edit(" ",0,faceFeatures[0].length-1);
    }

    //too hard to do without messing up for other numbers
    // public void eyes(String str){ }

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
