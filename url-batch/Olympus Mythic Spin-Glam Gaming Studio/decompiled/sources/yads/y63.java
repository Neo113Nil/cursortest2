package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes15.dex */
public final class y63 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new z63(parcel.readLong(), parcel.readLong());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new z63[i];
    }
}
