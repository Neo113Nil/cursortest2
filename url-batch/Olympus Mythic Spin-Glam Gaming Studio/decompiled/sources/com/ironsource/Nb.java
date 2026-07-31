package com.ironsource;

import com.ironsource.sdk.controller.f;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class Nb {

    @NotNull
    public static final a d = new a(null);

    @NotNull
    private final String a;

    @NotNull
    private final String b;

    @Nullable
    private final JSONObject c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Nb a(@NotNull String jsonStr) throws JSONException {
            Intrinsics.checkNotNullParameter(jsonStr, "jsonStr");
            JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(jsonStr);
            String adId = jsonObjectInit.getString("adId");
            String command = jsonObjectInit.getString(f.b.g);
            JSONObject optJSONObject = jsonObjectInit.optJSONObject("params");
            Intrinsics.checkNotNullExpressionValue(adId, "adId");
            Intrinsics.checkNotNullExpressionValue(command, "command");
            return new Nb(adId, command, optJSONObject);
        }

        private a() {
        }
    }

    public Nb(@NotNull String adId, @NotNull String command, @Nullable JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(command, "command");
        this.a = adId;
        this.b = command;
        this.c = jSONObject;
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    @NotNull
    public final String b() {
        return this.b;
    }

    @Nullable
    public final JSONObject c() {
        return this.c;
    }

    @NotNull
    public final String d() {
        return this.a;
    }

    @NotNull
    public final String e() {
        return this.b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Nb)) {
            return false;
        }
        Nb nb = (Nb) obj;
        return Intrinsics.areEqual(this.a, nb.a) && Intrinsics.areEqual(this.b, nb.b) && Intrinsics.areEqual(this.c, nb.c);
    }

    @Nullable
    public final JSONObject f() {
        return this.c;
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        JSONObject jSONObject = this.c;
        return hashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    @NotNull
    public String toString() {
        return "MessageToNative(adId=" + this.a + ", command=" + this.b + ", params=" + this.c + ")";
    }

    @NotNull
    public final Nb a(@NotNull String adId, @NotNull String command, @Nullable JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(command, "command");
        return new Nb(adId, command, jSONObject);
    }

    public static /* synthetic */ Nb a(Nb nb, String str, String str2, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nb.a;
        }
        if ((i & 2) != 0) {
            str2 = nb.b;
        }
        if ((i & 4) != 0) {
            jSONObject = nb.c;
        }
        return nb.a(str, str2, jSONObject);
    }

    @NotNull
    public static final Nb a(@NotNull String str) throws JSONException {
        return d.a(str);
    }
}
