package com.inmobi.media;

import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class Rb extends ContinuationImpl {
    public Iterator a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Wb d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rb(Wb wb, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = wb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a((Db) null, this);
    }
}
