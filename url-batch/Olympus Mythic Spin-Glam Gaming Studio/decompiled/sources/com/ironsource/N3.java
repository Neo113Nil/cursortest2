package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes9.dex */
public final class N3 {

    @Nullable
    private final C4649fe a;

    @Nullable
    private final E9 b;

    @Nullable
    private final U2 c;

    @Nullable
    private final Rb d;

    @Nullable
    private final C1 e;

    @Nullable
    private final C4579bg f;

    @Nullable
    private final com.ironsource.mediationsdk.adquality.a g;

    public static final class a {

        @Nullable
        private C4649fe a;

        @Nullable
        private E9 b;

        @Nullable
        private U2 c;

        @Nullable
        private Rb d;

        @Nullable
        private C1 e;

        @Nullable
        private C4579bg f;

        @Nullable
        private com.ironsource.mediationsdk.adquality.a g;

        public a() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        @NotNull
        public final a a(@Nullable C4649fe c4649fe, @Nullable E9 e9, @Nullable U2 u2, @Nullable Rb rb, @Nullable C1 c1, @Nullable C4579bg c4579bg, @Nullable com.ironsource.mediationsdk.adquality.a aVar) {
            return new a(c4649fe, e9, u2, rb, c1, c4579bg, aVar);
        }

        @Nullable
        public final C4649fe b() {
            return this.a;
        }

        @Nullable
        public final E9 c() {
            return this.b;
        }

        @Nullable
        public final U2 d() {
            return this.c;
        }

        @Nullable
        public final Rb e() {
            return this.d;
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
        public final C1 f() {
            return this.e;
        }

        @Nullable
        public final C4579bg g() {
            return this.f;
        }

        @Nullable
        public final com.ironsource.mediationsdk.adquality.a h() {
            return this.g;
        }

        public int hashCode() {
            C4649fe c4649fe = this.a;
            int hashCode = (c4649fe == null ? 0 : c4649fe.hashCode()) * 31;
            E9 e9 = this.b;
            int hashCode2 = (hashCode + (e9 == null ? 0 : e9.hashCode())) * 31;
            U2 u2 = this.c;
            int hashCode3 = (hashCode2 + (u2 == null ? 0 : u2.hashCode())) * 31;
            Rb rb = this.d;
            int hashCode4 = (hashCode3 + (rb == null ? 0 : rb.hashCode())) * 31;
            C1 c1 = this.e;
            int hashCode5 = (hashCode4 + (c1 == null ? 0 : c1.hashCode())) * 31;
            C4579bg c4579bg = this.f;
            int hashCode6 = (hashCode5 + (c4579bg == null ? 0 : c4579bg.hashCode())) * 31;
            com.ironsource.mediationsdk.adquality.a aVar = this.g;
            return hashCode6 + (aVar != null ? aVar.hashCode() : 0);
        }

        @Nullable
        public final com.ironsource.mediationsdk.adquality.a i() {
            return this.g;
        }

        @Nullable
        public final C1 j() {
            return this.e;
        }

        @Nullable
        public final U2 k() {
            return this.c;
        }

        @Nullable
        public final E9 l() {
            return this.b;
        }

        @Nullable
        public final Rb m() {
            return this.d;
        }

        @Nullable
        public final C4649fe n() {
            return this.a;
        }

        @Nullable
        public final C4579bg o() {
            return this.f;
        }

        @NotNull
        public String toString() {
            return "Builder(rewardedVideoConfigurations=" + this.a + ", interstitialConfigurations=" + this.b + ", bannerConfigurations=" + this.c + ", nativeAdConfigurations=" + this.d + ", applicationConfigurations=" + this.e + ", testSuiteSettings=" + this.f + ", adQualityConfigurations=" + this.g + ")";
        }

        public a(@Nullable C4649fe c4649fe, @Nullable E9 e9, @Nullable U2 u2, @Nullable Rb rb, @Nullable C1 c1, @Nullable C4579bg c4579bg, @Nullable com.ironsource.mediationsdk.adquality.a aVar) {
            this.a = c4649fe;
            this.b = e9;
            this.c = u2;
            this.d = rb;
            this.e = c1;
            this.f = c4579bg;
            this.g = aVar;
        }

        public static /* synthetic */ a a(a aVar, C4649fe c4649fe, E9 e9, U2 u2, Rb rb, C1 c1, C4579bg c4579bg, com.ironsource.mediationsdk.adquality.a aVar2, int i, Object obj) {
            if ((i & 1) != 0) {
                c4649fe = aVar.a;
            }
            if ((i & 2) != 0) {
                e9 = aVar.b;
            }
            E9 e92 = e9;
            if ((i & 4) != 0) {
                u2 = aVar.c;
            }
            U2 u22 = u2;
            if ((i & 8) != 0) {
                rb = aVar.d;
            }
            Rb rb2 = rb;
            if ((i & 16) != 0) {
                c1 = aVar.e;
            }
            C1 c12 = c1;
            if ((i & 32) != 0) {
                c4579bg = aVar.f;
            }
            C4579bg c4579bg2 = c4579bg;
            if ((i & 64) != 0) {
                aVar2 = aVar.g;
            }
            return aVar.a(c4649fe, e92, u22, rb2, c12, c4579bg2, aVar2);
        }

        public final void b(@Nullable C4649fe c4649fe) {
            this.a = c4649fe;
        }

        public final void a(@Nullable C4579bg c4579bg) {
            this.f = c4579bg;
        }

        public final void b(@Nullable E9 e9) {
            this.b = e9;
        }

        @NotNull
        public final a a(@Nullable C4649fe c4649fe) {
            this.a = c4649fe;
            return this;
        }

        public final void b(@Nullable U2 u2) {
            this.c = u2;
        }

        @NotNull
        public final a a(@Nullable E9 e9) {
            this.b = e9;
            return this;
        }

        public final void b(@Nullable Rb rb) {
            this.d = rb;
        }

        @NotNull
        public final a a(@Nullable U2 u2) {
            this.c = u2;
            return this;
        }

        public final void b(@Nullable C1 c1) {
            this.e = c1;
        }

        @NotNull
        public final a a(@Nullable Rb rb) {
            this.d = rb;
            return this;
        }

        public final void b(@Nullable com.ironsource.mediationsdk.adquality.a aVar) {
            this.g = aVar;
        }

        @NotNull
        public final a a(@Nullable C1 c1) {
            this.e = c1;
            return this;
        }

        @NotNull
        public final a b(@Nullable C4579bg c4579bg) {
            this.f = c4579bg;
            return this;
        }

        @NotNull
        public final a a(@Nullable com.ironsource.mediationsdk.adquality.a aVar) {
            this.g = aVar;
            return this;
        }

        public /* synthetic */ a(C4649fe c4649fe, E9 e9, U2 u2, Rb rb, C1 c1, C4579bg c4579bg, com.ironsource.mediationsdk.adquality.a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : c4649fe, (i & 2) != 0 ? null : e9, (i & 4) != 0 ? null : u2, (i & 8) != 0 ? null : rb, (i & 16) != 0 ? null : c1, (i & 32) != 0 ? null : c4579bg, (i & 64) != 0 ? null : aVar);
        }

