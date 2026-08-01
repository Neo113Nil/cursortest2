package g0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g0 implements Parcelable {
    public static final Parcelable.Creator<g0> CREATOR = new C0.b(13);

    /* renamed from: a, reason: collision with root package name */
    public int f2447a;

    /* renamed from: b, reason: collision with root package name */
    public int f2448b;

    /* renamed from: c, reason: collision with root package name */
    public int f2449c;
    public int[] d;

    /* renamed from: e, reason: collision with root package name */
    public int f2450e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2451f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f2452g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2453j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2447a);
        parcel.writeInt(this.f2448b);
        parcel.writeInt(this.f2449c);
        if (this.f2449c > 0) {
            parcel.writeIntArray(this.d);
        }
        parcel.writeInt(this.f2450e);
        if (this.f2450e > 0) {
            parcel.writeIntArray(this.f2451f);
        }
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.f2453j ? 1 : 0);
        parcel.writeList(this.f2452g);
    }
}
