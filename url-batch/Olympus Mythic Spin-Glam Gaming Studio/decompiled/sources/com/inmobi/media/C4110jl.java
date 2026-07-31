package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;

/* renamed from: com.inmobi.media.jl, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4110jl extends ContinuationImpl {
    public int a;
    public String b;
    public Mutex c;
    public /* synthetic */ Object d;
    public final /* synthetic */ C4162ll e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4110jl(C4162ll c4162ll, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = c4162ll;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(0, null, this);
    }
}
