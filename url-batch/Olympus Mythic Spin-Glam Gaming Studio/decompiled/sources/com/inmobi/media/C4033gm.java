package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.gm, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4033gm extends ContinuationImpl {
    public Ml a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C4059hm c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4033gm(C4059hm c4059hm, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c4059hm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, null, null, this);
    }
}
