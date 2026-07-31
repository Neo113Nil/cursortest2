package com.ogury.ad.internal;

import android.graphics.Bitmap;
import android.webkit.WebView;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class xh extends ContinuationImpl {
    public Bitmap a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ci c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh(ci ciVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = ciVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((WebView) null, 0, 0, this);
    }
}
