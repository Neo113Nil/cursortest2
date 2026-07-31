package net.pubnative.lite.sdk.mraid.internal;

import com.ironsource.X3;
import com.ironsource.sdk.controller.f;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes13.dex */
public class MRAIDParser {
    private static final String TAG = "MRAIDParser";

    private boolean checkParamsForCommand(String str, Map<String, String> map) {
        str.getClass();
        switch (str) {
            case "playVideo":
            case "open":
            case "storePicture":
                return map.containsKey("url");
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

    private boolean isValidCommand(String str) {
        return Arrays.asList("close", "createCalendarEvent", n.e, "open", "playVideo", n.g, n.h, "setResizeProperties", "storePicture", "useCustomClose").contains(str);
    }

    public Map<String, String> parseCommandUrl(String str) {
        MRAIDLog.d(TAG, "parseCommandUrl " + str);
        String substring = str.substring(8);
        HashMap hashMap = new HashMap();
        int indexOf = substring.indexOf(63);
        if (indexOf != -1) {
            String substring2 = substring.substring(0, indexOf);
            for (String str2 : substring.substring(indexOf + 1).split(X3.j.c)) {
                int indexOf2 = str2.indexOf(61);
                hashMap.put(str2.substring(0, indexOf2), str2.substring(indexOf2 + 1));
            }
            substring = substring2;
        }
        if (!isValidCommand(substring)) {
            MRAIDLog.w("command " + substring + " is unknown");
            return null;
        }
        if (checkParamsForCommand(substring, hashMap)) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put(f.b.g, substring);
            hashMap2.putAll(hashMap);
            return hashMap2;
        }
        MRAIDLog.w("command URL " + str + " is missing parameters");
        return null;
    }
}
