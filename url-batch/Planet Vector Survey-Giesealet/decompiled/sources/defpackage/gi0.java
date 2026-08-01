package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class gi0 {
    public final ArrayList a = new ArrayList();
    public final ou0 b;
    public oy c;
    public oy d;
    public int e;
    public boolean f;

    public gi0(ou0 ou0Var, ArrayList arrayList) {
        oy oyVar = oy.e;
        this.c = oyVar;
        this.d = oyVar;
        a(arrayList, false);
        a(arrayList, true);
        ArrayList arrayList2 = ou0Var.b;
        if (!arrayList2.contains(this)) {
            arrayList2.add(this);
            oy oyVar2 = ou0Var.c;
            oy oyVar3 = ou0Var.d;
            this.c = oyVar2;
            this.d = oyVar3;
            c();
            b(ou0Var.e);
        }
        this.b = ou0Var;
    }

    public final void a(List list, boolean z) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            je jeVar = (je) list.get(i);
            jeVar.getClass();
            if (true == z) {
                gi0 gi0Var = jeVar.e;
                if (gi0Var != null) {
                    throw new IllegalStateException(jeVar + " is already controlled by " + gi0Var);
                }
                jeVar.e = this;
                this.a.add(jeVar);
            }
        }
    }

    public final void b(int i) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            je jeVar = (je) arrayList.get(size);
            if (!jeVar.g) {
                ColorDrawable colorDrawable = jeVar.f;
                if (jeVar.h != i) {
                    jeVar.h = i;
                    colorDrawable.setColor(i);
                    fi0 fi0Var = jeVar.b;
                    fi0Var.e = colorDrawable;
                    j3 j3Var = fi0Var.i;
                    if (j3Var != null) {
                        ((View) j3Var.f).setBackground(colorDrawable);
                    }
                }
            }
        }
    }

    public final void c() {
        int i;
        oy c;
        ArrayList arrayList = this.a;
        oy oyVar = oy.e;
        oy oyVar2 = oyVar;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            je jeVar = (je) arrayList.get(size);
            oy oyVar3 = this.c;
            oy oyVar4 = this.d;
            jeVar.c = oyVar3;
            fi0 fi0Var = jeVar.b;
            jeVar.d = oyVar4;
            if (!fi0Var.c.equals(oyVar2)) {
                fi0Var.c = oyVar2;
                j3 j3Var = fi0Var.i;
                if (j3Var != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) j3Var.e;
                    layoutParams.leftMargin = oyVar2.a;
                    layoutParams.topMargin = oyVar2.b;
                    layoutParams.rightMargin = oyVar2.c;
                    layoutParams.bottomMargin = oyVar2.d;
                    ((View) j3Var.f).setLayoutParams(layoutParams);
                }
            }
            int i2 = jeVar.a;
            if (i2 == 1) {
                i = jeVar.c.a;
                int i3 = jeVar.d.a;
                if (fi0Var.a != i3) {
                    fi0Var.a = i3;
                    j3 j3Var2 = fi0Var.i;
                    if (j3Var2 != null) {
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) j3Var2.e;
                        layoutParams2.width = i3;
                        ((View) j3Var2.f).setLayoutParams(layoutParams2);
                    }
                }
                c = oy.c(i, 0, 0, 0);
            } else if (i2 == 2) {
                i = jeVar.c.b;
                int i4 = jeVar.d.b;
                if (fi0Var.b != i4) {
                    fi0Var.b = i4;
                    j3 j3Var3 = fi0Var.i;
                    if (j3Var3 != null) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) j3Var3.e;
                        layoutParams3.height = i4;
                        ((View) j3Var3.f).setLayoutParams(layoutParams3);
                    }
                }
                c = oy.c(0, i, 0, 0);
            } else if (i2 == 4) {
                i = jeVar.c.c;
                int i5 = jeVar.d.c;
                if (fi0Var.a != i5) {
                    fi0Var.a = i5;
                    j3 j3Var4 = fi0Var.i;
                    if (j3Var4 != null) {
                        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) j3Var4.e;
                        layoutParams4.width = i5;
                        ((View) j3Var4.f).setLayoutParams(layoutParams4);
                    }
                }
                c = oy.c(0, 0, i, 0);
            } else if (i2 != 8) {
                c = oyVar;
                i = 0;
            } else {
                i = jeVar.c.d;
                int i6 = jeVar.d.d;
                if (fi0Var.b != i6) {
                    fi0Var.b = i6;
                    j3 j3Var5 = fi0Var.i;
                    if (j3Var5 != null) {
                        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) j3Var5.e;
                        layoutParams5.height = i6;
                        ((View) j3Var5.f).setLayoutParams(layoutParams5);
                    }
                }
                c = oy.c(0, 0, 0, i);
            }
            boolean z = i > 0;
            if (fi0Var.d != z) {
                fi0Var.d = z;
                j3 j3Var6 = fi0Var.i;
                if (j3Var6 != null) {
                    ((View) j3Var6.f).setVisibility(z ? 0 : 4);
                }
            }
            float f = 0.0f;
            jeVar.a(i > 0 ? 1.0f : 0.0f);
            if (i > 0) {
                f = 1.0f;
            }
            jeVar.b(f);
            oyVar2 = oy.a(oyVar2, c);
        }
    }
}
