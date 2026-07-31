package com.inmobi.media;

import android.view.Surface;

/* loaded from: classes13.dex */
public final class T7 implements InterfaceC4057hk {
    public final /* synthetic */ V7 a;

    public T7(V7 v7) {
        this.a = v7;
    }

    @Override // com.inmobi.media.InterfaceC4057hk
    public final void a() {
        this.a.d();
    }

    @Override // com.inmobi.media.InterfaceC4057hk
    public final void b() {
        this.a.c();
    }

    @Override // com.inmobi.media.InterfaceC4057hk
    public final void c() {
        Surface surface;
        V7 v7 = this.a;
        if (v7.q != null) {
            C4439w8 c4439w8 = v7.z;
            if (c4439w8.g || (surface = c4439w8.e) == null) {
                return;
            }
            c4439w8.g = true;
            c4439w8.b.setVideoSurface(surface);
        }
    }
}
