package D0;

import M0.F;
import android.os.Parcel;
import android.os.Parcelable;
import f0.Q;
import l.b1;
import u0.C0316a;
import x.C0338f;

/* loaded from: classes.dex */
public final class b implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f81a;

    public /* synthetic */ b(int i) {
        this.f81a = i;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f81a) {
            case 0:
                return new c(parcel, classLoader);
            case 1:
                return new K0.d(parcel, classLoader);
            case 2:
                return new F(parcel, classLoader);
            case 3:
                if (parcel.readParcelable(classLoader) == null) {
                    return R.b.f671b;
                }
                throw new IllegalStateException("superState must be null");
            case 4:
                return new Q(parcel, classLoader);
            case 5:
                return new b1(parcel, classLoader);
            case 6:
                return new C0316a(parcel, classLoader);
            case 7:
                return new v0.b(parcel, classLoader);
            default:
                return new C0338f(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f81a) {
            case 0:
                return new c[i];
            case 1:
                return new K0.d[i];
            case 2:
                return new F[i];
            case 3:
                return new R.b[i];
            case 4:
                return new Q[i];
            case 5:
                return new b1[i];
            case 6:
                return new C0316a[i];
            case 7:
                return new v0.b[i];
            default:
                return new C0338f[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f81a) {
            case 0:
                return new c(parcel, null);
            case 1:
                return new K0.d(parcel, (ClassLoader) null);
            case 2:
                return new F(parcel, null);
            case 3:
                if (parcel.readParcelable(null) == null) {
                    return R.b.f671b;
                }
                throw new IllegalStateException("superState must be null");
            case 4:
                return new Q(parcel, null);
            case 5:
                return new b1(parcel, null);
            case 6:
                return new C0316a(parcel, (ClassLoader) null);
            case 7:
                return new v0.b(parcel, null);
            default:
                return new C0338f(parcel, null);
        }
    }
}
