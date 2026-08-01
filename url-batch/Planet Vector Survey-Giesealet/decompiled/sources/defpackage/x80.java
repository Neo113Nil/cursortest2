package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class x80 extends v00 implements su {
    public final /* synthetic */ wm0 e;
    public final /* synthetic */ f70 f;
    public final /* synthetic */ bt0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x80(wm0 wm0Var, f70 f70Var, bt0 bt0Var) {
        super(4);
        this.e = wm0Var;
        this.f = f70Var;
        this.g = bt0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    @Override // defpackage.su
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        y70 y70Var;
        k6 k6Var = (k6) obj;
        y70 y70Var2 = (y70) obj2;
        ih ihVar = (ih) obj3;
        ((Number) obj4).intValue();
        if (!((Boolean) this.f.getValue()).booleanValue()) {
            List list = (List) this.g.getValue();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    y70Var = 0;
                    break;
                }
                y70Var = listIterator.previous();
                if (nz.l(y70Var2, (y70) y70Var)) {
                    break;
                }
            }
            y70Var2 = y70Var;
        }
        if (y70Var2 != null) {
            nz.f(y70Var2, this.e, a50.E(-1263531443, new w3(8, y70Var2, k6Var), ihVar), ihVar, 384);
        }
        return ky0.a;
    }
}
