package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes14.dex */
public final class u11 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new v11(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new v11[i];
    }
}
