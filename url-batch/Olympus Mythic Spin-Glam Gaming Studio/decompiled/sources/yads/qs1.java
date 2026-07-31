package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class qs1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        Intrinsics.checkNotNull(readString);
        int readInt = parcel.readInt();
        LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
        for (int i = 0; i < readInt; i++) {
            String readString2 = parcel.readString();
            Intrinsics.checkNotNull(readString2);
            linkedHashMap.put(readString2, parcel.readString());
        }
        return new rs1(readString, linkedHashMap);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new rs1[i];
    }
}
