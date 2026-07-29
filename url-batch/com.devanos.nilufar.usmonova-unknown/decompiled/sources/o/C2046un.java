package o;

import android.graphics.Region;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import io.flutter.embedding.engine.FlutterJNI;

/* renamed from: o.un, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2046un extends SurfaceView implements InterfaceC1625oN {
    public boolean h;
    public boolean i;
    public io.flutter.embedding.engine.renderer.e j;
    public final boolean k;
    public final SurfaceHolderCallback2C2027uU l;

    public C2046un(AbstractActivityC0560Vm abstractActivityC0560Vm, boolean z) {
        super(abstractActivityC0560Vm, null);
        this.h = false;
        this.i = false;
        this.k = false;
        SurfaceHolderCallback2C2027uU surfaceHolderCallback2C2027uU = new SurfaceHolderCallback2C2027uU(new SurfaceHolderCallbackC1980tn(this), this, this.j);
        this.l = surfaceHolderCallback2C2027uU;
        if (z) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        this.k = AbstractC0022At.y(getContext());
        getHolder().addCallback(surfaceHolderCallback2C2027uU);
    }

    @Override // o.InterfaceC1625oN
    public final void a() {
        if (this.j == null) {
            Log.w("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.e eVar = this.j;
            if (eVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            eVar.e();
        }
        C1961tU c1961tU = this.l.e;
        switch (c1961tU.a) {
            case 0:
                c1961tU.b.b = null;
                break;
            default:
                SurfaceHolderCallback2C2027uU surfaceHolderCallback2C2027uU = c1961tU.b;
                surfaceHolderCallback2C2027uU.a.setAlpha(0.0f);
                io.flutter.embedding.engine.renderer.e eVar2 = surfaceHolderCallback2C2027uU.b;
                if (eVar2 != null) {
                    eVar2.c(surfaceHolderCallback2C2027uU.d);
                }
                surfaceHolderCallback2C2027uU.b = null;
                break;
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
        C1961tU c1961tU = this.l.e;
        switch (c1961tU.a) {
            case 0:
                c1961tU.b.b = eVar;
                break;
            default:
                SurfaceHolderCallback2C2027uU surfaceHolderCallback2C2027uU = c1961tU.b;
                io.flutter.embedding.engine.renderer.e eVar3 = surfaceHolderCallback2C2027uU.b;
                if (eVar3 != null) {
                    eVar3.c(surfaceHolderCallback2C2027uU.d);
                }
                surfaceHolderCallback2C2027uU.b = eVar;
                break;
        }
        resume();
    }

    public final void c() {
        if (this.j == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        io.flutter.embedding.engine.renderer.e eVar = this.j;
        Surface surface = getHolder().getSurface();
        boolean z = this.i;
        FlutterJNI flutterJNI = eVar.a;
        if (!z) {
            eVar.e();
        }
        eVar.b = surface;
        if (z) {
            flutterJNI.onSurfaceWindowChanged(surface);
        } else {
            flutterJNI.onSurfaceCreated(surface);
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], (getRight() + i) - getLeft(), (getBottom() + iArr[1]) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // o.InterfaceC1625oN
    public io.flutter.embedding.engine.renderer.e getAttachedRenderer() {
        return this.j;
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.k) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i2), View.MeasureSpec.getMode(i2) == 0 ? 1 : 0));
    }

    @Override // o.InterfaceC1625oN
    public final void pause() {
        if (this.j == null) {
            Log.w("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.i = true;
        }
    }

    @Override // o.InterfaceC1625oN
    public final void resume() {
        if (this.j == null) {
            Log.w("FlutterSurfaceView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        C1961tU c1961tU = this.l.e;
        switch (c1961tU.a) {
            case 0:
                break;
            default:
                SurfaceHolderCallback2C2027uU surfaceHolderCallback2C2027uU = c1961tU.b;
                io.flutter.embedding.engine.renderer.e eVar = surfaceHolderCallback2C2027uU.b;
                if (eVar != null) {
                    eVar.a(surfaceHolderCallback2C2027uU.d);
                    break;
                }
                break;
        }
        if (this.h) {
            c();
        }
        this.i = false;
    }
}
