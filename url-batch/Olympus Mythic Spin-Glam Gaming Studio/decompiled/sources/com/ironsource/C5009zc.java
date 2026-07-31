package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: com.ironsource.zc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5009zc {

    @NotNull
    private final String a;

    @NotNull
    private final String b;

    @NotNull
    private final String c;

    @NotNull
    private final String d;

    @Nullable
    private final String e;

    @Nullable
    private final JSONObject f;

    @NotNull
    private final Map<String, JSONObject> g;

    @NotNull
    private final String h;

    @NotNull
    private final String i;
    private final boolean j;

    @Nullable
    private C5009zc k;

    @NotNull
    private final Lazy l;

    /* renamed from: com.ironsource.zc$a */
    static final class a extends Lambda implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NetworkSettings mo4828invoke() {
            String j = C5009zc.this.j();
            String l = C5009zc.this.l();
            String h = C5009zc.this.h();
            String k = C5009zc.this.k();
            JSONObject c = C5009zc.this.c();
            C5009zc c5009zc = C5009zc.this.k;
            JSONObject b = IronSourceUtils.b(c, c5009zc != null ? c5009zc.c() : null);
            JSONObject m = C5009zc.this.m();
            C5009zc c5009zc2 = C5009zc.this.k;
            JSONObject b2 = IronSourceUtils.b(m, c5009zc2 != null ? c5009zc2.m() : null);
            JSONObject e = C5009zc.this.e();
            C5009zc c5009zc3 = C5009zc.this.k;
            JSONObject b3 = IronSourceUtils.b(e, c5009zc3 != null ? c5009zc3.e() : null);
            JSONObject d = C5009zc.this.d();
            C5009zc c5009zc4 = C5009zc.this.k;
            JSONObject b4 = IronSourceUtils.b(d, c5009zc4 != null ? c5009zc4.d() : null);
            JSONObject g = C5009zc.this.g();
            C5009zc c5009zc5 = C5009zc.this.k;
            NetworkSettings networkSettings = new NetworkSettings(j, l, h, k, b, b2, b3, b4, IronSourceUtils.b(g, c5009zc5 != null ? c5009zc5.g() : null));
            networkSettings.setIsMultipleInstances(C5009zc.this.o());
            networkSettings.setSubProviderId(C5009zc.this.n());
            networkSettings.setAdSourceNameForEvents(C5009zc.this.b());
            return networkSettings;
        }
    }

    public C5009zc(@NotNull String providerName, @NotNull JSONObject networkSettings) {
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        Intrinsics.checkNotNullParameter(networkSettings, "networkSettings");
        this.a = providerName;
        this.b = providerName;
        String optString = networkSettings.optString(Ac.d, providerName);
        Intrinsics.checkNotNullExpressionValue(optString, "networkSettings.optStrin…,\n          providerName)");
        this.c = optString;
        String optString2 = networkSettings.optString(Ac.f, optString);
        Intrinsics.checkNotNullExpressionValue(optString2, "networkSettings.optStrin…roviderTypeForReflection)");
        this.d = optString2;
        Object opt = networkSettings.opt("providerNetworkKey");
        this.e = opt instanceof String ? (String) opt : null;
        this.f = networkSettings.optJSONObject("application");
        LevelPlay.AdFormat[] values = LevelPlay.AdFormat.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (LevelPlay.AdFormat adFormat : values) {
            arrayList.add(Jf.a(adFormat));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
        for (Object obj : arrayList) {
            String str = (String) obj;
            JSONObject optJSONObject = networkSettings.optJSONObject("adFormats");
            JSONObject optJSONObject2 = optJSONObject != null ? optJSONObject.optJSONObject(str) : null;
            if (optJSONObject2 == null) {
                optJSONObject2 = IronSourceNetworkBridge.jsonObjectInit();
            }
            linkedHashMap.put(obj, optJSONObject2);
        }
        this.g = linkedHashMap;
        String optString3 = networkSettings.optString("spId", "0");
        Intrinsics.checkNotNullExpressionValue(optString3, "networkSettings.optStrin…B_PROVIDER_ID_FIELD, \"0\")");
        this.h = optString3;
        String optString4 = networkSettings.optString(Ac.a);
        Intrinsics.checkNotNullExpressionValue(optString4, "networkSettings.optString(AD_SOURCE_NAME_FIELD)");
        this.i = optString4;
        this.j = networkSettings.optBoolean(Ac.c, false);
        this.l = LazyKt.lazy(new a());
    }

    @NotNull
    public final String b() {
        return this.i;
    }

    @Nullable
    public final JSONObject c() {
        return this.f;
    }

    @NotNull
    public final JSONObject d() {
        JSONObject b = IronSourceUtils.b(this.g.get("banner"), this.f);
        Intrinsics.checkNotNullExpressionValue(b, "mergeJsons(\n            …EY], applicationSettings)");
        return b;
    }

    @NotNull
    public final JSONObject e() {
        JSONObject b = IronSourceUtils.b(this.g.get("interstitial"), this.f);
        Intrinsics.checkNotNullExpressionValue(b, "mergeJsons(\n            …EY], applicationSettings)");
        return b;
    }

    @NotNull
    public final NetworkSettings f() {
        return (NetworkSettings) this.l.getValue();
    }

    @NotNull
    public final JSONObject g() {
        JSONObject b = IronSourceUtils.b(this.g.get("nativeAd"), this.f);
        Intrinsics.checkNotNullExpressionValue(b, "mergeJsons(\n            …EY], applicationSettings)");
        return b;
    }

    @NotNull
    public final String h() {
        return this.d;
    }

    @NotNull
    public final String i() {
        return this.b;
    }

    @NotNull
    public final String j() {
        return this.a;
    }

    @Nullable
    public final String k() {
        return this.e;
    }

    @NotNull
    public final String l() {
        return this.c;
    }

    @NotNull
    public final JSONObject m() {
        JSONObject b = IronSourceUtils.b(this.g.get("rewarded"), this.f);
        Intrinsics.checkNotNullExpressionValue(b, "mergeJsons(\n            …     applicationSettings)");
        return b;
    }

    @NotNull
    public final String n() {
        return this.h;
    }

    public final boolean o() {
        return this.j;
    }

    @NotNull
    public final Map<String, JSONObject> a() {
        return this.g;
    }

    public final void b(@Nullable C5009zc c5009zc) {
        this.k = c5009zc;
    }
}
