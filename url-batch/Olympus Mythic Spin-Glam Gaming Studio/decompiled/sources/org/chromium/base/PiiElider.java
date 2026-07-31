package org.chromium.base;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public abstract class PiiElider {
    private static final Pattern WEB_URL = Pattern.compile("(\\b|^)(((((http|https|Http|Https|rtsp|Rtsp)://(([a-zA-Z0-9$_.+!*'(),;?&=-]|(%[a-fA-F0-9]{2})){1,64}(:([a-zA-Z0-9$_.+!*'(),;?&=-]|(%[a-fA-F0-9]{2})){1,25})?@)?)?(([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef-]{0,61}[a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]){0,1}\\.)+[a-zA-Z -\ud7ff豈-﷏ﷰ-\uffef]{2,63}|((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9])))(:\\d{1,5})?)|([a-zA-Z][a-zA-Z0-9+.-]+://((([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef;/?:@&=#~.+!*'(),_-])|(%[a-fA-F0-9]{2}))+))))(/(([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef;/?:@&=#~.+!*'(),_-])|(%[a-fA-F0-9]{2}))*)?(\\b|$)");
    private static final Pattern NOT_URLS_PATTERN = Pattern.compile("^(?:Caused by: )?java\\.lang\\.(?:ClassNotFoundException|NoClassDefFoundError):|(?:[\"' ]/(?:apex|data|mnt|proc|sdcard|storage|system))/");
    private static final Pattern MAC_ADDRESS = Pattern.compile("([0-9a-fA-F]{2}[-:]+){5}[0-9a-fA-F]{2}");
    private static final Pattern CONSOLE_MSG = Pattern.compile("\\[\\w*:CONSOLE.*\\].*");
    private static final String[] APP_NAMESPACE = {"org.chromium.", "com.google.", "com.chrome."};
    private static final String[] SYSTEM_NAMESPACE = {"android.", "c2.", "com.android.", "dalvik.", "java.", "javax.", "omx.", "OMX.", "org.apache.", "org.json.", "org.w3c.dom.", "org.xml.", "org.xmlpull.", "System."};

    public static String elideUrl(String str) {
        if (NOT_URLS_PATTERN.matcher(str).find()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        Matcher matcher = WEB_URL.matcher(sb);
        int i = 0;
        while (matcher.find(i)) {
            int start = matcher.start();
            int end = matcher.end();
            String substring = sb.substring(start, end);
            if (likelyToBeAppNamespace(substring) || likelyToBeChromeApkName(substring) || likelyToBeSystemNamespace(substring) || likelyToBeClassOrMethodName(substring)) {
                i = end;
            } else {
                sb.replace(start, end, "HTTP://WEBADDRESS.ELIDED");
                i = start + 24;
                matcher = WEB_URL.matcher(sb);
            }
        }
        return sb.toString();
    }

    private static boolean likelyToBeClassOrMethodName(String str) {
        if (isClassName(str)) {
            return true;
        }
        int lastIndexOf = str.lastIndexOf(".");
        if (lastIndexOf == -1) {
            return false;
        }
        return isClassName(str.substring(0, lastIndexOf));
    }

    private static boolean likelyToBeChromeApkName(String str) {
        if (str.startsWith("chromium-")) {
            return str.endsWith(".apk") || str.endsWith(".aab");
        }
        return false;
    }

    private static boolean isClassName(String str) {
        try {
            Class.forName(str, false, ContextUtils.getApplicationContext().getClassLoader());
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean likelyToBeAppNamespace(String str) {
        for (String str2 : APP_NAMESPACE) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean likelyToBeSystemNamespace(String str) {
        for (String str2 : SYSTEM_NAMESPACE) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static String sanitizeStacktrace(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] split = str.split("\\n");
        for (int i = 0; i < split.length; i++) {
            if (!split[i].startsWith("\tat ")) {
                split[i] = elideUrl(split[i]);
            }
        }
        return TextUtils.join("\n", split);
    }
}
