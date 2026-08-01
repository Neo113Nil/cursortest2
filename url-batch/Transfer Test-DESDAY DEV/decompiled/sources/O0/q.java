package O0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class q extends s {
    public static final RectF h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f584b;

    /* renamed from: c, reason: collision with root package name */
    public final float f585c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f586e;

    /* renamed from: f, reason: collision with root package name */
    public float f587f;

    /* renamed from: g, reason: collision with root package name */
    public float f588g;

    public q(float f2, float f3, float f4, float f5) {
        this.f584b = f2;
        this.f585c = f3;
        this.d = f4;
        this.f586e = f5;
    }

    @Override // O0.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f591a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = h;
        rectF.set(this.f584b, this.f585c, this.d, this.f586e);
        path.arcTo(rectF, this.f587f, this.f588g, false);
        path.transform(matrix);
    }
}
