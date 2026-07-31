package com.inmobi.media;

import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* renamed from: com.inmobi.media.a8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C3859a8 {
    public final CoroutineScope a;
    public final ExoPlayer b;
    public final MutableSharedFlow c;
    public final U1 d;
    public boolean e;

    public C3859a8(Context context, CoroutineScope coroutineScope, ExoPlayer exoPlayer, boolean z, MutableSharedFlow playerEventsFlow) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(exoPlayer, "exoPlayer");
        Intrinsics.checkNotNullParameter(playerEventsFlow, "playerEventsFlow");
        this.a = coroutineScope;
        this.b = exoPlayer;
        this.c = playerEventsFlow;
        U1 u1 = new U1(context);
        this.d = u1;
        this.e = z;
        Y7 listener = new Y7(this);
        Intrinsics.checkNotNullParameter(listener, "listener");
        u1.c = new WeakReference(listener);
    }

    public final void a() {
        this.b.setVolume(0.0f);
        X4.a(this.c, this.a, new W1(0.0f, true));
        this.e = true;
    }
}
