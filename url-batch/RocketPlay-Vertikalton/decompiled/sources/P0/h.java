package P0;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class h extends M0.g {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f937y = 0;

    /* renamed from: x, reason: collision with root package name */
    public g f938x;

    @Override // M0.g
    public final void e(Canvas canvas) {
        if (this.f938x.f936q.isEmpty()) {
            super.e(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.f938x.f936q);
        super.e(canvas);
        canvas.restore();
    }

    @Override // M0.g, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f938x = new g(this.f938x);
        return this;
    }

    public final void n(float f2, float f3, float f4, float f5) {
        RectF rectF = this.f938x.f936q;
        if (f2 == rectF.left && f3 == rectF.top && f4 == rectF.right && f5 == rectF.bottom) {
            return;
        }
        rectF.set(f2, f3, f4, f5);
        invalidateSelf();
    }
}
