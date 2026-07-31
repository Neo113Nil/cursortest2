package com.inmobi.media;

import android.widget.FrameLayout;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class X7 {
    public final C4252p5 a;
    public final K1 b;
    public final ExoPlayer c;
    public final InterfaceC4466x9 d;
    public InterfaceC4031gk e;

    public X7(C4252p5 textureView, K1 parentView, ExoPlayer mediaPlayer, InterfaceC4466x9 interfaceC4466x9) {
        Intrinsics.checkNotNullParameter(textureView, "textureView");
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        Intrinsics.checkNotNullParameter(mediaPlayer, "mediaPlayer");
        this.a = textureView;
        this.b = parentView;
        this.c = mediaPlayer;
        this.d = interfaceC4466x9;
    }

    public final void a(int i, int i2) {
        InterfaceC4466x9 interfaceC4466x9 = this.d;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("HtmlPlayerTextureManager", "Video Size Changed: " + i + " x " + i2);
        }
        int i3 = this.c.getVideoSize().width;
        int i4 = this.c.getVideoSize().height;
        if (i4 == 0) {
            this.a.setAspectRatio(1.0f);
        } else {
            this.a.setAspectRatio(i3 / i4);
        }
    }

    public final void a(InterfaceC4031gk surfaceTextureListener) {
        Intrinsics.checkNotNullParameter(surfaceTextureListener, "surfaceTextureListener");
        this.e = surfaceTextureListener;
        this.b.addView(this.a, new FrameLayout.LayoutParams(-1, -1));
        int i = this.c.getVideoSize().width;
        int i2 = this.c.getVideoSize().height;
        if (i2 == 0) {
            this.a.setAspectRatio(1.0f);
        } else {
            this.a.setAspectRatio(i / i2);
        }
        this.a.setSurfaceTextureListener(new W7(this));
    }
}
