package jliu2882;

public class JackOLantern {
    public String[][] array;

    public JackOLantern(String[][] faceFeatures){
        this.array = faceFeatures;
    }

    public void edit(String replace, int row, int column){
        array[row][column] = replace;
    }

    public void fill(String str){
        for(String[] row : array){
            for(String column : row){
                column =  str;
            }
        }
    }

    public String toString(){
        for(String[] row : array){
            for(String column : row){
                System.out.print(column);
            }
            System.out.print("\n");
        }
    }
}
