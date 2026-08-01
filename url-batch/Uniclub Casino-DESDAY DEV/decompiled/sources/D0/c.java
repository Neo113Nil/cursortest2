package D0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c extends R.b {
    public static final Parcelable.Creator<c> CREATOR = new b(0);

    /* renamed from: c, reason: collision with root package name */
    public boolean f82c;

    public c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f82c = parcel.readInt() == 1;
    }

    @Override // R.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f82c ? 1 : 0);
    }
}
