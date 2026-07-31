package com.inmobi.media;

import android.media.MediaPlayer;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.ie, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4077ie {
    public final C4252p5 a;
    public final RelativeLayout b;
    public final MediaPlayer c;
    public final C4493y9 d;
    public InterfaceC4031gk e;

    public C4077ie(C4252p5 textureView, RelativeLayout parentView, MediaPlayer mediaPlayer, C4493y9 c4493y9) {
        Intrinsics.checkNotNullParameter(textureView, "textureView");
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        Intrinsics.checkNotNullParameter(mediaPlayer, "mediaPlayer");
        this.a = textureView;
        this.b = parentView;
        this.c = mediaPlayer;
        this.d = c4493y9;
    }

    public final void a(InterfaceC4031gk surfaceTextureListener) {
        Intrinsics.checkNotNullParameter(surfaceTextureListener, "surfaceTextureListener");
        this.e = surfaceTextureListener;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13, -1);
        this.b.addView(this.a, layoutParams);
        a();
        int videoWidth = this.c.getVideoWidth();
        int videoHeight = this.c.getVideoHeight();
        if (videoHeight == 0) {
            this.a.setAspectRatio(1.0f);
        } else {
            this.a.setAspectRatio(videoWidth / videoHeight);
        }
        this.a.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC4051he(this));
    }

    public final void a() {
        this.c.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() { // from class: com.inmobi.media.ie$$ExternalSyntheticLambda0
            @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
            public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
                C4077ie.a(C4077ie.this, mediaPlayer, i, i2);
            }
        });
    }

    public static final void a(C4077ie c4077ie, MediaPlayer mediaPlayer, int i, int i2) {
        C4493y9 c4493y9 = c4077ie.d;
        if (c4493y9 != null) {
            c4493y9.a("NativePlayerTextureManager", "Video Size Changed: " + i + " x " + i2);
        }
        int videoWidth = c4077ie.c.getVideoWidth();
        int videoHeight = c4077ie.c.getVideoHeight();
        if (videoHeight == 0) {
            c4077ie.a.setAspectRatio(1.0f);
        } else {
            c4077ie.a.setAspectRatio(videoWidth / videoHeight);
        }
    }
}
