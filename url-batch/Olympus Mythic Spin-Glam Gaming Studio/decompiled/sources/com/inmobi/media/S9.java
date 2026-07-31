package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUnifiedIdService;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;

/* loaded from: classes13.dex */
public final class S9 extends ContinuationImpl {
    public Object a;
    public Mutex b;
    public /* synthetic */ Object c;
    public int d;

    public S9(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return InMobiUnifiedIdService.fetchUnifiedIdsInternal$media_release(null, this);
    }
}
