package com.meta.analytics.dsp.uinode;

import android.os.Build;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.io.encoding.Base64;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class PB {
    public static byte[] A0K;
    public static final AtomicInteger A0L;
    public static final AtomicInteger A0M;
    public P0 A02;
    public P9 A03;
    public PA A04;
    public RE A05;
    public final int A08;
    public final AbstractC0992b5 A09;
    public final C01946c A0A;
    public final C0889Yn A0B;
    public final J2 A0C;
    public final JA A0D;
    public final C0644Oy A0E;
    public final TE A0F;
    public final PM A0G;
    public final PN A0H;
    public final String A0I;
    public final LinkedList<P8> A0J = new LinkedList<>();
    public C0548Lg A01 = new C0548Lg();
    public boolean A07 = true;
    public boolean A06 = false;
    public long A00 = -1;

    public static String A0A(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0K, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 2);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0K = new byte[]{37, 63, 39, 56, 62, 39, 57, Ascii.CR, 34, 40, 62, 35, 37, 40, 5, 34, 56, 41, 62, 42, 45, 47, 41, 5, 0, 54, 1, Ascii.DC4, Ascii.VT, Ascii.SYN, 16, Ascii.CR, 10, 3, 34, Ascii.CR, 10, Ascii.CR, Ascii.ETB, Ascii.FF, 1, 0, 76, 67, 65, Ascii.ETB, 67, 77, 95, 96, 101, 83, 100, 113, 110, 115, 117, 104, 111, 102, 82, 117, 96, 115, 117, 100, 101, 41, 38, 36, 114, 38, 40, 58, 34, 55, 55, 34, 32, 43, 38, 39, Ascii.DC4, Ascii.NAK, Ascii.CR, 54, 46, 10, 9, Ascii.FS, Ascii.VT, 0, Ascii.CR, Ascii.FF, 46, Ascii.SUB, 9, 5, Ascii.CR, 44, 9, Ascii.FS, 9, 84, 66, 69, 69, 82, 89, 67, 96, 97, 121, 66, 90, 48, 36, 55, 59, 51, 37, 120, 121, 86, 116, 99, 126, 97, 126, 99, 110, 71, 118, 98, 100, 114, 115, 63, 48, 50, 100, 48, 62, 44, 36, 37, 10, 40, 63, 34, Base64.padSymbol, 34, 63, 50, Ascii.EM, 46, 56, 62, 38, 46, 47, 99, 108, 110, 56, 108, 98, 112, 83, 82, Byte.MAX_VALUE, 80, 83, 79, 89, 122, 73, 80, 80, 79, 95, 78, 89, 89, 82, 106, 85, 89, 75, Ascii.DC4, Ascii.ESC, Ascii.EM, 79, Ascii.ESC, Ascii.NAK, 67, 66, 106, 89, 64, 64, 95, 79, 94, 73, 73, 66, 122, 69, 73, 91, 4, Ascii.VT, 9, 95, Ascii.VT, 5, 72, 73, 113, 70, 75, 82, 66, 117, 66, 70, 67, Ascii.SI, 0, 2, 84, 0, Ascii.VT, 7, 0, 2, 84, 0, Ascii.VT, 7, 0, 2, 84, 0, Ascii.SO, Ascii.FS, 120, 121, 65, 118, 123, 98, 114, 64, 101, 126, 99, 99, 114, 121, 63, 48, 50, 100, 48, 59, 55, 48, 50, 100, 48, 62, 44, 106, 124, 122, 118, 119, 125, 70, 122, 113, 120, 119, 119, 124, 117, Ascii.DC4, 2, 19, 38, Ascii.DC2, 19, Ascii.SI, 44, 2, Ascii.RS, 79, 64, 66, Ascii.DC4, 64, 75, 64, 66, Ascii.DC4, 64, 78, 92, 77, 91, 74, 124, 95, 77, 91, 8, 10, Byte.MAX_VALUE, 77, 77, 91, 74, 77, Ascii.SYN, Ascii.EM, Ascii.ESC, 77, Ascii.EM, Ascii.DC2, Ascii.EM, Ascii.ESC, 77, Ascii.EM, Ascii.ETB, 2, Ascii.DC4, 5, 51, 16, 2, Ascii.DC4, 71, 69, 50, Ascii.RS, Ascii.US, Ascii.ETB, Ascii.CAN, Ascii.SYN, 89, 86, 84, 2, 86, 93, 86, 84, 2, 86, 88, 57, 34, 57, 44, 33, Ascii.SUB, Ascii.ESC, 3, 56, 32, 38, 33, 63, Ascii.GS, 2, Ascii.SI, Ascii.SO, 4, 46, Ascii.GS, Ascii.SO, 5, Ascii.US, 67, 76, 78, Ascii.CAN, 76, 71, 75, 76, 78, Ascii.CAN, 76, 71, 75, 76, 78, Ascii.CAN, 76, 66, 80, Ascii.SO, 17, Ascii.GS, Ascii.SI, 42, Ascii.GS, Ascii.EM, Ascii.FS, 1, 44, Ascii.ETB, 43, 16, Ascii.ETB, Ascii.SI, 80, 95, 93, Ascii.VT, 95, 81, 67};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 21 out of bounds for length 21
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final void A0i(Map<String, String> map) {
        String A0A = A0A(87, 16, 106);
        if (map.containsKey(A0A) && C0478Ih.A1X(this.A0B)) {
            try {
                JSONArray jSONArray = new JSONArray(map.get(A0A));
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONArray jSONArray2 = new JSONArray(jSONArray.getString(i));
                    String string = jSONArray2.getString(0);
                    String string2 = jSONArray2.getString(1);
                    String string3 = jSONArray2.getString(2);
                    String string4 = jSONArray2.getString(3);
                    if (string != null && string2 != null && string3 != null) {
                        SZ sz = new SZ(this.A09.A12(), Long.parseLong(string), Long.parseLong(string2), Long.parseLong(string3));
                        sz.A06(Long.parseLong(string4));
                        arrayList.add(sz);
                    }
                }
                String A04 = SY.A04(arrayList);
                HashMap hashMap = new HashMap();
                hashMap.put(A0A(115, 6, 84), A04);
                if (A04 != null) {
                    this.A0C.AA1(this.A09.A12(), hashMap);
                }
            } catch (Exception e) {
                this.A0B.A07().A9a(A0A(274, 14, 27), 3600, new C8B(e));
            }
        }
        if (map.containsKey(A0A)) {
            map.remove(A0A);
        }
        this.A0C.A9Z(this.A09.A12(), new C0602Ni(map).A03(this.A05).A05());
    }

    static {
        A0D();
        A0M = new AtomicInteger();
        A0L = new AtomicInteger();
    }

    public PB(C0889Yn c0889Yn, AbstractC0992b5 abstractC0992b5, J2 j2, int i) {
        this.A0B = c0889Yn;
        this.A0C = j2;
        this.A09 = abstractC0992b5;
        this.A08 = i;
        this.A0F = new TE(this, c0889Yn);
        C01946c c01946c = new C01946c(c0889Yn);
        this.A0A = c01946c;
        JA ja = new JA(abstractC0992b5.A12(), j2);
        this.A0D = ja;
        C0644Oy c0644Oy = new C0644Oy(abstractC0992b5.A0S(), abstractC0992b5.A0x().A0D().A08(), i);
        this.A0E = c0644Oy;
        String uuid = UUID.randomUUID().toString();
        this.A0I = uuid;
        this.A0H = PO.A00(c0889Yn, abstractC0992b5.A0V(), c01946c, ja, c0644Oy, A0H());
        this.A0G = new PM(c0889Yn, this, j2, c0644Oy, uuid, abstractC0992b5.A12());
    }

    public static AtomicInteger A0B() {
        return A0L;
    }

    private void A0C() {
        A0F(new P8(A0A(288, 22, 101), new String[]{this.A0I, A0A(1, 6, 11)}));
        String assets = android.util.Base64.encodeToString(this.A0H.A04.toString().getBytes(), 0).replace(A0A(0, 1, 45), A0A(0, 0, 109));
        String assets2 = this.A0I;
        A0F(new P8(A0A(310, 26, 60), new String[]{assets, assets2}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A0E() {
        if (this.A06) {
            while (!this.A0J.isEmpty()) {
                P8 poll = this.A0J.poll();
                if (poll != null) {
                    this.A0F.A05(String.format(Locale.US, poll.A00, poll.A02));
                    if (poll.A01) {
                        this.A0D.A04(J9.A0L, null);
                        this.A0B.A0E().A5G(poll.A00);
                    }
                }
            }
        }
    }

    private synchronized void A0F(P8 p8) {
        this.A0J.offer(p8);
        A0E();
    }

    private boolean A0H() {
        return !A0I();
    }

    private boolean A0I() {
        return C0478Ih.A2R(this.A0B, C0694Qw.A03());
    }

    public final JA A0K() {
        return this.A0D;
    }

    public final C0548Lg A0L() {
        return this.A01;
    }

    public final C0644Oy A0M() {
        return this.A0E;
    }

    public final P0 A0N() {
        return this.A02;
    }

    public final TE A0O() {
        return this.A0F;
    }

    public final void A0P() {
        A0F(new P8(A0A(23, 26, 102), new String[]{this.A0I}));
    }

    public final void A0Q() {
        A0F(new P8(A0A(49, 25, 3), new String[]{this.A0I}));
    }

    public final void A0R() {
        this.A07 = true;
    }

    public final void A0S() {
        this.A07 = false;
    }

    public final void A0T() {
        A0F(new P8(A0A(121, 23, 21), new String[]{this.A0I}));
    }

    public final void A0U() {
        A0F(new P8(A0A(Opcodes.JSR, 27, 62), new String[]{this.A0I}));
    }

    public final void A0V() {
        A0F(new P8(A0A(Opcodes.MONITOREXIT, 22, 46), new String[]{this.A0I}));
    }

    public final void A0W() {
        A0F(new P8(A0A(404, 22, 122), new String[]{this.A0I}));
    }

    public final void A0X() {
        if (Build.VERSION.SDK_INT > 16) {
            this.A0F.addJavascriptInterface(this.A0G, A0A(7, 16, 78));
        }
        this.A0D.A04(J9.A0O, null);
        String str = this.A0H.A00;
        this.A0F.loadUrl(str);
        this.A00 = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        try {
            String url = A0A(372, 3, 81);
            jSONObject.put(url, str);
            String url2 = A0A(103, 12, 53);
            jSONObject.put(url2, PC.A00());
            String url3 = A0A(362, 10, 79);
            jSONObject.put(url3, A0M.getAndIncrement());
            String url4 = A0A(74, 13, 65);
            jSONObject.put(url4, A0L);
        } catch (JSONException unused) {
        }
        this.A0B.A0E().A5M(jSONObject.toString());
        A0C();
    }

    public final void A0Y() {
        A0F(new P8(A0A(Opcodes.D2F, 24, 73), new String[]{this.A0I}));
    }

    public final void A0Z(C0548Lg c0548Lg) {
        this.A01 = c0548Lg;
    }

    public final void A0a(P0 p0) {
        this.A02 = p0;
    }

    public final void A0b(P9 p9) {
        this.A03 = p9;
    }

    public final void A0c(PA pa) {
        this.A04 = pa;
    }

    public final void A0d(TD td) {
        this.A0G.A0N(td);
    }

    public final void A0e(RE re) {
        this.A05 = re;
    }

    public final void A0f(String str) {
        A0F(new P8(A0A(247, 27, 21), new String[]{this.A0I, str}));
    }

    public final void A0g(String str, String str2) {
        A0F(new P8(A0A(217, 30, 37), new String[]{this.A0I, str, str2}));
    }

    public final void A0h(String str, JSONObject jSONObject) {
        A0F(new P8(A0A(375, 29, 105), new String[]{this.A0I, str, jSONObject.toString()}, false));
    }

    public final void A0j(JSONObject jSONObject) {
        String replace = android.util.Base64.encodeToString(jSONObject.toString().getBytes(), 0).replace(A0A(0, 1, 45), A0A(0, 0, 109));
        String assets = this.A0I;
        A0F(new P8(A0A(336, 26, 115), new String[]{replace, assets}));
    }

    public final boolean A0k() {
        return this.A0G.A0O();
    }

    public final boolean A0l() {
        return this.A07;
    }
}
