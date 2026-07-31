package yads;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public final class a53 extends uz2 {
    public static final Pattern o = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    public static final Pattern p = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder m = new StringBuilder();
    public final ArrayList n = new ArrayList();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // yads.uz2
    public final c53 a(byte[] bArr, int i, boolean z) {
        String b;
        String str;
        xb2 xb2Var;
        char c;
        ih1 ih1Var;
        char c2;
        int i2;
        float f;
        float f2;
        s20 s20Var;
        a53 a53Var = this;
        ArrayList arrayList = new ArrayList();
        ih1 ih1Var2 = new ih1();
        xb2 xb2Var2 = new xb2(bArr, i);
        while (true) {
            String b2 = xb2Var2.b();
            if (b2 != null) {
                if (b2.length() != 0) {
                    try {
                        Integer.parseInt(b2);
                        b = xb2Var2.b();
                    } catch (NumberFormatException unused) {
                        gh1.d("SubripDecoder", "Skipping invalid index: ".concat(b2));
                    }
                    if (b == null) {
                        gh1.d("SubripDecoder", "Unexpected end");
                    } else {
                        Matcher matcher = o.matcher(b);
                        if (matcher.matches()) {
                            ih1Var2.a(a(matcher, 1));
                            ih1Var2.a(a(matcher, 6));
                            a53Var.m.setLength(0);
                            a53Var.n.clear();
                            for (String b3 = xb2Var2.b(); !TextUtils.isEmpty(b3); b3 = xb2Var2.b()) {
                                if (a53Var.m.length() > 0) {
                                    a53Var.m.append("<br>");
                                }
                                StringBuilder sb = a53Var.m;
                                ArrayList arrayList2 = a53Var.n;
                                String trim = b3.trim();
                                StringBuilder sb2 = new StringBuilder(trim);
                                Matcher matcher2 = p.matcher(trim);
                                int i3 = 0;
                                while (matcher2.find()) {
                                    String group = matcher2.group();
                                    arrayList2.add(group);
                                    int start = matcher2.start() - i3;
                                    int length = group.length();
                                    sb2.replace(start, start + length, "");
                                    i3 += length;
                                }
                                sb.append(sb2.toString());
                            }
                            Spanned fromHtml = Html.fromHtml(a53Var.m.toString());
                            int i4 = 0;
                            while (true) {
                                if (i4 < a53Var.n.size()) {
                                    str = (String) a53Var.n.get(i4);
                                    if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                        i4++;
                                    }
                                } else {
                                    str = null;
                                }
                            }
                            if (str == null) {
                                s20Var = new s20(fromHtml, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                ih1Var = ih1Var2;
                                xb2Var = xb2Var2;
                            } else {
                                xb2Var = xb2Var2;
                                switch (str.hashCode()) {
                                    case -685620710:
                                        if (str.equals("{\\an1}")) {
                                            c = 0;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -685620679:
                                        if (str.equals("{\\an2}")) {
                                            c = 6;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -685620648:
                                        if (str.equals("{\\an3}")) {
                                            c = 3;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -685620617:
                                        if (str.equals("{\\an4}")) {
                                            c = 1;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -685620586:
                                        if (str.equals("{\\an5}")) {
                                            c = 7;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -685620555:
                                        if (str.equals("{\\an6}")) {
                                            c = 4;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -685620524:
                                        if (str.equals("{\\an7}")) {
                                            c = 2;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -685620493:
                                        if (str.equals("{\\an8}")) {
                                            c = '\b';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -685620462:
                                        if (str.equals("{\\an9}")) {
                                            c = 5;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    default:
                                        c = 65535;
                                        break;
                                }
                                ih1Var = ih1Var2;
                                int i5 = (c == 0 || c == 1 || c == 2) ? 0 : (c == 3 || c == 4 || c == 5) ? 2 : 1;
                                switch (str.hashCode()) {
                                    case -685620710:
                                        if (str.equals("{\\an1}")) {
                                            c2 = 0;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -685620679:
                                        if (str.equals("{\\an2}")) {
                                            c2 = 1;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -685620648:
                                        if (str.equals("{\\an3}")) {
                                            c2 = 2;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -685620617:
                                        if (str.equals("{\\an4}")) {
                                            c2 = 6;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -685620586:
                                        if (str.equals("{\\an5}")) {
                                            c2 = 7;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -685620555:
                                        if (str.equals("{\\an6}")) {
                                            c2 = '\b';
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -685620524:
                                        if (str.equals("{\\an7}")) {
                                            c2 = 3;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -685620493:
                                        if (str.equals("{\\an8}")) {
                                            c2 = 4;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -685620462:
                                        if (str.equals("{\\an9}")) {
                                            c2 = 5;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    default:
                                        c2 = 65535;
                                        break;
                                }
                                int i6 = (c2 == 0 || c2 == 1 || c2 == 2) ? 2 : (c2 == 3 || c2 == 4 || c2 == 5) ? 0 : 1;
                                float f3 = 0.5f;
                                if (i5 != 0) {
                                    i2 = 1;
                                    if (i5 == 1) {
                                        f = 0.5f;
                                    } else {
                                        if (i5 != 2) {
                                            throw new IllegalArgumentException();
                                        }
                                        f = 0.92f;
                                    }
                                } else {
                                    i2 = 1;
                                    f = 0.08f;
                                }
                                if (i6 == 0) {
                                    f3 = 0.08f;
                                } else if (i6 != i2) {
                                    if (i6 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    f2 = 0.92f;
                                    s20Var = new s20(fromHtml, null, null, null, f2, 0, i6, f, i5, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                }
                                f2 = f3;
                                s20Var = new s20(fromHtml, null, null, null, f2, 0, i6, f, i5, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                            }
                            arrayList.add(s20Var);
                            arrayList.add(s20.s);
                            a53Var = this;
                            xb2Var2 = xb2Var;
                            ih1Var2 = ih1Var;
                        } else {
                            gh1.d("SubripDecoder", "Skipping invalid timing: ".concat(b));
                            a53Var = this;
                        }
                    }
                }
            }
        }
        return new b53((s20[]) arrayList.toArray(new s20[0]), ih1Var2.a());
    }

    public static long a(Matcher matcher, int i) {
        String group = matcher.group(i + 1);
        long parseLong = group != null ? Long.parseLong(group) * 3600000 : 0L;
        String group2 = matcher.group(i + 2);
        group2.getClass();
        long parseLong2 = (Long.parseLong(group2) * 60000) + parseLong;
        String group3 = matcher.group(i + 3);
        group3.getClass();
        long parseLong3 = (Long.parseLong(group3) * 1000) + parseLong2;
        String group4 = matcher.group(i + 4);
        if (group4 != null) {
            parseLong3 += Long.parseLong(group4);
        }
        return parseLong3 * 1000;
    }
}
