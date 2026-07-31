package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes14.dex */
public final class Zl extends ContinuationImpl {
    public Ref$BooleanRef a;
    public Ref$BooleanRef b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C3979em d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Zl(C3979em c3979em, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = c3979em;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return C3979em.b(this.d, (XmlPullParser) null, this);
    }
}
