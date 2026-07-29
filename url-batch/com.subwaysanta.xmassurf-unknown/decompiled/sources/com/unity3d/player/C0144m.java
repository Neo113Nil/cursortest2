package com.unity3d.player;

import android.graphics.SurfaceTexture;

/* renamed from: com.unity3d.player.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0144m implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ C0148o a;

    public C0144m(C0148o c0148o) {
        this.a = c0148o;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        ((Camera2Wrapper) this.a.a).a(surfaceTexture);
    }
}
