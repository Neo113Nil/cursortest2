package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdResponse;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class R0 extends ContinuationImpl {
    public Object a;
    public AdResponse b;
    public Iterator c;
    public int d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ S0 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R0(S0 s0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.g = s0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(null, null, this);
    }
}
