package o;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* renamed from: o.vn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class TextureViewSurfaceTextureListenerC2112vn implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ C2178wn a;

    public TextureViewSurfaceTextureListenerC2112vn(C2178wn c2178wn) {
        this.a = c2178wn;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C2178wn c2178wn = this.a;
        c2178wn.h = true;
        if (c2178wn.j == null || c2178wn.i) {
            return;
        }
        c2178wn.c();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C2178wn c2178wn = this.a;
        c2178wn.h = false;
        io.flutter.embedding.engine.renderer.e eVar = c2178wn.j;
        if (eVar != null && !c2178wn.i) {
            if (eVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            eVar.e();
            Surface surface = c2178wn.k;
            if (surface != null) {
                surface.release();
                c2178wn.k = null;
            }
        }
        Surface surface2 = c2178wn.k;
        if (surface2 == null) {
            return true;
        }
        surface2.release();
        c2178wn.k = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C2178wn c2178wn = this.a;
        io.flutter.embedding.engine.renderer.e eVar = c2178wn.j;
        if (eVar == null || c2178wn.i) {
            return;
        }
        if (eVar == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        eVar.a.onSurfaceChanged(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
