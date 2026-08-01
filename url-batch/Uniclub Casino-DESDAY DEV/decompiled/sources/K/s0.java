package K;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class s0 extends r0 {

    /* renamed from: n, reason: collision with root package name */
    public C.c f436n;

    /* renamed from: o, reason: collision with root package name */
    public C.c f437o;

    /* renamed from: p, reason: collision with root package name */
    public C.c f438p;

    public s0(w0 w0Var, WindowInsets windowInsets) {
        super(w0Var, windowInsets);
        this.f436n = null;
        this.f437o = null;
        this.f438p = null;
    }

    @Override // K.u0
    public C.c g() {
        Insets mandatorySystemGestureInsets;
        if (this.f437o == null) {
            mandatorySystemGestureInsets = this.f429c.getMandatorySystemGestureInsets();
            this.f437o = C.c.c(mandatorySystemGestureInsets);
        }
        return this.f437o;
    }

    @Override // K.u0
    public C.c i() {
        Insets systemGestureInsets;
        if (this.f436n == null) {
            systemGestureInsets = this.f429c.getSystemGestureInsets();
            this.f436n = C.c.c(systemGestureInsets);
        }
        return this.f436n;
    }

    @Override // K.u0
    public C.c k() {
        Insets tappableElementInsets;
        if (this.f438p == null) {
            tappableElementInsets = this.f429c.getTappableElementInsets();
            this.f438p = C.c.c(tappableElementInsets);
        }
        return this.f438p;
    }

    @Override // K.p0, K.u0
    public w0 l(int i, int i2, int i3, int i4) {
        WindowInsets inset;
        inset = this.f429c.inset(i, i2, i3, i4);
        return w0.g(null, inset);
    }

    @Override // K.q0, K.u0
    public void q(C.c cVar) {
    }
}
