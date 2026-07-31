package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public final class k63 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new l63(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new l63[i];
    }
}
