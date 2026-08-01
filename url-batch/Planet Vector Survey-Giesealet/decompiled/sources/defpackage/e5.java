package defpackage;

import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class e5 {
    public final Path a;
    public RectF b;
    public float[] c;

    public e5(Path path) {
        this.a = path;
    }

    public final zi0 a() {
        if (this.b == null) {
            this.b = new RectF();
        }
        RectF rectF = this.b;
        rectF.getClass();
        this.a.computeBounds(rectF, true);
        return new zi0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final boolean b(e5 e5Var, e5 e5Var2, int i) {
        Path.Op op = i == 0 ? Path.Op.DIFFERENCE : i == 1 ? Path.Op.INTERSECT : i == 4 ? Path.Op.REVERSE_DIFFERENCE : i == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (!(e5Var instanceof e5)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = e5Var.a;
        if (e5Var2 instanceof e5) {
            return this.a.op(path, e5Var2.a, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }
}
