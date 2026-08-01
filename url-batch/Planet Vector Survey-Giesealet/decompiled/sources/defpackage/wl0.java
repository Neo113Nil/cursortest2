package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class wl0 implements g50 {
    public static final wl0 b = new wl0(0);
    public final /* synthetic */ int a;

    public /* synthetic */ wl0(int i) {
        this.a = i;
    }

    @Override // defpackage.g50
    public final e40 f(f40 f40Var, List list, long j) {
        switch (this.a) {
            case 0:
                int size = list.size();
                xp xpVar = xp.d;
                if (size == 0) {
                    return f40Var.h0(ui.j(j), ui.i(j), xpVar, j80.v);
                }
                if (size == 1) {
                    yf0 d = ((b50) list.get(0)).d(j);
                    return f40Var.h0(vi.f(j, d.d), vi.e(j, d.e), xpVar, new hq(d, 4));
                }
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < size2; i3++) {
                    yf0 d2 = ((b50) list.get(i3)).d(j);
                    i = Math.max(d2.d, i);
                    i2 = Math.max(d2.e, i2);
                    arrayList.add(d2);
                }
                return f40Var.h0(vi.f(j, i), vi.e(j, i2), xpVar, new j4(2, arrayList));
            default:
                throw new IllegalStateException("Undefined measure and it is required");
        }
    }
}
