package io.bidmachine.iab.mraid;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import com.ironsource.sdk.controller.f;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;

/* loaded from: classes15.dex */
public class MraidUtils {

    @NonNull
    public static final String ARG_OPEN_PRIVACY_SHEET_DATA = "data";

    @NonNull
    public static final String COMMAND_URL_PREFIX = "mraid://";
    public static final int DEFAULT_CLOSE_TIME_SEC = 3;
    static String d;

    @Nullable
    public static String dynamicMraidJs;
    public static final long MAX_ON_SCREEN_TIME_MS = TimeUnit.SECONDS.toMillis(30);

    @NonNull
    public static final String COMMAND_OPEN_PRIVACY_SHEET = "openPrivacySheet";
    private static final List a = Arrays.asList("close", n.e, "open", "playVideo", n.g, n.h, "setResizeProperties", "useCustomClose", "noFill", X3.i.r, "AdStarted", "AdStopped", "AdSkipped", "AdSkippableStateChange", "AdVideoStart", "AdVideoFirstQuartile", "AdVideoMidpoint", "AdVideoThirdQuartile", "AdVideoComplete", "AdUserClose", "AdPaused", "AdPlaying", "AdClickThru", "AdLog", "AdError", "createCalendarEvent", "storePicture", COMMAND_OPEN_PRIVACY_SHEET);
    private static final char[] b = {'\"', '\''};
    private static final MraidJsValidator c = new b();

    private static class b implements MraidJsValidator {
        private b() {
        }

        @Override // io.bidmachine.iab.mraid.MraidJsValidator
        public boolean checkParamsForCommand(String str, Map map) {
            return MraidUtils.b(str, map);
        }

        @Override // io.bidmachine.iab.mraid.MraidJsValidator
        public boolean isValidCommand(String str) {
            return MraidUtils.b(str);
        }

        @Override // io.bidmachine.iab.mraid.MraidJsValidator
        public String removePrefix(String str) {
            return str.substring(8);
        }
    }

