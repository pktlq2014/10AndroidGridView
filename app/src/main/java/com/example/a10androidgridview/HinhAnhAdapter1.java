package com.example.a10androidgridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class HinhAnhAdapter1 extends BaseAdapter
{
    private ArrayList<HinhAnh1> arrayList;
    private Context context;

    public HinhAnhAdapter1(ArrayList<HinhAnh1> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    private class viewHolder
    {
        ImageView imageView1;
        TextView textView1;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        viewHolder viewHolder;
        if(convertView == null)
        {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.dong_hinh_anh, null);
            viewHolder = new viewHolder();
            viewHolder.textView1 = convertView.findViewById(R.id.textView1);
            viewHolder.imageView1 = convertView.findViewById(R.id.imageView1);
            convertView.setTag(viewHolder);
        }
        else
        {
            viewHolder = (HinhAnhAdapter1.viewHolder) convertView.getTag();
        }
        HinhAnh1 hinhAnh1 = arrayList.get(position);
        viewHolder.textView1.setText(hinhAnh1.getTen());
        Glide.with(context).load(arrayList.get(position)
                .getUrlHinh())
                .centerCrop()
                .placeholder(R.mipmap.baseline_cloud_upload_black_18dp)
                .error(R.mipmap.baseline_error_black_18dp)
                .into(viewHolder.imageView1);
        return convertView;
    }
}
