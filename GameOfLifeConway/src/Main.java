import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Thread t;
        int przed = 0;
        int po = 0;

        int przedTab[][] = new int[10][10];
        int [][] poTab = new int[10][10];

        System.out.println();
        for(int i = 0; i < przedTab.length; i++){
            for(int j = 0; j < przedTab[i].length; j++){
                przedTab[i][j]= 0;
            }
        }

        for(int i = 0 ; i < poTab.length;i++){
            for(int j = 0 ; j < poTab[i].length;j++){
                poTab[i][j]= 0;
            }
        }

//boisko
                przedTab[5][1]=1;
                przedTab[5][2]=1;
                przedTab[5][3]=1;
                przedTab[4][2]=1;
                przedTab[6][2]=1;


        //linia

//                przedTab[2][7]=1;
//                przedTab[2][6] = 1;
//                przedTab[2][5] = 1;
//
//
//        //szybowiec
                przedTab[8][4] = 1;
                przedTab[8][5] = 1;
                przedTab[8][6] = 1;
                przedTab[7][6] = 1;
                przedTab[6][5] = 1;

         

//        for(int i = 0; i < przedTab.length; i++){
//            for(int j = 0; j < przedTab[i].length; j++){
//                System.out.print(przedTab[i][j]);
//            }
//            System.out.println();
//        }
//
//        System.out.println();




