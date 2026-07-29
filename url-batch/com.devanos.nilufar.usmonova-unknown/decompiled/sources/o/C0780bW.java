package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.bW, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0780bW extends AbstractC1138h {
    public static final Parcelable.Creator<C0780bW> CREATOR = new C2212xH(2);
    public int j;
    public boolean k;

    public C0780bW(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.j = parcel.readInt();
        this.k = parcel.readInt() != 0;
    }

    @Override // o.AbstractC1138h, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k ? 1 : 0);
    }
}
