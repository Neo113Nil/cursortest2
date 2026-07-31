package com.inmobi.media;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class Ul extends ContinuationImpl {
    public List a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C3979em c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ul(C3979em c3979em, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c3979em;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((String) null, (ArrayList) null, this);
    }
}
