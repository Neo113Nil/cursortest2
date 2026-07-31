package yads;

import android.content.Context;
import com.facebook.internal.NativeProtocol;
import com.monetization.ads.mediation.base.MediatedAdRequestError;
import com.monetization.ads.mediation.base.MediatedAdapterInfo;
import com.monetization.ads.mediation.base.model.MediatedAdObject;
import com.monetization.ads.mediation.rewarded.MediatedReward;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapterListener;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes14.dex */
public final class or2 implements MediatedRewardedAdapterListener {
    public static final /* synthetic */ KProperty[] g = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(or2.class, "contentController", "getContentController()Lcom/monetization/ads/rewarded/content/RewardedAdContentController;", 0)), ra.a(or2.class, "loadController", "getLoadController()Lcom/monetization/ads/fullscreen/FullScreenLoadController;", 0), ra.a(or2.class, "adQualityVerifierController", "getAdQualityVerifierController()Lcom/monetization/ads/base/quality/AdQualityVerifierController;", 0)};
    public final wn1 a;
    public final fo1 b;
    public final s41 c;
    public final qm2 d;
    public final qm2 e;
    public final qm2 f;

    public or2(er2 er2Var, r7 r7Var, wn1 wn1Var, fo1 fo1Var) {
        s41 s41Var = new s41(wn1Var);
        this.a = wn1Var;
        this.b = fo1Var;
        this.c = s41Var;
        this.d = new qm2(null);
        this.e = new qm2(er2Var);
        this.f = new qm2(r7Var);
    }

    public final br2 a() {
        qm2 qm2Var = this.d;
        KProperty kProperty = g[0];
        return (br2) qm2Var.a.get();
    }

    @Override // com.monetization.ads.mediation.rewarded.MediatedRewardedAdapterListener
    public final void onAdImpression() {
        br2 a;
        if (this.a.d() || (a = a()) == null) {
            return;
        }
        this.a.b(MapsKt.emptyMap());
        a.a(this.c.a());
    }

    @Override // com.monetization.ads.mediation.rewarded.MediatedRewardedAdapterListener
    public final void onRewarded(MediatedReward mediatedReward) {
        Map emptyMap;
        sq2 sq2Var;
        MediatedAdapterInfo b;
        br2 a = a();
        if (a != null) {
            Context context = a.a;
            t8 t8Var = a.b;
            wn1 wn1Var = this.a;
            tn1 tn1Var = wn1Var.o;
            Boolean bool = null;
            er1 er1Var = tn1Var != null ? tn1Var.b : null;
            if (er1Var != null) {
                so1 so1Var = wn1Var.f;
                String networkName = (tn1Var == null || (b = tn1Var.c.b()) == null) ? null : b.getNetworkName();
                so1Var.f.getClass();
                if (t8Var != null && (sq2Var = t8Var.r) != null) {
                    bool = Boolean.valueOf(sq2Var.b);
                }
                if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                    emptyMap = MapsKt.mapOf(TuplesKt.to("rewarding_side", "server_side"));
                } else if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
                    emptyMap = MapsKt.mapOf(TuplesKt.to("rewarding_side", "client_side"));
                } else {
                    if (bool != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    emptyMap = MapsKt.emptyMap();
                }
                so1Var.a(context, fo2.w, er1Var, networkName, MapsKt.mapOf(TuplesKt.to("reward_info", emptyMap)));
            }
            a.g();
        }
    }

    @Override // com.monetization.ads.mediation.rewarded.MediatedRewardedAdapterListener
    public final void onRewardedAdClicked() {
        br2 a = a();
        if (a != null) {
            a.f();
            qm2 qm2Var = this.f;
            KProperty kProperty = g[2];
            r7 r7Var = (r7) qm2Var.a.get();
            if (r7Var != null && r7Var.b()) {
                ((y7) r7Var.h.getValue()).onAdClicked();
            }
            this.a.a(MapsKt.emptyMap());
        }
    }

    @Override // com.monetization.ads.mediation.rewarded.MediatedRewardedAdapterListener
    public final void onRewardedAdDismissed() {
        this.b.a();
        br2 a = a();
        if (a != null) {
            a.i.a(cd1.c, a);
            ex0 ex0Var = a.l;
            if (ex0Var != null) {
                ex0Var.onAdDismissed();
            }
        }
        qm2 qm2Var = this.f;
        KProperty kProperty = g[2];
        r7 r7Var = (r7) qm2Var.a.get();
        if (r7Var == null || !r7Var.b()) {
            return;
        }
        ((y7) r7Var.h.getValue()).onAdClosed();
        r7Var.a();
    }

    @Override // com.monetization.ads.mediation.rewarded.MediatedRewardedAdapterListener
    public final void onRewardedAdFailedToLoad(MediatedAdRequestError mediatedAdRequestError) {
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

    @Override // com.monetization.ads.mediation.rewarded.MediatedRewardedAdapterListener
    public final void onRewardedAdLoaded() {
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
                BuildersKt__Builders_commonKt.launch$default(bx0Var.e, null, null, new vm(bx0Var, a.getAd(), networkName, a.getInfo(), this.a.o, new nr2(this), new mr2(this), null), 3, null);
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

    @Override // com.monetization.ads.mediation.rewarded.MediatedRewardedAdapterListener
    public final void onRewardedAdShown() {
        br2 a;
        br2 a2 = a();
        if (a2 != null) {
            ex0 ex0Var = a2.l;
            if (ex0Var != null) {
                ex0Var.onAdShown();
            }
            this.a.c();
        }
        if (!this.a.d() || (a = a()) == null) {
            return;
        }
        this.a.b(MapsKt.emptyMap());
        a.a(this.c.a());
    }
}
