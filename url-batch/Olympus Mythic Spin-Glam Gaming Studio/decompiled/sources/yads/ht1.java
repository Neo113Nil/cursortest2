package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public final class ht1 implements Parcelable {
    public static final Parcelable.Creator<ht1> CREATOR = new ft1();
    public final gt1[] b;

    public ht1(gt1... gt1VarArr) {
        this.b = gt1VarArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ht1.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.b, ((ht1) obj).b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "entries=" + Arrays.toString(this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b.length);
        for (gt1 gt1Var : this.b) {
            parcel.writeParcelable(gt1Var, 0);
        }
    }

    public ht1(List list) {
        this.b = (gt1[]) list.toArray(new gt1[0]);
    }

    public ht1(Parcel parcel) {
        this.b = new gt1[parcel.readInt()];
        int i = 0;
        while (true) {
            gt1[] gt1VarArr = this.b;
            if (i >= gt1VarArr.length) {
                return;
            }
            gt1VarArr[i] = (gt1) parcel.readParcelable(gt1.class.getClassLoader());
            i++;
        }
    }
}
