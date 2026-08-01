package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class y10 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public y10() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f) {
        float f2 = this.d;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.b;
        float f5 = this.c;
        u10 u10Var = new u10(f4, f5, f4, f5);
        u10Var.f = this.d;
        u10Var.g = f3;
        this.g.add(new s10(u10Var));
        this.d = f;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((w10) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void c(float f, float f2) {
        v10 v10Var = new v10();
        v10Var.b = f;
        v10Var.c = f2;
        this.f.add(v10Var);
        t10 t10Var = new t10(v10Var, this.b, this.c);
        float b = t10Var.b() + 270.0f;
        float b2 = t10Var.b() + 270.0f;
        a(b);
        this.g.add(t10Var);
        this.d = b2;
        this.b = f;
        this.c = f2;
    }

    public final void d(float f, float f2, float f3) {
        this.a = f;
        this.b = 0.0f;
        this.c = f;
        this.d = f2;
        this.e = (f2 + f3) % 360.0f;
        this.f.clear();
        this.g.clear();
    }
}
