package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class k4 implements g50 {
    public static final k4 b = new k4(0);
    public static final k4 c = new k4(1);
    public static final k4 d = new k4(2);
    public static final k4 e = new k4(3);
    public static final k4 f = new k4(4);
    public final /* synthetic */ int a;

    public /* synthetic */ k4(int i) {
        this.a = i;
    }

    @Override // defpackage.g50
    public final e40 f(f40 f40Var, List list, long j) {
        int i = this.a;
        xp xpVar = xp.d;
        switch (i) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    yf0 d2 = ((b50) list.get(i4)).d(j);
                    i2 = Math.max(i2, d2.d);
                    i3 = Math.max(i3, d2.e);
                    arrayList.add(d2);
                }
                if (list.isEmpty()) {
                    i2 = ui.j(j);
                    i3 = ui.i(j);
                }
                return f40Var.h0(i2, i3, xpVar, new j4(0, arrayList));
            case 1:
                return f40Var.h0(ui.j(j), ui.i(j), xpVar, o1.n);
            case 2:
                return f40Var.h0(ui.h(j), ui.g(j), xpVar, o1.u);
            case 3:
                return f40Var.h0(ui.j(j), ui.i(j), xpVar, o1.D);
            default:
                return f40Var.h0(ui.f(j) ? ui.h(j) : 0, ui.e(j) ? ui.g(j) : 0, xpVar, j80.A);
        }
    }
}
