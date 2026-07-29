package o;

/* renamed from: o.hJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1161hJ extends AbstractC2181wq {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final C1161hJ DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile BH PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    static {
        C1161hJ c1161hJ = new C1161hJ();
        DEFAULT_INSTANCE = c1161hJ;
        AbstractC2181wq.j(C1161hJ.class, c1161hJ);
    }

    public static C1095gJ D() {
        return (C1095gJ) ((AbstractC1720pq) DEFAULT_INSTANCE.c(5));
    }

    public static void l(C1161hJ c1161hJ, long j) {
        c1161hJ.valueCase_ = 4;
        c1161hJ.value_ = Long.valueOf(j);
    }

    public static void m(C1161hJ c1161hJ, String str) {
        c1161hJ.getClass();
        str.getClass();
        c1161hJ.valueCase_ = 5;
        c1161hJ.value_ = str;
    }

    public static void n(C1161hJ c1161hJ, C1029fJ c1029fJ) {
        c1161hJ.getClass();
        c1161hJ.value_ = c1029fJ;
        c1161hJ.valueCase_ = 6;
    }

    public static void o(C1161hJ c1161hJ, double d) {
        c1161hJ.valueCase_ = 7;
        c1161hJ.value_ = Double.valueOf(d);
    }

    public static void p(C1161hJ c1161hJ, C1151h9 c1151h9) {
        c1161hJ.getClass();
        c1161hJ.valueCase_ = 8;
        c1161hJ.value_ = c1151h9;
    }

    public static void q(C1161hJ c1161hJ, boolean z) {
        c1161hJ.valueCase_ = 1;
        c1161hJ.value_ = Boolean.valueOf(z);
    }

    public static void r(C1161hJ c1161hJ, float f) {
        c1161hJ.valueCase_ = 2;
        c1161hJ.value_ = Float.valueOf(f);
    }

    public static void s(C1161hJ c1161hJ, int i) {
        c1161hJ.valueCase_ = 3;
        c1161hJ.value_ = Integer.valueOf(i);
    }

    public static C1161hJ v() {
        return DEFAULT_INSTANCE;
    }

    public final String A() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final C1029fJ B() {
        return this.valueCase_ == 6 ? (C1029fJ) this.value_ : C1029fJ.m();
    }

    public final int C() {
        switch (this.valueCase_) {
            case 0:
                return 9;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case STRING_FIELD_NUMBER /* 5 */:
                return 5;
            case STRING_SET_FIELD_NUMBER /* 6 */:
                return 6;
            case DOUBLE_FIELD_NUMBER /* 7 */:
                return 7;
            case 8:
                return 8;
            default:
                return 0;
        }
    }

    @Override // o.AbstractC2181wq
    public final Object c(int i) {
        BH bh;
        switch (AbstractC1888sN.v(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C2018uL(DEFAULT_INSTANCE, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001်\u0000\u0002ဴ\u0000\u0003့\u0000\u0004ဵ\u0000\u0005ျ\u0000\u0006ြ\u0000\u0007ဳ\u0000\bွ\u0000", new Object[]{"value_", "valueCase_", "bitField0_", C1029fJ.class});
            case 3:
                return new C1161hJ();
            case 4:
                return new C1095gJ(DEFAULT_INSTANCE);
            case STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case STRING_SET_FIELD_NUMBER /* 6 */:
                BH bh2 = PARSER;
                if (bh2 != null) {
                    return bh2;
                }
                synchronized (C1161hJ.class) {
                    try {
                        bh = PARSER;
                        if (bh == null) {
                            bh = new C1786qq();
                            PARSER = bh;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return bh;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean t() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final C1151h9 u() {
        return this.valueCase_ == 8 ? (C1151h9) this.value_ : C1151h9.j;
    }

    public final double w() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float x() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int y() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long z() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }
}
