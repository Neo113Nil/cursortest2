package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;

/* renamed from: com.inmobi.media.yb, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4495yb extends ContinuationImpl {
    public Mutex a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C4521zb c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4495yb(C4521zb c4521zb, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c4521zb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
