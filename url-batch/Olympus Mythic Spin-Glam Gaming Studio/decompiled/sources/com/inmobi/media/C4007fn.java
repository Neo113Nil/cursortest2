package com.inmobi.media;

import androidx.media3.exoplayer.ExoPlayer;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.fn, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4007fn extends ContinuationImpl {
    public ExoPlayer a;
    public InterfaceC4466x9 b;
    public P2 c;
    public Iterator d;
    public String e;
    public boolean f;
    public int g;
    public int h;
    public /* synthetic */ Object i;
    public int j;

    public C4007fn(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return AbstractC4164ln.a((ExoPlayer) null, (ArrayList) null, (InterfaceC4466x9) null, (P2) null, false, (ContinuationImpl) this);
    }
}
