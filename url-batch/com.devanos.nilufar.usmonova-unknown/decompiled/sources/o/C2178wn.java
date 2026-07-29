package o;

import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import io.flutter.embedding.engine.FlutterJNI;

/* renamed from: o.wn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2178wn extends TextureView implements InterfaceC1625oN {
    public boolean h;
    public boolean i;
    public io.flutter.embedding.engine.renderer.e j;
    public Surface k;
    public final boolean l;

    public C2178wn(AbstractActivityC0560Vm abstractActivityC0560Vm) {
        super(abstractActivityC0560Vm, null);
        this.h = false;
        this.i = false;
        this.l = false;
        setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC2112vn(this));
        this.l = AbstractC0022At.y(getContext());
    }

    @Override // o.InterfaceC1625oN
    public final void a() {
        if (this.j == null) {
            Log.w("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.e eVar = this.j;
            if (eVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            eVar.e();
            Surface surface = this.k;
            if (surface != null) {
                surface.release();
                this.k = null;
            }
        }
        this.j = null;
    }

    @Override // o.InterfaceC1625oN
    public final void b(io.flutter.embedding.engine.renderer.e eVar) {
        io.flutter.embedding.engine.renderer.e eVar2 = this.j;
        if (eVar2 != null) {
            eVar2.e();
        }
        this.j = eVar;
        resume();
    }

    public final void c() {
        if (this.j == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.k;
        if (surface != null) {
            surface.release();
            this.k = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.k = surface2;
        io.flutter.embedding.engine.renderer.e eVar = this.j;
        boolean z = this.i;
        FlutterJNI flutterJNI = eVar.a;
        if (!z) {
            eVar.e();
        }
        eVar.b = surface2;
        if (z) {
            flutterJNI.onSurfaceWindowChanged(surface2);
        } else {
            flutterJNI.onSurfaceCreated(surface2);
        }
    }

    @Override // o.InterfaceC1625oN
    public io.flutter.embedding.engine.renderer.e getAttachedRenderer() {
        return this.j;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.l) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i2), View.MeasureSpec.getMode(i2) == 0 ? 1 : 0));
    }

    @Override // o.InterfaceC1625oN
    public final void pause() {
        if (this.j == null) {
            Log.w("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.i = true;
        }
    }

    @Override // o.InterfaceC1625oN
    public final void resume() {
        if (this.j == null) {
            Log.w("FlutterTextureView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (this.h) {
            c();
        }
        this.i = false;
    }

    public void setRenderSurface(Surface surface) {
        this.k = surface;
    }
}
