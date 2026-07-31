package com.inmobi.media;

import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.tg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4368tg extends ContinuationImpl {
    public Iterator a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C4395ug c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4368tg(C4395ug c4395ug, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c4395ug;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((String) null, this);
    }
}
