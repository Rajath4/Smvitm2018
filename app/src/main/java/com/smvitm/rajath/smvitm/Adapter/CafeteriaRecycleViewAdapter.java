package com.smvitm.rajath.smvitm.Adapter;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.smvitm.rajath.smvitm.Data.MyCafeteriaBean;
import com.smvitm.rajath.smvitm.R;

import java.util.ArrayList;

/**
 * Created by rajath on 14-02-2018.
 */

import com.smvitm.rajath.smvitm.Activity.*;
import com.smvitm.rajath.smvitm.Fragment.*;
import com.smvitm.rajath.smvitm.Adapter.*;
import com.smvitm.rajath.smvitm.Data.*;

public class CafeteriaRecycleViewAdapter extends RecyclerView.Adapter<CafeteriaRecycleViewAdapter.ViewHolder> {
    private static final String LOG_TAG = CafeteriaRecycleViewAdapter.class.getSimpleName();
    private ArrayList<MyCafeteriaBean> mItems;
    ItemListener mListener;
    Context context;
    public static int position;
    int screen;


    public CafeteriaRecycleViewAdapter(Activity context, ArrayList<MyCafeteriaBean> program , ItemListener listener){
        this.context = context;
        mItems = program;
        mListener = listener;
    }

    public void setOnItemClickListener(ItemListener listener){
        mListener = listener;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.smvitm_cafeteria_list_item,parent,false);
        context = parent.getContext();
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.setData(mItems.get(position));
    }

    @Override
    public int getItemCount() {
        if (mItems != null){
            return mItems.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
       // public CardView cardView;
        public MyCafeteriaBean pName;
        public TextView tv,tv1,tv2;
        ImageView a;
        View textContatainer;

        public ViewHolder(View itemView){
            super(itemView);
            itemView.setOnClickListener(this);
            //cardView = (CardView)itemView.findViewById(R.id.cvItem);
            tv = (TextView)itemView.findViewById(R.id.textView);
            tv1 = (TextView)itemView.findViewById(R.id.textView1);
            tv2 = (TextView)itemView.findViewById(R.id.textView2);
            a = (ImageView)itemView.findViewById(R.id.aa);
            textContatainer = itemView.findViewById(R.id.textcontainer);

        }
        public void setData(MyCafeteriaBean pName){
            this.pName = pName;
            String ItemName = pName.getName();
            String SerialNo = pName.getId();
            String  Cosst = pName.getPhno();
            int res;
           /* if (ItemName.equalsIgnoreCase("Cafe")){
                screen = R.mipmap.smvitm_cafeteria;

                res = screen;
                a.setImageResource(res);


                tv.setText("");
                tv1.setText("");
                tv2.setText("");
            }else if (ItemName.equalsIgnoreCase("CLG_bus")){
                screen = R.drawable.clgbus;

                res = screen;
                a.setImageResource(res);


                tv.setText("");
                tv1.setText("");
                tv2.setText("");
            }
            else {
                res = 0;
                a.setImageResource(res);*/


                tv.setText(SerialNo);
                tv1.setText(ItemName);
                tv2.setText(Cosst);
           // }

        }

        @Override
        public void onClick(View v) {
            if (mListener != null){
                mListener.onItemClick(pName,getAdapterPosition());
            }







        }
    }
    public interface ItemListener{
        void onItemClick(MyCafeteriaBean pName, int position);
    }

}
