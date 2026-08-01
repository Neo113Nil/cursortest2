package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class e implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return f.g;
                }
                l8.u("superState must be null");
                return null;
            case 1:
                return new e8(parcel, classLoader);
            case 2:
                return new t9(parcel, classLoader);
            case 3:
                return new md(parcel, classLoader);
            case 4:
                return new ki(parcel, classLoader);
            case 5:
                return new or(parcel, classLoader);
            case 6:
                return new lu(parcel, classLoader);
            case 7:
                return new cw(parcel, classLoader);
            case 8:
                return new wy(parcel, classLoader);
            case 9:
                return new d20(parcel, classLoader);
            case 10:
                return new w40(parcel, classLoader);
            default:
                return new p50(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new f[i];
            case 1:
                return new e8[i];
            case 2:
                return new t9[i];
            case 3:
                return new md[i];
            case 4:
                return new ki[i];
            case 5:
                return new or[i];
            case 6:
                return new lu[i];
            case 7:
                return new cw[i];
            case 8:
                return new wy[i];
            case 9:
                return new d20[i];
            case 10:
                return new w40[i];
            default:
                return new p50[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return f.g;
                }
                l8.u("superState must be null");
                return null;
            case 1:
                return new e8(parcel, null);
            case 2:
                return new t9(parcel, null);
            case 3:
                return new md(parcel, null);
            case 4:
                return new ki(parcel, null);
            case 5:
                return new or(parcel, null);
            case 6:
                return new lu(parcel, null);
            case 7:
                return new cw(parcel, null);
            case 8:
                return new wy(parcel, null);
            case 9:
                return new d20(parcel, null);
            case 10:
                return new w40(parcel, null);
            default:
                return new p50(parcel, null);
        }
    }
}
