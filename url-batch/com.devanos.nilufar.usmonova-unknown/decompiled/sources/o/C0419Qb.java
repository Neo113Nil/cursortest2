package o;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.Qb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0419Qb extends X {
    public static final Parcelable.Creator<C0419Qb> CREATOR = new J1(14);
    public final Intent h;

    public C0419Qb(Intent intent) {
        this.h = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = ZM.r(parcel, 20293);
        ZM.o(parcel, 1, this.h, i);
        ZM.s(parcel, r);
    }
}
