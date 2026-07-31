package yads;

import android.os.Bundle;

/* loaded from: classes6.dex */
public abstract class ul2 implements nq {
    public static final mq b = new mq() { // from class: yads.ul2$$ExternalSyntheticLambda0
        @Override // yads.mq
        public final nq a(Bundle bundle) {
            return ul2.a(bundle);
        }
    };

    public static ul2 a(Bundle bundle) {
        int i = bundle.getInt(Integer.toString(0, 36), -1);
        if (i == 0) {
            return (ul2) zz0.e.a(bundle);
        }
        if (i == 1) {
            return (ul2) rc2.d.a(bundle);
        }
        if (i == 2) {
            return (ul2) v33.e.a(bundle);
        }
        if (i == 3) {
            return (ul2) r63.e.a(bundle);
        }
        throw new IllegalArgumentException(gg2.a(i, "Unknown RatingType: "));
    }
}
