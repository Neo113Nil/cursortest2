package com.smaato.sdk.ng.visibility;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.X3;
import com.smaato.sdk.ng.NextGen;
import com.smaato.sdk.ng.models.TrackingUrlModel;
import com.smaato.sdk.ng.network.NGSDKHttpClient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class TrackingManager {
    private static final String a = "TrackingManager";
    private static boolean b;

    class a implements NGSDKHttpClient.Listener {
        final /* synthetic */ Context a;
        final /* synthetic */ TrackingUrlModel b;

        a(Context context, TrackingUrlModel trackingUrlModel) {
            this.a = context;
            this.b = trackingUrlModel;
        }

        @Override // com.smaato.sdk.ng.network.NGSDKHttpClient.Listener
        public void onFailure(Throwable th) {
            TrackingManager.a(this.a, X3.i.t, this.b);
            TrackingManager.b = false;
            TrackingManager.c(this.a);
        }

        @Override // com.smaato.sdk.ng.network.NGSDKHttpClient.Listener
        public void onSuccess(String str, Map<String, List<String>> map) {
            TrackingManager.b = false;
            TrackingManager.c(this.a);
        }
    }

    protected static void a(Context context) {
        List<TrackingUrlModel> b2 = b(context, X3.i.t);
        List<TrackingUrlModel> b3 = b(context, "pending");
        b3.addAll(b2);
        a(context, "pending", b3);
        b2.clear();
        a(context, X3.i.t, b2);
    }

    protected static List<TrackingUrlModel> b(Context context, String str) {
        ArrayList arrayList = new ArrayList();
        String string = b(context).getString(str, null);
        if (string != null) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(new TrackingUrlModel(jSONArray.getJSONObject(i)));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }

    protected static synchronized void c(Context context) {
        synchronized (TrackingManager.class) {
            if (b) {
                Log.w(a, "trackNextItem - Currently tracking, dropping the call, will be resumed soon");
                return;
            }
            b = true;
            TrackingUrlModel a2 = a(context, "pending");
            if (a2 == null) {
                b = false;
                return;
            }
            if (a2.startTimestamp + 1800000 < System.currentTimeMillis()) {
                b = false;
                c(context);
                return;
            }
            HashMap hashMap = new HashMap();
            String userAgent = NextGen.getDeviceInfo().getUserAgent();
            if (!TextUtils.isEmpty(userAgent)) {
                hashMap.put("User-Agent", userAgent);
            }
            NGSDKHttpClient.makeRequest(context, a2.url, hashMap, null, new a(context, a2));
        }
    }

    public static synchronized void track(Context context, String str) {
        synchronized (TrackingManager.class) {
            if (context == null) {
                Log.w(a, "track - ERROR: Context parameter is null");
                return;
            }
            if (TextUtils.isEmpty(str)) {
                Log.w(a, "track - ERROR: url parameter is null");
                return;
            }
            a(context);
            TrackingUrlModel trackingUrlModel = new TrackingUrlModel();
            trackingUrlModel.url = str;
            trackingUrlModel.startTimestamp = System.currentTimeMillis();
            a(context, "pending", trackingUrlModel);
            c(context);
        }
    }

    protected static void a(Context context, String str, TrackingUrlModel trackingUrlModel) {
        List<TrackingUrlModel> b2 = b(context, str);
        b2.add(trackingUrlModel);
        a(context, str, b2);
    }

    protected static TrackingUrlModel a(Context context, String str) {
        List<TrackingUrlModel> b2 = b(context, str);
        if (b2.isEmpty()) {
            return null;
        }
        TrackingUrlModel trackingUrlModel = b2.get(0);
        b2.remove(0);
        a(context, str, b2);
        return trackingUrlModel;
    }

    protected static SharedPreferences b(Context context) {
        return context.getSharedPreferences(a, 0);
    }

    protected static void a(Context context, String str, List<TrackingUrlModel> list) {
        SharedPreferences.Editor edit = b(context).edit();
        if (list == null) {
            edit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            Iterator<TrackingUrlModel> it = list.iterator();
            while (it.hasNext()) {
                try {
                    jSONArray.put(it.next().toJson());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
    }
}
