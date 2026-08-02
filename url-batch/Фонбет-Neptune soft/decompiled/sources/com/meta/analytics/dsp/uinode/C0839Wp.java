package com.meta.analytics.dsp.uinode;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Wp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0839Wp implements D6 {
    public static String[] A05 = {"ZoOhGYHP8SNfCMTpI8hB8esJvCxQNk4a", "iCY0vtQk2BMTn8YKksXnllwhxYcEMWPa", "FRJmrfeKqiG8dvU06WzW6", "wyGcQq4l", "", "l2", "ODNaIWitniiqKmZchEPotBtPtmPon6SS", "r1S7VBlY5d2QYAsiLWImTDUS2fBhu4wR"};
    public final int A00;
    public final /* synthetic */ C0838Wo A04;
    public final C0469Hy A03 = new C0469Hy(new byte[5]);
    public final SparseArray<DD> A01 = new SparseArray<>();
    public final SparseIntArray A02 = new SparseIntArray();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015c A[SYNTHETIC] */
    @Override // com.meta.analytics.dsp.uinode.D6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A4R(C0470Hz c0470Hz) {
        int i;
        List list;
        IB ib;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int A04;
        int i7;
        SparseArray sparseArray;
        int i8;
        int i9;
        int i10;
        InterfaceC0329Bu interfaceC0329Bu;
        boolean z;
        InterfaceC0329Bu interfaceC0329Bu2;
        SparseBooleanArray sparseBooleanArray;
        DD dd;
        SparseArray sparseArray2;
        InterfaceC0329Bu interfaceC0329Bu3;
        int i11;
        SparseBooleanArray sparseBooleanArray2;
        int i12;
        DB db;
        DD A4j;
        int i13;
        DD dd2;
        DB db2;
        DD dd3;
        InterfaceC0329Bu interfaceC0329Bu4;
        int i14;
        int i15;
        List list2;
        List list3;
        if (c0470Hz.A0E() != 2) {
            return;
        }
        i = this.A04.A05;
        if (i != 1) {
            i14 = this.A04.A05;
            if (i14 != 2) {
                i15 = this.A04.A01;
                if (i15 != 1) {
                    list2 = this.A04.A0B;
                    ib = new IB(((IB) list2.get(0)).A03());
                    list3 = this.A04.A0B;
                    list3.add(ib);
                    c0470Hz.A0Z(2);
                    int A0I = c0470Hz.A0I();
                    i2 = 5;
                    c0470Hz.A0Z(5);
                    c0470Hz.A0a(this.A03, 2);
                    i3 = 4;
                    this.A03.A08(4);
                    i4 = 12;
                    c0470Hz.A0Z(this.A03.A04(12));
                    i5 = this.A04.A05;
                    i6 = 21;
                    if (i5 == 2) {
                        dd2 = this.A04.A03;
                        if (dd2 == null) {
                            DA da = new DA(21, null, null, new byte[0]);
                            C0838Wo c0838Wo = this.A04;
                            db2 = c0838Wo.A09;
                            c0838Wo.A03 = db2.A4j(21, da);
                            dd3 = this.A04.A03;
                            interfaceC0329Bu4 = this.A04.A02;
                            dd3.A8q(ib, interfaceC0329Bu4, new DC(A0I, 21, 8192));
                        }
                    }
                    this.A01.clear();
                    this.A02.clear();
                    A04 = c0470Hz.A04();
                    while (true) {
                        if (A04 > 0) {
                            int size = this.A02.size();
                            for (int i16 = 0; i16 < size; i16++) {
                                int keyAt = this.A02.keyAt(i16);
                                sparseBooleanArray = this.A04.A07;
                                sparseBooleanArray.put(keyAt, true);
                                DD valueAt = this.A01.valueAt(i16);
                                if (valueAt != null) {
                                    C0838Wo c0838Wo2 = this.A04;
                                    String[] strArr = A05;
                                    if (strArr[5].length() != strArr[4].length()) {
                                        A05[0] = "prZScD3eoAfWT6wNb9RUJeZXyBQ1ma5M";
                                        dd = c0838Wo2.A03;
                                        if (valueAt != dd) {
                                            interfaceC0329Bu3 = this.A04.A02;
                                            valueAt.A8q(ib, interfaceC0329Bu3, new DC(A0I, keyAt, 8192));
                                        }
                                        sparseArray2 = this.A04.A06;
                                        sparseArray2.put(this.A02.valueAt(i16), valueAt);
                                    }
                                }
                            }
                            i7 = this.A04.A05;
                            if (i7 == 2) {
                                z = this.A04.A04;
                                if (z) {
                                    return;
                                }
                                interfaceC0329Bu2 = this.A04.A02;
                                interfaceC0329Bu2.A5Y();
                                this.A04.A01 = 0;
                                this.A04.A04 = true;
                                return;
                            }
                            int i17 = 0;
                            sparseArray = this.A04.A06;
                            sparseArray.remove(this.A00);
                            C0838Wo c0838Wo3 = this.A04;
                            i8 = c0838Wo3.A05;
                            if (i8 != 1) {
                                i9 = this.A04.A01;
                                i17 = i9 - 1;
                            }
                            c0838Wo3.A01 = i17;
                            i10 = this.A04.A01;
                            if (i10 == 0) {
                                interfaceC0329Bu = this.A04.A02;
                                interfaceC0329Bu.A5Y();
                                this.A04.A04 = true;
                                return;
                            }
                            return;
                        }
                        c0470Hz.A0a(this.A03, i2);
                        int A042 = this.A03.A04(8);
                        this.A03.A08(3);
                        int A043 = this.A03.A04(13);
                        this.A03.A08(i3);
                        int A044 = this.A03.A04(i4);
                        DA A00 = A00(c0470Hz, A044);
                        if (A042 == 6) {
                            A042 = A00.A00;
                        }
                        A04 -= A044 + 5;
                        i11 = this.A04.A05;
                        int i18 = i11 == 2 ? A042 : A043;
                        sparseBooleanArray2 = this.A04.A07;
                        if (!sparseBooleanArray2.get(i18)) {
                            i12 = this.A04.A05;
                            if (i12 == 2 && A042 == i6) {
                                C0838Wo c0838Wo4 = this.A04;
                                String[] strArr2 = A05;
                                if (strArr2[2].length() == strArr2[3].length()) {
                                    break;
                                }
                                A05[0] = "McoDKrxcl9g055s4tJZatQwjzcY0TxoH";
                                A4j = c0838Wo4.A03;
                            } else {
                                db = this.A04.A09;
                                A4j = db.A4j(A042, A00);
                            }
                            i13 = this.A04.A05;
                            if (i13 != 2 || A043 < this.A02.get(i18, 8192)) {
                                this.A02.put(i18, A043);
                                this.A01.put(i18, A4j);
                            }
                        }
                        i2 = 5;
                        i3 = 4;
                        i4 = 12;
                        i6 = 21;
                    }
                    throw new RuntimeException();
                }
            }
        }
        list = this.A04.A0B;
        ib = (IB) list.get(0);
        c0470Hz.A0Z(2);
        int A0I2 = c0470Hz.A0I();
        i2 = 5;
        c0470Hz.A0Z(5);
        c0470Hz.A0a(this.A03, 2);
        i3 = 4;
        this.A03.A08(4);
        i4 = 12;
        c0470Hz.A0Z(this.A03.A04(12));
        i5 = this.A04.A05;
        i6 = 21;
        if (i5 == 2) {
        }
        this.A01.clear();
        this.A02.clear();
        A04 = c0470Hz.A04();
        while (true) {
            if (A04 > 0) {
            }
            i2 = 5;
            i3 = 4;
            i4 = 12;
            i6 = 21;
        }
        throw new RuntimeException();
    }

    public C0839Wp(C0838Wo c0838Wo, int i) {
        this.A04 = c0838Wo;
        this.A00 = i;
    }

    private DA A00(C0470Hz c0470Hz, int i) {
        long j;
        long formatIdentifier;
        long j2;
        int A06 = c0470Hz.A06();
        int i2 = A06 + i;
        int i3 = -1;
        String language = null;
        ArrayList arrayList = null;
        while (c0470Hz.A06() < i2) {
            int descriptorsStartPosition = c0470Hz.A0E();
            int positionOfNextDescriptor = c0470Hz.A06() + c0470Hz.A0E();
            if (descriptorsStartPosition == 5) {
                long A0M = c0470Hz.A0M();
                j = C0838Wo.A0F;
                if (A0M != j) {
                    formatIdentifier = C0838Wo.A0G;
                    if (A05[0].charAt(13) == 108) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A05;
                    strArr[5] = "OX";
                    strArr[4] = "";
                    if (A0M != formatIdentifier) {
                        j2 = C0838Wo.A0H;
                        if (A0M == j2) {
                            i3 = 36;
                        }
                    } else {
                        i3 = Opcodes.I2D;
                    }
                } else {
                    i3 = Opcodes.LOR;
                }
            } else if (descriptorsStartPosition == 106) {
                i3 = Opcodes.LOR;
            } else if (descriptorsStartPosition == 122) {
                i3 = Opcodes.I2D;
            } else if (descriptorsStartPosition == 123) {
                i3 = Opcodes.L2D;
            } else if (descriptorsStartPosition == 10) {
                language = c0470Hz.A0S(3).trim();
            } else if (descriptorsStartPosition == 89) {
                i3 = 89;
                arrayList = new ArrayList();
                while (c0470Hz.A06() < positionOfNextDescriptor) {
                    String trim = c0470Hz.A0S(3).trim();
                    int A0E = c0470Hz.A0E();
                    byte[] bArr = new byte[4];
                    c0470Hz.A0c(bArr, 0, 4);
                    arrayList.add(new D9(trim, A0E, bArr));
                }
            }
            c0470Hz.A0Z(positionOfNextDescriptor - c0470Hz.A06());
        }
        c0470Hz.A0Y(i2);
        return new DA(i3, language, arrayList, Arrays.copyOfRange(c0470Hz.A00, A06, i2));
    }

    @Override // com.meta.analytics.dsp.uinode.D6
    public final void A8q(IB ib, InterfaceC0329Bu interfaceC0329Bu, DC dc) {
    }
}
