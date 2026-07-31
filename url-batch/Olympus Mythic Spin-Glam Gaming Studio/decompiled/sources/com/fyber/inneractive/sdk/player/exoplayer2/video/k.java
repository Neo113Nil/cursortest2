package com.fyber.inneractive.sdk.player.exoplayer2.video;

import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;

/* loaded from: classes6.dex */
public final class k implements Runnable {
    public final /* synthetic */ com.fyber.inneractive.sdk.player.exoplayer2.o a;
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher b;

    public k(VideoRendererEventListener.EventDispatcher eventDispatcher, com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        this.b = eventDispatcher;
        this.a = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoRendererEventListener videoRendererEventListener;
        videoRendererEventListener = this.b.listener;
        videoRendererEventListener.onVideoInputFormatChanged(this.a);
    }
}
