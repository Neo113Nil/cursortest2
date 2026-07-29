package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import o.AbstractC1473m3;
import o.J1;
import o.X;
import o.ZM;

/* loaded from: classes.dex */
public final class Scope extends X implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new J1(13);
    public final int h;
    public final String i;

    public Scope(int i, String str) {
        AbstractC1473m3.l(str, "scopeUri must not be null or empty");
        this.h = i;
        this.i = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.i.equals(((Scope) obj).i);
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final String toString() {
        return this.i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = ZM.r(parcel, 20293);
        ZM.t(parcel, 1, 4);
        parcel.writeInt(this.h);
        ZM.p(parcel, 2, this.i);
        ZM.s(parcel, r);
    }
}
