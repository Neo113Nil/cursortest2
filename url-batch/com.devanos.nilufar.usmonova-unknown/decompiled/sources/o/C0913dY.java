package o;

/* renamed from: o.dY, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0913dY {
    public static C0847cY a(Object obj) {
        AbstractC2181wq abstractC2181wq = (AbstractC2181wq) obj;
        C0847cY c0847cY = abstractC2181wq.unknownFields;
        if (c0847cY != C0847cY.f) {
            return c0847cY;
        }
        C0847cY c0847cY2 = new C0847cY(0, new int[8], new Object[8], true);
        abstractC2181wq.unknownFields = c0847cY2;
        return c0847cY2;
    }

    public static boolean b(Object obj, C0575Wb c0575Wb) {
        AbstractC0549Vb abstractC0549Vb = (AbstractC0549Vb) c0575Wb.d;
        int i = c0575Wb.a;
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            c0575Wb.y(0);
            ((C0847cY) obj).c(i2 << 3, Long.valueOf(abstractC0549Vb.n()));
            return true;
        }
        if (i3 == 1) {
            c0575Wb.y(1);
            ((C0847cY) obj).c((i2 << 3) | 1, Long.valueOf(abstractC0549Vb.k()));
            return true;
        }
        if (i3 == 2) {
            ((C0847cY) obj).c((i2 << 3) | 2, c0575Wb.g());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw C0230It.b();
            }
            c0575Wb.y(5);
            ((C0847cY) obj).c((i2 << 3) | 5, Integer.valueOf(abstractC0549Vb.j()));
            return true;
        }
        C0847cY c0847cY = new C0847cY(0, new int[8], new Object[8], true);
        int i4 = i2 << 3;
        int i5 = i4 | 4;
        while (c0575Wb.a() != Integer.MAX_VALUE && b(c0847cY, c0575Wb)) {
        }
        if (i5 != c0575Wb.a) {
            throw new C0230It("Protocol message end-group tag did not match expected tag.");
        }
        c0847cY.e = false;
        ((C0847cY) obj).c(i4 | 3, c0847cY);
        return true;
    }
}
