package com.inmobi.media;

import android.media.MediaPlayer;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.en, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3980en extends ContinuationImpl {
    public MediaPlayer a;
    public InterfaceC4466x9 b;
    public Iterator c;
    public String d;
    public /* synthetic */ Object e;
    public int f;

    public C3980en(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.f |= Integer.MIN_VALUE;
        return AbstractC4164ln.a((MediaPlayer) null, (ArrayList) null, (C4493y9) null, this);
    }
}
