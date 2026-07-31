package com.ironsource;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.webkit.WebView;
import com.ironsource.X3;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class D8 {

    @Nullable
    private final String a;

    @Nullable
    private final String b;

    @Nullable
    private final String c;

    @Nullable
    private final String d;

    @Nullable
    private final Drawable e;

    @Nullable
    private final WebView f;

    @NotNull
    private final View g;

    public static final class b {

        @NotNull
        private final a a;

        public static final class a {

            @Nullable
            private final String a;

            @Nullable
            private final String b;

            @Nullable
            private final String c;

            @Nullable
            private final String d;

            @Nullable
            private final Result<Drawable> e;

            @Nullable
            private final Result<WebView> f;

            @NotNull
            private final View g;

            /* JADX WARN: Multi-variable type inference failed */
            public a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Result<? extends Drawable> result, @Nullable Result<? extends WebView> result2, @NotNull View privacyIcon) {
                Intrinsics.checkNotNullParameter(privacyIcon, "privacyIcon");
                this.a = str;
                this.b = str2;
                this.c = str3;
                this.d = str4;
                this.e = result;
                this.f = result2;
                this.g = privacyIcon;
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
            public final Result<Drawable> e() {
                return this.e;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.areEqual(this.a, aVar.a) && Intrinsics.areEqual(this.b, aVar.b) && Intrinsics.areEqual(this.c, aVar.c) && Intrinsics.areEqual(this.d, aVar.d) && Intrinsics.areEqual(this.e, aVar.e) && Intrinsics.areEqual(this.f, aVar.f) && Intrinsics.areEqual(this.g, aVar.g);
            }

            @Nullable
            public final Result<WebView> f() {
                return this.f;
            }

            @NotNull
            public final View g() {
                return this.g;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @NotNull
            public final D8 h() {
                Drawable drawable;
                String str = this.a;
                String str2 = this.b;
                String str3 = this.c;
                String str4 = this.d;
                Result<Drawable> result = this.e;
                if (result != null) {
                    Object value = result.getValue();
                    if (Result.m8028isFailureimpl(value)) {
                        value = null;
                    }
                    drawable = (Drawable) value;
                } else {
                    drawable = null;
                }
                Result<WebView> result2 = this.f;
                if (result2 != null) {
                    Object value2 = result2.getValue();
                    r5 = Result.m8028isFailureimpl(value2) ? null : value2;
                }
                return new D8(str, str2, str3, str4, drawable, r5, this.g);
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
                Result<Drawable> result = this.e;
                int m8027hashCodeimpl = (hashCode4 + (result == null ? 0 : Result.m8027hashCodeimpl(result.getValue()))) * 31;
                Result<WebView> result2 = this.f;
                return ((m8027hashCodeimpl + (result2 != null ? Result.m8027hashCodeimpl(result2.getValue()) : 0)) * 31) + this.g.hashCode();
            }

            @Nullable
            public final String i() {
                return this.b;
            }

            @Nullable
            public final String j() {
                return this.c;
            }

            @Nullable
            public final String k() {
                return this.d;
            }

            @Nullable
            public final Result<Drawable> l() {
                return this.e;
            }

            @Nullable
            public final Result<WebView> m() {
                return this.f;
            }

            @NotNull
            public final View n() {
                return this.g;
            }

            @Nullable
            public final String o() {
                return this.a;
            }

            @NotNull
            public String toString() {
                return "Data(title=" + this.a + ", advertiser=" + this.b + ", body=" + this.c + ", cta=" + this.d + ", icon=" + this.e + ", media=" + this.f + ", privacyIcon=" + this.g + ")";
            }

            @NotNull
            public final a a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Result<? extends Drawable> result, @Nullable Result<? extends WebView> result2, @NotNull View privacyIcon) {
                Intrinsics.checkNotNullParameter(privacyIcon, "privacyIcon");
                return new a(str, str2, str3, str4, result, result2, privacyIcon);
            }

            public static /* synthetic */ a a(a aVar, String str, String str2, String str3, String str4, Result result, Result result2, View view, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = aVar.a;
                }
                if ((i & 2) != 0) {
                    str2 = aVar.b;
                }
                String str5 = str2;
                if ((i & 4) != 0) {
                    str3 = aVar.c;
                }
                String str6 = str3;
                if ((i & 8) != 0) {
                    str4 = aVar.d;
                }
                String str7 = str4;
                if ((i & 16) != 0) {
                    result = aVar.e;
                }
                Result result3 = result;
                if ((i & 32) != 0) {
                    result2 = aVar.f;
                }
                Result result4 = result2;
                if ((i & 64) != 0) {
                    view = aVar.g;
                }
                return aVar.a(str, str5, str6, str7, result3, result4, view);
            }
        }

        public b(@NotNull a data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.a = data;
        }

        @NotNull
        public final a a() {
            return this.a;
        }

        @NotNull
        public final JSONObject b() {
            JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
            if (this.a.o() != null) {
                a(jsonObjectInit, "title");
            }
            if (this.a.i() != null) {
                a(jsonObjectInit, X3.i.F0);
            }
            if (this.a.j() != null) {
                a(jsonObjectInit, "body");
            }
            if (this.a.k() != null) {
                a(jsonObjectInit, "cta");
            }
            Result<Drawable> l = this.a.l();
            if (l != null) {
                a(jsonObjectInit, "icon", l.getValue());
            }
            Result<WebView> m = this.a.m();
            if (m != null) {
                a(jsonObjectInit, "media", m.getValue());
            }
            return jsonObjectInit;
        }

        private static final void a(JSONObject jSONObject, String str) {
            jSONObject.put(str, IronSourceNetworkBridge.jsonObjectInit().put("success", true));
        }

        private static final <T> void a(JSONObject jSONObject, String str, Object obj) {
            JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
            jsonObjectInit.put("success", Result.m8029isSuccessimpl(obj));
            Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(obj);
            if (m8026exceptionOrNullimpl != null) {
                String message = m8026exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "unknown reason";
                }
                jsonObjectInit.put("reason", message);
            }
            Unit unit = Unit.INSTANCE;
            jSONObject.put(str, jsonObjectInit);
        }
    }

    public D8(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Drawable drawable, @Nullable WebView webView, @NotNull View privacyIcon) {
        Intrinsics.checkNotNullParameter(privacyIcon, "privacyIcon");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = drawable;
        this.f = webView;
        this.g = privacyIcon;
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
    public final Drawable e() {
        return this.e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D8)) {
            return false;
        }
        D8 d8 = (D8) obj;
        return Intrinsics.areEqual(this.a, d8.a) && Intrinsics.areEqual(this.b, d8.b) && Intrinsics.areEqual(this.c, d8.c) && Intrinsics.areEqual(this.d, d8.d) && Intrinsics.areEqual(this.e, d8.e) && Intrinsics.areEqual(this.f, d8.f) && Intrinsics.areEqual(this.g, d8.g);
    }

    @Nullable
    public final WebView f() {
        return this.f;
    }

    @NotNull
    public final View g() {
        return this.g;
    }

    @Nullable
    public final String h() {
        return this.b;
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
        Drawable drawable = this.e;
        int hashCode5 = (hashCode4 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        WebView webView = this.f;
        return ((hashCode5 + (webView != null ? webView.hashCode() : 0)) * 31) + this.g.hashCode();
    }

    @Nullable
    public final String i() {
        return this.c;
    }

    @Nullable
    public final String j() {
        return this.d;
    }

    @Nullable
    public final Drawable k() {
        return this.e;
    }

    @Nullable
    public final WebView l() {
        return this.f;
    }

    @NotNull
    public final View m() {
        return this.g;
    }

    @Nullable
    public final String n() {
        return this.a;
    }

    @NotNull
    public String toString() {
        return "ISNNativeAdData(title=" + this.a + ", advertiser=" + this.b + ", body=" + this.c + ", cta=" + this.d + ", icon=" + this.e + ", mediaView=" + this.f + ", privacyIcon=" + this.g + ")";
    }

    @NotNull
    public final D8 a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Drawable drawable, @Nullable WebView webView, @NotNull View privacyIcon) {
        Intrinsics.checkNotNullParameter(privacyIcon, "privacyIcon");
        return new D8(str, str2, str3, str4, drawable, webView, privacyIcon);
    }

    public static /* synthetic */ D8 a(D8 d8, String str, String str2, String str3, String str4, Drawable drawable, WebView webView, View view, int i, Object obj) {
        if ((i & 1) != 0) {
            str = d8.a;
        }
        if ((i & 2) != 0) {
            str2 = d8.b;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = d8.c;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = d8.d;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            drawable = d8.e;
        }
        Drawable drawable2 = drawable;
        if ((i & 32) != 0) {
            webView = d8.f;
        }
        WebView webView2 = webView;
        if ((i & 64) != 0) {
            view = d8.g;
        }
        return d8.a(str, str5, str6, str7, drawable2, webView2, view);
    }

    public static final class a {

        @NotNull
        private final U8 a;

        @NotNull
        private final InterfaceC4600d1 b;

        public a(@NotNull U8 imageLoader, @NotNull InterfaceC4600d1 adViewManagement) {
            Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            Intrinsics.checkNotNullParameter(adViewManagement, "adViewManagement");
            this.a = imageLoader;
            this.b = adViewManagement;
        }

        private final Result<Drawable> b(String str) {
            if (str == null) {
                return null;
            }
            return Result.m8022boximpl(this.a.a(str));
        }

        @NotNull
        public final b a(@NotNull Context activityContext, @NotNull JSONObject json) {
            String str;
            String str2;
            String str3;
            String str4;
            String b;
            String b2;
            String b3;
            String b4;
            Intrinsics.checkNotNullParameter(activityContext, "activityContext");
            Intrinsics.checkNotNullParameter(json, "json");
            JSONObject optJSONObject = json.optJSONObject("title");
            if (optJSONObject != null) {
                b4 = E8.b(optJSONObject, "text");
                str = b4;
            } else {
                str = null;
            }
            JSONObject optJSONObject2 = json.optJSONObject(X3.i.F0);
            if (optJSONObject2 != null) {
                b3 = E8.b(optJSONObject2, "text");
                str2 = b3;
            } else {
                str2 = null;
            }
            JSONObject optJSONObject3 = json.optJSONObject("body");
            if (optJSONObject3 != null) {
                b2 = E8.b(optJSONObject3, "text");
                str3 = b2;
            } else {
                str3 = null;
            }
            JSONObject optJSONObject4 = json.optJSONObject("cta");
            if (optJSONObject4 != null) {
                b = E8.b(optJSONObject4, "text");
                str4 = b;
            } else {
                str4 = null;
            }
            JSONObject optJSONObject5 = json.optJSONObject("icon");
            String b5 = optJSONObject5 != null ? E8.b(optJSONObject5, "url") : null;
            JSONObject optJSONObject6 = json.optJSONObject("media");
            String b6 = optJSONObject6 != null ? E8.b(optJSONObject6, "adViewId") : null;
            JSONObject optJSONObject7 = json.optJSONObject(X3.i.J0);
            return new b(new b.a(str, str2, str3, str4, b(b5), a(b6), Ad.a.a(activityContext, optJSONObject7 != null ? E8.b(optJSONObject7, "url") : null, this.a)));
        }

        private final Result<WebView> a(String str) {
            if (str == null) {
                return null;
            }
            H8 a = this.b.a(str);
            WebView presentingView = a != null ? a.getPresentingView() : null;
            if (presentingView == null) {
                Result.Companion companion = Result.INSTANCE;
                return Result.m8022boximpl(Result.m8023constructorimpl(ResultKt.createFailure(new Exception("missing adview for id: '" + str + "'"))));
            }
            return Result.m8022boximpl(Result.m8023constructorimpl(presentingView));
        }
    }
}
