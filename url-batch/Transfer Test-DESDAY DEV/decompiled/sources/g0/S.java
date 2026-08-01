package g0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class S extends S.b {
    public static final Parcelable.Creator<S> CREATOR = new A0.b(5);

    /* renamed from: c, reason: collision with root package name */
    public Parcelable f2367c;

    public S(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2367c = parcel.readParcelable(classLoader == null ? I.class.getClassLoader() : classLoader);
    }

    @Override // S.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f2367c, 0);
    }
}
