package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.xH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2212xH implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ C2212xH(int i) {
        this.a = i;
    }

    public static C2278yH a(Parcel parcel, ClassLoader classLoader) {
        InterfaceC2289yS interfaceC2289yS;
        if (classLoader == null) {
            classLoader = C2212xH.class.getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            interfaceC2289yS = C0460Rq.P;
        } else if (readInt == 1) {
            interfaceC2289yS = C1623oL.n;
        } else {
            if (readInt != 2) {
                throw new IllegalStateException(AbstractC1888sN.h(readInt, "Unsupported MutableState policy ", " was restored"));
            }
            interfaceC2289yS = C1097gL.i;
        }
        return new C2278yH(readValue, interfaceC2289yS);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return a(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbstractC1138h.i;
                }
                throw new IllegalStateException("superState must be null");
            default:
                return new C0780bW(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new C2278yH[i];
            case 1:
                return new AbstractC1138h[i];
            default:
                return new C0780bW[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return a(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return AbstractC1138h.i;
                }
                throw new IllegalStateException("superState must be null");
            default:
                return new C0780bW(parcel, null);
        }
    }
}
