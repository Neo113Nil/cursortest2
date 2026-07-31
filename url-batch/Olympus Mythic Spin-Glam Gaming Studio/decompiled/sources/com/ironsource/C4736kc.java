package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.kc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4736kc {

    @NotNull
    public static final a e = new a(null);

    @Nullable
    private static volatile C4736kc f;

    @Nullable
    private Md a;

    @NotNull
    private final AtomicBoolean b;

    @NotNull
    private String c;

    @Nullable
    private N3 d;

    /* renamed from: com.ironsource.kc$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final C4736kc a() {
            C4736kc c4736kc = C4736kc.f;
            if (c4736kc == null) {
                synchronized (this) {
                    c4736kc = C4736kc.f;
                    if (c4736kc == null) {
                        c4736kc = new C4736kc(null);
                        C4736kc.f = c4736kc;
                    }
                }
            }
            return c4736kc;
        }

        private a() {
        }

        @NotNull
        public final InterfaceC4654g1 a(@NotNull IronSource.a adFormat) {
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            C4736kc c4736kc = C4736kc.f;
            N3 b = c4736kc != null ? c4736kc.b() : null;
            C4736kc c4736kc2 = C4736kc.f;
            Md e = c4736kc2 != null ? c4736kc2.e() : null;
            if (b != null && e != null) {
                return new C4727k3(b, e, adFormat);
            }
            return new C4694i5();
        }
    }

    public /* synthetic */ C4736kc(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public static final C4736kc d() {
        return e.a();
    }

    @Nullable
    public final N3 b() {
        return this.d;
    }

    @NotNull
    public final AtomicBoolean c() {
        return this.b;
    }

    @Nullable
    public final Md e() {
        return this.a;
    }

    @NotNull
    public final String f() {
        return this.c;
    }

    public final void g() {
        this.b.set(true);
    }

    private C4736kc() {
        this.b = new AtomicBoolean(false);
        this.c = "";
    }

    public final void a(@Nullable Md md) {
        this.a = md;
    }

    public final void a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.c = str;
    }

    public final void a(@Nullable N3 n3) {
        this.d = n3;
    }
}
