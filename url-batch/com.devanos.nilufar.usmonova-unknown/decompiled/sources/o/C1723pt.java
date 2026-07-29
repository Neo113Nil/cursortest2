package o;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.pt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1723pt implements Parcelable {
    public static final Parcelable.Creator<C1723pt> CREATOR = new J1(7);
    public final IntentSender h;
    public final Intent i;
    public final int j;
    public final int k;

    public C1723pt(IntentSender intentSender, Intent intent, int i, int i2) {
        this.h = intentSender;
        this.i = intent;
        this.j = i;
        this.k = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC0048Bt.n(parcel, "dest");
        parcel.writeParcelable(this.h, i);
        parcel.writeParcelable(this.i, i);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k);
    }
}
