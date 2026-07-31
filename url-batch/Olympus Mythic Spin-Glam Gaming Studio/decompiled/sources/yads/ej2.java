package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class ej2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new fj2(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new fj2[i];
    }
}
