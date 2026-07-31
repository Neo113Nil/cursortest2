package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUserDataModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;

/* renamed from: com.inmobi.media.h7, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4044h7 extends ContinuationImpl {
    public InMobiUserDataModel a;
    public Mutex b;
    public /* synthetic */ Object c;
    public int d;

    public C4044h7(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return C4070i7.a(null, this);
    }
}
