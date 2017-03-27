package com.example.hira.customlistview;

import android.content.Intent;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ListViewDetailActivity extends AppCompatActivity {

    TextView txtCircle,txtName,txtNumber;
    String strtName,strNumber,strCircleText;
    Intent intent;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_detail);

        txtCircle = (TextView) findViewById(R.id.circle_text);
        txtName = (TextView) findViewById(R.id.txt_name);
        txtNumber = (TextView) findViewById(R.id.txt_number);



        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                strNumber= null;
                strtName= null;
                strCircleText= null;
            } else {
                strtName = extras.getString("name");
                strNumber = extras.getString("number");
                strCircleText = extras.getString("circleText");
            }
        } else {
            strtName= (String) savedInstanceState.getSerializable("name");
            strNumber= (String) savedInstanceState.getSerializable("number");
            strCircleText= (String) savedInstanceState.getSerializable("circleText");
        }


        String rsltName  = strtName;
        String first = String.valueOf( rsltName.charAt(0));

        if ("C".equals(first) || "C" == first)
        {
            txtCircle.setBackground( getColoredDrawable(R.drawable.circle,getResources().getColor(R.color.green_c)));
        }
        switch (first)
        {
            case "A":
                txtCircle.setBackground(getColoredDrawable(R.drawable.circle,getResources().getColor(R.color.red_a)));
                break;
            case "B":
                txtCircle.setBackground(getColoredDrawable(R.drawable.circle,getResources().getColor(R.color.blue_b)));
                break;
            case "C":
                txtCircle.setBackground(getColoredDrawable(R.drawable.circle,getResources().getColor(R.color.green_c)));
                break;
            case "D":
                txtCircle.setBackground(getColoredDrawable(R.drawable.circle,getResources().getColor(R.color.aqua_d)));
                break;
            case "E":
                txtCircle.setBackground(getColoredDrawable(R.drawable.circle,getResources().getColor(R.color.brown_e)));
                break;
            case "F":
                txtCircle.setBackground(getColoredDrawable(R.drawable.circle,getResources().getColor(R.color.black_f)));
                break;
            case "G":
                txtCircle.setBackground(getColoredDrawable(R.drawable.circle,getResources().getColor(R.color.yellow_g)));
                break;
            case "H":
                txtCircle.setBackground(getColoredDrawable(R.drawable.circle,getResources().getColor(R.color.grey_h)));
                break;
            case "I":
                txtCircle.setBackground(getColoredDrawable(R.drawable.circle,getResources().getColor(R.color.orange_i)));
                break;
            case "J":
                txtCircle.setBackground(getColoredDrawable(R.drawable.circle,getResources().getColor(R.color.pink_j)));
                break;
            case "K":
                txtCircle.setBackground(getColoredDrawable(R.drawable.circle,getResources().getColor(R.color.purple_k)));
                break;
            case "L":
                txtCircle.setBackground(getColoredDrawable(R.drawable.circle,getResources().getColor(R.color.voilet_l)));
                break;
            case "M":
                txtCircle.setBackground(getColoredDrawable(R.drawable.circle,getResources().getColor(R.color.indigo_m)));
                break;
            case "N":
                txtCircle.setBackground(getColoredDrawable(R.drawable.circle,getResources().getColor(R.color.copper_n)));
                break;
            case "O":
                txtCircle.setBackground(getColoredDrawable(R.drawable.circle,getResources().getColor(R.color.emeralad_o)));
                break;
            case "P":
                txtCircle.setBackground(getColoredDrawable(R.drawable.circle,getResources().getColor(R.color.gold_p)));
                break;
            case "Q":
                txtCircle.setBackground(getColoredDrawable(R.drawable.circle,getResources().getColor(R.color.lemon_q)));
                break;
            case "R":
                txtCircle.setBackground(getColoredDrawable(R.drawable.circle,getResources().getColor(R.color.magenta_r)));
                break;
            case "S":
                txtCircle.setBackground(getColoredDrawable(R.drawable.circle,getResources().getColor(R.color.musturd_s)));
                break;
            case "T":
                txtCircle.setBackground(getColoredDrawable(R.drawable.circle,getResources().getColor(R.color.white_t)));
                break;
            case "U":
                txtCircle.setBackground(getColoredDrawable(R.drawable.circle,getResources().getColor(R.color.peach_u)));
                break;
            case "V":
                txtCircle.setBackground(getColoredDrawable(R.drawable.circle,getResources().getColor(R.color.rolayblue_v)));
                break;
            case "W":
                txtCircle.setBackground(getColoredDrawable(R.drawable.circle,getResources().getColor(R.color.navyblue_w)));
                break;
            case "X":
                txtCircle.setBackground(getColoredDrawable(R.drawable.circle,getResources().getColor(R.color.shockingpink_x)));
                break;
            case "Y":
                txtCircle.setBackground(getColoredDrawable(R.drawable.circle,getResources().getColor(R.color.skyblue_y)));
                break;
            case "Z":
                txtCircle.setBackground(getColoredDrawable(R.drawable.circle,getResources().getColor(R.color.silver_z)));
                break;
            default:

                break;

        }


        txtName.setText(strtName);
        txtNumber.setText(strNumber);
        txtCircle.setText(strCircleText);


    }

    private Drawable getColoredDrawable(int drawableResId, int color) {
        Drawable d = getResources().getDrawable(R.drawable.circle);
        ColorFilter filter = new LightingColorFilter( color,color);
        d.setColorFilter(filter);
        return d;
    }


}

