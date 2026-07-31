package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class p13 implements gt1 {
    public static final Parcelable.Creator<p13> CREATOR = new m13();
    public final ArrayList b;

    public p13(ArrayList arrayList) {
        this.b = arrayList;
        if (arrayList.isEmpty()) {
            return;
        }
        long j = ((o13) arrayList.get(0)).c;
        for (int i = 1; i < arrayList.size(); i++) {
            if (((o13) arrayList.get(i)).b < j) {
                throw new IllegalArgumentException();
            }
            j = ((o13) arrayList.get(i)).c;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p13.class != obj.getClass()) {
            return false;
        }
        return this.b.equals(((p13) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.b);
    }
}
