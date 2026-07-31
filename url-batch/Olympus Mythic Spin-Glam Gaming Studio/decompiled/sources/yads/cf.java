package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class cf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        return new df(parcel.readInt(), readString);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new df[i];
    }
}
