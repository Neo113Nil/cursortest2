package com.inmobi.media;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.wg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4447wg extends ContinuationImpl {
    public C4210ng a;
    public InterfaceC4421vg b;
    public C4053hg c;
    public /* synthetic */ Object d;
    public final /* synthetic */ AbstractC4500yg e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4447wg(AbstractC4500yg abstractC4500yg, Continuation continuation) {
        super(continuation);
        this.e = abstractC4500yg;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, this);
    }
}
