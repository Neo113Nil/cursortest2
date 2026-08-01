package g0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g0 implements Parcelable {
    public static final Parcelable.Creator<g0> CREATOR = new A0.b(13);

    /* renamed from: a, reason: collision with root package name */
    public int f2888a;

    /* renamed from: b, reason: collision with root package name */
    public int f2889b;

    /* renamed from: c, reason: collision with root package name */
    public int f2890c;
    public int[] d;

    /* renamed from: e, reason: collision with root package name */
    public int f2891e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2892f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f2893g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2894j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2888a);
        parcel.writeInt(this.f2889b);
        parcel.writeInt(this.f2890c);
        if (this.f2890c > 0) {
            parcel.writeIntArray(this.d);
        }
        parcel.writeInt(this.f2891e);
        if (this.f2891e > 0) {
            parcel.writeIntArray(this.f2892f);
        }
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.f2894j ? 1 : 0);
        parcel.writeList(this.f2893g);
    }
}
