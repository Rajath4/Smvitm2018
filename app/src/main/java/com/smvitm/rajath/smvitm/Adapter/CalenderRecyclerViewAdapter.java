package com.smvitm.rajath.smvitm.Adapter;

/**
 * Created by rajath on 07-02-2018.
 */

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import com.smvitm.rajath.smvitm.Data.MyCalenderBean;
import com.smvitm.rajath.smvitm.R;
import com.smvitm.rajath.smvitm.Activity.*;
import com.smvitm.rajath.smvitm.Fragment.*;
import com.smvitm.rajath.smvitm.Adapter.*;
import com.smvitm.rajath.smvitm.Data.*;
public class CalenderRecyclerViewAdapter extends RecyclerView.Adapter<CalenderRecyclerViewAdapter.ViewHolder> {
    private static final String LOG_TAG = CalenderRecyclerViewAdapter.class.getSimpleName();
    private ArrayList<MyCalenderBean> mItems;
    ItemListener mListener;
    Context context;
    public static int position;

    public CalenderRecyclerViewAdapter(Activity context, ArrayList<MyCalenderBean> program, ItemListener listener) {

        this.context = context;
        mItems = program;
        mListener = listener;
    }

    public void setOnItemClickListener(ItemListener listener) {
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.smvitm_holiday_list_item, parent, false);
        context = parent.getContext();
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.setData(mItems.get(position));
    }

    @Override
    public int getItemCount() {
        if (mItems != null) {
            return mItems.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public CardView cardView;
        public MyCalenderBean pName;
        TextView tv,tv1,tv2,tv3,tv4;
        TextView bg;
        View textContainer;
        ImageView profileicon;

        public ViewHolder(View itemView) {

            super(itemView);
            itemView.setOnClickListener(this);
            cardView = (CardView)itemView.findViewById(R.id.cvItem);
            textContainer = itemView.findViewById(R.id.text_container);
            tv = (TextView)itemView.findViewById(R.id.textView);
            tv1 = (TextView)itemView.findViewById(R.id.textView1);
            tv2 = (TextView)itemView.findViewById(R.id.textView2);
            tv3 = (TextView)itemView.findViewById(R.id.textView3);
            tv4 = (TextView)itemView.findViewById(R.id.textView4);

            bg = (TextView) itemView.findViewById(R.id.background);        }

        public void setData(MyCalenderBean pName) {
            this.pName = pName;

            String id = pName.getId();
            String month = pName.getMonth();
            String  date = pName.getDate();
            String day = pName.getDay();
            String info=pName.getInfo();


                if(info.equalsIgnoreCase("Info")){
                    tv4.setTextColor(Color.parseColor("#212121"));
                    bg.setBackgroundColor(Color.parseColor("#BDBDBD"));


                }else {
                    if(!info.equalsIgnoreCase("")) {
                        if(info.equalsIgnoreCase("3 - IA")){
                            bg.setBackgroundColor(Color.parseColor("#FFCCBC"));
                        }else if(info.equalsIgnoreCase("2 - IA")) {
                            bg.setBackgroundColor(Color.parseColor("#FFCCBC"));
                        }else if(info.equalsIgnoreCase("1 - IA")){
                            bg.setBackgroundColor(Color.parseColor("#FFCCBC"));
                        }else {
                            bg.setBackgroundColor(Color.parseColor("#EEEEEE"));
                        }
                    }else {
                        bg.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    }
                }





            tv.setText(id);
            tv1.setText(month);
            tv2.setText(date);
            tv3.setText(day);
            tv4.setText(info);


        }

        @Override
        public void onClick(View v) {
            if (mListener != null) {
                mListener.onItemClick(pName, getAdapterPosition());
            }




        }

    }

    public interface ItemListener {
        void onItemClick(MyCalenderBean pName, int position);
    }
}