package com.example.hira.customlistview;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomListViewAdapter extends BaseAdapter {

    public Context context;
    public String[] names;
    public String[] numbers;
    LayoutInflater layoutInflater;
    ArrayList<ListDat> results ;

    CustomListViewAdapter(Context context,ArrayList<ListDat> results)
    {
        this.context=context;
        this.results=results;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return results.size();
    }

    @Override
    public Object getItem(int position) {
        return results.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {

        ViewHolder holder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.custom_list_view, null);
            holder = new ViewHolder();
            holder.Name = (TextView) convertView.findViewById(R.id.txt_name);
            holder.Number = (TextView) convertView.findViewById(R.id.txt_number);
            holder.CircleText=(TextView) convertView.findViewById(R.id.circle_text);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }


        String first = String.valueOf( results.get(i).getName().charAt(0));

        if ("C".equals(first) || "C" == first)
        {
            holder.CircleText.setBackground( getColoredDrawable(R.drawable.circle,context.getResources().getColor(R.color.green_c)));
        }
        switch (first)
        {
            case "A":
                holder.CircleText.setBackground(getColoredDrawable(R.drawable.circle,context.getResources().getColor(R.color.red_a)));
                break;
            case "B":
                holder.CircleText.setBackground(getColoredDrawable(R.drawable.circle,context.getResources().getColor(R.color.blue_b)));
                break;
            case "C":
                holder.CircleText.setBackground(getColoredDrawable(R.drawable.circle,context.getResources().getColor(R.color.green_c)));
                break;
            case "D":
                holder.CircleText.setBackground(getColoredDrawable(R.drawable.circle,context.getResources().getColor(R.color.aqua_d)));
                break;
            case "E":
                holder.CircleText.setBackground(getColoredDrawable(R.drawable.circle,context.getResources().getColor(R.color.brown_e)));
                break;
            case "F":
                holder.CircleText.setBackground(getColoredDrawable(R.drawable.circle,context.getResources().getColor(R.color.black_f)));
                break;
            case "G":
                holder.CircleText.setBackground(getColoredDrawable(R.drawable.circle,context.getResources().getColor(R.color.yellow_g)));
                break;
            case "H":
                holder.CircleText.setBackground(getColoredDrawable(R.drawable.circle,context.getResources().getColor(R.color.grey_h)));
                break;
            case "I":
                holder.CircleText.setBackground(getColoredDrawable(R.drawable.circle,context.getResources().getColor(R.color.orange_i)));
                break;
            case "J":
                holder.CircleText.setBackground(getColoredDrawable(R.drawable.circle,context.getResources().getColor(R.color.pink_j)));
                break;
            case "K":
                holder.CircleText.setBackground(getColoredDrawable(R.drawable.circle,context.getResources().getColor(R.color.purple_k)));
                break;
            case "L":
                holder.CircleText.setBackground(getColoredDrawable(R.drawable.circle,context.getResources().getColor(R.color.voilet_l)));
                break;
            case "M":
                holder.CircleText.setBackground(getColoredDrawable(R.drawable.circle,context.getResources().getColor(R.color.indigo_m)));
                break;
            case "N":
                holder.CircleText.setBackground(getColoredDrawable(R.drawable.circle,context.getResources().getColor(R.color.copper_n)));
                break;
            case "O":
                holder.CircleText.setBackground(getColoredDrawable(R.drawable.circle,context.getResources().getColor(R.color.emeralad_o)));
                break;
            case "P":
                holder.CircleText.setBackground(getColoredDrawable(R.drawable.circle,context.getResources().getColor(R.color.gold_p)));
                break;
            case "Q":
                holder.CircleText.setBackground(getColoredDrawable(R.drawable.circle,context.getResources().getColor(R.color.lemon_q)));
                break;
            case "R":
                holder.CircleText.setBackground(getColoredDrawable(R.drawable.circle,context.getResources().getColor(R.color.magenta_r)));
                break;
            case "S":
                holder.CircleText.setBackground(getColoredDrawable(R.drawable.circle,context.getResources().getColor(R.color.musturd_s)));
                break;
            case "T":
                holder.CircleText.setBackground(getColoredDrawable(R.drawable.circle,context.getResources().getColor(R.color.white_t)));
                break;
            case "U":
                holder.CircleText.setBackground(getColoredDrawable(R.drawable.circle,context.getResources().getColor(R.color.peach_u)));
                break;
            case "V":
                holder.CircleText.setBackground(getColoredDrawable(R.drawable.circle,context.getResources().getColor(R.color.rolayblue_v)));
                break;
            case "W":
                holder.CircleText.setBackground(getColoredDrawable(R.drawable.circle,context.getResources().getColor(R.color.navyblue_w)));
                break;
            case "X":
                holder.CircleText.setBackground(getColoredDrawable(R.drawable.circle,context.getResources().getColor(R.color.shockingpink_x)));
                break;
            case "Y":
                holder.CircleText.setBackground(getColoredDrawable(R.drawable.circle,context.getResources().getColor(R.color.skyblue_y)));
                break;
            case "Z":
                holder.CircleText.setBackground(getColoredDrawable(R.drawable.circle,context.getResources().getColor(R.color.silver_z)));
                break;
            default:

                break;

        }
        holder.Name.setText(results.get(i).getName());
        holder.Number.setText(results.get(i).getNumber());
        holder.CircleText.setText(results.get(i).getCicleText());


        return convertView;
    }

    static class ViewHolder {
        TextView Name;
        TextView Number;
        TextView CircleText;

    }
    private Drawable getColoredDrawable(int drawableResId, int color) {
        Drawable d = context.getResources().getDrawable(R.drawable.circle);
        ColorFilter filter = new LightingColorFilter( color,color);
        d.setColorFilter(filter);
        return d;
    }


}
