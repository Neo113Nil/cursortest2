package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.og, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4237og extends ContinuationImpl {
    public C4053hg a;
    public Function2 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ AbstractC4263pg d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4237og(AbstractC4263pg abstractC4263pg, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = abstractC4263pg;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, null, this);
    }
}
