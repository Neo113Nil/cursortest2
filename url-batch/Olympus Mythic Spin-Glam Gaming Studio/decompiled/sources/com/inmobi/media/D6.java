package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.OmSdkInfo;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes11.dex */
public final class D6 extends ContinuationImpl {
    public List a;
    public OmSdkInfo b;
    public /* synthetic */ Object c;
    public final /* synthetic */ E6 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D6(E6 e6, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = e6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
