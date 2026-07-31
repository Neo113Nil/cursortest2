package com.ironsource;

import android.text.TextUtils;
import com.ironsource.AbstractC4692i3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: com.ironsource.ac, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4548ac extends AbstractC4692i3<C4629ec, AdapterAdListener> implements R0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4548ac(@Nullable List<? extends NetworkSettings> list, @NotNull Rb configs, @Nullable String str, @NotNull C4770ma publisherDataHolder, @Nullable C4573ba c4573ba) {
        super(new C4575bc(str, list, configs), publisherDataHolder, c4573ba);
        Intrinsics.checkNotNullParameter(configs, "configs");
        Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
    }

    @Override // com.ironsource.AbstractC4692i3
    protected void D() {
    }

    @Override // com.ironsource.AbstractC4692i3
    protected boolean E() {
        return false;
    }

    public final void J() {
        C4865rg c4865rg;
        int intValue;
        C5008zb c5008zb;
        IronLog.INTERNAL.verbose();
        try {
            C4629ec c4629ec = (C4629ec) this.a.d();
            if (c4629ec != null) {
                Integer r = c4629ec.r();
                if (r == null) {
                    intValue = this.C.a(this.o.b());
                } else {
                    Intrinsics.checkNotNullExpressionValue(r, "it.sessionDepth ?: sessi…epth(mManagerData.adUnit)");
                    intValue = r.intValue();
                }
                F0 f0 = this.s;
                if (f0 != null && (c5008zb = f0.f) != null) {
                    c5008zb.a(intValue);
                }
                c4629ec.P();
                this.a.a(null);
                this.a.b(null);
            }
            this.i = null;
            a(AbstractC4692i3.f.NONE);
        } catch (Throwable th) {
            C4782n4.d().a(th);
            String str = "destroyNativeAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(b(str));
            F0 f02 = this.s;
            if (f02 == null || (c4865rg = f02.j) == null) {
                return;
            }
            c4865rg.g(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.AbstractC4692i3
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C4629ec a(@NotNull NetworkSettings providerSettings, @NotNull BaseAdAdapter<?, AdapterAdListener> adapter, int i, @NotNull String currentAuctionId, @NotNull C4834q2 item) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(currentAuctionId, "currentAuctionId");
        Intrinsics.checkNotNullParameter(item, "item");
        return new C4629ec(this, new C4778n0(IronSource.a.NATIVE_AD, this.o.o(), i, this.g, currentAuctionId, this.e, this.f, providerSettings, this.o.n()), adapter, this.i, item, this);
    }

    @Override // com.ironsource.AbstractC4692i3
    @NotNull
    protected L0 d() {
        return new C4676h5();
    }

    @Override // com.ironsource.AbstractC4692i3
    @NotNull
    protected String i() {
        return "NA";
    }

    @Override // com.ironsource.AbstractC4692i3
    @NotNull
    protected String l() {
        return IronSourceConstants.OPW_NT_MANAGER_NAME;
    }

    @Override // com.ironsource.AbstractC4692i3
    protected boolean s() {
        return false;
    }

    public final void a(@Nullable C4684hd c4684hd) {
        String format;
        int b;
        IronLog.INTERNAL.verbose("placement = " + c4684hd);
        if (c4684hd == null || TextUtils.isEmpty(c4684hd.c())) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            format = String.format("can't load native ad - %s", Arrays.copyOf(new Object[]{c4684hd == null ? "placement is null" : "placement name is empty"}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            b = B0.b(this.o.b());
        } else if (this.E.c(ContextProvider.getInstance().getApplicationContext(), c4684hd, this.o.b())) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            format = String.format("placement %s is capped", Arrays.copyOf(new Object[]{c4684hd.c()}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            b = B0.f(this.o.b());
        } else {
            format = null;
            b = 510;
        }
        if (TextUtils.isEmpty(format)) {
            this.i = c4684hd;
            x();
        } else {
            IronLog.API.error(b(format));
            a(b, format, false);
        }
    }

    @Override // com.ironsource.AbstractC4692i3
    @NotNull
    protected JSONObject b(@NotNull NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        JSONObject nativeAdSettings = providerSettings.getNativeAdSettings();
        Intrinsics.checkNotNullExpressionValue(nativeAdSettings, "providerSettings.nativeAdSettings");
        return nativeAdSettings;
    }

    public final void a(@NotNull InternalNativeAdListener nativeAdListener) {
        Intrinsics.checkNotNullParameter(nativeAdListener, "nativeAdListener");
        a(new Zb(nativeAdListener));
    }

    @Override // com.ironsource.AbstractC4692i3
    protected void a(@Nullable AbstractC4709j3<?> abstractC4709j3, @Nullable AdInfo adInfo) {
        if (abstractC4709j3 instanceof C4629ec) {
            C4629ec c4629ec = (C4629ec) abstractC4709j3;
            this.t.a(c4629ec.Q(), c4629ec.R(), adInfo);
        }
    }

    @Override // com.ironsource.AbstractC4692i3
    protected void a(@Nullable IronSourceError ironSourceError) {
        this.t.a(ironSourceError);
    }

    @Override // com.ironsource.AbstractC4692i3, com.ironsource.E0
    @NotNull
    public Map<String, Object> a(@NotNull C0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Map<String, Object> data = super.a(event);
        C4684hd c4684hd = this.i;
        if (c4684hd != null) {
            Intrinsics.checkNotNullExpressionValue(data, "data");
            data.put("placement", c4684hd.c());
        }
        UUID uuid = this.w;
        if (uuid != null) {
            Intrinsics.checkNotNullExpressionValue(data, "data");
            data.put("objectId", uuid);
        }
        Intrinsics.checkNotNullExpressionValue(data, "data");
        return data;
    }
}
