package yads;

import java.util.Comparator;
import java.util.TreeSet;

/* loaded from: classes4.dex */
public final class yd1 {
    public final long a;
    public final TreeSet b = new TreeSet(new Comparator() { // from class: yads.yd1$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return yd1.a((mr) obj, (mr) obj2);
        }
    });
    public long c;

    public yd1(long j) {
        this.a = j;
    }

    public final void a(br brVar, long j) {
        while (this.c + j > this.a && !this.b.isEmpty()) {
            mr mrVar = (mr) this.b.first();
            lz2 lz2Var = (lz2) brVar;
            synchronized (lz2Var) {
                lz2Var.a(mrVar);
            }
        }
    }

    public static int a(mr mrVar, mr mrVar2) {
        long j = mrVar.g;
        long j2 = mrVar2.g;
        if (j - j2 != 0) {
            return j < j2 ? -1 : 1;
        }
        if (!mrVar.b.equals(mrVar2.b)) {
            return mrVar.b.compareTo(mrVar2.b);
        }
        long j3 = mrVar.c - mrVar2.c;
        if (j3 == 0) {
            return 0;
        }
        return j3 < 0 ? -1 : 1;
    }
}
