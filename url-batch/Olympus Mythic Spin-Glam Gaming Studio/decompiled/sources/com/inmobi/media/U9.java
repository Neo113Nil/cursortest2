package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUnifiedIdService;
import com.inmobi.unifiedId.InMobiUserDataModel;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class U9 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;

    public U9(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        a = InMobiUnifiedIdService.a((InMobiUserDataModel) null, this);
        return a;
    }
}
