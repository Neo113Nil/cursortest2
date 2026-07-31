package com.inmobi.media;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* renamed from: com.inmobi.media.ob, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4232ob extends AbstractC4353t1 {
    public final C4248p1 b;
    public final Nc c;
    public Job d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4232ob(C4248p1 adManagerComponent, Nc stateMachine) {
        super(adManagerComponent);
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.b = adManagerComponent;
        this.c = stateMachine;
    }

    public static final Unit a(C4232ob c4232ob) {
        c4232ob.c.e();
        return Unit.INSTANCE;
    }

    @Override // com.inmobi.media.AbstractC4353t1
    public final void b() {
        g();
    }

    @Override // com.inmobi.media.AbstractC4353t1
    public final void d() {
        g();
    }

    @Override // com.inmobi.media.AbstractC4353t1
    public final void e() {
        P6.a(this.d);
        this.d = null;
    }

    public final void g() {
        Job launch$default;
        long j = this.a.c;
        CoroutineScope coroutineScope = this.b.e;
        Function0 timeOutCallback = new Function0() { // from class: com.inmobi.media.ob$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return C4232ob.a(C4232ob.this);
            }
        };
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(timeOutCallback, "timeOutCallback");
        launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new Rk(j, timeOutCallback, null), 3, null);
        this.d = launch$default;
    }

    @Override // com.inmobi.media.AbstractC4353t1
    public final void a() {
        P6.a(this.d);
        this.d = null;
    }
}
