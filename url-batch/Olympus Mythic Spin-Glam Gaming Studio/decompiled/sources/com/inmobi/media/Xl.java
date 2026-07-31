package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes13.dex */
public final class Xl extends ContinuationImpl {
    public Ref$BooleanRef a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C3979em c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xl(C3979em c3979em, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c3979em;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((XmlPullParser) null, this);
    }
}
