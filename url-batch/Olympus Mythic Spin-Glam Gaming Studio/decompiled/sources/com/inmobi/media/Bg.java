package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes11.dex */
public final class Bg extends ContinuationImpl {
    public C4053hg a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Fg c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bg(Fg fg, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = fg;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((String) null, this);
    }
}
