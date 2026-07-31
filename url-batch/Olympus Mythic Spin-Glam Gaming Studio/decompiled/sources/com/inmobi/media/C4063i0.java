package com.inmobi.media;

import android.os.SystemClock;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.i0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4063i0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ G a;
    public final /* synthetic */ C4167m0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4063i0(G g, C4167m0 c4167m0, Continuation continuation) {
        super(2, continuation);
        this.a = g;
        this.b = c4167m0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4063i0(this.a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4063i0(this.a, this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Map a = Hk.a(this.a);
        C4167m0 c4167m0 = this.b;
        a.put("networkType", F5.o());
        long j = c4167m0.c.f;
        CoroutineScope coroutineScope = Hl.a;
        a.put("latency", Boxing.boxLong(SystemClock.elapsedRealtime() - j));
        C4425vk c4425vk = C4425vk.a;
        C4425vk.b("ParseSuccess", a, EnumC4530zk.a);
        return Unit.INSTANCE;
    }
}
