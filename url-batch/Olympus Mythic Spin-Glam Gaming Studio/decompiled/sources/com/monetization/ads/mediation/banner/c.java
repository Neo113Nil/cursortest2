package com.monetization.ads.mediation.banner;

import android.app.Activity;
import android.content.Context;
import java.util.List;
import kotlin.collections.CollectionsKt;
import yads.fl;
import yads.gc2;
import yads.go1;
import yads.h1;
import yads.km;
import yads.lo1;
import yads.ml;
import yads.mo1;
import yads.ob1;
import yads.so1;
import yads.t8;
import yads.uo1;
import yads.up1;
import yads.v3;
import yads.vq1;
import yads.wn1;
import yads.wo1;
import yads.wp1;
import yads.yu2;
import yads.zo1;

/* loaded from: classes15.dex */
public final class c implements ml {
    public final t8 a;
    public final a b;
    public final wn1 c;

    public c(Context context, fl flVar, km kmVar, t8 t8Var, vq1 vq1Var) {
        this.a = t8Var;
        v3 v3Var = kmVar.b;
        yu2 yu2Var = kmVar.c;
        wo1 wo1Var = new wo1(v3Var);
        so1 so1Var = new so1(v3Var, yu2Var, t8Var);
        lo1 lo1Var = new lo1(so1Var);
        uo1 uo1Var = new uo1(new go1(vq1Var.b, wo1Var, so1Var, new mo1(lo1Var, new up1(lo1Var, new wp1())), 16));
        wn1 wn1Var = new wn1(context, v3Var, yu2Var, t8Var, kmVar.a, new b(), so1Var, uo1Var, new gc2(flVar, vq1Var));
        this.c = wn1Var;
        this.b = new a(flVar, kmVar, wn1Var, new zo1(flVar.D, kmVar.b.d.a));
    }

    @Override // yads.ml
    public final String a() {
        return null;
    }

    @Override // yads.ml
    public final List b() {
        return CollectionsKt.emptyList();
    }

    @Override // yads.ml
    public final String c() {
        return this.a.e;
    }

    @Override // yads.ml
    public final String getAdInfo() {
        return this.a.c;
    }

    @Override // yads.ml
    public final void a(Context context) {
        this.c.a(context);
    }

    @Override // yads.ml
    public final void a(Context context, t8 t8Var) {
        Activity a = h1.a();
        if (a != null) {
            boolean z = ob1.a;
        }
        if (a != null) {
            context = a;
        }
        this.c.a(context, this.b);
    }
}
