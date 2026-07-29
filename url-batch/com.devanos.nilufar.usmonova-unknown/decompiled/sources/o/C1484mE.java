package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: o.mE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1484mE extends View.BaseSavedState {
    public static final Parcelable.Creator<C1484mE> CREATOR = new J1(8);
    public int h;

    public final String toString() {
        return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.h + "}";
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.h);
    }
}
