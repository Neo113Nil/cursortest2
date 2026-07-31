package com.my.target;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.my.target.ka;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class bh extends RecyclerView.Adapter {
    private List a = new ArrayList();
    private final ka.a b;

    public bh(ka.a aVar) {
        this.b = aVar;
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
    public void onBindViewHolder(dh dhVar, int i) {
        ng ngVar = (ng) this.a.get(i);
        if (ngVar.a().y() != null) {
            dhVar.a(ngVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public dh onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new dh(new eh(viewGroup.getContext()), this.b);
    }
}
