package Y;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class J implements Parcelable {
    public static final Parcelable.Creator<J> CREATOR = new C0.b(5);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f984a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f985b;

    /* renamed from: c, reason: collision with root package name */
    public C0034b[] f986c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public String f987e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f988f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f989g;
    public ArrayList h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f984a);
        parcel.writeStringList(this.f985b);
        parcel.writeTypedArray(this.f986c, i);
        parcel.writeInt(this.d);
        parcel.writeString(this.f987e);
        parcel.writeStringList(this.f988f);
        parcel.writeTypedList(this.f989g);
        parcel.writeTypedList(this.h);
    }
}
