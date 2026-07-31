package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class xt1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new yt1(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new yt1[i];
    }
}
