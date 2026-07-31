package com.fyber.inneractive.sdk.player.exoplayer2.video;

import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;

/* loaded from: classes6.dex */
public final class j implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher d;

    public j(VideoRendererEventListener.EventDispatcher eventDispatcher, String str, long j, long j2) {
        this.d = eventDispatcher;
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoRendererEventListener videoRendererEventListener;
        videoRendererEventListener = this.d.listener;
        videoRendererEventListener.onVideoDecoderInitialized(this.a, this.b, this.c);
    }
}
