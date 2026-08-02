package com.meta.analytics.dsp.uinode;

import android.content.Intent;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.1i, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C00721i {
    public static byte[] A05;
    public static String[] A06 = {"jJreqFAWfQsm2UlBXjWleQZy51A8w9r3", "B5vxrqY9e1pfFDILbPSJEQZe5Zep9JAF", "7hwRhDIA2xM98ucsNVPICP0872", "8yYdfjKxcW1uK5E8nS4F9bT", "cwoTvwLLOWGZrFwonmn2qn9xu", "wuc4L", "VoE60CbUCih", "1JGxuEjawtyxaKItdz1AQ1lnM"};
    public C01946c A00;
    public EnumC0606Nm A01 = EnumC0606Nm.A06;
    public ArrayList<PB> A02 = new ArrayList<>();
    public final C1F A03;
    public final InterfaceC00711h A04;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 96);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{-97, -39, -27, -34, -35, -81, -44, -38, -53, -40, -44, -57, -46, -122, -85, -40, -40, -43, -40, -122, -104, -106, -106, -100, -122, -35, -49, -38, -50, -43, -37, -38, -122, -57, -122, -36, -57, -46, -49, -54, -122, -89, -54, -81, -44, -52, -43, -108, Ascii.US, 34, Ascii.GS, 34, Ascii.US, 50, Ascii.US, Ascii.GS, 32, 51, 44, 34, 42, 35, -45, -30, -37, -59, -54, -61, -53, -48, -63, -46, -61, -44, -61, -49, -43, -42, -37, -44, -36, -31, -40, -41, -76, -41, -73, -44, -25, -44, -75, -24, -31, -41, -33, -40, -38, -33, -27, -42, -29, -28, -27, -38, -27, -38, -46, -35};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final void A0J(C0889Yn c0889Yn, EnumSet<CacheFlag> enumSet) {
        if (A0E() == KB.A04) {
            C0990b3 c0990b3 = (C0990b3) this.A03;
            AbstractC0992b5 A0u = c0990b3.A0u();
            if (A0C(c0889Yn, A0u) || A0u == null) {
                return;
            }
            this.A04.AES();
            A0A(c0889Yn, enumSet, c0990b3, A0u, 0, this.A04);
            return;
        }
        if (A0C(c0889Yn, (AbstractC0992b5) this.A03)) {
            return;
        }
        this.A04.AES();
        if (A0E() == KB.A0C) {
            A08(c0889Yn, (FU) this.A03);
        } else {
            A09(c0889Yn, enumSet, (FU) this.A03, -1, this.A04);
        }
    }

    static {
        A06();
    }

    public C00721i(C0889Yn c0889Yn, C00851v c00851v, InterfaceC00711h interfaceC00711h, String str) {
        JSONObject dataObject = c00851v.A03();
        this.A03 = A01(c0889Yn, c00851v, str, dataObject);
        this.A04 = interfaceC00711h;
    }

    private AdError A00(C0889Yn c0889Yn, AbstractC0992b5 abstractC0992b5) {
        if (abstractC0992b5 == null || abstractC0992b5.A14().isEmpty()) {
            c0889Yn.A07().A9a(A04(62, 3, 18), C8A.A0Z, new C8B(A04(5, 43, 6)));
            return AdError.internalError(AdError.INTERNAL_ERROR_2006);
        }
        return null;
    }

    public static C1F A01(C0889Yn c0889Yn, C00851v c00851v, String str, JSONObject jSONObject) {
        C1F c1f = null;
        if (jSONObject.has(A04(65, 12, 2))) {
            try {
                c1f = C0990b3.A03(jSONObject, c0889Yn, true);
                c1f.A0e(true);
                c1f.A0b(A04(96, 12, 17));
            } catch (JSONException unused) {
            }
        }
        if (c1f == null) {
            c1f = FU.A02(jSONObject, c0889Yn);
        }
        c1f.A0a(str);
        C8T A01 = c00851v.A01();
        if (A01 != null) {
            c1f.A0W(A01.A06());
        }
        return c1f;
    }

    private C01946c A03(C0889Yn c0889Yn) {
        C01946c c01946c = this.A00;
        return c01946c != null ? c01946c : new C01946c(c0889Yn);
    }

    private void A08(C0889Yn c0889Yn, FU fu) {
        C00661c playableData = fu.A0x().A0D().A06();
        A0B(playableData != null ? playableData.A0A() : EnumC0606Nm.A06);
        C0981au c0981au = new C0981au(this);
        C01946c c01946c = new C01946c(c0889Yn);
        boolean z = C0478Ih.A1n(c0889Yn) && AnonymousClass62.A0A(fu.A0V());
        if (z) {
            AnonymousClass62 unifiedAssetsLoader = new AnonymousClass62(c01946c, fu.A0V(), fu.A0P(), fu.A0S(), z, new C0980at(this));
            c01946c.A0d(new JA(fu.A12(), c0889Yn.A09()));
            unifiedAssetsLoader.A0B();
            return;
        }
        AbstractC00821s.A02(c0889Yn, fu, true, c0981au);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0092, code lost:
    
        if (r21 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0094, code lost:
    
        r8 = new com.meta.analytics.dsp.uinode.C6Y(r27.A0M(), r27.A0S(), r1);
        r8.A04 = true;
        r8.A03 = A04(0, 5, 17);
        r13.A0X(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b0, code lost:
    
        r13.A0c(new com.meta.analytics.dsp.uinode.C01926a(r27.A10().A01(), com.meta.analytics.dsp.uinode.C0660Po.A04, com.meta.analytics.dsp.uinode.C0660Po.A04, r27.A0S(), A04(96, 12, 17)));
        r12 = r26.contains(com.facebook.ads.CacheFlag.VIDEO);
        r11 = 0;
        r10 = com.meta.analytics.dsp.uinode.C0478Ih.A2R(r25, com.meta.analytics.dsp.uinode.C0694Qw.A03());
        r9 = r27.A14().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ef, code lost:
    
        if (r9.hasNext() == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00f1, code lost:
    
        r0 = r9.next();
        r14 = new com.meta.analytics.dsp.uinode.C01926a(r0.A0D().A07(), com.meta.analytics.dsp.uinode.AbstractC00781o.A00(r0.A0D()), com.meta.analytics.dsp.uinode.AbstractC00781o.A01(r0.A0D()), r27.A0S(), A04(96, 12, 17));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0122, code lost:
    
        if (r11 != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0124, code lost:
    
        r13.A0b(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0127, code lost:
    
        r8 = r0.A0G().A01();
        r7 = com.meta.analytics.dsp.uinode.C00721i.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x013f, code lost:
    
        if (r7[6].length() == r7[2].length()) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0141, code lost:
    
        r7 = com.meta.analytics.dsp.uinode.C00721i.A06;
        r7[1] = "D8Za7DAeUKhUMlH0nChh1nyf5MUepOev";
        r7[0] = "YMJugZMvnGL61TcEtQKO8oN05ixDNSHw";
        r5 = r8.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0151, code lost:
    
        r6 = r5.hasNext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0155, code lost:
    
        if (r6 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0157, code lost:
    
        r13.A0c(new com.meta.analytics.dsp.uinode.C01926a(r5.next(), -1, -1, r27.A0S(), A04(96, 12, 17)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0178, code lost:
    
        if (r12 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0186, code lost:
    
        if (android.text.TextUtils.isEmpty(r0.A0D().A08()) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0188, code lost:
    
        r14 = new com.meta.analytics.dsp.uinode.C6Y(r0.A0D().A08(), r27.A0S(), A04(96, 12, 17), r0.A0D().A05());
        r14.A04 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01ad, code lost:
    
        if (r11 != 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01af, code lost:
    
        if (r21 == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01b1, code lost:
    
        if (r10 != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01b3, code lost:
    
        r13.A0X(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01b6, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01ba, code lost:
    
        r13.A0a(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01be, code lost:
    
        if (r21 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01c0, code lost:
    
        if (r10 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01c2, code lost:
    
        r13.A0Y(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01c6, code lost:
    
        r13.A0Z(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01ca, code lost:
    
        r5 = r8.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01cf, code lost:
    
        r13.A0c(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01e4, code lost:
    
        r13.A0W(new com.meta.analytics.dsp.uinode.C0982av(r24, r25, r21, r27, r29), new com.meta.analytics.dsp.uinode.C6V(r27.A0S(), r1, r28));
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01e0, code lost:
    
        if (r21 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A09(C0889Yn c0889Yn, EnumSet<CacheFlag> enumSet, AbstractC0992b5 abstractC0992b5, int i, InterfaceC00711h interfaceC00711h) {
        boolean A0m = abstractC0992b5.A0m();
        C01946c A03 = A03(c0889Yn);
        A03.A0d(new JA(abstractC0992b5.A12(), c0889Yn.A09()));
        boolean z = C0478Ih.A1n(c0889Yn) && AnonymousClass62.A0A(abstractC0992b5.A0V());
        if (A06[3].length() == 32) {
            throw new RuntimeException();
        }
        A06[5] = "QkQhg";
        if (z) {
            new AnonymousClass62(A03, abstractC0992b5.A0V(), abstractC0992b5.A0P(), abstractC0992b5.A0S(), z, new C0984ax(this, c0889Yn, A0m, abstractC0992b5, interfaceC00711h)).A0B();
            return;
        }
        String A04 = A04(96, 12, 17);
        String[] strArr = A06;
        if (strArr[1].charAt(24) != strArr[0].charAt(24)) {
            String[] strArr2 = A06;
            strArr2[1] = "jVhVjw8PHVLop7GyU0UYPYiA56KfUjA6";
            strArr2[0] = "lzrrt2iICm45JkiVqVLOf6p257fg56KP";
        } else {
            String[] strArr3 = A06;
            strArr3[7] = "mMtIDEEqjJJ695eeXDndb9bWh";
            strArr3[4] = "Ebj8lqyUqzLrB8iZ5jF9tO70n";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A(C0889Yn c0889Yn, EnumSet<CacheFlag> enumSet, C0990b3 c0990b3, AbstractC0992b5 abstractC0992b5, int i, InterfaceC00711h interfaceC00711h) {
        A09(c0889Yn, enumSet, abstractC0992b5, i, new C0986az(this, c0889Yn, abstractC0992b5, c0990b3, i, interfaceC00711h, enumSet));
    }

    private void A0B(EnumC0606Nm enumC0606Nm) {
        this.A01 = enumC0606Nm;
    }

    private boolean A0C(C0889Yn c0889Yn, AbstractC0992b5 abstractC0992b5) {
        AdError A00 = A00(c0889Yn, abstractC0992b5);
        if (A00 != null) {
            InterfaceC00711h interfaceC00711h = this.A04;
            String[] strArr = A06;
            if (strArr[1].charAt(24) != strArr[0].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[1] = "Dm6wm58uJ8qXwjtNx8Vtzbsb5Jkw9mit";
            strArr2[0] = "fLwuuFNg4tiwPdo6hP9t6x3v5l5Hcavg";
            interfaceC00711h.AAe(A00);
            return true;
        }
        return false;
    }

    public final C1F A0D() {
        return this.A03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ab, code lost:
    
        if (r3 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00af, code lost:
    
        return com.meta.analytics.dsp.uinode.KB.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bc, code lost:
    
        return com.meta.analytics.dsp.uinode.KB.A0B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b7, code lost:
    
        if (r3 != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final KB A0E() {
        if (this.A03.A0j()) {
            return KB.A04;
        }
        AbstractC0992b5 abstractC0992b5 = (AbstractC0992b5) this.A03;
        String[] strArr = A06;
        if (strArr[6].length() != strArr[2].length()) {
            A06[3] = "f4kXngrP8CD5dz";
            if (abstractC0992b5.A0m()) {
                return KB.A06;
            }
            if (abstractC0992b5.A14().size() > 1) {
                KB kb = KB.A0A;
                String[] strArr2 = A06;
                if (strArr2[7].length() == strArr2[4].length()) {
                    A06[3] = "ny";
                    return kb;
                }
            } else {
                if (abstractC0992b5.A0x().A0D().A06() != null) {
                    KB kb2 = KB.A0C;
                    String[] strArr3 = A06;
                    if (strArr3[6].length() == strArr3[2].length()) {
                        throw new RuntimeException();
                    }
                    A06[3] = "JH";
                    return kb2;
                }
                boolean A0L = A0L(abstractC0992b5);
                if (A06[3].length() != 32) {
                    String[] strArr4 = A06;
                    strArr4[1] = "93R6MUXHMTxUt8WfLt1oZ3ea5zubl3sl";
                    strArr4[0] = "9xXPI1nVQC4CSUB4soKlPH985bh9DAt9";
                } else {
                    A06[3] = "ySAy4b6nQ";
                }
            }
        }
        throw new RuntimeException();
    }

    public final EnumC0606Nm A0F() {
        return this.A01;
    }

    public final String A0G() {
        if (this.A03.A0j()) {
            return ((C0990b3) this.A03).A0y();
        }
        return ((AbstractC0992b5) this.A03).A12();
    }

    public final void A0H() {
        this.A04.AGm();
    }

    public final void A0I(Intent intent, RewardData rewardData, String str) {
        this.A03.A0Y(rewardData);
        this.A03.A0c(str);
        if (A0D().A0j()) {
            intent.putExtra(A04(77, 19, 19), this.A03);
        }
        intent.putExtra(A04(48, 14, 94), this.A03);
    }

    public final boolean A0K() {
        return this.A03.A0g();
    }

    public final boolean A0L(AbstractC0992b5 abstractC0992b5) {
        return !TextUtils.isEmpty(abstractC0992b5.A0x().A0D().A08());
    }
}
