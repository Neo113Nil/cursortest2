package com.inmobi.media;

import android.media.MediaPlayer;
import kotlinx.coroutines.CancellableContinuationImpl;

/* renamed from: com.inmobi.media.hn, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4060hn implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ InterfaceC4466x9 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ CancellableContinuationImpl c;

    public C4060hn(InterfaceC4466x9 interfaceC4466x9, String str, CancellableContinuationImpl cancellableContinuationImpl) {
        this.a = interfaceC4466x9;
        this.b = str;
        this.c = cancellableContinuationImpl;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        InterfaceC4466x9 interfaceC4466x9 = this.a;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("VideoLoaderHelper", "Video Load Success for URL: " + this.b);
        }
        X4.a(this.c, Boolean.TRUE);
    }
}
