package yads;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.ironsource.O6;
import com.ironsource.X3;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public abstract class ro3 {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    public static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    public static final Map c;
    public static final Map d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        d = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static SpannedString a(String str, String str2, List list) {
        int i;
        char c2;
        int i2;
        char c3;
        int i3 = -1;
        int i4 = 2;
        int i5 = 1;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i6 = 0;
        while (true) {
            String str3 = "";
            if (i6 >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    a(str, (oo3) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                a(str, new oo3("", 0, "", Collections.emptySet()), Collections.emptyList(), spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char charAt = str2.charAt(i6);
            if (charAt == '&') {
                i6 += i5;
                int indexOf = str2.indexOf(59, i6);
                int indexOf2 = str2.indexOf(32, i6);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    String substring = str2.substring(i6, indexOf);
                    substring.getClass();
                    switch (substring.hashCode()) {
                        case 3309:
                            if (substring.equals("gt")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3464:
                            if (substring.equals("lt")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 96708:
                            if (substring.equals("amp")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3374865:
                            if (substring.equals("nbsp")) {
                                c3 = 3;
                                break;
                            }
                            c3 = 65535;
                            break;
                        default:
                            c3 = 65535;
                            break;
                    }
                    switch (c3) {
                        case 0:
                            spannableStringBuilder.append('>');
                            break;
                        case 1:
                            spannableStringBuilder.append('<');
                            break;
                        case 2:
                            spannableStringBuilder.append('&');
                            break;
                        case 3:
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            gh1.d("WebvttCueParser", "ignoring unsupported entity: '&" + substring + ";'");
                            break;
                    }
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i2 = 1;
                    i6 = indexOf + 1;
                } else {
                    i2 = 1;
                    spannableStringBuilder.append(charAt);
                }
                i3 = -1;
                i4 = 2;
                i5 = i2;
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i6 += i5;
            } else {
                int i7 = i6 + 1;
                if (i7 < str2.length()) {
                    int i8 = str2.charAt(i7) == '/' ? i5 : 0;
                    int indexOf3 = str2.indexOf(62, i7);
                    i7 = indexOf3 == i3 ? str2.length() : indexOf3 + i5;
                    int i9 = i7 - 2;
                    int i10 = str2.charAt(i9) == '/' ? i5 : 0;
                    int i11 = i6 + (i8 != 0 ? i4 : i5);
                    if (i10 == 0) {
                        i9 = i7 - 1;
                    }
                    String substring2 = str2.substring(i11, i9);
                    if (!substring2.trim().isEmpty()) {
                        String trim = substring2.trim();
                        if (trim.isEmpty()) {
                            throw new IllegalArgumentException();
                        }
                        int i12 = sb3.a;
                        String str4 = trim.split("[ \\.]", i4)[0];
                        str4.getClass();
                        switch (str4.hashCode()) {
                            case 98:
                                if (str4.equals("b")) {
                                    i = 0;
                                    break;
                                }
                                i = -1;
                                break;
                            case 99:
                                if (str4.equals("c")) {
                                    i = i5;
                                    break;
                                }
                                i = -1;
                                break;
                            case 105:
                                if (str4.equals("i")) {
                                    i = i4;
                                    break;
                                }
                                i = -1;
                                break;
                            case ASSET_FAILED_STATUS_CODE_VALUE:
                                if (str4.equals("u")) {
                                    i = 3;
                                    break;
                                }
                                i = -1;
                                break;
                            case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                                if (str4.equals("v")) {
                                    i = 4;
                                    break;
                                }
                                i = -1;
                                break;
                            case 3650:
                                if (str4.equals("rt")) {
                                    i = 5;
                                    break;
                                }
                                i = -1;
                                break;
                            case 3314158:
                                if (str4.equals(O6.q)) {
                                    i = 6;
                                    break;
                                }
                                i = -1;
                                break;
                            case 3511770:
                                if (str4.equals("ruby")) {
                                    i = 7;
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
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                if (i8 != 0) {
                                    while (!arrayDeque.isEmpty()) {
                                        oo3 oo3Var = (oo3) arrayDeque.pop();
                                        a(str, oo3Var, arrayList, spannableStringBuilder, list);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            arrayList.add(new no3(oo3Var, spannableStringBuilder.length()));
                                        }
                                        if (oo3Var.a.equals(str4)) {
                                        }
                                    }
                                } else if (i10 == 0) {
                                    int length = spannableStringBuilder.length();
                                    String trim2 = substring2.trim();
                                    if (trim2.isEmpty()) {
                                        throw new IllegalArgumentException();
                                    }
                                    int indexOf4 = trim2.indexOf(" ");
                                    if (indexOf4 == -1) {
                                        c2 = 0;
                                    } else {
                                        str3 = trim2.substring(indexOf4).trim();
                                        c2 = 0;
                                        trim2 = trim2.substring(0, indexOf4);
                                    }
                                    String[] split = trim2.split("\\.", -1);
                                    String str5 = split[c2];
                                    HashSet hashSet = new HashSet();
                                    for (int i13 = i5; i13 < split.length; i13 += i5) {
                                        hashSet.add(split[i13]);
                                    }
                                    arrayDeque.push(new oo3(str5, length, str3, hashSet));
                                }
                            default:
                                i6 = i7;
                                i3 = -1;
                                break;
                        }
                    }
                }
                i6 = i7;
                i3 = -1;
            }
        }
    }

    public static void b(String str, qo3 qo3Var) {
        String substring;
        int i = 2;
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            substring = str.substring(indexOf + 1);
            substring.getClass();
            switch (substring) {
                case "center":
                case "middle":
                    i = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i = 0;
                    break;
                default:
                    gh1.d("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                    i = Integer.MIN_VALUE;
                    break;
            }
            qo3Var.g = i;
            str = str.substring(0, indexOf);
        }
        if (!str.endsWith("%")) {
            qo3Var.e = Integer.parseInt(str);
            qo3Var.f = 1;
            return;
        }
        int i2 = to3.$r8$clinit;
        if (!str.endsWith("%")) {
            throw new NumberFormatException("Percentages must end with %");
        }
        qo3Var.e = Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        qo3Var.f = 0;
    }

    public static mo3 a(String str, Matcher matcher, xb2 xb2Var, ArrayList arrayList) {
        qo3 qo3Var = new qo3();
        try {
            String group = matcher.group(1);
            group.getClass();
            qo3Var.a = to3.a(group);
            String group2 = matcher.group(2);
            group2.getClass();
            qo3Var.b = to3.a(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            a(group3, qo3Var);
            StringBuilder sb = new StringBuilder();
            String b2 = xb2Var.b();
            while (!TextUtils.isEmpty(b2)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(b2.trim());
                b2 = xb2Var.b();
            }
            qo3Var.c = a(str, sb.toString(), arrayList);
            return new mo3(qo3Var.a().a(), qo3Var.a, qo3Var.b);
        } catch (NumberFormatException unused) {
            gh1.d("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void a(String str, qo3 qo3Var) {
        int i;
        int i2;
        String substring;
        int i3;
        Matcher matcher = b.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            group2.getClass();
            try {
            } catch (NumberFormatException unused) {
                gh1.d("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
            if ("line".equals(group)) {
                b(group2, qo3Var);
            } else if ("align".equals(group)) {
                switch (group2) {
                    case "center":
                    case "middle":
                        i = 2;
                        break;
                    case "end":
                        i = 3;
                        break;
                    case "left":
                        i = 4;
                        break;
                    case "right":
                        i = 5;
                        break;
                    case "start":
                        i = 1;
                        break;
                    default:
                        gh1.d("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                        i = 2;
                        break;
                }
                qo3Var.d = i;
            } else {
                if (X3.i.L.equals(group)) {
                    int indexOf = group2.indexOf(44);
                    if (indexOf != r9) {
                        substring = group2.substring(indexOf + 1);
                        substring.getClass();
                        switch (substring) {
                            case "line-left":
                            case "start":
                                i3 = 0;
                                break;
                            case "center":
                            case "middle":
                                i3 = 1;
                                break;
                            case "line-right":
                            case "end":
                                i3 = 2;
                                break;
                            default:
                                gh1.d("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                                i3 = Integer.MIN_VALUE;
                                break;
                        }
                        qo3Var.i = i3;
                        group2 = group2.substring(0, indexOf);
                    }
                    int i4 = to3.$r8$clinit;
                    if (group2.endsWith("%")) {
                        qo3Var.h = Float.parseFloat(group2.substring(0, group2.length() - 1)) / 100.0f;
                    } else {
                        throw new NumberFormatException("Percentages must end with %");
                    }
                } else if ("size".equals(group)) {
                    int i5 = to3.$r8$clinit;
                    if (group2.endsWith("%")) {
                        qo3Var.j = Float.parseFloat(group2.substring(0, group2.length() - 1)) / 100.0f;
                    } else {
                        throw new NumberFormatException("Percentages must end with %");
                    }
                } else if ("vertical".equals(group)) {
                    if (group2.equals("lr")) {
                        i2 = 2;
                    } else if (group2.equals("rl")) {
                        i2 = 1;
                    } else {
                        gh1.d("WebvttCueParser", "Invalid 'vertical' value: ".concat(group2));
                        i2 = Integer.MIN_VALUE;
                    }
                    qo3Var.k = i2;
                } else {
                    gh1.d("WebvttCueParser", "Unknown cue setting " + group + ":" + group2);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void a(String str, oo3 oo3Var, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList;
        int i6;
        List list3 = list2;
        int i7 = oo3Var.b;
        int length = spannableStringBuilder.length();
        String str2 = oo3Var.a;
        str2.getClass();
        int i8 = 1;
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals("")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 98:
                if (str2.equals("b")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 99:
                if (str2.equals("c")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 105:
                if (str2.equals("i")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case ASSET_FAILED_STATUS_CODE_VALUE:
                if (str2.equals("u")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                if (str2.equals("v")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 3314158:
                if (str2.equals(O6.q)) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 3511770:
                if (str2.equals("ruby")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
            case 5:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i7, length, 33);
                break;
            case 2:
                for (String str3 : oo3Var.d) {
                    Map map = c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i7, length, 33);
                    } else {
                        Map map2 = d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i7, length, 33);
                        }
                    }
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i7, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i7, length, 33);
                break;
            case 7:
                ArrayList arrayList2 = new ArrayList();
                for (int i9 = 0; i9 < list2.size(); i9++) {
                    lo3 lo3Var = (lo3) list3.get(i9);
                    int a2 = lo3Var.a(str, oo3Var.a, oo3Var.d, oo3Var.c);
                    if (a2 > 0) {
                        arrayList2.add(new po3(a2, lo3Var));
                    }
                }
                Collections.sort(arrayList2);
                for (int i10 = 0; i10 < arrayList2.size() && ((po3) arrayList2.get(i10)).c.p == -1; i10++) {
                }
                ArrayList arrayList3 = new ArrayList(list.size());
                arrayList3.addAll(list);
                Collections.sort(arrayList3, no3.c);
                int i11 = oo3Var.b;
                int i12 = 0;
                int i13 = 0;
                while (i12 < arrayList3.size()) {
                    if ("rt".equals(((no3) arrayList3.get(i12)).a.a)) {
                        no3 no3Var = (no3) arrayList3.get(i12);
                        oo3 oo3Var2 = no3Var.a;
                        ArrayList arrayList4 = new ArrayList();
                        int i14 = 0;
                        while (i14 < list2.size()) {
                            lo3 lo3Var2 = (lo3) list3.get(i14);
                            ArrayList arrayList5 = arrayList3;
                            int a3 = lo3Var2.a(str, oo3Var2.a, oo3Var2.d, oo3Var2.c);
                            if (a3 > 0) {
                                arrayList4.add(new po3(a3, lo3Var2));
                            }
                            i14++;
                            arrayList3 = arrayList5;
                            list3 = list2;
                        }
                        arrayList = arrayList3;
                        Collections.sort(arrayList4);
                        for (int i15 = 0; i15 < arrayList4.size() && ((po3) arrayList4.get(i15)).c.p == -1; i15++) {
                        }
                        int i16 = no3Var.a.b - i13;
                        int i17 = no3Var.b - i13;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i16, i17);
                        spannableStringBuilder.delete(i16, i17);
                        subSequence.toString();
                        spannableStringBuilder.setSpan(new ms2(), i11, i16, 33);
                        i13 += subSequence.length();
                        i11 = i16;
                        i6 = 1;
                    } else {
                        arrayList = arrayList3;
                        i6 = i8;
                    }
                    i12 += i6;
                    i8 = i6;
                    arrayList3 = arrayList;
                    list3 = list2;
                }
                break;
            default:
                return;
        }
        ArrayList arrayList6 = new ArrayList();
        for (int i18 = 0; i18 < list2.size(); i18++) {
            lo3 lo3Var3 = (lo3) list2.get(i18);
            int a4 = lo3Var3.a(str, oo3Var.a, oo3Var.d, oo3Var.c);
            if (a4 > 0) {
                arrayList6.add(new po3(a4, lo3Var3));
            }
        }
        Collections.sort(arrayList6);
        for (int i19 = 0; i19 < arrayList6.size(); i19 += i4) {
            lo3 lo3Var4 = ((po3) arrayList6.get(i19)).c;
            int i20 = lo3Var4.l;
            if (i20 == -1 && lo3Var4.m == -1) {
                i = -1;
            } else {
                i = (i20 == 1 ? (char) 1 : (char) 0) | (lo3Var4.m == 1 ? (char) 2 : (char) 0);
            }
            if (i != -1) {
                int i21 = lo3Var4.l;
                if (i21 == -1 && lo3Var4.m == -1) {
                    i5 = -1;
                    i2 = 1;
                } else {
                    i2 = 1;
                    i5 = (i21 == 1 ? 1 : 0) | (lo3Var4.m == 1 ? 2 : 0);
                }
                p23.a(spannableStringBuilder, new StyleSpan(i5), i7, length);
            } else {
                i2 = 1;
            }
            if (lo3Var4.j == i2) {
                i3 = 33;
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i7, length, 33);
            } else {
                i3 = 33;
            }
            if (lo3Var4.k == i2) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i7, length, i3);
            }
            if (lo3Var4.g) {
                if (lo3Var4.g) {
                    p23.a(spannableStringBuilder, new ForegroundColorSpan(lo3Var4.f), i7, length);
                } else {
                    throw new IllegalStateException("Font color not defined");
                }
            }
            if (lo3Var4.i) {
                if (lo3Var4.i) {
                    p23.a(spannableStringBuilder, new BackgroundColorSpan(lo3Var4.h), i7, length);
                } else {
                    throw new IllegalStateException("Background color not defined.");
                }
            }
            if (lo3Var4.e != null) {
                p23.a(spannableStringBuilder, new TypefaceSpan(lo3Var4.e), i7, length);
            }
            int i22 = lo3Var4.n;
            if (i22 != 1) {
                if (i22 == 2) {
                    p23.a(spannableStringBuilder, new RelativeSizeSpan(lo3Var4.o), i7, length);
                } else if (i22 == 3) {
                    p23.a(spannableStringBuilder, new RelativeSizeSpan(lo3Var4.o / 100.0f), i7, length);
                }
                i4 = 1;
            } else {
                i4 = 1;
                p23.a(spannableStringBuilder, new AbsoluteSizeSpan((int) lo3Var4.o, true), i7, length);
            }
            if (lo3Var4.q) {
                spannableStringBuilder.setSpan(new f01(), i7, length, 33);
            }
        }
    }
}
