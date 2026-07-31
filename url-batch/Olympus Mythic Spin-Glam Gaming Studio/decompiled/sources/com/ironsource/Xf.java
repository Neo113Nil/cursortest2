package com.ironsource;

import android.app.Activity;
import android.content.Context;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class Xf {

    @NotNull
    public static final Xf a = new Xf();

    private Xf() {
    }

    @Nullable
    public final String a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return E1.a(context, c(context));
    }

    @Nullable
    public final String b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return E1.b(context, c(context));
    }

    @Nullable
    public final String c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return E1.g(context);
    }

    @NotNull
    public final ConcurrentHashMap<String, List<String>> d() {
        ConcurrentHashMap<String, List<String>> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.putAll(com.ironsource.mediationsdk.c.b().d());
        concurrentHashMap.putAll(C4770ma.b().c());
        return concurrentHashMap;
    }

    public final void e() {
        com.ironsource.mediationsdk.p.h().H();
    }

    @NotNull
    public final JSONObject a(boolean z) {
        JSONObject b = IronSourceUtils.b(z);
        Intrinsics.checkNotNullExpressionValue(b, "getMediationAdditionalData(isDemandOnlyMode)");
        return b;
    }

    @NotNull
    public final JSONObject b() {
        JSONObject b = L6.a().b();
        Intrinsics.checkNotNullExpressionValue(b, "getProperties().toJSON()");
        return b;
    }

    @NotNull
    public final JSONObject c() {
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            ConcurrentHashMap<String, AdapterBaseWrapper> networkAdaptersMap = com.ironsource.mediationsdk.c.b().e();
            Intrinsics.checkNotNullExpressionValue(networkAdaptersMap, "networkAdaptersMap");
            for (Map.Entry<String, AdapterBaseWrapper> entry : networkAdaptersMap.entrySet()) {
                if (entry.getValue().getAdapterBaseInterface() != null) {
                    Xf xf = a;
                    String key = entry.getKey();
                    Intrinsics.checkNotNullExpressionValue(key, "entry.key");
                    String a2 = xf.a(key);
                    AdapterBaseInterface adapterBaseInterface = entry.getValue().getAdapterBaseInterface();
                    Intrinsics.checkNotNullExpressionValue(adapterBaseInterface, "entry.value.adapterBaseInterface");
                    String adapterVersion = adapterBaseInterface.getAdapterVersion();
                    Intrinsics.checkNotNullExpressionValue(adapterVersion, "adapterBaseInterface.adapterVersion");
                    jsonObjectInit.putOpt(a2, xf.a(adapterVersion, adapterBaseInterface.getNetworkSDKVersion()));
                }
            }
        } catch (Exception e) {
            C4782n4.d().a(e);
        }
        return jsonObjectInit;
    }

    public final void a(@Nullable InterfaceC4646fb interfaceC4646fb) {
        C4607d8.a().b(interfaceC4646fb);
    }

    @NotNull
    public final LevelPlayAdSize b(@Nullable String str, int i, int i2) {
        if (str != null && str.length() != 0 && !Intrinsics.areEqual(str, com.ironsource.mediationsdk.j.f)) {
            if (Intrinsics.areEqual(str, com.ironsource.mediationsdk.j.c)) {
                return LevelPlayAdSize.MEDIUM_RECTANGLE;
            }
            return LevelPlayAdSize.Companion.createAdSize$mediationsdk_release(str);
        }
        return LevelPlayAdSize.Companion.createCustomSize(i, i2);
    }

    public final void a(@Nullable InterfaceC4860rb interfaceC4860rb) {
        Nd.a().b(interfaceC4860rb);
    }

    public final void a(@Nullable Ba ba) {
        C4963x2.a().b(ba);
    }

    public final int a() {
        return Kb.u.d().a().c();
    }

    @NotNull
    public final String a(@Nullable C4684hd c4684hd) {
        String c;
        return (c4684hd == null || (c = c4684hd.c()) == null) ? new String() : c;
    }

    @NotNull
    public final String a(@NotNull NetworkSettings networkSettings) {
        Intrinsics.checkNotNullParameter(networkSettings, "networkSettings");
        String providerDefaultInstance = networkSettings.getProviderDefaultInstance();
        return providerDefaultInstance == null ? new String() : providerDefaultInstance;
    }

    public final boolean a(@NotNull NetworkSettings networkSettings, @NotNull IronSource.a adUnit) {
        Intrinsics.checkNotNullParameter(networkSettings, "networkSettings");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        return networkSettings.isBidder(adUnit);
    }

    @NotNull
    public final ISBannerSize a(@Nullable String str, int i, int i2) {
        return new ISBannerSize(str, i, i2);
    }

    @NotNull
    public final com.ironsource.mediationsdk.o a(@NotNull Activity activity, @NotNull ISBannerSize size) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(size, "size");
        com.ironsource.mediationsdk.o b = com.ironsource.mediationsdk.p.h().b(activity, size);
        Intrinsics.checkNotNullExpressionValue(b, "getInstance().createBanner(activity, size)");
        return b;
    }

    public final void a(@NotNull EnumC4984y5 event, @NotNull JSONObject data) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(data, "data");
        C4685he.i().a(new C4966x5(event, data));
    }

    private final JSONObject a(String str, String str2) {
        return new JSONObject(MapsKt.mapOf(TuplesKt.to(Qf.b, str), TuplesKt.to("sdkVersion", str2)));
    }

    public final void b(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        IronLog.INTERNAL.error(message);
    }

    @NotNull
    public final String a(@NotNull String key) {
        String str;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            if (!StringsKt.contains$default((CharSequence) key, (CharSequence) "-", false, 2, (Object) null)) {
                if (!StringsKt.contains$default((CharSequence) key, (CharSequence) "_", false, 2, (Object) null)) {
                    return key;
                }
                str = (String) CollectionsKt.first(StringsKt.split$default((CharSequence) key, new String[]{"_"}, false, 0, 6, (Object) null));
            } else {
                String str2 = (String) CollectionsKt.last(StringsKt.split$default((CharSequence) key, new String[]{"-"}, false, 0, 6, (Object) null));
                if (!StringsKt.contains$default((CharSequence) str2, (CharSequence) "_", false, 2, (Object) null)) {
                    return str2;
                }
                str = (String) CollectionsKt.first(StringsKt.split$default((CharSequence) str2, new String[]{"_"}, false, 0, 6, (Object) null));
            }
            return str;
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronLog.INTERNAL.error(e.getMessage());
            return key;
        }
    }
}
