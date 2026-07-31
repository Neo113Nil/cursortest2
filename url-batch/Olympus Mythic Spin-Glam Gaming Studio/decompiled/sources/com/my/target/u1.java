package com.my.target;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.my.target.s1;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public final class u1 extends RecyclerView.Adapter {
    private List a = new ArrayList();
    private final s1.a b;

    public u1(s1.a aVar) {
        this.b = aVar;
    }

    public void a(List list) {
        this.a = list;
        for (int i = 0; i < this.a.size(); i++) {
            notifyItemChanged(i, list.get(i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(v1 v1Var, int i) {
        v1Var.a((k8) this.a.get(i), this.b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public v1 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new v1(new s1(viewGroup.getContext()));
    }
}
