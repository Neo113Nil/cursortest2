package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: com.ironsource.xe, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4975xe {

    @NotNull
    private final We a;

    @NotNull
    private final Gd b;

    @NotNull
    private final Kd c;

    @NotNull
    private final O3 d;

    @NotNull
    private final N5 e;

    public C4975xe(@NotNull We fullResponse) {
        Intrinsics.checkNotNullParameter(fullResponse, "fullResponse");
        this.a = fullResponse;
        JSONObject optJSONObject = fullResponse.j().optJSONObject(C4993ye.a);
        this.b = new Gd(optJSONObject == null ? IronSourceNetworkBridge.jsonObjectInit() : optJSONObject);
        JSONObject optJSONObject2 = fullResponse.j().optJSONObject(C4993ye.b);
        this.c = new Kd(optJSONObject2 == null ? IronSourceNetworkBridge.jsonObjectInit() : optJSONObject2);
        JSONObject optJSONObject3 = fullResponse.j().optJSONObject("configurations");
        this.d = new O3(optJSONObject3 == null ? IronSourceNetworkBridge.jsonObjectInit() : optJSONObject3);
        JSONObject optJSONObject4 = fullResponse.j().optJSONObject(C4993ye.d);
        this.e = new N5(optJSONObject4 == null ? IronSourceNetworkBridge.jsonObjectInit() : optJSONObject4);
    }

    @NotNull
    public final O3 a() {
        return this.d;
    }

    @NotNull
    public final N5 b() {
        return this.e;
    }

    @NotNull
    public final We c() {
        return this.a;
    }

    @NotNull
    public final Gd d() {
        return this.b;
    }

    @NotNull
    public final Kd e() {
        return this.c;
    }
}
