package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class e33 extends u23 {
    public static final Parcelable.Creator<e33> CREATOR = new b33();
    public final List b;

    public e33(ArrayList arrayList) {
        this.b = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int size = this.b.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            d33 d33Var = (d33) this.b.get(i2);
            parcel.writeLong(d33Var.a);
            parcel.writeByte(d33Var.b ? (byte) 1 : (byte) 0);
            parcel.writeByte(d33Var.c ? (byte) 1 : (byte) 0);
            parcel.writeByte(d33Var.d ? (byte) 1 : (byte) 0);
            int size2 = d33Var.f.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                c33 c33Var = (c33) d33Var.f.get(i3);
                parcel.writeInt(c33Var.a);
                parcel.writeLong(c33Var.b);
            }
            parcel.writeLong(d33Var.e);
            parcel.writeByte(d33Var.g ? (byte) 1 : (byte) 0);
            parcel.writeLong(d33Var.h);
            parcel.writeInt(d33Var.i);
            parcel.writeInt(d33Var.j);
            parcel.writeInt(d33Var.k);
        }
    }

    public e33(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new d33(parcel));
        }
        this.b = Collections.unmodifiableList(arrayList);
    }
}
