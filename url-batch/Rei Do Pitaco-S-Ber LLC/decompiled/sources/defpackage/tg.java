package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.Editable;
import android.text.Selection;
import android.view.View;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class tg implements ht, te, d90, r80 {
    public static final tg g = new tg(1);
    public static final tg h = new tg(2);
    public static final tg i = new tg(3);
    public static final tg j = new tg(4);
    public static final tg k = new tg(5);
    public static final tg l = new tg(6);
    public static final tg m = new tg(7);
    public static final tg n = new tg(8);
    public static final tg o = new tg(9);
    public final /* synthetic */ int f;

    public /* synthetic */ tg(int i2) {
        this.f = i2;
    }

    public static final da f(tg tgVar, String str) {
        da daVar = new da(str);
        da.d.put(str, daVar);
        return daVar;
    }

    public static final zz g(zz zzVar) {
        if ((zzVar != null ? zzVar.l : null) == null) {
            return zzVar;
        }
        yz n2 = zzVar.n();
        n2.g = null;
        return n2.a();
    }

    public static String j(String str, int i2, int i3, String str2, int i4) {
        int i5 = (i4 & 1) != 0 ? 0 : i2;
        int length = (i4 & 2) != 0 ? str.length() : i3;
        boolean z = (i4 & 8) == 0;
        boolean z2 = (i4 & 16) == 0;
        boolean z3 = (i4 & 32) == 0;
        boolean z4 = (i4 & 64) == 0;
        str.getClass();
        int i6 = i5;
        while (i6 < length) {
            int codePointAt = str.codePointAt(i6);
            int i7 = 128;
            int i8 = 32;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z4) || m30.m0(str2, (char) codePointAt) || ((codePointAt == 37 && (!z || (z2 && !q(str, i6, length)))) || (codePointAt == 43 && z3)))) {
                m8 m8Var = new m8();
                m8Var.B(str, i5, i6);
                m8 m8Var2 = null;
                while (i6 < length) {
                    int codePointAt2 = str.codePointAt(i6);
                    if (!z || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z3) {
                            m8Var.A(z ? "+" : "%2B");
                        } else if (codePointAt2 < i8 || codePointAt2 == 127 || ((codePointAt2 >= i7 && !z4) || m30.m0(str2, (char) codePointAt2) || (codePointAt2 == 37 && (!z || (z2 && !q(str, i6, length)))))) {
                            if (m8Var2 == null) {
                                m8Var2 = new m8();
                            }
                            m8Var2.C(codePointAt2);
                            while (!m8Var2.n()) {
                                byte readByte = m8Var2.readByte();
                                m8Var.w(37);
                                char[] cArr = xn.j;
                                m8Var.w(cArr[((readByte & 255) >> 4) & 15]);
                                m8Var.w(cArr[readByte & 15]);
                            }
                        } else {
                            m8Var.C(codePointAt2);
                        }
                    }
                    i6 += Character.charCount(codePointAt2);
                    i7 = 128;
                    i8 = 32;
                }
                return m8Var.r(m8Var.g, r9.a);
            }
            i6 += Character.charCount(codePointAt);
        }
        return str.substring(i5, length);
    }

    public static r8 k(String str) {
        if (str.length() % 2 != 0) {
            l8.e("Unexpected hex string: ".concat(str));
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) (g8.a(str.charAt(i3 + 1)) + (g8.a(str.charAt(i3)) << 4));
        }
        return new r8(bArr);
    }

    public static r8 l(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(r9.a);
        bytes.getClass();
        r8 r8Var = new r8(bytes);
        r8Var.h = str;
        return r8Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
    
        if (r11 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a2, code lost:
    
        if (r10 != (-1)) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean o(gh ghVar, Editable editable, int i2, int i3, boolean z) {
        int min;
        if (editable != null && i2 >= 0 && i3 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z) {
                    int max = Math.max(i2, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && max >= 0) {
                        loop0: while (true) {
                            boolean z2 = false;
                            while (true) {
                                if (max == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart >= 0) {
                                    char charAt = editable.charAt(selectionStart);
                                    if (z2) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt)) {
                                        max--;
                                    } else {
                                        if (Character.isHighSurrogate(charAt)) {
                                            break loop0;
                                        }
                                        z2 = true;
                                    }
                                } else if (!z2) {
                                    selectionStart = 0;
                                }
                            }
                            max--;
                        }
                    }
                    selectionStart = -1;
                    int max2 = Math.max(i3, 0);
                    min = editable.length();
                    if (selectionEnd >= 0 && min >= selectionEnd && max2 >= 0) {
                        loop2: while (true) {
                            boolean z3 = false;
                            while (true) {
                                if (max2 == 0) {
                                    min = selectionEnd;
                                    break loop2;
                                }
                                if (selectionEnd < min) {
                                    char charAt2 = editable.charAt(selectionEnd);
                                    if (z3) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt2)) {
                                        max2--;
                                        selectionEnd++;
                                    } else {
                                        if (Character.isLowSurrogate(charAt2)) {
                                            break loop2;
                                        }
                                        selectionEnd++;
                                        z3 = true;
                                    }
                                }
                            }
                            max2--;
                            selectionEnd++;
                        }
                    }
                    min = -1;
                    if (selectionStart != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i2, 0);
                    min = Math.min(selectionEnd + i3, editable.length());
                }
                u60[] u60VarArr = (u60[]) editable.getSpans(selectionStart, min, u60.class);
                if (u60VarArr != null && u60VarArr.length > 0) {
                    for (u60 u60Var : u60VarArr) {
                        int spanStart = editable.getSpanStart(u60Var);
                        int spanEnd = editable.getSpanEnd(u60Var);
                        selectionStart = Math.min(spanStart, selectionStart);
                        min = Math.max(spanEnd, min);
                    }
                    int max3 = Math.max(selectionStart, 0);
                    int min2 = Math.min(min, editable.length());
                    ghVar.beginBatchEdit();
                    editable.delete(max3, min2);
                    ghVar.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean p(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static boolean q(String str, int i2, int i3) {
        int i4 = i2 + 2;
        return i4 < i3 && str.charAt(i2) == '%' && z60.o(str.charAt(i2 + 1)) != -1 && z60.o(str.charAt(i4)) != -1;
    }

    public static String r(String str, int i2, int i3, int i4) {
        int i5;
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        boolean z = (i4 & 4) == 0;
        str.getClass();
        int i6 = i2;
        while (i6 < i3) {
            char charAt = str.charAt(i6);
            if (charAt == '%' || (charAt == '+' && z)) {
                m8 m8Var = new m8();
                m8Var.B(str, i2, i6);
                while (i6 < i3) {
                    int codePointAt = str.codePointAt(i6);
                    if (codePointAt != 37 || (i5 = i6 + 2) >= i3) {
                        if (codePointAt == 43 && z) {
                            m8Var.w(32);
                            i6++;
                        }
                        m8Var.C(codePointAt);
                        i6 += Character.charCount(codePointAt);
                    } else {
                        int o2 = z60.o(str.charAt(i6 + 1));
                        int o3 = z60.o(str.charAt(i5));
                        if (o2 != -1 && o3 != -1) {
                            m8Var.w((o2 << 4) + o3);
                            i6 = Character.charCount(codePointAt) + i5;
                        }
                        m8Var.C(codePointAt);
                        i6 += Character.charCount(codePointAt);
                    }
                }
                return m8Var.r(m8Var.g, r9.a);
            }
            i6++;
        }
        return str.substring(i2, i3);
    }

    public static ArrayList s(String str) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            int q0 = m30.q0(str, '&', i2, 4);
            if (q0 == -1) {
                q0 = str.length();
            }
            int q02 = m30.q0(str, '=', i2, 4);
            if (q02 == -1 || q02 > q0) {
                arrayList.add(str.substring(i2, q0));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i2, q02));
                arrayList.add(str.substring(q02 + 1, q0));
            }
            i2 = q0 + 1;
        }
        return arrayList;
    }

    @Override // defpackage.te
    public boolean b(SSLSocket sSLSocket) {
        return u30.l0(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // defpackage.r80
    public p80 c(Class cls) {
        switch (this.f) {
            case 24:
                return new uk(true);
            default:
                return new nq();
        }
    }

    @Override // defpackage.te
    public k20 d(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!cls2.getSimpleName().equals("OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new p2(cls2);
    }

    @Override // defpackage.d90
    public db0 e(View view, db0 db0Var, e90 e90Var) {
        e90Var.d = db0Var.a() + e90Var.d;
        boolean z = view.getLayoutDirection() == 1;
        int b = db0Var.b();
        int c = db0Var.c();
        int i2 = e90Var.a + (z ? c : b);
        e90Var.a = i2;
        int i3 = e90Var.c;
        if (!z) {
            b = c;
        }
        int i4 = i3 + b;
        e90Var.c = i4;
        view.setPaddingRelative(i2, e90Var.b, i4, e90Var.d);
        return db0Var;
    }

    public float i(float f) {
        return 1.0f;
    }

    public synchronized da m(String str) {
        da daVar;
        try {
            str.getClass();
            LinkedHashMap linkedHashMap = da.d;
            daVar = (da) linkedHashMap.get(str);
            if (daVar == null) {
                daVar = (da) linkedHashMap.get(u30.l0(str, "TLS_", false) ? "SSL_".concat(str.substring(4)) : u30.l0(str, "SSL_", false) ? "TLS_".concat(str.substring(4)) : str);
                if (daVar == null) {
                    daVar = new da(str);
                }
                linkedHashMap.put(str, daVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return daVar;
    }

    public Signature[] n(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public String toString() {
        switch (this.f) {
            case 7:
                return "kotlin.Unit";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.ht
    public boolean v(ss ssVar) {
        return false;
    }

    @Override // defpackage.ht
    public void a(ss ssVar, boolean z) {
    }
}
