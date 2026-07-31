package com.ironsource;

import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes13.dex */
public final class B2 extends B implements BannerAdListener {

    @Nullable
    private FrameLayout.LayoutParams A;

    @Nullable
    private View z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B2(@NotNull V0 adTools, @NotNull C instanceData, @NotNull I adInstancePayload, @NotNull D2 listener) {
        super(adTools, instanceData, adInstancePayload, null, null, 24, null);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        Intrinsics.checkNotNullParameter(listener, "listener");
        a(listener);
    }

    private final D2 K() {
        F s = s();
        if (s instanceof D2) {
            return (D2) s;
        }
        return null;
    }

    private final ISBannerSize L() {
        V0 f = f();
        AbstractC4961x0 j = n().j();
        Intrinsics.checkNotNull(j, "null cannot be cast to non-null type com.unity3d.mediation.internal.ads.controllers.adunits.data.BannerAdUnitData");
        return f.a(((M2) j).b().i());
    }

    private final void M() {
        C4684hd j = j();
        if (j != null) {
            f().f().a().f(j.c());
        }
        D2 K = K();
        if (K != null) {
            K.a(this);
        }
    }

    private final void N() {
        C4684hd j = j();
        if (j != null) {
            f().f().a().c(j.c());
        }
        D2 K = K();
        if (K != null) {
            K.b(this);
        }
    }

    private final void O() {
        C4684hd j = j();
        if (j != null) {
            f().f().a().h(j.c());
        }
        D2 K = K();
        if (K != null) {
            K.c(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(B2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.O();
    }

    @Override // com.ironsource.B
    protected void C() {
        if (!(g() instanceof AdapterBannerInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterBannerInterface"));
            return;
        }
        AdData i = i();
        ISBannerSize L = L();
        Map<String, Object> adUnitData = i.getAdUnitData();
        Intrinsics.checkNotNullExpressionValue(adUnitData, "adData.adUnitData");
        adUnitData.put(K2.t, new com.ironsource.mediationsdk.o(ContextProvider.getInstance().getApplicationContext(), L));
        Object g = g();
        Intrinsics.checkNotNull(g, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
        ((AdapterBannerInterface) g).loadAd(i, ContextProvider.getInstance().getCurrentActiveActivity(), L, this);
    }

    @Override // com.ironsource.B
    public void a(@NotNull K adInstancePresenter) {
        Intrinsics.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        adInstancePresenter.a(this);
    }

    @Override // com.ironsource.B
    public void b() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(q());
        C4936vb.a(f(), new Runnable() { // from class: com.ironsource.B2$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                B2.a(B2.this);
            }
        }, 0L, 2, null);
        if (g() == null) {
            ironLog.warning("adapter == null");
        } else {
            c();
            super.b();
        }
    }

    @Override // com.ironsource.B
    public void c() {
        try {
            if (g() instanceof AdapterBannerInterface) {
                Object g = g();
                Intrinsics.checkNotNull(g, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface<*>");
                ((AdapterBannerInterface) g).destroyAd(i());
            } else {
                IronLog.INTERNAL.error(a("adapter not instance of AdapterBannerInterface"));
            }
        } catch (Throwable th) {
            C4782n4.d().a(th);
            String str = "destroyBanner - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str));
            f().f().h().g(str);
        }
    }

    @Override // com.ironsource.B
    @NotNull
    public LevelPlayAdInfo e() {
        String uuid = n().j().b().b().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "instanceData.adUnitData.…roperties.adId.toString()");
        String c = n().j().b().c();
        String aVar = n().i().toString();
        Intrinsics.checkNotNullExpressionValue(aVar, "instanceData.adFormat.toString()");
        C4834q2 o = n().o();
        AbstractC4961x0 j = n().j();
        Intrinsics.checkNotNull(j, "null cannot be cast to non-null type com.unity3d.mediation.internal.ads.controllers.adunits.data.BannerAdUnitData");
        return new LevelPlayAdInfo(uuid, c, aVar, o, ((M2) j).b().i(), n().j().l(), MapsKt.toMap(l()));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLeftApplication() {
        a(new Runnable() { // from class: com.ironsource.B2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                B2.b(B2.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLoadSuccess(@NotNull View adView, @NotNull FrameLayout.LayoutParams frameLayoutParams) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(frameLayoutParams, "frameLayoutParams");
        onAdLoadSuccess(adView, frameLayoutParams, new LinkedHashMap());
    }

    @Override // com.ironsource.B, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened(@NotNull final Map<String, Object> extraData) {
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        a(new Runnable() { // from class: com.ironsource.B2$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                B2.a(B2.this, extraData);
            }
        });
        super.onAdOpened(extraData);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenDismissed() {
        a(new Runnable() { // from class: com.ironsource.B2$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                B2.c(B2.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenPresented() {
        a(new Runnable() { // from class: com.ironsource.B2$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                B2.d(B2.this);
            }
        });
    }

    public final void a(@NotNull final Fg viewBinder) {
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        C4936vb.a(f(), new Runnable() { // from class: com.ironsource.B2$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                B2.a(B2.this, viewBinder);
            }
        }, 0L, 2, null);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLoadSuccess(@NotNull final View adView, @NotNull final FrameLayout.LayoutParams frameLayoutParams, @NotNull Map<String, Object> extraData) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(frameLayoutParams, "frameLayoutParams");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        C4936vb.a(f(), new Runnable() { // from class: com.ironsource.B2$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                B2.a(B2.this, adView, frameLayoutParams);
            }
        }, 0L, 2, null);
        super.onAdLoadSuccess(extraData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final B2 this$0, Fg viewBinder) {
        FrameLayout.LayoutParams layoutParams;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(viewBinder, "$viewBinder");
        View view = this$0.z;
        if (view == null || (layoutParams = this$0.A) == null) {
            return;
        }
        viewBinder.a(view, layoutParams, this$0.f());
        IronLog.INTERNAL.verbose(C4814p0.a(this$0.f(), "Bind banner view", (String) null, 2, (Object) null));
        this$0.f().c(new Runnable() { // from class: com.ironsource.B2$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                B2.e(B2.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(B2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.z = null;
        this$0.A = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(B2 this$0, View adView, FrameLayout.LayoutParams frameLayoutParams) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adView, "$adView");
        Intrinsics.checkNotNullParameter(frameLayoutParams, "$frameLayoutParams");
        this$0.z = adView;
        this$0.A = frameLayoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(B2 this$0) {
        String str;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        O a = this$0.f().f().a();
        C4684hd j = this$0.j();
        if (j == null || (str = j.c()) == null) {
            str = "";
        }
        a.j(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(B2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(B2 this$0, Map extraData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(extraData, "$extraData");
        this$0.l().putAll(extraData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(B2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.M();
    }
}
