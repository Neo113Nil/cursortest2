package com.safedk.android.analytics.brandsafety.creatives;

import com.safedk.android.utils.Logger;
import com.safedk.android.utils.k;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes14.dex */
public class e {
    public static final String a = "(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)";
    public static final String b = "(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)";
    public static final String c = "(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)(?:\\\\*/)";
    public static final String d = "(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)";
    public static final String e = "(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)?";
    public static final String f = "(?:\\\\+x3D|%3d|=)";
    public static final String g = "(?:\\\\+x2B|%2b|\\+)";
    public static final String h = "[\\s\\S]*?";
    public static final String i = "(?:%26|\\\\+x26|&)";
    public static final String j = "(?:%24|\\\\+x24|$)";
    public static final String k = "(?:%21|\\\\+x21|!)";
    public static final String l = "(?:%5B|\\\\+x5B|\\[|\\\\n)";
    public static final String m = "(?:%5D|\\\\+x5D|\\])";
    public static final String n = "\\)";
    protected static final String o = "(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)<TAG_NAME>[\\s\\S]*?(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)([\\s\\S]*?)(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)(?:\\\\*/)<TAG_NAME>(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)";
    private static final String p = "ParserBase";

    public static String a(String str) {
        return o.replace("<TAG_NAME>", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(String str, boolean z) {
        String g2;
        List<String> a2;
        if (z) {
            try {
                g2 = k.g(str);
            } catch (Throwable th) {
                Logger.d(p, "CDATA info decode failed: ", str);
            }
            a2 = a(a(), g2, 1, false);
            if (a2.size() > 0) {
                str = a2.get(0);
            }
            return str.trim();
        }
        g2 = str;
        a2 = a(a(), g2, 1, false);
        if (a2.size() > 0) {
        }
        return str.trim();
    }

    public static List<String> a(Pattern pattern, String str, int i2, boolean z) {
        String group;
        ArrayList arrayList = new ArrayList();
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            if (i2 >= 0) {
                group = matcher.group(i2);
            } else {
                group = matcher.group();
            }
            if (group != null) {
                if (z) {
                    arrayList.add(k.g(group.trim()));
                } else {
                    arrayList.add(group.trim());
                }
            }
        }
        return arrayList;
    }

    public static List<String> a(Pattern pattern, String str, int i2, int i3, boolean z) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(i2);
            String group2 = matcher.group(i3);
            if (group != null) {
                if (z) {
                    arrayList.add(k.g(group.trim()));
                } else {
                    arrayList.add(group.trim());
                }
            }
            if (group2 != null) {
                if (z) {
                    arrayList.add(k.g(group2.trim()));
                } else {
                    arrayList.add(group2.trim());
                }
            }
        }
        return arrayList;
    }

    public static Pattern a() {
        return com.safedk.android.utils.g.a("(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)(?:%21|\\\\+x21|!)(?:%5B|\\\\+x5B|\\[|\\\\n)CDATA(?:%5B|\\\\+x5B|\\[|\\\\n)([\\s\\S]*)(?:%5D|\\\\+x5D|\\])(?:%5D|\\\\+x5D|\\])(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)");
    }

    public static Pattern b() {
        return com.safedk.android.utils.g.a("(?s)(<html>.+?</html>)|(%3Chtml%3E.+?%3C/html%3E)");
    }

    public static Pattern c() {
        return com.safedk.android.utils.g.a("(<body>.*?</body>)", 32);
    }

    public static Pattern d() {
        return com.safedk.android.utils.g.a("(<body.+?</body>)");
    }

    public static Pattern e() {
        return com.safedk.android.utils.g.a("<img[^>]*src=[\\\"']([^\\\"^']*)(.*)\\/>|image:url((.*))");
    }

    public static Pattern f() {
        return com.safedk.android.utils.g.a("href=\"(.*?)\"", 2);
    }

    public static Pattern g() {
        return com.safedk.android.utils.g.a("<video .*src=\"(\\S*?)\".*</video>");
    }

    public static Pattern h() {
        return com.safedk.android.utils.g.a("!--(.*?)--");
    }

    public static Pattern i() {
        return com.safedk.android.utils.g.a("[0-9]{2,3}\\.[0-9]{2,3}\\.[0-9]{2,3}\\.[0-9]{2,3}");
    }
}
