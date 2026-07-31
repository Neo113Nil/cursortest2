package com.fyber.inneractive.sdk.player.exoplayer2.video;

import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;

/* loaded from: classes6.dex */
public final class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher c;

    public l(VideoRendererEventListener.EventDispatcher eventDispatcher, int i, long j) {
        this.c = eventDispatcher;
        this.a = i;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoRendererEventListener videoRendererEventListener;
        videoRendererEventListener = this.c.listener;
        videoRendererEventListener.onDroppedFrames(this.a, this.b);
    }
}
