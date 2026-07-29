package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1138h implements Parcelable {
    public final Parcelable h;
    public static final C1072g i = new C1072g();
    public static final Parcelable.Creator<AbstractC1138h> CREATOR = new C2212xH(1);

    public AbstractC1138h() {
        this.h = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.h, i2);
    }

    public AbstractC1138h(Parcelable parcelable) {
        if (parcelable != null) {
            this.h = parcelable == i ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbstractC1138h(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.h = readParcelable == null ? i : readParcelable;
    }
}
