package o;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: o.Al, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0014Al extends ZM {
    public final Object e;
    public final String f;
    public final int g;
    public final F4 h;

    public C0014Al(Object obj, String str, HO ho, int i) {
        Collection collection;
        AbstractC0048Bt.n(obj, "value");
        AbstractC1888sN.p(i, "verificationMode");
        this.e = obj;
        this.f = str;
        this.g = i;
        String d = ZM.d(obj, str);
        AbstractC0048Bt.n(d, "message");
        F4 f4 = new F4(d);
        StackTraceElement[] stackTrace = f4.getStackTrace();
        AbstractC0048Bt.m(stackTrace, "stackTrace");
        int length = stackTrace.length - 2;
        length = length < 0 ? 0 : length;
        if (length < 0) {
            throw new IllegalArgumentException(AbstractC1888sN.h(length, "Requested element count ", " is less than zero.").toString());
        }
        if (length == 0) {
            collection = C1318jk.h;
        } else {
            int length2 = stackTrace.length;
            if (length >= length2) {
                collection = P6.t0(stackTrace);
            } else if (length == 1) {
                collection = AbstractC0868ct.J(stackTrace[length2 - 1]);
            } else {
                ArrayList arrayList = new ArrayList(length);
                for (int i2 = length2 - length; i2 < length2; i2++) {
                    arrayList.add(stackTrace[i2]);
                }
                collection = arrayList;
            }
        }
        f4.setStackTrace((StackTraceElement[]) collection.toArray(new StackTraceElement[0]));
        this.h = f4;
    }

    @Override // o.ZM
    public final Object c() {
        int v = AbstractC1888sN.v(this.g);
        if (v == 0) {
            throw this.h;
        }
        if (v != 1) {
            if (v == 2) {
                return null;
            }
            throw new C0057Cc();
        }
        String d = ZM.d(this.e, this.f);
        AbstractC0048Bt.n(d, "message");
        Log.d("uR", d);
        return null;
    }

    @Override // o.ZM
    public final ZM k(String str, InterfaceC2114vp interfaceC2114vp) {
        return this;
    }
}
