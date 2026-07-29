package o;

/* loaded from: classes.dex */
public final class AB {
    public final C0950e6 a;
    public final Object b;

    public AB(J10 j10, J10 j102, C1161hJ c1161hJ) {
        this.a = new C0950e6(j10, j102, c1161hJ, 15);
        this.b = c1161hJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(C0950e6 c0950e6, Object obj, Object obj2) {
        int b0;
        int a;
        int a0;
        J10 j10;
        int a2;
        int a02;
        J10 j102 = (J10) c0950e6.i;
        int i = C0403Pl.c;
        int i2 = 1;
        int Z = C0627Yb.Z(1);
        D10 d10 = J10.k;
        if (j102 == d10) {
            Z *= 2;
        }
        switch (j102.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                b0 = 8;
                int i3 = b0 + Z;
                j10 = (J10) c0950e6.j;
                int Z2 = C0627Yb.Z(2);
                if (j10 == d10) {
                    Z2 *= 2;
                }
                switch (j10.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        i2 = 8;
                        return i2 + Z2 + i3;
                    case 1:
                        ((Float) obj2).getClass();
                        i2 = 4;
                        return i2 + Z2 + i3;
                    case 2:
                        i2 = C0627Yb.b0(((Long) obj2).longValue());
                        return i2 + Z2 + i3;
                    case 3:
                        i2 = C0627Yb.b0(((Long) obj2).longValue());
                        return i2 + Z2 + i3;
                    case 4:
                        i2 = C0627Yb.X(((Integer) obj2).intValue());
                        return i2 + Z2 + i3;
                    case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        i2 = 8;
                        return i2 + Z2 + i3;
                    case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        i2 = 4;
                        return i2 + Z2 + i3;
                    case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return i2 + Z2 + i3;
                    case 8:
                        i2 = obj2 instanceof C1151h9 ? C0627Yb.T((C1151h9) obj2) : C0627Yb.Y((String) obj2);
                        return i2 + Z2 + i3;
                    case 9:
                        i2 = ((AbstractC2181wq) ((F) obj2)).a(null);
                        return i2 + Z2 + i3;
                    case 10:
                        a2 = ((AbstractC2181wq) ((F) obj2)).a(null);
                        a02 = C0627Yb.a0(a2);
                        i2 = a02 + a2;
                        return i2 + Z2 + i3;
                    case 11:
                        if (obj2 instanceof C1151h9) {
                            i2 = C0627Yb.T((C1151h9) obj2);
                            return i2 + Z2 + i3;
                        }
                        a2 = ((byte[]) obj2).length;
                        a02 = C0627Yb.a0(a2);
                        i2 = a02 + a2;
                        return i2 + Z2 + i3;
                    case 12:
                        i2 = C0627Yb.a0(((Integer) obj2).intValue());
                        return i2 + Z2 + i3;
                    case 13:
                        i2 = C0627Yb.X(((Integer) obj2).intValue());
                        return i2 + Z2 + i3;
                    case 14:
                        ((Integer) obj2).getClass();
                        i2 = 4;
                        return i2 + Z2 + i3;
                    case 15:
                        ((Long) obj2).getClass();
                        i2 = 8;
                        return i2 + Z2 + i3;
                    case 16:
                        int intValue = ((Integer) obj2).intValue();
                        i2 = C0627Yb.a0((intValue >> 31) ^ (intValue << 1));
                        return i2 + Z2 + i3;
                    case 17:
                        long longValue = ((Long) obj2).longValue();
                        i2 = C0627Yb.b0((longValue >> 63) ^ (longValue << 1));
                        return i2 + Z2 + i3;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 1:
                ((Float) obj).getClass();
                b0 = 4;
                int i32 = b0 + Z;
                j10 = (J10) c0950e6.j;
                int Z22 = C0627Yb.Z(2);
                if (j10 == d10) {
                }
                switch (j10.ordinal()) {
                }
            case 2:
                b0 = C0627Yb.b0(((Long) obj).longValue());
                int i322 = b0 + Z;
                j10 = (J10) c0950e6.j;
                int Z222 = C0627Yb.Z(2);
                if (j10 == d10) {
                }
                switch (j10.ordinal()) {
                }
            case 3:
                b0 = C0627Yb.b0(((Long) obj).longValue());
                int i3222 = b0 + Z;
                j10 = (J10) c0950e6.j;
                int Z2222 = C0627Yb.Z(2);
                if (j10 == d10) {
                }
                switch (j10.ordinal()) {
                }
            case 4:
                b0 = C0627Yb.X(((Integer) obj).intValue());
                int i32222 = b0 + Z;
                j10 = (J10) c0950e6.j;
                int Z22222 = C0627Yb.Z(2);
                if (j10 == d10) {
                }
                switch (j10.ordinal()) {
                }
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                ((Long) obj).getClass();
                b0 = 8;
                int i322222 = b0 + Z;
                j10 = (J10) c0950e6.j;
                int Z222222 = C0627Yb.Z(2);
                if (j10 == d10) {
                }
                switch (j10.ordinal()) {
                }
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                ((Integer) obj).getClass();
                b0 = 4;
                int i3222222 = b0 + Z;
                j10 = (J10) c0950e6.j;
                int Z2222222 = C0627Yb.Z(2);
                if (j10 == d10) {
                }
                switch (j10.ordinal()) {
                }
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Boolean) obj).getClass();
                b0 = 1;
                int i32222222 = b0 + Z;
                j10 = (J10) c0950e6.j;
                int Z22222222 = C0627Yb.Z(2);
                if (j10 == d10) {
                }
                switch (j10.ordinal()) {
                }
            case 8:
                b0 = obj instanceof C1151h9 ? C0627Yb.T((C1151h9) obj) : C0627Yb.Y((String) obj);
                int i322222222 = b0 + Z;
                j10 = (J10) c0950e6.j;
                int Z222222222 = C0627Yb.Z(2);
                if (j10 == d10) {
                }
                switch (j10.ordinal()) {
                }
            case 9:
                b0 = ((AbstractC2181wq) ((F) obj)).a(null);
                int i3222222222 = b0 + Z;
                j10 = (J10) c0950e6.j;
                int Z2222222222 = C0627Yb.Z(2);
                if (j10 == d10) {
                }
                switch (j10.ordinal()) {
                }
            case 10:
                a = ((AbstractC2181wq) ((F) obj)).a(null);
                a0 = C0627Yb.a0(a);
                b0 = a + a0;
                int i32222222222 = b0 + Z;
                j10 = (J10) c0950e6.j;
                int Z22222222222 = C0627Yb.Z(2);
                if (j10 == d10) {
                }
                switch (j10.ordinal()) {
                }
            case 11:
                if (obj instanceof C1151h9) {
                    b0 = C0627Yb.T((C1151h9) obj);
                    int i322222222222 = b0 + Z;
                    j10 = (J10) c0950e6.j;
                    int Z222222222222 = C0627Yb.Z(2);
                    if (j10 == d10) {
                    }
                    switch (j10.ordinal()) {
                    }
                } else {
                    a = ((byte[]) obj).length;
                    a0 = C0627Yb.a0(a);
                    b0 = a + a0;
                    int i3222222222222 = b0 + Z;
                    j10 = (J10) c0950e6.j;
                    int Z2222222222222 = C0627Yb.Z(2);
                    if (j10 == d10) {
                    }
                    switch (j10.ordinal()) {
                    }
                }
            case 12:
                b0 = C0627Yb.a0(((Integer) obj).intValue());
                int i32222222222222 = b0 + Z;
                j10 = (J10) c0950e6.j;
                int Z22222222222222 = C0627Yb.Z(2);
                if (j10 == d10) {
                }
                switch (j10.ordinal()) {
                }
            case 13:
                b0 = C0627Yb.X(((Integer) obj).intValue());
                int i322222222222222 = b0 + Z;
                j10 = (J10) c0950e6.j;
                int Z222222222222222 = C0627Yb.Z(2);
                if (j10 == d10) {
                }
                switch (j10.ordinal()) {
                }
            case 14:
                ((Integer) obj).getClass();
                b0 = 4;
                int i3222222222222222 = b0 + Z;
                j10 = (J10) c0950e6.j;
                int Z2222222222222222 = C0627Yb.Z(2);
                if (j10 == d10) {
                }
                switch (j10.ordinal()) {
                }
            case 15:
                ((Long) obj).getClass();
                b0 = 8;
                int i32222222222222222 = b0 + Z;
                j10 = (J10) c0950e6.j;
                int Z22222222222222222 = C0627Yb.Z(2);
                if (j10 == d10) {
                }
                switch (j10.ordinal()) {
                }
            case 16:
                int intValue2 = ((Integer) obj).intValue();
                b0 = C0627Yb.a0((intValue2 >> 31) ^ (intValue2 << 1));
                int i322222222222222222 = b0 + Z;
                j10 = (J10) c0950e6.j;
                int Z222222222222222222 = C0627Yb.Z(2);
                if (j10 == d10) {
                }
                switch (j10.ordinal()) {
                }
            case 17:
                long longValue2 = ((Long) obj).longValue();
                b0 = C0627Yb.b0((longValue2 >> 63) ^ (longValue2 << 1));
                int i3222222222222222222 = b0 + Z;
                j10 = (J10) c0950e6.j;
                int Z2222222222222222222 = C0627Yb.Z(2);
                if (j10 == d10) {
                }
                switch (j10.ordinal()) {
                }
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
