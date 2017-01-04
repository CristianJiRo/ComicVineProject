package com.example.kamelot.comicvineproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Kamelot on 04/01/2017.
 */

public class CustomAdapter extends BaseAdapter {

    private Context myContext;
    private LayoutInflater inflater;

    private List<Serie.ResultsBean> serieItem;

    //Constructor para las series.
    public CustomAdapter(Context context, List<Serie.ResultsBean> serieItem) {
        this.myContext = context;
        this.serieItem = serieItem;

    }

    @Override
    public int getCount() {
        return serieItem.size();
    }

    @Override
    public Object getItem(int position) {
        return serieItem.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View celdaView = inflater.inflate(R.layout.serie_celda, parent, false);

        Serie.ResultsBean celda = (Serie.ResultsBean) getItem(position);

        ImageView portada = (ImageView) celdaView.findViewById(R.id.iv_portada);
        TextView name = (TextView) celdaView.findViewById(R.id.tv_title);
        TextView count = (TextView) celdaView.findViewById(R.id.tv_countEpisodes);

        return celdaView;
    }
}
