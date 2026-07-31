package com.my.target;

import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class ce {
    private final sd a;
    private final n b;

    private ce(sd sdVar, n nVar) {
        this.a = sdVar;
        this.b = nVar;
    }

    public static ce a(sd sdVar, n nVar) {
        return new ce(sdVar, nVar);
    }

    private String b(md mdVar) {
        JSONObject j;
        String x = mdVar.x();
        try {
            j = this.a.j();
        } catch (Throwable th) {
            mi.a("NotificationHandler: Error updating cached notification for section " + this.a.i() + " and banner " + x + " - " + th);
        }
        if (j == null) {
            mi.a("NotificationHandler: Unable to change cached notification for banner " + x + " - no raw data in section");
            return null;
        }
        JSONObject jSONObject = j.getJSONObject(this.a.i());
        if (jSONObject == null) {
            mi.a("NotificationHandler: Unable to change cached notification for banner " + x + " - no section object in raw data");
            return null;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("banners");
        if (jSONArray == null) {
            mi.a("NotificationHandler: Uunable to change cached notification for banner " + x + " - no banners array in section object");
            return null;
        }
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = (JSONObject) jSONArray.get(i);
            String string = jSONObject2.getString(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.an);
            if (string != null && string.equals(x)) {
                jSONObject2.put("hasNotification", mdVar.n0());
                mi.a("NotificationHandler: Notification changed in raw data for banner " + x);
                return j.toString();
            }
        }
        return null;
    }

    public void a(final md mdVar, boolean z) {
        if (mdVar.n0() != z) {
            mdVar.h(z);
            o0.b(new Runnable() { // from class: com.my.target.ce$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ce.this.a(mdVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(md mdVar) {
        String b = b(mdVar);
        if (b == null) {
            return;
        }
        z3 c = jg.c();
        if (c == null) {
            mi.a("NotificationHandler: Unable to open disk cache and save text data for slotId - " + this.b.j());
            return;
        }
        c.a(this.b.j(), b, true);
    }
}
