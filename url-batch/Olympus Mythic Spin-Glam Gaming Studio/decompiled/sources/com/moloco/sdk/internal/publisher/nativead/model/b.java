package com.moloco.sdk.internal.publisher.nativead.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes15.dex */
public final class b {
    public static final int g = 8;

    @Nullable
    public final String a;

    @NotNull
    public final List<a> b;

    @Nullable
    public final c c;

    @NotNull
    public final List<String> d;

    @NotNull
    public final List<C1549b> e;

    @Nullable
    public final String f;

    @StabilityInferred
    public static abstract class a {
        public static final int c = 0;
        public final int a;
        public final boolean b;

        @StabilityInferred
        /* renamed from: com.moloco.sdk.internal.publisher.nativead.model.b$a$a, reason: collision with other inner class name */
        public static final class C1547a extends a {
            public static final int g = 0;

            @Nullable
            public final Integer d;

            @Nullable
            public final Integer e;

            @NotNull
            public final String f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1547a(int i, boolean z, @Nullable Integer num, @Nullable Integer num2, @NotNull String value) {
                super(i, z, null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.d = num;
                this.e = num2;
                this.f = value;
            }

            @Nullable
            public final Integer c() {
                return this.e;
            }

            @Nullable
            public final Integer d() {
                return this.d;
            }

            @NotNull
            public final String e() {
                return this.f;
            }
        }

        @StabilityInferred
        /* renamed from: com.moloco.sdk.internal.publisher.nativead.model.b$a$b, reason: collision with other inner class name */
        public static final class C1548b extends a {
            public static final int h = 0;

            @Nullable
            public final Integer d;

            @NotNull
            public final String e;

            @Nullable
            public final Integer f;

            @Nullable
            public final Integer g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1548b(int i, boolean z, @Nullable Integer num, @NotNull String url, @Nullable Integer num2, @Nullable Integer num3) {
                super(i, z, null);
                Intrinsics.checkNotNullParameter(url, "url");
                this.d = num;
                this.e = url;
                this.f = num2;
                this.g = num3;
            }

            @Nullable
            public final Integer c() {
                return this.g;
            }

            @Nullable
            public final Integer d() {
                return this.d;
            }

            @NotNull
            public final String e() {
                return this.e;
            }

            @Nullable
            public final Integer f() {
                return this.f;
            }
        }

        @StabilityInferred
        public static final class c extends a {
            public static final int f = 0;

            @NotNull
            public final String d;

            @Nullable
            public final Integer e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(int i, boolean z, @NotNull String text, @Nullable Integer num) {
                super(i, z, null);
                Intrinsics.checkNotNullParameter(text, "text");
                this.d = text;
                this.e = num;
            }

            @Nullable
            public final Integer c() {
                return this.e;
            }

            @NotNull
            public final String d() {
                return this.d;
            }
        }

        @StabilityInferred
        public static final class d extends a {
            public static final int e = 0;

            @NotNull
            public final String d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(int i, boolean z, @NotNull String vastTag) {
                super(i, z, null);
                Intrinsics.checkNotNullParameter(vastTag, "vastTag");
                this.d = vastTag;
            }

            @NotNull
            public final String c() {
                return this.d;
            }
        }

        public /* synthetic */ a(int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, z);
        }

        public final int a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
        }

        public a(int i, boolean z) {
            this.a = i;
            this.b = z;
        }
    }

    @StabilityInferred
    /* renamed from: com.moloco.sdk.internal.publisher.nativead.model.b$b, reason: collision with other inner class name */
    public static final class C1549b {
        public static final int d = 0;
        public final int a;
        public final int b;

        @Nullable
        public final String c;

        public C1549b(int i, int i2, @Nullable String str) {
            this.a = i;
            this.b = i2;
            this.c = str;
        }

        public final int a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        @Nullable
        public final String c() {
            return this.c;
        }
    }

    @StabilityInferred
    public static final class c {
        public static final int d = 8;

        @NotNull
        public final String a;

        @NotNull
        public final List<String> b;

        @Nullable
        public final String c;

        public c(@NotNull String url, @NotNull List<String> clickTrackerUrls, @Nullable String str) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(clickTrackerUrls, "clickTrackerUrls");
            this.a = url;
            this.b = clickTrackerUrls;
            this.c = str;
        }

        @NotNull
        public final List<String> a() {
            return this.b;
        }

        @Nullable
        public final String b() {
            return this.c;
        }

        @NotNull
        public final String c() {
            return this.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@Nullable String str, @NotNull List<? extends a> assets, @Nullable c cVar, @NotNull List<String> impressionTrackerUrls, @NotNull List<C1549b> eventTrackers, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(impressionTrackerUrls, "impressionTrackerUrls");
        Intrinsics.checkNotNullParameter(eventTrackers, "eventTrackers");
        this.a = str;
        this.b = assets;
        this.c = cVar;
        this.d = impressionTrackerUrls;
        this.e = eventTrackers;
        this.f = str2;
    }

    @NotNull
    public final List<a> a() {
        return this.b;
    }

    @NotNull
    public final List<C1549b> b() {
        return this.e;
    }

    @NotNull
    public final List<String> c() {
        return this.d;
    }

    @Nullable
    public final c d() {
        return this.c;
    }

    @Nullable
    public final String e() {
        return this.f;
    }

    @Nullable
    public final String f() {
        return this.a;
    }
}
