package n1;

/* loaded from: classes.dex */
public abstract class g extends f {
    public static boolean s(String str, String str2) {
        return str.indexOf(str2, 0) >= 0;
    }

    public static String t(String str) {
        g1.f.e(str, "<this>");
        g1.f.e(str, "missingDelimiterValue");
        int lastIndexOf = str.lastIndexOf(46, str.length() - 1);
        if (lastIndexOf == -1) {
            return str;
        }
        String substring = str.substring(lastIndexOf + 1, str.length());
        g1.f.d(substring, "substring(...)");
        return substring;
    }
}
