package f0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e0 implements Parcelable {
    public static final Parcelable.Creator<e0> CREATOR = new Q.k(12);

    /* renamed from: a, reason: collision with root package name */
    public int f2061a;

    /* renamed from: b, reason: collision with root package name */
    public int f2062b;

    /* renamed from: c, reason: collision with root package name */
    public int f2063c;
    public int[] d;

    /* renamed from: e, reason: collision with root package name */
    public int f2064e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2065f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f2066g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2067j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2061a);
        parcel.writeInt(this.f2062b);
        parcel.writeInt(this.f2063c);
        if (this.f2063c > 0) {
            parcel.writeIntArray(this.d);
        }
        parcel.writeInt(this.f2064e);
        if (this.f2064e > 0) {
            parcel.writeIntArray(this.f2065f);
        }
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.f2067j ? 1 : 0);
        parcel.writeList(this.f2066g);
    }
}
