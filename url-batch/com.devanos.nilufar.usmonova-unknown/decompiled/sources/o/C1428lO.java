package o;

import java.io.Serializable;

/* renamed from: o.lO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1428lO implements Serializable {
    public final Object h;

    public /* synthetic */ C1428lO(Object obj) {
        this.h = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof C1362kO) {
            return ((C1362kO) obj).h;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1428lO) {
            return AbstractC0048Bt.h(this.h, ((C1428lO) obj).h);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.h;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.h;
        if (obj instanceof C1362kO) {
            return ((C1362kO) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
