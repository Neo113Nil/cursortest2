package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.unity3d.mediation.LevelPlay;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class O3 {

    @NotNull
    private final C4902u a;

    @NotNull
    private final C4902u b;

    @NotNull
    private final T2 c;

    @NotNull
    private final Sb d;

    @NotNull
    private final B1 e;

    @NotNull
    private final Map<LevelPlay.AdFormat, C4902u> f;

    public O3(@NotNull JSONObject configurations) {
        Intrinsics.checkNotNullParameter(configurations, "configurations");
        C4902u c4902u = new C4902u(a(configurations, "rewarded"));
        this.a = c4902u;
        C4902u c4902u2 = new C4902u(a(configurations, "interstitial"));
        this.b = c4902u2;
        this.c = new T2(a(configurations, "banner"));
        this.d = new Sb(a(configurations, "nativeAd"));
        JSONObject optJSONObject = configurations.optJSONObject("application");
        this.e = new B1(optJSONObject == null ? IronSourceNetworkBridge.jsonObjectInit() : optJSONObject);
        this.f = MapsKt.mapOf(TuplesKt.to(LevelPlay.AdFormat.INTERSTITIAL, c4902u2), TuplesKt.to(LevelPlay.AdFormat.REWARDED, c4902u));
    }

    @NotNull
    public final Map<LevelPlay.AdFormat, C4902u> a() {
        return this.f;
    }

    @NotNull
    public final B1 b() {
        return this.e;
    }

    @NotNull
    public final T2 c() {
        return this.c;
    }

    @NotNull
    public final Sb d() {
        return this.d;
    }

    private final JSONObject a(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject("adFormats");
        JSONObject optJSONObject2 = optJSONObject != null ? optJSONObject.optJSONObject(str) : null;
        return optJSONObject2 == null ? IronSourceNetworkBridge.jsonObjectInit() : optJSONObject2;
    }
}
