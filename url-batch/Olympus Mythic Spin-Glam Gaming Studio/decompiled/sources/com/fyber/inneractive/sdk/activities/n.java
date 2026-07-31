package com.fyber.inneractive.sdk.activities;

import android.media.MediaPlayer;
import com.fyber.inneractive.sdk.util.IAlog;
import com.safedk.android.internal.partials.DTExchangeVideoBridge;

/* loaded from: classes6.dex */
public final class n implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ InneractiveRichMediaVideoPlayerActivityCore a;

    public n(InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore) {
        this.a = inneractiveRichMediaVideoPlayerActivityCore;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        IAlog.a("onPrepared", new Object[0]);
        InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore = this.a;
        inneractiveRichMediaVideoPlayerActivityCore.a.seekTo(inneractiveRichMediaVideoPlayerActivityCore.b);
        DTExchangeVideoBridge.VideoViewPlay(this.a.a);
    }
}
