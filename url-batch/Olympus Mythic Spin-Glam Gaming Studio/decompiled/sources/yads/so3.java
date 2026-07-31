package yads;

import android.text.TextUtils;
import com.facebook.appevents.UserDataStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes14.dex */
public final class so3 extends uz2 {
    public final xb2 m = new xb2();
    public final ko3 n = new ko3();

    /* JADX WARN: Code restructure failed: missing block: B:200:0x0129, code lost:
    
        r20 = r3;
        r3 = r0;
        r0 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x03aa, code lost:
    
        r4.addAll(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0116, code lost:
    
        if (")".equals(yads.ko3.b(r11, r12)) == false) goto L60;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:234:0x040e  */
    @Override // yads.uz2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c53 a(byte[] bArr, int i, boolean z) {
        int i2;
        int i3;
        mo3 mo3Var;
        mo3 a;
        String str;
        ko3 ko3Var;
        int i4;
        int i5;
        String sb;
        int i6;
        char c;
        int i7;
        int i8 = 2;
        int i9 = -1;
        int i10 = 1;
        xb2 xb2Var = this.m;
        xb2Var.a = bArr;
        xb2Var.c = i;
        int i11 = 0;
        xb2Var.b = 0;
        ArrayList arrayList = new ArrayList();
        try {
            to3.a(this.m);
            while (!TextUtils.isEmpty(this.m.b())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                xb2 xb2Var2 = this.m;
                int i12 = i9;
                int i13 = i11;
                while (i12 == i9) {
                    i13 = xb2Var2.b;
                    String b = xb2Var2.b();
                    i12 = b == null ? i11 : "STYLE".equals(b) ? i8 : b.startsWith("NOTE") ? i10 : 3;
                }
                xb2Var2.e(i13);
                if (i12 == 0) {
                    return new uo3(arrayList2);
                }
                if (i12 == i10) {
                    while (!TextUtils.isEmpty(this.m.b())) {
                    }
                } else {
                    if (i12 != i8) {
                        int i14 = i10;
                        i2 = i8;
                        i3 = i14;
                        if (i12 == 3) {
                            xb2 xb2Var3 = this.m;
                            Pattern pattern = ro3.a;
                            String b2 = xb2Var3.b();
                            if (b2 == null) {
                                mo3Var = null;
                            } else {
                                Pattern pattern2 = ro3.a;
                                Matcher matcher = pattern2.matcher(b2);
                                if (matcher.matches()) {
                                    a = ro3.a(null, matcher, xb2Var3, arrayList);
                                } else {
                                    mo3Var = null;
                                    String b3 = xb2Var3.b();
                                    if (b3 != null) {
                                        Matcher matcher2 = pattern2.matcher(b3);
                                        if (matcher2.matches()) {
                                            a = ro3.a(b2.trim(), matcher2, xb2Var3, arrayList);
                                        }
                                    }
                                }
                                if (a != null) {
                                    arrayList2.add(a);
                                }
                            }
                            a = mo3Var;
                            if (a != null) {
                            }
                        }
                    } else {
                        if (!arrayList2.isEmpty()) {
                            throw new e53("A style block was found after the first cue.");
                        }
                        this.m.b();
                        ko3 ko3Var2 = this.n;
                        xb2 xb2Var4 = this.m;
                        ko3Var2.b.setLength(i11);
                        int i15 = xb2Var4.b;
                        while (!TextUtils.isEmpty(xb2Var4.b())) {
                            i10 = i10;
                            i8 = i8;
                        }
                        xb2 xb2Var5 = ko3Var2.a;
                        byte[] bArr2 = xb2Var4.a;
                        int i16 = xb2Var4.b;
                        xb2Var5.a = bArr2;
                        xb2Var5.c = i16;
                        xb2Var5.b = i11;
                        xb2Var5.e(i15);
                        ArrayList arrayList3 = new ArrayList();
                        while (true) {
                            xb2 xb2Var6 = ko3Var2.a;
                            StringBuilder sb2 = ko3Var2.b;
                            ko3.a(xb2Var6);
                            if (xb2Var6.c - xb2Var6.b >= 5 && "::cue".equals(xb2Var6.a(5, zt.c))) {
                                int i17 = xb2Var6.b;
                                String b4 = ko3.b(xb2Var6, sb2);
                                if (b4 != null) {
                                    if ("{".equals(b4)) {
                                        xb2Var6.e(i17);
                                        str = "";
                                    } else if ("(".equals(b4)) {
                                        int i18 = xb2Var6.b;
                                        int i19 = xb2Var6.c;
                                        while (true) {
                                            for (int i20 = i11; i18 < i19 && i20 == 0; i20 = i10) {
                                                i7 = i18 + 1;
                                                if (((char) xb2Var6.a[i18]) == ')') {
                                                    i18 = i7;
                                                }
                                            }
                                            i18 = i7;
                                        }
                                        str = xb2Var6.a((i18 + i9) - xb2Var6.b, zt.c).trim();
                                    } else {
                                        str = null;
                                    }
                                    if (str == null && "{".equals(ko3.b(ko3Var2.a, ko3Var2.b))) {
                                        lo3 lo3Var = new lo3();
                                        if (!"".equals(str)) {
                                            int indexOf = str.indexOf(91);
                                            if (indexOf != i9) {
                                                Matcher matcher3 = ko3.c.matcher(str.substring(indexOf));
                                                if (matcher3.matches()) {
                                                    String group = matcher3.group(i10);
                                                    group.getClass();
                                                    lo3Var.d = group;
                                                }
                                                str = str.substring(i11, indexOf);
                                            }
                                            int i21 = sb3.a;
                                            String[] split = str.split("\\.", i9);
                                            String str2 = split[i11];
                                            int indexOf2 = str2.indexOf(35);
                                            if (indexOf2 != i9) {
                                                lo3Var.b = str2.substring(i11, indexOf2);
                                                lo3Var.a = str2.substring(indexOf2 + i10);
                                            } else {
                                                lo3Var.b = str2;
                                            }
                                            if (split.length > i10) {
                                                lo3Var.c = new HashSet(Arrays.asList((String[]) sb3.b(split.length, split)));
                                            }
                                        }
                                        int i22 = i11;
                                        String str3 = null;
                                        while (i22 == 0) {
                                            xb2 xb2Var7 = ko3Var2.a;
                                            int i23 = xb2Var7.b;
                                            String b5 = ko3.b(xb2Var7, ko3Var2.b);
                                            int i24 = (b5 == null || "}".equals(b5)) ? i10 : i11;
                                            if (i24 == 0) {
                                                ko3Var2.a.e(i23);
                                                xb2 xb2Var8 = ko3Var2.a;
                                                StringBuilder sb3 = ko3Var2.b;
                                                ko3.a(xb2Var8);
                                                String a2 = ko3.a(xb2Var8, sb3);
                                                if (!"".equals(a2)) {
                                                    if (":".equals(ko3.b(xb2Var8, sb3))) {
                                                        ko3.a(xb2Var8);
                                                        StringBuilder sb4 = new StringBuilder();
                                                        boolean z2 = false;
                                                        while (true) {
                                                            if (z2) {
                                                                ko3Var = ko3Var2;
                                                                sb = sb4.toString();
                                                            } else {
                                                                boolean z3 = z2;
                                                                int i25 = xb2Var8.b;
                                                                ko3Var = ko3Var2;
                                                                String b6 = ko3.b(xb2Var8, sb3);
                                                                if (b6 == null) {
                                                                    sb = null;
                                                                } else if ("}".equals(b6) || ";".equals(b6)) {
                                                                    xb2Var8.e(i25);
                                                                    ko3Var2 = ko3Var;
                                                                    z2 = true;
                                                                } else {
                                                                    sb4.append(b6);
                                                                    z2 = z3;
                                                                    ko3Var2 = ko3Var;
                                                                }
                                                            }
                                                        }
                                                        if (sb != null && !"".equals(sb)) {
                                                            int i26 = xb2Var8.b;
                                                            String b7 = ko3.b(xb2Var8, sb3);
                                                            if (!";".equals(b7)) {
                                                                if ("}".equals(b7)) {
                                                                    xb2Var8.e(i26);
                                                                }
                                                            }
                                                            if ("color".equals(a2)) {
                                                                i6 = 1;
                                                                lo3Var.f = gx.a(sb, true);
                                                                lo3Var.g = true;
                                                            } else {
                                                                i6 = 1;
                                                                if ("background-color".equals(a2)) {
                                                                    lo3Var.h = gx.a(sb, true);
                                                                    lo3Var.i = true;
                                                                } else if ("ruby-position".equals(a2)) {
                                                                    if ("over".equals(sb)) {
                                                                        lo3Var.p = 1;
                                                                    } else if ("under".equals(sb)) {
                                                                        lo3Var.p = 2;
                                                                        i4 = 2;
                                                                        i5 = 1;
                                                                        str3 = b5;
                                                                        i22 = i24;
                                                                        ko3Var2 = ko3Var;
                                                                        i11 = 0;
                                                                        int i27 = i4;
                                                                        i10 = i5;
                                                                        i8 = i27;
                                                                    }
                                                                } else if ("text-combine-upright".equals(a2)) {
                                                                    lo3Var.q = "all".equals(sb) || sb.startsWith("digits");
                                                                } else if ("text-decoration".equals(a2)) {
                                                                    if ("underline".equals(sb)) {
                                                                        i5 = 1;
                                                                        lo3Var.k = 1;
                                                                    }
                                                                } else if ("font-family".equals(a2)) {
                                                                    lo3Var.e = lh.a(sb);
                                                                } else if (!"font-weight".equals(a2)) {
                                                                    i6 = 1;
                                                                    if ("font-style".equals(a2)) {
                                                                        if ("italic".equals(sb)) {
                                                                            lo3Var.m = 1;
                                                                        }
                                                                    } else if ("font-size".equals(a2)) {
                                                                        Matcher matcher4 = ko3.d.matcher(lh.a(sb));
                                                                        if (matcher4.matches()) {
                                                                            String group2 = matcher4.group(2);
                                                                            group2.getClass();
                                                                            switch (group2.hashCode()) {
                                                                                case 37:
                                                                                    if (group2.equals("%")) {
                                                                                        c = 0;
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                case 3240:
                                                                                    if (group2.equals(UserDataStore.EMAIL)) {
                                                                                        c = 1;
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                case 3592:
                                                                                    if (group2.equals("px")) {
                                                                                        c = 2;
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                            }
                                                                            c = 65535;
                                                                            switch (c) {
                                                                                case 0:
                                                                                    i5 = 1;
                                                                                    i4 = 2;
                                                                                    lo3Var.n = 3;
                                                                                    break;
                                                                                case 1:
                                                                                    i5 = 1;
                                                                                    i4 = 2;
                                                                                    lo3Var.n = 2;
                                                                                    break;
                                                                                case 2:
                                                                                    i5 = 1;
                                                                                    lo3Var.n = 1;
                                                                                    i4 = 2;
                                                                                    break;
                                                                                default:
                                                                                    throw new IllegalStateException();
                                                                            }
                                                                            String group3 = matcher4.group(i5);
                                                                            group3.getClass();
                                                                            lo3Var.o = Float.parseFloat(group3);
                                                                            str3 = b5;
                                                                            i22 = i24;
                                                                            ko3Var2 = ko3Var;
                                                                            i11 = 0;
                                                                            int i272 = i4;
                                                                            i10 = i5;
                                                                            i8 = i272;
                                                                        } else {
                                                                            gh1.d("WebvttCssParser", "Invalid font-size: '" + sb + "'.");
                                                                        }
                                                                    }
                                                                } else if ("bold".equals(sb)) {
                                                                    i6 = 1;
                                                                    lo3Var.l = 1;
                                                                }
                                                            }
                                                            i5 = i6;
                                                        }
                                                        i5 = 1;
                                                    } else {
                                                        i5 = i10;
                                                        ko3Var = ko3Var2;
                                                    }
                                                    i4 = 2;
                                                    str3 = b5;
                                                    i22 = i24;
                                                    ko3Var2 = ko3Var;
                                                    i11 = 0;
                                                    int i2722 = i4;
                                                    i10 = i5;
                                                    i8 = i2722;
                                                }
                                            }
                                            ko3Var = ko3Var2;
                                            int i28 = i10;
                                            i4 = i8;
                                            i5 = i28;
                                            str3 = b5;
                                            i22 = i24;
                                            ko3Var2 = ko3Var;
                                            i11 = 0;
                                            int i27222 = i4;
                                            i10 = i5;
                                            i8 = i27222;
                                        }
                                        ko3 ko3Var3 = ko3Var2;
                                        int i29 = i10;
                                        int i30 = i8;
                                        if ("}".equals(str3)) {
                                            arrayList3.add(lo3Var);
                                        }
                                        ko3Var2 = ko3Var3;
                                        i9 = -1;
                                        i11 = 0;
                                        i10 = i29;
                                        i8 = i30;
                                    }
                                }
                            }
                            str = null;
                            if (str == null) {
                            }
                        }
                    }
                    i9 = -1;
                    i11 = 0;
                    int i31 = i2;
                    i10 = i3;
                    i8 = i31;
                }
            }
        } catch (cc2 e) {
            throw new e53(e);
        }
    }
}
