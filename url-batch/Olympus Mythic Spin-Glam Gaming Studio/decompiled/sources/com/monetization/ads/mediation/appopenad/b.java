package com.monetization.ads.mediation.appopenad;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import yads.fo2;
import yads.mx0;
import yads.ob1;
import yads.so1;
import yads.t8;
import yads.tn1;
import yads.wn1;
import yads.xw0;

/* loaded from: classes8.dex */
public final class b implements xw0 {
    public final wn1 a;
    public final c b;
    public final a c;
    public final so1 d;

    public b(wn1 wn1Var, c cVar, a aVar, so1 so1Var) {
        this.a = wn1Var;
        this.b = cVar;
        this.c = aVar;
        this.d = so1Var;
    }

    @Override // yads.xw0
    public final /* bridge */ String a() {
        return null;
    }

    @Override // yads.xw0
    public final List b() {
        return CollectionsKt.emptyList();
    }

    @Override // yads.xw0
    public final /* bridge */ String getAdInfo() {
        return null;
    }

    @Override // yads.xw0
    public final void a(Context context) {
        this.a.a(context);
    }

    @Override // yads.xw0
    public final void a(Context context, t8 t8Var) {
        this.a.a(context, this.c);
    }

    @Override // yads.xw0
    public final Object a(mx0 mx0Var, Activity activity) {
        Object m8023constructorimpl;
        tn1 tn1Var;
        try {
            Result.Companion companion = Result.INSTANCE;
            MediatedAppOpenAdAdapter mediatedAppOpenAdAdapter = this.b.a;
            if (mediatedAppOpenAdAdapter != null) {
                this.c.c = new WeakReference(mx0Var);
                mediatedAppOpenAdAdapter.showAppOpenAd(activity);
            }
            m8023constructorimpl = Result.m8023constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
        if (m8026exceptionOrNullimpl != null && (tn1Var = this.a.o) != null) {
            Context applicationContext = activity.getApplicationContext();
            boolean z = ob1.a;
            this.d.a(applicationContext, fo2.e, tn1Var.b, tn1Var.c.b().getNetworkName(), MapsKt.mapOf(TuplesKt.to("reason", MapsKt.mapOf(TuplesKt.to("exception_in_adapter", m8026exceptionOrNullimpl.toString())))));
        }
        return m8023constructorimpl;
    }
}
