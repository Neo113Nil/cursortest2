package com.ironsource;

import com.ironsource.C4822p8;
import com.ironsource.X3;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: com.ironsource.w1, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC4944w1 {

    @NotNull
    public static final b a = b.a;

    /* renamed from: com.ironsource.w1$a */
    public interface a extends InterfaceC4944w1 {

        /* renamed from: com.ironsource.w1$a$a, reason: collision with other inner class name */
        public static final class C1380a implements a {

            @NotNull
            private final String b;

            @NotNull
            private final String c;

            @NotNull
            private final C4822p8.e d;

            @NotNull
            private final String e;

            @NotNull
            private final String f;

            @NotNull
            private final C1381a g;
            private final int h;
            private final int i;

            /* renamed from: com.ironsource.w1$a$a$a, reason: collision with other inner class name */
            public static final class C1381a {
                private final int a;
                private final int b;

                public C1381a(int i, int i2) {
                    this.a = i;
                    this.b = i2;
                }

                public final int a() {
                    return this.a;
                }

                public final int b() {
                    return this.b;
                }

                public final int c() {
                    return this.a;
                }

                public final int d() {
                    return this.b;
                }

                public boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1381a)) {
                        return false;
                    }
                    C1381a c1381a = (C1381a) obj;
                    return this.a == c1381a.a && this.b == c1381a.b;
                }

                public int hashCode() {
                    return (Integer.hashCode(this.a) * 31) + Integer.hashCode(this.b);
                }

                @NotNull
                public String toString() {
                    return "Coordinates(x=" + this.a + ", y=" + this.b + ")";
                }

                @NotNull
                public final C1381a a(int i, int i2) {
                    return new C1381a(i, i2);
                }

                public static /* synthetic */ C1381a a(C1381a c1381a, int i, int i2, int i3, Object obj) {
                    if ((i3 & 1) != 0) {
                        i = c1381a.a;
                    }
                    if ((i3 & 2) != 0) {
                        i2 = c1381a.b;
                    }
                    return c1381a.a(i, i2);
                }
            }

            public C1380a(@NotNull String successCallback, @NotNull String failCallback, @NotNull C4822p8.e productType, @NotNull String demandSourceName, @NotNull String url, @NotNull C1381a coordinates, int i, int i2) {
                Intrinsics.checkNotNullParameter(successCallback, "successCallback");
                Intrinsics.checkNotNullParameter(failCallback, "failCallback");
                Intrinsics.checkNotNullParameter(productType, "productType");
                Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(coordinates, "coordinates");
                this.b = successCallback;
                this.c = failCallback;
                this.d = productType;
                this.e = demandSourceName;
                this.f = url;
                this.g = coordinates;
                this.h = i;
                this.i = i2;
            }

            @NotNull
            public final C1380a a(@NotNull String successCallback, @NotNull String failCallback, @NotNull C4822p8.e productType, @NotNull String demandSourceName, @NotNull String url, @NotNull C1381a coordinates, int i, int i2) {
                Intrinsics.checkNotNullParameter(successCallback, "successCallback");
                Intrinsics.checkNotNullParameter(failCallback, "failCallback");
                Intrinsics.checkNotNullParameter(productType, "productType");
                Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(coordinates, "coordinates");
                return new C1380a(successCallback, failCallback, productType, demandSourceName, url, coordinates, i, i2);
            }

            @Override // com.ironsource.InterfaceC4944w1.a
            @NotNull
            public String b() {
                return this.f;
            }

            @Override // com.ironsource.InterfaceC4944w1
            @NotNull
            public String c() {
                return this.c;
            }

            @Override // com.ironsource.InterfaceC4944w1
            @NotNull
            public C4822p8.e d() {
                return this.d;
            }

            @Override // com.ironsource.InterfaceC4944w1
            @NotNull
            public String e() {
                return this.e;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1380a)) {
                    return false;
                }
                C1380a c1380a = (C1380a) obj;
                return Intrinsics.areEqual(this.b, c1380a.b) && Intrinsics.areEqual(this.c, c1380a.c) && this.d == c1380a.d && Intrinsics.areEqual(this.e, c1380a.e) && Intrinsics.areEqual(this.f, c1380a.f) && Intrinsics.areEqual(this.g, c1380a.g) && this.h == c1380a.h && this.i == c1380a.i;
            }

            @NotNull
            public final String f() {
                return this.b;
            }

            @NotNull
            public final String g() {
                return this.c;
            }

            @NotNull
            public final C4822p8.e h() {
                return this.d;
            }

            public int hashCode() {
                return (((((((((((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + Integer.hashCode(this.h)) * 31) + Integer.hashCode(this.i);
            }

            @NotNull
            public final String i() {
                return this.e;
            }

            @NotNull
            public final String j() {
                return this.f;
            }

            @NotNull
            public final C1381a k() {
                return this.g;
            }

            public final int l() {
                return this.h;
            }

            public final int m() {
                return this.i;
            }

            public final int n() {
                return this.h;
            }

            @NotNull
            public final C1381a o() {
                return this.g;
            }

            public final int p() {
                return this.i;
            }

            @NotNull
            public String toString() {
                return "Click(successCallback=" + this.b + ", failCallback=" + this.c + ", productType=" + this.d + ", demandSourceName=" + this.e + ", url=" + this.f + ", coordinates=" + this.g + ", action=" + this.h + ", metaState=" + this.i + ")";
            }

            @Override // com.ironsource.InterfaceC4944w1
            @NotNull
            public String a() {
                return this.b;
            }
        }

        /* renamed from: com.ironsource.w1$a$b */
        public static final class b implements a {

            @NotNull
            private final String b;

            @NotNull
            private final String c;

            @NotNull
            private final C4822p8.e d;

            @NotNull
            private final String e;

            @NotNull
            private final String f;

            public b(@NotNull String successCallback, @NotNull String failCallback, @NotNull C4822p8.e productType, @NotNull String demandSourceName, @NotNull String url) {
                Intrinsics.checkNotNullParameter(successCallback, "successCallback");
                Intrinsics.checkNotNullParameter(failCallback, "failCallback");
                Intrinsics.checkNotNullParameter(productType, "productType");
                Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
                Intrinsics.checkNotNullParameter(url, "url");
                this.b = successCallback;
                this.c = failCallback;
                this.d = productType;
                this.e = demandSourceName;
                this.f = url;
            }

            @NotNull
            public final b a(@NotNull String successCallback, @NotNull String failCallback, @NotNull C4822p8.e productType, @NotNull String demandSourceName, @NotNull String url) {
                Intrinsics.checkNotNullParameter(successCallback, "successCallback");
                Intrinsics.checkNotNullParameter(failCallback, "failCallback");
                Intrinsics.checkNotNullParameter(productType, "productType");
                Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
                Intrinsics.checkNotNullParameter(url, "url");
                return new b(successCallback, failCallback, productType, demandSourceName, url);
            }

            @Override // com.ironsource.InterfaceC4944w1.a
            @NotNull
            public String b() {
                return this.f;
            }

            @Override // com.ironsource.InterfaceC4944w1
            @NotNull
            public String c() {
                return this.c;
            }

            @Override // com.ironsource.InterfaceC4944w1
            @NotNull
            public C4822p8.e d() {
                return this.d;
            }

            @Override // com.ironsource.InterfaceC4944w1
            @NotNull
            public String e() {
                return this.e;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Intrinsics.areEqual(this.b, bVar.b) && Intrinsics.areEqual(this.c, bVar.c) && this.d == bVar.d && Intrinsics.areEqual(this.e, bVar.e) && Intrinsics.areEqual(this.f, bVar.f);
            }

            @NotNull
            public final String f() {
                return this.b;
            }

            @NotNull
            public final String g() {
                return this.c;
            }

            @NotNull
            public final C4822p8.e h() {
                return this.d;
            }

            public int hashCode() {
                return (((((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
            }

            @NotNull
            public final String i() {
                return this.e;
            }

            @NotNull
            public final String j() {
                return this.f;
            }

            @NotNull
            public String toString() {
                return "Impression(successCallback=" + this.b + ", failCallback=" + this.c + ", productType=" + this.d + ", demandSourceName=" + this.e + ", url=" + this.f + ")";
            }

            public static /* synthetic */ b a(b bVar, String str, String str2, C4822p8.e eVar, String str3, String str4, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = bVar.b;
                }
                if ((i & 2) != 0) {
                    str2 = bVar.c;
                }
                String str5 = str2;
                if ((i & 4) != 0) {
                    eVar = bVar.d;
                }
                C4822p8.e eVar2 = eVar;
                if ((i & 8) != 0) {
                    str3 = bVar.e;
                }
                String str6 = str3;
                if ((i & 16) != 0) {
                    str4 = bVar.f;
                }
                return bVar.a(str, str5, eVar2, str6, str4);
            }

            @Override // com.ironsource.InterfaceC4944w1
            @NotNull
            public String a() {
                return this.b;
            }
        }

        @NotNull
        String b();
    }

    @NotNull
    static InterfaceC4944w1 a(@NotNull String str) {
        return a.a(str);
    }

    @NotNull
    String a();

    @NotNull
    String c();

    @NotNull
    C4822p8.e d();

    @NotNull
    String e();

    /* renamed from: com.ironsource.w1$b */
    public static final class b {
        static final /* synthetic */ b a = new b();

        private b() {
        }

        @NotNull
        public final InterfaceC4944w1 a(@NotNull String jsonString) {
            Intrinsics.checkNotNullParameter(jsonString, "jsonString");
            JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(jsonString);
            String optString = jsonObjectInit.optString("type", "none");
            if (Intrinsics.areEqual(optString, Y3.c)) {
                return a(jsonObjectInit);
            }
            throw new IllegalArgumentException("unsupported message type: " + optString);
        }

        private final a a(JSONObject jSONObject) {
            String successCallback = jSONObject.getString("success");
            String failCallback = jSONObject.getString(X3.g.e);
            String demandSourceName = jSONObject.getString("demandSourceName");
            String string = jSONObject.getString(X3.i.m);
            Intrinsics.checkNotNullExpressionValue(string, "json.getString(ParametersKeys.PRODUCT_TYPE)");
            C4822p8.e valueOf = C4822p8.e.valueOf(string);
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            String url = jSONObject2.getString("url");
            String optString = jSONObject2.optString("type");
            if (Intrinsics.areEqual(optString, "click")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(Y3.f);
                int i = jSONObject3.getInt(Y3.g);
                int i2 = jSONObject3.getInt(Y3.h);
                int optInt = jSONObject2.optInt("action", 0);
                int optInt2 = jSONObject2.optInt(Y3.j, 0);
                Intrinsics.checkNotNullExpressionValue(successCallback, "successCallback");
                Intrinsics.checkNotNullExpressionValue(failCallback, "failCallback");
                Intrinsics.checkNotNullExpressionValue(demandSourceName, "demandSourceName");
                Intrinsics.checkNotNullExpressionValue(url, "url");
                return new a.C1380a(successCallback, failCallback, valueOf, demandSourceName, url, new a.C1380a.C1381a(i, i2), optInt, optInt2);
            }
            if (Intrinsics.areEqual(optString, "impression")) {
                Intrinsics.checkNotNullExpressionValue(successCallback, "successCallback");
                Intrinsics.checkNotNullExpressionValue(failCallback, "failCallback");
                Intrinsics.checkNotNullExpressionValue(demandSourceName, "demandSourceName");
                Intrinsics.checkNotNullExpressionValue(url, "url");
                return new a.b(successCallback, failCallback, valueOf, demandSourceName, url);
            }
            throw new IllegalArgumentException("JSON does not contain valid type: " + jSONObject2.optString("type"));
        }
    }
}
