package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class q1 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                parcel.getClass();
                return new r1(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 1:
                parcel.getClass();
                return new z70(parcel);
            case 2:
                return new ParcelImpl(parcel);
            case 3:
                return new yd0(parcel.readFloat());
            case 4:
                return new zd0(parcel.readInt());
            default:
                return new ae0(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new r1[i];
            case 1:
                return new z70[i];
            case 2:
                return new ParcelImpl[i];
            case 3:
                return new yd0[i];
            case 4:
                return new zd0[i];
            default:
                return new ae0[i];
        }
    }
}
