package K;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class v0 extends u0 {

    /* renamed from: n, reason: collision with root package name */
    public C.d f455n;

    /* renamed from: o, reason: collision with root package name */
    public C.d f456o;

    /* renamed from: p, reason: collision with root package name */
    public C.d f457p;

    public v0(z0 z0Var, WindowInsets windowInsets) {
        super(z0Var, windowInsets);
        this.f455n = null;
        this.f456o = null;
        this.f457p = null;
    }

    @Override // K.x0
    public C.d g() {
        Insets mandatorySystemGestureInsets;
        if (this.f456o == null) {
            mandatorySystemGestureInsets = this.f447c.getMandatorySystemGestureInsets();
            this.f456o = C.d.c(mandatorySystemGestureInsets);
        }
        return this.f456o;
    }

    @Override // K.x0
    public C.d i() {
        Insets systemGestureInsets;
        if (this.f455n == null) {
            systemGestureInsets = this.f447c.getSystemGestureInsets();
            this.f455n = C.d.c(systemGestureInsets);
        }
        return this.f455n;
    }

    @Override // K.x0
    public C.d k() {
        Insets tappableElementInsets;
        if (this.f457p == null) {
            tappableElementInsets = this.f447c.getTappableElementInsets();
            this.f457p = C.d.c(tappableElementInsets);
        }
        return this.f457p;
    }

    @Override // K.s0, K.x0
    public z0 l(int i, int i2, int i3, int i4) {
        WindowInsets inset;
        inset = this.f447c.inset(i, i2, i3, i4);
        return z0.g(null, inset);
    }

    @Override // K.t0, K.x0
    public void q(C.d dVar) {
    }
}
