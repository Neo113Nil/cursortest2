package yads;

import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;

/* loaded from: classes6.dex */
public final class hf0 extends g83 {
    public static final hf0 R = new hf0(new gf0());
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final SparseArray P;
    public final SparseBooleanArray Q;

    static {
        new mq() { // from class: yads.hf0$$ExternalSyntheticLambda0
            @Override // yads.mq
            public final nq a(Bundle bundle) {
                return hf0.b(bundle);
            }
        };
    }

    public hf0(gf0 gf0Var) {
        super(gf0Var);
        this.C = gf0Var.A;
        this.D = gf0Var.B;
        this.E = gf0Var.C;
        this.F = gf0Var.D;
        this.G = gf0Var.E;
        this.H = gf0Var.F;
        this.I = gf0Var.G;
        this.J = gf0Var.H;
        this.K = gf0Var.I;
        this.L = gf0Var.J;
        this.M = gf0Var.K;
        this.N = gf0Var.L;
        this.O = gf0Var.M;
        this.P = gf0Var.N;
        this.Q = gf0Var.O;
    }

    public static hf0 b(Bundle bundle) {
        return new hf0(new gf0(bundle));
    }

    @Override // yads.g83
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hf0.class != obj.getClass()) {
            return false;
        }
        hf0 hf0Var = (hf0) obj;
        if (super.equals(hf0Var) && this.C == hf0Var.C && this.D == hf0Var.D && this.E == hf0Var.E && this.F == hf0Var.F && this.G == hf0Var.G && this.H == hf0Var.H && this.I == hf0Var.I && this.J == hf0Var.J && this.K == hf0Var.K && this.L == hf0Var.L && this.M == hf0Var.M && this.N == hf0Var.N && this.O == hf0Var.O) {
            SparseBooleanArray sparseBooleanArray = this.Q;
            SparseBooleanArray sparseBooleanArray2 = hf0Var.Q;
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() == size) {
                int i = 0;
                while (true) {
                    if (i >= size) {
                        SparseArray sparseArray = this.P;
                        SparseArray sparseArray2 = hf0Var.P;
                        int size2 = sparseArray.size();
                        if (sparseArray2.size() == size2) {
                            for (int i2 = 0; i2 < size2; i2++) {
                                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                if (indexOfKey >= 0) {
                                    Map map = (Map) sparseArray.valueAt(i2);
                                    Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                    if (map2.size() == map.size()) {
                                        for (Map.Entry entry : map.entrySet()) {
                                            y73 y73Var = (y73) entry.getKey();
                                            if (map2.containsKey(y73Var) && sb3.a(entry.getValue(), map2.get(y73Var))) {
                                            }
                                        }
                                    }
                                }
                            }
                            return true;
                        }
                    } else {
                        if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return false;
    }

    @Override // yads.g83
    public final int hashCode() {
        return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.C ? 1 : 0)) * 31) + (this.D ? 1 : 0)) * 31) + (this.E ? 1 : 0)) * 31) + (this.F ? 1 : 0)) * 31) + (this.G ? 1 : 0)) * 31) + (this.H ? 1 : 0)) * 31) + (this.I ? 1 : 0)) * 31) + (this.J ? 1 : 0)) * 31) + (this.K ? 1 : 0)) * 31) + (this.L ? 1 : 0)) * 31) + (this.M ? 1 : 0)) * 31) + (this.N ? 1 : 0)) * 31) + (this.O ? 1 : 0);
    }
}
