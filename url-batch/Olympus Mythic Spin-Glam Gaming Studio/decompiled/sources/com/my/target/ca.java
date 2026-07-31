package com.my.target;

import com.my.target.ba;
import com.my.target.q1;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class ca implements ba, q1.a {
    private final k8 a;
    private final ba.a b;
    private int c;

    private ca(k8 k8Var, ba.a aVar) {
        this.a = k8Var;
        this.b = aVar;
    }

    public static ba a(k8 k8Var, ba.a aVar) {
        return new ca(k8Var, aVar);
    }

    @Override // com.my.target.ba
    public void a(q1 q1Var, int i) {
        this.c = i;
        this.b.a(this.a);
        q1Var.setBanner(this.a);
        q1Var.setListener(this);
    }

    @Override // com.my.target.ba
    public void a(q1 q1Var) {
        q1Var.setBanner(null);
        q1Var.setListener(null);
    }

    @Override // com.my.target.q1.a
    public void a(boolean z, int i, n2 n2Var) {
        this.b.a(this.a, z, this.c, i, n2Var);
    }
}
