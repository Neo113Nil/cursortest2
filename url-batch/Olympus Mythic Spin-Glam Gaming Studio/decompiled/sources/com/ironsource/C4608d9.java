package com.ironsource;

import com.ironsource.C4590c9;
import com.ironsource.InterfaceC4818p4;
import com.ironsource.Mb;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.d9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4608d9 {

    @NotNull
    private final InterfaceC4818p4 a;

    @NotNull
    private final Mb.a b;

    @Nullable
    private Long c;

    @Nullable
    private Long d;

    @Nullable
    private Mb e;

    @Nullable
    private C4590c9 f;

    /* JADX WARN: Multi-variable type inference failed */
    public C4608d9() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Nullable
    public final C4590c9 a() {
        return this.f;
    }

    @Nullable
    public final C4590c9 b() {
        Long l = this.d;
        if (l != null) {
            long longValue = l.longValue();
            Long l2 = this.c;
            if (l2 != null) {
                long longValue2 = l2.longValue();
                if (this.e == null) {
                    return null;
                }
                long a = this.a.a();
                Mb mb = this.b.get();
                C4590c9 c4590c9 = new C4590c9(a - longValue, new C4590c9.a(Math.max(0L, mb.d() - r1.d()), Math.max(0L, mb.e() - r1.e()), Math.max(0L, mb.f() - r1.f())), longValue2 / 1024);
                this.f = c4590c9;
                return c4590c9;
            }
        }
        return null;
    }

    public C4608d9(@NotNull InterfaceC4818p4 currentTimeProvider, @NotNull Mb.a memoryInfoProvider) {
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(memoryInfoProvider, "memoryInfoProvider");
        this.a = currentTimeProvider;
        this.b = memoryInfoProvider;
    }

    public final void a(@NotNull String serverResponse) {
        Intrinsics.checkNotNullParameter(serverResponse, "serverResponse");
        this.c = Long.valueOf(serverResponse.length());
        this.e = this.b.get();
        this.d = Long.valueOf(this.a.a());
    }

    public /* synthetic */ C4608d9(InterfaceC4818p4 interfaceC4818p4, Mb.a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new InterfaceC4818p4.a() : interfaceC4818p4, (i & 2) != 0 ? new Mb.a.C0348a() : aVar);
    }
}
