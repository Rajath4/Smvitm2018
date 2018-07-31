package com.smvitm.rajath.smvitm.Adapter;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.smvitm.rajath.smvitm.Activity.EventDetailInfomationsActivity;
import com.smvitm.rajath.smvitm.R;
import com.smvitm.rajath.smvitm.Data.SmvitmEventsManegerMyData;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import com.smvitm.rajath.smvitm.Activity.*;
import com.smvitm.rajath.smvitm.Fragment.*;
import com.smvitm.rajath.smvitm.Adapter.*;
import com.smvitm.rajath.smvitm.Data.*;
/**
 * Created by rajath on 14-02-2018.
 */

public class NewRecycleViewAdapter extends RecyclerView.Adapter<NewRecycleViewAdapter.ViewHolder> {
    private static final String LOG_TAG = NewRecycleViewAdapter.class.getSimpleName();
    private ArrayList<SmvitmEventsManegerMyData> mItems;
    ItemListener mListener;
    Context context;
    public static int position;

    public NewRecycleViewAdapter(Activity context, ArrayList<SmvitmEventsManegerMyData> program , ItemListener listener){
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
                .inflate(R.layout.smvitm_event_card,parent,false);
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
        public SmvitmEventsManegerMyData pName;
        public TextView title;
        public TextView description;
        public ImageView imageView;
        View textContatainer;

        public ViewHolder(View itemView){
            super(itemView);
            itemView.setOnClickListener(this);
            //cardView = (CardView)itemView.findViewById(R.id.cvItem);
            title = (TextView) itemView.findViewById(R.id.title);
          //  description = (TextView) itemView.findViewById(R.id.description);
            imageView = (ImageView) itemView.findViewById(R.id.image);
            textContatainer = itemView.findViewById(R.id.textcontainer);

        }
        public void setData(SmvitmEventsManegerMyData pName){
            this.pName = pName;
            title.setText(pName.getTitle());
            //String des = pName.getDescription();
            //String shortDescription = des.substring(0, Math.min(des.length(), 100));
           // description.setText(shortDescription + "Read more..........");
            //Glide.with(context).load(pName.getImage_link()).into(imageView);
            Picasso.get().load(pName.getImage_link()).into(imageView);

        }

        @Override
        public void onClick(View v) {
            if (mListener != null){
                mListener.onItemClick(pName,getAdapterPosition());
            }




            Pair[] pair = new Pair[1];
            pair[0] = new Pair<View, String>(imageView, "logo_shared");

            ActivityOptions options = null;
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                options = ActivityOptions.makeSceneTransitionAnimation((Activity) context, pair);
            }
            Intent gotoDocotrInfo = new Intent(context,EventDetailInfomationsActivity.class);
            gotoDocotrInfo.putExtra("title",pName.getTitle());
            gotoDocotrInfo.putExtra("description",pName.getDescription());
            gotoDocotrInfo.putExtra("url",pName.getImage_link());
            context.startActivity(gotoDocotrInfo, options.toBundle());


        }
    }
    public interface ItemListener{
        void onItemClick(SmvitmEventsManegerMyData pName, int position);
    }

}
