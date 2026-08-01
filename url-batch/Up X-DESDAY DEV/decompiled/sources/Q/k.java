package Q;

import X.C0034b;
import X.C0035c;
import X.F;
import X.J;
import X.N;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import c.C0078a;
import f0.C0104u;
import f0.d0;
import f0.e0;
import java.util.ArrayList;
import l.C0220P;

/* loaded from: classes.dex */
public final class k implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f649a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f649a) {
            case 0:
                l lVar = new l(parcel);
                lVar.f650a = parcel.readInt();
                return lVar;
            case 1:
                return new C0034b(parcel);
            case 2:
                return new C0035c(parcel);
            case 3:
                F f2 = new F();
                f2.f792a = parcel.readString();
                f2.f793b = parcel.readInt();
                return f2;
            case 4:
                J j2 = new J();
                j2.f834e = null;
                j2.f835f = new ArrayList();
                j2.f836g = new ArrayList();
                j2.f831a = parcel.createStringArrayList();
                j2.f832b = parcel.createStringArrayList();
                j2.f833c = (C0034b[]) parcel.createTypedArray(C0034b.CREATOR);
                j2.d = parcel.readInt();
                j2.f834e = parcel.readString();
                j2.f835f = parcel.createStringArrayList();
                j2.f836g = parcel.createTypedArrayList(C0035c.CREATOR);
                j2.h = parcel.createTypedArrayList(F.CREATOR);
                return j2;
            case 5:
                return new N(parcel);
            case 6:
                X0.e.e(parcel, "parcel");
                return new C0078a(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 7:
                return new com.google.android.material.datepicker.b((com.google.android.material.datepicker.o) parcel.readParcelable(com.google.android.material.datepicker.o.class.getClassLoader()), (com.google.android.material.datepicker.o) parcel.readParcelable(com.google.android.material.datepicker.o.class.getClassLoader()), (com.google.android.material.datepicker.d) parcel.readParcelable(com.google.android.material.datepicker.d.class.getClassLoader()), (com.google.android.material.datepicker.o) parcel.readParcelable(com.google.android.material.datepicker.o.class.getClassLoader()), parcel.readInt());
            case 8:
                return new com.google.android.material.datepicker.d(parcel.readLong());
            case 9:
                return com.google.android.material.datepicker.o.a(parcel.readInt(), parcel.readInt());
            case 10:
                C0104u c0104u = new C0104u();
                c0104u.f2165a = parcel.readInt();
                c0104u.f2166b = parcel.readInt();
                c0104u.f2167c = parcel.readInt() == 1;
                return c0104u;
            case 11:
                d0 d0Var = new d0();
                d0Var.f2048a = parcel.readInt();
                d0Var.f2049b = parcel.readInt();
                d0Var.d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    d0Var.f2050c = iArr;
                    parcel.readIntArray(iArr);
                }
                return d0Var;
            case 12:
                e0 e0Var = new e0();
                e0Var.f2056a = parcel.readInt();
                e0Var.f2057b = parcel.readInt();
                int readInt2 = parcel.readInt();
                e0Var.f2058c = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    e0Var.d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                e0Var.f2059e = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    e0Var.f2060f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                e0Var.h = parcel.readInt() == 1;
                e0Var.i = parcel.readInt() == 1;
                e0Var.f2062j = parcel.readInt() == 1;
                e0Var.f2061g = parcel.readArrayList(d0.class.getClassLoader());
                return e0Var;
            case 13:
                C0220P c0220p = new C0220P(parcel);
                c0220p.f2894a = parcel.readByte() != 0;
                return c0220p;
            case 14:
                return new ParcelImpl(parcel);
            default:
                v0.b bVar = new v0.b(parcel);
                bVar.f4017a = ((Integer) parcel.readValue(v0.b.class.getClassLoader())).intValue();
                return bVar;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f649a) {
            case 0:
                return new l[i];
            case 1:
                return new C0034b[i];
            case 2:
                return new C0035c[i];
            case 3:
                return new F[i];
            case 4:
                return new J[i];
            case 5:
                return new N[i];
            case 6:
                return new C0078a[i];
            case 7:
                return new com.google.android.material.datepicker.b[i];
            case 8:
                return new com.google.android.material.datepicker.d[i];
            case 9:
                return new com.google.android.material.datepicker.o[i];
            case 10:
                return new C0104u[i];
            case 11:
                return new d0[i];
            case 12:
                return new e0[i];
            case 13:
                return new C0220P[i];
            case 14:
                return new ParcelImpl[i];
            default:
                return new v0.b[i];
        }
    }
}
