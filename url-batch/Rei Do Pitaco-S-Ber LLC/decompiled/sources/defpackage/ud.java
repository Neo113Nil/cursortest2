package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class ud extends ls {
    public static final /* synthetic */ int M = 0;
    public td L;

    @Override // defpackage.ls
    public final void g(Canvas canvas) {
        if (this.L.q.isEmpty()) {
            super.g(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.L.q);
        super.g(canvas);
        canvas.restore();
    }

    @Override // defpackage.ls, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.L = new td(this.L);
        return this;
    }

    public final void x(float f, float f2, float f3, float f4) {
        RectF rectF = this.L.q;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }
}
