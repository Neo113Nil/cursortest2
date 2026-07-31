package com.my.target;

import androidx.recyclerview.widget.RecyclerView;
import com.my.target.s1;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public final class v1 extends RecyclerView.ViewHolder {
    private final s1 a;

    v1(s1 s1Var) {
        super(s1Var.a());
        this.a = s1Var;
    }

    public void a(k8 k8Var, s1.a aVar) {
        this.a.setCard(k8Var);
        this.a.setOnClickListeners(aVar);
    }
}
