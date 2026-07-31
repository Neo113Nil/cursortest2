package com.ironsource;

import com.ironsource.AbstractC4638f3;
import com.ironsource.Gf;
import com.ironsource.InterfaceC4807ob;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes12.dex */
public final class Ja implements Ma {

    @NotNull
    private final Ca a;

    @NotNull
    private final L2 b;

    @NotNull
    private final L2 c;
    private final long d;
    private final boolean e;

    @Nullable
    private InterfaceC4807ob<LevelPlayAdInfo> f;

    @Nullable
    private Gf.a g;

    static final class a extends Lambda implements Function1 {
        public static final a a = new a();

        a() {
            super(1);
        }

        public final void a(@NotNull Ja weak) {
            Intrinsics.checkNotNullParameter(weak, "$this$weak");
            weak.e();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Ja) obj);
            return Unit.INSTANCE;
        }
    }

    public Ja(@NotNull Ca strategy, @NotNull L2 currentAdUnit, @NotNull L2 reloadingAdUnit, long j, boolean z) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadingAdUnit, "reloadingAdUnit");
        this.a = strategy;
        this.b = currentAdUnit;
        this.c = reloadingAdUnit;
        this.d = j;
        this.e = z;
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        InterfaceC4807ob<LevelPlayAdInfo> interfaceC4807ob = this.f;
        if (interfaceC4807ob == null) {
            Ca ca = this.a;
            ca.a((Ma) new La(ca, this.b, this.c, this.d, this.e));
        } else if (interfaceC4807ob instanceof InterfaceC4807ob.b) {
            a((LevelPlayAdInfo) ((InterfaceC4807ob.b) interfaceC4807ob).b());
        } else if (interfaceC4807ob instanceof InterfaceC4807ob.a) {
            b(((InterfaceC4807ob.a) interfaceC4807ob).b());
        }
    }

    private final void g() {
        Gf o = this.a.o();
        Gf.b a2 = Hf.a(this, a.a);
        Duration.Companion companion = Duration.Companion;
        this.g = o.a(a2, DurationKt.toDuration(this.a.l(), DurationUnit.MILLISECONDS));
    }

    @Override // com.ironsource.Ma
    public void b() {
        this.a.a("Loading an ad while reloading");
    }

    @Override // com.ironsource.Ma
    public void c() {
        Gf.a aVar = this.g;
        if (aVar != null) {
            aVar.a();
        }
        this.b.a(true);
        this.c.a(true);
        Ca ca = this.a;
        ca.a((Ma) new Fa(ca));
    }

    @Override // com.ironsource.Ma
    public void d() {
        Gf.a aVar = this.g;
        if (aVar != null) {
            aVar.a();
        }
        Ca ca = this.a;
        ca.a((Ma) new Ia(ca, this.b));
    }

    @Override // com.ironsource.Ma
    public void f() {
        Ca ca = this.a;
        ca.a((Ma) new Ja(ca, this.b, this.c, ca.p().a(), false, 16, null));
    }

    private final void b(IronSourceError ironSourceError) {
        this.a.a(ironSourceError, this.b, (AbstractC4638f3) new AbstractC4638f3.c(this.a.p().a() - this.d, AbstractC4638f3.d.g.a), this.e, false, Long.valueOf(this.d));
    }

    @Override // com.ironsource.M0
    public void a(@NotNull C4903u0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        LevelPlayAdInfo c = adUnitCallback.c();
        if (c != null) {
            a(new InterfaceC4807ob.b(c));
        } else {
            a(new InterfaceC4807ob.a(new IronSourceError(0, "Missing ad info")));
        }
    }

    @Override // com.ironsource.M0
    public void a(@Nullable IronSourceError ironSourceError) {
        if (ironSourceError == null) {
            ironSourceError = new IronSourceError(0, "Unknown error");
        }
        a(new InterfaceC4807ob.a(ironSourceError));
    }

    private final void a(LevelPlayAdInfo levelPlayAdInfo) {
        long a2 = this.a.p().a() - this.d;
        this.a.a(new C4903u0(this.c, levelPlayAdInfo), this.c, this.b, (AbstractC4638f3) new AbstractC4638f3.c(a2, AbstractC4638f3.d.h.a), false, Long.valueOf(this.d));
    }

    public /* synthetic */ Ja(Ca ca, L2 l2, L2 l22, long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ca, l2, l22, j, (i & 16) != 0 ? true : z);
    }

    private final void a(InterfaceC4807ob<LevelPlayAdInfo> interfaceC4807ob) {
        String b;
        if (this.f != null) {
            Ca ca = this.a;
            b = Ka.b(interfaceC4807ob);
            ca.a("Received excessive load " + b + " while reloading");
            return;
        }
        this.f = interfaceC4807ob;
    }
}
