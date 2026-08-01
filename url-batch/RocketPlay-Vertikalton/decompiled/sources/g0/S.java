package g0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class S extends S.b {
    public static final Parcelable.Creator<S> CREATOR = new G0.b(4);

    /* renamed from: c, reason: collision with root package name */
    public Parcelable f2805c;

    public S(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2805c = parcel.readParcelable(classLoader == null ? AbstractC0139I.class.getClassLoader() : classLoader);
    }

    @Override // S.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f2805c, 0);
    }
}
