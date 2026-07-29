package o;

import android.content.Context;

/* renamed from: o.t7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1938t7 extends AbstractC0578We {
    public final Context a;
    public final InterfaceC0212Ib b;
    public final InterfaceC0212Ib c;
    public final String d;

    public C1938t7(Context context, InterfaceC0212Ib interfaceC0212Ib, InterfaceC0212Ib interfaceC0212Ib2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.a = context;
        if (interfaceC0212Ib == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.b = interfaceC0212Ib;
        if (interfaceC0212Ib2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.c = interfaceC0212Ib2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0578We) {
            AbstractC0578We abstractC0578We = (AbstractC0578We) obj;
            if (this.a.equals(((C1938t7) abstractC0578We).a)) {
                C1938t7 c1938t7 = (C1938t7) abstractC0578We;
                if (this.b.equals(c1938t7.b) && this.c.equals(c1938t7.c) && this.d.equals(c1938t7.d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.a);
        sb.append(", wallClock=");
        sb.append(this.b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return AbstractC1888sN.l(sb, this.d, "}");
    }
}
