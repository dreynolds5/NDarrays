import java.util.Objects;

public class Searcher extends NDArrays {
    private String datatypeSearch;
    private final int dim = getDimensions();

    // constructor; takes 2 parameters, creates array with n dimensions and l length
    public Searcher (int n, int l)  {
        super(n, l);
    }
    //default constructor, creates an array with 1 dimension and length 10
    public Searcher(){
        super();
    }
    //searches for a string target
    //uses linear search returns string with index of each dimension spaced apart

    public String search(String target){
        if (dim == 1) {
            for(int i = 0; i < array1D.length; i++) {
                if (array1D[i].equals(target)){
                    String s = String.valueOf(i);
                    return s;
                }
            }
            return "Target not found";

        }

        else if (dim == 2) {
            for (int i = 0; i < array2D.length; i++) {
                for (int j = 0; j < array2D[i].length; j++) {
                    if (array2D[i][j].equals(target)){
                        String s = i + " " + j;
                        return s;

                    }
                }
            }
            return "Target not found";

        }

        else if (dim == 3) {
            for (int i = 0; i < array3D.length; i++) {
                for (int j = 0; j < array3D[i].length; j++) {
                    for (int k = 0; k < array3D[i][j].length; k++) {
                        if (Objects.equals(array3D[i][j][k], target)){
                            String s = i + " " + j + " " + k;
                            return s;
                        }
                    }
                }
            }
            return "Target not found";

        }

        else if (dim == 4) {
            for (int i = 0; i < array4D.length; i++) {
                for (int j = 0; j < array4D[i].length; j++) {
                    for (int k = 0; k < array4D[i][j].length; k++) {
                        for (int l = 0; l < array4D[i][j][k].length; l++) {
                            if (array4D[i][j][k][l].equals(target)){
                                String s = i + " " + j + " " + k + " " + l;
                                return s;
                            }
                        }
                    }
                }
            }
            return "Target not found";

        }

        else if (dim == 5) {
            for (int i = 0; i < array5D.length; i++) {
                for (int j = 0; j < array5D[i].length; j++) {
                    for (int k = 0; k < array5D[i][j].length; k++) {
                        for (int l = 0; l < array5D[i][j][k].length; l++) {
                            for (int m = 0; m < array5D[i][j][k][l].length; m++) {
                                if (array5D[i][j][k][l][m].equals(target)){
                                    String s = i + " " + j + " " + k + " " + l + " " + m;
                                    return s;
                                }
                            }
                        }
                    }
                }
            }
            return "Target not found";

        }

        else if (dim == 6) {
            for (int i = 0; i < array6D.length; i++) {
                for (int j = 0; j < array6D[i].length; j++) {
                    for (int k = 0; k < array6D[i][j].length; k++){
                        for (int l = 0; l < array6D[i][j][k].length; l++) {
                            for (int m = 0; m < array6D[i][j][k][l].length; m++) {
                                for (int n = 0; n < array6D[i][j][k][l][m].length; n++) {
                                    if (array6D[i][j][k][l][m][n].equals(target)){
                                        String s = i + " " + j + " " + k + " " + l + " " + m + " " + n;
                                        return s;
                                    }
                                }
                            }
                        }
                    }

                }
            }
            return "Target not found";

        }

        else if (dim == 7) {
            for (int i = 0; i < array7D.length; i++) {
                for (int j = 0; j < array7D[i].length; j++) {
                    for (int k = 0; k < array7D[i][j].length; k++){
                        for (int l = 0; l < array7D[i][j][k].length; l++) {
                            for (int m = 0; m < array7D[i][j][k][l].length; m++) {
                                for (int n = 0; n < array7D[i][j][k][l][m].length; n++) {
                                    for (int o = 0; o < array7D[i][j][k][l][m][n].length; o++){
                                        if (array7D[i][j][k][l][m][n][o].equals(target)){
                                            String s = i + " " + j + " " + k + " " + l + " " + m + " " + n + " " + o;
                                            return s;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return "Target not found";

        }

        else if (dim == 8) {
            for (int i = 0; i < array8D.length; i++) {
                for (int j = 0; j < array8D[i].length; j++) {
                    for (int k = 0; k < array8D[i][j].length; k++){
                        for (int l = 0; l < array8D[i][j][k].length; l++) {
                            for (int m = 0; m < array8D[i][j][k][l].length; m++) {
                                for (int n = 0; n < array8D[i][j][k][l][m].length; n++) {
                                    for (int o = 0; o < array8D[i][j][k][l][m][n].length; o++){
                                        for (int p = 0; p < array8D[i][j][k][l][m][n][o].length; p++){
                                            if (array8D[i][j][k][l][m][n][o][p].equals(target)){
                                                String s = i + " " + j + " " + k + " " + l + " " + m + " " + n + " " + o + " " + p;
                                                return s;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return "Target not found";

        }

        else if (dim == 9) {
            for (int i = 0; i < array9D.length; i++) {
                for (int j = 0; j < array9D[i].length; j++) {
                    for (int k = 0; k < array9D[i][j].length; k++){
                        for (int l = 0; l < array9D[i][j][k].length; l++) {
                            for (int m = 0; m < array9D[i][j][k][l].length; m++) {
                                for (int n = 0; n < array9D[i][j][k][l][m].length; n++) {
                                    for (int o = 0; o < array9D[i][j][k][l][m][n].length; o++){
                                        for (int p = 0; p < array9D[i][j][k][l][m][n][o].length; p++){
                                            for (int q = 0; q < array9D[i][j][k][l][m][n][o][p].length; q++){
                                                if (array9D[i][j][k][l][m][n][o][p][q].equals(target)){
                                                    String s = i + " " + j + " " + k + " " + l + " " + m + " " + n + " " + o + " " + p + " " + q;
                                                    return s;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return "Target not found";

        }

        else if (dim == 10) {
            for (int i = 0; i < array10D.length; i++) {
                for (int j = 0; j < array10D[i].length; j++) {
                    for (int k = 0; k < array10D[i][j].length; k++){
                        for (int l = 0; l < array10D[i][j][k].length; l++) {
                            for (int m = 0; m < array10D[i][j][k][l].length; m++) {
                                for (int n = 0; n < array10D[i][j][k][l][m].length; n++) {
                                    for (int o = 0; o < array10D[i][j][k][l][m][n].length; o++){
                                        for (int p = 0; p < array10D[i][j][k][l][m][n][o].length; p++){
                                            for (int q = 0; q < array10D[i][j][k][l][m][n][o][p].length; q++){
                                                for (int r = 0; r < array10D[i][j][k][l][m][n][o][p][q].length; r++){
                                                    if (array10D[i][j][k][l][m][n][o][p][q][r].equals(target)){
                                                        String s = i + " " + j + " " + k + " " + l + " " + m + " " + n + " " + o + " " + p + " " + q + " " + r;
                                                        return s;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return "Target not found";

        }

        else
            return "Only searches arrays with dimensions 1 - 10";
    }


    //searches for an int target
    //uses linear search returns string with index of each dimension spaced apart
    public String search(int target){

        if (dim == 1) {
            for (int i = 0; i < array1D.length; i++) {
                if (array1D[i].equals(target)){
                    String s = String.valueOf(i);
                    return s;
                }
            }
            return "Target not found";
        }

        else if (dim == 2) {
            for (int i = 0; i < array2D.length; i++) {
                for (int j = 0; j < array2D[i].length; j++) {
                    if (array2D[i][j].equals(target)){
                        String s = i + " " + j;
                        return s;
                    }
                }
            }
            return "Target not found";
        }

        else if (dim == 3) {
            for (int i = 0; i < array3D.length; i++) {
                for (int j = 0; j < array3D[i].length; j++) {
                    for (int k = 0; k < array3D[i][j].length; k++) {
                        if (array3D[i][j][k].equals(target)){
                            String s = i + " " + j + " " + k;
                            return s;
                        }
                    }
                }
            }
            return "Target not found";
        }

        else if (dim == 4) {
            for (int i = 0; i < array4D.length; i++) {
                for (int j = 0; j < array4D[i].length;j++) {
                    for (int k = 0; k < array4D[i][j].length; k++) {
                        for (int l = 0; l < array4D[i][j][k].length; l++) {
                            if (array4D[i][j][k][l].equals(target)){
                                String s = i + " " + j + " " + k + " " + l;
                                return s;
                            }
                        }
                    }
                }
            }
            return "target not found";
        }

        else if (dim == 5) {
            for (int i = 0; i < array5D.length; i++) {
                for (int j = 0; j < array5D[i].length; j++) {
                    for (int k = 0; k < array5D[i][j].length; k++) {
                        for (int l = 0; l < array5D[i][j][k].length; l++) {
                            for (int m = 0; m < array5D[i][j][k][l].length; m++) {
                                if (array5D[i][j][k][l][m].equals(target)){
                                    String s = i + " " + j + " " + k + " " + l + " " + m;
                                    return s;
                                }
                            }
                        }
                    }
                }
            }
            return "Target not found";
        }

        else if (dim == 6) {
            for (int i = 0; i < array6D.length; i++) {
                for (int j = 0; j < array6D[i].length; j++) {
                    for (int k = 0; k < array6D[i][j].length; k++){
                        for (int l = 0; l < array6D[i][j][k].length; l++) {
                            for (int m = 0; m < array6D[i][j][k][l].length; m++) {
                                for (int n = 0; n < array6D[i][j][k][l][m].length; n++) {
                                    if (array6D[i][j][k][l][m][n].equals(target)){
                                        String s = i + " " + j + " " + k + " " + l + " " + m + " " + n;
                                        return s;                                    }
                                }
                            }
                        }
                    }

                }
            }
            return "Target not found";
        }

        else if (dim == 7) {
            for (int i = 0; i < array7D.length; i++) {
                for (int j = 0; j < array7D[i].length; j++) {
                    for (int k = 0; k < array7D[i][j].length; k++){
                        for (int l = 0; l < array7D[i][j][k].length; l++) {
                            for (int m = 0; m < array7D[i][j][k][l].length; m++) {
                                for (int n = 0; n < array7D[i][j][k][l][m].length; n++) {
                                    for (int o = 0; o < array7D[i][j][k][l][m][n].length; o++){
                                        if (array7D[i][j][k][l][m][n][o].equals(target)){
                                            String s = i + " " + j + " " + k + " " + l + " " + m + " " + n + " " + o;
                                            return s;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return "Target not found";
        }

        else if (dim == 8) {
            for (int i = 0; i < array8D.length; i++) {
                for (int j = 0; j < array8D[i].length; j++) {
                    for (int k = 0; k < array8D[i][j].length; k++){
                        for (int l = 0; l < array8D[i][j][k].length; l++) {
                            for (int m = 0; m < array8D[i][j][k][l].length; m++) {
                                for (int n = 0; n < array8D[i][j][k][l][m].length; n++) {
                                    for (int o = 0; o < array8D[i][j][k][l][m][n].length; o++){
                                        for (int p = 0; p < array8D[i][j][k][l][m][n][o].length; p++){
                                            if (array8D[i][j][k][l][m][n][o][p].equals(target)){
                                                String s = i + " " + j + " " + k + " " + l + " " + m + " " + n + " " + o + " " + p;
                                                return s;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return "Target not found";
        }

        else if (dim == 9) {
            for (int i = 0; i < array9D.length; i++) {
                for (int j = 0; j < array9D[i].length; j++) {
                    for (int k = 0; k < array9D[i][j].length; k++){
                        for (int l = 0; l < array9D[i][j][k].length; l++) {
                            for (int m = 0; m < array9D[i][j][k][l].length; m++) {
                                for (int n = 0; n < array9D[i][j][k][l][m].length; n++) {
                                    for (int o = 0; o < array9D[i][j][k][l][m][n].length; o++){
                                        for (int p = 0; p < array9D[i][j][k][l][m][n][o].length; p++){
                                            for (int q = 0; q < array9D[i][j][k][l][m][n][o][p].length; q++){
                                                if (array9D[i][j][k][l][m][n][o][p][q].equals(target)){
                                                    String s = i + " " + j + " " + k + " " + l + " " + m + " " + n + " " + o + " " + p + " " + q;
                                                    return s;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return "Target not found";
        }

        else if (dim == 10) {
            for (int i = 0; i < array10D.length; i++) {
                for (int j = 0; j < array10D[i].length; j++) {
                    for (int k = 0; k < array10D[i][j].length; k++){
                        for (int l = 0; l < array10D[i][j][k].length; l++) {
                            for (int m = 0; m < array10D[i][j][k][l].length; m++) {
                                for (int n = 0; n < array10D[i][j][k][l][m].length; n++) {
                                    for (int o = 0; o < array10D[i][j][k][l][m][n].length; o++){
                                        for (int p = 0; p < array10D[i][j][k][l][m][n][o].length; p++){
                                            for (int q = 0; q < array10D[i][j][k][l][m][n][o][p].length; q++){
                                                for (int r = 0; r < array10D[i][j][k][l][m][n][o][p][q].length; r++){
                                                    if (array10D[i][j][k][l][m][n][o][p][q][r].equals(target)){
                                                        String s = i + " " + j + " " + k + " " + l + " " + m + " " + n + " " + o + " " + p + " " + q + " " + r;
                                                        return s;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return "Target not found";

        }
        return "Only searches arrays with dimensions 1 - 10";

    }


    ////searches for a double target
    //    //uses linear search returns string with index of each dimension spaced apart
    public String search(double target){

        if (dim == 1) {
            for (int i = 0; i < array1D.length; i++) {
                if (array1D[i].equals(target)){
                    String s = i + " ";
                    return s;
                }
            }
            return "Target not found";
        }


        else if (dim == 2) {
            for (int i = 0; i < array2D.length; i++) {
                for (int j = 0; j < array2D[i].length; j++) {
                    if (array2D[i][j].equals(target)){
                        String s = i + " " + j;
                        return s;
                    }
                }
            }
            return "Target not found";
        }


        else if (dim == 3) {
            for (int i = 0; i < array3D.length; i++) {
                for (int j = 0; j < array3D[i].length; j++) {
                    for (int k = 0; k < array3D[i][j].length; k++) {
                        if (array3D[i][j][k].equals(target)){
                            String s = i + " " + j + " " + k;
                            return s;
                        }
                    }
                }
            }
            return "Target not found";
        }


        else if (dim == 4) {
            for (int i = 0; i < array4D.length; i++) {
                for (int j = 0; j < array4D[i].length; j++) {
                    for (int k = 0; k < array4D[i][j].length; k++) {
                        for (int l = 0; l < array4D[i][j][k].length; l++) {
                            if (array4D[i][j][k][l].equals(target)){
                                String s = i + " " + j + " " + k + " " + l;
                                return s;
                            }
                        }
                    }
                }
            }
            return "Target not found";
        }


        else if (dim == 5) {
            for (int i = 0; i < array5D.length; i++) {
                for (int j = 0; j < array5D[i].length; j++) {
                    for (int k = 0; k < array5D[i][j].length; k++) {
                        for (int l = 0; l < array5D[i][j][k].length; l++) {
                            for (int m = 0; m < array5D[i][j][k][l].length; m++) {
                                if (array5D[i][j][k][l][m].equals(target)){
                                    String s = i + " " + j + " " + k + " " + l + " " + m;
                                    return s;
                                }
                            }
                        }
                    }
                }
            }
            return "Target not found";
        }


        else if (dim == 6) {
            for (int i = 0; i < array6D.length; i++) {
                for (int j = 0; j < array6D[i].length; j++) {
                    for (int k = 0; k < array6D[i][j].length; k++){
                        for (int l = 0; l < array6D[i][j][k].length; l++) {
                            for (int m = 0; m < array6D[i][j][k][l].length; m++) {
                                for (int n = 0; n < array6D[i][j][k][l][m].length; n++) {
                                    if (array6D[i][j][k][l][m][n].equals(target)){
                                        String s = i + " " + j + " " + k + " " + l + " " + m + " " + n;
                                        return s;
                                    }
                                }
                            }
                        }
                    }

                }
            }
            return "Target not found";
        }


        else if (dim == 7) {
            for (int i = 0; i < array7D.length; i++) {
                for (int j = 0; j < array7D[i].length; j++) {
                    for (int k = 0; k < array7D[i][j].length; k++){
                        for (int l = 0; l < array7D[i][j][k].length; l++) {
                            for (int m = 0; m < array7D[i][j][k][l].length; m++) {
                                for (int n = 0; n < array7D[i][j][k][l][m].length; n++) {
                                    for (int o = 0; o < array7D[i][j][k][l][m][n].length; o++){
                                        if (array7D[i][j][k][l][m][n][o].equals(target)){
                                            String s = i + " " + j + " " + k + " " + l + " " + m + " " + n + " " + o;
                                            return s;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return "Target not found";
        }


        else if (dim == 8) {
            for (int i = 0; i < array8D.length; i++) {
                for (int j = 0; j < array8D[i].length; j++) {
                    for (int k = 0; k < array8D[i][j].length; k++){
                        for (int l = 0; l < array8D[i][j][k].length; l++) {
                            for (int m = 0; m < array8D[i][j][k][l].length; m++) {
                                for (int n = 0; n < array8D[i][j][k][l][m].length; n++) {
                                    for (int o = 0; o < array8D[i][j][k][l][m][n].length; o++){
                                        for (int p = 0; p < array8D[i][j][k][l][m][n][o].length; p++){
                                            if (array8D[i][j][k][l][m][n][o][p].equals(target)){
                                                String s = i + " " + j + " " + k + " " + l + " " + m + " " + n + " " + o + " " + p;
                                                return s;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return "Target not found";
        }


        else if (dim == 9) {
            for (int i = 0; i < array9D.length; i++) {
                for (int j = 0; j < array9D[i].length; j++) {
                    for (int k = 0; k < array9D[i][j].length; k++){
                        for (int l = 0; l < array9D[i][j][k].length; l++) {
                            for (int m = 0; m < array9D[i][j][k][l].length; m++) {
                                for (int n = 0; n < array9D[i][j][k][l][m].length; n++) {
                                    for (int o = 0; o < array9D[i][j][k][l][m][n].length; o++){
                                        for (int p = 0; p < array9D[i][j][k][l][m][n][o].length; p++){
                                            for (int q = 0; q < array9D[i][j][k][l][m][n][o][p].length; q++){
                                                if (array9D[i][j][k][l][m][n][o][p][q].equals(target)){
                                                    String s = i + " " + j + " " + k + " " + l + " " + m + " " + n + " " + o + " " + p + " " + q;
                                                    return s;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return "Target not found";
        }


        else if (dim == 10) {
            for (int i = 0; i < array10D.length; i++) {
                for (int j = 0; j < array10D[i].length; j++) {
                    for (int k = 0; k < array10D[i][j].length; k++){
                        for (int l = 0; l < array10D[i][j][k].length; l++) {
                            for (int m = 0; m < array10D[i][j][k][l].length; m++) {
                                for (int n = 0; n < array10D[i][j][k][l][m].length; n++) {
                                    for (int o = 0; o < array10D[i][j][k][l][m][n].length; o++){
                                        for (int p = 0; p < array10D[i][j][k][l][m][n][o].length; p++){
                                            for (int q = 0; q < array10D[i][j][k][l][m][n][o][p].length; q++){
                                                for (int r = 0; r < array10D[i][j][k][l][m][n][o][p][q].length; r++){
                                                    if (array10D[i][j][k][l][m][n][o][p][q][r].equals(target)){
                                                        String s = i + " " + j + " " + k + " " + l + " " + m + " " + n + " " + o + " " + p + " " + q + " " + r;
                                                        return s;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return "Target not found";
        }
        return "Only searches arrays with dimensions 1 - 10";
    }
}
