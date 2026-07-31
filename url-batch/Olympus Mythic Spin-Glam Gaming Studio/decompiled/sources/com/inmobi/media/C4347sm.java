package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.sm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4347sm extends ContinuationImpl {
    public Pl a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C4427vm c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4347sm(C4427vm c4427vm, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c4427vm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
