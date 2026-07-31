package com.inmobi.media;

import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.Surface;
import com.safedk.android.internal.partials.InMobiVideoBridge;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class Nn implements InterfaceC4031gk {
    public final /* synthetic */ On a;

    public Nn(On on) {
        this.a = on;
    }

    @Override // com.inmobi.media.InterfaceC4031gk
    public final void a(SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        Surface surface2 = new Surface(surface);
        On on = this.a;
        on.g = surface2;
        MediaPlayer mediaPlayer = on.b;
        Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
        try {
            InMobiVideoBridge.MediaPlayerSetSurface(mediaPlayer, surface2);
        } catch (IllegalStateException unused) {
        }
        this.a.a();
        InterfaceC4057hk interfaceC4057hk = this.a.h;
        if (interfaceC4057hk != null) {
            interfaceC4057hk.c();
        }
    }

    @Override // com.inmobi.media.InterfaceC4031gk
    public final void a() {
        Surface surface = this.a.g;
        if (surface != null) {
            surface.release();
        }
        On on = this.a;
        on.g = null;
        MediaPlayer mediaPlayer = on.b;
        Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
        try {
            InMobiVideoBridge.MediaPlayerSetSurface(mediaPlayer, null);
        } catch (IllegalStateException unused) {
        }
        this.a.a();
    }
}
