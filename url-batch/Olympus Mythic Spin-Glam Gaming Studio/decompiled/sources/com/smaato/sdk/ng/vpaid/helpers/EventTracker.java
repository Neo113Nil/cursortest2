package com.smaato.sdk.ng.vpaid.helpers;

import android.content.Context;
import android.text.TextUtils;
import com.smaato.sdk.ng.NextGen;
import com.smaato.sdk.ng.analytics.tracker.ReportingTracker;
import com.smaato.sdk.ng.network.NGSDKHttpClient;
import com.smaato.sdk.ng.vpaid.macros.MacroHelper;
import com.smaato.sdk.ng.vpaid.models.vast.Tracking;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public class EventTracker {
    private static final Set<String> a = new HashSet();

    class a implements NGSDKHttpClient.Listener {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        @Override // com.smaato.sdk.ng.network.NGSDKHttpClient.Listener
        public void onFailure(Throwable th) {
            th.toString();
        }

        @Override // com.smaato.sdk.ng.network.NGSDKHttpClient.Listener
        public void onFinally(String str, int i) {
            if (NextGen.getReportingController() != null) {
                NextGen.getReportingController().reportFiredTracker(new ReportingTracker(this.a, str, i));
            }
        }

        @Override // com.smaato.sdk.ng.network.NGSDKHttpClient.Listener
        public void onSuccess(String str, Map<String, List<String>> map) {
        }
    }

    class b implements NGSDKHttpClient.Listener {
        b() {
        }

        @Override // com.smaato.sdk.ng.network.NGSDKHttpClient.Listener
        public void onFailure(Throwable th) {
            th.toString();
        }

        @Override // com.smaato.sdk.ng.network.NGSDKHttpClient.Listener
        public void onSuccess(String str, Map<String, List<String>> map) {
        }
    }

    private EventTracker() {
    }

    public static void clear() {
        a.clear();
    }

    public static synchronized void post(Context context, String str, MacroHelper macroHelper, boolean z) {
        synchronized (EventTracker.class) {
            if (z) {
                try {
                    if (a.contains(str)) {
                    }
                } finally {
                }
            }
            if (!TextUtils.isEmpty(str)) {
                String processUrl = macroHelper != null ? macroHelper.processUrl(str) : str;
                HashMap hashMap = new HashMap();
                String userAgent = NextGen.getDeviceInfo().getUserAgent();
                if (!TextUtils.isEmpty(userAgent)) {
                    hashMap.put("User-Agent", userAgent);
                }
                NGSDKHttpClient.makeRequest(context, processUrl, hashMap, null, false, new b());
                a.add(str);
            }
        }
    }

    public static synchronized void postEvent(Context context, String str, String str2, MacroHelper macroHelper, boolean z) {
        synchronized (EventTracker.class) {
            if (z) {
                try {
                    if (a.contains(str)) {
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
                String userAgent = NextGen.getDeviceInfo().getUserAgent();
                if (!TextUtils.isEmpty(userAgent)) {
                    hashMap.put("User-Agent", userAgent);
                }
                NGSDKHttpClient.makeRequest(context, processUrl, hashMap, null, false, new a(str2));
                a.add(str);
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
