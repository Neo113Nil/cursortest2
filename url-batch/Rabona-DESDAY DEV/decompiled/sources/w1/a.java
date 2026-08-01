package w1;

import X0.d;
import v1.f;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f4174a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(e1.a.f1915a);
        d.d(bytes, "this as java.lang.String).getBytes(charset)");
        f4174a = bytes;
    }

    public static final String a(f fVar, long j2) {
        d.e(fVar, "<this>");
        if (j2 > 0) {
            long j3 = j2 - 1;
            if (fVar.f(j3) == 13) {
                String l2 = fVar.l(j3, e1.a.f1915a);
                fVar.m(2L);
                return l2;
            }
        }
        String l3 = fVar.l(j2, e1.a.f1915a);
        fVar.m(1L);
        return l3;
    }
}
