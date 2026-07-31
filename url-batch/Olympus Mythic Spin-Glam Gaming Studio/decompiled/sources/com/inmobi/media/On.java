package com.inmobi.media;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.Surface;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes12.dex */
public final class On {
    public final CoroutineScope a;
    public final MediaPlayer b;
    public final C4493y9 c;
    public final AtomicBoolean d;
    public final ArrayList e;
    public final C4077ie f;
    public Surface g;
    public InterfaceC4057hk h;
    public final C4428vn i;
    public final Nn j;

    public On(CoroutineScope coroutineScope, MediaPlayer mediaPlayer, RelativeLayout mediaPlayerLayout, C4270pn config, C4493y9 c4493y9) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(mediaPlayer, "mediaPlayer");
        Intrinsics.checkNotNullParameter(mediaPlayerLayout, "mediaPlayerLayout");
        Intrinsics.checkNotNullParameter(config, "config");
        this.a = coroutineScope;
        this.b = mediaPlayer;
        this.c = c4493y9;
        this.d = new AtomicBoolean(false);
        this.e = new ArrayList();
        Context context = mediaPlayerLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        C4252p5 c4252p5 = new C4252p5(context);
        this.f = new C4077ie(c4252p5, mediaPlayerLayout, mediaPlayer, c4493y9);
        this.i = new C4428vn(coroutineScope, c4252p5, config.e);
        this.j = new Nn(this);
    }

    public final void a() {
        if (this.g != null && this.d.get()) {
            Ng ng = (Ng) this.i.d.getValue();
            ng.f.set(false);
            ng.a();
        } else {
            Ng ng2 = (Ng) this.i.d.getValue();
            ng2.b.setValue(EnumC4192mo.a);
            ng2.f.set(true);
            P6.a(ng2.e);
            ng2.e = null;
        }
    }

    public final void b() {
        X4.a(this.e);
        C4077ie c4077ie = this.f;
        c4077ie.e = null;
        c4077ie.a.setSurfaceTextureListener(null);
        c4077ie.c.setOnVideoSizeChangedListener(null);
        Ng ng = (Ng) this.i.d.getValue();
        ng.f.set(true);
        P6.a(ng.e);
        ng.e = null;
        Surface surface = this.g;
        if (surface != null) {
            surface.release();
        }
        this.g = null;
        this.h = null;
    }
}
