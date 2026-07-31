package com.ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﮢ, reason: contains not printable characters */
/* loaded from: classes10.dex */
public final class C1223 {

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static C1223 f3215;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final Context f3221;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static final String f3217 = StringFog.decrypt("KcXPhgSuYsYEzs+GG5hdyAvLy4Ia\n", "Zaqs52jsEKk=\n");

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static final Object f3216 = new Object();

    /* renamed from: ﾒ, reason: contains not printable characters */
    public boolean f3222 = true;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final HashMap f3220 = new HashMap();

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final HashMap f3219 = new HashMap();

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final ArrayList f3218 = new ArrayList();

    public C1223(Context context) {
        this.f3221 = context;
        new HandlerC1270(this, context.getMainLooper());
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static C1223 m4471(Context context) {
        C1223 c1223;
        synchronized (f3216) {
            try {
                if (f3215 == null) {
                    f3215 = new C1223(context.getApplicationContext());
                }
                c1223 = f3215;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1223;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m4472() {
        synchronized (this.f3220) {
            try {
                Iterator it = new HashMap(this.f3220).keySet().iterator();
                while (it.hasNext()) {
                    m4475((BroadcastReceiver) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized void m4473() {
        this.f3222 = false;
        m4472();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m4474() {
        this.f3222 = true;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m4475(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f3220) {
            try {
                ArrayList arrayList = (ArrayList) this.f3220.remove(broadcastReceiver);
                if (arrayList == null) {
                    return;
                }
                for (int i = 0; i < arrayList.size(); i++) {
                    IntentFilter intentFilter = (IntentFilter) arrayList.get(i);
                    for (int i2 = 0; i2 < intentFilter.countActions(); i2++) {
                        String action = intentFilter.getAction(i2);
                        ArrayList arrayList2 = (ArrayList) this.f3219.get(action);
                        if (arrayList2 != null) {
                            if (arrayList2.size() <= 0) {
                                if (arrayList2.size() <= 0) {
                                    this.f3219.remove(action);
                                }
                            } else {
                                if (arrayList2.get(0) != null) {
                                    throw new ClassCastException();
                                }
                                throw null;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
