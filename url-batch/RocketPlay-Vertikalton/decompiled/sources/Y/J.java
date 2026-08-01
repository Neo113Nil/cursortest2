package Y;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class J implements Parcelable {
    public static final Parcelable.Creator<J> CREATOR = new A0.b(5);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f1365a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f1366b;

    /* renamed from: c, reason: collision with root package name */
    public C0040b[] f1367c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public String f1368e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f1369f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f1370g;
    public ArrayList h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f1365a);
        parcel.writeStringList(this.f1366b);
        parcel.writeTypedArray(this.f1367c, i);
        parcel.writeInt(this.d);
        parcel.writeString(this.f1368e);
        parcel.writeStringList(this.f1369f);
        parcel.writeTypedList(this.f1370g);
        parcel.writeTypedList(this.h);
    }
}
