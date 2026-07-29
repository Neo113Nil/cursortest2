package com.onevcat.uniwebview;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.onevcat.uniwebview.internal.obfuscated.A0;
import com.onevcat.uniwebview.internal.obfuscated.A1;
import com.onevcat.uniwebview.internal.obfuscated.AbstractC0018e;
import com.onevcat.uniwebview.internal.obfuscated.AbstractC0035i0;
import com.onevcat.uniwebview.internal.obfuscated.AbstractC0067q0;
import com.onevcat.uniwebview.internal.obfuscated.AbstractC0069r0;
import com.onevcat.uniwebview.internal.obfuscated.AbstractC0080v;
import com.onevcat.uniwebview.internal.obfuscated.B0;
import com.onevcat.uniwebview.internal.obfuscated.B1;
import com.onevcat.uniwebview.internal.obfuscated.C0;
import com.onevcat.uniwebview.internal.obfuscated.C0004a1;
import com.onevcat.uniwebview.internal.obfuscated.C0005a2;
import com.onevcat.uniwebview.internal.obfuscated.C0009b2;
import com.onevcat.uniwebview.internal.obfuscated.C0012c1;
import com.onevcat.uniwebview.internal.obfuscated.C0013c2;
import com.onevcat.uniwebview.internal.obfuscated.C0016d1;
import com.onevcat.uniwebview.internal.obfuscated.C0017d2;
import com.onevcat.uniwebview.internal.obfuscated.C0020e1;
import com.onevcat.uniwebview.internal.obfuscated.C0021e2;
import com.onevcat.uniwebview.internal.obfuscated.C0024f1;
import com.onevcat.uniwebview.internal.obfuscated.C0025f2;
import com.onevcat.uniwebview.internal.obfuscated.C0026g;
import com.onevcat.uniwebview.internal.obfuscated.C0028g1;
import com.onevcat.uniwebview.internal.obfuscated.C0029g2;
import com.onevcat.uniwebview.internal.obfuscated.C0031h0;
import com.onevcat.uniwebview.internal.obfuscated.C0032h1;
import com.onevcat.uniwebview.internal.obfuscated.C0033h2;
import com.onevcat.uniwebview.internal.obfuscated.C0036i1;
import com.onevcat.uniwebview.internal.obfuscated.C0037i2;
import com.onevcat.uniwebview.internal.obfuscated.C0040j1;
import com.onevcat.uniwebview.internal.obfuscated.C0041j2;
import com.onevcat.uniwebview.internal.obfuscated.C0044k1;
import com.onevcat.uniwebview.internal.obfuscated.C0045k2;
import com.onevcat.uniwebview.internal.obfuscated.C0049l2;
import com.onevcat.uniwebview.internal.obfuscated.C0053m2;
import com.onevcat.uniwebview.internal.obfuscated.C0056n1;
import com.onevcat.uniwebview.internal.obfuscated.C0057n2;
import com.onevcat.uniwebview.internal.obfuscated.C0058o;
import com.onevcat.uniwebview.internal.obfuscated.C0060o1;
import com.onevcat.uniwebview.internal.obfuscated.C0061o2;
import com.onevcat.uniwebview.internal.obfuscated.C0064p1;
import com.onevcat.uniwebview.internal.obfuscated.C0065p2;
import com.onevcat.uniwebview.internal.obfuscated.C0068q1;
import com.onevcat.uniwebview.internal.obfuscated.C0070r1;
import com.onevcat.uniwebview.internal.obfuscated.C0072s0;
import com.onevcat.uniwebview.internal.obfuscated.C0073s1;
import com.onevcat.uniwebview.internal.obfuscated.C0075t0;
import com.onevcat.uniwebview.internal.obfuscated.C0076t1;
import com.onevcat.uniwebview.internal.obfuscated.C0078u0;
import com.onevcat.uniwebview.internal.obfuscated.C0079u1;
import com.onevcat.uniwebview.internal.obfuscated.C0081v0;
import com.onevcat.uniwebview.internal.obfuscated.C0082v1;
import com.onevcat.uniwebview.internal.obfuscated.C0084w0;
import com.onevcat.uniwebview.internal.obfuscated.C0085w1;
import com.onevcat.uniwebview.internal.obfuscated.C0087x0;
import com.onevcat.uniwebview.internal.obfuscated.C0088x1;
import com.onevcat.uniwebview.internal.obfuscated.C0090y0;
import com.onevcat.uniwebview.internal.obfuscated.C0091y1;
import com.onevcat.uniwebview.internal.obfuscated.C0099z0;
import com.onevcat.uniwebview.internal.obfuscated.C0100z1;
import com.onevcat.uniwebview.internal.obfuscated.C1;
import com.onevcat.uniwebview.internal.obfuscated.D0;
import com.onevcat.uniwebview.internal.obfuscated.D1;
import com.onevcat.uniwebview.internal.obfuscated.D2;
import com.onevcat.uniwebview.internal.obfuscated.E0;
import com.onevcat.uniwebview.internal.obfuscated.E1;
import com.onevcat.uniwebview.internal.obfuscated.EnumC0054n;
import com.onevcat.uniwebview.internal.obfuscated.F0;
import com.onevcat.uniwebview.internal.obfuscated.F1;
import com.onevcat.uniwebview.internal.obfuscated.G0;
import com.onevcat.uniwebview.internal.obfuscated.G1;
import com.onevcat.uniwebview.internal.obfuscated.H0;
import com.onevcat.uniwebview.internal.obfuscated.H1;
import com.onevcat.uniwebview.internal.obfuscated.I0;
import com.onevcat.uniwebview.internal.obfuscated.I1;
import com.onevcat.uniwebview.internal.obfuscated.J0;
import com.onevcat.uniwebview.internal.obfuscated.J1;
import com.onevcat.uniwebview.internal.obfuscated.K0;
import com.onevcat.uniwebview.internal.obfuscated.K1;
import com.onevcat.uniwebview.internal.obfuscated.L0;
import com.onevcat.uniwebview.internal.obfuscated.L1;
import com.onevcat.uniwebview.internal.obfuscated.M0;
import com.onevcat.uniwebview.internal.obfuscated.M1;
import com.onevcat.uniwebview.internal.obfuscated.N0;
import com.onevcat.uniwebview.internal.obfuscated.N1;
import com.onevcat.uniwebview.internal.obfuscated.O0;
import com.onevcat.uniwebview.internal.obfuscated.O1;
import com.onevcat.uniwebview.internal.obfuscated.P0;
import com.onevcat.uniwebview.internal.obfuscated.P1;
import com.onevcat.uniwebview.internal.obfuscated.Q;
import com.onevcat.uniwebview.internal.obfuscated.Q0;
import com.onevcat.uniwebview.internal.obfuscated.Q1;
import com.onevcat.uniwebview.internal.obfuscated.R0;
import com.onevcat.uniwebview.internal.obfuscated.R1;
import com.onevcat.uniwebview.internal.obfuscated.S0;
import com.onevcat.uniwebview.internal.obfuscated.S1;
import com.onevcat.uniwebview.internal.obfuscated.T0;
import com.onevcat.uniwebview.internal.obfuscated.T1;
import com.onevcat.uniwebview.internal.obfuscated.U0;
import com.onevcat.uniwebview.internal.obfuscated.U1;
import com.onevcat.uniwebview.internal.obfuscated.V0;
import com.onevcat.uniwebview.internal.obfuscated.V1;
import com.onevcat.uniwebview.internal.obfuscated.W1;
import com.onevcat.uniwebview.internal.obfuscated.X0;
import com.onevcat.uniwebview.internal.obfuscated.X1;
import com.onevcat.uniwebview.internal.obfuscated.Y0;
import com.onevcat.uniwebview.internal.obfuscated.Y1;
import com.onevcat.uniwebview.internal.obfuscated.Z0;
import com.onevcat.uniwebview.internal.obfuscated.Z1;
import com.onevcat.uniwebview.internal.obfuscated.q2;
import com.onevcat.uniwebview.internal.obfuscated.r2;
import com.onevcat.uniwebview.internal.obfuscated.s2;
import com.onevcat.uniwebview.internal.obfuscated.t2;
import com.onevcat.uniwebview.internal.obfuscated.u2;
import com.onevcat.uniwebview.internal.obfuscated.v2;
import com.onevcat.uniwebview.internal.obfuscated.w2;
import com.onevcat.uniwebview.internal.obfuscated.x2;
import com.onevcat.uniwebview.internal.obfuscated.y2;
import com.unity3d.player.UnityPlayer;
import java.io.ByteArrayOutputStream;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/onevcat/uniwebview/UniWebViewInterface;", "", "<init>", "()V", "Companion", "com/onevcat/uniwebview/internal/obfuscated/y2", "uniwebview_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UniWebViewInterface {
    public static final y2 Companion = new y2();
    public static final long RUN_SYNC_WAIT_TIME_MS = 5000;
    private static UniWebViewNativeChannel channel;

    @JvmStatic
    public static final void addJavaScript(String str, String str2, String identifier) {
        AbstractC0067q0.a(Companion, str, "name", str2, "jsString");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        C0058o c0058o = C0058o.b;
        c0058o.a(EnumC0054n.INFO, AbstractC0018e.a("Interface addJavaScript to: ", str, c0058o, "message"));
        y2.a(str, new C0072s0(str2, identifier));
    }

    @JvmStatic
    public static final void addPermissionTrustDomain(String str, String str2) {
        AbstractC0067q0.a(Companion, str, "name", str2, "domain");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0080v.a("Interface addPermissionTrustDomain: ", str, ", domain: ", str2, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(str, new C0075t0(str2));
    }

    @Deprecated(message = "Use addSslPinnedFingerprint instead.")
    @JvmStatic
    public static final void addSslExceptionDomain(String str, String str2) {
        AbstractC0067q0.a(Companion, str, "name", str2, "domain");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0080v.a("Interface addSslExceptionDomain: ", str, ", domain: ", str2, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(str, new C0078u0(str2));
    }

    @JvmStatic
    public static final void addSslPinnedFingerprint(String str, String str2, String fingerprint) {
        AbstractC0067q0.a(Companion, str, "name", str2, "domain");
        Intrinsics.checkNotNullParameter(fingerprint, "fingerprint");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0080v.a("Interface addSslPinnedFingerprint: ", str, ", domain: ", str2, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(str, new C0081v0(str2, fingerprint));
    }

    @JvmStatic
    public static final void addUrlScheme(String str, String str2) {
        AbstractC0067q0.a(Companion, str, "name", str2, "scheme");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0080v.a("Interface addUrlScheme: ", str, ", scheme: ", str2, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(str, new C0084w0(str2));
    }

    @JvmStatic
    public static final boolean animateTo(String str, int i, int i2, int i3, int i4, float f, float f2, String str2) {
        AbstractC0067q0.a(Companion, str, "name", str2, "identifier");
        C0058o c0058o = C0058o.b;
        String message = "Interface animateTo: {" + i + ", " + i2 + ", " + i3 + ", " + i4 + '}';
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        Boolean bool = (Boolean) y2.c(str, new C0087x0(i, i2, i3, i4, f, f2, str2));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @JvmStatic
    public static final void authenticationInit(String str, String str2, String scheme) {
        AbstractC0067q0.a(Companion, str, "name", str2, "url");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        C0058o c0058o = C0058o.b;
        String message = "Interface authenticationInit: " + str + ", url: " + str2 + ", scheme: " + scheme;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(new C0090y0(str, str2, scheme));
    }

    @JvmStatic
    public static final void authenticationSetPrivateMode(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0069r0.a("Interface authenticationSetPrivateMode: ", name, ", flag: ", z, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(new C0099z0(name, z));
    }

    @JvmStatic
    public static final void authenticationStart(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        c0058o.a(EnumC0054n.INFO, AbstractC0018e.a("Interface authenticationStart: ", name, c0058o, "message"));
        y2.a(new A0(name));
    }

    @JvmStatic
    public static final void bringContentToFront(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        y2.a(name, B0.a);
    }

    @JvmStatic
    public static final boolean canGoBack(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        c0058o.a(EnumC0054n.INFO, AbstractC0018e.a("Interface canGoBack: ", name, c0058o, "message"));
        Boolean bool = (Boolean) y2.c(name, C0.a);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @JvmStatic
    public static final boolean canGoForward(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        c0058o.a(EnumC0054n.INFO, AbstractC0018e.a("Interface canGoForward: ", name, c0058o, "message"));
        Boolean bool = (Boolean) y2.c(name, D0.a);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @JvmStatic
    public static final void captureSnapshot(String name, String str) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0080v.a("Interface captureSnapshot: ", name, ". File name: ", str, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(name, new E0(str));
    }

    @JvmStatic
    public static final void cleanCache(String str, boolean z, String str2) {
        AbstractC0067q0.a(Companion, str, "name", str2, "identifier");
        C0058o c0058o = C0058o.b;
        c0058o.a(EnumC0054n.INFO, AbstractC0018e.a("Interface cleanCache: ", str, c0058o, "message"));
        y2.a(str, new F0(str2, z));
    }

    @Deprecated(message = "Use the async version")
    @JvmStatic
    public static final void clearCookies() {
        Companion.getClass();
        C0058o c0058o = C0058o.b;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter("Interface clearCookies", "message");
        c0058o.a(EnumC0054n.INFO, "Interface clearCookies");
        AbstractC0035i0.a();
    }

    @JvmStatic
    public static final void clearCookiesAsync(String str) {
        Companion.getClass();
        y2.a(str);
    }

    @JvmStatic
    public static final void clearHttpAuthUsernamePassword(String str, String str2) {
        AbstractC0067q0.a(Companion, str, "host", str2, "realm");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0080v.a("Interface clearHttpAuthUsernamePassword. Host: ", str, ", realm: ", str2, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(new G0(str, str2));
    }

    @JvmStatic
    public static final String copyBackForwardList(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        c0058o.a(EnumC0054n.INFO, AbstractC0018e.a("Interface copyBackForwardList: ", name, c0058o, "message"));
        String str = (String) y2.c(name, H0.a);
        return str == null ? "{}" : str;
    }

    @JvmStatic
    public static final void destroy(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        c0058o.a(EnumC0054n.INFO, AbstractC0018e.a("Interface destroy web view: ", name, c0058o, "message"));
        y2.a(name, I0.a);
    }

    @JvmStatic
    public static final void evaluateJavaScript(String str, String str2, String identifier) {
        AbstractC0067q0.a(Companion, str, "name", str2, "jsString");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        C0058o c0058o = C0058o.b;
        c0058o.a(EnumC0054n.INFO, AbstractC0018e.a("Interface evaluateJavaScript in: ", str, c0058o, "message"));
        y2.a(str, new J0(str2, identifier));
    }

    @Deprecated(message = "Use the async version")
    @JvmStatic
    public static final String getCookie(String str, String str2) {
        AbstractC0067q0.a(Companion, str, "url", str2, "key");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0080v.a("Interface getCookie from: ", str, " | key: ", str2, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        return AbstractC0035i0.a(str, str2);
    }

    @JvmStatic
    public static final void getCookieAsync(String str, String str2, String identifier) {
        AbstractC0067q0.a(Companion, str, "url", str2, "key");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        C0058o c0058o = C0058o.b;
        String message = "getCookieAsync: " + str + " | key: " + str2 + ", identifier: " + identifier;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(new Q(new D2(identifier, "0", AbstractC0035i0.a(str, str2), null)));
    }

    @JvmStatic
    public static final byte[] getRenderedData(String name, int i, int i2, int i3, int i4) {
        byte[] bArr;
        ByteArrayOutputStream byteArrayOutputStream;
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0026g c0026g = C0026g.b;
        c0026g.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0031h0 c0031h0 = (C0031h0) c0026g.a.get(name);
        if (c0031h0 != null && (byteArrayOutputStream = c0031h0.n) != null) {
            byteArrayOutputStream.reset();
            Bitmap bitmap = c0031h0.o;
            if (bitmap != null) {
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                    bArr = byteArrayOutputStream.toByteArray();
                } catch (Exception e) {
                    C0058o c0058o = C0058o.b;
                    String message = "Creating snapshot buffer exception: " + e;
                    c0058o.getClass();
                    Intrinsics.checkNotNullParameter(message, "message");
                    c0058o.a(EnumC0054n.CRITICAL, message);
                }
                y2.a(name, new K0((i != -1 && i2 == -1 && i3 == -1 && i4 == -1) ? null : new Rect(i, i2, i3 + i, i4 + i2)));
                return bArr;
            }
        }
        bArr = null;
        y2.a(name, new K0((i != -1 && i2 == -1 && i3 == -1 && i4 == -1) ? null : new Rect(i, i2, i3 + i, i4 + i2)));
        return bArr;
    }

    @JvmStatic
    public static final int getStatusBarHeight() {
        Companion.getClass();
        C0058o c0058o = C0058o.b;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter("Interface getStatusBarHeight", "message");
        c0058o.a(EnumC0054n.INFO, "Interface getStatusBarHeight");
        Integer num = (Integer) y2.c(L0.a);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @JvmStatic
    public static final String getUrl(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        c0058o.a(EnumC0054n.INFO, AbstractC0018e.a("Interface getUrl: ", name, c0058o, "message"));
        String str = (String) y2.c(name, M0.a);
        return str == null ? "" : str;
    }

    @JvmStatic
    public static final String getUserAgent(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        c0058o.a(EnumC0054n.INFO, AbstractC0018e.a("Interface getUserAgent: ", name, c0058o, "message"));
        String str = (String) y2.c(name, N0.a);
        return str == null ? "" : str;
    }

    @JvmStatic
    public static final float getWebViewAlpha(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        c0058o.a(EnumC0054n.INFO, AbstractC0018e.a("Interface getWebViewAlpha: ", name, c0058o, "message"));
        Float f = (Float) y2.c(name, O0.a);
        if (f != null) {
            return f.floatValue();
        }
        return 1.0f;
    }

    @JvmStatic
    public static final void goBack(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        c0058o.a(EnumC0054n.INFO, AbstractC0018e.a("Interface goBack: ", name, c0058o, "message"));
        y2.a(name, P0.a);
    }

    @JvmStatic
    public static final void goForward(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        c0058o.a(EnumC0054n.INFO, AbstractC0018e.a("Interface goForward: ", name, c0058o, "message"));
        y2.a(name, Q0.a);
    }

    @JvmStatic
    public static final void goToIndexInBackForwardList(String name, int i) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        String message = "Interface goToIndexInBackForwardList: " + name + ", index: " + i;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(name, new R0(i));
    }

    @JvmStatic
    public static final boolean hide(String str, boolean z, int i, float f, String str2) {
        AbstractC0067q0.a(Companion, str, "name", str2, "identifier");
        C0058o c0058o = C0058o.b;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter("Interface hide", "message");
        c0058o.a(EnumC0054n.INFO, "Interface hide");
        Boolean bool = (Boolean) y2.c(str, new S0(z, i, f, str2));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @JvmStatic
    public static final void hideAsync(String str, boolean z, int i, float f, String str2) {
        AbstractC0067q0.a(Companion, str, "name", str2, "identifier");
        C0058o c0058o = C0058o.b;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter("Interface hideAsync", "message");
        c0058o.a(EnumC0054n.INFO, "Interface hideAsync");
        y2.a(str, new T0(z, i, f, str2));
    }

    @JvmStatic
    public static final void hideSpinner(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        c0058o.a(EnumC0054n.INFO, AbstractC0018e.a("Interface hideSpinner: ", name, c0058o, "message"));
        y2.a(name, U0.a);
    }

    @JvmStatic
    public static final void init(String name, int i, int i2, int i3, int i4) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        c0058o.a(EnumC0054n.INFO, AbstractC0018e.a("Interface init: ", name, c0058o, "message"));
        y2.a(new V0(name, i, i2, i3, i4));
    }

    @JvmStatic
    public static final boolean isAuthenticationIsSupported() {
        Companion.getClass();
        C0058o c0058o = C0058o.b;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter("Interface authenticationIsSupported.", "message");
        c0058o.a(EnumC0054n.INFO, "Interface authenticationIsSupported.");
        Boolean bool = (Boolean) y2.c(X0.a);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @JvmStatic
    public static final boolean isSafeBrowsingSupported() {
        Companion.getClass();
        Boolean bool = (Boolean) y2.c(X0.a);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @JvmStatic
    public static final boolean isWebViewSupported() {
        Companion.getClass();
        Boolean bool = (Boolean) y2.c(Y0.a);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @JvmStatic
    public static final void load(String name, String str) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0080v.a("Interface load: ", name, ", url: ", str, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(name, new Z0(str));
    }

    @JvmStatic
    public static final void loadHTMLString(String name, String str, String str2) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter("Interface loadHTMLString", "message");
        c0058o.a(EnumC0054n.INFO, "Interface loadHTMLString");
        y2.a(name, new C0004a1(str, str2));
    }

    @JvmStatic
    public static final void prepare() {
        Companion.getClass();
        y2.c(C0012c1.a);
    }

    @JvmStatic
    public static final void print(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        c0058o.a(EnumC0054n.INFO, AbstractC0018e.a("Interface print: ", name, c0058o, "message"));
        y2.a(name, C0016d1.a);
    }

    @JvmStatic
    public static final void refreshTransparencyClickingThroughLayout(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        c0058o.a(EnumC0054n.INFO, AbstractC0018e.a("Interface refreshTransparencyClickingThroughLayout: ", name, c0058o, "message"));
        y2.a(name, C0020e1.a);
    }

    @JvmStatic
    public static final void registerChannel(UniWebViewNativeChannel channel2) {
        y2 y2Var = Companion;
        y2Var.getClass();
        Intrinsics.checkNotNullParameter(channel2, "channel");
        y2.a(new C0024f1(y2Var, channel2));
    }

    @JvmStatic
    public static final void reload(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        c0058o.a(EnumC0054n.INFO, AbstractC0018e.a("Interface reload: ", name, c0058o, "message"));
        y2.a(name, C0028g1.a);
    }

    @Deprecated(message = "Use the async version")
    @JvmStatic
    public static final void removeCookie(String str, String str2) {
        AbstractC0067q0.a(Companion, str, "url", str2, "key");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0080v.a("Interface removeCookie: ", str, ", key: ", str2, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        AbstractC0035i0.b(str, str2);
    }

    @JvmStatic
    public static final void removeCookieAsync(String str, String str2, String identifier) {
        AbstractC0067q0.a(Companion, str, "url", str2, "key");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        C0058o c0058o = C0058o.b;
        String message = "Interface removeCookieAsync for " + str + ", key: " + str2 + ", identifier: " + identifier;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        AbstractC0035i0.b(str, str2);
        y2.a(new Q(new D2(identifier, "0", "", null)));
    }

    @Deprecated(message = "Use the async version")
    @JvmStatic
    public static final void removeCookies(String url) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        C0058o c0058o = C0058o.b;
        c0058o.a(EnumC0054n.INFO, AbstractC0018e.a("Interface remove cookies for: ", url, c0058o, "message"));
        Intrinsics.checkNotNullParameter(url, "url");
        AbstractC0035i0.b(url, null);
    }

    @JvmStatic
    public static final void removeCookiesAsync(String url, String str) {
        AbstractC0067q0.a(Companion, url, "url", str, "identifier");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0080v.a("Interface removeCookiesAsync for: ", url, ", identifier: ", str, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        Intrinsics.checkNotNullParameter(url, "url");
        AbstractC0035i0.b(url, null);
        y2.a(new Q(new D2(str, "0", "", null)));
    }

    @JvmStatic
    public static final void removePermissionTrustDomain(String str, String str2) {
        AbstractC0067q0.a(Companion, str, "name", str2, "domain");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0080v.a("Interface removePermissionTrustDomain: ", str, ", domain: ", str2, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(str, new C0032h1(str2));
    }

    @Deprecated(message = "Use removeSslPinnedFingerprint instead.")
    @JvmStatic
    public static final void removeSslExceptionDomain(String str, String str2) {
        AbstractC0067q0.a(Companion, str, "name", str2, "domain");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0080v.a("Interface removeSslExceptionDomain: ", str, ", domain: ", str2, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(str, new C0036i1(str2));
    }

    @JvmStatic
    public static final void removeSslPinnedFingerprint(String str, String str2, String fingerprint) {
        AbstractC0067q0.a(Companion, str, "name", str2, "domain");
        Intrinsics.checkNotNullParameter(fingerprint, "fingerprint");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0080v.a("Interface removeSslPinnedFingerprint: ", str, ", domain: ", str2, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(str, new C0040j1(str2, fingerprint));
    }

    @JvmStatic
    public static final void removeUrlScheme(String str, String str2) {
        AbstractC0067q0.a(Companion, str, "name", str2, "scheme");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0080v.a("Interface removeUrlScheme: ", str, ", scheme: ", str2, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(str, new C0044k1(str2));
    }

    @JvmStatic
    public static final void safeBrowsingInit(String name, String str) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0080v.a("Interface safeBrowsingInit: ", name, ", url: ", str, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(new C0056n1(str, name));
    }

    @JvmStatic
    public static final void safeBrowsingSetToolbarColor(String name, float f, float f2, float f3) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        String message = "Interface safeBrowsingSetToolbarColor: " + name + ", rgb: {" + f + ", " + f2 + ", " + f3 + '}';
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(new C0060o1(name, f, f2, f3));
    }

    @JvmStatic
    public static final void safeBrowsingShow(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        c0058o.a(EnumC0054n.INFO, AbstractC0018e.a("Interface safeBrowsingShow: ", name, c0058o, "message"));
        y2.a(new C0064p1(name));
    }

    @JvmStatic
    public static final float screenHeight() {
        Companion.getClass();
        return UnityPlayer.currentActivity.findViewById(android.R.id.content).getHeight();
    }

    @JvmStatic
    public static final float screenWidth() {
        Companion.getClass();
        return UnityPlayer.currentActivity.findViewById(android.R.id.content).getWidth();
    }

    @JvmStatic
    public static final void scrollTo(String name, int i, int i2, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        String message = "Interface scrollTo: " + name + ", {" + i + ", " + i2 + "}, animated: " + z;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(name, new C0068q1(i, i2, z));
    }

    @JvmStatic
    public static final void setAcceptThirdPartyCookies(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0069r0.a("Interface setAcceptThirdPartyCookies: ", name, ", enabled: ", z, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(name, new C0070r1(z));
    }

    @JvmStatic
    public static final void setAllowAutoPlay(boolean z) {
        Companion.getClass();
        C0058o c0058o = C0058o.b;
        String message = "Interface setAllowAutoPlay: " + z;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(new C0073s1(z));
    }

    @JvmStatic
    public static final void setAllowFileAccess(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0069r0.a("Interface setAllowFileAccess: ", name, ", enabled: ", z, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(name, new C0076t1(z));
    }

    @JvmStatic
    public static final void setAllowFileAccessFromFileURLs(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0069r0.a("Interface setAllowFileAccessFromFileURLs: ", name, ", enabled: ", z, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(name, new C0079u1(z));
    }

    @JvmStatic
    public static final void setAllowHTTPAuthPopUpWindow(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0069r0.a("Interface setAllowHTTPAuthPopUpWindow: ", name, ", flag: ", z, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(name, new C0082v1(z));
    }

    @JvmStatic
    public static final void setAllowJavaScriptOpenWindow(boolean z) {
        Companion.getClass();
        C0058o c0058o = C0058o.b;
        String message = "Interface setAllowJavaScriptOpenWindow: " + z;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(new C0085w1(z));
    }

    @JvmStatic
    public static final void setAllowUniversalAccessFromFileURLs(boolean z) {
        Companion.getClass();
        C0058o c0058o = C0058o.b;
        String message = "Interface setAllowUniversalAccessFromFileURLs: " + z;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(new C0088x1(z));
    }

    @JvmStatic
    public static final void setAllowUserDismissSpinnerByGesture(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0069r0.a("Interface setAllowUserDismissSpinnerByGesture: ", name, ", flag: ", z, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(name, new C0091y1(z));
    }

    @JvmStatic
    public static final void setAllowUserEditFileNameBeforeDownloading(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0069r0.a("Interface setAllowUserEditFileNameBeforeDownloading: ", name, ", enabled: ", z, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(name, new C0100z1(z));
    }

    @JvmStatic
    public static final void setBackgroundColor(String name, float f, float f2, float f3, float f4) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        String message = "Interface setBackgroundColor rgba: {" + f + ", " + f2 + ", " + f3 + ", " + f4 + '}';
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(name, new A1(f, f2, f3, f4));
    }

    @JvmStatic
    public static final void setBouncesEnabled(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0069r0.a("Interface setBouncesEnabled: ", name, ", enabled: ", z, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(name, new B1(z));
    }

    @JvmStatic
    public static final void setCacheMode(String name, int i) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        String message = "Interface setCacheMode: " + name + ", mode: " + i;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(name, new C1(i));
    }

    @JvmStatic
    public static final void setCalloutEnabled(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0069r0.a("Interface setCalloutEnabled: ", name, ", flag: ", z, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(name, new D1(z));
    }

    @Deprecated(message = "Use the async version")
    @JvmStatic
    public static final void setCookie(String str, String str2) {
        AbstractC0067q0.a(Companion, str, "url", str2, "cookie");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0080v.a("Interface setCookie: ", str2, " | to url: ", str, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        AbstractC0035i0.c(str, str2);
    }

    @JvmStatic
    public static final void setCookieAsync(String str, String str2, String str3) {
        Companion.getClass();
        y2.a(str, str2, str3);
    }

    @JvmStatic
    public static final void setCornerRadius(String name, float f, float f2, float f3, float f4) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        String message = "Interface setCornerRadius: " + name + ", [" + f + ", " + f2 + ", " + f3 + ", " + f4 + ']';
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(name, new E1(f, f2, f3, f4));
    }

    @JvmStatic
    public static final void setDefaultFontSize(String name, int i) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        String message = "Interface setDefaultFontSize: " + name + ", size: " + i;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(name, new F1(i));
    }

    @JvmStatic
    public static final void setDownloadEventForContextMenuEnabled(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0069r0.a("Interface SetDownloadEventForContextMenuEnabled: ", name, ", enabled: ", z, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(name, new G1(z));
    }

    @JvmStatic
    public static final void setDragInteractionEnabled(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0069r0.a("Interface setDragInteractionEnabled: ", name, ", enabled: ", z, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(name, new H1(z));
    }

    @JvmStatic
    public static final void setEmbeddedToolbarBackgroundColor(String name, float f, float f2, float f3, float f4) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        String message = "Interface setEmbeddedToolbarBackgroundColor: " + name + ", rgba: {" + f + ", " + f2 + ", " + f3 + ", " + f4 + '}';
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(name, new I1(f, f2, f3, f4));
    }

    @JvmStatic
    public static final void setEmbeddedToolbarButtonTextColor(String name, float f, float f2, float f3, float f4) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        String message = "Interface setEmbeddedToolbarButtonTextColor: " + name + ", rgba: {" + f + ", " + f2 + ", " + f3 + ", " + f4 + '}';
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(name, new J1(f, f2, f3, f4));
    }

    @JvmStatic
    public static final void setEmbeddedToolbarDoneButtonText(String str, String str2) {
        AbstractC0067q0.a(Companion, str, "name", str2, "text");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0080v.a("Interface setEmbeddedToolbarDoneButtonText: ", str, ", text: ", str2, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(str, new K1(str2));
    }

    @JvmStatic
    public static final void setEmbeddedToolbarGoBackButtonText(String str, String str2) {
        AbstractC0067q0.a(Companion, str, "name", str2, "text");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0080v.a("Interface setEmbeddedToolbarGoBackButtonText: ", str, ", text: ", str2, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(str, new L1(str2));
    }

    @JvmStatic
    public static final void setEmbeddedToolbarGoForwardButtonText(String str, String str2) {
        AbstractC0067q0.a(Companion, str, "name", str2, "text");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0080v.a("Interface setEmbeddedToolbarGoForwardButtonText: ", str, ", text: ", str2, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(str, new M1(str2));
    }

    @JvmStatic
    public static final void setEmbeddedToolbarMaxHeight(String name, float f) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        String message = "Interface setEmbeddedToolbarMaxHeight: " + name + ", maxHeight: " + f;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(name, new N1(f));
    }

    @JvmStatic
    public static final void setEmbeddedToolbarNavigationButtonsShow(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0069r0.a("Interface setEmbeddedToolbarNavigationButtonsShow: ", name, ", show: ", z, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(name, new O1(z));
    }

    @JvmStatic
    public static final void setEmbeddedToolbarOnTop(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0069r0.a("Interface setEmbeddedToolbarOnTop: ", name, ", top: ", z, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(name, new P1(z));
    }

    @JvmStatic
    public static final void setEmbeddedToolbarTitleText(String str, String str2) {
        AbstractC0067q0.a(Companion, str, "name", str2, "text");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0080v.a("Interface setEmbeddedToolbarTitleText: ", str, ", text: ", str2, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(str, new Q1(str2));
    }

    @JvmStatic
    public static final void setEmbeddedToolbarTitleTextColor(String name, float f, float f2, float f3, float f4) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        String message = "Interface setEmbeddedToolbarTitleTextColor: " + name + ", rgba: {" + f + ", " + f2 + ", " + f3 + ", " + f4 + '}';
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(name, new R1(f, f2, f3, f4));
    }

    @JvmStatic
    public static final void setEnableKeyboardAvoidance(boolean z) {
        Companion.getClass();
        C0058o c0058o = C0058o.b;
        String message = "Interface setEnableKeyboardAvoidance: " + z;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(new S1(z));
    }

    @JvmStatic
    public static final void setForwardWebConsoleToNativeOutput(boolean z) {
        Companion.getClass();
        C0058o c0058o = C0058o.b;
        String message = "Interface setForwardWebConsoleToNativeOutput: " + z;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(new T1(z));
    }

    @JvmStatic
    public static final void setFrame(String name, int i, int i2, int i3, int i4) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        String message = "Interface setFrame: " + name + ", {" + i + ", " + i2 + ", " + i3 + ", " + i4 + '}';
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(name, new U1(i, i2, i3, i4));
    }

    @JvmStatic
    public static final void setHeaderField(String str, String str2, String str3) {
        AbstractC0067q0.a(Companion, str, "name", str2, "key");
        C0058o c0058o = C0058o.b;
        String message = "Interface setHeaderField: " + str + ". {key: " + str2 + ", value: " + str3 + '}';
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(str, new V1(str2, str3));
    }

    @JvmStatic
    public static final void setHorizontalScrollBarEnabled(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0069r0.a("Interface setHorizontalScrollBarEnabled: ", name, ", enabled: ", z, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(name, new W1(z));
    }

    @JvmStatic
    public static final void setJavaScriptEnabled(boolean z) {
        Companion.getClass();
        C0058o c0058o = C0058o.b;
        String message = "Interface setJavaScriptEnabled: " + z;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(new X1(z));
    }

    @JvmStatic
    public static final void setLoadWithOverviewMode(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0069r0.a("Interface setLoadWithOverviewMode: ", name, ", flag: ", z, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(name, new Y1(z));
    }

    @JvmStatic
    public static final void setLogLevel(int i) {
        Companion.getClass();
        C0058o.b.a = i;
    }

    @JvmStatic
    public static final void setOpenLinksInExternalBrowser(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0069r0.a("Interface setOpenLinksInExternalBrowser: ", name, ", enabled: ", z, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(name, new Z1(z));
    }

    @JvmStatic
    public static final void setPosition(String name, int i, int i2) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        String message = "Interface setPosition: " + name + ", {" + i + ", " + i2 + '}';
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(name, new C0005a2(i, i2));
    }

    @JvmStatic
    public static final void setPreferredCustomTabsBrowsers(String[] packages) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(packages, "packages");
        C0058o c0058o = C0058o.b;
        String message = "Interface setPreferredCustomTabsBrowsers: " + packages;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(new C0009b2(packages));
    }

    @JvmStatic
    public static final void setShadow(String name, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        String message = "Interface setShadow: " + name + ", color=(" + f + ", " + f2 + ", " + f3 + ", " + f4 + "), opacity=" + f5 + ", radius=" + f6 + ", offset=(" + f7 + ", " + f8 + "), spread=" + f9;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(name, new C0013c2(f, f2, f3, f4, f5, f6, f7, f8, f9));
    }

    @JvmStatic
    public static final void setShowEmbeddedToolbar(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0069r0.a("Interface setShowEmbeddedToolbar: ", name, ", show: ", z, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(name, new C0017d2(z));
    }

    @JvmStatic
    public static final void setShowSpinnerWhileLoading(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0069r0.a("Interface setShowSpinnerWhileLoading: ", name, ", show: ", z, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(name, new C0021e2(z));
    }

    @JvmStatic
    public static final void setSize(String name, int i, int i2) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        String message = "Interface setSize: " + name + ", {" + i + ", " + i2 + '}';
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(name, new C0025f2(i, i2));
    }

    @JvmStatic
    public static final void setSpinnerText(String str, String str2) {
        AbstractC0067q0.a(Companion, str, "name", str2, "text");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0080v.a("Interface setSpinnerText: ", str, ", text: ", str2, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(str, new C0029g2(str2));
    }

    @JvmStatic
    public static final void setSupportMultipleWindows(String name, boolean z, boolean z2) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        String message = "Interface setSupportMultipleWindows: " + name + ", flag: " + z + ", allowJS: " + z2;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(name, new C0033h2(z2));
    }

    @JvmStatic
    public static final void setTextZoom(String name, int i) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        String message = "Interface setTextZoom: " + name + ", textZoom: " + i;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(name, new C0037i2(i));
    }

    @JvmStatic
    public static final void setTransform(String name, float f, float f2, float f3) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        String message = "Interface setTransform: " + name + ", rotation: " + f + ", scaleX: " + f2 + ", scaleY: " + f3;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(name, new C0041j2(f, f2, f3));
    }

    @JvmStatic
    public static final void setTransparencyClickingThroughEnabled(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0069r0.a("Interface setTransparencyClickingThroughEnabled: ", name, ", flag: ", z, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(name, new C0045k2(z));
    }

    @JvmStatic
    public static final void setUseWideViewPort(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0069r0.a("Interface setUseWideViewPort: ", name, ", flag: ", z, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(name, new C0049l2(z));
    }

    @JvmStatic
    public static final void setUserAgent(String str, String str2) {
        AbstractC0067q0.a(Companion, str, "name", str2, "userAgent");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0080v.a("Interface setUserAgent: ", str, ", UA: ", str2, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(str, new C0053m2(str2));
    }

    @JvmStatic
    public static final void setUserInteractionEnabled(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0069r0.a("Interface setUserInteractionEnabled: ", name, ", flag: ", z, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(name, new C0057n2(z));
    }

    @JvmStatic
    public static final void setVerticalScrollBarEnabled(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0069r0.a("Interface setVerticalScrollBarEnabled: ", name, ", enabled: ", z, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(name, new C0061o2(z));
    }

    @JvmStatic
    public static final void setWebContentsDebuggingEnabled(boolean z) {
        Companion.getClass();
        C0058o c0058o = C0058o.b;
        String message = "Interface setWebContentsDebuggingEnabled: " + z;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(new C0065p2(z));
    }

    @JvmStatic
    public static final void setWebViewAlpha(String name, float f) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        String message = "Interface setWebViewAlpha: " + name + ", alpha: " + f;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(name, new q2(f));
    }

    @JvmStatic
    public static final void setZoomEnabled(String name, boolean z) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        String message = AbstractC0069r0.a("Interface setZoomEnabled: ", name, ", enabled: ", z, c0058o);
        Intrinsics.checkNotNullParameter(message, "message");
        c0058o.a(EnumC0054n.INFO, message);
        y2.a(name, new r2(z));
    }

    @JvmStatic
    public static final boolean show(String str, boolean z, int i, float f, String str2) {
        AbstractC0067q0.a(Companion, str, "name", str2, "identifier");
        C0058o c0058o = C0058o.b;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter("Interface show", "message");
        c0058o.a(EnumC0054n.INFO, "Interface show");
        Boolean bool = (Boolean) y2.c(str, new s2(z, i, f, str2));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @JvmStatic
    public static final void showAsync(String str, boolean z, int i, float f, String str2) {
        AbstractC0067q0.a(Companion, str, "name", str2, "identifier");
        C0058o c0058o = C0058o.b;
        c0058o.getClass();
        Intrinsics.checkNotNullParameter("Interface showAsync", "message");
        c0058o.a(EnumC0054n.INFO, "Interface showAsync");
        y2.a(str, new t2(z, i, f, str2));
    }

    @JvmStatic
    public static final void showSpinner(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        c0058o.a(EnumC0054n.INFO, AbstractC0018e.a("Interface showSpinner: ", name, c0058o, "message"));
        y2.a(name, u2.a);
    }

    @JvmStatic
    public static final void startSnapshotForRendering(String name, String str) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        c0058o.a(EnumC0054n.INFO, AbstractC0018e.a("Interface startSnapshotForRendering: ", name, c0058o, "message"));
        y2.a(name, new v2(str));
    }

    @JvmStatic
    public static final void stop(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        c0058o.a(EnumC0054n.INFO, AbstractC0018e.a("Interface stop: ", name, c0058o, "message"));
        y2.a(name, w2.a);
    }

    @JvmStatic
    public static final void stopSnapshotForRendering(String name) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        C0058o c0058o = C0058o.b;
        c0058o.a(EnumC0054n.INFO, AbstractC0018e.a("Interface stopSnapshotForRendering: ", name, c0058o, "message"));
        y2.a(name, x2.a);
    }
}
