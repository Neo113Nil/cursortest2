package com.inmobi.media;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.jf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4104jf extends ContinuationImpl {
    public int a;
    public List b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C4288qf d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4104jf(C4288qf c4288qf, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = c4288qf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(this);
    }
}
