package com.inmobi.media;

import android.media.MediaPlayer;
import kotlinx.coroutines.CancellableContinuationImpl;

/* renamed from: com.inmobi.media.in, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4086in implements MediaPlayer.OnErrorListener {
    public final /* synthetic */ InterfaceC4466x9 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ CancellableContinuationImpl c;

    public C4086in(InterfaceC4466x9 interfaceC4466x9, String str, CancellableContinuationImpl cancellableContinuationImpl) {
        this.a = interfaceC4466x9;
        this.b = str;
        this.c = cancellableContinuationImpl;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        InterfaceC4466x9 interfaceC4466x9 = this.a;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).b("VideoLoaderHelper", "Video Load Error URL: " + this.b);
        }
        X4.a(this.c, Boolean.FALSE);
        return true;
    }
}
