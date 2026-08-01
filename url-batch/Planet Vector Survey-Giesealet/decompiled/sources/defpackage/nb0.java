package defpackage;

import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class nb0 extends oc0 {
    public static final nb0 c = new nb0(0, 2, 1);

    @Override // defpackage.oc0
    public final void a(qc0 qc0Var, u7 u7Var, mr0 mr0Var, ca0 ca0Var, pc0 pc0Var) {
        int i = ((gz) qc0Var.b(0)).a;
        List list = (List) qc0Var.b(1);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            int i3 = i + i2;
            u7Var.b(i3, obj);
            u7Var.e(i3, obj);
        }
    }
}
