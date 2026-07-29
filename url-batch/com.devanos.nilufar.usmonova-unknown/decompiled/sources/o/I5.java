package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes.dex */
public final class I5 extends View.BaseSavedState {
    public static final Parcelable.Creator<I5> CREATOR = new J1(1);
    public boolean h;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.h ? (byte) 1 : (byte) 0);
    }
}
