package yads;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class ve2 implements nq {
    public static final ve2 c = new ve2(new zu0(new SparseBooleanArray()));
    public final zu0 b;

    static {
        new mq() { // from class: yads.ve2$$ExternalSyntheticLambda0
            @Override // yads.mq
            public final nq a(Bundle bundle) {
                return ve2.a(bundle);
            }
        };
    }

    public ve2(zu0 zu0Var) {
        this.b = zu0Var;
    }

    public static ve2 a(Bundle bundle) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(Integer.toString(0, 36));
        if (integerArrayList == null) {
            return c;
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i = 0; i < integerArrayList.size(); i++) {
            sparseBooleanArray.append(integerArrayList.get(i).intValue(), true);
        }
        return new ve2(new zu0(sparseBooleanArray));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ve2) {
            return this.b.equals(((ve2) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
