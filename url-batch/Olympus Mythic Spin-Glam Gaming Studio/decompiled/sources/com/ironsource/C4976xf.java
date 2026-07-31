package com.ironsource;

import com.ironsource.InterfaceC4839q7;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.xf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4976xf implements InterfaceC4839q7, InterfaceC4839q7.a {

    @NotNull
    private final InterfaceC4818p4 a;

    @NotNull
    private final Q8 b;

    @NotNull
    private final Map<String, C4922uf> c;

    /* renamed from: com.ironsource.xf$a */
    public static final class a {
        private int a;
        private long b;

        @Nullable
        private Long c;

        public a(int i, long j, @Nullable Long l) {
            this.a = i;
            this.b = j;
            this.c = l;
        }

        public final int a() {
            return this.a;
        }

        public final long b() {
            return this.b;
        }

        @Nullable
        public final Long c() {
            return this.c;
        }

        public final int d() {
            return this.a;
        }

        public final long e() {
            return this.b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && Intrinsics.areEqual(this.c, aVar.c);
        }

        @Nullable
        public final Long f() {
            return this.c;
        }

        public int hashCode() {
            int hashCode = ((Integer.hashCode(this.a) * 31) + Long.hashCode(this.b)) * 31;
            Long l = this.c;
            return hashCode + (l == null ? 0 : l.hashCode());
        }

        @NotNull
        public String toString() {
            return "ShowCountCappingInfo(currentNumberOfShows=" + this.a + ", currentTime=" + this.b + ", currentTimeThreshold=" + this.c + ")";
        }

        @NotNull
        public final a a(int i, long j, @Nullable Long l) {
            return new a(i, j, l);
        }

        public static /* synthetic */ a a(a aVar, int i, long j, Long l, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = aVar.a;
            }
            if ((i2 & 2) != 0) {
                j = aVar.b;
            }
            if ((i2 & 4) != 0) {
                l = aVar.c;
            }
            return aVar.a(i, j, l);
        }

        public final void a(int i) {
            this.a = i;
        }

        public final void a(long j) {
            this.b = j;
        }

        public final void a(@Nullable Long l) {
            this.c = l;
        }
    }

    public C4976xf(@NotNull InterfaceC4818p4 currentTimeProvider, @NotNull Q8 serviceDataRepository) {
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(serviceDataRepository, "serviceDataRepository");
        this.a = currentTimeProvider;
        this.b = serviceDataRepository;
        this.c = new LinkedHashMap();
    }

    private final a c(String str) {
        return new a(this.b.a(str), this.a.a(), this.b.b(str));
    }

    @NotNull
    public final Map<String, C4922uf> a() {
        return this.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r4 >= (r2 != null ? r2.longValue() : 0)) goto L13;
     */
    @Override // com.ironsource.InterfaceC4839q7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        C4922uf c4922uf = this.c.get(identifier);
        if (c4922uf == null) {
            return;
        }
        a c = c(identifier);
        if (c.d() != 0) {
            long e = c.e();
            Long f = c.f();
        }
        this.b.a(c.e() + H3.a(c4922uf.b(), null, 1, null), identifier);
        c.a(0);
        c.a(c.d() + 1);
        this.b.a(c.d(), identifier);
    }

    @Override // com.ironsource.InterfaceC4839q7
    @NotNull
    public G3 a(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        C4922uf c4922uf = this.c.get(identifier);
        return c4922uf == null ? new G3(false, null, 2, null) : a(c4922uf, identifier) ? new G3(true, I3.ShowCount) : new G3(false, null, 2, null);
    }

    private final boolean a(C4922uf c4922uf, String str) {
        a c = c(str);
        Long f = c.f();
        if (f != null) {
            return c.d() >= c4922uf.a() && this.a.a() < f.longValue();
        }
        return false;
    }

    @Override // com.ironsource.InterfaceC4839q7.a
    @NotNull
    public Object a(@NotNull String identifier, @NotNull I3 cappingType, @NotNull InterfaceC4803o7 cappingConfig) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
        Object c = cappingConfig.c();
        if (Result.m8029isSuccessimpl(c)) {
            C4922uf c4922uf = (C4922uf) c;
            if (c4922uf != null) {
                this.c.put(identifier, c4922uf);
            }
            return Result.m8023constructorimpl(Unit.INSTANCE);
        }
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(c);
        if (m8026exceptionOrNullimpl != null) {
            return Result.m8023constructorimpl(ResultKt.createFailure(m8026exceptionOrNullimpl));
        }
        return Result.m8023constructorimpl(Unit.INSTANCE);
    }
}
