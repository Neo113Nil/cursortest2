package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.AdConfig;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.zf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4525zf extends ContinuationImpl {
    public AdConfig.OmidConfig a;
    public Context b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Df d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4525zf(Df df, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = df;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(this);
    }
}
