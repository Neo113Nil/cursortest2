package com.inmobi.media;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.sn, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4348sn extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ C4375tn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4348sn(C4375tn c4375tn, Continuation continuation) {
        super(continuation);
        this.c = c4375tn;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
