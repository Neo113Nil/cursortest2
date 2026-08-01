package defpackage;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class g40 extends qd {
    public final HashMap b = new HashMap();
    public final /* synthetic */ h40 c;

    public g40(h40 h40Var) {
        this.c = h40Var;
    }

    @Override // defpackage.qd
    public final void a(ja0 ja0Var) {
        ArrayList arrayList = this.c.b;
        if ((ja0Var.a.d() & 519) != 0) {
            this.b.remove(ja0Var);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ax axVar = (ax) arrayList.get(size);
                int i = axVar.e;
                boolean z = i > 0;
                int i2 = i - 1;
                axVar.e = i2;
                if (z && i2 == 0) {
                    axVar.c();
                }
            }
        }
    }

    @Override // defpackage.qd
    public final void b(ja0 ja0Var) {
        ArrayList arrayList = this.c.b;
        if ((ja0Var.a.d() & 519) != 0) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((ax) arrayList.get(size)).e++;
            }
        }
    }

    @Override // defpackage.qd
    public final db0 c(db0 db0Var, List list) {
        ArrayList arrayList = this.c.b;
        RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
        int i = 0;
        for (int size = list.size() - 1; size >= 0; size--) {
            ja0 ja0Var = (ja0) list.get(size);
            Integer num = (Integer) this.b.get(ja0Var);
            if (num != null) {
                int intValue = num.intValue();
                float a = ja0Var.a.a();
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
        io.b(db0Var.a.h(519), db0Var.a.h(64));
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ax axVar = (ax) arrayList.get(size2);
            io ioVar = axVar.d;
            ArrayList arrayList2 = axVar.a;
            for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
                ((cb) arrayList2.get(size3)).getClass();
                if ((0 & i) != 0) {
                    throw null;
                }
            }
        }
        return db0Var;
    }

    @Override // defpackage.qd
    public final o4 d(ja0 ja0Var, o4 o4Var) {
        if ((ja0Var.a.d() & 519) != 0) {
            io ioVar = (io) o4Var.h;
            io ioVar2 = (io) o4Var.g;
            int i = ioVar.a != ioVar2.a ? 1 : 0;
            if (ioVar.b != ioVar2.b) {
                i |= 2;
            }
            if (ioVar.c != ioVar2.c) {
                i |= 4;
            }
            if (ioVar.d != ioVar2.d) {
                i |= 8;
            }
            this.b.put(ja0Var, Integer.valueOf(i));
        }
        return o4Var;
    }
}
