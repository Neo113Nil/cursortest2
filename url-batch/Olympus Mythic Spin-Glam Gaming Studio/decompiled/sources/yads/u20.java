package yads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes14.dex */
public final class u20 implements nq {
    public static final /* synthetic */ int $r8$clinit = 0;

    static {
        i41 i41Var = l41.c;
        new u20(um2.f);
        new mq() { // from class: yads.u20$$ExternalSyntheticLambda0
            @Override // yads.mq
            public final nq a(Bundle bundle) {
                return u20.a(bundle);
            }
        };
    }

    public u20(List list) {
        l41.a(list);
    }

    public static final u20 a(Bundle bundle) {
        um2 a;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        if (parcelableArrayList == null) {
            i41 i41Var = l41.c;
            a = um2.f;
        } else {
            a = oq.a(s20.t, parcelableArrayList);
        }
        return new u20(a);
    }
}
