package K;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class v0 extends u0 {

    /* renamed from: n, reason: collision with root package name */
    public C.d f718n;

    /* renamed from: o, reason: collision with root package name */
    public C.d f719o;

    /* renamed from: p, reason: collision with root package name */
    public C.d f720p;

    public v0(z0 z0Var, WindowInsets windowInsets) {
        super(z0Var, windowInsets);
        this.f718n = null;
        this.f719o = null;
        this.f720p = null;
    }

    @Override // K.x0
    public C.d g() {
        Insets mandatorySystemGestureInsets;
        if (this.f719o == null) {
            mandatorySystemGestureInsets = this.f709c.getMandatorySystemGestureInsets();
            this.f719o = C.d.c(mandatorySystemGestureInsets);
        }
        return this.f719o;
    }

    @Override // K.x0
    public C.d i() {
        Insets systemGestureInsets;
        if (this.f718n == null) {
            systemGestureInsets = this.f709c.getSystemGestureInsets();
            this.f718n = C.d.c(systemGestureInsets);
        }
        return this.f718n;
    }

    @Override // K.x0
    public C.d k() {
        Insets tappableElementInsets;
        if (this.f720p == null) {
            tappableElementInsets = this.f709c.getTappableElementInsets();
            this.f720p = C.d.c(tappableElementInsets);
        }
        return this.f720p;
    }

    @Override // K.s0, K.x0
    public z0 l(int i, int i2, int i3, int i4) {
        WindowInsets inset;
        inset = this.f709c.inset(i, i2, i3, i4);
        return z0.g(null, inset);
    }

    @Override // K.t0, K.x0
    public void q(C.d dVar) {
    }
}
