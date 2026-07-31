package com.inmobi.media;

import android.content.Context;
import android.view.Surface;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.w8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4439w8 {
    public final CoroutineScope a;
    public final ExoPlayer b;
    public final ArrayList c;
    public final X7 d;
    public Surface e;
    public InterfaceC4057hk f;
    public boolean g;
    public final C4413v8 h;

    public C4439w8(CoroutineScope coroutineScope, ExoPlayer mediaPlayer, K1 mediaPlayerLayout, InterfaceC4466x9 interfaceC4466x9) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(mediaPlayer, "mediaPlayer");
        Intrinsics.checkNotNullParameter(mediaPlayerLayout, "mediaPlayerLayout");
        this.a = coroutineScope;
        this.b = mediaPlayer;
        this.c = new ArrayList();
        Context context = mediaPlayerLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.d = new X7(new C4252p5(context), mediaPlayerLayout, mediaPlayer, interfaceC4466x9);
        this.h = new C4413v8(this);
    }

    public final void a() {
        X4.a(this.c);
        X7 x7 = this.d;
        x7.e = null;
        x7.a.setSurfaceTextureListener(null);
        Surface surface = this.e;
        if (surface != null) {
            surface.release();
        }
        this.e = null;
        this.f = null;
    }
}
