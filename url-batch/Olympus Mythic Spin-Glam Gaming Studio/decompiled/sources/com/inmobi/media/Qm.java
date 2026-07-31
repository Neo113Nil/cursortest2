package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class Qm extends ContinuationImpl {
    public AdConfig.VastVideoConfig a;
    public /* synthetic */ Object b;
    public int c;

    public Qm(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return Vm.a(null, 0.0d, null, this);
    }
}
