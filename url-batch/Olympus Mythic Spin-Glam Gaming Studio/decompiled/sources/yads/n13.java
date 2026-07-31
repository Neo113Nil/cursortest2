package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class n13 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new o13(parcel.readInt(), parcel.readLong(), parcel.readLong());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new o13[i];
    }
}
