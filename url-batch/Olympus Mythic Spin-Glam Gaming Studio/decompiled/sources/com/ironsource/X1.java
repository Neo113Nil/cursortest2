package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.p;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public interface X1 {

    public static final class a implements X1 {

        @Nullable
        private final JSONObject a;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.ironsource.X1
        @NotNull
        public com.ironsource.mediationsdk.demandOnly.p a(@NotNull String instanceId) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            JSONObject jSONObject = this.a;
            JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject(instanceId) : null;
            String optString = optJSONObject != null ? optJSONObject.optString("plumbus") : null;
            return optString != null ? new p.a(optString) : new p.b();
        }

        public a(@Nullable JSONObject jSONObject) {
            this.a = jSONObject;
        }

        public /* synthetic */ a(JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? IronSourceNetworkBridge.jsonObjectInit() : jSONObject);
        }
    }

    @NotNull
    com.ironsource.mediationsdk.demandOnly.p a(@NotNull String str);
}
