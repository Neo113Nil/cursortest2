package yads;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.inmobi.media.core.config.models.AdConfig;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes15.dex */
public final class l33 extends uz2 {
    public static final Pattern r = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean m;
    public final m33 n;
    public LinkedHashMap o;
    public float p = -3.4028235E38f;
    public float q = -3.4028235E38f;

    public l33(List list) {
        if (list == null || list.isEmpty()) {
            this.m = false;
            this.n = null;
            return;
        }
        this.m = true;
        String a = sb3.a((byte[]) list.get(0));
        if (!a.startsWith("Format:")) {
            throw new IllegalArgumentException();
        }
        m33 a2 = m33.a(a);
        a2.getClass();
        this.n = a2;
        a(new xb2((byte[]) list.get(1)));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:48:0x00ff. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012e A[SYNTHETIC] */
    @Override // yads.uz2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c53 a(byte[] bArr, int i, boolean z) {
        xb2 xb2Var;
        m33 m33Var;
        long j;
        int i2;
        float f;
        int i3;
        int i4;
        Layout.Alignment alignment;
        int i5;
        float f2;
        float f3;
        float f4;
        int i6;
        float f5;
        int i7;
        m33 m33Var2;
        Matcher matcher;
        Matcher matcher2;
        int i8;
        int i9;
        int i10;
        l33 l33Var = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        xb2 xb2Var2 = new xb2(bArr, i);
        if (!l33Var.m) {
            l33Var.a(xb2Var2);
        }
        m33 m33Var3 = l33Var.m ? l33Var.n : null;
        while (true) {
            String b = xb2Var2.b();
            if (b == null) {
                return new q33(arrayList, arrayList2);
            }
            if (b.startsWith("Format:")) {
                m33Var3 = m33.a(b);
            } else {
                if (b.startsWith("Dialogue:")) {
                    if (m33Var3 == null) {
                        gh1.d("SsaDecoder", "Skipping dialogue line before complete format: ".concat(b));
                    } else {
                        if (!b.startsWith("Dialogue:")) {
                            throw new IllegalArgumentException();
                        }
                        String[] split = b.substring(9).split(StringUtils.COMMA, m33Var3.e);
                        if (split.length != m33Var3.e) {
                            gh1.d("SsaDecoder", "Skipping dialogue line with fewer columns than format: ".concat(b));
                        } else {
                            long a = a(split[m33Var3.a]);
                            if (a == -9223372036854775807L) {
                                gh1.d("SsaDecoder", "Skipping invalid timing: ".concat(b));
                            } else {
                                long a2 = a(split[m33Var3.b]);
                                if (a2 == -9223372036854775807L) {
                                    gh1.d("SsaDecoder", "Skipping invalid timing: ".concat(b));
                                } else {
                                    LinkedHashMap linkedHashMap = l33Var.o;
                                    p33 p33Var = (linkedHashMap == null || (i10 = m33Var3.c) == -1) ? null : (p33) linkedHashMap.get(split[i10].trim());
                                    String str = split[m33Var3.d];
                                    Matcher matcher3 = o33.a.matcher(str);
                                    int i11 = -1;
                                    PointF pointF = null;
                                    while (matcher3.find()) {
                                        xb2 xb2Var3 = xb2Var2;
                                        String group = matcher3.group(1);
                                        group.getClass();
                                        try {
                                            PointF a3 = o33.a(group);
                                            if (a3 != null) {
                                                pointF = a3;
                                            }
                                        } catch (RuntimeException unused) {
                                        }
                                        try {
                                            matcher2 = o33.d.matcher(group);
                                        } catch (RuntimeException unused2) {
                                            m33Var2 = m33Var3;
                                        }
                                        if (matcher2.find()) {
                                            String group2 = matcher2.group(1);
                                            group2.getClass();
                                            try {
                                                i9 = Integer.parseInt(group2.trim());
                                            } catch (NumberFormatException unused3) {
                                            }
                                            switch (i9) {
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                    m33Var2 = m33Var3;
                                                    matcher = matcher3;
                                                    i8 = -1;
                                                    if (i9 == i8) {
                                                        i11 = i9;
                                                        m33Var3 = m33Var2;
                                                        matcher3 = matcher;
                                                        xb2Var2 = xb2Var3;
                                                        break;
                                                    } else {
                                                        xb2Var2 = xb2Var3;
                                                        m33Var3 = m33Var2;
                                                        matcher3 = matcher;
                                                        break;
                                                    }
                                                default:
                                                    m33Var2 = m33Var3;
                                                    try {
                                                        matcher = matcher3;
                                                        try {
                                                            gh1.d("SsaStyle", "Ignoring unknown alignment: " + group2);
                                                            break;
                                                        } catch (RuntimeException unused4) {
                                                        }
                                                    } catch (RuntimeException unused5) {
                                                        matcher = matcher3;
                                                        xb2Var2 = xb2Var3;
                                                        m33Var3 = m33Var2;
                                                        matcher3 = matcher;
                                                    }
                                            }
                                        } else {
                                            m33Var2 = m33Var3;
                                            matcher = matcher3;
                                        }
                                        i8 = -1;
                                        i9 = -1;
                                        if (i9 == i8) {
                                        }
                                    }
                                    xb2Var = xb2Var2;
                                    m33Var = m33Var3;
                                    String replace = o33.a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f6 = l33Var.p;
                                    float f7 = l33Var.q;
                                    SpannableString spannableString = new SpannableString(replace);
                                    if (p33Var != null) {
                                        if (p33Var.c != null) {
                                            j = a2;
                                            spannableString.setSpan(new ForegroundColorSpan(p33Var.c.intValue()), 0, spannableString.length(), 33);
                                        } else {
                                            j = a2;
                                        }
                                        if (p33Var.j == 3 && p33Var.d != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(p33Var.d.intValue()), 0, spannableString.length(), 33);
                                        }
                                        float f8 = p33Var.e;
                                        if (f8 == -3.4028235E38f || f7 == -3.4028235E38f) {
                                            f4 = -3.4028235E38f;
                                            i6 = Integer.MIN_VALUE;
                                        } else {
                                            f4 = f8 / f7;
                                            i6 = 1;
                                        }
                                        boolean z2 = p33Var.f;
                                        if (z2 && p33Var.g) {
                                            f5 = f4;
                                            i7 = 33;
                                            i2 = 0;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            f5 = f4;
                                            i7 = 33;
                                            i2 = 0;
                                            if (z2) {
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            } else if (p33Var.g) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        }
                                        if (p33Var.h) {
                                            spannableString.setSpan(new UnderlineSpan(), i2, spannableString.length(), i7);
                                        }
                                        if (p33Var.i) {
                                            spannableString.setSpan(new StrikethroughSpan(), i2, spannableString.length(), i7);
                                        }
                                        i4 = i6;
                                        f = f5;
                                        i3 = -1;
                                    } else {
                                        j = a2;
                                        i2 = 0;
                                        f = -3.4028235E38f;
                                        i3 = -1;
                                        i4 = Integer.MIN_VALUE;
                                    }
                                    if (i11 != i3) {
                                        i3 = i11;
                                    } else if (p33Var != null) {
                                        i3 = p33Var.b;
                                    }
                                    switch (i3) {
                                        case 0:
                                        default:
                                            mf1.a(i3, "Unknown alignment: ", "SsaDecoder");
                                        case -1:
                                            alignment = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            break;
                                    }
                                    switch (i3) {
                                        case 0:
                                        default:
                                            mf1.a(i3, "Unknown alignment: ", "SsaDecoder");
                                        case -1:
                                            i5 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i5 = i2;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i5 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i5 = 2;
                                            break;
                                    }
                                    switch (i3) {
                                        case 0:
                                        default:
                                            mf1.a(i3, "Unknown alignment: ", "SsaDecoder");
                                        case -1:
                                            i2 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i2 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i2 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            break;
                                    }
                                    if (pointF == null || f7 == -3.4028235E38f || f6 == -3.4028235E38f) {
                                        float f9 = i5 != 0 ? i5 != 1 ? i5 != 2 ? -3.4028235E38f : 0.95f : 0.5f : 0.05f;
                                        if (i2 == 0) {
                                            f2 = 0.05f;
                                        } else if (i2 == 1) {
                                            f2 = 0.5f;
                                        } else if (i2 != 2) {
                                            f3 = f9;
                                            f2 = -3.4028235E38f;
                                        } else {
                                            f2 = 0.95f;
                                        }
                                        f3 = f9;
                                    } else {
                                        f3 = pointF.x / f6;
                                        f2 = pointF.y / f7;
                                    }
                                    s20 s20Var = new s20(spannableString, alignment, null, null, f2, 0, i2, f3, i5, i4, f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                    int a4 = a(j, arrayList2, arrayList);
                                    for (int a5 = a(a, arrayList2, arrayList); a5 < a4; a5++) {
                                        ((List) arrayList.get(a5)).add(s20Var);
                                    }
                                    l33Var = this;
                                    xb2Var2 = xb2Var;
                                    m33Var3 = m33Var;
                                }
                            }
                        }
                    }
                }
                xb2Var = xb2Var2;
                m33Var = m33Var3;
                l33Var = this;
                xb2Var2 = xb2Var;
                m33Var3 = m33Var;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(5:83|(3:84|85|86)|(5:97|92|(1:37)|38|39)|89|90) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x032c, code lost:
    
        r39.o = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02f1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x021e A[Catch: RuntimeException -> 0x0203, TryCatch #3 {RuntimeException -> 0x0203, blocks: (B:42:0x01e0, B:44:0x01ee, B:46:0x01f4, B:49:0x021a, B:51:0x021e, B:52:0x022d, B:54:0x0231, B:55:0x0240, B:57:0x0244, B:59:0x024a, B:61:0x026f, B:63:0x0273, B:66:0x0284, B:68:0x0288, B:71:0x0299, B:73:0x029d, B:76:0x02ae, B:78:0x02b2, B:81:0x02c3, B:83:0x02c7, B:85:0x02cd, B:108:0x0253, B:112:0x0207), top: B:41:0x01e0, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0231 A[Catch: RuntimeException -> 0x0203, TryCatch #3 {RuntimeException -> 0x0203, blocks: (B:42:0x01e0, B:44:0x01ee, B:46:0x01f4, B:49:0x021a, B:51:0x021e, B:52:0x022d, B:54:0x0231, B:55:0x0240, B:57:0x0244, B:59:0x024a, B:61:0x026f, B:63:0x0273, B:66:0x0284, B:68:0x0288, B:71:0x0299, B:73:0x029d, B:76:0x02ae, B:78:0x02b2, B:81:0x02c3, B:83:0x02c7, B:85:0x02cd, B:108:0x0253, B:112:0x0207), top: B:41:0x01e0, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0244 A[Catch: RuntimeException -> 0x0203, TRY_LEAVE, TryCatch #3 {RuntimeException -> 0x0203, blocks: (B:42:0x01e0, B:44:0x01ee, B:46:0x01f4, B:49:0x021a, B:51:0x021e, B:52:0x022d, B:54:0x0231, B:55:0x0240, B:57:0x0244, B:59:0x024a, B:61:0x026f, B:63:0x0273, B:66:0x0284, B:68:0x0288, B:71:0x0299, B:73:0x029d, B:76:0x02ae, B:78:0x02b2, B:81:0x02c3, B:83:0x02c7, B:85:0x02cd, B:108:0x0253, B:112:0x0207), top: B:41:0x01e0, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0273 A[Catch: RuntimeException -> 0x0203, TryCatch #3 {RuntimeException -> 0x0203, blocks: (B:42:0x01e0, B:44:0x01ee, B:46:0x01f4, B:49:0x021a, B:51:0x021e, B:52:0x022d, B:54:0x0231, B:55:0x0240, B:57:0x0244, B:59:0x024a, B:61:0x026f, B:63:0x0273, B:66:0x0284, B:68:0x0288, B:71:0x0299, B:73:0x029d, B:76:0x02ae, B:78:0x02b2, B:81:0x02c3, B:83:0x02c7, B:85:0x02cd, B:108:0x0253, B:112:0x0207), top: B:41:0x01e0, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0288 A[Catch: RuntimeException -> 0x0203, TryCatch #3 {RuntimeException -> 0x0203, blocks: (B:42:0x01e0, B:44:0x01ee, B:46:0x01f4, B:49:0x021a, B:51:0x021e, B:52:0x022d, B:54:0x0231, B:55:0x0240, B:57:0x0244, B:59:0x024a, B:61:0x026f, B:63:0x0273, B:66:0x0284, B:68:0x0288, B:71:0x0299, B:73:0x029d, B:76:0x02ae, B:78:0x02b2, B:81:0x02c3, B:83:0x02c7, B:85:0x02cd, B:108:0x0253, B:112:0x0207), top: B:41:0x01e0, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x029d A[Catch: RuntimeException -> 0x0203, TryCatch #3 {RuntimeException -> 0x0203, blocks: (B:42:0x01e0, B:44:0x01ee, B:46:0x01f4, B:49:0x021a, B:51:0x021e, B:52:0x022d, B:54:0x0231, B:55:0x0240, B:57:0x0244, B:59:0x024a, B:61:0x026f, B:63:0x0273, B:66:0x0284, B:68:0x0288, B:71:0x0299, B:73:0x029d, B:76:0x02ae, B:78:0x02b2, B:81:0x02c3, B:83:0x02c7, B:85:0x02cd, B:108:0x0253, B:112:0x0207), top: B:41:0x01e0, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02b2 A[Catch: RuntimeException -> 0x0203, TryCatch #3 {RuntimeException -> 0x0203, blocks: (B:42:0x01e0, B:44:0x01ee, B:46:0x01f4, B:49:0x021a, B:51:0x021e, B:52:0x022d, B:54:0x0231, B:55:0x0240, B:57:0x0244, B:59:0x024a, B:61:0x026f, B:63:0x0273, B:66:0x0284, B:68:0x0288, B:71:0x0299, B:73:0x029d, B:76:0x02ae, B:78:0x02b2, B:81:0x02c3, B:83:0x02c7, B:85:0x02cd, B:108:0x0253, B:112:0x0207), top: B:41:0x01e0, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02c7 A[Catch: RuntimeException -> 0x0203, TRY_LEAVE, TryCatch #3 {RuntimeException -> 0x0203, blocks: (B:42:0x01e0, B:44:0x01ee, B:46:0x01f4, B:49:0x021a, B:51:0x021e, B:52:0x022d, B:54:0x0231, B:55:0x0240, B:57:0x0244, B:59:0x024a, B:61:0x026f, B:63:0x0273, B:66:0x0284, B:68:0x0288, B:71:0x0299, B:73:0x029d, B:76:0x02ae, B:78:0x02b2, B:81:0x02c3, B:83:0x02c7, B:85:0x02cd, B:108:0x0253, B:112:0x0207), top: B:41:0x01e0, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(xb2 xb2Var) {
        int i;
        p33 p33Var;
        String trim;
        int i2;
        int i3;
        int i4;
        float f;
        int i5;
        int i6;
        int parseInt;
        int parseInt2;
        int i7 = 6;
        int i8 = 7;
        int i9 = 2;
        int i10 = 0;
        while (true) {
            String b = xb2Var.b();
            if (b == null) {
                return;
            }
            char c = '[';
            if ("[Script Info]".equalsIgnoreCase(b)) {
                while (true) {
                    String b2 = xb2Var.b();
                    if (b2 != null) {
                        int i11 = xb2Var.c;
                        int i12 = xb2Var.b;
                        if (i11 - i12 == 0 || (xb2Var.a[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) != 91) {
                            String[] split = b2.split(":");
                            if (split.length == i9) {
                                String a = lh.a(split[i10].trim());
                                a.getClass();
                                if (a.equals("playresx")) {
                                    this.p = Float.parseFloat(split[1].trim());
                                } else if (a.equals("playresy")) {
                                    try {
                                        this.q = Float.parseFloat(split[1].trim());
                                    } catch (NumberFormatException unused) {
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                if ("[V4+ Styles]".equalsIgnoreCase(b)) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    while (true) {
                        n33 n33Var = null;
                        while (true) {
                            String b3 = xb2Var.b();
                            if (b3 != null) {
                                int i13 = xb2Var.c;
                                int i14 = xb2Var.b;
                                if (i13 - i14 == 0 || (xb2Var.a[i14] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) != c) {
                                    if (b3.startsWith("Format:")) {
                                        String[] split2 = TextUtils.split(b3.substring(i8), StringUtils.COMMA);
                                        int i15 = -1;
                                        int i16 = -1;
                                        int i17 = -1;
                                        int i18 = -1;
                                        int i19 = -1;
                                        int i20 = -1;
                                        int i21 = -1;
                                        int i22 = -1;
                                        int i23 = -1;
                                        int i24 = -1;
                                        for (int i25 = i10; i25 < split2.length; i25++) {
                                            String a2 = lh.a(split2[i25].trim());
                                            a2.getClass();
                                            switch (a2.hashCode()) {
                                                case -1178781136:
                                                    if (a2.equals("italic")) {
                                                        i = i10;
                                                        break;
                                                    }
                                                    i = -1;
                                                    break;
                                                case -1026963764:
                                                    if (a2.equals("underline")) {
                                                        i = 1;
                                                        break;
                                                    }
                                                    i = -1;
                                                    break;
                                                case -192095652:
                                                    if (a2.equals("strikeout")) {
                                                        i = 2;
                                                        break;
                                                    }
                                                    i = -1;
                                                    break;
                                                case -70925746:
                                                    if (a2.equals("primarycolour")) {
                                                        i = 3;
                                                        break;
                                                    }
                                                    i = -1;
                                                    break;
                                                case 3029637:
                                                    if (a2.equals("bold")) {
                                                        i = 4;
                                                        break;
                                                    }
                                                    i = -1;
                                                    break;
                                                case 3373707:
                                                    if (a2.equals("name")) {
                                                        i = 5;
                                                        break;
                                                    }
                                                    i = -1;
                                                    break;
                                                case 366554320:
                                                    if (a2.equals(VastAttributes.FONT_SIZE)) {
                                                        i = i7;
                                                        break;
                                                    }
                                                    i = -1;
                                                    break;
                                                case 767321349:
                                                    if (a2.equals("borderstyle")) {
                                                        i = 7;
                                                        break;
                                                    }
                                                    i = -1;
                                                    break;
                                                case 1767875043:
                                                    if (a2.equals("alignment")) {
                                                        i = 8;
                                                        break;
                                                    }
                                                    i = -1;
                                                    break;
                                                case 1988365454:
                                                    if (a2.equals("outlinecolour")) {
                                                        i = 9;
                                                        break;
                                                    }
                                                    i = -1;
                                                    break;
                                                default:
                                                    i = -1;
                                                    break;
                                            }
                                            switch (i) {
                                                case 0:
                                                    i21 = i25;
                                                    break;
                                                case 1:
                                                    i22 = i25;
                                                    break;
                                                case 2:
                                                    i23 = i25;
                                                    break;
                                                case 3:
                                                    i17 = i25;
                                                    break;
                                                case 4:
                                                    i20 = i25;
                                                    break;
                                                case 5:
                                                    i15 = i25;
                                                    break;
                                                case 6:
                                                    i19 = i25;
                                                    break;
                                                case 7:
                                                    i24 = i25;
                                                    break;
                                                case 8:
                                                    i16 = i25;
                                                    break;
                                                case 9:
                                                    i18 = i25;
                                                    break;
                                            }
                                        }
                                        if (i15 != -1) {
                                            n33Var = new n33(i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, split2.length);
                                            i8 = 7;
                                        }
                                    } else {
                                        if (b3.startsWith("Style:")) {
                                            if (n33Var == null) {
                                                gh1.d("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: ".concat(b3));
                                            } else if (b3.startsWith("Style:")) {
                                                String[] split3 = TextUtils.split(b3.substring(i7), StringUtils.COMMA);
                                                int length = split3.length;
                                                int i26 = n33Var.k;
                                                if (length != i26) {
                                                    int length2 = split3.length;
                                                    int i27 = sb3.a;
                                                    Locale locale = Locale.US;
                                                    gh1.d("SsaStyle", "Skipping malformed 'Style:' line (expected " + i26 + " values, found " + length2 + "): '" + b3 + "'");
                                                } else {
                                                    try {
                                                        trim = split3[n33Var.a].trim();
                                                        i2 = n33Var.b;
                                                    } catch (RuntimeException e) {
                                                        e = e;
                                                        gh1.d("SsaStyle", gh1.a("Skipping malformed 'Style:' line: '" + b3 + "'", e));
                                                        p33Var = null;
                                                        if (p33Var != null) {
                                                        }
                                                        i7 = 6;
                                                        i8 = 7;
                                                        i10 = 0;
                                                        c = '[';
                                                    }
                                                    if (i2 != -1) {
                                                        String trim2 = split3[i2].trim();
                                                        try {
                                                            parseInt2 = Integer.parseInt(trim2.trim());
                                                        } catch (NumberFormatException unused2) {
                                                        }
                                                        switch (parseInt2) {
                                                            case 1:
                                                            case 2:
                                                            case 3:
                                                            case 4:
                                                            case 5:
                                                            case 6:
                                                            case 7:
                                                            case 8:
                                                            case 9:
                                                                i3 = parseInt2;
                                                                break;
                                                            default:
                                                                gh1.d("SsaStyle", "Ignoring unknown alignment: " + trim2);
                                                                break;
                                                        }
                                                        int i28 = n33Var.c;
                                                        Integer b4 = i28 == -1 ? p33.b(split3[i28].trim()) : null;
                                                        int i29 = n33Var.d;
                                                        Integer b5 = i29 == -1 ? p33.b(split3[i29].trim()) : null;
                                                        i4 = n33Var.e;
                                                        if (i4 != -1) {
                                                            String trim3 = split3[i4].trim();
                                                            try {
                                                                f = Float.parseFloat(trim3);
                                                            } catch (NumberFormatException e2) {
                                                                gh1.d("SsaStyle", gh1.a("Failed to parse font size: '" + trim3 + "'", e2));
                                                            }
                                                            float f2 = f;
                                                            int i30 = n33Var.f;
                                                            boolean z = i30 == -1 && p33.a(split3[i30].trim());
                                                            int i31 = n33Var.g;
                                                            boolean z2 = i31 == -1 && p33.a(split3[i31].trim());
                                                            int i32 = n33Var.h;
                                                            boolean z3 = i32 == -1 && p33.a(split3[i32].trim());
                                                            int i33 = n33Var.i;
                                                            boolean z4 = i33 == -1 && p33.a(split3[i33].trim());
                                                            i5 = n33Var.j;
                                                            if (i5 != -1) {
                                                                String trim4 = split3[i5].trim();
                                                                try {
                                                                    parseInt = Integer.parseInt(trim4.trim());
                                                                } catch (NumberFormatException unused3) {
                                                                }
                                                                if (parseInt == 1 || parseInt == 3) {
                                                                    i6 = parseInt;
                                                                    p33Var = new p33(trim, i3, b4, b5, f2, z, z2, z3, z4, i6);
                                                                    if (p33Var != null) {
                                                                        linkedHashMap.put(p33Var.a, p33Var);
                                                                    }
                                                                    i7 = 6;
                                                                    i8 = 7;
                                                                    i10 = 0;
                                                                    c = '[';
                                                                }
                                                                gh1.d("SsaStyle", "Ignoring unknown BorderStyle: " + trim4);
                                                            }
                                                            i6 = -1;
                                                            p33Var = new p33(trim, i3, b4, b5, f2, z, z2, z3, z4, i6);
                                                            if (p33Var != null) {
                                                            }
                                                            i7 = 6;
                                                            i8 = 7;
                                                            i10 = 0;
                                                            c = '[';
                                                        }
                                                        f = -3.4028235E38f;
                                                        float f22 = f;
                                                        int i302 = n33Var.f;
                                                        if (i302 == -1) {
                                                        }
                                                        int i312 = n33Var.g;
                                                        if (i312 == -1) {
                                                        }
                                                        int i322 = n33Var.h;
                                                        if (i322 == -1) {
                                                        }
                                                        int i332 = n33Var.i;
                                                        if (i332 == -1) {
                                                        }
                                                        i5 = n33Var.j;
                                                        if (i5 != -1) {
                                                        }
                                                        i6 = -1;
                                                        p33Var = new p33(trim, i3, b4, b5, f22, z, z2, z3, z4, i6);
                                                        if (p33Var != null) {
                                                        }
                                                        i7 = 6;
                                                        i8 = 7;
                                                        i10 = 0;
                                                        c = '[';
                                                    }
                                                    i3 = -1;
                                                    int i282 = n33Var.c;
                                                    if (i282 == -1) {
                                                    }
                                                    int i292 = n33Var.d;
                                                    if (i292 == -1) {
                                                    }
                                                    i4 = n33Var.e;
                                                    if (i4 != -1) {
                                                    }
                                                    f = -3.4028235E38f;
                                                    float f222 = f;
                                                    int i3022 = n33Var.f;
                                                    if (i3022 == -1) {
                                                    }
                                                    int i3122 = n33Var.g;
                                                    if (i3122 == -1) {
                                                    }
                                                    int i3222 = n33Var.h;
                                                    if (i3222 == -1) {
                                                    }
                                                    int i3322 = n33Var.i;
                                                    if (i3322 == -1) {
                                                    }
                                                    i5 = n33Var.j;
                                                    if (i5 != -1) {
                                                    }
                                                    i6 = -1;
                                                    p33Var = new p33(trim, i3, b4, b5, f222, z, z2, z3, z4, i6);
                                                    if (p33Var != null) {
                                                    }
                                                    i7 = 6;
                                                    i8 = 7;
                                                    i10 = 0;
                                                    c = '[';
                                                }
                                                p33Var = null;
                                                if (p33Var != null) {
                                                }
                                                i7 = 6;
                                                i8 = 7;
                                                i10 = 0;
                                                c = '[';
                                            } else {
                                                throw new IllegalArgumentException();
                                            }
                                        }
                                        i7 = 6;
                                        i8 = 7;
                                        i10 = 0;
                                        c = '[';
                                    }
                                }
                            }
                        }
                        i8 = 7;
                    }
                } else if ("[V4 Styles]".equalsIgnoreCase(b)) {
                    gh1.c("SsaDecoder", "[V4 Styles] are not supported");
                } else if ("[Events]".equalsIgnoreCase(b)) {
                    return;
                }
                i7 = 6;
                i8 = 7;
                i9 = 2;
                i10 = 0;
            }
        }
    }

    public static long a(String str) {
        Matcher matcher = r.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i = sb3.a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }

    public static int a(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i, Long.valueOf(j));
        arrayList2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i - 1)));
        return i;
    }
}
