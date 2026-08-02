package com.neptunesoft.gestionbacdz.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.neptunesoft.gestionbacdz.R;
import com.neptunesoft.gestionbacdz.classobjects.Avg;
import java.util.List;

/* loaded from: classes.dex */
public class AdapterAvg extends RecyclerView.Adapter {
    private final List list;
    private ItemClickListener mClickListener;

    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }

    public AdapterAvg(List list) {
        this.list = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new AvgsHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_avg, parent, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        String str;
        Avg avg = (Avg) this.list.get(position);
        AvgsHolder avgsHolder = (AvgsHolder) holder;
        if (avg.getTriple() == 1) {
            str = "الثلاثي الأول | المعدل : ";
        } else if (avg.getTriple() == 2) {
            str = "الثلاثي الثاني | المعدل : ";
        } else {
            str = "الثلاثي الثالث | المعدل : ";
        }
        avgsHolder.txtTripleAvg.setText(str + avg.getAvg());
        avgsHolder.txtAvgFullName.setText("الإسم : " + avg.getFull_name());
        if (avg.isDark()) {
            if (avg.getAvg() < 10.0d) {
                avgsHolder.imgItemAvg.setImageResource(R.drawable.ic_lessthan_dark);
                return;
            } else if (avg.getAvg() == 10.0d) {
                avgsHolder.imgItemAvg.setImageResource(R.drawable.ic_equa_dark);
                return;
            } else {
                avgsHolder.imgItemAvg.setImageResource(R.drawable.ic_greaterthan_dark);
                return;
            }
        }
        if (avg.getAvg() < 10.0d) {
            avgsHolder.imgItemAvg.setImageResource(R.drawable.ic_lessthan);
        } else if (avg.getAvg() == 10.0d) {
            avgsHolder.imgItemAvg.setImageResource(R.drawable.ic_equal);
        } else {
            avgsHolder.imgItemAvg.setImageResource(R.drawable.ic_greaterthan);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.list.size();
    }

    public class AvgsHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imgItemAvg;
        TextView txtAvgFullName;
        TextView txtTripleAvg;

        AvgsHolder(View itemView) {
            super(itemView);
            this.txtTripleAvg = (TextView) itemView.findViewById(R.id.txtTripleAvg);
            this.txtAvgFullName = (TextView) itemView.findViewById(R.id.txtAvgFullName);
            this.imgItemAvg = (ImageView) itemView.findViewById(R.id.imgItemAvg);
            itemView.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (AdapterAvg.this.mClickListener != null) {
                AdapterAvg.this.mClickListener.onItemClick(view, getAdapterPosition());
            }
        }
    }

    public void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }
}
