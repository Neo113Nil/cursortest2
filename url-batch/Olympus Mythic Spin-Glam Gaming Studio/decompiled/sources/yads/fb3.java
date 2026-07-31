package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes15.dex */
public final class fb3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new gb3(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new gb3[i];
    }
}
