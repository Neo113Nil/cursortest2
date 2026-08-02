package com.meta.analytics.dsp.uinode;

import com.google.common.base.Ascii;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.io.encoding.Base64;

/* loaded from: assets/audience_network.dex */
public final class YA<T> implements AnonymousClass97<T> {
    public static byte[] A06;
    public C02578z A00;
    public C02578z A01;
    public List<YA<T>.RecordFileBasedFetch> A02;
    public boolean A03;
    public final C02568y A04;
    public final C9E A05;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 98);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{-28, 2, Ascii.SI, -63, 16, Ascii.SI, Ascii.CR, Ascii.SUB, -63, 5, 6, Ascii.CR, 6, Ascii.NAK, 6, -63, 4, Ascii.SYN, 19, Ascii.DC4, 16, 19, Ascii.DC4, -63, 17, 16, 10, Ascii.SI, Ascii.NAK, 10, Ascii.SI, 8, -63, 2, Ascii.NAK, -63, Ascii.NAK, 9, 6, -63, 5, 2, Ascii.NAK, 2, 3, 2, Ascii.DC4, 6, -63, Ascii.DC4, Ascii.NAK, 2, 19, Ascii.NAK, -38, Ascii.FF, 9, 10, 6, 9, -73, 7, 6, 10, 0, Ascii.VT, 0, 6, 5, -73, 0, 10, -73, -8, Ascii.VT, -73, -65, -68, -5, -61, -68, -5, -64, -61, -73, -8, 5, -5, -73, 9, -4, -6, 6, 9, -5, -73, -3, 0, 3, -4, -73, 10, -4, 8, Ascii.FF, -4, 5, -6, -4, -73, 10, Ascii.VT, -8, 9, Ascii.VT, 10, -73, -8, Ascii.VT, -73, -65, -68, -5, -61, -68, -5, -64, -47, -73, -5, -8, Ascii.VT, -8, -73, -1, -8, 10, -73, 7, 9, 6, -7, -8, -7, 3, 16, -73, -7, -4, -4, 5, -73, 3, 6, 10, Ascii.VT, -78, -28, -31, -30, -34, -31, -113, -33, -34, -30, -40, -29, -40, -34, -35, -113, -40, -30, -113, -48, -29, -113, -105, -108, -45, -101, -108, -45, -104, -101, -113, -47, -28, -29, -113, -31, -44, -46, -34, -31, -45, -113, -43, -40, -37, -44, -113, -30, -44, -32, -28, -44, -35, -46, -44, -113, -34, -35, -37, -24, -113, -41, -48, -30, -113, -43, -40, -37, -44, -113, -108, -45, -87, -113, -45, -48, -29, -48, -113, -41, -48, -30, -113, -33, -31, -34, -47, -48, -47, -37, -24, -113, -47, -44, -44, -35, -113, -37, -34, -30, -29, -27, 0, 8, Ascii.VT, 4, 3, -65, 19, Ascii.SO, -65, 0, 3, 3, -65, 3, 0, 19, 0, -65, 19, Ascii.SO, -65, Ascii.VT, Ascii.SO, 6, -72, -45, -37, -34, -41, -42, -110, -26, -31, -110, -43, -34, -41, -45, -28, -110, -42, -45, -26, -45, -44, -45, -27, -41, -9, Ascii.DC2, Ascii.SUB, Ascii.GS, Ascii.SYN, Ascii.NAK, -47, 37, 32, -47, Ascii.ETB, Ascii.SYN, 37, Ascii.DC4, Ascii.EM, -47, Ascii.NAK, Ascii.DC2, 37, Ascii.DC2, -47, Ascii.ETB, 35, 32, Ascii.RS, -47, Ascii.GS, 32, Ascii.CAN, 34, Base64.padSymbol, 69, 72, 65, 64, -4, 80, 75, -4, 67, 65, 80, -4, 78, 65, 63, 75, 78, 64, -4, 63, 75, 81, 74, 80, 5, 32, 40, 43, 36, 35, -33, 51, 46, -33, 52, 47, 35, 32, 51, 36, -33, 37, 40, 43, 36, -33, 50, 36, 48, 52, 36, 45, 34, 36, 43, 62, 60, 72, 75, Base64.padSymbol, Ascii.US, 66, 69, 62, Ascii.ESC, 58, 76, 62, Base64.padSymbol, 43, 62, 60, 72, 75, Base64.padSymbol, Ascii.GS, 58, 77, 58, 59, 58, 76, 62, -7, 60, 69, 72, 76, 62, Base64.padSymbol, -8, Ascii.VT, 9, Ascii.NAK, Ascii.CAN, 10, -20, Ascii.SI, Ascii.DC2, Ascii.VT, -24, 7, Ascii.EM, Ascii.VT, 10, -8, Ascii.VT, 9, Ascii.NAK, Ascii.CAN, 10, -22, 7, Ascii.SUB, 7, 8, 7, Ascii.EM, Ascii.VT, -58, Ascii.SI, Ascii.EM, -58, 9, Ascii.DC2, Ascii.NAK, Ascii.EM, Ascii.VT, 10, -24, 1, -2, 1, 2, 10, 1, -77, -27, -8, -10, 2, 5, -9, -39, -4, -1, -8, -43, -12, 6, -8, -9, -27, -8, -10, 2, 5, -9, -41, -12, 7, -12, -11, -12, 6, -8, -77, -7, -8, 7, -10, -5, Ascii.VT, Ascii.GS, Ascii.SUB, Ascii.ESC, Ascii.ETB, Ascii.SUB, 5, 2, Ascii.NAK, 2};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /* JADX WARN: Incorrect inner types in method signature: (Lcom/facebook/ads/redexgen/X/YA<TT;>.RecordFileBasedFetch;)Z */
    public synchronized boolean A06(YB yb) {
        if (!this.A02.remove(yb)) {
            return false;
        }
        if (yb.A5g() > 0 && yb.A01().A02.A05(yb.A01().A01).equals(this.A01)) {
            this.A01 = yb.A00().A02;
        }
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YA != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    public YA(AnonymousClass94 anonymousClass94, C9C c9c) throws IOException {
        this.A05 = new C9E(anonymousClass94.A04(A00(515, 4, 63)), c9c);
        C02568y c02568y = new C02568y(new File(anonymousClass94.A05(), A00(509, 6, 70)));
        this.A04 = c02568y;
        this.A00 = c02568y.A03();
        this.A02 = new ArrayList();
        A05(c9c);
        this.A01 = this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YA != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    private void A02(int i, int i2) throws IOException {
        C02578z c02578z = new C02578z(i, i2);
        this.A00 = c02578z;
        this.A04.A04(c02578z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YA != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YB != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    /* JADX WARN: Incorrect inner types in method signature: (Lcom/facebook/ads/redexgen/X/YA<TT;>.RecordFileBasedFetch;)V */
    public synchronized void A03(YB yb) throws C9G {
        if (!this.A03) {
            if (A06(yb)) {
                if (yb.A5g() == 0) {
                    return;
                }
                if (this.A00.A04(yb.A00().A02) == 0) {
                    try {
                        Iterator<C9B> it = yb.A00.iterator();
                        while (it.hasNext()) {
                            if (it.next().A00 == this.A05.A07() && this.A05.A0D()) {
                                A02(this.A05.A06(), 0);
                            } else {
                                A02(this.A05.A06(), yb.A00().A00);
                                break;
                            }
                        }
                        if (this.A01.A04(this.A00) < 0) {
                            this.A01 = this.A00;
                        }
                        return;
                    } catch (IOException e) {
                        throw new C9G(A00(361, 30, 93), e);
                    }
                }
                throw new C9G(A00(0, 54, 63));
            }
            throw new C9G(A00(466, 43, 49));
        }
        throw new C9G(A00(427, 39, 68));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YA != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Incorrect condition in loop: B:7:0x0066 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A05(C9C c9c) throws IOException {
        C02578z c02578z = new C02578z(this.A05.A06(), 0);
        C02578z recordSequenceStart = this.A00;
        if (c02578z.A04(recordSequenceStart) > 0) {
            Locale locale = Locale.US;
            C02578z recordSequenceStart2 = this.A00;
            C02578z recordSequenceStart3 = this.A00;
            c9c.AFF(String.format(locale, A00(54, 102, 53), Integer.valueOf(recordSequenceStart2.A02()), Integer.valueOf(recordSequenceStart3.A03()), Integer.valueOf(c02578z.A02()), Integer.valueOf(c02578z.A03())));
            this.A00 = c02578z;
            return;
        }
        while (r1 < recordSequenceStart.A02()) {
            if (this.A05.A0D()) {
                c02578z = new C02578z(this.A05.A06(), 0);
            } else {
                Locale locale2 = Locale.US;
                C02578z recordSequenceStart4 = this.A00;
                C02578z recordSequenceStart5 = this.A00;
                c9c.AFF(String.format(locale2, A00(156, 101, 13), Integer.valueOf(recordSequenceStart4.A02()), Integer.valueOf(recordSequenceStart5.A03()), Integer.valueOf(c02578z.A02())));
                C02578z c02578z2 = new C02578z(this.A05.A06(), this.A05.A07());
                this.A00 = c02578z2;
                this.A04.A04(c02578z2);
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YA != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YB != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    @Override // com.meta.analytics.dsp.uinode.AnonymousClass97
    public final synchronized AnonymousClass96 A5f(byte[] bArr, int[] iArr) throws C9G {
        YA<T>.RecordFileBasedFetch yb;
        if (!this.A03) {
            int i = 0;
            int i2 = 0;
            try {
                ArrayList arrayList = new ArrayList();
                boolean mayHaveMoreData = true;
                while (true) {
                    AnonymousClass92 A0A = this.A05.A0A(this.A01.A02(), this.A01.A03(), bArr, i, iArr, i2);
                    int A00 = A0A.A01().A00();
                    int storageOffset = A0A.A01().A01();
                    int i3 = A00 - storageOffset;
                    int storageOffset2 = A0A.A01().A02();
                    i += storageOffset2;
                    i2 += i3;
                    if (A0A.A01().A03() == AnonymousClass90.A02) {
                        arrayList.add(A0A);
                    }
                    if (A0A.A01().A03() == AnonymousClass90.A03) {
                        break;
                    }
                    if (A0A.A01().A03() == AnonymousClass90.A04) {
                        int countsOffset = this.A05.A06();
                        int storageOffset3 = this.A05.A08();
                        int countsOffset2 = countsOffset + storageOffset3;
                        int storageOffset4 = this.A01.A02();
                        if (countsOffset2 == storageOffset4 + 1) {
                            mayHaveMoreData = false;
                            break;
                        }
                        int storageOffset5 = this.A01.A02();
                        this.A01 = new C02578z(storageOffset5 + 1, 0);
                    } else {
                        this.A01 = this.A01.A05(i3);
                    }
                }
                yb = new YB(this, arrayList, mayHaveMoreData);
                this.A02.add(yb);
                if (!arrayList.isEmpty()) {
                    C02578z c02578z = yb.A01().A02;
                    int storageOffset6 = yb.A01().A01;
                    this.A01 = c02578z.A05(storageOffset6);
                }
            } catch (IOException e) {
                throw new C9G(A00(306, 29, 79), e);
            }
        } else {
            throw new C9G(A00(391, 36, 119));
        }
        return yb;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YA != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.meta.analytics.dsp.uinode.AnonymousClass97
    public final synchronized int A7n() throws C9G {
        int A09;
        if (!this.A03) {
            try {
                A09 = this.A05.A09();
                int A02 = this.A00.A02();
                int count = this.A05.A06();
                if (A02 == count) {
                    int count2 = this.A00.A03();
                    A09 -= count2;
                }
            } catch (IOException e) {
                throw new C9G(A00(335, 26, 122), e);
            }
        } else {
            throw new C9G(A00(427, 39, 68));
        }
        return A09;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YA != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.meta.analytics.dsp.uinode.AnonymousClass97
    public final synchronized void AGb(byte[] bArr) throws C9G {
        if (!this.A03) {
            try {
                this.A05.A0C(bArr);
            } catch (IOException e) {
                throw new C9G(A00(257, 25, 61), e);
            }
        } else {
            throw new C9G(A00(427, 39, 68));
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YA != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.meta.analytics.dsp.uinode.AnonymousClass97
    public final synchronized void clear() throws C9G {
        try {
            this.A05.A0B();
            A02(this.A05.A06(), 0);
            this.A02.clear();
        } catch (IOException e) {
            throw new C9G(A00(282, 24, 16), e);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YA != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (this.A03) {
            return;
        }
        this.A03 = true;
        this.A02.clear();
        this.A04.close();
        this.A05.close();
    }
}
