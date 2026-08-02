package com.meta.analytics.dsp.uinode;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Region;
import android.util.Log;
import android.util.SparseArray;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class G7 {
    public static byte[] A07;
    public static String[] A08 = {"qcU5l5rVDanZ0IBZnB67EILhI18GgdFe", "32XpuNghlFeF4zyqPL948gmCUNCGk", "bftD5DkqR73p2Uf2yBhEF5T9UOvyv9s", "0", "qryxRa4yOsFNWhLtu25s3YxhDLRy", "", "tLr9RBWs5E21", "UeFN6nMF8sjHvHxScJIKm37Ehl9oCVg2"};
    public static final byte[] A09;
    public static final byte[] A0A;
    public static final byte[] A0B;
    public Bitmap A00;
    public final Canvas A01;
    public final Paint A02;
    public final Paint A03;
    public final C0420Fz A04;
    public final G0 A05;
    public final G6 A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C0420Fz A04(C0469Hy c0469Hy, int i) {
        int A04;
        int A042;
        int A043;
        int A044;
        int i2 = 8;
        int A045 = c0469Hy.A04(8);
        c0469Hy.A08(8);
        int i3 = i - 2;
        int[] A0F = A0F();
        int[] A0G = A0G();
        int[] A0H = A0H();
        while (i3 > 0) {
            int A046 = c0469Hy.A04(i2);
            int A047 = c0469Hy.A04(i2);
            int i4 = i3 - 2;
            int[] iArr = (A047 & 128) != 0 ? A0F : (A047 & 64) != 0 ? A0G : A0H;
            if ((A047 & 1) != 0) {
                A04 = c0469Hy.A04(i2);
                A042 = c0469Hy.A04(i2);
                A043 = c0469Hy.A04(i2);
                A044 = c0469Hy.A04(i2);
                i3 = i4 - 4;
            } else {
                A04 = c0469Hy.A04(6) << 2;
                A042 = c0469Hy.A04(4) << 4;
                A043 = c0469Hy.A04(4) << 4;
                A044 = c0469Hy.A04(2) << 6;
                i3 = i4 - 2;
            }
            if (A04 == 0) {
                A042 = 0;
                A043 = 0;
                A044 = 255;
            }
            iArr[A046] = A00((byte) (255 - (A044 & 255)), IF.A06((int) (A04 + ((A042 - 128) * 1.402d)), 0, 255), IF.A06((int) ((A04 - ((A043 - 128) * 0.34414d)) - ((A042 - 128) * 0.71414d)), 0, 255), IF.A06((int) (A04 + ((A043 - 128) * 1.772d)), 0, 255));
            i2 = 8;
        }
        return new C0420Fz(A045, A0F, A0G, A0H);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static G0 A05(C0469Hy c0469Hy) {
        int i;
        int i2;
        int i3;
        int i4;
        c0469Hy.A08(4);
        boolean A0F = c0469Hy.A0F();
        c0469Hy.A08(3);
        int A04 = c0469Hy.A04(16);
        int A042 = c0469Hy.A04(16);
        if (A0F) {
            i = c0469Hy.A04(16);
            i4 = c0469Hy.A04(16);
            i2 = c0469Hy.A04(16);
            i3 = c0469Hy.A04(16);
        } else {
            i = 0;
            i2 = 0;
            i3 = A042;
            i4 = A04;
        }
        return new G0(A04, A042, i, i4, i2, i3);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 27 out of bounds for length 27
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static G4 A08(C0469Hy c0469Hy, int i) {
        int i2 = 8;
        int A04 = c0469Hy.A04(8);
        c0469Hy.A08(4);
        boolean A0F = c0469Hy.A0F();
        c0469Hy.A08(3);
        int A042 = c0469Hy.A04(16);
        int A043 = c0469Hy.A04(16);
        int A044 = c0469Hy.A04(3);
        int A045 = c0469Hy.A04(3);
        c0469Hy.A08(2);
        int A046 = c0469Hy.A04(8);
        int A047 = c0469Hy.A04(8);
        int A048 = c0469Hy.A04(4);
        int A049 = c0469Hy.A04(2);
        c0469Hy.A08(2);
        int i3 = i - 10;
        SparseArray sparseArray = new SparseArray();
        while (i3 > 0) {
            int A0410 = c0469Hy.A04(16);
            int A0411 = c0469Hy.A04(2);
            int A0412 = c0469Hy.A04(2);
            int A0413 = c0469Hy.A04(12);
            c0469Hy.A08(4);
            int A0414 = c0469Hy.A04(12);
            i3 -= 6;
            int i4 = 0;
            int i5 = 0;
            if (A0411 == 1 || A0411 == 2) {
                i4 = c0469Hy.A04(i2);
                i5 = c0469Hy.A04(i2);
                i3 -= 2;
            }
            sparseArray.put(A0410, new G5(A0411, A0412, A0413, A0414, i4, i5));
            i2 = 8;
        }
        return new G4(A04, A0F, A042, A043, A044, A045, A046, A047, A048, A049, sparseArray);
    }

    public static String A09(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 17);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{Ascii.DC2, 55, 34, 55, 118, 48, 63, 51, 58, 50, 118, 58, 51, 56, 49, 34, 62, 118, 51, 46, 53, 51, 51, 50, 37, 118, 58, 63, 59, 63, 34, 106, 88, 76, 126, 79, 92, 93, 75, 92};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 28 out of bounds for length 28
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final List<C0408Fn> A0I(byte[] bArr, int i) {
        C0469Hy c0469Hy = new C0469Hy(bArr, i);
        while (c0469Hy.A01() >= 48 && c0469Hy.A04(8) == 15) {
            A0C(c0469Hy, this.A06);
        }
        if (this.A06.A01 == null) {
            return Collections.emptyList();
        }
        G0 g0 = this.A06.A00 != null ? this.A06.A00 : this.A05;
        if (this.A00 == null || g0.A05 + 1 != this.A00.getWidth() || g0.A00 + 1 != this.A00.getHeight()) {
            Bitmap createBitmap = Bitmap.createBitmap(g0.A05 + 1, g0.A00 + 1, Bitmap.Config.ARGB_8888);
            this.A00 = createBitmap;
            this.A01.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<G3> sparseArray = this.A06.A01.A03;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            G3 valueAt = sparseArray.valueAt(i2);
            G4 g4 = this.A06.A08.get(sparseArray.keyAt(i2));
            int i3 = valueAt.A00 + g0.A02;
            int i4 = valueAt.A01 + g0.A04;
            this.A01.clipRect(i3, i4, Math.min(g4.A08 + i3, g0.A01), Math.min(g4.A02 + i4, g0.A03), Region.Op.REPLACE);
            C0420Fz c0420Fz = this.A06.A06.get(g4.A00);
            if (c0420Fz == null && (c0420Fz = this.A06.A04.get(g4.A00)) == null) {
                c0420Fz = this.A04;
            }
            SparseArray<G5> sparseArray2 = g4.A09;
            for (int i5 = 0; i5 < sparseArray2.size(); i5++) {
                int keyAt = sparseArray2.keyAt(i5);
                G5 valueAt2 = sparseArray2.valueAt(i5);
                G1 g1 = this.A06.A07.get(keyAt);
                String[] strArr = A08;
                if (strArr[0].charAt(24) == strArr[7].charAt(24)) {
                    throw new RuntimeException();
                }
                A08[1] = "0wDldquZfVkccfOmGfzJ1HL0d6oT0";
                if (g1 == null) {
                    g1 = this.A06.A05.get(keyAt);
                }
                if (g1 != null) {
                    A0B(g1, c0420Fz, g4.A01, i3 + valueAt2.A02, i4 + valueAt2.A05, g1.A01 ? null : this.A02, this.A01);
                }
            }
            if (g4.A0A) {
                this.A03.setColor(g4.A01 == 3 ? c0420Fz.A03[g4.A07] : g4.A01 == 2 ? c0420Fz.A02[g4.A06] : c0420Fz.A01[g4.A05]);
                this.A01.drawRect(i3, i4, g4.A08 + i3, g4.A02 + i4, this.A03);
            }
            arrayList.add(new C0408Fn(Bitmap.createBitmap(this.A00, i3, i4, g4.A08, g4.A02), i3 / g0.A05, 0, i4 / g0.A00, 0, g4.A08 / g0.A05, g4.A02 / g0.A00));
            this.A01.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        return arrayList;
    }

    static {
        A0A();
        A09 = new byte[]{0, 7, 8, Ascii.SI};
        A0A = new byte[]{0, 119, -120, -1};
        A0B = new byte[]{0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    }

    public G7(int i, int i2) {
        Paint paint = new Paint();
        this.A02 = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.A03 = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.A01 = new Canvas();
        this.A05 = new G0(719, 575, 0, 719, 0, 575);
        this.A04 = new C0420Fz(0, A0F(), A0G(), A0H());
        this.A06 = new G6(i, i2);
    }

    public static int A00(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    public static int A01(C0469Hy c0469Hy, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        int i3 = i;
        boolean z = false;
        do {
            int i4 = 0;
            int i5 = 0;
            i5 = 0;
            i5 = 0;
            i5 = 0;
            int A04 = c0469Hy.A04(2);
            if (A04 != 0) {
                i4 = 1;
                if (A08[1].length() != 29) {
                    throw new RuntimeException();
                }
                A08[6] = "cKDkKJCaTP5Z";
                i5 = A04;
            } else if (c0469Hy.A0F()) {
                i4 = c0469Hy.A04(3) + 3;
                i5 = c0469Hy.A04(2);
                if (A08[1].length() == 29) {
                    A08[1] = "Xe5wyvwrL1rxQiCfD8ENREY9AaRUH";
                }
            } else if (c0469Hy.A0F()) {
                i4 = 1;
            } else {
                switch (c0469Hy.A04(2)) {
                    case 0:
                        z = true;
                        break;
                    case 1:
                        i4 = 2;
                        break;
                    case 2:
                        i4 = c0469Hy.A04(4) + 12;
                        i5 = c0469Hy.A04(2);
                        break;
                    case 3:
                        i4 = c0469Hy.A04(8) + 29;
                        if (A08[1].length() == 29) {
                            A08[5] = "eZC8v48u";
                            i5 = c0469Hy.A04(2);
                            break;
                        } else {
                            throw new RuntimeException();
                        }
                }
            }
            if (i4 != 0 && paint != null) {
                if (bArr != null) {
                    i5 = bArr[i5];
                }
                paint.setColor(iArr[i5]);
                canvas.drawRect(i3, i2, i3 + i4, i2 + 1, paint);
            }
            i3 += i4;
        } while (!z);
        return i3;
    }

    public static int A02(C0469Hy c0469Hy, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        int i3 = i;
        boolean z = false;
        do {
            int peek = 0;
            int A04 = c0469Hy.A04(4);
            if (A04 != 0) {
                peek = 1;
            } else if (!c0469Hy.A0F()) {
                int A042 = c0469Hy.A04(3);
                if (A042 != 0) {
                    peek = A042 + 2;
                    A04 = 0;
                } else {
                    z = true;
                    A04 = 0;
                }
            } else if (!c0469Hy.A0F()) {
                peek = c0469Hy.A04(2) + 4;
                A04 = c0469Hy.A04(4);
            } else {
                switch (c0469Hy.A04(2)) {
                    case 0:
                        peek = 1;
                        if (A08[1].length() == 29) {
                            String[] strArr = A08;
                            strArr[3] = "b";
                            strArr[4] = "RKCQrML1KI9i2rbeBXbE06C32ORX";
                            A04 = 0;
                            break;
                        } else {
                            A04 = 0;
                            break;
                        }
                    case 1:
                        peek = 2;
                        A04 = 0;
                        break;
                    case 2:
                        peek = c0469Hy.A04(4) + 9;
                        A04 = c0469Hy.A04(4);
                        break;
                    case 3:
                        peek = c0469Hy.A04(8) + 25;
                        String[] strArr2 = A08;
                        if (strArr2[3].length() != strArr2[4].length()) {
                            A08[6] = "tDVEwF5JbpPt";
                            A04 = c0469Hy.A04(4);
                            break;
                        } else {
                            throw new RuntimeException();
                        }
                    default:
                        A04 = 0;
                        break;
                }
            }
            if (peek != 0 && paint != null) {
                if (bArr != null) {
                    A04 = bArr[A04];
                }
                paint.setColor(iArr[A04]);
                float f = i3;
                float f2 = i2;
                if (A08[6].length() != 12) {
                    throw new RuntimeException();
                }
                A08[1] = "PxagUxU0Gd3Wd2jZQY5J7se2mW8fT";
                canvas.drawRect(f, f2, i3 + peek, i2 + 1, paint);
            }
            i3 += peek;
        } while (!z);
        return i3;
    }

    public static int A03(C0469Hy c0469Hy, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        int clutIndex;
        int i3 = i;
        boolean z = false;
        do {
            int A04 = c0469Hy.A04(8);
            if (A04 != 0) {
                clutIndex = 1;
            } else if (!c0469Hy.A0F()) {
                clutIndex = c0469Hy.A04(7);
                if (A08[6].length() != 12) {
                    throw new RuntimeException();
                }
                A08[1] = "SuejjuLnG0h9t9VMaryqiTg33Oi2Z";
                if (clutIndex != 0) {
                    A04 = 0;
                } else {
                    z = true;
                    clutIndex = 0;
                    A04 = 0;
                }
            } else {
                clutIndex = c0469Hy.A04(7);
                A04 = c0469Hy.A04(8);
            }
            if (clutIndex != 0 && paint != null) {
                if (bArr != null) {
                    A04 = bArr[A04];
                }
                paint.setColor(iArr[A04]);
                canvas.drawRect(i3, i2, i3 + clutIndex, i2 + 1, paint);
            }
            i3 += clutIndex;
        } while (!z);
        return i3;
    }

    public static G1 A06(C0469Hy c0469Hy) {
        int A04 = c0469Hy.A04(16);
        c0469Hy.A08(4);
        int objectId = c0469Hy.A04(2);
        boolean A0F = c0469Hy.A0F();
        c0469Hy.A08(1);
        byte[] bArr = null;
        byte[] bArr2 = null;
        if (objectId == 1) {
            int numberOfCodes = c0469Hy.A04(8);
            c0469Hy.A08(numberOfCodes * 16);
        } else if (objectId == 0) {
            int objectCodingMethod = c0469Hy.A04(16);
            int objectId2 = c0469Hy.A04(16);
            if (objectCodingMethod > 0) {
                bArr = new byte[objectCodingMethod];
                c0469Hy.A0E(bArr, 0, objectCodingMethod);
            }
            if (objectId2 > 0) {
                bArr2 = new byte[objectId2];
                c0469Hy.A0E(bArr2, 0, objectId2);
            } else {
                bArr2 = bArr;
            }
        }
        return new G1(A04, A0F, bArr, bArr2);
    }

    public static G2 A07(C0469Hy c0469Hy, int i) {
        int A04 = c0469Hy.A04(8);
        int A042 = c0469Hy.A04(4);
        int A043 = c0469Hy.A04(2);
        c0469Hy.A08(2);
        int i2 = i - 2;
        SparseArray sparseArray = new SparseArray();
        while (i2 > 0) {
            int remainingLength = c0469Hy.A04(8);
            c0469Hy.A08(8);
            int version = c0469Hy.A04(16);
            int timeoutSecs = c0469Hy.A04(16);
            i2 -= 6;
            sparseArray.put(remainingLength, new G3(version, timeoutSecs));
        }
        return new G2(A04, A042, A043, sparseArray);
    }

    public static void A0B(G1 g1, C0420Fz c0420Fz, int i, int i2, int i3, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i == 3) {
            iArr = c0420Fz.A03;
        } else {
            if (A08[2].length() == 20) {
                throw new RuntimeException();
            }
            A08[1] = "74G7JuTvJBV0INH1XI3DUfK6d2EWZ";
            if (i == 2) {
                iArr = c0420Fz.A02;
            } else {
                iArr = c0420Fz.A01;
            }
        }
        A0D(g1.A03, iArr, i, i2, i3, paint, canvas);
        A0D(g1.A02, iArr, i, i2, i3 + 1, paint, canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f6, code lost:
    
        if (r0 != 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f8, code lost:
    
        r7.A01 = r4;
        r7.A08.clear();
        r7.A06.clear();
        r7.A07.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0117, code lost:
    
        if (r5 == null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0119, code lost:
    
        r1 = r5.A02;
        r0 = r4.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011d, code lost:
    
        if (r1 == r0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x011f, code lost:
    
        r7.A01 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0114, code lost:
    
        if (r0 != 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A0C(C0469Hy c0469Hy, G6 g6) {
        int A04 = c0469Hy.A04(8);
        int A042 = c0469Hy.A04(16);
        int pageId = c0469Hy.A04(16);
        int dataFieldLimit = c0469Hy.A02() + pageId;
        int dataFieldLength = pageId * 8;
        int segmentType = c0469Hy.A01();
        if (dataFieldLength > segmentType) {
            Log.w(A09(31, 9, 63), A09(0, 31, 71));
            int segmentType2 = c0469Hy.A01();
            c0469Hy.A08(segmentType2);
            return;
        }
        switch (A04) {
            case 16:
                int segmentType3 = g6.A03;
                if (A042 == segmentType3) {
                    G2 pageComposition = g6.A01;
                    G2 current = A07(c0469Hy, pageId);
                    int dataFieldLength2 = A08[2].length();
                    if (dataFieldLength2 != 20) {
                        String[] strArr = A08;
                        strArr[0] = "SOWWurFjCTsQ5JKY9OnGZdezCI3KtXYI";
                        strArr[7] = "V4dNvY88haURe4qy074bHXOdfnJc7iQY";
                        int segmentType4 = current.A00;
                        break;
                    } else {
                        A08[5] = "eHaCLq5ayPLh";
                        int segmentType5 = current.A00;
                        break;
                    }
                }
                break;
            case 17:
                G2 g2 = g6.A01;
                int segmentType6 = g6.A03;
                if (A042 == segmentType6 && g2 != null) {
                    G4 regionComposition = A08(c0469Hy, pageId);
                    int segmentType7 = g2.A00;
                    if (segmentType7 == 0) {
                        SparseArray<G4> sparseArray = g6.A08;
                        int segmentType8 = regionComposition.A03;
                        regionComposition.A00(sparseArray.get(segmentType8));
                    }
                    SparseArray<G4> sparseArray2 = g6.A08;
                    String[] strArr2 = A08;
                    String str = strArr2[3];
                    String str2 = strArr2[4];
                    int dataFieldLength3 = str.length();
                    int segmentType9 = str2.length();
                    if (dataFieldLength3 == segmentType9) {
                        throw new RuntimeException();
                    }
                    A08[6] = "mahKYWCII7kQ";
                    int segmentType10 = regionComposition.A03;
                    sparseArray2.put(segmentType10, regionComposition);
                    break;
                }
                break;
            case 18:
                int segmentType11 = g6.A03;
                if (A042 == segmentType11) {
                    C0420Fz A043 = A04(c0469Hy, pageId);
                    SparseArray<C0420Fz> sparseArray3 = g6.A06;
                    int segmentType12 = A043.A00;
                    sparseArray3.put(segmentType12, A043);
                    break;
                } else {
                    int segmentType13 = g6.A02;
                    if (A042 == segmentType13) {
                        C0420Fz A044 = A04(c0469Hy, pageId);
                        SparseArray<C0420Fz> sparseArray4 = g6.A04;
                        int segmentType14 = A044.A00;
                        sparseArray4.put(segmentType14, A044);
                        break;
                    }
                }
                break;
            case 19:
                int segmentType15 = g6.A03;
                if (A042 == segmentType15) {
                    G1 A06 = A06(c0469Hy);
                    SparseArray<G1> sparseArray5 = g6.A07;
                    int segmentType16 = A06.A00;
                    sparseArray5.put(segmentType16, A06);
                    break;
                } else {
                    int segmentType17 = g6.A02;
                    if (A042 == segmentType17) {
                        G1 A062 = A06(c0469Hy);
                        SparseArray<G1> sparseArray6 = g6.A05;
                        int segmentType18 = A062.A00;
                        sparseArray6.put(segmentType18, A062);
                        break;
                    }
                }
                break;
            case 20:
                int segmentType19 = g6.A03;
                if (A042 == segmentType19) {
                    g6.A00 = A05(c0469Hy);
                    break;
                }
                break;
        }
        int segmentType20 = c0469Hy.A02();
        c0469Hy.A09(dataFieldLimit - segmentType20);
    }

    public static void A0D(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        byte[] clutMapTable4To8;
        byte[] clutMapTable4To82;
        int line = i3;
        C0469Hy c0469Hy = new C0469Hy(bArr);
        byte[] clutMapTable2To8 = null;
        byte[] clutMapTable2To4 = null;
        int column = i2;
        while (c0469Hy.A01() != 0) {
            switch (c0469Hy.A04(8)) {
                case 16:
                    if (i == 3) {
                        clutMapTable4To8 = clutMapTable2To4 == null ? A0A : clutMapTable2To4;
                    } else if (i == 2) {
                        clutMapTable4To8 = clutMapTable2To8 == null ? A09 : clutMapTable2To8;
                    } else {
                        clutMapTable4To8 = null;
                        if (A08[5].length() == 5) {
                            throw new RuntimeException();
                        }
                        String[] strArr = A08;
                        strArr[0] = "aCQdDxqS2bkmSWw219FL9FrVQLNlGxjh";
                        strArr[7] = "CXVqOrR1KNECyNPiemwICdwFVxmD3XsB";
                    }
                    if (A08[5].length() != 5) {
                        A08[1] = "sxwfPuAvCy0meNXm9qprXKFgJpDmZ";
                        column = A01(c0469Hy, iArr, clutMapTable4To8, column, line, paint, canvas);
                        c0469Hy.A05();
                        break;
                    } else {
                        throw new RuntimeException();
                    }
                case 17:
                    if (i == 3) {
                        clutMapTable4To82 = 0 == 0 ? A0B : null;
                    } else {
                        clutMapTable4To82 = null;
                    }
                    column = A02(c0469Hy, iArr, clutMapTable4To82, column, line, paint, canvas);
                    c0469Hy.A05();
                    break;
                case 18:
                    column = A03(c0469Hy, iArr, null, column, line, paint, canvas);
                    break;
                case 32:
                    clutMapTable2To8 = A0E(4, 4, c0469Hy);
                    break;
                case 33:
                    clutMapTable2To4 = A0E(4, 8, c0469Hy);
                    break;
                case 34:
                    clutMapTable2To4 = A0E(16, 8, c0469Hy);
                    break;
                case 240:
                    line += 2;
                    column = i2;
                    break;
            }
        }
    }

    public static byte[] A0E(int i, int i2, C0469Hy c0469Hy) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) c0469Hy.A04(i2);
        }
        return bArr;
    }

    public static int[] A0F() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    public static int[] A0G() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < iArr.length; i++) {
            if (i < 8) {
                int i2 = i & 1;
                if (A08[1].length() != 29) {
                    throw new RuntimeException();
                }
                A08[6] = "OBOqbcJ5TVgi";
                int i3 = i2 != 0 ? 255 : 0;
                iArr[i] = A00(255, i3, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                int i4 = (i & 1) != 0 ? 127 : 0;
                iArr[i] = A00(255, i4, (i & 2) != 0 ? 127 : 0, (i & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0161, code lost:
    
        if (r8 != 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0163, code lost:
    
        r0 = org.objectweb.asm.Opcodes.TABLESWITCH;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01b6, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01b3, code lost:
    
        if (r8 != 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x003c, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int[] A0H() {
        int i;
        int i2;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (A08[5].length() != 5) {
                A08[5] = "yMmopDV0PROTT6iUygdI9MoWuRB";
                if (i3 < 8) {
                    int i4 = (i3 & 1) != 0 ? 255 : 0;
                    iArr[i3] = A00(63, i4, (i3 & 2) != 0 ? 255 : 0, (i3 & 4) == 0 ? 0 : 255);
                } else {
                    int i5 = i3 & Opcodes.L2I;
                    int i6 = Opcodes.TABLESWITCH;
                    switch (i5) {
                        case 0:
                            int i7 = (i3 & 1) != 0 ? 85 : 0;
                            int i8 = i3 & 16;
                            if (A08[6].length() != 12) {
                                A08[6] = "5kFBsD3TZCPr";
                                break;
                            } else {
                                A08[5] = "e5fZNa";
                                break;
                            }
                            int i9 = i7 + i;
                            int i10 = ((i3 & 2) != 0 ? 85 : 0) + ((i3 & 32) != 0 ? Opcodes.TABLESWITCH : 0);
                            i2 = (i3 & 4) == 0 ? 0 : 85;
                            if ((i3 & 64) == 0) {
                                i6 = 0;
                            }
                            int i11 = i2 + i6;
                            String[] strArr = A08;
                            if (strArr[0].charAt(24) == strArr[7].charAt(24)) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A08;
                            strArr2[3] = "N";
                            strArr2[4] = "KgCT6FPPbQR5Gt38AZY6Kgkq0L3q";
                            iArr[i3] = A00(255, i9, i10, i11);
                            continue;
                        case 8:
                            int i12 = (i3 & 1) != 0 ? 85 : 0;
                            int i13 = i12 + ((i3 & 16) != 0 ? Opcodes.TABLESWITCH : 0);
                            int i14 = ((i3 & 2) != 0 ? 85 : 0) + ((i3 & 32) != 0 ? Opcodes.TABLESWITCH : 0);
                            i2 = (i3 & 4) == 0 ? 0 : 85;
                            if ((i3 & 64) == 0) {
                                i6 = 0;
                            }
                            iArr[i3] = A00(127, i13, i14, i2 + i6);
                            continue;
                        case 128:
                            int i15 = (i3 & 1) != 0 ? 43 : 0;
                            int A00 = A00(255, i15 + 127 + ((i3 & 16) != 0 ? 85 : 0), ((i3 & 2) != 0 ? 43 : 0) + 127 + ((i3 & 32) != 0 ? 85 : 0), ((i3 & 4) == 0 ? 0 : 43) + 127 + ((i3 & 64) == 0 ? 0 : 85));
                            String[] strArr3 = A08;
                            if (strArr3[3].length() == strArr3[4].length()) {
                                throw new RuntimeException();
                            }
                            String[] strArr4 = A08;
                            strArr4[0] = "aybqBWwtY0DT9MvKUrSszXiCsWNuAoGt";
                            strArr4[7] = "n5OaccyWXsmPzT0g59BcvtkeBPKtga8v";
                            iArr[i3] = A00;
                            continue;
                        case Opcodes.L2I /* 136 */:
                            int i16 = ((i3 & 1) != 0 ? 43 : 0) + ((i3 & 16) != 0 ? 85 : 0);
                            int i17 = ((i3 & 2) != 0 ? 43 : 0) + ((i3 & 32) != 0 ? 85 : 0);
                            if (A08[2].length() != 20) {
                                A08[5] = "gSUXJnsqi";
                                int i18 = (i3 & 4) == 0 ? 0 : 43;
                                int i19 = i3 & 64;
                                if (A08[2].length() != 20) {
                                    String[] strArr5 = A08;
                                    strArr5[0] = "whmrMiK0u12tANJBqhusYeSDK3rkmMFj";
                                    strArr5[7] = "x13RVeSrZB6JEJa4BQjiEaMCBMX5qcSw";
                                    iArr[i3] = A00(255, i16, i17, i18 + (i19 == 0 ? 0 : 85));
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                    }
                }
            }
            throw new RuntimeException();
        }
        return iArr;
    }

    public final void A0J() {
        this.A06.A00();
    }
}
