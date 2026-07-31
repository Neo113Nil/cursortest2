package com.monetization.ads.mediation.interstitial;

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
import kotlin.reflect.KProperty;
import yads.fo1;
import yads.fo2;
import yads.km;
import yads.mx0;
import yads.ob1;
import yads.qm2;
import yads.r7;
import yads.so1;
import yads.t8;
import yads.tn1;
import yads.wn1;
import yads.xw0;
import yads.y7;

/* loaded from: classes14.dex */
public final class c implements xw0 {
    public final km a;
    public final wn1 b;
    public final b c;
    public final a d;
    public final so1 e;
    public final fo1 f;

    public c(km kmVar, wn1 wn1Var, b bVar, a aVar, so1 so1Var, fo1 fo1Var) {
        this.a = kmVar;
        this.b = wn1Var;
        this.c = bVar;
        this.d = aVar;
        this.e = so1Var;
        this.f = fo1Var;
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
        this.f.a();
        this.a.d.a();
        this.b.a(context);
    }

    @Override // yads.xw0
    public final void a(Context context, t8 t8Var) {
        this.b.a(context, this.d);
    }

    @Override // yads.xw0
    public final Object a(mx0 mx0Var, Activity activity) {
        Object m8023constructorimpl;
        tn1 tn1Var;
        try {
            Result.Companion companion = Result.INSTANCE;
            MediatedInterstitialAdapter mediatedInterstitialAdapter = this.c.a;
            if (mediatedInterstitialAdapter != null) {
                qm2 qm2Var = this.d.d;
                KProperty kProperty = a.g[0];
                qm2Var.getClass();
                qm2Var.a = new WeakReference(mx0Var);
                r7 r7Var = this.a.d;
                if (r7Var.b()) {
                    ((y7) r7Var.h.getValue()).onAdDisplayed();
                }
                this.f.a(activity);
                try {
                    mediatedInterstitialAdapter.showInterstitial(activity);
                } catch (Exception e) {
                    this.f.a();
                    throw e;
                }
            }
            m8023constructorimpl = Result.m8023constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
        if (m8026exceptionOrNullimpl != null && (tn1Var = this.b.o) != null) {
            Context applicationContext = activity.getApplicationContext();
            boolean z = ob1.a;
            this.e.a(applicationContext, fo2.e, tn1Var.b, tn1Var.c.b().getNetworkName(), MapsKt.mapOf(TuplesKt.to("reason", MapsKt.mapOf(TuplesKt.to("exception_in_adapter", m8026exceptionOrNullimpl.toString())))));
        }
        return m8023constructorimpl;
    }
}
