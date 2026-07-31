package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class x4 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new y4(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new y4[i];
    }
}
