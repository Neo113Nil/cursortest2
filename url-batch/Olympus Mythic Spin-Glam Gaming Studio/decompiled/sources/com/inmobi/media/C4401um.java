package com.inmobi.media;

import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.um, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4401um extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ C4427vm b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4401um(C4427vm c4427vm, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = c4427vm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a((String) null, (ArrayList) null, this);
    }
}
