package o;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: o.ro, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1849ro extends JN {
    public static final NB c;
    public final List a;
    public final List b;

    static {
        Pattern pattern = NB.d;
        c = AbstractC0868ct.v("application/x-www-form-urlencoded");
    }

    public C1849ro(ArrayList arrayList, ArrayList arrayList2) {
        AbstractC0048Bt.n(arrayList, "encodedNames");
        AbstractC0048Bt.n(arrayList2, "encodedValues");
        this.a = HY.v(arrayList);
        this.b = HY.v(arrayList2);
    }

    public final long a(M8 m8, boolean z) {
        G8 a;
        if (z) {
            a = new G8();
        } else {
            AbstractC0048Bt.k(m8);
            a = m8.a();
        }
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                a.N(38);
            }
            a.S((String) list.get(i));
            a.N(61);
            a.S((String) this.b.get(i));
        }
        if (!z) {
            return 0L;
        }
        long j = a.i;
        a.b();
        return j;
    }

    @Override // o.JN
    public final long contentLength() {
        return a(null, true);
    }

    @Override // o.JN
    public final NB contentType() {
        return c;
    }

    @Override // o.JN
    public final void writeTo(M8 m8) {
        AbstractC0048Bt.n(m8, "sink");
        a(m8, false);
    }
}
