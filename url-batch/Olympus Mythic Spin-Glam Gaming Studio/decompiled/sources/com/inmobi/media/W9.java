package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUnifiedIdService;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class W9 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;

    public W9(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return InMobiUnifiedIdService.access$resetInternal(this);
    }
}
