package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ar1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        LinkedHashMap linkedHashMap;
        String readString = parcel.readString();
        Intrinsics.checkNotNull(readString);
        er1.CREATOR.getClass();
        int readInt = parcel.readInt();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
        for (int i = 0; i < readInt; i++) {
            String readString2 = parcel.readString();
            Intrinsics.checkNotNull(readString2);
            linkedHashMap2.put(readString2, parcel.readString());
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
        ArrayList<String> createStringArrayList3 = parcel.createStringArrayList();
        y4 y4Var = (y4) parcel.readParcelable(y4.class.getClassLoader());
        er1.CREATOR.getClass();
        int readInt2 = parcel.readInt();
        if (readInt2 == -1) {
            linkedHashMap = null;
        } else {
            linkedHashMap = new LinkedHashMap(readInt2);
            for (int i2 = 0; i2 < readInt2; i2++) {
                String readString3 = parcel.readString();
                Intrinsics.checkNotNull(readString3);
                String readString4 = parcel.readString();
                Intrinsics.checkNotNull(readString4);
                linkedHashMap.put(readString3, readString4);
            }
        }
        return new er1(readString, linkedHashMap2, createStringArrayList, createStringArrayList2, createStringArrayList3, y4Var, linkedHashMap, (ds2) parcel.readParcelable(ds2.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new er1[i];
    }
}
