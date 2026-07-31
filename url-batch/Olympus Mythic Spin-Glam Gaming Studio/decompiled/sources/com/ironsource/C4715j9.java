package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: com.ironsource.j9, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4715j9 {

    @NotNull
    private final String a;

    @NotNull
    private final String b;

    @NotNull
    private final EnumC4751l9 c;

    @Nullable
    private final JSONObject d;

    public C4715j9(@NotNull String url, @NotNull String storePackage, @NotNull EnumC4751l9 strategy, @Nullable JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(storePackage, "storePackage");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.a = url;
        this.b = storePackage;
        this.c = strategy;
        this.d = jSONObject;
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    @NotNull
    public final String b() {
        return this.b;
    }

    @NotNull
    public final EnumC4751l9 c() {
        return this.c;
    }

    @Nullable
    public final JSONObject d() {
        return this.d;
    }

    @Nullable
    public final JSONObject e() {
        return this.d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4715j9)) {
            return false;
        }
        C4715j9 c4715j9 = (C4715j9) obj;
        return Intrinsics.areEqual(this.a, c4715j9.a) && Intrinsics.areEqual(this.b, c4715j9.b) && this.c == c4715j9.c && Intrinsics.areEqual(this.d, c4715j9.d);
    }

    @NotNull
    public final String f() {
        return this.b;
    }

    @NotNull
    public final EnumC4751l9 g() {
        return this.c;
    }

    @NotNull
    public final String h() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
        JSONObject jSONObject = this.d;
        return hashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    @NotNull
    public String toString() {
        return "InlineStoreRequest(url=" + this.a + ", storePackage=" + this.b + ", strategy=" + this.c + ", extras=" + this.d + ")";
    }

    @NotNull
    public final C4715j9 a(@NotNull String url, @NotNull String storePackage, @NotNull EnumC4751l9 strategy, @Nullable JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(storePackage, "storePackage");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        return new C4715j9(url, storePackage, strategy, jSONObject);
    }

    public static /* synthetic */ C4715j9 a(C4715j9 c4715j9, String str, String str2, EnumC4751l9 enumC4751l9, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4715j9.a;
        }
        if ((i & 2) != 0) {
            str2 = c4715j9.b;
        }
        if ((i & 4) != 0) {
            enumC4751l9 = c4715j9.c;
        }
        if ((i & 8) != 0) {
            jSONObject = c4715j9.d;
        }
        return c4715j9.a(str, str2, enumC4751l9, jSONObject);
    }

    public /* synthetic */ C4715j9(String str, String str2, EnumC4751l9 enumC4751l9, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? EnumC4751l9.APP_ACTIVITY : enumC4751l9, (i & 8) != 0 ? null : jSONObject);
    }
}
