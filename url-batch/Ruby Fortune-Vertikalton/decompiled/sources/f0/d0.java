package f0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d0 implements Parcelable {
    public static final Parcelable.Creator<d0> CREATOR = new Q.k(11);

    /* renamed from: a, reason: collision with root package name */
    public int f2045a;

    /* renamed from: b, reason: collision with root package name */
    public int f2046b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f2047c;
    public boolean d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f2045a + ", mGapDir=" + this.f2046b + ", mHasUnwantedGapAfter=" + this.d + ", mGapPerSpan=" + Arrays.toString(this.f2047c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2045a);
        parcel.writeInt(this.f2046b);
        parcel.writeInt(this.d ? 1 : 0);
        int[] iArr = this.f2047c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f2047c);
        }
    }
}
