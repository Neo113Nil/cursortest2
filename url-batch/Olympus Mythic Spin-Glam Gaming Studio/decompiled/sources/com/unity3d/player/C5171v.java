package com.unity3d.player;

import android.graphics.SurfaceTexture;

/* renamed from: com.unity3d.player.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C5171v implements SurfaceTexture.OnFrameAvailableListener {
    final /* synthetic */ C5173w a;

    C5171v(C5173w c5173w) {
        this.a = c5173w;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        com.unity3d.player.a.b bVar;
        bVar = this.a.a;
        ((Camera2Wrapper) bVar).a(surfaceTexture);
    }
}
