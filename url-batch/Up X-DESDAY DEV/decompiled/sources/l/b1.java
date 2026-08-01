package l;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class b1 extends R.b {
    public static final Parcelable.Creator<b1> CREATOR = new B0.b(5);

    /* renamed from: c, reason: collision with root package name */
    public int f2942c;
    public boolean d;

    public b1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2942c = parcel.readInt();
        this.d = parcel.readInt() != 0;
    }

    @Override // R.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f2942c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
