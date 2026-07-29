package o;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: o.Pl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0403Pl {
    public static final /* synthetic */ int c = 0;
    public final C1104gS a = new C1104gS(16);
    public boolean b;

    static {
        new C0403Pl(0);
    }

    public C0403Pl() {
    }

    public static void b(C0627Yb c0627Yb, J10 j10, int i, Object obj) {
        if (j10 == J10.k) {
            c0627Yb.s0(i, 3);
            ((F) obj).b(c0627Yb);
            c0627Yb.s0(i, 4);
        }
        c0627Yb.s0(i, j10.i);
        switch (j10.ordinal()) {
            case 0:
                c0627Yb.m0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                c0627Yb.k0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                c0627Yb.w0(((Long) obj).longValue());
                break;
            case 3:
                c0627Yb.w0(((Long) obj).longValue());
                break;
            case 4:
                c0627Yb.o0(((Integer) obj).intValue());
                break;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                c0627Yb.m0(((Long) obj).longValue());
                break;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                c0627Yb.k0(((Integer) obj).intValue());
                break;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                c0627Yb.e0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof C1151h9)) {
                    c0627Yb.r0((String) obj);
                    break;
                } else {
                    c0627Yb.i0((C1151h9) obj);
                    break;
                }
            case 9:
                ((F) obj).b(c0627Yb);
                break;
            case 10:
                F f = (F) obj;
                c0627Yb.getClass();
                c0627Yb.u0(((AbstractC2181wq) f).a(null));
                f.b(c0627Yb);
                break;
            case 11:
                if (!(obj instanceof C1151h9)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c0627Yb.u0(length);
                    c0627Yb.f0(bArr, 0, length);
                    break;
                } else {
                    c0627Yb.i0((C1151h9) obj);
                    break;
                }
            case 12:
                c0627Yb.u0(((Integer) obj).intValue());
                break;
            case 13:
                c0627Yb.o0(((Integer) obj).intValue());
                break;
            case 14:
                c0627Yb.k0(((Integer) obj).intValue());
                break;
            case 15:
                c0627Yb.m0(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                c0627Yb.u0((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                c0627Yb.w0((longValue >> 63) ^ (longValue << 1));
                break;
        }
    }

    public final void a() {
        C1104gS c1104gS;
        if (this.b) {
            return;
        }
        int i = 0;
        while (true) {
            c1104gS = this.a;
            if (i >= c1104gS.i.size()) {
                break;
            }
            Map.Entry c2 = c1104gS.c(i);
            if (c2.getValue() instanceof AbstractC2181wq) {
                AbstractC2181wq abstractC2181wq = (AbstractC2181wq) c2.getValue();
                abstractC2181wq.getClass();
                C1229iL c1229iL = C1229iL.c;
                c1229iL.getClass();
                c1229iL.a(abstractC2181wq.getClass()).d(abstractC2181wq);
                abstractC2181wq.h();
            }
            i++;
        }
        if (!c1104gS.k) {
            if (c1104gS.i.size() > 0) {
                c1104gS.c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = c1104gS.d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!c1104gS.k) {
            c1104gS.j = c1104gS.j.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(c1104gS.j);
            c1104gS.m = c1104gS.m.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(c1104gS.m);
            c1104gS.k = true;
        }
        this.b = true;
    }

    public final Object clone() {
        C0403Pl c0403Pl = new C0403Pl();
        C1104gS c1104gS = this.a;
        if (c1104gS.i.size() > 0) {
            Map.Entry c2 = c1104gS.c(0);
            if (c2.getKey() != null) {
                throw new ClassCastException();
            }
            c2.getValue();
            throw null;
        }
        Iterator it = c1104gS.d().iterator();
        if (!it.hasNext()) {
            return c0403Pl;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0403Pl) {
            return this.a.equals(((C0403Pl) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public C0403Pl(int i) {
        a();
        a();
    }
}