try{

            for(int i = 0; i < przedTab.length; i++){
                for(int j = 0; j < przedTab[i].length; j++){
//1
                        if (i == 0 && j == 0) {

                            if ((przedTab[i][j] == 0) && (przedTab[i + 1][j] + przedTab[i + 1][j + 1] + przedTab[i][j + 1]) == 3) {
                                poTab[i][j] = 1;
                            }
                            if ((przedTab[i][j] == 1) && (przedTab[i + 1][j] + przedTab[i + 1][j + 1] + przedTab[i][j + 1]) == 2) {
                                poTab[i][j] = 1;
                            }
                            if ((przedTab[i][j] == 1) && (przedTab[i + 1][j] + przedTab[i + 1][j + 1] + przedTab[i][j + 1]) < 2 || (przedTab[i + 1][j] + przedTab[i + 1][j + 1] + przedTab[i][j + 1]) > 3) {
                                poTab[i][j] = 0;
                            }

                        }
//2
                        if ((i == 0) && (j > 0 && j < przedTab.length - 1)) {

                            if ((przedTab[i][j] == 0) && (przedTab[i][j - 1] + przedTab[i + 1][j - 1] + przedTab[i + 1][j] + przedTab[i + 1][j + 1] + przedTab[i][j + 1]) == 3) {
                                poTab[i][j] = 1;
                            }
                            if ((przedTab[i][j] == 1) && (przedTab[i][j - 1] + przedTab[i + 1][j - 1] + przedTab[i + 1][j] + przedTab[i + 1][j + 1] + przedTab[i][j + 1]) == 2) {
                                poTab[i][j] = 1;
                            }

                            if ((przedTab[i][j] == 1) && (przedTab[i][j - 1] + przedTab[i + 1][j - 1] + przedTab[i + 1][j] + przedTab[i + 1][j + 1] + przedTab[i][j + 1]) < 2 || (przedTab[i][j - 1] + przedTab[i + 1][j - 1] + przedTab[i + 1][j] + przedTab[i + 1][j + 1] + przedTab[i][j + 1]) > 3) {
                                poTab[i][j] = 0;
                            }

                        }
//3
                        if (i == 0 && j == przedTab.length - 1) {
                            if ((przedTab[i][j] == 0) && (przedTab[i][j - 1] + przedTab[i + 1][j - 1] + przedTab[i + 1][j]) == 3) {
                                poTab[i][j] = 1;
                            }
                            if ((przedTab[i][j] == 1) && (przedTab[i][j - 1] + przedTab[i + 1][j - 1] + przedTab[i + 1][j]) == 2) {
                                poTab[i][j] = 1;
                            }

                            if ((przedTab[i][j] == 1) && (przedTab[i][j - 1] + przedTab[i + 1][j - 1] + przedTab[i + 1][j]) < 2 || (przedTab[i][j - 1] + przedTab[i + 1][j - 1] + przedTab[i + 1][j]) > 3) {
                                poTab[i][j] = 0;
                            }

                        }
//4
                        if ((i > 0 && i < przedTab.length - 1) && (j == przedTab.length - 1)) {
                            if ((przedTab[i][j] == 0) && (przedTab[i - 1][j] + przedTab[i - 1][j - 1] + przedTab[i][j - 1] + przedTab[i + 1][j - 1] + przedTab[i + 1][j]) == 3) {
                                poTab[i][j] = 1;
                            }
                            if ((przedTab[i][j] == 1) && (przedTab[i - 1][j] + przedTab[i - 1][j - 1] + przedTab[i][j - 1] + przedTab[i + 1][j - 1] + przedTab[i + 1][j]) == 2) {
                                poTab[i][j] = 1;
                            }

                            if ((przedTab[i][j] == 1) && (przedTab[i - 1][j] + przedTab[i - 1][j - 1] + przedTab[i][j - 1] + przedTab[i + 1][j - 1] + przedTab[i + 1][j]) < 2 || (przedTab[i - 1][j] + przedTab[i - 1][j - 1] + przedTab[i][j - 1] + przedTab[i + 1][j - 1] + przedTab[i + 1][j]) < 3) {
                                poTab[i][j] = 0;
                            }

                        }
//5
                        if (i == przedTab.length - 1 && j == przedTab[i].length - 1) {
                            if ((przedTab[i][j] == 0) && (przedTab[i - 1][j] + przedTab[i - 1][j - 1] + przedTab[i][j - 1]) == 3) {
                                poTab[i][j] = 1;
                            }
                            if ((przedTab[i][j] == 1) && (przedTab[i - 1][j] + przedTab[i - 1][j - 1] + przedTab[i][j - 1]) == 2) {
                                poTab[i][j] = 1;
                            }

                            if ((przedTab[i][j] == 1) && (przedTab[i - 1][j] + przedTab[i - 1][j - 1] + przedTab[i][j - 1]) < 2 || (przedTab[i - 1][j] + przedTab[i - 1][j - 1] + przedTab[i][j - 1]) > 3) {
                                poTab[i][j] = 0;
                            }

                        }
//6
                        if (i == przedTab.length - 1 && (j > 0 && j < przedTab.length - 1)) {
                            if ((przedTab[i][j] == 0) && (przedTab[i][j - 1] + przedTab[i - 1][j - 1] + przedTab[i - 1][j] + przedTab[i - 1][j + 1] + przedTab[i][j + 1]) == 3) {
                                poTab[i][j] = 1;
                            }
                            if ((przedTab[i][j] == 1) && (przedTab[i][j - 1] + przedTab[i - 1][j - 1] + przedTab[i - 1][j] + przedTab[i - 1][j + 1] + przedTab[i][j + 1]) == 2) {
                                poTab[i][j] = 1;
                            }

                            if ((przedTab[i][j] == 1) && (przedTab[i][j - 1] + przedTab[i - 1][j - 1] + przedTab[i - 1][j] + przedTab[i - 1][j + 1] + przedTab[i][j + 1]) < 2 || (przedTab[i][j - 1] + przedTab[i - 1][j - 1] + przedTab[i - 1][j] + przedTab[i - 1][j + 1] + przedTab[i][j + 1]) < 3) {
                                poTab[i][j] = 0;
                            }
                        }
//7
                        if (i == przedTab.length - 1 && j == 0) {
                            if ((przedTab[i][j] == 0) && (przedTab[i - 1][j] + przedTab[i - 1][j + 1] + przedTab[i][j + 1]) == 3) {
                                poTab[i][j] = 1;
                            }
                            if ((przedTab[i][j] == 1) && (przedTab[i - 1][j] + przedTab[i - 1][j + 1] + przedTab[i][j + 1]) == 2) {
                                poTab[i][j] = 1;
                            }

                            if ((przedTab[i][j] == 1) && (przedTab[i - 1][j] + przedTab[i - 1][j + 1] + przedTab[i][j + 1]) < 2 || (przedTab[i - 1][j] + przedTab[i - 1][j + 1] + przedTab[i][j + 1]) > 3) {
                                poTab[i][j] = 0;
                            }

                        }
//8
                        if ((i > 0 && i < przedTab.length - 1) && (j == 0)) {
                            if ((przedTab[i][j] == 0) && (przedTab[i - 1][j] + przedTab[i - 1][j + 1] + przedTab[i][j + 1] + przedTab[i + 1][j + 1] + przedTab[i + 1][j]) == 3) {
                                poTab[i][j] = 1;
                            }
                            if ((przedTab[i][j] == 1) && (przedTab[i - 1][j] + przedTab[i - 1][j + 1] + przedTab[i][j + 1] + przedTab[i + 1][j + 1] + przedTab[i + 1][j]) == 2) {
                                poTab[i][j] = 1;
                            }

                            if ((przedTab[i][j] == 1) && (przedTab[i - 1][j] + przedTab[i - 1][j + 1] + przedTab[i][j + 1] + przedTab[i + 1][j + 1] + przedTab[i + 1][j]) < 2 || (przedTab[i - 1][j] + przedTab[i - 1][j + 1] + przedTab[i][j + 1] + przedTab[i + 1][j + 1] + przedTab[i + 1][j]) > 3) {
                                poTab[i][j] = 0;
                            }
                        }

//9
                            if((i > 0 && i < przedTab.length-1) && (j>0 && j < przedTab.length-1)) {
                                if (przedTab[i][j] == 0 && (przedTab[i - 1][j - 1] + przedTab[i - 1][j] + przedTab[i - 1][j + 1] + przedTab[i][j + 1] + przedTab[i + 1][j + 1] + przedTab[i + 1][j] + przedTab[i + 1][j - 1] + przedTab[i][j - 1]) == 3) {
                                    poTab[i][j] = 1;
                                }
                                if (przedTab[i][j] == 1 && (przedTab[i - 1][j - 1] + przedTab[i - 1][j] + przedTab[i - 1][j + 1] + przedTab[i][j + 1] + przedTab[i + 1][j + 1] + przedTab[i + 1][j] + przedTab[i + 1][j - 1] + przedTab[i][j - 1]) == 2 || (przedTab[i - 1][j - 1] + przedTab[i - 1][j] + przedTab[i - 1][j + 1] + przedTab[i][j + 1] + przedTab[i + 1][j + 1] + przedTab[i + 1][j] + przedTab[i + 1][j - 1] + przedTab[i][j - 1]) == 3) {
                                    poTab[i][j] = 1;
                                }

                                if (przedTab[i][j] == 1 && (przedTab[i - 1][j - 1] + przedTab[i - 1][j] + przedTab[i - 1][j + 1] + przedTab[i][j + 1] + przedTab[i + 1][j + 1] + przedTab[i + 1][j] + przedTab[i + 1][j - 1] + przedTab[i][j - 1]) < 2 || (przedTab[i - 1][j - 1] + przedTab[i - 1][j] + przedTab[i - 1][j + 1] + przedTab[i][j + 1] + przedTab[i + 1][j + 1] + przedTab[i + 1][j] + przedTab[i + 1][j - 1] + przedTab[i][j - 1]) > 3) {
                                    poTab[i][j] = 0;
                                }
                            }





                }

        }
}catch (ArrayIndexOutOfBoundsException e){
    e.printStackTrace();
}




