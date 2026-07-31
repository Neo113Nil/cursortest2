package com.inmobi.media;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* loaded from: classes10.dex */
public final class F6 {
    public final Context a;
    public final CoroutineScope b;
    public final MutableSharedFlow c;
    public final C4493y9 d;

    public F6(Context context, CoroutineScope coroutineScope, MutableSharedFlow mediaEventFlow, C4493y9 c4493y9) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(mediaEventFlow, "mediaEventFlow");
        this.a = context;
        this.b = coroutineScope;
        this.c = mediaEventFlow;
        this.d = c4493y9;
    }
}
