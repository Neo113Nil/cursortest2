package com.my.target;

import android.content.Context;
import com.my.target.common.webform.WebFormClient;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public final class sg implements se {
    final rg a;
    final l2 b;
    final WeakReference c;
    final pg d;
    final WebFormClient e;

    public sg(rg rgVar, l2 l2Var, pg pgVar, WebFormClient webFormClient, Context context) {
        this.a = rgVar;
        this.b = l2Var;
        this.d = pgVar;
        this.c = new WeakReference(context.getApplicationContext());
        this.e = webFormClient;
    }

    @Override // com.my.target.se
    public void a(re reVar) {
        z7 z7Var;
        if (this.d == null) {
            mi.a("ShoppablePostMessageHandler hasn't shoppableAdsData");
            return;
        }
        if (!reVar.a.equals("shoppable")) {
            mi.a("ShoppablePostMessageHandler has wrong postMessage type");
            return;
        }
        if (!reVar.b.equals("click")) {
            mi.a("ShoppablePostMessageHandler has wrong postMessage action");
            return;
        }
        tg a = new ug().a(reVar.c);
        if (a == null) {
            mi.a("ShoppablePostMessageHandler has wrong parse post message params");
            return;
        }
        String str = a.a;
        Context context = (Context) this.c.get();
        if (context == null) {
            mi.a("ShoppablePostMessageHandler hasn't context");
            return;
        }
        Iterator it = this.d.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                z7Var = null;
                break;
            } else {
                z7Var = (z7) it.next();
                if (str.equals(z7Var.id)) {
                    break;
                }
            }
        }
        if (z7Var == null) {
            mi.a("ShoppablePostMessageHandler cannot find internalShoppableAdsData by id");
        } else {
            wh.b(z7Var.a, "click", 2);
            this.b.a(this.a, z7Var.deeplink, z7Var.deeplinkFallbackUrl, z7Var.url, this.e, context);
        }
    }
}
