package yads;

import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class e93 implements nq {
    public static final e93 c;
    public final l41 b;

    static {
        i41 i41Var = l41.c;
        c = new e93(um2.f);
        new mq() { // from class: yads.e93$$ExternalSyntheticLambda0
            @Override // yads.mq
            public final nq a(Bundle bundle) {
                return e93.a(bundle);
            }
        };
    }

    public e93(l41 l41Var) {
        this.b = l41.a(l41Var);
    }

    public final boolean a(int i) {
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            d93 d93Var = (d93) this.b.get(i2);
            boolean[] zArr = d93Var.f;
            int length = zArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (!zArr[i3]) {
                    i3++;
                } else if (d93Var.c.d == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e93.class != obj.getClass()) {
            return false;
        }
        return this.b.equals(((e93) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public static e93 a(Bundle bundle) {
        um2 a;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        if (parcelableArrayList == null) {
            i41 i41Var = l41.c;
            a = um2.f;
        } else {
            a = oq.a(d93.g, parcelableArrayList);
        }
        return new e93(a);
    }
}
