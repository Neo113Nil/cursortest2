package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class b33 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new e33(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new e33[i];
    }
}
