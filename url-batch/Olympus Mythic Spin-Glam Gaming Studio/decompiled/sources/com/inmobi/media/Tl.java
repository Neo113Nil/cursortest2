package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes12.dex */
public final class Tl extends ContinuationImpl {
    public XmlPullParser a;
    public String b;
    public Function1 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ C3979em e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tl(C3979em c3979em, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = c3979em;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a((XmlPullParser) null, (String) null, (Function1) null, this);
    }
}
