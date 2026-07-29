package o;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.net.ssl.SSLSocket;

/* renamed from: o.oL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1623oL implements InterfaceC0143Fk, InterfaceC2289yS, InterfaceC0844cV, InterfaceC1569nX, InterfaceC0163Ge, InterfaceC2301ye, InterfaceC2075vC, GI, InterfaceC0483Sn, InterfaceC0580Wg, InterfaceC1085g9, OC {
    public static final C1623oL i = new C1623oL(0);
    public static final C1623oL j = new C1623oL(1);
    public static final C1623oL k = new C1623oL(2);
    public static final C1623oL l = new C1623oL(3);
    public static final C1623oL m = new C1623oL(4);
    public static final C1623oL n = new C1623oL(5);

    /* renamed from: o, reason: collision with root package name */
    public static final C1623oL f206o = new C1623oL(6);
    public static final C1623oL p = new C1623oL(7);
    public static final C1623oL q = new C1623oL(8);
    public static final C1623oL r = new C1623oL(9);
    public static final C1799r10 s = new C1799r10();
    public static final /* synthetic */ C1623oL t = new C1623oL(11);
    public final /* synthetic */ int h;

    public /* synthetic */ C1623oL(int i2) {
        this.h = i2;
    }

    public static final float[] j() {
        float[] fArr = C2333z6.s;
        if (fArr != null) {
            return fArr;
        }
        float[] fArr2 = new float[91];
        C2333z6.s = fArr2;
        return fArr2;
    }

    public static void k(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static C2002u5 m(Context context, String[] strArr, String str, C1334k c1334k) {
        String[] q2 = q(context);
        int length = q2.length;
        int i2 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i2 >= length) {
                return null;
            }
            String str2 = q2[i2];
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i3 = i4;
                }
            }
            if (zipFile != null) {
                int i5 = 0;
                while (true) {
                    int i6 = i5 + 1;
                    if (i5 < 5) {
                        for (String str3 : strArr) {
                            StringBuilder sb = new StringBuilder("lib");
                            char c = File.separatorChar;
                            sb.append(c);
                            sb.append(str3);
                            sb.append(c);
                            sb.append(str);
                            String sb2 = sb.toString();
                            c1334k.B("Looking for %s in APK %s...", sb2, str2);
                            ZipEntry entry = zipFile.getEntry(sb2);
                            if (entry != null) {
                                C2002u5 c2002u5 = new C2002u5(5, false);
                                c2002u5.i = zipFile;
                                c2002u5.j = entry;
                                return c2002u5;
                            }
                        }
                        i5 = i6;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i2++;
        }
    }

    public static String[] o(Context context, String str) {
        StringBuilder sb = new StringBuilder("lib");
        char c = File.separatorChar;
        sb.append(c);
        sb.append("([^\\");
        sb.append(c);
        sb.append("]*)");
        sb.append(c);
        sb.append(str);
        Pattern compile = Pattern.compile(sb.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : q(context)) {
            try {
                Enumeration<? extends ZipEntry> entries = new ZipFile(new File(str2), 1).entries();
                while (entries.hasMoreElements()) {
                    Matcher matcher = compile.matcher(entries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public static C0632Yg p(AbstractC2097vY abstractC2097vY, boolean z) {
        boolean z2;
        AbstractC0048Bt.n(abstractC2097vY, "type");
        if (abstractC2097vY instanceof C0632Yg) {
            return (C0632Yg) abstractC2097vY;
        }
        abstractC2097vY.B0();
        if ((abstractC2097vY.B0().c() instanceof InterfaceC1437lX) || (abstractC2097vY instanceof C2011uE)) {
            InterfaceC2364zb c = abstractC2097vY.B0().c();
            C1503mX c1503mX = c instanceof C1503mX ? (C1503mX) c : null;
            z2 = true;
            if (c1503mX == null || c1503mX.s) {
                z2 = (z && (abstractC2097vY.B0().c() instanceof InterfaceC1437lX)) ? AbstractC2228xX.e(abstractC2097vY) : true ^ AbstractC1473m3.J(AbstractC1305jX.n(false, null, 24), AbstractC0868ct.M(abstractC2097vY), QW.b);
            }
        } else {
            z2 = false;
        }
        if (!z2) {
            return null;
        }
        if (abstractC2097vY instanceof AbstractC1782qm) {
            AbstractC1782qm abstractC1782qm = (AbstractC1782qm) abstractC2097vY;
            AbstractC0048Bt.h(abstractC1782qm.i.B0(), abstractC1782qm.j.B0());
        }
        return new C0632Yg(AbstractC0868ct.M(abstractC2097vY).F0(false), z);
    }

    public static String[] q(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    @Override // o.InterfaceC0844cV
    public float a() {
        return Float.NaN;
    }

    @Override // o.InterfaceC0580Wg
    public boolean c(SSLSocket sSLSocket) {
        return AbstractC0778bU.B(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // o.InterfaceC2289yS
    public boolean d(Object obj, Object obj2) {
        return AbstractC0048Bt.h(obj, obj2);
    }

    @Override // o.InterfaceC1085g9
    public byte[] e(byte[] bArr, int i2, int i3) {
        switch (this.h) {
            case 20:
                return Arrays.copyOfRange(bArr, i2, i3 + i2);
            default:
                byte[] bArr2 = new byte[i3];
                System.arraycopy(bArr, i2, bArr2, 0, i3);
                return bArr2;
        }
    }

    @Override // o.InterfaceC0844cV
    public long f() {
        int i2 = C1114gc.g;
        return C1114gc.f;
    }

    @Override // o.InterfaceC0580Wg
    public ES g(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!cls2.getSimpleName().equals("OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new H3(cls2);
    }

    @Override // o.InterfaceC1569nX
    public InterfaceC1437lX h(LM lm) {
        AbstractC0048Bt.n(lm, "javaTypeParameter");
        return null;
    }

    @Override // o.InterfaceC0143Fk
    public void i(InterfaceC1245ib interfaceC1245ib, ArrayList arrayList) {
        throw new IllegalStateException("Incomplete hierarchy for class " + interfaceC1245ib.getName() + ", unresolved classes " + arrayList);
    }

    @Override // o.InterfaceC0143Fk
    public void l(InterfaceC2204x9 interfaceC2204x9) {
        AbstractC0048Bt.n(interfaceC2204x9, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + interfaceC2204x9);
    }

    @Override // o.InterfaceC2301ye
    public Object n(MU mu) {
        Intent intent = (Intent) ((Bundle) mu.g()).getParcelable("notification_data");
        if (intent != null) {
            return new C0419Qb(intent);
        }
        return null;
    }

    public String toString() {
        switch (this.h) {
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                return "StructuralEqualityPolicy";
            case 23:
                return "Empty";
            default:
                return super.toString();
        }
    }

    @Override // o.InterfaceC2075vC
    public boolean z(MenuC0825cC menuC0825cC) {
        return false;
    }

    public /* synthetic */ C1623oL(int i2, Object obj) {
        this.h = i2;
    }

    public C1623oL() {
        this.h = 19;
        new C0557Vj();
    }

    @Override // o.InterfaceC2075vC
    public void b(MenuC0825cC menuC0825cC, boolean z) {
    }

    @Override // o.OC
    public void v(C0208Hx c0208Hx, NC nc) {
    }
}
