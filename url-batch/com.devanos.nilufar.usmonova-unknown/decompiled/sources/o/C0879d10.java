package o;

import android.graphics.Insets;
import android.view.WindowInsets;

/* renamed from: o.d10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0879d10 extends C0813c10 {
    public C0644Ys n;

    /* renamed from: o, reason: collision with root package name */
    public C0644Ys f155o;
    public C0644Ys p;

    public C0879d10(C1142h10 c1142h10, WindowInsets windowInsets) {
        super(c1142h10, windowInsets);
        this.n = null;
        this.f155o = null;
        this.p = null;
    }

    @Override // o.C1010f10
    public C0644Ys f() {
        Insets mandatorySystemGestureInsets;
        if (this.f155o == null) {
            mandatorySystemGestureInsets = this.c.getMandatorySystemGestureInsets();
            this.f155o = C0644Ys.b(mandatorySystemGestureInsets);
        }
        return this.f155o;
    }

    @Override // o.C1010f10
    public C0644Ys h() {
        Insets systemGestureInsets;
        if (this.n == null) {
            systemGestureInsets = this.c.getSystemGestureInsets();
            this.n = C0644Ys.b(systemGestureInsets);
        }
        return this.n;
    }

    @Override // o.C1010f10
    public C0644Ys j() {
        Insets tappableElementInsets;
        if (this.p == null) {
            tappableElementInsets = this.c.getTappableElementInsets();
            this.p = C0644Ys.b(tappableElementInsets);
        }
        return this.p;
    }

    @Override // o.AbstractC0682a10, o.C1010f10
    public C1142h10 k(int i, int i2, int i3, int i4) {
        WindowInsets inset;
        inset = this.c.inset(i, i2, i3, i4);
        return C1142h10.c(inset, null);
    }

    @Override // o.C0748b10, o.C1010f10
    public void q(C0644Ys c0644Ys) {
    }
}
