package g0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: g0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0132v implements Parcelable {
    public static final Parcelable.Creator<C0132v> CREATOR = new C0.b(11);

    /* renamed from: a, reason: collision with root package name */
    public int f2552a;

    /* renamed from: b, reason: collision with root package name */
    public int f2553b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2554c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2552a);
        parcel.writeInt(this.f2553b);
        parcel.writeInt(this.f2554c ? 1 : 0);
    }
}
