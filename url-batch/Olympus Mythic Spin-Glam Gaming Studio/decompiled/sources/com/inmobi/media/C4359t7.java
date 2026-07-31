package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;

/* renamed from: com.inmobi.media.t7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4359t7 extends ContinuationImpl {
    public Mutex a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C4385u7 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4359t7(C4385u7 c4385u7, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c4385u7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.e(this);
    }
}
