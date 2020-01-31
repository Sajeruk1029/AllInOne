package sajeruk.laba.tictactoe;

//import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button [] buts = new Button [9];
    private TextView [] pols = new TextView [2];
    private int [] red = new int [9];
    private int [] blue = new int [9];
    private int turn;
    private int t = 0;
    private int count;

    //generation
    public void generation() {

        Random gen = new Random();
        turn = gen.nextInt(2);

    }
    //winRed
    public void winRed() {

        pols[0].setTextColor(Color.RED);
        pols[0].setText("Победил красный игрок!");
        pols[1].setTextColor(Color.BLACK);
        pols[1].setText("Game Over!");

        for (count = 0; count < 9; count++) {

            buts[count].setEnabled(false);

        }

    }
    //winBlue
    public void winBlue() {

        pols[0].setTextColor(Color.BLUE);
        pols[0].setText("Победил синий игрок!");
        pols[1].setTextColor(Color.BLACK);
        pols[1].setText("Game Over!");

        for (count = 0; count < 9; count++) {

            buts[count].setEnabled(false);

        }
    }

    //deadHeat
    public void deadHeat() {

        pols[0].setTextColor(Color.BLACK);
        pols[0].setText("Ничья!");
        pols[1].setTextColor(Color.BLACK);
        pols[1].setText("Game Over!");

    }

    public void diagonals() {

        if (((red[0] == 1) & (red[4] == 1) & (red[8] == 1)) | ((red[2] == 1) & (red[4] == 1) & (red[6] == 1))) {

            winRed();

        }
        if (((blue[0] == 1) & (blue[4] == 1) & (blue[8] == 1)) | ((blue[2] == 1) & (blue[4] == 1) & (blue[6] == 1))) {

            winBlue();

        }

    }

    public void horizontals() {

        if ((((red[0] == 1) & (red[1] == 1) & (red[2] == 1)) | ((red[3] == 1) & (red[4] == 1) & (red[5] == 1)) | ((red[6] == 1) & (red[7] == 1) & (red[8] == 1)))) {

            winRed();

        }
        if ((((blue[0] == 1) & (blue[1] == 1) & (blue[2] == 1)) | ((blue[3] == 1) & (blue[4] == 1) & (blue[5] == 1)) | ((blue[6] == 1) & (blue[7] == 1) & (blue[8] == 1)))) {

            winBlue();

        }

    }

    public void verticals() {

        if ((((red[0] == 1) & (red[3] == 1) & (red[6] == 1)) | ((red[1] == 1) & (red[4] == 1) & (red[7] == 1)) | ((red[2] == 1) & (red[5] == 1) & (red[8] == 1)))) {

            winRed();

        }
        if ((((blue[0] == 1) & (blue[3] == 1) & (blue[6] == 1)) | ((blue[1] == 1) & (blue[4] == 1) & (blue[7] == 1)) | ((blue[2] == 1) & (blue[5] == 1) & (blue[8] == 1)))) {

            winBlue();

        }

    }

    public void all() {

        if (t == 9) {

            deadHeat();

        }

    }

    //check
    public void check() {

        diagonals();
        horizontals();
        verticals();
        all();

    }

    //checkTurn
    public void checkTurn() {

        if (turn == 0) {

            pols[1].setTextColor(Color.RED);
            pols[1].setText("Ход красного игрока.");

        }
        else {

            pols[1].setTextColor(Color.BLUE);
            pols[1].setText("Ход синего игрока.");

        }

    }

    //but1
    public void but1() {

        if (turn == 0) {

            buts[0].setTextColor(Color.RED);
            buts[0].setText("x");
            red[0] = 1;
            turn = 1;
            t++;

        }
        else {

            buts[0].setTextColor(Color.BLUE);
            buts[0].setText("o");
            blue[0] = 1;
            turn = 0;
            t++;

        }

        buts[0].setEnabled(false);

    }

    //but2
    public void but2() {

        if (turn == 0) {

            buts[1].setTextColor(Color.RED);
            buts[1].setText("x");
            red[1] = 1;
            turn = 1;
            t++;

        }
        else {

            buts[1].setTextColor(Color.BLUE);
            buts[1].setText("o");
            blue[1] = 1;
            turn = 0;
            t++;

        }

        buts[1].setEnabled(false);

    }

    //but3
    public void but3() {

        if (turn == 0) {

            buts[2].setTextColor(Color.RED);
            buts[2].setText("x");
            red[2] = 1;
            turn = 1;
            t++;

        }
        else {

            buts[2].setTextColor(Color.BLUE);
            buts[2].setText("o");
            blue[2] = 1;
            turn = 0;
            t++;

        }

        buts[2].setEnabled(false);

    }

    //but4
    public void but4() {

        if (turn == 0) {

            buts[3].setTextColor(Color.RED);
            buts[3].setText("x");
            red[3] = 1;
            turn = 1;
            t++;

        }
        else {

            buts[3].setTextColor(Color.BLUE);
            buts[3].setText("o");
            blue[3] = 1;
            turn = 0;
            t++;

        }

        buts[3].setEnabled(false);

    }

    //but5
    public void but5() {

        if (turn == 0) {

            buts[4].setTextColor(Color.RED);
            buts[4].setText("x");
            red[4] = 1;
            turn = 1;
            t++;

        }
        else {

            buts[4].setTextColor(Color.BLUE);
            buts[4].setText("o");
            blue[4] = 1;
            turn = 0;
            t++;

        }

        buts[4].setEnabled(false);

    }

    //but6
    public void but6() {

        if (turn == 0) {

            buts[5].setTextColor(Color.RED);
            buts[5].setText("x");
            red[5] = 1;
            turn = 1;
            t++;

        }
        else {

            buts[5].setTextColor(Color.BLUE);
            buts[5].setText("o");
            blue[5] = 1;
            turn = 0;
            t++;

        }

        buts[5].setEnabled(false);

    }

    //but7
    public void but7() {

        if (turn == 0) {

            buts[6].setTextColor(Color.RED);
            buts[6].setText("x");
            red[6] = 1;
            turn = 1;
            t++;

        }
        else {

            buts[6].setTextColor(Color.BLUE);
            buts[6].setText("o");
            blue[6] = 1;
            turn = 0;
            t++;

        }

        buts[6].setEnabled(false);

    }

    //but8
    public void but8() {

        if (turn == 0) {

            buts[7].setTextColor(Color.RED);
            buts[7].setText("x");
            red[7] = 1;
            turn = 1;
            t++;

        }
        else {

            buts[7].setTextColor(Color.BLUE);
            buts[7].setText("o");
            blue[7] = 1;
            turn = 0;
            t++;

        }

        buts[7].setEnabled(false);

    }

    //but9
    public void but9() {

        if (turn == 0) {

            buts[8].setTextColor(Color.RED);
            buts[8].setText("x");
            red[8] = 1;
            turn = 1;
            t++;

        }
        else {

            buts[8].setTextColor(Color.BLUE);
            buts[8].setText("o");
            blue[8] = 1;
            turn = 0;
            t++;

        }

        buts[8].setEnabled(false);

    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //buts
        buts[0] = (Button) findViewById(R.id.bone);
        buts[1] = (Button) findViewById(R.id.btwo);
        buts[2] = (Button) findViewById(R.id.bthree);
        buts[3] = (Button) findViewById(R.id.bfour);
        buts[4] = (Button) findViewById(R.id.bfive);
        buts[5] = (Button) findViewById(R.id.bsix);
        buts[6] = (Button) findViewById(R.id.bseven);
        buts[7] = (Button) findViewById(R.id.beight);
        buts[8] = (Button) findViewById(R.id.bnine);
        // pols
        pols[0] = (TextView) findViewById(R.id.polewin);
        pols[1] = (TextView) findViewById(R.id.poleigroka);


        //start generation
        generation();
        //checkTurn
        checkTurn();
    }

    public void onClick(View view) {


        switch (view.getId()) {

            case R.id.bone:

                but1();
                break;

            case R.id.btwo:

                but2();
                break;

            case R.id.bthree:

                but3();
                break;

            case R.id.bfour:

                but4();
                break;

            case R.id.bfive:

                but5();
                break;

            case R.id.bsix:

                but6();
                break;

            case R.id.bseven:

                but7();
                break;

            case R.id.beight:

                but8();
                break;

            case R.id.bnine:

                but9();
                break;
        }

        checkTurn();
        check();

    }

}
