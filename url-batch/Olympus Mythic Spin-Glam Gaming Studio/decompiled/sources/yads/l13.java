package yads;

import java.util.ArrayList;
import java.util.Comparator;

/* loaded from: classes15.dex */
public final class l13 {
    public static final Comparator h = new Comparator() { // from class: yads.l13$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return l13.a((k13) obj, (k13) obj2);
        }
    };
    public static final Comparator i = new Comparator() { // from class: yads.l13$$ExternalSyntheticLambda1
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int compare;
            compare = Float.compare(((k13) obj).c, ((k13) obj2).c);
            return compare;
        }
    };
    public final int a;
    public int e;
    public int f;
    public int g;
    public final k13[] c = new k13[5];
    public final ArrayList b = new ArrayList();
    public int d = -1;

    public l13(int i2) {
        this.a = i2;
    }

    public static /* synthetic */ int a(k13 k13Var, k13 k13Var2) {
        return k13Var.a - k13Var2.a;
    }
}
