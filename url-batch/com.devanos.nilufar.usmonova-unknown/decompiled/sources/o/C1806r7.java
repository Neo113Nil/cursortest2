package o;

import java.util.ArrayList;

/* renamed from: o.r7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1806r7 extends AbstractC0952e8 {
    public final ArrayList a;

    public C1806r7(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0952e8)) {
            return false;
        }
        return this.a.equals(((C1806r7) ((AbstractC0952e8) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.a + "}";
    }
}
