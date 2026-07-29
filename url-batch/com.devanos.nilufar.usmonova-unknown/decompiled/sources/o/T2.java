package o;

import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class T2 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ T2(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                C2287yQ c2287yQ = (C2287yQ) obj2;
                Object valueOf = Float.valueOf(0.0f);
                C2023uQ c2023uQ = ((C2287yQ) obj).d;
                FQ fq = CQ.n;
                Object obj3 = c2023uQ.h.get(fq);
                if (obj3 == null) {
                    obj3 = valueOf;
                }
                float floatValue = ((Number) obj3).floatValue();
                Object obj4 = c2287yQ.d.h.get(fq);
                if (obj4 != null) {
                    valueOf = obj4;
                }
                return Float.compare(floatValue, ((Number) valueOf).floatValue());
            case 1:
                return AbstractC0048Bt.t(((C0256Jt) obj).b, ((C0256Jt) obj2).b);
            case 2:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            default:
                C0027Ay c0027Ay = (C0027Ay) obj;
                C0027Ay c0027Ay2 = (C0027Ay) obj2;
                float f = c0027Ay.v.q.v;
                float f2 = c0027Ay2.v.q.v;
                return f == f2 ? AbstractC0048Bt.t(c0027Ay.m(), c0027Ay2.m()) : Float.compare(f, f2);
        }
    }
}
