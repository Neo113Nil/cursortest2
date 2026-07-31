package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class K3 implements U5 {

    @NotNull
    private final JSONObject a;

    public static final class a {

        @NotNull
        public static final a a = new a();
        public static final boolean b = false;

        private a() {
        }
    }

    public K3(@Nullable JSONObject jSONObject) {
        this.a = jSONObject == null ? IronSourceNetworkBridge.jsonObjectInit() : jSONObject;
    }

    @Override // com.ironsource.U5
    public boolean b() {
        return this.a.optBoolean("clickCheck", false);
    }
}
