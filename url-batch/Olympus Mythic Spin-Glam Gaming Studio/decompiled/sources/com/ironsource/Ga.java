package com.ironsource;

import android.graphics.Rect;
import com.ironsource.AbstractC4638f3;
import com.ironsource.Gf;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes12.dex */
public final class Ga implements Ma {

    @NotNull
    private final Ca a;

    @NotNull
    private final L2 b;

    @Nullable
    private final Long c;

    @Nullable
    private Gf.a d;
    private final long e;

    static final class a extends Lambda implements Function0 {
        final /* synthetic */ AbstractC4638f3.c b;
        final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC4638f3.c cVar, long j) {
            super(0);
            this.b = cVar;
            this.c = j;
        }

        public final void a() {
            Ga.this.a.a(Ga.this.b, this.b, Long.valueOf(this.c));
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public Ga(@NotNull Ca strategy, @NotNull L2 currentAdUnit, @Nullable Long l) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.a = strategy;
        this.b = currentAdUnit;
        this.c = l;
        this.e = strategy.p().a();
        strategy.r();
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final Ga this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C4936vb.a(this$0.a.a(), new Runnable() { // from class: com.ironsource.Ga$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Ga.d(Ga.this);
            }
        }, 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Ga this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!Jg.a(this$0.a.k(), new Rect())) {
            this$0.e();
            return;
        }
        long a2 = this$0.a.p().a();
        long j = a2 - this$0.e;
        Long l = this$0.c;
        this$0.a.a().c(AbstractRunnableC4756le.a.a(this$0.new a(new AbstractC4638f3.c(l != null ? a2 - l.longValue() : 0L, new AbstractC4638f3.d.f(j)), a2)));
    }

    private final void e() {
        long q = this.a.q();
        Gf o = this.a.o();
        Runnable runnable = new Runnable() { // from class: com.ironsource.Ga$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Ga.c(Ga.this);
            }
        };
        Duration.Companion companion = Duration.Companion;
        this.d = o.a(runnable, DurationKt.toDuration(q, DurationUnit.MILLISECONDS));
    }

    @Override // com.ironsource.Ma
    public void f() {
    }

    @Override // com.ironsource.M0
    public void a(@NotNull C4903u0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        this.a.a("Received load success while paused not visible");
    }

    @Override // com.ironsource.Ma
    public void b() {
        this.a.a("Loading a loaded ad");
    }

    @Override // com.ironsource.Ma
    public void c() {
        Gf.a aVar = this.d;
        if (aVar != null) {
            aVar.a();
        }
        this.b.a(true);
        Ca ca = this.a;
        ca.a((Ma) new Fa(ca));
    }

    @Override // com.ironsource.M0
    public void a(@Nullable IronSourceError ironSourceError) {
        this.a.a("Received load success while paused not visible");
    }

    @Override // com.ironsource.Ma
    public void d() {
        Gf.a aVar = this.d;
        if (aVar != null) {
            aVar.a();
        }
        Ca ca = this.a;
        ca.a((Ma) new Ia(ca, this.b));
    }
}
