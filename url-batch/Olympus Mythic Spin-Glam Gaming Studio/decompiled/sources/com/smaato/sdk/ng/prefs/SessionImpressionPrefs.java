package com.smaato.sdk.ng.prefs;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.smaato.sdk.ng.db.OnDatabaseResetListener;
import com.smaato.sdk.ng.db.SessionImpression;
import com.smaato.sdk.ng.prefs.NextGenPreferences;
import com.smaato.sdk.ng.utils.Logger;
import com.smaato.sdk.ng.utils.NextGenTimeUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes5.dex */
public class SessionImpressionPrefs {
    private SharedPreferences a;
    private Context b;
    private SharedPreferences.Editor c;

    public SessionImpressionPrefs(Context context) {
        if (context != null) {
            this.b = context;
            SharedPreferences sharedPreferences = context.getSharedPreferences("session_prefs_reporting", 0);
            this.a = sharedPreferences;
            if (sharedPreferences != null) {
                this.c = sharedPreferences.edit();
            }
        }
    }

    private synchronized void a(SessionImpression sessionImpression) {
        try {
            if (this.c != null) {
                String string = this.a.getString("session_impression_key", "");
                ArrayList arrayList = new ArrayList();
                if (string.isEmpty()) {
                    sessionImpression.setCount(1);
                    arrayList.add(sessionImpression);
                } else {
                    try {
                        JSONArray jSONArray = new JSONArray(string);
                        for (int i = 0; i < jSONArray.length(); i++) {
                            arrayList.add(new SessionImpression(jSONArray.getJSONObject(i)));
                        }
                        a(arrayList, sessionImpression);
                    } catch (JSONException e) {
                        Logger.e("JSONException", e.toString());
                    }
                }
                this.c.putString("session_impression_key", a(arrayList).toString());
                this.c.apply();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public Integer getImpressionDepth(String str) {
        SessionImpression sessionImpression;
        String string = this.a.getString("session_impression_key", "");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (!string.isEmpty()) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    arrayList.add(new SessionImpression(jSONArray.getJSONObject(i2)));
                }
            } catch (JSONException e) {
                Logger.e("JSONException", e.toString());
            }
            int size = arrayList.size();
            while (true) {
                if (i >= size) {
                    sessionImpression = null;
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                sessionImpression = (SessionImpression) obj;
                if (!TextUtils.isEmpty(sessionImpression.getZoneId()) && !TextUtils.isEmpty(str) && sessionImpression.getZoneId().equals(str)) {
                    break;
                }
            }
            if (sessionImpression != null) {
                return sessionImpression.getCount();
            }
        }
        return 0;
    }

    public synchronized void insert(String str) {
        SessionImpression sessionImpression = new SessionImpression();
        sessionImpression.setTimestamp(Long.valueOf(System.currentTimeMillis()));
        sessionImpression.setZoneId(str);
        Long a = a();
        sessionImpression.setSessionDuration(new NextGenTimeUtils().calculateSessionDuration(sessionImpression.getTimestamp(), a));
        sessionImpression.setAgeOfApp(a);
        a(sessionImpression.getTimestamp());
        a(sessionImpression);
    }

    public synchronized void nukePrefs() {
        SharedPreferences.Editor editor = this.c;
        if (editor != null) {
            editor.putString("session_impression_key", "");
        }
    }

    private JSONArray a(List<SessionImpression> list) {
        JSONArray jSONArray = new JSONArray();
        Iterator<SessionImpression> it = list.iterator();
        while (it.hasNext()) {
            try {
                jSONArray.put(it.next().toJson());
            } catch (Exception e) {
                Logger.e("JSONException", e.toString());
            }
        }
        return jSONArray;
    }

    private synchronized void a(List<SessionImpression> list, SessionImpression sessionImpression) {
        if (list == null || sessionImpression == null) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            SessionImpression sessionImpression2 = list.get(i);
            if (sessionImpression2 != null && !TextUtils.isEmpty(sessionImpression.getZoneId()) && !TextUtils.isEmpty(sessionImpression2.getZoneId()) && sessionImpression.getZoneId().equals(sessionImpression2.getZoneId())) {
                sessionImpression2.setCount(Integer.valueOf(sessionImpression2.getCount().intValue() + 1));
                return;
            }
        }
        sessionImpression.setCount(1);
        list.add(sessionImpression);
    }

    private synchronized Long a() {
        Context context = this.b;
        if (context == null) {
            return 0L;
        }
        return Long.valueOf(new NextGenPreferences(context).getSessionTimeStamp());
    }

    private synchronized void a(Long l) {
        Context context = this.b;
        if (context == null) {
            return;
        }
        new NextGenPreferences(context).setSessionTimeStamp(l.longValue(), new OnDatabaseResetListener() { // from class: com.smaato.sdk.ng.prefs.SessionImpressionPrefs$$ExternalSyntheticLambda0
            @Override // com.smaato.sdk.ng.db.OnDatabaseResetListener
            public final void onDatabaseReset() {
                SessionImpressionPrefs.this.nukePrefs();
            }
        }, NextGenPreferences.TIMESTAMP.AD_REQUEST);
    }
}
