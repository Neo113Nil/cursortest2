package defpackage;

import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class uo extends jw {
    public static final boolean c;

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0078, code lost:
    
        if (r0.intValue() >= 9) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0069  */
    static {
        Integer num;
        int i;
        int i2;
        int i3;
        String property = System.getProperty("java.specification.version");
        boolean z = false;
        if (property != null) {
            g8.q(10);
            int length = property.length();
            if (length != 0) {
                char charAt = property.charAt(0);
                int i4 = -2147483647;
                if (oo.h(charAt, 48) >= 0) {
                    i = 0;
                } else if (length != 1) {
                    if (charAt == '+') {
                        i2 = 0;
                        i = 1;
                        int i5 = 0;
                        int i6 = -59652323;
                        while (i < length) {
                            int digit = Character.digit((int) property.charAt(i), 10);
                            if (digit >= 0 && ((i5 >= i6 || (i6 == -59652323 && i5 >= (i6 = i4 / 10))) && (i3 = i5 * 10) >= i4 + digit)) {
                                i5 = i3 - digit;
                                i++;
                            }
                        }
                        num = i2 == 0 ? Integer.valueOf(i5) : Integer.valueOf(-i5);
                        if (num == null) {
                            try {
                                SSLSocket.class.getMethod("getApplicationProtocol", null);
                            } catch (NoSuchMethodException unused) {
                            }
                        }
                        z = true;
                        c = z;
                    }
                    if (charAt == '-') {
                        i4 = Integer.MIN_VALUE;
                        i = 1;
                    }
                }
                i2 = i;
                int i52 = 0;
                int i62 = -59652323;
                while (i < length) {
                }
                if (i2 == 0) {
                }
                if (num == null) {
                }
                z = true;
                c = z;
            }
        }
        num = null;
        if (num == null) {
        }
        z = true;
        c = z;
    }

    @Override // defpackage.jw
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((bx) obj) != bx.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(wa.Y(arrayList));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((bx) obj2).f);
        }
        sSLParameters.setApplicationProtocols((String[]) arrayList2.toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // defpackage.jw
    public final String f(SSLSocket sSLSocket) {
        String applicationProtocol;
        try {
            applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
