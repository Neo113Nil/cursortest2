package com.monetization.ads.mediation.banner;

import android.content.Context;
import android.view.View;
import com.facebook.internal.NativeProtocol;
import com.monetization.ads.mediation.banner.MediatedBannerAdapter;
import com.monetization.ads.mediation.base.MediatedAdRequestError;
import com.monetization.ads.mediation.base.MediatedAdapterInfo;
import com.monetization.ads.mediation.base.model.MediatedAdObject;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import yads.er1;
import yads.fl;
import yads.fo2;
import yads.il;
import yads.jl;
import yads.kl;
import yads.km;
import yads.ob1;
import yads.qm2;
import yads.r7;
import yads.ra;
import yads.s41;
import yads.so1;
import yads.tn1;
import yads.vm;
import yads.wn1;
import yads.y7;
import yads.zo1;

/* loaded from: classes15.dex */
public final class a implements MediatedBannerAdapter.MediatedBannerAdapterListener {
    public static final /* synthetic */ KProperty[] g = {ra.a(a.class, "loadController", "getLoadController()Lcom/monetization/ads/banner/BannerAdLoadController;", 0), ra.a(a.class, "adQualityVerifierController", "getAdQualityVerifierController()Lcom/monetization/ads/base/quality/AdQualityVerifierController;", 0)};
    public final wn1 a;
    public final zo1 b;
    public final s41 c;
    public final qm2 d;
    public final qm2 e;
    public boolean f;

    public a(fl flVar, km kmVar, wn1 wn1Var, zo1 zo1Var) {
        s41 s41Var = new s41(wn1Var);
        this.a = wn1Var;
        this.b = zo1Var;
        this.c = s41Var;
        this.d = new qm2(flVar);
        this.e = new qm2(kmVar.d);
    }

    public final void a(View view) {
        qm2 qm2Var = this.d;
        KProperty[] kPropertyArr = g;
        KProperty kProperty = kPropertyArr[0];
        fl flVar = (fl) qm2Var.a.get();
        if (flVar != null) {
            Context context = view.getContext();
            if (this.f) {
                wn1 wn1Var = this.a;
                tn1 tn1Var = wn1Var.o;
                if (tn1Var != null) {
                    Map mapOf = MapsKt.mapOf(TuplesKt.to("status", "success"));
                    er1 er1Var = tn1Var.b;
                    String networkName = tn1Var.c.b().getNetworkName();
                    so1 so1Var = wn1Var.f;
                    so1Var.getClass();
                    so1Var.a(context, fo2.d, er1Var, networkName, mapOf);
                }
            } else {
                this.f = true;
                this.a.c(MapsKt.emptyMap());
            }
            il ilVar = new il(this);
            qm2 qm2Var2 = this.e;
            KProperty kProperty2 = kPropertyArr[1];
            r7 r7Var = (r7) qm2Var2.a.get();
            if (r7Var != null && r7Var.b()) {
                ((y7) r7Var.h.getValue()).onAdDisplayed();
            }
            this.b.a(view, ilVar);
            flVar.g();
        }
    }

    @Override // com.monetization.ads.mediation.banner.MediatedBannerAdapter.MediatedBannerAdapterListener
    public final void onAdClicked() {
        qm2 qm2Var = this.e;
        KProperty[] kPropertyArr = g;
        KProperty kProperty = kPropertyArr[1];
        r7 r7Var = (r7) qm2Var.a.get();
        if (r7Var != null && r7Var.b()) {
            ((y7) r7Var.h.getValue()).onAdClicked();
        }
        qm2 qm2Var2 = this.d;
        KProperty kProperty2 = kPropertyArr[0];
        fl flVar = (fl) qm2Var2.a.get();
        if (flVar != null) {
            flVar.E.c();
        }
        this.a.a(MapsKt.emptyMap());
    }

    @Override // com.monetization.ads.mediation.banner.MediatedBannerAdapter.MediatedBannerAdapterListener
    public final void onAdFailedToLoad(MediatedAdRequestError mediatedAdRequestError) {
        int code = mediatedAdRequestError.getCode();
        String description = mediatedAdRequestError.getDescription();
        mediatedAdRequestError.getDescription();
        if (!this.f) {
            wn1 wn1Var = this.a;
            wn1Var.a();
            wn1Var.b();
            wn1Var.a(wn1Var.n, MapsKt.mutableMapOf(TuplesKt.to("status", "error"), TuplesKt.to("error_code", Integer.valueOf(code)), TuplesKt.to(NativeProtocol.BRIDGE_ARG_ERROR_DESCRIPTION, description)));
            Context context = wn1Var.n;
            wn1Var.a(context);
            wn1Var.a(context, this);
            return;
        }
        wn1 wn1Var2 = this.a;
        wn1Var2.a();
        Context context2 = wn1Var2.n;
        tn1 tn1Var = wn1Var2.o;
        if (tn1Var != null) {
            Map mapOf = MapsKt.mapOf(TuplesKt.to("status", "error"), TuplesKt.to("error_code", Integer.valueOf(code)));
            er1 er1Var = tn1Var.b;
            String networkName = tn1Var.c.b().getNetworkName();
            so1 so1Var = wn1Var2.f;
            so1Var.getClass();
            so1Var.a(context2, fo2.d, er1Var, networkName, mapOf);
        }
        Context context3 = wn1Var2.n;
        wn1Var2.a(context3);
        wn1Var2.a(context3, this);
    }

    @Override // com.monetization.ads.mediation.banner.MediatedBannerAdapter.MediatedBannerAdapterListener
    public final void onAdImpression() {
        if (this.a.d()) {
            return;
        }
        qm2 qm2Var = this.d;
        KProperty kProperty = g[0];
        fl flVar = (fl) qm2Var.a.get();
        if (flVar != null) {
            this.a.b(MapsKt.emptyMap());
            flVar.E.a(this.c.a());
        }
    }

    @Override // com.monetization.ads.mediation.banner.MediatedBannerAdapter.MediatedBannerAdapterListener
    public final void onAdLoaded(View view) {
        MediatedAdapterInfo b;
        qm2 qm2Var = this.d;
        KProperty kProperty = g[0];
        fl flVar = (fl) qm2Var.a.get();
        if (flVar != null) {
            tn1 tn1Var = this.a.o;
            String str = null;
            MediatedAdObject a = tn1Var != null ? tn1Var.c.a() : null;
            if (a == null) {
                boolean z = ob1.a;
                a(view);
                return;
            }
            tn1 tn1Var2 = this.a.o;
            if (tn1Var2 != null && (b = tn1Var2.c.b()) != null) {
                str = b.getNetworkName();
            }
            BuildersKt__Builders_commonKt.launch$default(flVar.e, null, null, new vm(flVar, a.getAd(), str, a.getInfo(), this.a.o, new kl(this), new jl(this, view), null), 3, null);
        }
    }
}
