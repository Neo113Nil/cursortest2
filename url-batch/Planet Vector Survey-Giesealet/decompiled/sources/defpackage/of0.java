package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class of0 extends e0 {
    public final /* synthetic */ int d;
    public final hf0 e;

    public /* synthetic */ of0(hf0 hf0Var, int i) {
        this.d = i;
        this.e = hf0Var;
    }

    @Override // defpackage.i
    public final int a() {
        int i = this.d;
        hf0 hf0Var = this.e;
        switch (i) {
            case 0:
                hf0Var.getClass();
                break;
            default:
                hf0Var.getClass();
                break;
        }
        return hf0Var.e;
    }

    @Override // defpackage.i, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.d;
        hf0 hf0Var = this.e;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object obj2 = hf0Var.get(entry.getKey());
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && hf0Var.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return hf0Var.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.d) {
            case 0:
                kx0 kx0Var = this.e.d;
                lx0[] lx0VarArr = new lx0[8];
                for (int i = 0; i < 8; i++) {
                    lx0VarArr[i] = new mx0(0);
                }
                return new pf0(kx0Var, lx0VarArr);
            default:
                kx0 kx0Var2 = this.e.d;
                lx0[] lx0VarArr2 = new lx0[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    lx0VarArr2[i2] = new mx0(1);
                }
                return new pf0(kx0Var2, lx0VarArr2);
        }
    }
}
