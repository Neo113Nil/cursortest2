package com.inmobi.media;

import android.media.MediaPlayer;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.je, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4103je implements T1 {
    public final /* synthetic */ C4235oe a;

    public C4103je(C4235oe c4235oe) {
        this.a = c4235oe;
    }

    @Override // com.inmobi.media.T1
    public final void a() {
        this.a.a();
    }

    @Override // com.inmobi.media.T1
    public final void b() {
        C4235oe c4235oe = this.a;
        MediaPlayer mediaPlayer = c4235oe.c;
        Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
        try {
            mediaPlayer.setVolume(1.0f, 1.0f);
        } catch (IllegalStateException unused) {
        }
        c4235oe.a(c4235oe.k, c4235oe.j);
        X4.a(c4235oe.e, c4235oe.b, new W1(1.0f, false));
        c4235oe.i = false;
    }
}
