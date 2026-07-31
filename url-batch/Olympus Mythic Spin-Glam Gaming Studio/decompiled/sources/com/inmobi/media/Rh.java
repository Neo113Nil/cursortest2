package com.inmobi.media;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class Rh extends ContinuationImpl {
    public List a;
    public ArrayList b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Sh d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rh(Sh sh, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = sh;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a((InterfaceC3892bf) null, (List) null, this);
    }
}