//            for(int i = 0 ; i < poTab.length;i++){
//                for(int j = 0 ; j < poTab[i].length;j++){
//
//                    System.out.print(poTab[i][j]);
//                }
//                System.out.println();
//            }




        JFrame jf = new JFrame();
        jf.setSize(new Dimension(800,600));
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setLayout(new GridLayout(0,3));
        JPanel srodek = new JPanel();
        srodek.setBackground(Color.BLUE);
        JButton button = new JButton();
        srodek.add(button);
        JPanel lewo = new JPanel();
        lewo.setBackground(Color.BLACK);
        lewo.setLayout(new GridLayout(przedTab.length, przedTab.length));
        JPanel prawo = new JPanel();
        prawo.setBackground(Color.BLACK);
        prawo.setLayout(new GridLayout(przedTab.length, przedTab.length));
        JLabel l;
        for(int i = 0; i < przedTab.length ; i ++){
            for(int j = 0; j < przedTab[i].length; j++){
                l = new JLabel(String.valueOf(przedTab[i][j]));
                if(przedTab[i][j] == 1){
                  //  l.setBackground(Color.GREEN);
                    l.setForeground(Color.GREEN);
                    lewo.add(l);
                }else{
                    l.setForeground(Color.RED);
                    lewo.add(l);
                }

            }
        }


        for(int i = 0; i < poTab.length ; i ++){
            for(int j = 0; j < poTab[i].length; j++){
                l = new JLabel(String.valueOf(poTab[i][j]));
                if(poTab[i][j] == 1){
                    //  l.setBackground(Color.GREEN);
                    l.setForeground(Color.GREEN);
                    prawo.add(l);
                }else{
                    l.setForeground(Color.RED);
                    prawo.add(l);
                }

            }
        }

        JLabel strzalka = new JLabel("->");
        strzalka.setPreferredSize(new Dimension(100,50));
        srodek.add(strzalka);




        jf.add(lewo);
        jf.add(srodek);
        jf.add(prawo);

        jf.repaint();
        jf.setVisible(true);
    }



}
