package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes13.dex */
public final class vm3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new xm3(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new xm3[i];
    }
}
