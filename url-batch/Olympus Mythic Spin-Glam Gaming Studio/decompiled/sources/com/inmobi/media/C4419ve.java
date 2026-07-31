package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.ve, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4419ve extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ He b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4419ve(He he, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = he;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
