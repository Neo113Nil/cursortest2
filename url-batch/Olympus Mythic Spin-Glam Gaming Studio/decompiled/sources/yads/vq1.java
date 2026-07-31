package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes11.dex */
public final class vq1 implements Parcelable {

    @NotNull
    public static final uq1 CREATOR = new uq1();
    public final ArrayList b;
    public final Map c;

    public vq1(ArrayList arrayList, Map map) {
        this.b = arrayList;
        this.c = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.b);
        parcel.writeInt(this.c.size());
        for (Map.Entry entry : this.c.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }

    public vq1(Parcel parcel) {
        ArrayList createTypedArrayList = parcel.createTypedArrayList(er1.CREATOR);
        Intrinsics.checkNotNull(createTypedArrayList);
        CREATOR.getClass();
        int readInt = parcel.readInt();
        LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
        for (int i = 0; i < readInt; i++) {
            String readString = parcel.readString();
            Intrinsics.checkNotNull(readString);
            String readString2 = parcel.readString();
            Intrinsics.checkNotNull(readString2);
            linkedHashMap.put(readString, readString2);
        }
        this.b = createTypedArrayList;
        this.c = linkedHashMap;
    }
}
