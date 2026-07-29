package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class VU extends X {
    public static final Parcelable.Creator<VU> CREATOR = new J1(11);
    public final int h;
    public List i;

    public VU(int i, List list) {
        this.h = i;
        this.i = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = ZM.r(parcel, 20293);
        ZM.t(parcel, 1, 4);
        parcel.writeInt(this.h);
        List list = this.i;
        if (list != null) {
            int r2 = ZM.r(parcel, 2);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    int dataPosition = parcel.dataPosition();
                    parcel.writeInt(1);
                    int dataPosition2 = parcel.dataPosition();
                    parcelable.writeToParcel(parcel, 0);
                    int dataPosition3 = parcel.dataPosition();
                    parcel.setDataPosition(dataPosition);
                    parcel.writeInt(dataPosition3 - dataPosition2);
                    parcel.setDataPosition(dataPosition3);
                }
            }
            ZM.s(parcel, r2);
        }
        ZM.s(parcel, r);
    }
}
