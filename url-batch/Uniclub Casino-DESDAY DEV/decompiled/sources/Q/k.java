package Q;

import X.C0033b;
import X.C0034c;
import X.F;
import X.J;
import X.N;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import c.C0077a;
import f0.C0116u;
import f0.d0;
import f0.e0;
import java.util.ArrayList;
import l.C0209P;
import x0.C0341b;

/* loaded from: classes.dex */
public final class k implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f647a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f647a) {
            case 0:
                l lVar = new l(parcel);
                lVar.f648a = parcel.readInt();
                return lVar;
            case 1:
                return new C0033b(parcel);
            case 2:
                return new C0034c(parcel);
            case 3:
                F f2 = new F();
                f2.f796a = parcel.readString();
                f2.f797b = parcel.readInt();
                return f2;
            case 4:
                J j2 = new J();
                j2.f838e = null;
                j2.f839f = new ArrayList();
                j2.f840g = new ArrayList();
                j2.f835a = parcel.createStringArrayList();
                j2.f836b = parcel.createStringArrayList();
                j2.f837c = (C0033b[]) parcel.createTypedArray(C0033b.CREATOR);
                j2.d = parcel.readInt();
                j2.f838e = parcel.readString();
                j2.f839f = parcel.createStringArrayList();
                j2.f840g = parcel.createTypedArrayList(C0034c.CREATOR);
                j2.h = parcel.createTypedArrayList(F.CREATOR);
                return j2;
            case 5:
                return new N(parcel);
            case 6:
                X0.d.e(parcel, "parcel");
                return new C0077a(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 7:
                return new com.google.android.material.datepicker.b((com.google.android.material.datepicker.o) parcel.readParcelable(com.google.android.material.datepicker.o.class.getClassLoader()), (com.google.android.material.datepicker.o) parcel.readParcelable(com.google.android.material.datepicker.o.class.getClassLoader()), (com.google.android.material.datepicker.d) parcel.readParcelable(com.google.android.material.datepicker.d.class.getClassLoader()), (com.google.android.material.datepicker.o) parcel.readParcelable(com.google.android.material.datepicker.o.class.getClassLoader()), parcel.readInt());
            case 8:
                return new com.google.android.material.datepicker.d(parcel.readLong());
            case 9:
                return com.google.android.material.datepicker.o.a(parcel.readInt(), parcel.readInt());
            case 10:
                C0116u c0116u = new C0116u();
                c0116u.f2170a = parcel.readInt();
                c0116u.f2171b = parcel.readInt();
                c0116u.f2172c = parcel.readInt() == 1;
                return c0116u;
            case 11:
                d0 d0Var = new d0();
                d0Var.f2053a = parcel.readInt();
                d0Var.f2054b = parcel.readInt();
                d0Var.d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    d0Var.f2055c = iArr;
                    parcel.readIntArray(iArr);
                }
                return d0Var;
            case 12:
                e0 e0Var = new e0();
                e0Var.f2061a = parcel.readInt();
                e0Var.f2062b = parcel.readInt();
                int readInt2 = parcel.readInt();
                e0Var.f2063c = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    e0Var.d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                e0Var.f2064e = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    e0Var.f2065f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                e0Var.h = parcel.readInt() == 1;
                e0Var.i = parcel.readInt() == 1;
                e0Var.f2067j = parcel.readInt() == 1;
                e0Var.f2066g = parcel.readArrayList(d0.class.getClassLoader());
                return e0Var;
            case 13:
                C0209P c0209p = new C0209P(parcel);
                c0209p.f2919a = parcel.readByte() != 0;
                return c0209p;
            case 14:
                return new ParcelImpl(parcel);
            default:
                C0341b c0341b = new C0341b(parcel);
                c0341b.f4118a = ((Integer) parcel.readValue(C0341b.class.getClassLoader())).intValue();
                return c0341b;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f647a) {
            case 0:
                return new l[i];
            case 1:
                return new C0033b[i];
            case 2:
                return new C0034c[i];
            case 3:
                return new F[i];
            case 4:
                return new J[i];
            case 5:
                return new N[i];
            case 6:
                return new C0077a[i];
            case 7:
                return new com.google.android.material.datepicker.b[i];
            case 8:
                return new com.google.android.material.datepicker.d[i];
            case 9:
                return new com.google.android.material.datepicker.o[i];
            case 10:
                return new C0116u[i];
            case 11:
                return new d0[i];
            case 12:
                return new e0[i];
            case 13:
                return new C0209P[i];
            case 14:
                return new ParcelImpl[i];
            default:
                return new C0341b[i];
        }
    }
}
