package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class U implements Ag {

    @NotNull
    private final String a;

    @Nullable
    private final InterfaceC4769m9 b;
    private final boolean c;

    static final class a extends Lambda implements Function0 {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError mo4828invoke() {
            return C4908u5.a.r();
        }
    }

    static final class b extends Lambda implements Function0 {
        public static final b a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError mo4828invoke() {
            return C4908u5.a.o();
        }
    }

    static final class c extends Lambda implements Function0 {
        public static final c a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError mo4828invoke() {
            return C4908u5.a.n();
        }
    }

    static final class d extends Lambda implements Function0 {
        public static final d a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError mo4828invoke() {
            return C4908u5.a.q();
        }
    }

    static final class e extends Lambda implements Function0 {
        public static final e a = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError mo4828invoke() {
            return C4908u5.a.o();
        }
    }

    static final class f extends Lambda implements Function0 {
        public static final f a = new f();

        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError mo4828invoke() {
            return C4908u5.a.g();
        }
    }

    public U(@NotNull String adm, @Nullable InterfaceC4769m9 interfaceC4769m9, boolean z) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        this.a = adm;
        this.b = interfaceC4769m9;
        this.c = z;
    }

    @Override // com.ironsource.Ag
    public void a() throws C4881se {
        a(this.c, a.a);
        a(this.b != null, b.a);
        InterfaceC4769m9 interfaceC4769m9 = this.b;
        if (interfaceC4769m9 != null) {
            if (interfaceC4769m9.f() == EnumC4823p9.NonBidder) {
                a(this.a.length() == 0, c.a);
            }
            if (interfaceC4769m9.f() == EnumC4823p9.Bidder) {
                a(this.a.length() > 0, d.a);
            }
            a(interfaceC4769m9.f() != EnumC4823p9.NotSupported, e.a);
            a(interfaceC4769m9.e().length() > 0, f.a);
        }
    }
}
