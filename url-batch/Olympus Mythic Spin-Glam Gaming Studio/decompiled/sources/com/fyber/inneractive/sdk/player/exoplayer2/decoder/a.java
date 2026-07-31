package com.fyber.inneractive.sdk.player.exoplayer2.decoder;

import android.media.MediaCodec;

/* loaded from: classes4.dex */
public final class a {
    public final MediaCodec.CryptoInfo a;
    public final MediaCodec.CryptoInfo.Pattern b = new MediaCodec.CryptoInfo.Pattern(0, 0);

    public a(MediaCodec.CryptoInfo cryptoInfo) {
        this.a = cryptoInfo;
    }

    public static void a(a aVar) {
        aVar.b.set(0, 0);
        aVar.a.setPattern(aVar.b);
    }
}