    static String b() {
        String str = dynamicMraidJs;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        if (d == null) {
            d = new String(Base64.decode(MraidJs.JS, 0)).replace("%%VERSION%%", "");
        }
        return d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String c(String str) {
        return str;
    }

    @Nullable
    public static View getRootViewFromActivity(@Nullable Context context) {
        if (context instanceof Activity) {
            return ((Activity) context).getWindow().getDecorView().findViewById(R.id.content);
        }
        return null;
    }

    @Nullable
    public static View getRootViewFromView(@Nullable View view) {
        View rootView;
        if (view == null || (rootView = view.getRootView()) == null) {
            return null;
        }
        View findViewById = rootView.findViewById(R.id.content);
        return findViewById != null ? findViewById : rootView;
    }

    @Nullable
    public static View getTopmostView(@Nullable Context context, @Nullable View view) {
        View rootViewFromActivity = getRootViewFromActivity(context);
        return rootViewFromActivity != null ? rootViewFromActivity : getRootViewFromView(view);
    }

    @NonNull
    public static View obtainRootView(@NonNull Context context, @NonNull View view) {
        View topmostView = getTopmostView(context, view);
        return topmostView instanceof ViewGroup ? (ViewGroup) topmostView : view;
    }

    @Nullable
    public static Map<String, String> parseCommandUrl(@NonNull String str) {
        return parseCommandUrl(str, c);
    }

    @NonNull
    public static String processRawHtml(@NonNull String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        List a2 = a(str, b);
        boolean b2 = b(str, "html", a2);
        boolean b3 = b(str, "head", a2);
        boolean b4 = b(str, "body", a2);
        if ((!b2 && (b3 || b4)) || (b2 && !b4)) {
            return str;
        }
        if (!b2) {
            stringBuffer.insert(0, "<html><head></head><body><div align=\"center\">");
            stringBuffer.append("</div></body></html>");
        } else if (!b3) {
            Matcher matcher = Pattern.compile("<html[^>]*>", 2).matcher(stringBuffer);
            for (int i = 0; matcher.find(i); i = matcher.end()) {
                stringBuffer.insert(matcher.end(), "<head></head>");
            }
        }
        a(stringBuffer);
        return stringBuffer.toString();
    }

    @Nullable
    public static Map<String, String> parseCommandUrl(@NonNull final String str, @NonNull MraidJsValidator mraidJsValidator) {
        MraidLog.d("parseCommandUrl", new Function0() { // from class: io.bidmachine.iab.mraid.MraidUtils$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                String c2;
                c2 = MraidUtils.c(str);
                return c2;
            }
        });
        String removePrefix = mraidJsValidator.removePrefix(str);
        HashMap hashMap = new HashMap();
        int indexOf = removePrefix.indexOf(63);
        if (indexOf != -1) {
            String substring = removePrefix.substring(0, indexOf);
            for (String str2 : removePrefix.substring(indexOf + 1).split(X3.j.c)) {
                int indexOf2 = str2.indexOf(61);
                hashMap.put(str2.substring(0, indexOf2), str2.substring(indexOf2 + 1));
            }
            removePrefix = substring;
        }
        if (!mraidJsValidator.isValidCommand(removePrefix)) {
            MraidLog.w(f.b.g, "%s is unknown", removePrefix);
            return null;
        }
        if (!mraidJsValidator.checkParamsForCommand(removePrefix, hashMap)) {
            MraidLog.w(f.b.g, "URL %s is missing parameters", str);
            return null;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put(f.b.g, removePrefix);
        hashMap2.putAll(hashMap);
        return hashMap2;
    }

    static int a(String str, String str2, List list) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (list == null) {
                list = a(str, b);
            }
            Matcher matcher = Pattern.compile(String.format("<%s[^>]*>", str2), 2).matcher(str);
            while (matcher.find()) {
                int end = matcher.end();
                if (a(end, list)) {
                    return end;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(String str) {
        return a.contains(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(String str, Map map) {
        str.hashCode();
        switch (str) {
            case "playVideo":
            case "open":
            case "storePicture":
                return map.containsKey("url");
            case "openPrivacySheet":
                return map.containsKey("data");
            case "createCalendarEvent":
                return map.containsKey("eventJSON");
            case "setOrientationProperties":
                return map.containsKey("allowOrientationChange") && map.containsKey("forceOrientation");
            case "setResizeProperties":
                return map.containsKey("width") && map.containsKey("height") && map.containsKey("offsetX") && map.containsKey("offsetY") && map.containsKey("customClosePosition") && map.containsKey("allowOffscreen");
            case "useCustomClose":
                return map.containsKey("useCustomClose");
            default:
                return true;
        }
    }

    static void a(StringBuffer stringBuffer) {
        int a2;
        if (!TextUtils.isEmpty(stringBuffer) && (a2 = a(stringBuffer.toString(), "head", null)) > -1) {
            stringBuffer.insert(a2, a());
        }
    }

    static List a(String str, char... cArr) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str) && cArr != null) {
            try {
                int[] iArr = new int[cArr.length];
                Arrays.fill(iArr, -1);
                for (int i = 0; i < str.length(); i++) {
                    char charAt = str.charAt(i);
                    int i2 = 0;
                    while (true) {
                        if (i2 >= cArr.length) {
                            break;
                        }
                        if (charAt == cArr[i2]) {
                            int i3 = iArr[i2];
                            if (i3 > -1) {
                                arrayList.add(new Pair(Integer.valueOf(i3), Integer.valueOf(i)));
                                iArr[i2] = -1;
                            } else {
                                iArr[i2] = i;
                            }
                        } else {
                            i2++;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }

    private static boolean a(int i, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            if (i >= ((Integer) pair.first).intValue() && i <= ((Integer) pair.second).intValue()) {
                return false;
            }
        }
        return true;
    }

    static String a() {
        return "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no\" /><style>body { margin:0; padding:0;}*:not(input) { -webkit-touch-callout:none; -webkit-user-select:none; -webkit-text-size-adjust:none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); }</style>";
    }

    private static boolean b(String str, String str2, List list) {
        return a(str, str2, list) > -1;
    }
}
