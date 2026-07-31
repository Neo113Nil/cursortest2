package yads;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class e83 implements nq {
    public static final mq d = new mq() { // from class: yads.e83$$ExternalSyntheticLambda0
        @Override // yads.mq
        public final nq a(Bundle bundle) {
            return e83.a(bundle);
        }
    };
    public final x73 b;
    public final l41 c;

    public e83(x73 x73Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= x73Var.b)) {
            throw new IndexOutOfBoundsException();
        }
        this.b = x73Var;
        this.c = l41.a(list);
    }

    public static e83 a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(Integer.toString(0, 36));
        bundle2.getClass();
        x73 x73Var = (x73) x73.g.a(bundle2);
        int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
        intArray.getClass();
        return new e83(x73Var, intArray.length == 0 ? Collections.emptyList() : new mc1(intArray));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e83.class != obj.getClass()) {
            return false;
        }
        e83 e83Var = (e83) obj;
        return this.b.equals(e83Var.b) && this.c.equals(e83Var.c);
    }

    public final int hashCode() {
        return (this.c.hashCode() * 31) + this.b.hashCode();
    }
}
