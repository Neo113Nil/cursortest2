package com.monetization.ads.mediation.interstitial;

import android.content.Context;
import com.facebook.internal.NativeProtocol;
import com.monetization.ads.mediation.base.MediatedAdRequestError;
import com.monetization.ads.mediation.base.MediatedAdapterInfo;
import com.monetization.ads.mediation.base.model.MediatedAdObject;
import com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import yads.bc1;
import yads.bx0;
import yads.cc1;
import yads.cd1;
import yads.ex0;
import yads.fo1;
import yads.km;
import yads.mx0;
import yads.ob1;
import yads.qm2;
import yads.r7;
import yads.ra;
import yads.s41;
import yads.tb1;
import yads.tn1;
import yads.vm;
import yads.wn1;
import yads.y7;

/* loaded from: classes14.dex */
public final class a implements MediatedInterstitialAdapter.MediatedInterstitialAdapterListener {
    public static final /* synthetic */ KProperty[] g = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(a.class, "contentController", "getContentController()Lcom/monetization/ads/fullscreen/FullscreenContentController;", 0)), ra.a(a.class, "loadController", "getLoadController()Lcom/monetization/ads/fullscreen/FullScreenLoadController;", 0), ra.a(a.class, "adQualityVerifierController", "getAdQualityVerifierController()Lcom/monetization/ads/base/quality/AdQualityVerifierController;", 0)};
    public final wn1 a;
    public final fo1 b;
    public final s41 c;
    public final qm2 d;
    public final qm2 e;
    public final qm2 f;

    public a(tb1 tb1Var, km kmVar, wn1 wn1Var, fo1 fo1Var) {
        s41 s41Var = new s41(wn1Var);
        this.a = wn1Var;
        this.b = fo1Var;
        this.c = s41Var;
        this.d = new qm2(null);
        this.e = new qm2(tb1Var);
        this.f = new qm2(kmVar.d);
    }

    @Override // com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter.MediatedInterstitialAdapterListener
    public final void onAdImpression() {
        if (this.a.d()) {
            return;
        }
        qm2 qm2Var = this.d;
        KProperty kProperty = g[0];
        mx0 mx0Var = (mx0) qm2Var.a.get();
        if (mx0Var != null) {
            this.a.b(MapsKt.emptyMap());
            mx0Var.a(this.c.a());
        }
    }

    @Override // com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter.MediatedInterstitialAdapterListener
    public final void onInterstitialClicked() {
        qm2 qm2Var = this.d;
        KProperty[] kPropertyArr = g;
        KProperty kProperty = kPropertyArr[0];
        mx0 mx0Var = (mx0) qm2Var.a.get();
        if (mx0Var != null) {
            mx0Var.f();
            qm2 qm2Var2 = this.f;
            KProperty kProperty2 = kPropertyArr[2];
            r7 r7Var = (r7) qm2Var2.a.get();
            if (r7Var != null && r7Var.b()) {
                ((y7) r7Var.h.getValue()).onAdClicked();
            }
            this.a.a(MapsKt.emptyMap());
        }
    }

    @Override // com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter.MediatedInterstitialAdapterListener
    public final void onInterstitialDismissed() {
        this.b.a();
        qm2 qm2Var = this.d;
        KProperty[] kPropertyArr = g;
        KProperty kProperty = kPropertyArr[0];
        mx0 mx0Var = (mx0) qm2Var.a.get();
        if (mx0Var != null) {
            mx0Var.i.a(cd1.c, mx0Var);
            ex0 ex0Var = mx0Var.l;
            if (ex0Var != null) {
                ex0Var.onAdDismissed();
            }
        }
        qm2 qm2Var2 = this.f;
        KProperty kProperty2 = kPropertyArr[2];
        r7 r7Var = (r7) qm2Var2.a.get();
        if (r7Var == null || !r7Var.b()) {
            return;
        }
        ((y7) r7Var.h.getValue()).onAdClosed();
        r7Var.a();
    }

    @Override // com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter.MediatedInterstitialAdapterListener
    public final void onInterstitialFailedToLoad(MediatedAdRequestError mediatedAdRequestError) {
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

    @Override // com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter.MediatedInterstitialAdapterListener
    public final void onInterstitialLoaded() {
        MediatedAdapterInfo b;
        qm2 qm2Var = this.e;
        KProperty[] kPropertyArr = g;
        KProperty kProperty = kPropertyArr[1];
        bx0 bx0Var = (bx0) qm2Var.a.get();
        if (bx0Var != null) {
            tn1 tn1Var = this.a.o;
            MediatedAdObject a = tn1Var != null ? tn1Var.c.a() : null;
            if (a != null) {
                tn1 tn1Var2 = this.a.o;
                String networkName = (tn1Var2 == null || (b = tn1Var2.c.b()) == null) ? null : b.getNetworkName();
                BuildersKt__Builders_commonKt.launch$default(bx0Var.e, null, null, new vm(bx0Var, a.getAd(), networkName, a.getInfo(), this.a.o, new cc1(this), new bc1(this), null), 3, null);
                return;
            }
            boolean z = ob1.a;
            qm2 qm2Var2 = this.e;
            KProperty kProperty2 = kPropertyArr[1];
            bx0 bx0Var2 = (bx0) qm2Var2.a.get();
            if (bx0Var2 != null) {
                this.a.c(MapsKt.emptyMap());
                bx0Var2.g();
            }
        }
    }

    @Override // com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter.MediatedInterstitialAdapterListener
    public final void onInterstitialShown() {
        qm2 qm2Var = this.d;
        KProperty[] kPropertyArr = g;
        KProperty kProperty = kPropertyArr[0];
        mx0 mx0Var = (mx0) qm2Var.a.get();
        if (mx0Var != null) {
            ex0 ex0Var = mx0Var.l;
            if (ex0Var != null) {
                ex0Var.onAdShown();
            }
            this.a.c();
        }
        if (this.a.d()) {
            qm2 qm2Var2 = this.d;
            KProperty kProperty2 = kPropertyArr[0];
            mx0 mx0Var2 = (mx0) qm2Var2.a.get();
            if (mx0Var2 != null) {
                this.a.b(MapsKt.emptyMap());
                mx0Var2.a(this.c.a());
            }
        }
    }
}
