package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;

/* renamed from: com.inmobi.media.pf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4262pf extends ContinuationImpl {
    public Mutex a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C4288qf c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4262pf(C4288qf c4288qf, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c4288qf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(this);
    }
}
