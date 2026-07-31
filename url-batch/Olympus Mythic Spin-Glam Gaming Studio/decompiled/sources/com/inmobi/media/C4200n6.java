package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.n6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4200n6 extends ContinuationImpl {
    public Zk a;
    public C4121k6 b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public long g;
    public /* synthetic */ Object h;
    public final /* synthetic */ C4358t6 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4200n6(C4358t6 c4358t6, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.i = c4358t6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return C4358t6.a(this.i, false, (ContinuationImpl) this);
    }
}
