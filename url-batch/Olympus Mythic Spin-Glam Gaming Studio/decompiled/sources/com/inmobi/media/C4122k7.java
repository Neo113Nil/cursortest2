package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* renamed from: com.inmobi.media.k7, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* synthetic */ class C4122k7 extends FunctionReferenceImpl implements Function2 {
    public C4122k7(Object obj) {
        super(2, obj, C4385u7.class, "handleResultInternal", "handleResultInternal(Lcom/inmobi/media/pingsv2/executor/PingExecutor$PingResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object a = ((C4385u7) this.receiver).b.a((C4210ng) obj, (Continuation) obj2);
        return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Unit.INSTANCE;
    }
}
