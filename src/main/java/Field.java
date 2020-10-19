public class Field {

    char [][] field = new char[3][3];

    public Field() {
        for(int i=0; i<3; i++)
            for(int j =0; j<3; j++) {
                field[i][j] = ' ';
            }
    }

    public boolean validMove (int i, int j) {
        if(field[i][j]==' '){
            return true;
        }else{
            return false;
        }
    }

    public void set(int i, int j, int player) {
        if(player==1){
            this.field[i][j]='X';
        }else{
            this.field[i][j]='O';
        }
    }

    public boolean win(){
        if( (field[0][0] == field[0][1] && field[0][1] == field[0][2] && field[0][0]!=' ') ||
            (field[1][0] == field[1][1] && field[1][1] == field[1][2] && field[1][0]!=' ') ||
            (field[2][0] == field[2][1] && field[2][1] == field[2][2] && field[2][0]!=' ') ||
            (field[0][0] == field[1][0] && field[0][0] == field[2][0] && field[0][0]!=' ') ||
            (field[0][1] == field[1][1] && field[1][1] == field[2][1] && field[0][1]!=' ') ||
            (field[0][2] == field[1][2] && field[0][2] == field[2][2] && field[0][2]!=' ') ||
            (field[0][0] == field[1][1] && field[1][1] == field[2][2] && field[0][0]!=' ') ||
            (field[0][2] == field[1][1] && field[1][1] == field[2][0] && field[0][2]!=' ')){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString()
    {
        String s = "";
        for(int i=0; i<3; i++){
            s = s + "|";
            for (int j=0; j<3 ; j++){
                s = s + field[i][j];
                s = s + "|";
                }
            s = s + "\n";
        }
        return s;
    }
}
