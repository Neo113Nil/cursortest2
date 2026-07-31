package com.inmobi.media;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class W7 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ X7 a;

    public W7(X7 x7) {
        this.a = x7;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surface, int i, int i2) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        InterfaceC4031gk interfaceC4031gk = this.a.e;
        if (interfaceC4031gk != null) {
            interfaceC4031gk.a(surface);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        InterfaceC4031gk interfaceC4031gk = this.a.e;
        if (interfaceC4031gk == null) {
            return true;
        }
        interfaceC4031gk.a();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surface, int i, int i2) {
        Intrinsics.checkNotNullParameter(surface, "surface");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
    }
}
