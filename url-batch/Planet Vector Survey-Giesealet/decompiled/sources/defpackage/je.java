package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.animation.PathInterpolator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class je {
    public final int a;
    public final fi0 b;
    public oy c;
    public oy d;
    public gi0 e;
    public final ColorDrawable f;
    public final boolean g;
    public int h;

    static {
        new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
        new PathInterpolator(0.6f, 0.0f, 1.0f, 1.0f);
        new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
        new PathInterpolator(0.4f, 0.0f, 1.0f, 1.0f);
    }

    public je(int i, int i2) {
        fi0 fi0Var = new fi0();
        fi0Var.a = -1;
        fi0Var.b = -1;
        oy oyVar = oy.e;
        fi0Var.c = oyVar;
        fi0Var.d = false;
        fi0Var.e = null;
        fi0Var.f = 0.0f;
        fi0Var.g = 0.0f;
        fi0Var.h = 1.0f;
        this.b = fi0Var;
        this.c = oyVar;
        this.d = oyVar;
        this.e = null;
        if (i != 1 && i != 2 && i != 4 && i != 8) {
            g8.f("Unexpected side: ", i);
            throw null;
        }
        this.a = i;
        ColorDrawable colorDrawable = new ColorDrawable();
        this.f = colorDrawable;
        this.h = 0;
        this.g = true;
        if (i2 != 0) {
            this.h = i2;
            colorDrawable.setColor(i2);
            fi0Var.e = colorDrawable;
            j3 j3Var = fi0Var.i;
            if (j3Var != null) {
                ((View) j3Var.f).setBackground(colorDrawable);
            }
        }
    }

    public final void a(float f) {
        float f2 = f * 1.0f;
        fi0 fi0Var = this.b;
        if (fi0Var.h != f2) {
            fi0Var.h = f2;
            j3 j3Var = fi0Var.i;
            if (j3Var != null) {
                ((View) j3Var.f).setAlpha(f2);
            }
        }
    }

    public final void b(float f) {
        float f2 = f * 1.0f;
        fi0 fi0Var = this.b;
        int i = this.a;
        if (i == 1) {
            float f3 = (-(1.0f - f2)) * fi0Var.a;
            if (fi0Var.f != f3) {
                fi0Var.f = f3;
                j3 j3Var = fi0Var.i;
                if (j3Var != null) {
                    ((View) j3Var.f).setTranslationX(f3);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 2) {
            float f4 = (-(1.0f - f2)) * fi0Var.b;
            if (fi0Var.g != f4) {
                fi0Var.g = f4;
                j3 j3Var2 = fi0Var.i;
                if (j3Var2 != null) {
                    ((View) j3Var2.f).setTranslationY(f4);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            float f5 = (1.0f - f2) * fi0Var.a;
            if (fi0Var.f != f5) {
                fi0Var.f = f5;
                j3 j3Var3 = fi0Var.i;
                if (j3Var3 != null) {
                    ((View) j3Var3.f).setTranslationX(f5);
                    return;
                }
                return;
            }
            return;
        }
        if (i != 8) {
            return;
        }
        float f6 = (1.0f - f2) * fi0Var.b;
        if (fi0Var.g != f6) {
            fi0Var.g = f6;
            j3 j3Var4 = fi0Var.i;
            if (j3Var4 != null) {
                ((View) j3Var4.f).setTranslationY(f6);
            }
        }
    }
}
