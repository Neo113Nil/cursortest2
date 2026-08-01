package S;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final Parcelable f771a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f770b = new a();
    public static final Parcelable.Creator<b> CREATOR = new A0.b(4);

    public b() {
        this.f771a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f771a, i);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f771a = parcelable == f770b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f771a = readParcelable == null ? f770b : readParcelable;
    }
}
