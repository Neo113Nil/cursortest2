package com.inmobi.media;

import com.safedk.android.internal.partials.InMobiVideoBridge;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* loaded from: classes12.dex */
public final class M7 extends SuspendLambda implements Function2 {
    public final /* synthetic */ V7 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M7(Continuation continuation, V7 v7) {
        super(2, continuation);
        this.a = v7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new M7(continuation, this.a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new M7((Continuation) obj2, this.a).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Job launch$default;
        Job launch$default2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (this.a.b() == Jg.f) {
            this.a.p.seekTo(0L);
            V7 v7 = this.a;
            v7.l.set(Jg.c);
        }
        C3859a8 c3859a8 = this.a.y;
        if (c3859a8.e) {
            c3859a8.a();
            c3859a8.d.a();
        } else {
            X4.a(c3859a8.a, new Z7(c3859a8, null));
        }
        C6 c6 = this.a.x;
        if (!c6.d.getAndSet(true)) {
            CoroutineScope coroutineScope = c6.b;
            long j = c6.k;
            A6 action = new A6(c6, null);
            Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
            Intrinsics.checkNotNullParameter(action, "action");
            launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain().getImmediate(), null, new K3(j, null, action), 2, null);
            c6.e = launch$default;
            CoroutineScope coroutineScope2 = c6.b;
            long j2 = c6.l;
            B6 action2 = new B6(c6, null);
            Intrinsics.checkNotNullParameter(coroutineScope2, "<this>");
            Intrinsics.checkNotNullParameter(action2, "action");
            launch$default2 = BuildersKt__Builders_commonKt.launch$default(coroutineScope2, Dispatchers.getMain().getImmediate(), null, new K3(j2, null, action2), 2, null);
            c6.f = launch$default2;
        }
        InMobiVideoBridge.exoPlayer3Play(this.a.p);
        V7 v72 = this.a;
        v72.l.set(Jg.d);
        V7 v73 = this.a;
        v73.a(new Gn(v73.p.getCurrentPosition()));
        return Unit.INSTANCE;
    }
}
