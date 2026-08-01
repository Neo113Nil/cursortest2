package G0;

import P0.D;
import android.os.Parcel;
import android.os.Parcelable;
import g0.S;
import l.c1;
import x0.C0380a;

/* loaded from: classes.dex */
public final class b implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f435a;

    public /* synthetic */ b(int i) {
        this.f435a = i;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f435a) {
            case 0:
                return new c(parcel, classLoader);
            case 1:
                return new N0.d(parcel, classLoader);
            case 2:
                return new D(parcel, classLoader);
            case 3:
                if (parcel.readParcelable(classLoader) == null) {
                    return S.b.f1066b;
                }
                throw new IllegalStateException("superState must be null");
            case 4:
                return new S(parcel, classLoader);
            case 5:
                return new c1(parcel, classLoader);
            case 6:
                return new x.f(parcel, classLoader);
            case 7:
                return new C0380a(parcel, classLoader);
            default:
                return new y0.b(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f435a) {
            case 0:
                return new c[i];
            case 1:
                return new N0.d[i];
            case 2:
                return new D[i];
            case 3:
                return new S.b[i];
            case 4:
                return new S[i];
            case 5:
                return new c1[i];
            case 6:
                return new x.f[i];
            case 7:
                return new C0380a[i];
            default:
                return new y0.b[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f435a) {
            case 0:
                return new c(parcel, null);
            case 1:
                return new N0.d(parcel, (ClassLoader) null);
            case 2:
                return new D(parcel, null);
            case 3:
                if (parcel.readParcelable(null) == null) {
                    return S.b.f1066b;
                }
                throw new IllegalStateException("superState must be null");
            case 4:
                return new S(parcel, null);
            case 5:
                return new c1(parcel, null);
            case 6:
                return new x.f(parcel, null);
            case 7:
                return new C0380a(parcel, (ClassLoader) null);
            default:
                return new y0.b(parcel, null);
        }
    }
}
