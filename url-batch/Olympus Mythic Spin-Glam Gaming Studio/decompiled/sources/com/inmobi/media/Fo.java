package com.inmobi.media;

import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public final class Fo extends ContinuationImpl {
    public String a;
    public InterfaceC4466x9 b;
    public Map c;
    public String d;
    public InterfaceC3892bf e;
    public long f;
    public /* synthetic */ Object g;
    public final /* synthetic */ Io h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fo(Io io2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.h = io2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(null, null, this);
    }
}
