package com.five_corp.ad.internal;

import android.util.Log;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class u implements Runnable {
    public final /* synthetic */ com.five_corp.ad.internal.context.i a;
    public final /* synthetic */ com.five_corp.ad.internal.ad_check.b b;
    public final /* synthetic */ com.five_corp.ad.internal.ad_check.c c;
    public final /* synthetic */ v d;

    public u(v vVar, com.five_corp.ad.internal.context.i iVar, com.five_corp.ad.internal.ad_check.b bVar, com.five_corp.ad.internal.ad_check.c cVar) {
        this.d = vVar;
        this.a = iVar;
        this.b = bVar;
        this.c = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.five_corp.ad.internal.ad_check.b bVar;
        l lVar;
        com.five_corp.ad.internal.ad_check.b bVar2;
        l lVar2;
        try {
            int i = v.h;
            com.five_corp.ad.internal.util.b a = this.d.b.a(this.d.a.b(this.a), "POST", this.d.a.a(this.a).toString(), "application/json;charset=utf-8", null);
            if (!a.a) {
                this.b.a(a.b);
                return;
            }
            com.five_corp.ad.internal.http.c cVar = (com.five_corp.ad.internal.http.c) a.c;
            int i2 = cVar.a;
            if (i2 == 403) {
                bVar2 = this.b;
                lVar2 = new l(m.V, null, null);
            } else if (i2 / 100 == 5) {
                bVar2 = this.b;
                lVar2 = new l(m.W, null, null);
            } else if (i2 / 100 == 4) {
                bVar2 = this.b;
                lVar2 = new l(m.X, null, null);
            } else {
                String a2 = cVar.a();
                if (a2 == null) {
                    bVar2 = this.b;
                    lVar2 = new l(m.Y, null, null);
                } else {
                    if (!a2.isEmpty()) {
                        try {
                            this.c.a(com.five_corp.ad.internal.parser.a.a(a2));
                            return;
                        } catch (com.five_corp.ad.internal.exception.b e) {
                            int i3 = v.h;
                            e.toString();
                            bVar = this.b;
                            lVar = new l(e.a, null, e);
                            bVar.a(lVar);
                            return;
                        } catch (JSONException e2) {
                            int i4 = v.h;
                            e2.toString();
                            bVar = this.b;
                            lVar = new l(m.a0, null, e2);
                            bVar.a(lVar);
                            return;
                        }
                    }
                    bVar2 = this.b;
                    lVar2 = new l(m.Z, null, null);
                }
            }
            bVar2.a(lVar2);
        } catch (Exception e3) {
            int i5 = v.h;
            e3.toString();
            Log.getStackTraceString(e3);
            this.b.a(new l(m.b0, null, e3));
        }
    }
}
