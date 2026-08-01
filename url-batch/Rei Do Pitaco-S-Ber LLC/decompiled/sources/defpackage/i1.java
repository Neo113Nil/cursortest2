package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class i1 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                j1 j1Var = new j1();
                j1Var.f = parcel.readInt();
                return j1Var;
            case 1:
                parcel.getClass();
                return new t1(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
            case 2:
                c5 c5Var = new c5(parcel);
                c5Var.f = parcel.readByte() != 0;
                return c5Var;
            case 3:
                return new x6(parcel);
            case 4:
                return new y6(parcel);
            case 5:
                a7 a7Var = new a7();
                a7Var.n = 255;
                a7Var.p = -2;
                a7Var.q = -2;
                a7Var.r = -2;
                a7Var.y = Boolean.TRUE;
                a7Var.f = parcel.readInt();
                a7Var.g = (Integer) parcel.readSerializable();
                a7Var.h = (Integer) parcel.readSerializable();
                a7Var.i = (Integer) parcel.readSerializable();
                a7Var.j = (Integer) parcel.readSerializable();
                a7Var.k = (Integer) parcel.readSerializable();
                a7Var.l = (Integer) parcel.readSerializable();
                a7Var.m = (Integer) parcel.readSerializable();
                a7Var.n = parcel.readInt();
                a7Var.o = parcel.readString();
                a7Var.p = parcel.readInt();
                a7Var.q = parcel.readInt();
                a7Var.r = parcel.readInt();
                a7Var.t = parcel.readString();
                a7Var.u = parcel.readString();
                a7Var.v = parcel.readInt();
                a7Var.x = (Integer) parcel.readSerializable();
                a7Var.z = (Integer) parcel.readSerializable();
                a7Var.A = (Integer) parcel.readSerializable();
                a7Var.B = (Integer) parcel.readSerializable();
                a7Var.C = (Integer) parcel.readSerializable();
                a7Var.D = (Integer) parcel.readSerializable();
                a7Var.E = (Integer) parcel.readSerializable();
                a7Var.H = (Integer) parcel.readSerializable();
                a7Var.F = (Integer) parcel.readSerializable();
                a7Var.G = (Integer) parcel.readSerializable();
                a7Var.y = (Boolean) parcel.readSerializable();
                a7Var.s = (Locale) parcel.readSerializable();
                a7Var.I = (Boolean) parcel.readSerializable();
                a7Var.J = (Integer) parcel.readSerializable();
                return a7Var;
            case 6:
                return new v8((qt) parcel.readParcelable(qt.class.getClassLoader()), (qt) parcel.readParcelable(qt.class.getClassLoader()), (vd) parcel.readParcelable(vd.class.getClassLoader()), (qt) parcel.readParcelable(qt.class.getClassLoader()), parcel.readInt());
            case 7:
                return new vd(parcel.readLong());
            case 8:
                pk pkVar = new pk();
                pkVar.f = parcel.readString();
                pkVar.g = parcel.readInt();
                return pkVar;
            case 9:
                tk tkVar = new tk();
                tkVar.j = null;
                tkVar.k = new ArrayList();
                tkVar.l = new ArrayList();
                tkVar.f = parcel.createStringArrayList();
                tkVar.g = parcel.createStringArrayList();
                tkVar.h = (x6[]) parcel.createTypedArray(x6.CREATOR);
                tkVar.i = parcel.readInt();
                tkVar.j = parcel.readString();
                tkVar.k = parcel.createStringArrayList();
                tkVar.l = parcel.createTypedArrayList(y6.CREATOR);
                tkVar.m = parcel.createTypedArrayList(pk.CREATOR);
                return tkVar;
            case 10:
                return new xk(parcel);
            case 11:
                tp tpVar = new tp();
                tpVar.f = parcel.readInt();
                tpVar.g = parcel.readInt();
                tpVar.h = parcel.readInt() == 1;
                return tpVar;
            case 12:
                cs csVar = new cs(parcel);
                csVar.f = ((Integer) parcel.readValue(cs.class.getClassLoader())).intValue();
                return csVar;
            case 13:
                return qt.a(parcel.readInt(), parcel.readInt());
            case 14:
                gu guVar = new gu();
                guVar.f = parcel.readInt();
                guVar.g = (cw) parcel.readParcelable(gu.class.getClassLoader());
                return guVar;
            case 15:
                wu wuVar = new wu(parcel);
                wuVar.f = parcel.readInt();
                return wuVar;
            case 16:
                return new ParcelImpl(parcel);
            case 17:
                z20 z20Var = new z20();
                z20Var.f = parcel.readInt();
                z20Var.g = parcel.readInt();
                z20Var.i = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    z20Var.h = iArr;
                    parcel.readIntArray(iArr);
                }
                return z20Var;
            default:
                a30 a30Var = new a30();
                a30Var.f = parcel.readInt();
                a30Var.g = parcel.readInt();
                int readInt2 = parcel.readInt();
                a30Var.h = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    a30Var.i = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                a30Var.j = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    a30Var.k = iArr3;
                    parcel.readIntArray(iArr3);
                }
                a30Var.m = parcel.readInt() == 1;
                a30Var.n = parcel.readInt() == 1;
                a30Var.o = parcel.readInt() == 1;
                a30Var.l = parcel.readArrayList(z20.class.getClassLoader());
                return a30Var;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new j1[i];
            case 1:
                return new t1[i];
            case 2:
                return new c5[i];
            case 3:
                return new x6[i];
            case 4:
                return new y6[i];
            case 5:
                return new a7[i];
            case 6:
                return new v8[i];
            case 7:
                return new vd[i];
            case 8:
                return new pk[i];
            case 9:
                return new tk[i];
            case 10:
                return new xk[i];
            case 11:
                return new tp[i];
            case 12:
                return new cs[i];
            case 13:
                return new qt[i];
            case 14:
                return new gu[i];
            case 15:
                return new wu[i];
            case 16:
                return new ParcelImpl[i];
            case 17:
                return new z20[i];
            default:
                return new a30[i];
        }
    }
}
