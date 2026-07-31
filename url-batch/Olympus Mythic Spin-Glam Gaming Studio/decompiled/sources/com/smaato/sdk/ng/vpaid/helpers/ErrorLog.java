package com.smaato.sdk.ng.vpaid.helpers;

import android.content.Context;
import android.text.TextUtils;
import com.smaato.sdk.ng.network.NGSDKHttpClient;
import com.smaato.sdk.ng.utils.Logger;
import com.smaato.sdk.ng.vpaid.enums.VastError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class ErrorLog {
    private static final String a = "ErrorLog";
    private static List<String> b;

    class a implements NGSDKHttpClient.Listener {
        a() {
        }

        @Override // com.smaato.sdk.ng.network.NGSDKHttpClient.Listener
        public void onFailure(Throwable th) {
        }

        @Override // com.smaato.sdk.ng.network.NGSDKHttpClient.Listener
        public void onSuccess(String str, Map<String, List<String>> map) {
        }
    }

    private ErrorLog() {
    }

    public static void initErrorLog(String str) {
        List<String> list = b;
        if (list == null) {
            b = new ArrayList();
        } else {
            list.clear();
        }
        b.add(str);
    }

    public static synchronized void postError(Context context, VastError vastError) {
        synchronized (ErrorLog.class) {
            try {
                List<String> list = b;
                if (list != null && !list.isEmpty()) {
                    for (String str : b) {
                        if (!TextUtils.isEmpty(str)) {
                            if (str.contains("[ERRORCODE]")) {
                                str = str.replace("[ERRORCODE]", vastError.getValue());
                            }
                            Logger.d(a, str);
                            NGSDKHttpClient.makeRequest(context, str, null, null, new a());
                        }
                    }
                }
            } finally {
            }
        }
    }

    public static void initErrorLog(List<String> list) {
        List<String> list2 = b;
        if (list2 == null) {
            b = new ArrayList();
        } else {
            list2.clear();
        }
        b.addAll(list);
    }
}
