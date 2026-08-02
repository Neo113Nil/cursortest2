package com.meta.analytics.dsp.uinode;

import android.view.View;
import android.view.ViewGroup;
import com.google.common.base.Ascii;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.4w, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01624w {
    public static byte[] A09;
    public static String[] A0A = {"ulA9tMpXJ0Fgz3L6", "kmBp6JcSqPlb9eogqvbvj6g5ppHVaWSS", "klPqAM4BpBJNr6xIOjiQhoS6UO4TrOHS", "7VyM9GgXJuu8YzSYQI3HrMroeBYRJajD", "jF2bnw6E6wYHKm8plX11kYiLrSAbSJmD", "6pBnRch9VxXRPJwtqH0gd323b09mKXXU", "Clk2oRExhn8z5HC1wWkAqM8aEwWEfAA8", "Myq33IQdIYqIzBMhSJhfspyke76FBM0c"};
    public int A00;
    public C4v A01;
    public ArrayList<AnonymousClass56> A02;
    public int A03;
    public AnonymousClass54 A04;
    public final ArrayList<AnonymousClass56> A05;
    public final ArrayList<AnonymousClass56> A06;
    public final List<AnonymousClass56> A07;
    public final /* synthetic */ C0372Eb A08;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 58);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A09 = new byte[]{-91, -18, -8, -58, -7, -7, -26, -24, -19, -22, -23, -65, -59, -32, 39, Ascii.RS, Ascii.RS, 43, Ascii.GS, 44, -14, -53, -48, -62, -21, Ascii.SYN, 7, Ascii.SI, -62, 5, 17, Ascii.ETB, 16, Ascii.SYN, -36, -38, -33, 36, 37, Ascii.DC2, 37, Ascii.SYN, -21, -99, -69, -58, -58, -65, -66, 122, -51, -67, -52, -69, -54, 122, -48, -61, -65, -47, 122, -47, -61, -50, -62, 122, -69, -56, 122, -61, -56, -48, -69, -58, -61, -66, 122, -48, -61, -65, -47, -120, 122, -93, -56, -48, -69, -58, -61, -66, 122, -48, -61, -65, -47, -51, 122, -67, -69, -56, -56, -55, -50, 122, -68, -65, 122, -52, -65, -49, -51, -65, -66, 122, -64, -52, -55, -57, 122, -51, -67, -52, -69, -54, -122, 122, -50, -62, -65, -45, 122, -51, -62, -55, -49, -58, -66, 122, -52, -65, -68, -55, -49, -56, -66, 122, -64, -52, -55, -57, 122, -52, -65, -67, -45, -67, -58, -65, -52, 122, -54, -55, -55, -58, -120, -7, Ascii.RS, 19, Ascii.US, Ascii.RS, 35, Ascii.EM, 35, 36, Ascii.NAK, Ascii.RS, 19, 41, -48, Ascii.DC4, Ascii.NAK, 36, Ascii.NAK, 19, 36, Ascii.NAK, Ascii.DC4, -34, -48, -7, Ascii.RS, 38, 17, Ascii.FS, Ascii.EM, Ascii.DC4, -48, Ascii.EM, 36, Ascii.NAK, Ascii.GS, -48, 32, Ascii.US, 35, Ascii.EM, 36, Ascii.EM, Ascii.US, Ascii.RS, -48, -13, Ascii.CAN, Ascii.CR, Ascii.EM, Ascii.CAN, Ascii.GS, 19, Ascii.GS, Ascii.RS, Ascii.SI, Ascii.CAN, Ascii.CR, 35, -54, Ascii.SO, Ascii.SI, Ascii.RS, Ascii.SI, Ascii.CR, Ascii.RS, Ascii.SI, Ascii.SO, -40, -54, -13, Ascii.CAN, 32, Ascii.VT, Ascii.SYN, 19, Ascii.SO, -54, 32, 19, Ascii.SI, 33, -54, Ascii.DC2, Ascii.EM, Ascii.SYN, Ascii.SO, Ascii.SI, Ascii.FS, -54, Ascii.VT, Ascii.SO, Ascii.VT, Ascii.SUB, Ascii.RS, Ascii.SI, Ascii.FS, -54, Ascii.SUB, Ascii.EM, Ascii.GS, 19, Ascii.RS, 19, Ascii.EM, Ascii.CAN, -125, -88, -80, -101, -90, -93, -98, 90, -93, -82, -97, -89, 90, -86, -87, -83, -93, -82, -93, -87, -88, 90, -63, -47, -32, -49, -34, -34, -45, -46, -114, -35, -32, -114, -49, -30, -30, -49, -47, -42, -45, -46, -114, -28, -41, -45, -27, -31, -114, -37, -49, -25, -114, -36, -35, -30, -114, -48, -45, -114, -32, -45, -47, -25, -47, -38, -45, -46, -100, -114, -41, -31, -63, -47, -32, -49, -34, -88, -35, -10, -7, -87, -19, -18, -3, -22, -20, -15, -18, -19, -87, -1, -14, -18, 0, -87, -4, -15, -8, -2, -11, -19, -87, -21, -18, -87, -5, -18, -10, -8, -1, -18, -19, -87, -17, -5, -8, -10, -87, -37, -18, -20, 2, -20, -11, -18, -5, -33, -14, -18, 0, -87, -21, -18, -17, -8, -5, -18, -87, -14, -3, -87, -20, -22, -9, -87, -21, -18, -87, -5, -18, -20, 2, -20, -11, -18, -19, -61, -87, -102, -72, -65, -81, -76, -83, 102, -70, -75, 102, -72, -85, -87, -65, -87, -78, -85, 102, -89, -76, 102, -81, -83, -76, -75, -72, -85, -86, 102, -68, -81, -85, -67, 102, -82, -75, -78, -86, -85, -72, 116, 102, -97, -75, -69, 102, -71, -82, -75, -69, -78, -86, 102, -84, -81, -72, -71, -70, 102, -87, -89, -78, -78, 102, -71, -70, -75, -74, -113, -83, -76, -75, -72, -81, -76, -83, -100, -81, -85, -67, 110, -68, -81, -85, -67, 111, 102, -88, -85, -84, -75, -72, -85, 102, -87, -89, -78, -78, -81, -76, -83, 102, -72, -85, -87, -65, -87, -78, -85, 116, -19, -21, -6, -36, -17, -21, -3, -52, -11, -8, -42, -11, -7, -17, -6, -17, -11, -12, -57, -12, -22, -38, -1, -10, -21, -73, -84, -60, -70, -64, -65, 107, -76, -71, -81, -80, -61, 107, -66, -77, -70, -64, -73, -81, 107, -71, -70, -65, 107, -83, -80, 107, 120, 124, 107, -84, -79, -65, -80, -67, 107, -64, -71, -77, -76, -81, -76, -71, -78, 107, -84, 107, -63, -76, -80, -62, -123, -60, -61, -85, -66, -70, -52, -89, -70, -72, -50, -72, -63, -70, -71};
    }

    static {
        A05();
    }

    public C01624w(C0372Eb c0372Eb) {
        this.A08 = c0372Eb;
        ArrayList<AnonymousClass56> arrayList = new ArrayList<>();
        this.A05 = arrayList;
        this.A02 = null;
        this.A06 = new ArrayList<>();
        this.A07 = Collections.unmodifiableList(arrayList);
        this.A03 = 2;
        this.A00 = 2;
    }

    private final View A00(int i, boolean z) {
        return A0I(i, z, Long.MAX_VALUE).A0H;
    }

    private final AnonymousClass56 A01(int i) {
        int size;
        int A04;
        ArrayList<AnonymousClass56> arrayList = this.A02;
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return null;
        }
        for (int i2 = 0; i2 < size; i2++) {
            AnonymousClass56 anonymousClass56 = this.A02.get(i2);
            if (!anonymousClass56.A0g()) {
                int i3 = anonymousClass56.A0I();
                if (i3 == i) {
                    anonymousClass56.A0T(32);
                    return anonymousClass56;
                }
            }
        }
        if (this.A08.A04.A0A() && (A04 = this.A08.A00.A04(i)) > 0) {
            int offsetPosition = this.A08.A04.A0E();
            if (A04 < offsetPosition) {
                long A042 = this.A08.A04.A04(A04);
                for (int i4 = 0; i4 < size; i4++) {
                    AnonymousClass56 anonymousClass562 = this.A02.get(i4);
                    if (!anonymousClass562.A0g() && anonymousClass562.A0K() == A042) {
                        anonymousClass562.A0T(32);
                        return anonymousClass562;
                    }
                }
            }
        }
        return null;
    }

    private final AnonymousClass56 A02(int i, boolean z) {
        View A08;
        int size = this.A05.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnonymousClass56 anonymousClass56 = this.A05.get(i2);
            if (!anonymousClass56.A0g()) {
                int scrapCount = anonymousClass56.A0I();
                if (scrapCount == i && !anonymousClass56.A0Z() && (this.A08.A0s.A09 || !anonymousClass56.A0a())) {
                    anonymousClass56.A0T(32);
                    return anonymousClass56;
                }
            }
        }
        if (!z && (A08 = this.A08.A01.A08(i)) != null) {
            AnonymousClass56 A0F = C0372Eb.A0F(A08);
            this.A08.A01.A0G(A08);
            int A07 = this.A08.A01.A07(A08);
            if (A07 != -1) {
                this.A08.A01.A0C(A07);
                A0S(A08);
                A0F.A0T(8224);
                return A0F;
            }
            throw new IllegalStateException(A04(565, 52, 17) + A0F + this.A08.A1H());
        }
        int size2 = this.A06.size();
        for (int i3 = 0; i3 < size2; i3++) {
            AnonymousClass56 anonymousClass562 = this.A06.get(i3);
            if (!anonymousClass562.A0Z()) {
                int scrapCount2 = anonymousClass562.A0I();
                if (scrapCount2 == i) {
                    if (!z) {
                        this.A06.remove(i3);
                    }
                    return anonymousClass562;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final AnonymousClass56 A03(long j, int i, boolean z) {
        int count = this.A05.size();
        int i2 = count - 1;
        while (true) {
            if (i2 >= 0) {
                AnonymousClass56 anonymousClass56 = this.A05.get(i2);
                if (anonymousClass56.A0K() == j && !anonymousClass56.A0g()) {
                    int count2 = anonymousClass56.A0H();
                    if (i == count2) {
                        anonymousClass56.A0T(32);
                        if (anonymousClass56.A0a()) {
                            C0372Eb c0372Eb = this.A08;
                            int i3 = A0A[4].charAt(3);
                            if (i3 == 98) {
                                A0A[0] = "q3aWXTgT7NsVf007";
                                if (!c0372Eb.A0s.A07()) {
                                    String[] strArr = A0A;
                                    String str = strArr[2];
                                    String str2 = strArr[1];
                                    int cacheSize = str.charAt(0);
                                    int count3 = str2.charAt(0);
                                    if (cacheSize != count3) {
                                        A0A[4] = "NC6bFXUosLdTEwJsXrsHGkbXBsQUMG7q";
                                        anonymousClass56.A0U(2, 14);
                                    } else {
                                        String[] strArr2 = A0A;
                                        strArr2[2] = "kBSMDIkt47Rx4hHhTamY1xnSrMWRxYxp";
                                        strArr2[1] = "kToZLwND7zKVFlbtf8XZb6UwHA5zPLAu";
                                        anonymousClass56.A0U(2, 14);
                                    }
                                }
                            }
                        }
                        return anonymousClass56;
                    }
                    if (!z) {
                        this.A05.remove(i2);
                        this.A08.removeDetachedView(anonymousClass56.A0H, false);
                        A0R(anonymousClass56.A0H);
                    }
                }
                i2--;
            } else {
                int count4 = this.A06.size();
                for (int i4 = count4 - 1; i4 >= 0; i4--) {
                    AnonymousClass56 anonymousClass562 = this.A06.get(i4);
                    if (anonymousClass562.A0K() == j) {
                        int A0H = anonymousClass562.A0H();
                        int cacheSize2 = A0A[0].length();
                        if (cacheSize2 != 16) {
                            String[] strArr3 = A0A;
                            strArr3[7] = "lrD7iCy3KBiO8gA6PsFToJiVZrW1xMAl";
                            strArr3[6] = "amz9CZtibeJcU8bEqG7a4ZYgRNeZgxWk";
                            if (i == A0H) {
                                if (!z) {
                                    ArrayList<AnonymousClass56> arrayList = this.A06;
                                    String[] strArr4 = A0A;
                                    String str3 = strArr4[5];
                                    String str4 = strArr4[3];
                                    int cacheSize3 = str3.charAt(0);
                                    int count5 = str4.charAt(0);
                                    if (cacheSize3 != count5) {
                                        String[] strArr5 = A0A;
                                        strArr5[5] = "or4YmCu0ppqzW1VFAnuQtpcwvOCNSyKL";
                                        strArr5[3] = "x7G8xrEgau2heO3LEdjWfX9qC3RDyC0d";
                                        arrayList.remove(i4);
                                    } else {
                                        arrayList.remove(i4);
                                    }
                                }
                                return anonymousClass562;
                            }
                            if (z) {
                                A07(i4);
                                String[] strArr6 = A0A;
                                String str5 = strArr6[2];
                                String str6 = strArr6[1];
                                int cacheSize4 = str5.charAt(0);
                                int count6 = str6.charAt(0);
                                if (cacheSize4 == count6) {
                                    A0A[4] = "2lrbY7WLbUziAPe6QkcwvBQ2VEr9QFta";
                                    return null;
                                }
                            }
                        } else {
                            String[] strArr7 = A0A;
                            strArr7[2] = "kYzWBiiTSiU3KogqfJ4EJctPAodLTQqF";
                            strArr7[1] = "kIBKgO4naDZyukeXVXxcwMENrZxoY36q";
                            if (i == A0H) {
                                if (!z) {
                                }
                                return anonymousClass562;
                            }
                            if (z) {
                            }
                        }
                    }
                }
                return null;
            }
        }
    }

    private final void A06() {
        boolean z;
        int count = this.A06.size();
        for (int count2 = count - 1; count2 >= 0; count2--) {
            A07(count2);
        }
        this.A06.clear();
        z = C0372Eb.A1E;
        if (z) {
            this.A08.A02.A02();
        }
    }

    private final void A07(int i) {
        A0Z(this.A06.get(i), true);
        this.A06.remove(i);
    }

    private void A08(ViewGroup viewGroup, boolean z) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                String[] strArr = A0A;
                String str = strArr[7];
                String str2 = strArr[6];
                int charAt = str.charAt(8);
                int i = str2.charAt(8);
                if (charAt == i) {
                    throw new RuntimeException();
                }
                A0A[4] = "0ZJbYELQTNKw4GYvMFOIJ2JFgvUoupt2";
                A08((ViewGroup) childAt, true);
            }
        }
        if (!z) {
            return;
        }
        if (viewGroup.getVisibility() == 4) {
            viewGroup.setVisibility(0);
            viewGroup.setVisibility(4);
        } else {
            int visibility = viewGroup.getVisibility();
            viewGroup.setVisibility(4);
            viewGroup.setVisibility(visibility);
        }
    }

    private void A09(AnonymousClass56 anonymousClass56) {
        if (this.A08.A1o()) {
            View view = anonymousClass56.A0H;
            if (C3T.A00(view) == 0) {
                C3T.A09(view, 1);
            }
            if (!C3T.A0F(view)) {
                anonymousClass56.A0T(16384);
                C3T.A0B(view, this.A08.A09.A0A());
            }
        }
    }

    private void A0A(AnonymousClass56 anonymousClass56) {
        if (anonymousClass56.A0H instanceof ViewGroup) {
            A08((ViewGroup) anonymousClass56.A0H, false);
        }
    }

    private final void A0B(AnonymousClass56 anonymousClass56) {
        if (0 != 0) {
            throw new NullPointerException(A04(617, 14, 27));
        }
        if (this.A08.A0s != null) {
            this.A08.A0t.A0B(anonymousClass56);
        }
    }

    private final boolean A0C(AnonymousClass56 anonymousClass56) {
        if (anonymousClass56.A0a()) {
            return this.A08.A0s.A07();
        }
        if (anonymousClass56.A03 >= 0 && anonymousClass56.A03 < this.A08.A04.A0E()) {
            if (!this.A08.A0s.A07()) {
                int A03 = this.A08.A04.A03(anonymousClass56.A03);
                int type = anonymousClass56.A0H();
                if (A03 != type) {
                    return false;
                }
            }
            return !this.A08.A04.A0A() || anonymousClass56.A0K() == this.A08.A04.A04(anonymousClass56.A03);
        }
        throw new IndexOutOfBoundsException(A04(211, 60, 112) + anonymousClass56 + this.A08.A1H());
    }

    private boolean A0D(AnonymousClass56 anonymousClass56, int i, int i2, long startBindNs) {
        anonymousClass56.A08 = this.A08;
        int A0H = anonymousClass56.A0H();
        long nanoTime = this.A08.getNanoTime();
        if (startBindNs != Long.MAX_VALUE) {
            C4v c4v = this.A01;
            String[] strArr = A0A;
            String str = strArr[5];
            String str2 = strArr[3];
            int charAt = str.charAt(0);
            int viewType = str2.charAt(0);
            if (charAt == viewType) {
                throw new RuntimeException();
            }
            A0A[0] = "We3abAYlnqMpJzTP";
            if (!c4v.A0A(A0H, nanoTime, startBindNs)) {
                return false;
            }
        }
        this.A08.A04.A09(anonymousClass56, i);
        this.A01.A05(anonymousClass56.A0H(), this.A08.getNanoTime() - nanoTime);
        A09(anonymousClass56);
        if (this.A08.A0s.A07()) {
            anonymousClass56.A04 = i2;
            return true;
        }
        return true;
    }

    public final int A0E() {
        return this.A05.size();
    }

    public final View A0F(int i) {
        return this.A05.get(i).A0H;
    }

    public final View A0G(int i) {
        return A00(i, false);
    }

    public final C4v A0H() {
        if (this.A01 == null) {
            this.A01 = new C4v();
        }
        return this.A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x026b, code lost:
    
        if (r5 == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0271, code lost:
    
        if (r9.A0Z() == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02a1, code lost:
    
        if (r5 == false) goto L106;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AnonymousClass56 A0I(int i, boolean z, long j) {
        C01564p c01564p;
        boolean fromScrapOrHiddenOrCache;
        C0372Eb A0H;
        if (i >= 0 && i < this.A08.A0s.A03()) {
            boolean z2 = false;
            AnonymousClass56 anonymousClass56 = null;
            boolean fromScrapOrHiddenOrCache2 = this.A08.A0s.A07();
            if (fromScrapOrHiddenOrCache2) {
                anonymousClass56 = A01(i);
                z2 = anonymousClass56 != null;
            }
            if (anonymousClass56 == null && (anonymousClass56 = A02(i, z)) != null) {
                boolean fromScrapOrHiddenOrCache3 = A0C(anonymousClass56);
                if (!fromScrapOrHiddenOrCache3) {
                    if (!z) {
                        anonymousClass56.A0T(4);
                        boolean fromScrapOrHiddenOrCache4 = anonymousClass56.A0b();
                        if (fromScrapOrHiddenOrCache4) {
                            this.A08.removeDetachedView(anonymousClass56.A0H, false);
                            anonymousClass56.A0S();
                        } else {
                            boolean fromScrapOrHiddenOrCache5 = anonymousClass56.A0g();
                            if (fromScrapOrHiddenOrCache5) {
                                anonymousClass56.A0O();
                            }
                        }
                        A0X(anonymousClass56);
                    }
                    anonymousClass56 = null;
                } else {
                    z2 = true;
                }
            }
            if (anonymousClass56 == null) {
                int A04 = this.A08.A00.A04(i);
                if (A04 < 0 || A04 >= this.A08.A04.A0E()) {
                    throw new IndexOutOfBoundsException(A04(Opcodes.IF_ACMPEQ, 46, 118) + i + A04(13, 8, 126) + A04 + A04(35, 8, 119) + this.A08.A0s.A03() + this.A08.A1H());
                }
                int A03 = this.A08.A04.A03(A04);
                boolean fromScrapOrHiddenOrCache6 = this.A08.A04.A0A();
                if (fromScrapOrHiddenOrCache6 && (anonymousClass56 = A03(this.A08.A04.A04(A04), A03, z)) != null) {
                    anonymousClass56.A03 = A04;
                    z2 = true;
                }
                if (anonymousClass56 == null && 0 != 0) {
                    throw new NullPointerException(A04(540, 25, 76));
                }
                if (anonymousClass56 == null && (anonymousClass56 = A0H().A03(A03)) != null) {
                    anonymousClass56.A0Q();
                    boolean fromScrapOrHiddenOrCache7 = C0372Eb.A1C;
                    if (fromScrapOrHiddenOrCache7) {
                        A0A(anonymousClass56);
                    }
                }
                if (anonymousClass56 == null) {
                    long nanoTime = this.A08.getNanoTime();
                    if (j != Long.MAX_VALUE) {
                        boolean fromScrapOrHiddenOrCache8 = this.A01.A0B(A03, nanoTime, j);
                        if (!fromScrapOrHiddenOrCache8) {
                            String[] strArr = A0A;
                            if (strArr[7].charAt(8) != strArr[6].charAt(8)) {
                                A0A[4] = "fdYbLns5cH4Uqi6qZhk44zURNmgZymnf";
                                return null;
                            }
                            throw new RuntimeException();
                        }
                    }
                    anonymousClass56 = this.A08.A04.A05(this.A08, A03);
                    fromScrapOrHiddenOrCache = C0372Eb.A1E;
                    if (fromScrapOrHiddenOrCache && (A0H = C0372Eb.A0H(anonymousClass56.A0H)) != null) {
                        anonymousClass56.A09 = new WeakReference<>(A0H);
                    }
                    this.A01.A06(A03, this.A08.getNanoTime() - nanoTime);
                }
            }
            if (z2 && !this.A08.A0s.A07() && anonymousClass56.A0i(8192)) {
                anonymousClass56.A0U(0, 8192);
                if (this.A08.A0s.A0C) {
                    int changeFlags = AbstractC01514k.A00(anonymousClass56);
                    C01504j info = this.A08.A05.A09(this.A08.A0s, anonymousClass56, changeFlags | 4096, anonymousClass56.A0L());
                    this.A08.A1i(anonymousClass56, info);
                }
            }
            boolean z3 = false;
            if (this.A08.A0s.A07() && anonymousClass56.A0Y()) {
                anonymousClass56.A04 = i;
            } else {
                if (anonymousClass56.A0Y()) {
                    boolean A0e = anonymousClass56.A0e();
                    String[] strArr2 = A0A;
                    if (strArr2[7].charAt(8) != strArr2[6].charAt(8)) {
                        A0A[0] = "CFgmPUuP3iY97c6j";
                    }
                    throw new RuntimeException();
                }
                int A042 = this.A08.A00.A04(i);
                String[] strArr3 = A0A;
                if (strArr3[5].charAt(0) != strArr3[3].charAt(0)) {
                    String[] strArr4 = A0A;
                    strArr4[7] = "X7QTRdk7uAM61axx4OEln6Aqdeva9JgC";
                    strArr4[6] = "2m6xaCXVB1m17nX7qirmFmeuDGGSO6lD";
                    z3 = A0D(anonymousClass56, A042, i, j);
                }
                throw new RuntimeException();
            }
            View view = anonymousClass56.A0H;
            if (A0A[4].charAt(3) == 'b') {
                String[] strArr5 = A0A;
                strArr5[5] = "ymmTOXtQojU6rRVoJMbBfUBDtyf096Lh";
                strArr5[3] = "VCdUEMmmzbvfUZbBbNepcELfQrdDFyYX";
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    c01564p = (C01564p) this.A08.generateDefaultLayoutParams();
                    anonymousClass56.A0H.setLayoutParams(c01564p);
                } else if (!this.A08.checkLayoutParams(layoutParams)) {
                    ViewGroup.LayoutParams generateLayoutParams = this.A08.generateLayoutParams(layoutParams);
                    String[] strArr6 = A0A;
                    if (strArr6[2].charAt(0) == strArr6[1].charAt(0)) {
                        String[] strArr7 = A0A;
                        strArr7[2] = "kqh2PWeHxAL2DpvJL4iRMn0O7hIhaGbv";
                        strArr7[1] = "kmhB7ilmrFE2abkLd0sKBmmWm2mWDiPj";
                        c01564p = (C01564p) generateLayoutParams;
                        anonymousClass56.A0H.setLayoutParams(c01564p);
                    }
                } else {
                    c01564p = (C01564p) layoutParams;
                }
                c01564p.A00 = anonymousClass56;
                c01564p.A02 = z2 && z3;
                return anonymousClass56;
            }
            throw new RuntimeException();
        }
        throw new IndexOutOfBoundsException(A04(271, 22, 0) + i + A04(12, 1, 99) + i + A04(21, 14, 104) + this.A08.A0s.A03() + this.A08.A1H());
    }

    public final List<AnonymousClass56> A0J() {
        return this.A07;
    }

    public final void A0K() {
        int size = this.A06.size();
        for (int i = 0; i < size; i++) {
            this.A06.get(i).A0M();
        }
        int i2 = this.A05.size();
        for (int scrapCount = 0; scrapCount < i2; scrapCount++) {
            this.A05.get(scrapCount).A0M();
        }
        ArrayList<AnonymousClass56> arrayList = this.A02;
        String[] strArr = A0A;
        String str = strArr[2];
        String str2 = strArr[1];
        int scrapCount2 = str.charAt(0);
        int cachedCount = str2.charAt(0);
        if (scrapCount2 != cachedCount) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0A;
        strArr2[7] = "w7WcMXH384MQxArKBWq9tfOfmOANhXYh";
        strArr2[6] = "ji6HgViVTGyvfONq8Vqt8Uaju4D1iJHU";
        if (arrayList != null) {
            int changedScrapCount = arrayList.size();
            for (int scrapCount3 = 0; scrapCount3 < changedScrapCount; scrapCount3++) {
                this.A02.get(scrapCount3).A0M();
            }
        }
    }

    public final void A0L() {
        this.A05.clear();
        ArrayList<AnonymousClass56> arrayList = this.A02;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    public final void A0M() {
        int size = this.A06.size();
        for (int i = 0; i < size; i++) {
            C01564p c01564p = (C01564p) this.A06.get(i).A0H.getLayoutParams();
            if (c01564p != null) {
                c01564p.A01 = true;
            }
        }
    }

    public final void A0N() {
        if (this.A08.A04 != null && this.A08.A04.A0A()) {
            int size = this.A06.size();
            for (int i = 0; i < size; i++) {
                AnonymousClass56 anonymousClass56 = this.A06.get(i);
                int i2 = A0A[0].length();
                if (i2 != 16) {
                    throw new RuntimeException();
                }
                String[] strArr = A0A;
                strArr[2] = "kx9etu5Uswf3mlSSd54JM5SDJxoMGNTv";
                strArr[1] = "kxxNK4Rys8aPJuu822sP3fs8sDM7v1G0";
                if (anonymousClass56 != null) {
                    anonymousClass56.A0T(6);
                    anonymousClass56.A0W(null);
                }
            }
            return;
        }
        A06();
    }

    public final void A0O() {
        int extraCache;
        if (this.A08.A06 != null) {
            AbstractC01554o abstractC01554o = this.A08.A06;
            if (A0A[0].length() == 16) {
                String[] strArr = A0A;
                strArr[2] = "kSelswvDf1EbxUzrii1mBr6dHJR0d4zj";
                strArr[1] = "kcuGN1lunmBh6z5P1vsNJWvgiUTpOK0Q";
                extraCache = abstractC01554o.A00;
            }
            throw new RuntimeException();
        }
        extraCache = 0;
        this.A00 = this.A03 + extraCache;
        int extraCache2 = this.A06.size();
        for (int i = extraCache2 - 1; i >= 0; i--) {
            int size = this.A06.size();
            String[] strArr2 = A0A;
            String str = strArr2[2];
            String str2 = strArr2[1];
            int i2 = str.charAt(0);
            int extraCache3 = str2.charAt(0);
            if (i2 != extraCache3) {
                throw new RuntimeException();
            }
            String[] strArr3 = A0A;
            strArr3[2] = "kpxxdOz3cEfo3MLV8RPQuR2Jasv2n6jF";
            strArr3[1] = "kgO1H2GjmHeLX2ZusVi9gFRUJKE1zGI0";
            int extraCache4 = this.A00;
            if (size > extraCache4) {
                A07(i);
            } else {
                return;
            }
        }
    }

    public final void A0P() {
        this.A05.clear();
        A06();
    }

    public final void A0Q(int i) {
        this.A03 = i;
        A0O();
    }

    public final void A0R(View view) {
        AnonymousClass56 A0F = C0372Eb.A0F(view);
        A0F.A0F = null;
        A0F.A0G = false;
        A0F.A0O();
        A0X(A0F);
    }

    public final void A0S(View view) {
        AnonymousClass56 A0F = C0372Eb.A0F(view);
        if (A0F.A0i(12) || !A0F.A0d() || this.A08.A1w(A0F)) {
            boolean A0Z = A0F.A0Z();
            if (A0A[0].length() != 16) {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[5] = "cscHAR4ImnAFzAxZJ9yqjMNa91RcN8Vb";
            strArr[3] = "pspTzLDNU823NSI2ymIgIumCpfqVQlal";
            if (!A0Z || A0F.A0a() || this.A08.A04.A0A()) {
                A0F.A0V(this, false);
                this.A05.add(A0F);
                return;
            }
            throw new IllegalArgumentException(A04(43, 122, 32) + this.A08.A1H());
        }
        if (this.A02 == null) {
            this.A02 = new ArrayList<>();
        }
        A0F.A0V(this, true);
        this.A02.add(A0F);
    }

    public final void A0T(View view) {
        AnonymousClass56 A0F = C0372Eb.A0F(view);
        if (A0F.A0c()) {
            this.A08.removeDetachedView(view, false);
        }
        if (A0F.A0b()) {
            A0F.A0S();
        } else if (A0F.A0g()) {
            A0F.A0O();
        }
        A0X(A0F);
    }

    public final void A0U(AbstractC01434c abstractC01434c, AbstractC01434c abstractC01434c2, boolean z) {
        A0P();
        A0H().A08(abstractC01434c, abstractC01434c2, z);
    }

    public final void A0V(C4v c4v) {
        C4v c4v2 = this.A01;
        if (c4v2 != null) {
            c4v2.A04();
        }
        this.A01 = c4v;
        if (c4v != null) {
            c4v.A07(this.A08.getAdapter());
        }
    }

    public final void A0W(AnonymousClass54 anonymousClass54) {
        this.A04 = anonymousClass54;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a4, code lost:
    
        if (r0 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c2, code lost:
    
        if (r5 > 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c4, code lost:
    
        r0 = r10.A0i(526);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ca, code lost:
    
        if (r0 != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cc, code lost:
    
        r2 = r9.A06.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d4, code lost:
    
        if (r2 < r9.A00) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d6, code lost:
    
        if (r2 <= 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d8, code lost:
    
        A07(0);
        r2 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00dd, code lost:
    
        r0 = com.meta.analytics.dsp.uinode.C0372Eb.A1E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e1, code lost:
    
        if (r0 == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e3, code lost:
    
        if (r2 <= 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e5, code lost:
    
        r0 = r9.A08.A02.A05(r10.A03);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ef, code lost:
    
        if (r0 != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f1, code lost:
    
        r2 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f3, code lost:
    
        if (r2 < 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f5, code lost:
    
        r1 = r9.A06.get(r2).A03;
        r0 = r9.A08.A02.A05(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0107, code lost:
    
        if (r0 != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0128, code lost:
    
        r2 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0109, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010b, code lost:
    
        r9.A06.add(r2, r10);
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0111, code lost:
    
        if (r7 != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0113, code lost:
    
        A0Z(r10, true);
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0132, code lost:
    
        if (r5 > 0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0X(AnonymousClass56 anonymousClass56) {
        boolean A092;
        boolean transientStatePreventsRecycling;
        boolean z;
        String[] strArr;
        if (anonymousClass56.A0b() || anonymousClass56.A0H.getParent() != null) {
            throw new IllegalArgumentException(A04(293, 56, 52) + anonymousClass56.A0b() + A04(0, 12, 75) + (anonymousClass56.A0H.getParent() != null) + this.A08.A1H());
        }
        boolean A0c = anonymousClass56.A0c();
        String[] strArr2 = A0A;
        if (strArr2[2].charAt(0) != strArr2[1].charAt(0)) {
            throw new RuntimeException();
        }
        A0A[4] = "QZZbfikyhDCMiV1imXgamooHNWBI4VfH";
        if (!A0c) {
            if (anonymousClass56.A0f()) {
                throw new IllegalArgumentException(A04(430, 110, 12) + this.A08.A1H());
            }
            A092 = anonymousClass56.A09();
            if (this.A08.A04 != null && A092) {
                boolean transientStatePreventsRecycling2 = this.A08.A04.A0B(anonymousClass56);
                if (transientStatePreventsRecycling2) {
                    transientStatePreventsRecycling = true;
                    z = false;
                    boolean z2 = false;
                    if (!transientStatePreventsRecycling) {
                        boolean transientStatePreventsRecycling3 = anonymousClass56.A0h();
                    }
                    int i = this.A00;
                    strArr = A0A;
                    if (strArr[2].charAt(0) == strArr[1].charAt(0)) {
                        A0A[4] = "JXkbPmQXP2BcwiEI3FqqjfiGok6rwhAB";
                    } else {
                        A0A[4] = "iMRb6lH7bzEtCSJD4TfZYArDATXy6kqw";
                    }
                    this.A08.A0t.A0B(anonymousClass56);
                    if (z && !z2 && A092) {
                        anonymousClass56.A08 = null;
                        return;
                    }
                    return;
                }
            }
            transientStatePreventsRecycling = false;
            z = false;
            boolean z22 = false;
            if (!transientStatePreventsRecycling) {
            }
            int i2 = this.A00;
            strArr = A0A;
            if (strArr[2].charAt(0) == strArr[1].charAt(0)) {
            }
            this.A08.A0t.A0B(anonymousClass56);
            if (z) {
                return;
            } else {
                return;
            }
        }
        throw new IllegalArgumentException(A04(349, 81, 79) + anonymousClass56 + this.A08.A1H());
    }

    public final void A0Y(AnonymousClass56 anonymousClass56) {
        boolean z;
        z = anonymousClass56.A0G;
        if (z) {
            this.A02.remove(anonymousClass56);
        } else {
            this.A05.remove(anonymousClass56);
        }
        anonymousClass56.A0F = null;
        anonymousClass56.A0G = false;
        anonymousClass56.A0O();
    }

    public final void A0Z(AnonymousClass56 anonymousClass56, boolean z) {
        C0372Eb.A0s(anonymousClass56);
        if (anonymousClass56.A0i(16384)) {
            anonymousClass56.A0U(0, 16384);
            C3T.A0B(anonymousClass56.A0H, null);
        }
        if (z) {
            A0B(anonymousClass56);
        }
        anonymousClass56.A08 = null;
        A0H().A09(anonymousClass56);
    }
}
