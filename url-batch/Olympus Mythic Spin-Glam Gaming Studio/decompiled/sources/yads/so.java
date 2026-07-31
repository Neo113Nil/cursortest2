package yads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class so {
    public final hl1 a;
    public final zp b;

    public so(Context context) {
        hl1 hl1Var = sg0.d == new tg0().a(context.getApplicationContext()) ? new hl1(1920, 1080, 6800) : new hl1(854, 480, 1000);
        zp zpVar = new zp(hl1Var);
        this.a = hl1Var;
        this.b = zpVar;
    }

    public final gl1 a(List list) {
        Iterator it = list.iterator();
        double d = -1.0d;
        gl1 gl1Var = null;
        while (it.hasNext()) {
            gl1 gl1Var2 = (gl1) it.next();
            double d2 = Intrinsics.areEqual("video/mp4", gl1Var2.d) ? 1.5d : 1.0d;
            zp zpVar = this.b;
            zpVar.getClass();
            int i = gl1Var2.i;
            if (i == 0) {
                int i2 = gl1Var2.h * gl1Var2.g;
                hl1 hl1Var = zpVar.a;
                i = (int) ((i2 / (hl1Var.a * hl1Var.b)) * hl1Var.c);
            }
            int i3 = this.a.c;
            double abs = d2 / ((((int) Math.max(0.0d, i)) < 100 ? 10.0d : ((int) Math.abs(i3 - r9)) / i3) + 1.0d);
            if (abs > d) {
                gl1Var = gl1Var2;
                d = abs;
            }
        }
        return gl1Var;
    }
}
