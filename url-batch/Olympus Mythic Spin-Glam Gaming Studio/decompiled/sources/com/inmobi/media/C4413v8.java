package com.inmobi.media;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.v8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4413v8 implements InterfaceC4031gk {
    public final /* synthetic */ C4439w8 a;

    public C4413v8(C4439w8 c4439w8) {
        this.a = c4439w8;
    }

    @Override // com.inmobi.media.InterfaceC4031gk
    public final void a(SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        Surface surface2 = new Surface(surface);
        C4439w8 c4439w8 = this.a;
        Surface surface3 = c4439w8.e;
        if (surface3 != null) {
            surface3.release();
        }
        c4439w8.e = surface2;
        InterfaceC4057hk interfaceC4057hk = this.a.f;
        if (interfaceC4057hk != null) {
            interfaceC4057hk.c();
        }
    }

    @Override // com.inmobi.media.InterfaceC4031gk
    public final void a() {
        this.a.b.clearVideoSurface();
        this.a.b.setVideoSurface(null);
        Surface surface = this.a.e;
        if (surface != null) {
            surface.release();
        }
        this.a.e = null;
    }
}
