package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.view.Surface;
import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;

/* loaded from: classes6.dex */
public final class n implements Runnable {
    public final /* synthetic */ Surface a;
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher b;

    public n(VideoRendererEventListener.EventDispatcher eventDispatcher, Surface surface) {
        this.b = eventDispatcher;
        this.a = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoRendererEventListener videoRendererEventListener;
        videoRendererEventListener = this.b.listener;
        videoRendererEventListener.onRenderedFirstFrame(this.a);
    }
}
