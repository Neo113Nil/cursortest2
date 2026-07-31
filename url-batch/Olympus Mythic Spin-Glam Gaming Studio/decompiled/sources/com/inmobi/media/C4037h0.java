package com.inmobi.media;

import android.os.SystemClock;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.h0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4037h0 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Map a;
    public final /* synthetic */ C4167m0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4037h0(C4167m0 c4167m0, Map map, Continuation continuation) {
        super(2, continuation);
        this.a = map;
        this.b = c4167m0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4037h0(this.b, this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Map map = this.a;
        return new C4037h0(this.b, map, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j;
        long elapsedRealtime;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Object obj2 = this.a.get(IronSourceConstants.EVENTS_ERROR_CODE);
        Short sh = obj2 instanceof Short ? (Short) obj2 : null;
        Map a = Hk.a(this.b.b);
        C4167m0 c4167m0 = this.b;
        if (sh != null && sh.shortValue() == 2138) {
            j = c4167m0.c.c;
            CoroutineScope coroutineScope = Hl.a;
            elapsedRealtime = SystemClock.elapsedRealtime();
        } else if ((sh == null || sh.shortValue() != 2139) && (sh == null || sh.shortValue() != 2203)) {
            j = c4167m0.c.a;
            CoroutineScope coroutineScope2 = Hl.a;
            elapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            j = c4167m0.c.e;
            CoroutineScope coroutineScope3 = Hl.a;
            elapsedRealtime = SystemClock.elapsedRealtime();
        }
        a.put("latency", Boxing.boxLong(elapsedRealtime - j));
        a.putAll(this.a);
        C4425vk c4425vk = C4425vk.a;
        C4425vk.b("AdLoadFailed", a, EnumC4530zk.a);
        return Unit.INSTANCE;
    }
}
