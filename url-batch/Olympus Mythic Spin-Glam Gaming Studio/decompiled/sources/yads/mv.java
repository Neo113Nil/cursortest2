package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class mv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new nv(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new nv[i];
    }
}
