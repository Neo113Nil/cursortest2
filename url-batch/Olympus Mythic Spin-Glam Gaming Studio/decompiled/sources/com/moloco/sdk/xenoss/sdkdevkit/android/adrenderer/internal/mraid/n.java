package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.net.Uri;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.x;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes12.dex */
public abstract class n {

    @NotNull
    public static final b b = new b(null);
    public static final int c = 0;

    @NotNull
    public static final String d = "close";

    @NotNull
    public static final String e = "expand";

    @NotNull
    public static final String f = "open";

    @NotNull
    public static final String g = "resize";

    @NotNull
    public static final String h = "setOrientationProperties";

    @NotNull
    public final String a;

    @StabilityInferred
    public static final class a extends n {

        @NotNull
        public static final a i = new a();
        public static final int j = 0;

        public a() {
            super("close", null);
        }
    }

    public static final class b {

        @StabilityInferred
        public static final class a {
            public static final int c = 0;
            public final boolean a;

            @NotNull
            public final String b;

            public a(boolean z, @NotNull String description) {
                Intrinsics.checkNotNullParameter(description, "description");
                this.a = z;
                this.b = description;
            }

            @NotNull
            public final String a() {
                return this.b;
            }

            public final boolean b() {
                return this.a;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a() {
            return null;
        }

        public final d b(Map<String, String> map) {
            Object m8023constructorimpl;
            String str = map.get("url");
            if (str == null) {
                return null;
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                Uri parse = Uri.parse(str);
                Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
                m8023constructorimpl = Result.m8023constructorimpl(new d(parse));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
            }
            return (d) (Result.m8028isFailureimpl(m8023constructorimpl) ? null : m8023constructorimpl);
        }

        public final f c(Map<String, String> map) {
            Boolean booleanStrictOrNull;
            String str = map.get("allowOrientationChange");
            if (str == null || (booleanStrictOrNull = StringsKt.toBooleanStrictOrNull(str)) == null) {
                return null;
            }
            boolean booleanValue = booleanStrictOrNull.booleanValue();
            p a2 = p.a.a(map.get("forceOrientation"));
            if (a2 == null) {
                return null;
            }
            return new f(booleanValue, a2);
        }

        public b() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        @NotNull
        public final x<n, a> a(@Nullable String str) {
            Object m8023constructorimpl;
            try {
                Result.Companion companion = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(Uri.parse(str));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
            }
            Object obj = null;
            if (Result.m8028isFailureimpl(m8023constructorimpl)) {
                m8023constructorimpl = null;
            }
            Uri uri = (Uri) m8023constructorimpl;
            if (uri == null) {
                return new x.a(new a(false, "Invalid url: " + str));
            }
            if (!Intrinsics.areEqual(uri.getScheme(), "mraid")) {
                return new x.a(new a(false, "Non-mraid url scheme: " + str));
            }
            Map<String, String> a2 = a(uri);
            String host = uri.getHost();
            if (host != null) {
                switch (host.hashCode()) {
                    case -1289167206:
                        if (host.equals(n.e)) {
                            obj = a(a2);
                            break;
                        }
                        break;
                    case -934437708:
                        if (host.equals(n.g)) {
                            obj = a();
                            break;
                        }
                        break;
                    case 3417674:
                        if (host.equals("open")) {
                            obj = b(a2);
                            break;
                        }
                        break;
                    case 94756344:
                        if (host.equals("close")) {
                            obj = a.i;
                            break;
                        }
                        break;
                    case 133423073:
                        if (host.equals(n.h)) {
                            obj = c(a2);
                            break;
                        }
                        break;
                }
            }
            if (obj != null) {
                return new x.b(obj);
            }
            return new x.a(new a(true, "Unknown/unsupported mraid command " + uri.getHost()));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final c a(Map<String, String> map) {
            Uri uri;
            String str = map.get("url");
            if (str != null) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    uri = Result.m8023constructorimpl(Uri.parse(str));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    uri = Result.m8023constructorimpl(ResultKt.createFailure(th));
                }
                r0 = Result.m8028isFailureimpl(uri) ? null : uri;
            }
            return new c(r0);
        }

        public final Map<String, String> a(Uri uri) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : uri.getQueryParameterNames()) {
                linkedHashMap.put(str, TextUtils.join(StringUtils.COMMA, uri.getQueryParameters(str)));
            }
            return linkedHashMap;
        }
    }

    @StabilityInferred
    public static final class c extends n {
        public static final int j = 8;

        @Nullable
        public final Uri i;

        public c(@Nullable Uri uri) {
            super(n.e, null);
            this.i = uri;
        }

        @Nullable
        public final Uri b() {
            return this.i;
        }
    }

    @StabilityInferred
    public static final class d extends n {
        public static final int j = 8;

        @NotNull
        public final Uri i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull Uri uri) {
            super("open", null);
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.i = uri;
        }

        @NotNull
        public final Uri b() {
            return this.i;
        }
    }

    @StabilityInferred
    public static final class e extends n {
        public static final int n = 0;
        public final int i;
        public final int j;
        public final int k;
        public final int l;
        public final boolean m;

        public e(int i, int i2, int i3, int i4, boolean z) {
            super(n.g, null);
            this.i = i;
            this.j = i2;
            this.k = i3;
            this.l = i4;
            this.m = z;
        }

        public final boolean b() {
            return this.m;
        }

        public final int c() {
            return this.j;
        }

        public final int d() {
            return this.k;
        }

        public final int e() {
            return this.l;
        }

        public final int f() {
            return this.i;
        }
    }

    @StabilityInferred
    public static final class f extends n {
        public static final int k = 0;
        public final boolean i;

        @NotNull
        public final p j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z, @NotNull p forceOrientation) {
            super(n.h, null);
            Intrinsics.checkNotNullParameter(forceOrientation, "forceOrientation");
            this.i = z;
            this.j = forceOrientation;
        }

        public final boolean b() {
            return this.i;
        }

        @NotNull
        public final p c() {
            return this.j;
        }
    }

    public /* synthetic */ n(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    public n(String str) {
        this.a = str;
    }

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b a(@NotNull f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b(q.a(fVar.c()), fVar.b());
    }
}
