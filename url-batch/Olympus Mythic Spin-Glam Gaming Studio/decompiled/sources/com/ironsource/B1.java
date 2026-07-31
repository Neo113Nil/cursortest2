package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class B1 {

    @NotNull
    private final Gb a;

    @NotNull
    private final I1 b;
    private final boolean c;

    @NotNull
    private final F1 d;

    @NotNull
    private final M1 e;

    @NotNull
    private final C4998z1 f;

    public B1(@NotNull JSONObject applicationConfigurations) {
        Intrinsics.checkNotNullParameter(applicationConfigurations, "applicationConfigurations");
        JSONObject optJSONObject = applicationConfigurations.optJSONObject(D1.a);
        this.a = new Gb(optJSONObject == null ? IronSourceNetworkBridge.jsonObjectInit() : optJSONObject);
        JSONObject optJSONObject2 = applicationConfigurations.optJSONObject("events");
        this.b = new I1(optJSONObject2 == null ? IronSourceNetworkBridge.jsonObjectInit() : optJSONObject2);
        this.c = applicationConfigurations.optBoolean(D1.g, false);
        JSONObject optJSONObject3 = applicationConfigurations.optJSONObject(D1.h);
        this.d = new F1(optJSONObject3 == null ? IronSourceNetworkBridge.jsonObjectInit() : optJSONObject3);
        JSONObject optJSONObject4 = applicationConfigurations.optJSONObject("settings");
        this.e = new M1(optJSONObject4 == null ? IronSourceNetworkBridge.jsonObjectInit() : optJSONObject4);
        JSONObject optJSONObject5 = applicationConfigurations.optJSONObject(D1.f);
        this.f = new C4998z1(optJSONObject5 == null ? IronSourceNetworkBridge.jsonObjectInit() : optJSONObject5);
    }

    @NotNull
    public final C4998z1 a() {
        return this.f;
    }

    @NotNull
    public final F1 b() {
        return this.d;
    }

    @NotNull
    public final I1 c() {
        return this.b;
    }

    @NotNull
    public final M1 d() {
        return this.e;
    }

    public final boolean e() {
        return this.c;
    }

    @NotNull
    public final Gb f() {
        return this.a;
    }
}