        @NotNull
        public final N3 a() {
            return new N3(this.a, this.b, this.c, this.d, this.e, this.f, this.g, null);
        }
    }

    public /* synthetic */ N3(C4649fe c4649fe, E9 e9, U2 u2, Rb rb, C1 c1, C4579bg c4579bg, com.ironsource.mediationsdk.adquality.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(c4649fe, e9, u2, rb, c1, c4579bg, aVar);
    }

    @Nullable
    public final com.ironsource.mediationsdk.adquality.a a() {
        return this.g;
    }

    @Nullable
    public final C1 b() {
        return this.e;
    }

    @Nullable
    public final U2 c() {
        return this.c;
    }

    @Nullable
    public final E9 d() {
        return this.b;
    }

    @Nullable
    public final Rb e() {
        return this.d;
    }

    @Nullable
    public final C4649fe f() {
        return this.a;
    }

    @Nullable
    public final C4579bg g() {
        return this.f;
    }

    @NotNull
    public String toString() {
        return "configurations(\n" + this.a + "\n" + this.b + "\n" + this.c + "\n" + this.d + ")";
    }

    private N3(C4649fe c4649fe, E9 e9, U2 u2, Rb rb, C1 c1, C4579bg c4579bg, com.ironsource.mediationsdk.adquality.a aVar) {
        this.a = c4649fe;
        this.b = e9;
        this.c = u2;
        this.d = rb;
        this.e = c1;
        this.f = c4579bg;
        this.g = aVar;
    }
}
