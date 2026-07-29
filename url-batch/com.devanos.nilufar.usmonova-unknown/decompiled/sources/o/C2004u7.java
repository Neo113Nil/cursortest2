package o;

import com.google.firebase.messaging.reporting.MessagingClientEventExtension;

/* renamed from: o.u7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2004u7 {
    public final Object a;
    public final C7 b;

    public C2004u7(MessagingClientEventExtension messagingClientEventExtension, C7 c7) {
        if (messagingClientEventExtension == null) {
            throw new NullPointerException("Null payload");
        }
        this.a = messagingClientEventExtension;
        this.b = c7;
    }

    public final boolean equals(Object obj) {
        C7 c7;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2004u7) {
            C2004u7 c2004u7 = (C2004u7) obj;
            c2004u7.getClass();
            Object obj2 = c2004u7.a;
            C7 c72 = c2004u7.b;
            if (this.a.equals(obj2)) {
                Object obj3 = EnumC1489mJ.h;
                if (obj3.equals(obj3) && ((c7 = this.b) != null ? c7.equals(c72) : c72 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ (((((1000003 * 1000003) ^ this.a.hashCode()) * 1000003) ^ EnumC1489mJ.h.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.a + ", priority=" + EnumC1489mJ.h + ", productData=" + this.b + "}";
    }
}
