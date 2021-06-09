package com.example.baseadapter_custom_listview_1;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ClassAdapter extends BaseAdapter {

    private final Activity context;
    private final String[] district;
    private final Integer[] imageId;

    public ClassAdapter(Activity context, String[] district, Integer[] imageId) {
        this.context = context;
        this.district = district;
        this.imageId = imageId;
    }

    @Override
    public int getCount() {
        return district.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
/*
            LayoutInflater inflater =context.getLayoutInflater();
            View rowview= inflater.inflate(R.layout.base_list_single1,null,true);
            TextView txtTitle=rowview.findViewById(R.id.txt);
            ImageView imageView=rowview.findViewById(R.id.img);
            txtTitle.setText(district[position]);
            imageView.setImageResource(imageId[position]);
            return rowview;
*/
//...........................increase 70% performence.............ssssssssssss,
/*if(convertView==null){
            LayoutInflater inflater =context.getLayoutInflater();
            convertView= inflater.inflate(R.layout.base_list_single1,null,true);
            }

        TextView txtTitle=convertView.findViewById(R.id.txt);
        ImageView imageView=convertView.findViewById(R.id.img);
        txtTitle.setText(district[position]);
        imageView.setImageResource(imageId[position]);
        return convertView;
*/
ViewHolder vh;
        if(convertView==null){

            convertView= LayoutInflater.from (context).inflate(R.layout.base_list_single1,null,true);
            vh=new ViewHolder(convertView);
            convertView.setTag(vh);
        }
        else{
            vh=(ViewHolder)convertView.getTag();
        }

        vh.textTitle.setText(district[position]);
       vh.imageView.setImageResource(imageId[position]);
        return convertView;
    }


    private  class ViewHolder{
        TextView textTitle;
        ImageView imageView;
        public  ViewHolder(View view){
            textTitle=view.findViewById(R.id.txt);
            imageView=view.findViewById(R.id.img);
        }
    }
}
