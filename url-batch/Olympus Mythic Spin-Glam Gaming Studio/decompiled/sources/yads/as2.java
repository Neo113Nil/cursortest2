package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes15.dex */
public final class as2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new bs2(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new bs2[i];
    }
}
