package com.facebook.ads.redexgen.core;

import android.widget.MediaController;

/* renamed from: com.facebook.ads.redexgen.X.fd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3151fd implements MediaController.MediaPlayerControl {
    public final /* synthetic */ TextureViewSurfaceTextureListenerC2218Cz A00;

    public C3151fd(TextureViewSurfaceTextureListenerC2218Cz textureViewSurfaceTextureListenerC2218Cz) {
        this.A00 = textureViewSurfaceTextureListenerC2218Cz;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekBackward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekForward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getAudioSessionId() {
        C3145fX c3145fX;
        C3145fX c3145fX2;
        c3145fX = this.A00.A0C;
        if (c3145fX == null) {
            return 0;
        }
        c3145fX2 = this.A00.A0C;
        return c3145fX2.A04();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getBufferPercentage() {
        C3145fX c3145fX;
        C3145fX c3145fX2;
        c3145fX = this.A00.A0C;
        if (c3145fX == null) {
            return 0;
        }
        c3145fX2 = this.A00.A0C;
        return c3145fX2.A05();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getCurrentPosition() {
        return this.A00.getCurrentPosition();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getDuration() {
        return this.A00.getDuration();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean isPlaying() {
        C3145fX c3145fX;
        C3145fX c3145fX2;
        c3145fX = this.A00.A0C;
        if (c3145fX != null) {
            c3145fX2 = this.A00.A0C;
            if (c3145fX2.A0J()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        InterfaceC3161fn interfaceC3161fn;
        InterfaceC3161fn interfaceC3161fn2;
        interfaceC3161fn = this.A00.A0F;
        if (interfaceC3161fn != null) {
            interfaceC3161fn2 = this.A00.A0F;
            interfaceC3161fn2.AEo();
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i) {
        this.A00.seekTo(i);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void start() {
        InterfaceC3161fn interfaceC3161fn;
        InterfaceC3161fn interfaceC3161fn2;
        interfaceC3161fn = this.A00.A0F;
        if (interfaceC3161fn != null) {
            interfaceC3161fn2 = this.A00.A0F;
            interfaceC3161fn2.AEp();
        }
    }
}
