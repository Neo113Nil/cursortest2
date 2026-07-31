package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;

/* loaded from: classes12.dex */
public final class h implements Runnable {
    public final /* synthetic */ DecoderCounters a;
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher b;

    public h(AudioRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters) {
        this.b = eventDispatcher;
        this.a = decoderCounters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AudioRendererEventListener audioRendererEventListener;
        this.a.ensureUpdated();
        audioRendererEventListener = this.b.listener;
        audioRendererEventListener.onAudioDisabled(this.a);
    }
}
