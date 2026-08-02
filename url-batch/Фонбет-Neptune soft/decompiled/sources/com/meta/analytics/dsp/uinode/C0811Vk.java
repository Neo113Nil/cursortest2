package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0811Vk implements InterfaceC0440Gu {
    public static byte[] A0L;
    public static String[] A0M = {"BZiYu5nwNf87X3b9kN", "UgTeeMN2jxyMd9Kylf", "PJ", "CPqLt3pCFfCSwfi", "XN4Dvc1", "tWEaaCCiJhgiXtacO5se5vgeqa", "S002dfR", "J7ycXdK5d"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public Uri A05;
    public Uri A06;
    public InterfaceC0440Gu A07;
    public HO A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final InterfaceC0440Gu A0D;
    public final InterfaceC0440Gu A0E;
    public final InterfaceC0440Gu A0F;
    public final HK A0G;
    public final HM A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0L, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 35);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A0L = new byte[]{-92, -93, 120, -106, -104, -99, -102, -103, 119, -82, -87, -102, -88, -121, -102, -106, -103};
    }

    static {
        A06();
    }

    public C0811Vk(HK hk, InterfaceC0440Gu interfaceC0440Gu, InterfaceC0440Gu interfaceC0440Gu2, InterfaceC0438Gs interfaceC0438Gs, int i, HM hm) {
        this.A0G = hk;
        this.A0D = interfaceC0440Gu2;
        this.A0I = (i & 1) != 0;
        this.A0K = (i & 2) != 0;
        this.A0J = (i & 4) != 0;
        this.A0F = interfaceC0440Gu;
        if (interfaceC0438Gs != null) {
            this.A0E = new C0814Vn(interfaceC0440Gu, interfaceC0438Gs);
        } else {
            this.A0E = null;
        }
        this.A0H = hm;
    }

    private int A00(C0444Gy c0444Gy) {
        if (this.A0K) {
            boolean z = this.A0C;
            String[] strArr = A0M;
            if (strArr[3].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[3] = "r97zDVaaptRGknr";
            strArr2[6] = "AimjfMN";
            if (z) {
                if (A0M[7].length() != 14) {
                    A0M[7] = "lgdHkpCnxjAeRqVRog4eGXXV3TVVS";
                    return 0;
                }
                A0M[4] = "GvTYan8nqvP";
                return 0;
            }
        }
        if (this.A0J && c0444Gy.A02 == -1) {
            return 1;
        }
        return -1;
    }

    public static Uri A01(HK hk, String str, Uri uri) {
        HU contentMetadata = hk.A6X(str);
        Uri A01 = HV.A01(contentMetadata);
        return A01 == null ? uri : A01;
    }

    private void A03() throws IOException {
        InterfaceC0440Gu interfaceC0440Gu = this.A07;
        if (interfaceC0440Gu == null) {
            return;
        }
        try {
            interfaceC0440Gu.close();
            this.A07 = null;
            this.A0A = false;
            HO ho = this.A08;
            if (A0M[5].length() != 26) {
                throw new RuntimeException();
            }
            String[] strArr = A0M;
            strArr[3] = "f78PdfdQFRIsoy9";
            strArr[6] = "Xl8bArW";
            if (ho != null) {
                this.A0G.AEZ(ho);
                this.A08 = null;
            }
        } catch (Throwable th) {
            this.A07 = null;
            this.A0A = false;
            HO ho2 = this.A08;
            if (ho2 != null) {
                this.A0G.AEZ(ho2);
                this.A08 = null;
            }
            throw th;
        }
    }

    private void A04() {
        if (0 != 0 && this.A04 > 0) {
            this.A0G.A6F();
            throw new NullPointerException(A02(0, 17, 18));
        }
    }

    private void A05() throws IOException {
        this.A01 = 0L;
        if (A0C()) {
            this.A0G.AFx(this.A09, this.A03);
        }
    }

    private void A07(IOException iOException) {
        if (A0A() || (iOException instanceof HI)) {
            this.A0C = true;
        }
    }

    private void A08(boolean z) throws IOException {
        HO AGV;
        long j;
        C0444Gy c0444Gy;
        InterfaceC0440Gu nextDataSource;
        long j2;
        if (this.A0B) {
            AGV = null;
        } else if (this.A0I) {
            try {
                AGV = this.A0G.AGV(this.A09, this.A03);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            AGV = this.A0G.AGW(this.A09, this.A03);
        }
        if (AGV == null) {
            nextDataSource = this.A0F;
            c0444Gy = new C0444Gy(this.A06, this.A03, this.A01, this.A09, this.A00);
        } else if (AGV.A05) {
            Uri fromFile = Uri.fromFile(AGV.A03);
            long filePosition = this.A03 - AGV.A02;
            long length = AGV.A01 - filePosition;
            long j3 = this.A01;
            if (j3 != -1) {
                length = Math.min(length, j3);
            }
            c0444Gy = new C0444Gy(fromFile, this.A03, filePosition, length, this.A09, this.A00);
            nextDataSource = this.A0D;
        } else {
            if (AGV.A02()) {
                j = this.A01;
            } else {
                j = AGV.A01;
                long length2 = this.A01;
                if (length2 != -1) {
                    j = Math.min(j, length2);
                }
            }
            c0444Gy = new C0444Gy(this.A06, this.A03, j, this.A09, this.A00);
            if (this.A0E != null) {
                nextDataSource = this.A0E;
            } else {
                nextDataSource = this.A0F;
                this.A0G.AEZ(AGV);
                AGV = null;
            }
        }
        if (!this.A0B && nextDataSource == this.A0F) {
            j2 = this.A03 + 102400;
        } else {
            j2 = Long.MAX_VALUE;
        }
        this.A02 = j2;
        if (z) {
            AbstractC0445Ha.A04(A09());
            if (nextDataSource == this.A0F) {
                return;
            }
            try {
                A03();
            } catch (Throwable th) {
                if (AGV.A01()) {
                    this.A0G.AEZ(AGV);
                }
                throw th;
            }
        }
        if (AGV != null && AGV.A01()) {
            this.A08 = AGV;
        }
        this.A07 = nextDataSource;
        this.A0A = c0444Gy.A02 == -1;
        long ADl = nextDataSource.ADl(c0444Gy);
        HW hw = new HW();
        if (this.A0A) {
            if (A0M[2].length() != 2) {
                throw new RuntimeException();
            }
            A0M[7] = "GQ8HbidAJ3";
            if (ADl != -1) {
                this.A01 = ADl;
                HV.A05(hw, this.A03 + ADl);
            }
        }
        if (A0B()) {
            Uri A8E = this.A07.A8E();
            this.A05 = A8E;
            if (true ^ this.A06.equals(A8E)) {
                Uri uri = this.A05;
                if (A0M[5].length() != 26) {
                    HV.A06(hw, uri);
                } else {
                    A0M[4] = "mDcPGOd9V6d2O";
                    HV.A06(hw, uri);
                }
            } else {
                HV.A04(hw);
            }
        }
        if (A0C()) {
            this.A0G.A3a(this.A09, hw);
        }
    }

    private boolean A09() {
        return this.A07 == this.A0F;
    }

    private boolean A0A() {
        return this.A07 == this.A0D;
    }

    private boolean A0B() {
        return !A0A();
    }

    private boolean A0C() {
        return this.A07 == this.A0E;
    }

    public static boolean A0D(IOException iOException) {
        for (IOException iOException2 = iOException; iOException2 != null; iOException2 = iOException2.getCause()) {
            if ((iOException2 instanceof C0441Gv) && ((C0441Gv) iOException2).A00 == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0440Gu
    public final Uri A8E() {
        return this.A05;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0440Gu
    public final long ADl(C0444Gy c0444Gy) throws IOException {
        try {
            this.A09 = HQ.A02(c0444Gy);
            Uri uri = c0444Gy.A04;
            this.A06 = uri;
            this.A05 = A01(this.A0G, this.A09, uri);
            this.A00 = c0444Gy.A00;
            this.A03 = c0444Gy.A03;
            this.A0B = A00(c0444Gy) != -1;
            if (c0444Gy.A02 != -1 || this.A0B) {
                this.A01 = c0444Gy.A02;
            } else {
                long A6W = this.A0G.A6W(this.A09);
                this.A01 = A6W;
                if (A6W != -1) {
                    long j = A6W - c0444Gy.A03;
                    this.A01 = j;
                    if (j <= 0) {
                        throw new C0441Gv(0);
                    }
                }
            }
            A08(false);
            return this.A01;
        } catch (IOException e) {
            A07(e);
            throw e;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0440Gu
    public final void close() throws IOException {
        this.A06 = null;
        this.A05 = null;
        A04();
        try {
            A03();
        } catch (IOException e) {
            A07(e);
            throw e;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0440Gu
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.A01 == 0) {
            return -1;
        }
        try {
            if (this.A03 >= this.A02) {
                A08(true);
            }
            int read = this.A07.read(bArr, i, i2);
            if (read != -1) {
                if (A0A()) {
                    this.A04 += read;
                }
                this.A03 += read;
                long j = this.A01;
                if (j != -1) {
                    this.A01 = j - read;
                }
            } else if (this.A0A) {
                A05();
            } else {
                long j2 = this.A01;
                if (j2 <= 0) {
                    if (j2 == -1) {
                    }
                }
                A03();
                A08(false);
                return read(bArr, i, i2);
            }
            return read;
        } catch (IOException e) {
            if (this.A0A && A0D(e)) {
                A05();
                return -1;
            }
            A07(e);
            throw e;
        }
    }
}
