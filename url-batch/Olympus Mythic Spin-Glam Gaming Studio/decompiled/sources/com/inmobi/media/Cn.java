package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public final class Cn extends ContinuationImpl {
    public int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ En d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cn(En en, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = en;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return En.a(this.d, this);
    }
}
