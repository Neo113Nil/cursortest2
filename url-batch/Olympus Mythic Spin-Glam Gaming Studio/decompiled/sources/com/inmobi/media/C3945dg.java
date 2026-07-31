package com.inmobi.media;

import android.app.Activity;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;

/* renamed from: com.inmobi.media.dg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C3945dg extends ContinuationImpl {
    public Activity a;
    public Mutex b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C3999fg d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3945dg(C3999fg c3999fg, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = c3999fg;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
