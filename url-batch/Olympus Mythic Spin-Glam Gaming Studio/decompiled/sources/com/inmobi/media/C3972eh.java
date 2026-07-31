package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.eh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C3972eh extends ContinuationImpl {
    public JSONObject a;
    public Mutex b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C4000fh d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3972eh(C4000fh c4000fh, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = c4000fh;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a((JSONObject) null, this);
    }
}
