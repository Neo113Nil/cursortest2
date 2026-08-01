package A0;

import Q.k;
import Y.C0040b;
import Y.C0041c;
import Y.F;
import Y.J;
import Y.N;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import c.C0100a;
import com.google.android.material.datepicker.o;
import g0.C0167u;
import g0.f0;
import g0.g0;
import i1.f;
import java.util.ArrayList;
import l.C0235O;

/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f2a) {
            case 0:
                c cVar = new c(parcel);
                cVar.f3a = ((Integer) parcel.readValue(c.class.getClassLoader())).intValue();
                return cVar;
            case 1:
                k kVar = new k(parcel);
                kVar.f1057a = parcel.readInt();
                return kVar;
            case 2:
                return new C0040b(parcel);
            case 3:
                return new C0041c(parcel);
            case 4:
                F f2 = new F();
                f2.f1326a = parcel.readString();
                f2.f1327b = parcel.readInt();
                return f2;
            case 5:
                J j2 = new J();
                j2.f1368e = null;
                j2.f1369f = new ArrayList();
                j2.f1370g = new ArrayList();
                j2.f1365a = parcel.createStringArrayList();
                j2.f1366b = parcel.createStringArrayList();
                j2.f1367c = (C0040b[]) parcel.createTypedArray(C0040b.CREATOR);
                j2.d = parcel.readInt();
                j2.f1368e = parcel.readString();
                j2.f1369f = parcel.createStringArrayList();
                j2.f1370g = parcel.createTypedArrayList(C0041c.CREATOR);
                j2.h = parcel.createTypedArrayList(F.CREATOR);
                return j2;
            case 6:
                return new N(parcel);
            case 7:
                f.e(parcel, "parcel");
                return new C0100a(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 8:
                return new com.google.android.material.datepicker.b((o) parcel.readParcelable(o.class.getClassLoader()), (o) parcel.readParcelable(o.class.getClassLoader()), (com.google.android.material.datepicker.d) parcel.readParcelable(com.google.android.material.datepicker.d.class.getClassLoader()), (o) parcel.readParcelable(o.class.getClassLoader()), parcel.readInt());
            case 9:
                return new com.google.android.material.datepicker.d(parcel.readLong());
            case 10:
                return o.a(parcel.readInt(), parcel.readInt());
            case 11:
                C0167u c0167u = new C0167u();
                c0167u.f2988a = parcel.readInt();
                c0167u.f2989b = parcel.readInt();
                c0167u.f2990c = parcel.readInt() == 1;
                return c0167u;
            case 12:
                f0 f0Var = new f0();
                f0Var.f2880a = parcel.readInt();
                f0Var.f2881b = parcel.readInt();
                f0Var.d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    f0Var.f2882c = iArr;
                    parcel.readIntArray(iArr);
                }
                return f0Var;
            case 13:
                g0 g0Var = new g0();
                g0Var.f2888a = parcel.readInt();
                g0Var.f2889b = parcel.readInt();
                int readInt2 = parcel.readInt();
                g0Var.f2890c = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    g0Var.d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                g0Var.f2891e = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    g0Var.f2892f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                g0Var.h = parcel.readInt() == 1;
                g0Var.i = parcel.readInt() == 1;
                g0Var.f2894j = parcel.readInt() == 1;
                g0Var.f2893g = parcel.readArrayList(f0.class.getClassLoader());
                return g0Var;
            case 14:
                C0235O c0235o = new C0235O(parcel);
                c0235o.f3351a = parcel.readByte() != 0;
                return c0235o;
            default:
                return new ParcelImpl(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f2a) {
            case 0:
                return new c[i];
            case 1:
                return new k[i];
            case 2:
                return new C0040b[i];
            case 3:
                return new C0041c[i];
            case 4:
                return new F[i];
            case 5:
                return new J[i];
            case 6:
                return new N[i];
            case 7:
                return new C0100a[i];
            case 8:
                return new com.google.android.material.datepicker.b[i];
            case 9:
                return new com.google.android.material.datepicker.d[i];
            case 10:
                return new o[i];
            case 11:
                return new C0167u[i];
            case 12:
                return new f0[i];
            case 13:
                return new g0[i];
            case 14:
                return new C0235O[i];
            default:
                return new ParcelImpl[i];
        }
    }
}
