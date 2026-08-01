package C0;

import Q.l;
import Y.C0034b;
import Y.C0035c;
import Y.F;
import Y.J;
import Y.N;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import c.C0084a;
import com.google.android.material.datepicker.o;
import g0.C0132v;
import g0.f0;
import g0.g0;
import g1.f;
import java.util.ArrayList;
import l.C0192N;

/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f114a) {
            case 0:
                c cVar = new c(parcel);
                cVar.f115a = ((Integer) parcel.readValue(c.class.getClassLoader())).intValue();
                return cVar;
            case 1:
                l lVar = new l(parcel);
                lVar.f636a = parcel.readInt();
                return lVar;
            case 2:
                return new C0034b(parcel);
            case 3:
                return new C0035c(parcel);
            case 4:
                F f2 = new F();
                f2.f945a = parcel.readString();
                f2.f946b = parcel.readInt();
                return f2;
            case 5:
                J j2 = new J();
                j2.f987e = null;
                j2.f988f = new ArrayList();
                j2.f989g = new ArrayList();
                j2.f984a = parcel.createStringArrayList();
                j2.f985b = parcel.createStringArrayList();
                j2.f986c = (C0034b[]) parcel.createTypedArray(C0034b.CREATOR);
                j2.d = parcel.readInt();
                j2.f987e = parcel.readString();
                j2.f988f = parcel.createStringArrayList();
                j2.f989g = parcel.createTypedArrayList(C0035c.CREATOR);
                j2.h = parcel.createTypedArrayList(F.CREATOR);
                return j2;
            case 6:
                return new N(parcel);
            case 7:
                f.e(parcel, "parcel");
                return new C0084a(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 8:
                return new com.google.android.material.datepicker.b((o) parcel.readParcelable(o.class.getClassLoader()), (o) parcel.readParcelable(o.class.getClassLoader()), (com.google.android.material.datepicker.d) parcel.readParcelable(com.google.android.material.datepicker.d.class.getClassLoader()), (o) parcel.readParcelable(o.class.getClassLoader()), parcel.readInt());
            case 9:
                return new com.google.android.material.datepicker.d(parcel.readLong());
            case 10:
                return o.a(parcel.readInt(), parcel.readInt());
            case 11:
                C0132v c0132v = new C0132v();
                c0132v.f2552a = parcel.readInt();
                c0132v.f2553b = parcel.readInt();
                c0132v.f2554c = parcel.readInt() == 1;
                return c0132v;
            case 12:
                f0 f0Var = new f0();
                f0Var.f2440a = parcel.readInt();
                f0Var.f2441b = parcel.readInt();
                f0Var.d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    f0Var.f2442c = iArr;
                    parcel.readIntArray(iArr);
                }
                return f0Var;
            case 13:
                g0 g0Var = new g0();
                g0Var.f2447a = parcel.readInt();
                g0Var.f2448b = parcel.readInt();
                int readInt2 = parcel.readInt();
                g0Var.f2449c = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    g0Var.d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                g0Var.f2450e = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    g0Var.f2451f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                g0Var.h = parcel.readInt() == 1;
                g0Var.i = parcel.readInt() == 1;
                g0Var.f2453j = parcel.readInt() == 1;
                g0Var.f2452g = parcel.readArrayList(f0.class.getClassLoader());
                return g0Var;
            case 14:
                C0192N c0192n = new C0192N(parcel);
                c0192n.f2920a = parcel.readByte() != 0;
                return c0192n;
            default:
                return new ParcelImpl(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f114a) {
            case 0:
                return new c[i];
            case 1:
                return new l[i];
            case 2:
                return new C0034b[i];
            case 3:
                return new C0035c[i];
            case 4:
                return new F[i];
            case 5:
                return new J[i];
            case 6:
                return new N[i];
            case 7:
                return new C0084a[i];
            case 8:
                return new com.google.android.material.datepicker.b[i];
            case 9:
                return new com.google.android.material.datepicker.d[i];
            case 10:
                return new o[i];
            case 11:
                return new C0132v[i];
            case 12:
                return new f0[i];
            case 13:
                return new g0[i];
            case 14:
                return new C0192N[i];
            default:
                return new ParcelImpl[i];
        }
    }
}
