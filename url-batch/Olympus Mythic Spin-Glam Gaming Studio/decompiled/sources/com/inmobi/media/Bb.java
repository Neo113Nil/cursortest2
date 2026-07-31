package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;

/* loaded from: classes11.dex */
public final class Bb extends ContinuationImpl {
    public String a;
    public Mutex b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Cb d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bb(Cb cb, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = cb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
