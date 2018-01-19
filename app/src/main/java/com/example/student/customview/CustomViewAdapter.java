package com.example.student.customview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by student on 2018-01-15.
 */

public class CustomViewAdapter extends BaseAdapter{
    private ArrayList<ItemDTO> myitems= new ArrayList<>();

    @Override
    public int getCount() {
        return myitems.size();
    }

    @Override
    public Object getItem(int position) {
        return myitems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Context context = parent.getContext();
        if(convertView==null){
            LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.custom_item,parent,false);
        }
        ImageView item_imageView = (ImageView) convertView.findViewById(R.id.item_imageView);
        TextView title = (TextView) convertView.findViewById(R.id.item_title);
        TextView writer= (TextView) convertView.findViewById(R.id.itme_writer);


        ItemDTO items = (ItemDTO) getItem(position);
        item_imageView.setImageDrawable(items.getIcon());
        title.setText(items.getTitle());
        writer.setText(items.getWriter());

        return convertView;
        }
        public void addItem(Drawable Icon, String title , String writer){
        ItemDTO item = new ItemDTO();
        item.setIcon(Icon);
        item.setTitle(title);
        item.setWriter(writer);
            myitems.add(item);
        }

    }

