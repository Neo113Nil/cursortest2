package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class Cd {

    @Nullable
    private final JSONObject a;

    @Nullable
    private final JSONObject b;

    @Nullable
    private final JSONObject c;

    @Nullable
    private final JSONObject d;

    public Cd() {
        this(null, null, null, null, 15, null);
    }

    @Nullable
    public final JSONObject a() {
        return this.a;
    }

    @Nullable
    public final JSONObject b() {
        return this.b;
    }

    @Nullable
    public final JSONObject c() {
        return this.c;
    }

    @Nullable
    public final JSONObject d() {
        return this.d;
    }

    @Nullable
    public final JSONObject e() {
        return this.c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cd)) {
            return false;
        }
        Cd cd = (Cd) obj;
        return Intrinsics.areEqual(this.a, cd.a) && Intrinsics.areEqual(this.b, cd.b) && Intrinsics.areEqual(this.c, cd.c) && Intrinsics.areEqual(this.d, cd.d);
    }

    @Nullable
    public final JSONObject f() {
        return this.b;
    }

    @Nullable
    public final JSONObject g() {
        return this.d;
    }

    @Nullable
    public final JSONObject h() {
        return this.a;
    }

    public int hashCode() {
        JSONObject jSONObject = this.a;
        int hashCode = (jSONObject == null ? 0 : jSONObject.hashCode()) * 31;
        JSONObject jSONObject2 = this.b;
        int hashCode2 = (hashCode + (jSONObject2 == null ? 0 : jSONObject2.hashCode())) * 31;
        JSONObject jSONObject3 = this.c;
        int hashCode3 = (hashCode2 + (jSONObject3 == null ? 0 : jSONObject3.hashCode())) * 31;
        JSONObject jSONObject4 = this.d;
        return hashCode3 + (jSONObject4 != null ? jSONObject4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ProviderConfig2(rewarded=" + this.a + ", interstitial=" + this.b + ", banner=" + this.c + ", nativeAd=" + this.d + ")";
    }

    public Cd(@Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable JSONObject jSONObject3, @Nullable JSONObject jSONObject4) {
        this.a = jSONObject;
        this.b = jSONObject2;
        this.c = jSONObject3;
        this.d = jSONObject4;
    }

    @NotNull
    public final Cd a(@Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable JSONObject jSONObject3, @Nullable JSONObject jSONObject4) {
        return new Cd(jSONObject, jSONObject2, jSONObject3, jSONObject4);
    }

    public static /* synthetic */ Cd a(Cd cd, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONObject = cd.a;
        }
        if ((i & 2) != 0) {
            jSONObject2 = cd.b;
        }
        if ((i & 4) != 0) {
            jSONObject3 = cd.c;
        }
        if ((i & 8) != 0) {
            jSONObject4 = cd.d;
        }
        return cd.a(jSONObject, jSONObject2, jSONObject3, jSONObject4);
    }

    public /* synthetic */ Cd(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : jSONObject, (i & 2) != 0 ? null : jSONObject2, (i & 4) != 0 ? null : jSONObject3, (i & 8) != 0 ? null : jSONObject4);
    }
}
