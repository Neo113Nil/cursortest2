package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class Pm extends ContinuationImpl {
    public Ol a;
    public EnumC3944df b;
    public int c;
    public /* synthetic */ Object d;
    public int e;

    public Pm(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return Vm.a(null, 0.0d, null, 0, null, this);
    }
}
