package com.inmobi.media;

import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayer;
import com.safedk.android.internal.partials.InMobiVideoBridge;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

/* renamed from: com.inmobi.media.kn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4138kn implements Player.Listener {
    public final /* synthetic */ CancellableContinuationImpl a;
    public final /* synthetic */ P2 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ InterfaceC4466x9 d;
    public final /* synthetic */ ExoPlayer e;

    public C4138kn(CancellableContinuationImpl cancellableContinuationImpl, P2 p2, String str, InterfaceC4466x9 interfaceC4466x9, ExoPlayer exoPlayer) {
        this.a = cancellableContinuationImpl;
        this.b = p2;
        this.c = str;
        this.d = interfaceC4466x9;
        this.e = exoPlayer;
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackStateChanged(int i) {
        if (i == 3) {
            if (this.a.isActive()) {
                int a = this.b.a(this.c);
                InterfaceC4466x9 interfaceC4466x9 = this.d;
                if (interfaceC4466x9 != null) {
                    ((C4493y9) interfaceC4466x9).a("VideoLoaderHelper", "Media loaded successfully from URL with cache progress: " + a);
                }
                X4.a(this.a, new C4202n8(a, this.e.getDuration(), this.c));
            }
            this.e.removeListener(this);
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerError(PlaybackException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        InterfaceC4466x9 interfaceC4466x9 = this.d;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).b("VideoLoaderHelper", "Failed to load URL (" + this.c + "): " + error.getMessage());
        }
        if (this.a.isActive()) {
            X4.a(this.a, new C4123k8(Zm.d));
        }
        this.e.removeListener(this);
        InMobiVideoBridge.exoPlayer3Stop(this.e);
        this.e.clearMediaItems();
    }
}
