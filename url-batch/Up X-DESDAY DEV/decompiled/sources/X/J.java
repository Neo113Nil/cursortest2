package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class J implements Parcelable {
    public static final Parcelable.Creator<J> CREATOR = new Q.k(4);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f831a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f832b;

    /* renamed from: c, reason: collision with root package name */
    public C0034b[] f833c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public String f834e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f835f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f836g;
    public ArrayList h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f831a);
        parcel.writeStringList(this.f832b);
        parcel.writeTypedArray(this.f833c, i);
        parcel.writeInt(this.d);
        parcel.writeString(this.f834e);
        parcel.writeStringList(this.f835f);
        parcel.writeTypedList(this.f836g);
        parcel.writeTypedList(this.h);
    }
}
