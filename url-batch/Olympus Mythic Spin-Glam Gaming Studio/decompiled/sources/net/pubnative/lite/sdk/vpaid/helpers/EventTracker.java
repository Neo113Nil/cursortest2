package net.pubnative.lite.sdk.vpaid.helpers;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.analytics.tracker.ReportingTracker;
import net.pubnative.lite.sdk.network.PNHttpClient;
import net.pubnative.lite.sdk.vpaid.macros.MacroHelper;
import net.pubnative.lite.sdk.vpaid.models.vast.Tracking;

/* loaded from: classes11.dex */
public class EventTracker {
    private static final Set<String> sUsedEvents = new HashSet();

    private EventTracker() {
    }

    public static void clear() {
        sUsedEvents.clear();
    }

    public static synchronized void post(Context context, String str, MacroHelper macroHelper, boolean z) {
        synchronized (EventTracker.class) {
            if (z) {
                try {
                    if (sUsedEvents.contains(str)) {
                    }
                } finally {
                }
            }
            if (!TextUtils.isEmpty(str)) {
                String processUrl = macroHelper != null ? macroHelper.processUrl(str) : str;
                HashMap hashMap = new HashMap();
                String userAgent = HyBid.getDeviceInfo().getUserAgent();
                if (!TextUtils.isEmpty(userAgent)) {
                    hashMap.put("User-Agent", userAgent);
                }
                PNHttpClient.makeRequest(context, processUrl, hashMap, null, false, new PNHttpClient.Listener() { // from class: net.pubnative.lite.sdk.vpaid.helpers.EventTracker.2
                    @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
                    public void onFailure(Throwable th) {
                        Log.d("onFailure", th.toString());
                    }

                    @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
                    public void onSuccess(String str2, Map<String, List<String>> map) {
                        Log.d("onSuccess", str2);
                    }
                });
                sUsedEvents.add(str);
            }
        }
    }

    public static synchronized void postEvent(Context context, String str, final String str2, MacroHelper macroHelper, boolean z) {
        synchronized (EventTracker.class) {
            if (z) {
                try {
                    if (sUsedEvents.contains(str)) {
                    }
                } finally {
                }
            }
            if (!TextUtils.isEmpty(str)) {
                if (str2 == null) {
                    str2 = "";
                }
                String processUrl = macroHelper != null ? macroHelper.processUrl(str) : str;
                HashMap hashMap = new HashMap();
                String userAgent = HyBid.getDeviceInfo().getUserAgent();
                if (!TextUtils.isEmpty(userAgent)) {
                    hashMap.put("User-Agent", userAgent);
                }
                PNHttpClient.makeRequest(context, processUrl, hashMap, null, false, new PNHttpClient.Listener() { // from class: net.pubnative.lite.sdk.vpaid.helpers.EventTracker.1
                    @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
                    public void onFailure(Throwable th) {
                        Log.d("onFailure", th.toString());
                    }

                    @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
                    public void onFinally(String str3, int i) {
                        if (HyBid.getReportingController() != null) {
                            HyBid.getReportingController().reportFiredTracker(new ReportingTracker(str2, str3, i));
                        }
                    }

                    @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
                    public void onSuccess(String str3, Map<String, List<String>> map) {
                        Log.d("onSuccess", str3);
                    }
                });
                sUsedEvents.add(str);
            }
        }
    }

    public static synchronized void postEventByType(Context context, List<Tracking> list, String str, MacroHelper macroHelper, boolean z) {
        synchronized (EventTracker.class) {
            if (list != null) {
                for (Tracking tracking : list) {
                    if (tracking.getEvent().equalsIgnoreCase(str)) {
                        postEvent(context, tracking.getText(), tracking.getEvent(), macroHelper, z);
                    }
                }
            }
        }
    }
}
