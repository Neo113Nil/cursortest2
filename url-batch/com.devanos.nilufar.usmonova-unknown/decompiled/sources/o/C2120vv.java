package o;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/* renamed from: o.vv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2120vv implements AH {
    public final /* synthetic */ int a;

    static {
        int i = C1649ol.b;
    }

    public /* synthetic */ C2120vv(int i) {
        this.a = i;
    }

    @Override // o.AH
    public final Object a(C0523Ub c0523Ub, C1649ol c1649ol) {
        switch (this.a) {
            case 0:
                return new C2252xv(c0523Ub);
            case 1:
                return new C2318yv(c0523Ub);
            case 2:
                return new C0024Av(c0523Ub, c1649ol);
            case 3:
                return new C0154Fv(c0523Ub, c1649ol);
            case 4:
                return new C0128Ev(c0523Ub);
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                return new C0833cK(c0523Ub, c1649ol);
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                return new C0702aK(c0523Ub, c1649ol);
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                return new ZJ(c0523Ub, c1649ol);
            case 8:
                return new C1030fK(c0523Ub, c1649ol);
            case 9:
                return new C1162hK(c0523Ub, c1649ol);
            case 10:
                return new C1292jK(c0523Ub, c1649ol);
            case 11:
                return new C1556nK(c0523Ub, c1649ol);
            case 12:
                return new C1688pK(c0523Ub, c1649ol);
            case 13:
                return new C1885sK(c0523Ub, c1649ol);
            case 14:
                return new C2017uK(c0523Ub, c1649ol);
            case 15:
                return new C2281yK(c0523Ub, c1649ol);
            case 16:
                return new AK(c0523Ub, c1649ol);
            case 17:
                return new CK(c0523Ub, c1649ol);
            case 18:
                return new GK(c0523Ub, c1649ol);
            case 19:
                return new FK(c0523Ub);
            case 20:
                return new HK(c0523Ub);
            case 21:
                return new MK(c0523Ub, c1649ol);
            case 22:
                return new KK(c0523Ub, c1649ol);
            case 23:
                return new OK(c0523Ub, c1649ol);
            case 24:
                return new RK(c0523Ub, c1649ol);
            case 25:
                return new SK(c0523Ub, c1649ol);
            case 26:
                return new UK(c0523Ub, c1649ol);
            case 27:
                return new YK(c0523Ub);
            default:
                return new ZK(c0523Ub, c1649ol);
        }
    }

    public final E b(ByteArrayInputStream byteArrayInputStream, C1649ol c1649ol) {
        E e;
        try {
            int read = byteArrayInputStream.read();
            if (read == -1) {
                e = null;
            } else {
                if ((read & 128) != 0) {
                    read &= 127;
                    int i = 7;
                    while (true) {
                        if (i >= 32) {
                            while (i < 64) {
                                int read2 = byteArrayInputStream.read();
                                if (read2 == -1) {
                                    throw C0204Ht.a();
                                }
                                if ((read2 & 128) != 0) {
                                    i += 7;
                                }
                            }
                            throw new C0204Ht("CodedInputStream encountered a malformed varint.");
                        }
                        int read3 = byteArrayInputStream.read();
                        if (read3 == -1) {
                            throw C0204Ht.a();
                        }
                        read |= (read3 & 127) << i;
                        if ((read3 & 128) == 0) {
                            break;
                        }
                        i += 7;
                    }
                }
                C0523Ub c0523Ub = new C0523Ub(new D(byteArrayInputStream, read));
                E e2 = (E) a(c0523Ub, c1649ol);
                try {
                    c0523Ub.a(0);
                    e = e2;
                } catch (C0204Ht e3) {
                    e3.h = e2;
                    throw e3;
                }
            }
            if (e == null || e.b()) {
                return e;
            }
            C0204Ht c0204Ht = new C0204Ht(new C0057Cc().getMessage());
            c0204Ht.h = e;
            throw c0204Ht;
        } catch (IOException e4) {
            throw new C0204Ht(e4.getMessage());
        }
    }
}
