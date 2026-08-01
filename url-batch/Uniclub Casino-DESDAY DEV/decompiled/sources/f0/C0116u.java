package f0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: f0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0116u implements Parcelable {
    public static final Parcelable.Creator<C0116u> CREATOR = new Q.k(10);

    /* renamed from: a, reason: collision with root package name */
    public int f2170a;

    /* renamed from: b, reason: collision with root package name */
    public int f2171b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2172c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2170a);
        parcel.writeInt(this.f2171b);
        parcel.writeInt(this.f2172c ? 1 : 0);
    }
}
