package com.ironsource;

import com.ironsource.X3;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class Z6 implements V6 {

    @NotNull
    private final JSONObject a;

    public static final class a {
        public static final boolean b = false;
        public static final int d = 24;

        @NotNull
        public static final a a = new a();
        private static final int c = EnumC4543a7.SendEvent.b();

        private a() {
        }

        public final int a() {
            return c;
        }
    }

    public Z6(@Nullable JSONObject jSONObject) {
        this.a = jSONObject == null ? IronSourceNetworkBridge.jsonObjectInit() : jSONObject;
    }

    @Override // com.ironsource.V6
    public long a() {
        return this.a.optInt("timeout", 24) * 1000;
    }

    @Override // com.ironsource.U5
    public boolean b() {
        return this.a.optBoolean(com.ironsource.mediationsdk.metadata.a.k, false);
    }

    @Override // com.ironsource.V6
    @NotNull
    public EnumC4543a7 c() {
        return EnumC4543a7.b.a(this.a.optInt(X3.f.e, a.a.a()));
    }
}
