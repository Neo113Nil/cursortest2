package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class p50 extends f {
    public static final Parcelable.Creator<p50> CREATOR = new e(11);
    public int h;
    public boolean i;

    public p50(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.h = parcel.readInt();
        this.i = parcel.readInt() != 0;
    }

    @Override // defpackage.f, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i ? 1 : 0);
    }
}
