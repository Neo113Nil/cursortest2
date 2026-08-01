package l;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a1 extends S.b {
    public static final Parcelable.Creator<a1> CREATOR = new A0.b(6);

    /* renamed from: c, reason: collision with root package name */
    public int f2970c;
    public boolean d;

    public a1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2970c = parcel.readInt();
        this.d = parcel.readInt() != 0;
    }

    @Override // S.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f2970c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
