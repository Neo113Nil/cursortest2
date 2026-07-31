package com.my.target;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class o1 extends RecyclerView.Adapter {
    private final List a;
    private final df b;

    public o1(List list, df dfVar) {
        this.a = list;
        this.b = dfVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(t1 t1Var, int i) {
        t1Var.a((ba) this.a.get(i), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public t1 onCreateViewHolder(ViewGroup viewGroup, int i) {
        q1 a = this.b.a();
        a.a().setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new t1(a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public boolean onFailedToRecycleView(t1 t1Var) {
        t1Var.a();
        return super.onFailedToRecycleView((o1) t1Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(t1 t1Var) {
        t1Var.a();
        super.onViewRecycled((o1) t1Var);
    }
}
