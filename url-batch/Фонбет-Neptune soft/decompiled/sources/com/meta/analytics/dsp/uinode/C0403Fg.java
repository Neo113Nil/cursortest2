package com.meta.analytics.dsp.uinode;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Fg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0403Fg extends AbstractC1022bZ {
    public static byte[] A04;
    public static String[] A05 = {"eZwrQOnpnpQE2xbRo0zNjy7tlobdqdqH", "SFt7WwZUn", "NjRPf9lXQVcUlHZaPZ2tHyzwDKEOZm5m", "vsw9aGbGyLBdbL44W3z8tEYPUFR7w9", "bZApvv", "GYK1wV", "jBSwIULngy0dc0IzE6SbgF9ev3BAFzHy", "9HFC3JFq8"};
    public static final String A06;
    public OG A00;
    public final Uri A01;
    public final C1U A02;
    public final Map<String, String> A03;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = (copyOfRange[i4] - i3) - 27;
            String[] strArr = A05;
            if (strArr[6].charAt(23) == strArr[0].charAt(23)) {
                throw new RuntimeException();
            }
            A05[3] = "uqLwDcTKX4SWJds2FMBMp5QNw2MnWtU";
            copyOfRange[i4] = (byte) i5;
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private final List<Intent> A06() {
        List<C00510m> A052 = A05();
        ArrayList arrayList = new ArrayList();
        if (A052 != null) {
            Iterator<C00510m> it = A052.iterator();
            while (it.hasNext()) {
                Intent A00 = A00(it.next());
                if (A00 != null) {
                    arrayList.add(A00);
                }
            }
        }
        return arrayList;
    }

    public static void A07() {
        A04 = new byte[]{106, -105, -105, -108, -105, 69, -107, -122, -105, -104, -114, -109, -116, 69, -122, -107, -107, -104, -114, -103, -118, -124, -119, -122, -103, -122, -124, -97, -89, -86, -93, -94, 94, -78, -83, 94, -83, -82, -93, -84, 94, -85, -97, -80, -87, -93, -78, 94, -77, -80, -86, 120, 94, -29, -27, -5, 8, -2, Ascii.FF, 9, 3, -2, -108, -95, -105, -91, -94, -100, -105, 97, -100, -95, -89, -104, -95, -89, 97, -108, -106, -89, -100, -94, -95, 97, 119, 124, 116, Byte.MAX_VALUE, -94, -81, -91, -77, -80, -86, -91, 111, -86, -81, -75, -90, -81, -75, 111, -94, -92, -75, -86, -80, -81, 111, -105, -118, -122, -104, -8, 7, 7, 10, 0, Ascii.VT, -4, -10, -5, -8, Ascii.VT, -8, -3, -15, 2, -5, -11, 4, -54, -65, -65, -12, -11, 4, -15, -7, -4, 3, -49, -7, -12, -51, -75, 3, -26, -25, -36, -27, -36, -37, -42, -37, -36, -36, -25, -29, -32, -27, -30, -108, -107, -118, -109, -118, -119, -124, -104, -103, -108, -105, -118, -124, -117, -122, -111, -111, -121, -122, -120, -112, -124, -102, -105, -111, -38, -37, -48, -39, -48, -49, -54, -34, -33, -38, -35, -48, -54, -32, -35, -41, -70, -85, -68, -67, -77, -72, -79, -51, -50, -55, -52, -65, -71, -61, -66, -10, -9, -14, -11, -24, -30, -8, -11, -17, -96, -95, -100, -97, -110, -116, -94, -97, -103, -116, -92, -110, -113, -116, -109, -114, -103, -103, -113, -114, -112, -104, -90, -105, -98, 108, -72, -87, -80, -76, -74, -77, -79, -76, -72, 126, -61, -63, -77, -64, -83, -80, -61, -76, -76, -77, -64, -77, -78, -83, -60, -73, -78, -77, -67, -83, -79, -70, -73, -79, -71};
    }

    static {
        A07();
        A06 = C0403Fg.class.getSimpleName();
    }

    public C0403Fg(C0889Yn c0889Yn, J2 j2, String str, Uri uri, Map<String, String> extraData, C00520o c00520o, boolean z, C1U c1u) {
        super(c0889Yn, j2, str, c00520o, z);
        this.A01 = uri;
        this.A03 = extraData;
        this.A02 = c1u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        if (r4.startsWith(r0) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Intent A00(C00510m c00510m) {
        if (TextUtils.isEmpty(c00510m.A05())) {
            return null;
        }
        String A03 = c00510m.A03();
        C0889Yn c0889Yn = ((AbstractC00460h) this).A00;
        String appLinkUri = c00510m.A05();
        if (!LM.A04(c0889Yn, appLinkUri) && !A09(((AbstractC00460h) this).A00, A03)) {
            return null;
        }
        if (!TextUtils.isEmpty(A03)) {
            String appLinkUri2 = A04(250, 4, 23);
            if (!A03.startsWith(appLinkUri2)) {
                String appLinkUri3 = A04(254, 10, 41);
            }
            return new Intent(A04(62, 26, 24), AbstractC0540Ky.A00(A03));
        }
        PackageManager packageManager = ((AbstractC00460h) this).A00.getPackageManager();
        if (packageManager == null) {
            return null;
        }
        String appLinkUri4 = c00510m.A04();
        if (TextUtils.isEmpty(appLinkUri4) && TextUtils.isEmpty(A03)) {
            String appLinkUri5 = c00510m.A05();
            return packageManager.getLaunchIntentForPackage(appLinkUri5);
        }
        Intent unresolvedAppIntent = A01(c00510m);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(unresolvedAppIntent, 65536);
        if (unresolvedAppIntent.getComponent() == null) {
            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                String[] strArr = A05;
                String str = strArr[5];
                String appLinkUri6 = strArr[4];
                if (str.length() == appLinkUri6.length()) {
                    String[] strArr2 = A05;
                    strArr2[7] = "mdy3DwQER";
                    strArr2[1] = "z4eGZXaiq";
                    if (!hasNext) {
                        break;
                    }
                    ResolveInfo next = it.next();
                    String str2 = next.activityInfo.packageName;
                    String appLinkUri7 = c00510m.A05();
                    if (str2.equals(appLinkUri7)) {
                        unresolvedAppIntent.setComponent(new ComponentName(next.activityInfo.packageName, next.activityInfo.name));
                        break;
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        if (queryIntentActivities.isEmpty() || unresolvedAppIntent.getComponent() == null) {
            if (!A09(((AbstractC00460h) this).A00, A03)) {
                return null;
            }
            String A052 = c00510m.A05();
            String[] strArr3 = A05;
            String str3 = strArr3[5];
            String appLinkUri8 = strArr3[4];
            if (str3.length() != appLinkUri8.length()) {
                throw new RuntimeException();
            }
            A05[2] = "8xekkGfEbM0UNtDVsVek4v0mq2iI8UOu";
            unresolvedAppIntent.setPackage(A052);
        }
        return unresolvedAppIntent;
    }

    private Intent A01(C00510m c00510m) {
        Intent intent = new Intent(A04(88, 26, 38));
        intent.addFlags(268435456);
        if (!TextUtils.isEmpty(c00510m.A05()) && !TextUtils.isEmpty(c00510m.A04())) {
            intent.setComponent(new ComponentName(c00510m.A05(), c00510m.A04()));
        }
        if (!TextUtils.isEmpty(c00510m.A03())) {
            intent.setData(AbstractC0540Ky.A00(c00510m.A03()));
        }
        return intent;
    }

    private final Uri A02() {
        String queryParameter = this.A01.getQueryParameter(A04(219, 9, 104));
        if (!TextUtils.isEmpty(queryParameter)) {
            return AbstractC0540Ky.A00(queryParameter);
        }
        Uri uri = this.A01;
        String storeUrl = A04(211, 8, 63);
        String storeId = uri.getQueryParameter(storeUrl);
        Locale locale = Locale.US;
        Object[] objArr = {storeId};
        String storeUrl2 = A04(126, 22, 117);
        return AbstractC0540Ky.A00(String.format(locale, storeUrl2, objArr));
    }

    private EnumC00450g A03() throws C0525Kh {
        C0537Kv c0537Kv = new C0537Kv();
        try {
            return C0537Kv.A05(c0537Kv, ((AbstractC00460h) this).A00, A02(), ((AbstractC00460h) this).A02, this.A03);
        } catch (C0525Kh unused) {
            String str = A04(26, 27, 35) + this.A01.toString();
            String queryParameter = this.A01.getQueryParameter(A04(228, 22, 18));
            if (queryParameter != null && queryParameter.length() > 0) {
                C0537Kv.A0D(c0537Kv, ((AbstractC00460h) this).A00, AbstractC0540Ky.A00(queryParameter), ((AbstractC00460h) this).A02);
            }
            return EnumC00450g.A08;
        }
    }

    private List<C00510m> A05() {
        String queryParameter = this.A01.getQueryParameter(A04(114, 12, 124));
        if (TextUtils.isEmpty(queryParameter)) {
            return null;
        }
        String appsiteDataString = A04(53, 2, 109);
        if (appsiteDataString.equals(queryParameter)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(queryParameter);
            String appsiteDataString2 = A04(55, 7, 127);
            JSONArray optJSONArray = jSONObject.optJSONArray(appsiteDataString2);
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    C00510m A00 = C00510m.A00(optJSONArray.optJSONObject(i));
                    if (A00 != null) {
                        arrayList.add(A00);
                    }
                }
            }
        } catch (JSONException e) {
            AnonymousClass89 A07 = ((AbstractC00460h) this).A00.A07();
            int i2 = C8A.A24;
            C8B c8b = new C8B(e);
            String appsiteDataString3 = A04(204, 7, 47);
            A07.A9a(appsiteDataString3, i2, c8b);
            String str = A06;
            String appsiteDataString4 = A04(0, 26, 10);
            Log.w(str, appsiteDataString4, e);
        }
        return arrayList;
    }

    private boolean A08() {
        List<Intent> appLaunchIntents = A06();
        if (appLaunchIntents == null) {
            return false;
        }
        Iterator<Intent> it = appLaunchIntents.iterator();
        while (it.hasNext()) {
            if (C0527Kj.A0C(((AbstractC00460h) this).A00, it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean A09(C0889Yn c0889Yn, String str) {
        if (Build.VERSION.SDK_INT >= 30 && str != null) {
            boolean A1g = C0478Ih.A1g(c0889Yn);
            if (A05[3].length() == 13) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[7] = "1LqNNd92i";
            strArr[1] = "QkgxMECyk";
            if (A1g) {
                return true;
            }
        }
        return false;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1022bZ
    public final EnumC00450g A0D() {
        OG og;
        EnumC00450g enumC00450g = EnumC00450g.A08;
        if (((AbstractC1022bZ) this).A02) {
            enumC00450g = A0G();
        } else {
            this.A03.put(A04(Opcodes.NEWARRAY, 16, 80), String.valueOf(true));
        }
        if (!AbstractC0556Lo.A0e(((AbstractC00460h) this).A00, enumC00450g, this.A03)) {
            A0E(this.A03, enumC00450g);
            C1U.A06(this.A02, ((AbstractC00460h) this).A00);
        } else {
            EnumC00450g enumC00450g2 = EnumC00450g.A07;
            if (A05[2].charAt(11) != 'U') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[7] = "cFM2nXNzq";
            strArr[1] = "5qRqyCpR9";
            if (enumC00450g != enumC00450g2 && (og = this.A00) != null) {
                og.A0B(A04(264, 25, 51), this.A02, ((AbstractC00460h) this).A02);
            }
        }
        return enumC00450g;
    }

    public final EnumC00450g A0G() {
        EnumC00450g enumC00450g = EnumC00450g.A08;
        String A042 = A04(Opcodes.LCMP, 15, 92);
        boolean A0F = A0F(this.A01);
        if (!A0F) {
            A0F = A08();
        }
        if (!A0F) {
            try {
                enumC00450g = A03();
                if (enumC00450g != EnumC00450g.A08) {
                    A042 = A04(Opcodes.NEWARRAY, 16, 80);
                } else {
                    A042 = A04(Opcodes.IF_ICMPGT, 25, 10);
                }
            } catch (Exception unused) {
                enumC00450g = EnumC00450g.A03;
            }
        }
        Map<String, String> map = this.A03;
        String redirectionAction = String.valueOf(true);
        map.put(A042, redirectionAction);
        return enumC00450g;
    }

    public final void A0H(OG og) {
        this.A00 = og;
    }
}
