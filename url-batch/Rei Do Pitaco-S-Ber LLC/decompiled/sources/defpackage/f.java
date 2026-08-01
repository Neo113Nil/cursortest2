package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class f implements Parcelable {
    public final Parcelable f;
    public static final d g = new d();
    public static final Parcelable.Creator<f> CREATOR = new e(0);

    public f(Parcelable parcelable) {
        if (parcelable != null) {
            this.f = parcelable == g ? null : parcelable;
        } else {
            l8.l("superState must not be null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f, i);
    }

    public f() {
        this.f = null;
    }

    public f(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f = readParcelable == null ? g : readParcelable;
    }
}
