package com.my.target;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
class t1 extends RecyclerView.ViewHolder {
    private final q1 a;
    private ba b;

    t1(q1 q1Var) {
        super(q1Var.a());
        this.a = q1Var;
    }

    void a(ba baVar, int i) {
        this.b = baVar;
        baVar.a(this.a, i);
    }

    void a() {
        ba baVar = this.b;
        if (baVar != null) {
            baVar.a(this.a);
        }
        this.b = null;
    }
}
