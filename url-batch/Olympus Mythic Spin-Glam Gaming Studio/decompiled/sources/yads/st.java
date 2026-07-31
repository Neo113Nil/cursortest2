package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class st implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new tt(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new tt[i];
    }
}
