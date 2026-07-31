package yads;

import java.util.Comparator;

/* loaded from: classes9.dex */
public final class no3 {
    public static final Comparator c = new Comparator() { // from class: yads.no3$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int compare;
            compare = Integer.compare(((no3) obj).a.b, ((no3) obj2).a.b);
            return compare;
        }
    };
    public final oo3 a;
    public final int b;

    public no3(oo3 oo3Var, int i) {
        this.a = oo3Var;
        this.b = i;
    }
}
