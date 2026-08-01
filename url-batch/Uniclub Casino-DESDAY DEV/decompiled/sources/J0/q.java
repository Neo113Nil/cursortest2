package J0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class q extends s {
    public static final RectF h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f332b;

    /* renamed from: c, reason: collision with root package name */
    public final float f333c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f334e;

    /* renamed from: f, reason: collision with root package name */
    public float f335f;

    /* renamed from: g, reason: collision with root package name */
    public float f336g;

    public q(float f2, float f3, float f4, float f5) {
        this.f332b = f2;
        this.f333c = f3;
        this.d = f4;
        this.f334e = f5;
    }

    @Override // J0.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f339a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = h;
        rectF.set(this.f332b, this.f333c, this.d, this.f334e);
        path.arcTo(rectF, this.f335f, this.f336g, false);
        path.transform(matrix);
    }
}
