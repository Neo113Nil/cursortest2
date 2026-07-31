package com.five_corp.ad.internal.tracking_data;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.PreferenceManager;
import com.five_corp.ad.internal.hub.global.f;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class e implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final Context b;
    public final com.five_corp.ad.internal.hub.global.b c;
    public final Object a = new Object();
    public d d = null;

    public e(Context context, com.five_corp.ad.internal.hub.global.b bVar) {
        this.b = context;
        this.c = bVar;
    }

    public final void a() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.b);
        d dVar = new d(defaultSharedPreferences.contains(POBConstants.DEFAULT_SHARED_PREFERENCE_GDPR_STATE_KEY) ? Integer.valueOf(defaultSharedPreferences.getInt(POBConstants.DEFAULT_SHARED_PREFERENCE_GDPR_STATE_KEY, 0)) : null, defaultSharedPreferences.contains("IABTCF_TCString") ? defaultSharedPreferences.getString("IABTCF_TCString", "") : null);
        synchronized (this.a) {
            try {
                if (dVar.equals(this.d)) {
                    return;
                }
                this.d = dVar;
                Iterator it = this.c.f.iterator();
                while (it.hasNext()) {
                    ((f) it.next()).a(dVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str == null || "IABTCF_TCString".equals(str) || POBConstants.DEFAULT_SHARED_PREFERENCE_GDPR_STATE_KEY.equals(str)) {
            a();
        }
    }
}
