package o;

/* renamed from: o.uL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2018uL {
    public final F a;
    public final String b;
    public final Object[] c;
    public final int d;

    public C2018uL(AbstractC2181wq abstractC2181wq, String str, Object[] objArr) {
        this.a = abstractC2181wq;
        this.b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.d = i | (charAt2 << i2);
                return;
            } else {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }
}
