package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class S7 implements Parcelable {
    public static final Parcelable.Creator<S7> CREATOR = new J1(3);
    public final ArrayList h;
    public final ArrayList i;

    public S7(Parcel parcel) {
        this.h = parcel.createStringArrayList();
        this.i = parcel.createTypedArrayList(R7.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.h);
        parcel.writeTypedList(this.i);
    }
}
