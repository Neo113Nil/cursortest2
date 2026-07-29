package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: o.Ll, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0300Ll extends X {
    public static final Parcelable.Creator<C0300Ll> CREATOR = new J1(19);
    public final String h;
    public final int i;
    public final long j;

    public C0300Ll() {
        this.h = "CLIENT_TELEMETRY";
        this.j = 1L;
        this.i = -1;
    }

    public final long a() {
        long j = this.j;
        return j == -1 ? this.i : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0300Ll) {
            C0300Ll c0300Ll = (C0300Ll) obj;
            String str = this.h;
            if (((str != null && str.equals(c0300Ll.h)) || (str == null && c0300Ll.h == null)) && a() == c0300Ll.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.h, Long.valueOf(a())});
    }

    public final String toString() {
        C0208Hx c0208Hx = new C0208Hx(12, this);
        c0208Hx.H0(this.h, "name");
        c0208Hx.H0(Long.valueOf(a()), "version");
        return c0208Hx.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = ZM.r(parcel, 20293);
        ZM.p(parcel, 1, this.h);
        ZM.t(parcel, 2, 4);
        parcel.writeInt(this.i);
        long a = a();
        ZM.t(parcel, 3, 8);
        parcel.writeLong(a);
        ZM.s(parcel, r);
    }

    public C0300Ll(long j, String str, int i) {
        this.h = str;
        this.i = i;
        this.j = j;
    }
}
