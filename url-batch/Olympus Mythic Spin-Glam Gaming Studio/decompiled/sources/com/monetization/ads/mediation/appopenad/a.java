package com.monetization.ads.mediation.appopenad;

import android.content.Context;
import com.facebook.internal.NativeProtocol;
import com.monetization.ads.mediation.appopenad.MediatedAppOpenAdAdapter;
import com.monetization.ads.mediation.base.MediatedAdRequestError;
import java.lang.ref.WeakReference;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.reflect.KProperty;
import yads.bx0;
import yads.cd1;
import yads.ex0;
import yads.jg;
import yads.mx0;
import yads.qm2;
import yads.ra;
import yads.s41;
import yads.wn1;

/* loaded from: classes8.dex */
public final class a implements MediatedAppOpenAdAdapter.MediatedAppOpenAdAdapterListener {
    public static final /* synthetic */ KProperty[] e = {ra.a(a.class, "loadController", "getLoadController()Lcom/monetization/ads/fullscreen/FullScreenLoadController;", 0)};
    public final wn1 a;
    public final qm2 b;
    public WeakReference c = new WeakReference(null);
    public final s41 d;

    public a(jg jgVar, wn1 wn1Var) {
        this.a = wn1Var;
        this.b = new qm2(jgVar);
        this.d = new s41(wn1Var);
    }

    @Override // com.monetization.ads.mediation.appopenad.MediatedAppOpenAdAdapter.MediatedAppOpenAdAdapterListener
    public final void onAdImpression() {
        mx0 mx0Var;
        if (this.a.d() || (mx0Var = (mx0) this.c.get()) == null) {
            return;
        }
        this.a.b(MapsKt.emptyMap());
        mx0Var.a(this.d.a());
    }

    @Override // com.monetization.ads.mediation.appopenad.MediatedAppOpenAdAdapter.MediatedAppOpenAdAdapterListener
    public final void onAppOpenAdClicked() {
        mx0 mx0Var = (mx0) this.c.get();
        if (mx0Var != null) {
            mx0Var.f();
            this.a.a(MapsKt.emptyMap());
        }
    }

    @Override // com.monetization.ads.mediation.appopenad.MediatedAppOpenAdAdapter.MediatedAppOpenAdAdapterListener
    public final void onAppOpenAdDismissed() {
        mx0 mx0Var = (mx0) this.c.get();
        if (mx0Var != null) {
            mx0Var.i.a(cd1.c, mx0Var);
            ex0 ex0Var = mx0Var.l;
            if (ex0Var != null) {
                ex0Var.onAdDismissed();
            }
        }
    }

    @Override // com.monetization.ads.mediation.appopenad.MediatedAppOpenAdAdapter.MediatedAppOpenAdAdapterListener
    public final void onAppOpenAdFailedToLoad(MediatedAdRequestError mediatedAdRequestError) {
        int code = mediatedAdRequestError.getCode();
        String description = mediatedAdRequestError.getDescription();
        mediatedAdRequestError.getDescription();
        wn1 wn1Var = this.a;
        wn1Var.a();
        wn1Var.b();
        wn1Var.a(wn1Var.n, MapsKt.mutableMapOf(TuplesKt.to("status", "error"), TuplesKt.to("error_code", Integer.valueOf(code)), TuplesKt.to(NativeProtocol.BRIDGE_ARG_ERROR_DESCRIPTION, description)));
        Context context = wn1Var.n;
        wn1Var.a(context);
        wn1Var.a(context, this);
    }

    @Override // com.monetization.ads.mediation.appopenad.MediatedAppOpenAdAdapter.MediatedAppOpenAdAdapterListener
    public final void onAppOpenAdLoaded() {
        qm2 qm2Var = this.b;
        KProperty kProperty = e[0];
        bx0 bx0Var = (bx0) qm2Var.a.get();
        if (bx0Var != null) {
            this.a.c(MapsKt.emptyMap());
            bx0Var.g();
        }
    }

    @Override // com.monetization.ads.mediation.appopenad.MediatedAppOpenAdAdapter.MediatedAppOpenAdAdapterListener
    public final void onAppOpenAdShown() {
        mx0 mx0Var;
        mx0 mx0Var2 = (mx0) this.c.get();
        if (mx0Var2 != null) {
            ex0 ex0Var = mx0Var2.l;
            if (ex0Var != null) {
                ex0Var.onAdShown();
            }
            this.a.c();
        }
        if (!this.a.d() || (mx0Var = (mx0) this.c.get()) == null) {
            return;
        }
        this.a.b(MapsKt.emptyMap());
        mx0Var.a(this.d.a());
    }
}
