package com.ironsource;

import android.app.Activity;
import com.ironsource.AbstractC4709j3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Arrays;
import java.util.Map;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.ec, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4629ec extends AbstractC4709j3<R0> implements NativeAdListener, E0 {

    @Nullable
    private AdapterNativeAdData r;

    @Nullable
    private AdapterNativeAdViewBinder s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4629ec(@NotNull InterfaceC4862rd threadInterface, @NotNull C4778n0 adSmashData, @Nullable BaseAdAdapter<?, AdapterAdListener> baseAdAdapter, @Nullable C4684hd c4684hd, @NotNull C4834q2 item, @Nullable R0 r0) {
        super(threadInterface, adSmashData, baseAdAdapter, new C4618e1(adSmashData.g(), adSmashData.g().getNativeAdSettings(), IronSource.a.NATIVE_AD), item, r0);
        Intrinsics.checkNotNullParameter(threadInterface, "threadInterface");
        Intrinsics.checkNotNullParameter(adSmashData, "adSmashData");
        Intrinsics.checkNotNullParameter(item, "item");
        this.g = c4684hd;
    }

    private final void J() {
        C4865rg c4865rg;
        IronLog.INTERNAL.verbose(d());
        if (y()) {
            super.onAdOpened();
            return;
        }
        if (this.e != AbstractC4709j3.h.FAILED) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("unexpected onAdOpened for %s, state - %s", Arrays.copyOf(new Object[]{k(), this.e}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            F0 f0 = this.d;
            if (f0 == null || (c4865rg = f0.j) == null) {
                return;
            }
            c4865rg.q(format);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4629ec this$0, AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder nativeAdViewBinder) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adapterNativeAdData, "$adapterNativeAdData");
        Intrinsics.checkNotNullParameter(nativeAdViewBinder, "$nativeAdViewBinder");
        this$0.a(adapterNativeAdData, nativeAdViewBinder);
    }

    @Override // com.ironsource.AbstractC4709j3
    protected void G() {
        C4865rg c4865rg;
        if (!(this.c instanceof AdapterNativeAdInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterNativeAdInterface"));
            return;
        }
        if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            IronLog.INTERNAL.error(a("activity must not be null"));
            F0 f0 = this.d;
            if (f0 == null || (c4865rg = f0.j) == null) {
                return;
            }
            c4865rg.g("activity must not be null");
            return;
        }
        Object obj = this.c;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener>");
        AdData mCurrentAdData = this.k;
        Intrinsics.checkNotNullExpressionValue(mCurrentAdData, "mCurrentAdData");
        Activity currentActiveActivity = ContextProvider.getInstance().getCurrentActiveActivity();
        Intrinsics.checkNotNullExpressionValue(currentActiveActivity, "getInstance().currentActiveActivity");
        ((AdapterNativeAdInterface) obj).loadAd(mCurrentAdData, currentActiveActivity, this);
    }

    public final void P() {
        C4865rg c4865rg;
        C5008zb c5008zb;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(k());
        a(AbstractC4709j3.h.NONE);
        Object obj = this.c;
        if (obj == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            if (obj instanceof AdapterNativeAdInterface) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<*>");
                AdData mCurrentAdData = this.k;
                Intrinsics.checkNotNullExpressionValue(mCurrentAdData, "mCurrentAdData");
                ((AdapterNativeAdInterface) obj).destroyAd(mCurrentAdData);
            } else {
                ironLog.error(a("adapter not instance of AdapterNativeAdInterface"));
            }
        } catch (Throwable th) {
            C4782n4.d().a(th);
            String str = "destroyNativeAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str));
            F0 f0 = this.d;
            if (f0 != null && (c4865rg = f0.j) != null) {
                c4865rg.g(str);
            }
        }
        F0 f02 = this.d;
        if (f02 == null || (c5008zb = f02.f) == null) {
            return;
        }
        Integer sessionDepth = r();
        Intrinsics.checkNotNullExpressionValue(sessionDepth, "sessionDepth");
        c5008zb.a(sessionDepth.intValue());
    }

    @Nullable
    public final AdapterNativeAdData Q() {
        return this.r;
    }

    @Nullable
    public final AdapterNativeAdViewBinder R() {
        return this.s;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener
    public void onAdLoadSuccess(@NotNull final AdapterNativeAdData adapterNativeAdData, @NotNull final AdapterNativeAdViewBinder nativeAdViewBinder) {
        Intrinsics.checkNotNullParameter(adapterNativeAdData, "adapterNativeAdData");
        Intrinsics.checkNotNullParameter(nativeAdViewBinder, "nativeAdViewBinder");
        if (u().c()) {
            u().a(new Runnable() { // from class: com.ironsource.ec$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    C4629ec.a(C4629ec.this, adapterNativeAdData, nativeAdViewBinder);
                }
            });
        } else {
            a(adapterNativeAdData, nativeAdViewBinder);
        }
    }

    @Override // com.ironsource.AbstractC4709j3, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        if (u().c()) {
            u().a(new Runnable() { // from class: com.ironsource.ec$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    C4629ec.a(C4629ec.this);
                }
            });
        } else {
            J();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdShowFailed(int i, @Nullable String str) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    private final void a(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
        this.r = adapterNativeAdData;
        this.s = adapterNativeAdViewBinder;
        super.onAdLoadSuccess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4629ec this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.J();
    }

    @Override // com.ironsource.AbstractC4709j3, com.ironsource.E0
    @NotNull
    public Map<String, Object> a(@NotNull C0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Map<String, Object> data = super.a(event);
        if (this.g != null) {
            Intrinsics.checkNotNullExpressionValue(data, "data");
            data.put("placement", j());
        }
        Intrinsics.checkNotNullExpressionValue(data, "data");
        return data;
    }
}
