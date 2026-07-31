package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: com.ironsource.o9, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4805o9 {

    @Nullable
    private final String a;

    @Nullable
    private final String b;

    @Nullable
    private final String c;

    @Nullable
    private final String d;

    @Nullable
    private final String e;

    @Nullable
    private final Boolean f;

    @Nullable
    private final JSONObject g;

    @Nullable
    private final a h;

    /* renamed from: com.ironsource.o9$a */
    public static final class a {

        @Nullable
        private final JSONObject a;

        @Nullable
        private final JSONObject b;

        @Nullable
        private final JSONObject c;

        @Nullable
        private final JSONObject d;

        public a() {
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
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.a, aVar.a) && Intrinsics.areEqual(this.b, aVar.b) && Intrinsics.areEqual(this.c, aVar.c) && Intrinsics.areEqual(this.d, aVar.d);
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
            return "AdFormats(rewarded=" + this.a + ", interstitial=" + this.b + ", banner=" + this.c + ", nativeAd=" + this.d + ")";
        }

        public a(@Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable JSONObject jSONObject3, @Nullable JSONObject jSONObject4) {
            this.a = jSONObject;
            this.b = jSONObject2;
            this.c = jSONObject3;
            this.d = jSONObject4;
        }

        @NotNull
        public final a a(@Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable JSONObject jSONObject3, @Nullable JSONObject jSONObject4) {
            return new a(jSONObject, jSONObject2, jSONObject3, jSONObject4);
        }

        public static /* synthetic */ a a(a aVar, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i, Object obj) {
            if ((i & 1) != 0) {
                jSONObject = aVar.a;
            }
            if ((i & 2) != 0) {
                jSONObject2 = aVar.b;
            }
            if ((i & 4) != 0) {
                jSONObject3 = aVar.c;
            }
            if ((i & 8) != 0) {
                jSONObject4 = aVar.d;
            }
            return aVar.a(jSONObject, jSONObject2, jSONObject3, jSONObject4);
        }

        public /* synthetic */ a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : jSONObject, (i & 2) != 0 ? null : jSONObject2, (i & 4) != 0 ? null : jSONObject3, (i & 8) != 0 ? null : jSONObject4);
        }
    }

    public C4805o9() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Nullable
    public final String a() {
        return this.a;
    }

    @Nullable
    public final String b() {
        return this.b;
    }

    @Nullable
    public final String c() {
        return this.c;
    }

    @Nullable
    public final String d() {
        return this.d;
    }

    @Nullable
    public final String e() {
        return this.e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4805o9)) {
            return false;
        }
        C4805o9 c4805o9 = (C4805o9) obj;
        return Intrinsics.areEqual(this.a, c4805o9.a) && Intrinsics.areEqual(this.b, c4805o9.b) && Intrinsics.areEqual(this.c, c4805o9.c) && Intrinsics.areEqual(this.d, c4805o9.d) && Intrinsics.areEqual(this.e, c4805o9.e) && Intrinsics.areEqual(this.f, c4805o9.f) && Intrinsics.areEqual(this.g, c4805o9.g) && Intrinsics.areEqual(this.h, c4805o9.h);
    }

    @Nullable
    public final Boolean f() {
        return this.f;
    }

    @Nullable
    public final JSONObject g() {
        return this.g;
    }

    @Nullable
    public final a h() {
        return this.h;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.f;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        JSONObject jSONObject = this.g;
        int hashCode7 = (hashCode6 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        a aVar = this.h;
        return hashCode7 + (aVar != null ? aVar.hashCode() : 0);
    }

    @Nullable
    public final a i() {
        return this.h;
    }

    @Nullable
    public final String j() {
        return this.a;
    }

    @Nullable
    public final JSONObject k() {
        return this.g;
    }

    @Nullable
    public final Boolean l() {
        return this.f;
    }

    @Nullable
    public final String m() {
        return this.d;
    }

    @Nullable
    public final String n() {
        return this.c;
    }

    @Nullable
    public final String o() {
        return this.b;
    }

    @Nullable
    public final String p() {
        return this.e;
    }

    @NotNull
    public String toString() {
        return "InstanceProviderSettings2(adSourceName=" + this.a + ", providerNetworkKey=" + this.b + ", providerLoadName=" + this.c + ", providerDefaultInstance=" + this.d + ", spId=" + this.e + ", mpis=" + this.f + ", application=" + this.g + ", adFormats=" + this.h + ")";
    }

    public C4805o9(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Boolean bool, @Nullable JSONObject jSONObject, @Nullable a aVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = bool;
        this.g = jSONObject;
        this.h = aVar;
    }

    @NotNull
    public final C4805o9 a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Boolean bool, @Nullable JSONObject jSONObject, @Nullable a aVar) {
        return new C4805o9(str, str2, str3, str4, str5, bool, jSONObject, aVar);
    }

    public /* synthetic */ C4805o9(String str, String str2, String str3, String str4, String str5, Boolean bool, JSONObject jSONObject, a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : jSONObject, (i & 128) == 0 ? aVar : null);
    }
}
