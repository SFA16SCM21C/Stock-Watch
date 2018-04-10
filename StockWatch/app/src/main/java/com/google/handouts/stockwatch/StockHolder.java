package com.google.handouts.stockwatch;

/**
 * Created by admin on 3/10/2017.
 */
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class StockHolder extends RecyclerView.ViewHolder{
    public TextView name;
    public TextView symbol;
    public TextView price;
    public TextView change;

    public StockHolder(View itemView) {
        super(itemView);
        name = (TextView) itemView.findViewById(R.id.name);
        symbol = (TextView) itemView.findViewById(R.id.symbol);
        change = (TextView) itemView.findViewById(R.id.change);
        price = (TextView) itemView.findViewById(R.id.price);
    }
}
