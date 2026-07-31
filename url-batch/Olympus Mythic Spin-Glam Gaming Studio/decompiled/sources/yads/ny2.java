package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes15.dex */
public final class ny2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new oy2(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new oy2[i];
    }
}
