package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class d70 extends e70 {
    public final Matrix a;
    public final ArrayList b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final Matrix j;
    public String k;

    /* JADX WARN: Multi-variable type inference failed */
    public d70(d70 d70Var, l6 l6Var) {
        b70 b70Var;
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.k = null;
        this.c = d70Var.c;
        this.d = d70Var.d;
        this.e = d70Var.e;
        this.f = d70Var.f;
        this.g = d70Var.g;
        this.h = d70Var.h;
        this.i = d70Var.i;
        String str = d70Var.k;
        this.k = str;
        if (str != null) {
            l6Var.put(str, this);
        }
        matrix.set(d70Var.j);
        ArrayList arrayList = d70Var.b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof d70) {
                this.b.add(new d70((d70) obj, l6Var));
            } else {
                if (obj instanceof c70) {
                    c70 c70Var = (c70) obj;
                    c70 c70Var2 = new c70(c70Var);
                    c70Var2.e = 0.0f;
                    c70Var2.g = 1.0f;
                    c70Var2.h = 1.0f;
                    c70Var2.i = 0.0f;
                    c70Var2.j = 1.0f;
                    c70Var2.k = 0.0f;
                    c70Var2.l = Paint.Cap.BUTT;
                    c70Var2.m = Paint.Join.MITER;
                    c70Var2.n = 4.0f;
                    c70Var2.d = c70Var.d;
                    c70Var2.e = c70Var.e;
                    c70Var2.g = c70Var.g;
                    c70Var2.f = c70Var.f;
                    c70Var2.c = c70Var.c;
                    c70Var2.h = c70Var.h;
                    c70Var2.i = c70Var.i;
                    c70Var2.j = c70Var.j;
                    c70Var2.k = c70Var.k;
                    c70Var2.l = c70Var.l;
                    c70Var2.m = c70Var.m;
                    c70Var2.n = c70Var.n;
                    b70Var = c70Var2;
                } else {
                    if (!(obj instanceof b70)) {
                        l8.u("Unknown object in the tree!");
                        throw null;
                    }
                    b70Var = new b70((b70) obj);
                }
                this.b.add(b70Var);
                Object obj2 = b70Var.b;
                if (obj2 != null) {
                    l6Var.put(obj2, b70Var);
                }
            }
        }
    }

    @Override // defpackage.e70
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((e70) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.e70
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return z;
            }
            z |= ((e70) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f, this.g);
        matrix.postRotate(this.c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.e);
    }

    public String getGroupName() {
        return this.k;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            c();
        }
    }

    public void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            c();
        }
    }

    public d70() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.k = null;
    }
}
