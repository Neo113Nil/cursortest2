package o;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class J1 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ J1(int i) {
        this.a = i;
    }

    public static void a(C0019Aq c0019Aq, Parcel parcel, int i) {
        int r = ZM.r(parcel, 20293);
        int i2 = c0019Aq.h;
        ZM.t(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = c0019Aq.i;
        ZM.t(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = c0019Aq.j;
        ZM.t(parcel, 3, 4);
        parcel.writeInt(i4);
        ZM.p(parcel, 4, c0019Aq.k);
        IBinder iBinder = c0019Aq.l;
        if (iBinder != null) {
            int r2 = ZM.r(parcel, 5);
            parcel.writeStrongBinder(iBinder);
            ZM.s(parcel, r2);
        }
        ZM.q(parcel, 6, c0019Aq.m, i);
        ZM.n(parcel, 7, c0019Aq.n);
        ZM.o(parcel, 8, c0019Aq.f13o, i);
        ZM.q(parcel, 10, c0019Aq.p, i);
        ZM.q(parcel, 11, c0019Aq.q, i);
        boolean z = c0019Aq.r;
        ZM.t(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = c0019Aq.s;
        ZM.t(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = c0019Aq.t;
        ZM.t(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        ZM.p(parcel, 15, c0019Aq.u);
        ZM.s(parcel, r);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                AbstractC0048Bt.n(parcel, "parcel");
                return new K1(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 1:
                I5 i5 = new I5(parcel);
                i5.h = parcel.readByte() != 0;
                return i5;
            case 2:
                return new R7(parcel);
            case 3:
                return new S7(parcel);
            case 4:
                C0484So c0484So = new C0484So();
                c0484So.h = parcel.readString();
                c0484So.i = parcel.readInt();
                return c0484So;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                C0640Yo c0640Yo = new C0640Yo();
                c0640Yo.l = null;
                c0640Yo.m = new ArrayList();
                c0640Yo.n = new ArrayList();
                c0640Yo.h = parcel.createStringArrayList();
                c0640Yo.i = parcel.createStringArrayList();
                c0640Yo.j = (R7[]) parcel.createTypedArray(R7.CREATOR);
                c0640Yo.k = parcel.readInt();
                c0640Yo.l = parcel.readString();
                c0640Yo.m = parcel.createStringArrayList();
                c0640Yo.n = parcel.createTypedArrayList(S7.CREATOR);
                c0640Yo.f134o = parcel.createTypedArrayList(C0484So.CREATOR);
                return c0640Yo;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                return new C0929dp(parcel);
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                AbstractC0048Bt.n(parcel, "inParcel");
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                AbstractC0048Bt.k(readParcelable);
                return new C1723pt((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 8:
                C1484mE c1484mE = new C1484mE(parcel);
                c1484mE.h = parcel.readInt();
                return c1484mE;
            case 9:
                return new ParcelImpl(parcel);
            case 10:
                return new C2146wH(parcel.readFloat());
            case 11:
                int E = TM.E(parcel);
                int i = 0;
                while (true) {
                    ArrayList arrayList = null;
                    while (parcel.dataPosition() < E) {
                        int readInt = parcel.readInt();
                        char c = (char) readInt;
                        if (c == 1) {
                            i = TM.y(parcel, readInt);
                        } else if (c != 2) {
                            TM.D(parcel, readInt);
                        } else {
                            Parcelable.Creator<QC> creator = QC.CREATOR;
                            int z = TM.z(parcel, readInt);
                            int dataPosition = parcel.dataPosition();
                            if (z == 0) {
                                break;
                            }
                            arrayList = parcel.createTypedArrayList(creator);
                            parcel.setDataPosition(dataPosition + z);
                        }
                    }
                    TM.s(parcel, E);
                    return new VU(i, arrayList);
                    break;
                }
            case 12:
                int E2 = TM.E(parcel);
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i6 = 0;
                long j = 0;
                long j2 = 0;
                String str = null;
                String str2 = null;
                int i7 = -1;
                while (parcel.dataPosition() < E2) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            i2 = TM.y(parcel, readInt2);
                            break;
                        case 2:
                            i3 = TM.y(parcel, readInt2);
                            break;
                        case 3:
                            i4 = TM.y(parcel, readInt2);
                            break;
                        case 4:
                            TM.G(parcel, readInt2, 8);
                            j = parcel.readLong();
                            break;
                        case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                            TM.G(parcel, readInt2, 8);
                            j2 = parcel.readLong();
                            break;
                        case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                            str = TM.q(parcel, readInt2);
                            break;
                        case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                            str2 = TM.q(parcel, readInt2);
                            break;
                        case '\b':
                            i6 = TM.y(parcel, readInt2);
                            break;
                        case '\t':
                            i7 = TM.y(parcel, readInt2);
                            break;
                        default:
                            TM.D(parcel, readInt2);
                            break;
                    }
                }
                TM.s(parcel, E2);
                return new QC(i2, i3, i4, j, j2, str, str2, i6, i7);
            case 13:
                int E3 = TM.E(parcel);
                String str3 = null;
                int i8 = 0;
                while (parcel.dataPosition() < E3) {
                    int readInt3 = parcel.readInt();
                    char c2 = (char) readInt3;
                    if (c2 == 1) {
                        i8 = TM.y(parcel, readInt3);
                    } else if (c2 != 2) {
                        TM.D(parcel, readInt3);
                    } else {
                        str3 = TM.q(parcel, readInt3);
                    }
                }
                TM.s(parcel, E3);
                return new Scope(i8, str3);
            case 14:
                int E4 = TM.E(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < E4) {
                    int readInt4 = parcel.readInt();
                    if (((char) readInt4) != 1) {
                        TM.D(parcel, readInt4);
                    } else {
                        intent = (Intent) TM.p(parcel, readInt4, Intent.CREATOR);
                    }
                }
                TM.s(parcel, E4);
                return new C0419Qb(intent);
            case 15:
                int E5 = TM.E(parcel);
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                boolean z2 = false;
                boolean z3 = false;
                while (parcel.dataPosition() < E5) {
                    int readInt5 = parcel.readInt();
                    char c3 = (char) readInt5;
                    if (c3 == 1) {
                        i9 = TM.y(parcel, readInt5);
                    } else if (c3 == 2) {
                        z2 = TM.x(parcel, readInt5);
                    } else if (c3 == 3) {
                        z3 = TM.x(parcel, readInt5);
                    } else if (c3 == 4) {
                        i10 = TM.y(parcel, readInt5);
                    } else if (c3 != 5) {
                        TM.D(parcel, readInt5);
                    } else {
                        i11 = TM.y(parcel, readInt5);
                    }
                }
                TM.s(parcel, E5);
                return new IO(i9, i10, i11, z2, z3);
            case 16:
                int E6 = TM.E(parcel);
                PendingIntent pendingIntent = null;
                int i12 = 0;
                int i13 = 0;
                String str4 = null;
                while (parcel.dataPosition() < E6) {
                    int readInt6 = parcel.readInt();
                    char c4 = (char) readInt6;
                    if (c4 == 1) {
                        i12 = TM.y(parcel, readInt6);
                    } else if (c4 == 2) {
                        i13 = TM.y(parcel, readInt6);
                    } else if (c4 == 3) {
                        pendingIntent = (PendingIntent) TM.p(parcel, readInt6, PendingIntent.CREATOR);
                    } else if (c4 != 4) {
                        TM.D(parcel, readInt6);
                    } else {
                        str4 = TM.q(parcel, readInt6);
                    }
                }
                TM.s(parcel, E6);
                return new C0162Gd(i12, i13, pendingIntent, str4);
            case 17:
                int E7 = TM.E(parcel);
                String str5 = null;
                C0162Gd c0162Gd = null;
                int i14 = 0;
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < E7) {
                    int readInt7 = parcel.readInt();
                    char c5 = (char) readInt7;
                    if (c5 == 1) {
                        i14 = TM.y(parcel, readInt7);
                    } else if (c5 == 2) {
                        str5 = TM.q(parcel, readInt7);
                    } else if (c5 == 3) {
                        pendingIntent2 = (PendingIntent) TM.p(parcel, readInt7, PendingIntent.CREATOR);
                    } else if (c5 != 4) {
                        TM.D(parcel, readInt7);
                    } else {
                        c0162Gd = (C0162Gd) TM.p(parcel, readInt7, C0162Gd.CREATOR);
                    }
                }
                TM.s(parcel, E7);
                return new Status(i14, str5, pendingIntent2, c0162Gd);
            case 18:
                return new T20(parcel.readStrongBinder());
            case 19:
                int E8 = TM.E(parcel);
                long j3 = -1;
                int i15 = 0;
                String str6 = null;
                while (parcel.dataPosition() < E8) {
                    int readInt8 = parcel.readInt();
                    char c6 = (char) readInt8;
                    if (c6 == 1) {
                        str6 = TM.q(parcel, readInt8);
                    } else if (c6 == 2) {
                        i15 = TM.y(parcel, readInt8);
                    } else if (c6 != 3) {
                        TM.D(parcel, readInt8);
                    } else {
                        TM.G(parcel, readInt8, 8);
                        j3 = parcel.readLong();
                    }
                }
                TM.s(parcel, E8);
                return new C0300Ll(j3, str6, i15);
            case 20:
                int E9 = TM.E(parcel);
                Bundle bundle = null;
                C0292Ld c0292Ld = null;
                int i16 = 0;
                C0300Ll[] c0300LlArr = null;
                while (parcel.dataPosition() < E9) {
                    int readInt9 = parcel.readInt();
                    char c7 = (char) readInt9;
                    if (c7 == 1) {
                        bundle = TM.o(parcel, readInt9);
                    } else if (c7 == 2) {
                        c0300LlArr = (C0300Ll[]) TM.r(parcel, readInt9, C0300Ll.CREATOR);
                    } else if (c7 == 3) {
                        i16 = TM.y(parcel, readInt9);
                    } else if (c7 != 4) {
                        TM.D(parcel, readInt9);
                    } else {
                        c0292Ld = (C0292Ld) TM.p(parcel, readInt9, C0292Ld.CREATOR);
                    }
                }
                TM.s(parcel, E9);
                d30 d30Var = new d30();
                d30Var.h = bundle;
                d30Var.i = c0300LlArr;
                d30Var.j = i16;
                d30Var.k = c0292Ld;
                return d30Var;
            case 21:
                int E10 = TM.E(parcel);
                IO io2 = null;
                int[] iArr = null;
                int[] iArr2 = null;
                boolean z4 = false;
                boolean z5 = false;
                int i17 = 0;
                while (parcel.dataPosition() < E10) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 1:
                            io2 = (IO) TM.p(parcel, readInt10, IO.CREATOR);
                            break;
                        case 2:
                            z4 = TM.x(parcel, readInt10);
                            break;
                        case 3:
                            z5 = TM.x(parcel, readInt10);
                            break;
                        case 4:
                            int z6 = TM.z(parcel, readInt10);
                            int dataPosition2 = parcel.dataPosition();
                            if (z6 != 0) {
                                iArr = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition2 + z6);
                                break;
                            } else {
                                iArr = null;
                                break;
                            }
                        case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                            i17 = TM.y(parcel, readInt10);
                            break;
                        case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                            int z7 = TM.z(parcel, readInt10);
                            int dataPosition3 = parcel.dataPosition();
                            if (z7 != 0) {
                                iArr2 = parcel.createIntArray();
                                parcel.setDataPosition(dataPosition3 + z7);
                                break;
                            } else {
                                iArr2 = null;
                                break;
                            }
                        default:
                            TM.D(parcel, readInt10);
                            break;
                    }
                }
                TM.s(parcel, E10);
                return new C0292Ld(io2, z4, z5, iArr, i17, iArr2);
            default:
                int E11 = TM.E(parcel);
                Bundle bundle2 = new Bundle();
                Scope[] scopeArr = C0019Aq.v;
                String str7 = null;
                IBinder iBinder = null;
                Account account = null;
                String str8 = null;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                boolean z8 = false;
                int i21 = 0;
                boolean z9 = false;
                C0300Ll[] c0300LlArr2 = C0019Aq.w;
                C0300Ll[] c0300LlArr3 = c0300LlArr2;
                while (parcel.dataPosition() < E11) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 1:
                            i18 = TM.y(parcel, readInt11);
                            break;
                        case 2:
                            i19 = TM.y(parcel, readInt11);
                            break;
                        case 3:
                            i20 = TM.y(parcel, readInt11);
                            break;
                        case 4:
                            str7 = TM.q(parcel, readInt11);
                            break;
                        case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                            int z10 = TM.z(parcel, readInt11);
                            int dataPosition4 = parcel.dataPosition();
                            if (z10 != 0) {
                                IBinder readStrongBinder = parcel.readStrongBinder();
                                parcel.setDataPosition(dataPosition4 + z10);
                                iBinder = readStrongBinder;
                                break;
                            } else {
                                iBinder = null;
                                break;
                            }
                        case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                            scopeArr = (Scope[]) TM.r(parcel, readInt11, Scope.CREATOR);
                            break;
                        case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                            bundle2 = TM.o(parcel, readInt11);
                            break;
                        case '\b':
                            account = (Account) TM.p(parcel, readInt11, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            TM.D(parcel, readInt11);
                            break;
                        case '\n':
                            c0300LlArr2 = (C0300Ll[]) TM.r(parcel, readInt11, C0300Ll.CREATOR);
                            break;
                        case 11:
                            c0300LlArr3 = (C0300Ll[]) TM.r(parcel, readInt11, C0300Ll.CREATOR);
                            break;
                        case '\f':
                            z8 = TM.x(parcel, readInt11);
                            break;
                        case '\r':
                            i21 = TM.y(parcel, readInt11);
                            break;
                        case 14:
                            z9 = TM.x(parcel, readInt11);
                            break;
                        case 15:
                            str8 = TM.q(parcel, readInt11);
                            break;
                    }
                }
                TM.s(parcel, E11);
                return new C0019Aq(i18, i19, i20, str7, iBinder, scopeArr, bundle2, account, c0300LlArr2, c0300LlArr3, z8, i21, z9, str8);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new K1[i];
            case 1:
                return new I5[i];
            case 2:
                return new R7[i];
            case 3:
                return new S7[i];
            case 4:
                return new C0484So[i];
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                return new C0640Yo[i];
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                return new C0929dp[i];
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                return new C1723pt[i];
            case 8:
                return new C1484mE[i];
            case 9:
                return new ParcelImpl[i];
            case 10:
                return new C2146wH[i];
            case 11:
                return new VU[i];
            case 12:
                return new QC[i];
            case 13:
                return new Scope[i];
            case 14:
                return new C0419Qb[i];
            case 15:
                return new IO[i];
            case 16:
                return new C0162Gd[i];
            case 17:
                return new Status[i];
            case 18:
                return new T20[i];
            case 19:
                return new C0300Ll[i];
            case 20:
                return new d30[i];
            case 21:
                return new C0292Ld[i];
            default:
                return new C0019Aq[i];
        }
    }
}
