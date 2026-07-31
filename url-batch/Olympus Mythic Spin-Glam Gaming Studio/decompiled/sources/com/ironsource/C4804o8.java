package com.ironsource;

import com.ironsource.InterfaceC4786n8;
import com.ironsource.X3;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: com.ironsource.o8, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4804o8 implements InterfaceC4786n8, InterfaceC4786n8.a {

    @NotNull
    private JSONObject a = IronSourceNetworkBridge.jsonObjectInit();

    @NotNull
    private JSONObject b = IronSourceNetworkBridge.jsonObjectInit();

    @NotNull
    private JSONObject c = IronSourceNetworkBridge.jsonObjectInit();

    private final Object e(String str) {
        if (this.c.has(str)) {
            return this.c.get(str);
        }
        if (this.b.has(str)) {
            return this.b.get(str);
        }
        if (this.a.has(str)) {
            return this.a.get(str);
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC4786n8
    @Nullable
    public JSONObject a(@NotNull String configKey) {
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        Object e = e(configKey);
        if (e instanceof JSONObject) {
            return (JSONObject) e;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC4786n8
    @Nullable
    public Integer b(@NotNull String configKey) {
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        Object e = e(configKey);
        if (e instanceof Integer) {
            return (Integer) e;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC4786n8
    @Nullable
    public Boolean c(@NotNull String configKey) {
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        Object e = e(configKey);
        if (e instanceof Boolean) {
            return (Boolean) e;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC4786n8
    @Nullable
    public String d(@NotNull String configKey) {
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        Object e = e(configKey);
        if (e instanceof String) {
            return (String) e;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC4786n8.a
    public void a(@NotNull JSONObject controllerConfig) {
        Intrinsics.checkNotNullParameter(controllerConfig, "controllerConfig");
        this.a = controllerConfig;
        JSONObject optJSONObject = controllerConfig.optJSONObject(X3.a.b);
        if (optJSONObject == null) {
            optJSONObject = IronSourceNetworkBridge.jsonObjectInit();
        }
        this.b = optJSONObject;
        JSONObject optJSONObject2 = this.a.optJSONObject(X3.a.c);
        if (optJSONObject2 == null) {
            optJSONObject2 = IronSourceNetworkBridge.jsonObjectInit();
        }
        this.c = optJSONObject2;
    }
}
