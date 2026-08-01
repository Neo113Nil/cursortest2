package defpackage;

import android.content.res.TypedArray;
import android.util.SparseArray;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class ai {
    public final SparseArray a = new SparseArray();
    public final bi b;
    public final int c;
    public final int d;

    public ai(bi biVar, y5 y5Var) {
        this.b = biVar;
        TypedArray typedArray = (TypedArray) y5Var.a;
        this.c = typedArray.getResourceId(28, 0);
        this.d = typedArray.getResourceId(53, 0);
    }
}
