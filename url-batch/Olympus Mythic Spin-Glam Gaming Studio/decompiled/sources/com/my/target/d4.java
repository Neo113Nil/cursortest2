package com.my.target;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes12.dex */
public class d4 extends RecyclerView.Adapter {
    private List a = new ArrayList();
    private final j9 b;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static class a extends RecyclerView.ViewHolder {
        private final y5 a;

        public a(y5 y5Var) {
            super(y5Var);
            this.a = y5Var;
        }

        public void a(e4 e4Var) {
            this.a.setBannerData(e4Var);
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static class b extends RecyclerView.ViewHolder {
        public final aj a;

        public b(aj ajVar) {
            super(ajVar);
            this.a = ajVar;
        }

        public void a(e4 e4Var) {
            this.a.setBannerData(e4Var);
        }
    }

    public d4(j9 j9Var) {
        this.b = j9Var;
    }

    public void a(List list) {
        this.a = list;
        for (int i = 0; i < this.a.size(); i++) {
            notifyItemChanged(i, this.a.get(i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return ((e4) this.a.get(i)).a().j0() != null ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        e4 e4Var = (e4) this.a.get(i);
        if (viewHolder instanceof b) {
            ((b) viewHolder).a(e4Var);
        } else {
            ((a) viewHolder).a(e4Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        g4 a2 = h4.a(this.b);
        return i == 1 ? new b(new aj(viewGroup.getContext(), a2)) : new a(new y5(viewGroup.getContext(), a2));
    }
}
