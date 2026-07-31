package com.inmobi.media;

import android.content.Context;
import android.media.MediaPlayer;
import com.safedk.android.internal.partials.InMobiVideoBridge;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.fe, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3997fe implements InterfaceC4057hk {
    public final /* synthetic */ C4025ge a;

    public C3997fe(C4025ge c4025ge) {
        this.a = c4025ge;
    }

    @Override // com.inmobi.media.InterfaceC4057hk
    public final void a() {
        C4025ge c4025ge = this.a;
        Jg jg = c4025ge.g;
        if (jg == Jg.e || jg == Jg.c) {
            Context context = c4025ge.i.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (AbstractC4296qn.a(context, c4025ge.b.a)) {
                C4235oe c4235oe = c4025ge.k;
                X4.a(c4235oe.b, new C4181me(c4235oe, null));
                c4025ge.l.b();
                MediaPlayer mediaPlayer = c4025ge.j;
                Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
                try {
                    InMobiVideoBridge.MediaPlayerStart(mediaPlayer);
                } catch (IllegalStateException unused) {
                }
                X4.a(c4025ge.h, c4025ge.a, new Gn(c4025ge.j.getCurrentPosition()));
                c4025ge.g = Jg.d;
            }
        }
    }

    @Override // com.inmobi.media.InterfaceC4057hk
    public final void b() {
        C4025ge c4025ge = this.a;
        if (c4025ge.g != Jg.d) {
            return;
        }
        MediaPlayer mediaPlayer = c4025ge.j;
        Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
        try {
            InMobiVideoBridge.MediaPlayerPause(mediaPlayer);
        } catch (IllegalStateException unused) {
        }
        c4025ge.l.c();
        C4235oe c4235oe = c4025ge.k;
        X4.a(c4235oe.b, new C4155le(c4235oe, null));
        X4.a(c4025ge.h, c4025ge.a, new C4218nn(c4025ge.j.getCurrentPosition()));
        c4025ge.g = Jg.e;
    }

    @Override // com.inmobi.media.InterfaceC4057hk
    public final void c() {
        C4025ge c4025ge = this.a;
        if (c4025ge.g != Jg.f) {
            return;
        }
        MediaPlayer mediaPlayer = c4025ge.j;
        Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
        try {
            mediaPlayer.seekTo(0);
        } catch (IllegalStateException unused) {
        }
    }
}
