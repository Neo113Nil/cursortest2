package com.safedk.android.utils;

import android.text.TextUtils;
import android.util.Base64;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import org.slf4j.Marker;

/* loaded from: classes3.dex */
public class k {
    private static final String a = "StringUtils";

    public static boolean a(String str, String str2) {
        return str.contains(str2) && str.indexOf(str2) != str.lastIndexOf(str2);
    }

    public static int b(String str, String str2) {
        if (!str.contains(str2)) {
            return -1;
        }
        int indexOf = str.indexOf(str2);
        String substring = str.substring(indexOf + 1);
        if (substring.contains(str2)) {
            return indexOf + substring.indexOf(str2) + 1;
        }
        return -1;
    }

    public static boolean c(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        Logger.printFullVerboseLog(a, "stringSimilarity: s1 is: ", str);
        Logger.printFullVerboseLog(a, "stringSimilarity: s2 is: ", str2);
        if (str.length() != str2.length()) {
            Logger.d(a, "stringSimilarity: they don't have the same length s1=", Integer.valueOf(str.length()), " s2=", Integer.valueOf(str2.length()));
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str2.charAt(i)) {
                Logger.d(a, "stringSimilarity: they are not equal at char number i: s1[i]=", Character.valueOf(str.charAt(i)), " s2[i]=", Character.valueOf(str2.charAt(i)));
                return false;
            }
        }
        Logger.d(a, "stringSimilarity: they are equal!");
        return true;
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return str.replace("\\\\x21", "!").replace("\\\\x22", "\"").replace("\\\\x23", "#").replace("\\\\x24", "$").replace("\\\\x25", "%").replace("\\\\x26", X3.j.c).replace("\\\\x27", "'").replace("\\\\x28", "(").replace("\\\\x29", ")").replace("\\\\x2a", Marker.ANY_MARKER).replace("\\\\x2b", Marker.ANY_NON_NULL_MARKER).replace("\\\\x2c", StringUtils.COMMA).replace("\\\\x2d", "-").replace("\\\\x2e", ".").replace("\\\\x2f", "/").replace("\\\\x3a", ":").replace("\\\\x3b", ";").replace("\\\\x3c", "<").replace("\\\\x3d", "=").replace("\\\\x3e", ">").replace("\\\\x3f", "?").replace("\\\\x40", "@").replace("\\\\x5b", X3.j.d).replace("\\\\x5d", X3.j.e).replace("\\x21", "!").replace("\\x22", "\"").replace("\\x23", "#").replace("\\x24", "$").replace("\\x25", "%").replace("\\x26", X3.j.c).replace("\\x27", "'").replace("\\x28", "(").replace("\\x29", ")").replace("\\x2a", Marker.ANY_MARKER).replace("\\x2b", Marker.ANY_NON_NULL_MARKER).replace("\\x2c", StringUtils.COMMA).replace("\\x2f", "/").replace("\\x3a", ":").replace("\\x3b", ";").replace("\\x3c", "<").replace("\\x3d", "=").replace("\\x3e", ">").replace("\\x3f", "?").replace("\\x40", "@").replace("\\x5b", X3.j.d).replace("\\x5d", X3.j.e).replace("&amp;", X3.j.c);
        } catch (Throwable th) {
            Logger.e(a, "exception in unescapeUnicodeHex. input param is ", str, "' , error : ", th.getMessage());
            return str;
        }
    }

    public static String b(String str) {
        try {
            return new URI(c(str)).getHost();
        } catch (URISyntaxException e) {
            Logger.e(a, "getURLDomain - exception occurred: ", e);
            return null;
        }
    }

    public static Map<String, String> a(String str, boolean z) {
        try {
            if (str.contains("?")) {
                return b(str.substring(str.indexOf("?") + 1), z);
            }
            return null;
        } catch (Throwable th) {
            Logger.e(a, "Exception in splitQuery, url = ", str, th);
            return null;
        }
    }

    public static String d(String str, String str2) {
        Map<String, String> a2;
        try {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && (a2 = a(str, true)) != null && a2.containsKey(str2)) {
                return a2.get(str2);
            }
        } catch (Throwable th) {
            Logger.e(a, "Exception in getting query param decoded : ", th.getMessage(), th);
        }
        return null;
    }

    public static String e(String str, String str2) {
        Map<String, String> a2;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || (a2 = a(str, true)) == null || !a2.containsKey(str2)) {
            return null;
        }
        Logger.d(a, "param ", str2, " value is ", a2.get(str2));
        return a2.get(str2);
    }

    public static Map<String, String> b(String str, boolean z) {
        String[] strArr;
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str.contains(X3.j.c)) {
            strArr = str.split(X3.j.c);
        } else {
            strArr = new String[]{str};
        }
        try {
            for (String str3 : strArr) {
                int indexOf = str3.indexOf("=");
                if (indexOf != -1) {
                    String substring = str3.substring(0, indexOf);
                    if (z) {
                        substring = URLDecoder.decode(substring, "UTF-8");
                    }
                    int i = indexOf + 1;
                    if (i >= str3.length()) {
                        str2 = null;
                    } else {
                        str2 = str3.substring(i);
                        if (z) {
                            str2 = URLDecoder.decode(str2, "UTF-8");
                        }
                    }
                    linkedHashMap.put(substring, str2);
                }
            }
            return linkedHashMap;
        } catch (UnsupportedEncodingException e) {
            Logger.e(a, "Exception in splitQuery, queryParams = ", str, e);
            return null;
        } catch (Throwable th) {
            Logger.e(a, "Exception in splitQuery: ", th);
            return null;
        }
    }

    public static String f(String str, String str2) {
        if (!str.contains("?")) {
            return str;
        }
        return str.replaceFirst("(?<=[?&])" + str2 + "=.*?(&|$)", "").replaceFirst("[?&]$", "");
    }

    public static String c(String str) {
        if (str != null && str.contains("?")) {
            return str.substring(0, str.indexOf("?"));
        }
        return str;
    }

    public static String a(String str, String[] strArr) {
        if (strArr == null) {
            return str;
        }
        int length = strArr.length;
        String str2 = str;
        int i = 0;
        while (i < length) {
            String str3 = strArr[i];
            String f = f(str2, str3);
            if (!f.equals(str2)) {
                Logger.d(a, "remove query param from Url removed query param '", str3, "', url = ", str);
            }
            i++;
            str2 = f;
        }
        return str2;
    }

    public static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1, str.length());
    }

    public static String e(String str) {
        int lastIndexOf;
        if (!TextUtils.isEmpty(str)) {
            int lastIndexOf2 = str.lastIndexOf(35);
            if (lastIndexOf2 > 0) {
                str = str.substring(0, lastIndexOf2);
            }
            int lastIndexOf3 = str.lastIndexOf(63);
            if (lastIndexOf3 > 0) {
                str = str.substring(0, lastIndexOf3);
            }
            int lastIndexOf4 = str.lastIndexOf(47);
            if (lastIndexOf4 >= 0) {
                str = str.substring(lastIndexOf4 + 1);
            }
            if (!str.isEmpty() && (lastIndexOf = str.lastIndexOf(46)) >= 0) {
                return str.substring(lastIndexOf + 1);
            }
            return "";
        }
        return "";
    }

    public static String f(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            i++;
            if (charAt == '\\' && i < str.length()) {
                char charAt2 = str.charAt(i);
                i++;
                if (charAt2 == '\\' || charAt2 == '/' || charAt2 == '\"' || charAt2 == '\'') {
                    sb.append(charAt2);
                } else if (charAt2 == 'n') {
                    sb.append('\n');
                } else if (charAt2 == 'r') {
                    sb.append('\r');
                } else if (charAt2 == 't') {
                    sb.append('\t');
                } else if (charAt2 == 'b') {
                    sb.append('\b');
                } else if (charAt2 == 'f') {
                    sb.append('\f');
                } else if (charAt2 == 'u') {
                    StringBuilder sb2 = new StringBuilder();
                    int i2 = i + 4;
                    if (i2 > str.length()) {
                        throw new RuntimeException("Not enough unicode digits! ");
                    }
                    for (char c : str.substring(i, i2).toCharArray()) {
                        if (!Character.isLetterOrDigit(c)) {
                            throw new RuntimeException("Bad character in unicode escape.");
                        }
                        sb2.append(Character.toLowerCase(c));
                    }
                    sb.append((char) Integer.parseInt(sb2.toString(), 16));
                    i = i2;
                } else {
                    throw new RuntimeException("Illegal escape sequence: \\" + charAt2);
                }
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    public static String g(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            System.currentTimeMillis();
            String replace = j(i(str)).replace("&amp;", X3.j.c).replace("\\/", "/");
            while (replace.contains("&amp;")) {
                replace = replace.replace("&amp;", X3.j.c);
            }
            while (replace.contains("&apos;")) {
                replace = replace.replace("&apos;", "'");
            }
            while (replace.contains("&#39;")) {
                replace = replace.replace("&#39;", "'");
            }
            while (replace.contains("&nbsp;")) {
                replace = replace.replace("&nbsp;", " ");
            }
            if (replace.contains("[CDATA[") && replace.contains("&lt;") && replace.contains("&gt;") && replace.contains("&quot;")) {
                int indexOf = replace.indexOf("http");
                int lastIndexOf = replace.lastIndexOf("&quot;");
                if (lastIndexOf != -1 && lastIndexOf > indexOf && !replace.substring(lastIndexOf).contains("[CDATA[")) {
                    replace = replace.substring(0, lastIndexOf);
                }
            }
            return h(replace);
        } catch (Throwable th) {
            Logger.e(a, "exception in selective decode. input param is ", str, "' , error : ", th.getMessage());
            return str;
        }
    }

    public static String h(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll("[\\u00A0\\u1680\\u180E\\u2000-\\u200A\\u202F\\u205F\\u3000\\uFEFF]", " ").replaceAll(" +", " ");
    }

    public static String i(String str) {
        Matcher matcher = g.a("\\\\+u([0-9a-f]{4})").matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(stringBuffer, String.valueOf((char) Integer.parseInt(matcher.group(1), 16)));
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static String j(String str) {
        Matcher matcher = g.a("\\\\+x([0-9a-f]{2})").matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(stringBuffer, String.valueOf((char) Integer.parseInt(matcher.group(1), 16)));
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static boolean k(String str) {
        String lowerCase = str.toLowerCase();
        return (lowerCase.contains("<html") && lowerCase.contains("</html>")) || (lowerCase.contains("<div") && lowerCase.contains("</div>")) || ((lowerCase.contains("<script") && lowerCase.contains("</script>")) || (lowerCase.contains("<span") && lowerCase.contains("</span>")));
    }

    public static String a(String str, int i) {
        int indexOf = str.indexOf("<div", i);
        int indexOf2 = str.indexOf("</div", i);
        int i2 = 0;
        int i3 = i;
        while (i3 < str.length()) {
            if (indexOf < indexOf2) {
                i2++;
                i3 = indexOf + 1;
                indexOf = str.indexOf("<div", i3);
            } else {
                i2--;
                i3 = indexOf2 + 1;
                if (i2 == 0) {
                    return str.substring(i, indexOf2);
                }
                indexOf2 = str.indexOf("</div", i3);
            }
        }
        return null;
    }

    public static String l(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        return str.replace("&nbsp;", " ").replace("&quot;", "\"").replace("&apos;", "'").replace("&#39;", "'").replace("&lt;", "<").replace("&gt;", ">").replace("&amp;", X3.j.c).replaceAll("<\\s*?br\\s*?/\\s*?>", "\n").replaceAll("<\\s*?span\\s+?style\\s*?=\\s*?\"white-space:pre\"\\s*?>&#9;<\\s*?/\\s*?span\\s*?>", "\t");
    }

    public static String m(String str) {
        return b(str, 0);
    }

    public static String b(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return new String(Base64.decode(str, i));
        } catch (IllegalArgumentException e) {
            Logger.d(a, "base64Decoder - failed to Base64 decode buffer (decoded): ", e.getMessage());
            return str;
        }
    }

    public static boolean n(String str) {
        if (str.contains("{") && str.contains("}") && str.contains(":") && str.contains("\"")) {
            return n.n(str);
        }
        return false;
    }

    public static String o(String str) {
        try {
            byte[] digest = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1).digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (Throwable th) {
            Logger.d(a, "Exception in get Sha1 : ", th.getMessage(), th);
            return null;
        }
    }

    public static String p(String str) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (Throwable th) {
            Logger.d(a, "SHA-256 algorithm not found!", th);
            return null;
        }
    }

    public static HashSet<String> a(HashSet<String> hashSet, String str) {
        HashSet<String> hashSet2 = new HashSet<>();
        Iterator<String> it = hashSet.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (!next.startsWith(str)) {
                hashSet2.add(next);
            }
        }
        return hashSet2;
    }

    public static HashSet<String> b(HashSet<String> hashSet, String str) {
        HashSet<String> hashSet2 = new HashSet<>();
        Iterator<String> it = hashSet.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.startsWith(str)) {
                hashSet2.add(next);
            }
        }
        return hashSet2;
    }

    public static int c(String str, int i) {
        int i2 = 0;
        while (i < str.length()) {
            if (str.charAt(i) == '{') {
                i2++;
            } else if (str.charAt(i) == '}' && i2 - 1 == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static String a(String str, String str2, String str3) {
        return a(str, str2, str3, false, false);
    }

    public static String a(String str, String str2, String str3, boolean z, boolean z2) {
        try {
            int indexOf = str.indexOf(str2);
            if (indexOf == -1) {
                return null;
            }
            int length = z ? indexOf : str2.length() + indexOf;
            if (str3.equals("")) {
                return str.substring(length);
            }
            int indexOf2 = str.indexOf(str3, indexOf + str2.length());
            if (indexOf2 == -1) {
                return str.substring(length);
            }
            if (z2) {
                indexOf2 += str3.length();
            }
            return str.substring(length, indexOf2);
        } catch (Throwable th) {
            Logger.d(a, "Caught exception in safedkCreateSubstringWithPrefix: ", th.getMessage(), th);
            return null;
        }
    }

    public static String q(String str) {
        try {
            byte[] digest = MessageDigest.getInstance(SameMD5.TAG).digest(str.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02x", Integer.valueOf(b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)));
            }
            return sb.toString();
        } catch (Exception e) {
            throw new RuntimeException("MD5 hashing failed", e);
        }
    }

    public static String r(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll("\\\\/", "/").replaceAll("\\\\\\\\", "\\\\").replaceAll("\\\\\"", "\"").replaceAll("\\\\'", "'").replaceAll("\\\\n", "\n").replaceAll("\\\\r", "\r").replaceAll("\\\\t", "\t");
    }
}
