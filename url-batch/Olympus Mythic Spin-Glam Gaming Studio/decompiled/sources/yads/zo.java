package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class zo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new ap(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ap[i];
    }
}
