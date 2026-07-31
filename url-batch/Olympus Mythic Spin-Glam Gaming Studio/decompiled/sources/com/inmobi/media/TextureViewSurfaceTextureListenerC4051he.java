package com.inmobi.media;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.he, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class TextureViewSurfaceTextureListenerC4051he implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ C4077ie a;

    public TextureViewSurfaceTextureListenerC4051he(C4077ie c4077ie) {
        this.a = c4077ie;
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
