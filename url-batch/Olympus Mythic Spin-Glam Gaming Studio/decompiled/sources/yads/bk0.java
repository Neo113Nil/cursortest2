package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes14.dex */
public final class bk0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new ck0(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ck0[i];
    }
}
