package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.ads.nativeAd.MediaView;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* renamed from: com.inmobi.media.yc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4496yc {
    public final C4493y9 a;
    public AbstractC4223o2 b;
    public final MediaView c;
    public final F6 d;
    public final MutableSharedFlow e;

    public C4496yc(Context context, CoroutineScope coroutineScope, C4493y9 c4493y9) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.a = c4493y9;
        MutableSharedFlow MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.c = new MediaView(context);
        this.d = new F6(context, coroutineScope, MutableSharedFlow$default, c4493y9);
        this.e = MutableSharedFlow$default;
    }

    public final Object a(G6 g6, ContinuationImpl continuationImpl) {
        C4493y9 c4493y9 = this.a;
        if (c4493y9 != null) {
            c4493y9.a("MediaViewManager", "load called - experienceModel: " + g6);
        }
        return this.b != null ? this.c : BuildersKt.withContext(Dispatchers.getIO(), new C4470xc(this, g6, null), continuationImpl);
    }
}
