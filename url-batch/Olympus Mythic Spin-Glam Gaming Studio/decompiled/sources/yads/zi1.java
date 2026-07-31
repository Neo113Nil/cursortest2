package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class zi1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new aj1(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new aj1[i];
    }
}
