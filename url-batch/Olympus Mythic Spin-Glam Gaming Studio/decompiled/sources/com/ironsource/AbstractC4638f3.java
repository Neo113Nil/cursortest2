package com.ironsource;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.f3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC4638f3 implements InterfaceC4767m7 {

    /* renamed from: com.ironsource.f3$a */
    public static final class a extends AbstractC4638f3 {

        @NotNull
        private final b a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull b firstReason) {
            super(null);
            Intrinsics.checkNotNullParameter(firstReason, "firstReason");
            this.a = firstReason;
        }

        @NotNull
        public final a a(@NotNull b firstReason) {
            Intrinsics.checkNotNullParameter(firstReason, "firstReason");
            return new a(firstReason);
        }

        @NotNull
        public final b d() {
            return this.a;
        }

        @NotNull
        public final b e() {
            return this.a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.a, ((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public String toString() {
            return "First(firstReason=" + this.a + ")";
        }

        public static /* synthetic */ a a(a aVar, b bVar, int i, Object obj) {
            if ((i & 1) != 0) {
                bVar = aVar.a;
            }
            return aVar.a(bVar);
        }
    }

    /* renamed from: com.ironsource.f3$b */
    public static abstract class b implements InterfaceC4767m7 {

        /* renamed from: com.ironsource.f3$b$a */
        public static final class a extends b {

            @NotNull
            public static final a a = new a();

            private a() {
                super(null);
            }
        }

        /* renamed from: com.ironsource.f3$b$b, reason: collision with other inner class name */
        public static final class C1360b extends b {

            @NotNull
            public static final C1360b a = new C1360b();

            private C1360b() {
                super(null);
            }
        }

        /* renamed from: com.ironsource.f3$b$c */
        public static final class c extends b {

            @NotNull
            public static final c a = new c();

            private c() {
                super(null);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.ironsource.InterfaceC4767m7
        @NotNull
        public String a() {
            if (this instanceof a) {
                return "PublisherLoadFail";
            }
            if (this instanceof C1360b) {
                return "PublisherLoadSuccess";
            }
            if (this instanceof c) {
                return "ResumeAutoRefresh";
            }
            throw new NoWhenBranchMatchedException();
        }

        private b() {
        }
    }

    /* renamed from: com.ironsource.f3$c */
    public static final class c extends AbstractC4638f3 {
        private final long a;

        @NotNull
        private final d b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j, @NotNull d recurringReason) {
            super(null);
            Intrinsics.checkNotNullParameter(recurringReason, "recurringReason");
            this.a = j;
            this.b = recurringReason;
        }

        @NotNull
        public final c a(long j, @NotNull d recurringReason) {
            Intrinsics.checkNotNullParameter(recurringReason, "recurringReason");
            return new c(j, recurringReason);
        }

        public final long d() {
            return this.a;
        }

        @NotNull
        public final d e() {
            return this.b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && Intrinsics.areEqual(this.b, cVar.b);
        }

        @NotNull
        public final d f() {
            return this.b;
        }

        public final long g() {
            return this.a;
        }

        public int hashCode() {
            return (Long.hashCode(this.a) * 31) + this.b.hashCode();
        }

        @NotNull
        public String toString() {
            return "Recurring(reloadDuration=" + this.a + ", recurringReason=" + this.b + ")";
        }

        public static /* synthetic */ c a(c cVar, long j, d dVar, int i, Object obj) {
            if ((i & 1) != 0) {
                j = cVar.a;
            }
            if ((i & 2) != 0) {
                dVar = cVar.b;
            }
            return cVar.a(j, dVar);
        }
    }

    /* renamed from: com.ironsource.f3$d */
    public static abstract class d implements InterfaceC4767m7 {

        /* renamed from: com.ironsource.f3$d$a */
        public static final class a extends d {

            @NotNull
            public static final a a = new a();

            private a() {
                super(null);
            }
        }

        /* renamed from: com.ironsource.f3$d$b */
        public static final class b extends d {

            @NotNull
            public static final b a = new b();

            private b() {
                super(null);
            }
        }

        /* renamed from: com.ironsource.f3$d$c */
        public static final class c extends d {

            @NotNull
            public static final c a = new c();

            private c() {
                super(null);
            }
        }

        /* renamed from: com.ironsource.f3$d$d, reason: collision with other inner class name */
        public static final class C1361d extends d {

            @NotNull
            public static final C1361d a = new C1361d();

            private C1361d() {
                super(null);
            }
        }

        /* renamed from: com.ironsource.f3$d$e */
        public static final class e extends d {

            @NotNull
            public static final e a = new e();

            private e() {
                super(null);
            }
        }

        /* renamed from: com.ironsource.f3$d$f */
        public static final class f extends d {
            private final long a;

            public f(long j) {
                super(null);
                this.a = j;
            }

            @NotNull
            public final f a(long j) {
                return new f(j);
            }

            public final long c() {
                return this.a;
            }

            public final long d() {
                return this.a;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && this.a == ((f) obj).a;
            }

            public int hashCode() {
                return Long.hashCode(this.a);
            }

            @NotNull
            public String toString() {
                return "ResumeVisibility(notVisibleDuration=" + this.a + ")";
            }

            public static /* synthetic */ f a(f fVar, long j, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = fVar.a;
                }
                return fVar.a(j);
            }
        }

        /* renamed from: com.ironsource.f3$d$g */
        public static final class g extends d {

            @NotNull
            public static final g a = new g();

            private g() {
                super(null);
            }
        }

        /* renamed from: com.ironsource.f3$d$h */
        public static final class h extends d {

            @NotNull
            public static final h a = new h();

            private h() {
                super(null);
            }
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.ironsource.InterfaceC4767m7
        @NotNull
        public String a() {
            if (this instanceof f) {
                return "ResumeVisibility";
            }
            if (this instanceof a) {
                return "PublisherLoadFail";
            }
            if (this instanceof b) {
                return "PublisherLoadSuccess";
            }
            if (this instanceof e) {
                return "ResumeAutoRefresh";
            }
            if (this instanceof c) {
                return "ReloadFailAfterTimer";
            }
            if (this instanceof C1361d) {
                return "ReloadSuccessAfterTimer";
            }
            if (this instanceof g) {
                return "TimerAfterReloadFail";
            }
            if (this instanceof h) {
                return "TimerAfterReloadSuccess";
            }
            throw new NoWhenBranchMatchedException();
        }

        public final long b() {
            if (this instanceof f) {
                return ((f) this).d();
            }
            return 0L;
        }

        private d() {
        }
    }

    public /* synthetic */ AbstractC4638f3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // com.ironsource.InterfaceC4767m7
    @NotNull
    public String a() {
        if (this instanceof a) {
            return ((a) this).e().a();
        }
        if (this instanceof c) {
            return ((c) this).f().a();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final long b() {
        if (this instanceof a) {
            return 0L;
        }
        if (this instanceof c) {
            return ((c) this).f().b();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final long c() {
        if (this instanceof a) {
            return 0L;
        }
        if (this instanceof c) {
            return ((c) this).g();
        }
        throw new NoWhenBranchMatchedException();
    }

    private AbstractC4638f3() {
    }
}
