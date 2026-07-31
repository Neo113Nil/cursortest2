package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public final class np2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new op2(parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new op2[i];
    }
}
