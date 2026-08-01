package defpackage;

import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class nu0 extends c11 {
    public final HashMap f;
    public final /* synthetic */ ou0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu0(ou0 ou0Var) {
        super(0);
        this.g = ou0Var;
        this.f = new HashMap();
    }

    @Override // defpackage.c11
    public final void b(l11 l11Var) {
        ArrayList arrayList = this.g.b;
        if ((l11Var.a.d() & 519) != 0) {
            this.f.remove(l11Var);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                gi0 gi0Var = (gi0) arrayList.get(size);
                int i = gi0Var.e;
                boolean z = i > 0;
                int i2 = i - 1;
                gi0Var.e = i2;
                if (z && i2 == 0) {
                    gi0Var.c();
                }
            }
        }
    }

    @Override // defpackage.c11
    public final void c(l11 l11Var) {
        ArrayList arrayList = this.g.b;
        if ((l11Var.a.d() & 519) != 0) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((gi0) arrayList.get(size)).e++;
            }
        }
    }

    @Override // defpackage.c11
    public final d21 d(d21 d21Var, List list) {
        ArrayList arrayList = this.g.b;
        RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
        int i = 0;
        for (int size = list.size() - 1; size >= 0; size--) {
            l11 l11Var = (l11) list.get(size);
            Integer num = (Integer) this.f.get(l11Var);
            if (num != null) {
                int intValue = num.intValue();
                float a = l11Var.a.a();
                if ((intValue & 1) != 0) {
                    rectF.left = a;
                }
                if ((intValue & 2) != 0) {
                    rectF.top = a;
                }
                if ((intValue & 4) != 0) {
                    rectF.right = a;
                }
                if ((intValue & 8) != 0) {
                    rectF.bottom = a;
                }
                i |= intValue;
            }
        }
        oy b = oy.b(d21Var.a.f(519), d21Var.a.f(64));
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            gi0 gi0Var = (gi0) arrayList.get(size2);
            oy oyVar = gi0Var.d;
            ArrayList arrayList2 = gi0Var.a;
            for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
                je jeVar = (je) arrayList2.get(size3);
                int i2 = jeVar.a;
                if ((i2 & i) != 0) {
                    fi0 fi0Var = jeVar.b;
                    if (!fi0Var.d) {
                        fi0Var.d = true;
                        j3 j3Var = fi0Var.i;
                        if (j3Var != null) {
                            ((View) j3Var.f).setVisibility(0);
                        }
                    }
                    if (i2 == 1) {
                        int i3 = oyVar.a;
                        if (i3 > 0) {
                            jeVar.b(b.a / i3);
                        }
                        jeVar.a(rectF.left);
                    } else if (i2 == 2) {
                        int i4 = oyVar.b;
                        if (i4 > 0) {
                            jeVar.b(b.b / i4);
                        }
                        jeVar.a(rectF.top);
                    } else if (i2 == 4) {
                        int i5 = oyVar.c;
                        if (i5 > 0) {
                            jeVar.b(b.c / i5);
                        }
                        jeVar.a(rectF.right);
                    } else if (i2 == 8) {
                        int i6 = oyVar.d;
                        if (i6 > 0) {
                            jeVar.b(b.d / i6);
                        }
                        jeVar.a(rectF.bottom);
                    }
                }
            }
        }
        return d21Var;
    }

    @Override // defpackage.c11
    public final j3 e(l11 l11Var, j3 j3Var) {
        if ((l11Var.a.d() & 519) != 0) {
            oy oyVar = (oy) j3Var.f;
            oy oyVar2 = (oy) j3Var.e;
            int i = oyVar.a != oyVar2.a ? 1 : 0;
            if (oyVar.b != oyVar2.b) {
                i |= 2;
            }
            if (oyVar.c != oyVar2.c) {
                i |= 4;
            }
            if (oyVar.d != oyVar2.d) {
                i |= 8;
            }
            this.f.put(l11Var, Integer.valueOf(i));
        }
        return j3Var;
    }
}
