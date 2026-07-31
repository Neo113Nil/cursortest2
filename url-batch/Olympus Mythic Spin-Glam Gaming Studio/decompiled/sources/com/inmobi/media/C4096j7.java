package com.inmobi.media;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.j7, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4096j7 extends ContinuationImpl {
    public int a;
    public List b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C4385u7 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4096j7(C4385u7 c4385u7, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = c4385u7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(this);
    }
}
