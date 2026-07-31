package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.ironsource.O6;
import com.my.target.common.MyTargetConfig;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
final class j0 extends t4 {
    private volatile Map a;

    j0() {
    }

    synchronized Map a(MyTargetConfig myTargetConfig, Context context) {
        if (o0.a()) {
            mi.a("AppSetIdDataProvider: You must not call collectData method from main thread");
            return new HashMap();
        }
        if (this.a != null) {
            return new HashMap(this.a);
        }
        this.a = new HashMap();
        final ve a = ve.a(context);
        final String a2 = a.a();
        final int b = a.b();
        if (!TextUtils.isEmpty(a2)) {
            this.a.put(O6.M0, a2);
        }
        if (b != -1) {
            this.a.put("asis", String.valueOf(b));
        }
        try {
            AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(o0.b, new OnSuccessListener() { // from class: com.my.target.j0$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    j0.this.a(b, a, a2, (AppSetIdInfo) obj);
                }
            });
        } catch (Throwable unused) {
            mi.a("AppSetIdDataProvider: error occurred while trying to access app set id info");
        }
        return new HashMap(this.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i, ve veVar, String str, AppSetIdInfo appSetIdInfo) {
        int scope = appSetIdInfo.getScope();
        if (scope != i) {
            veVar.a(scope);
            synchronized (this) {
                this.a.put("asis", String.valueOf(scope));
            }
            mi.a("AppSetIdDataProvider: new scope value has been received: " + scope);
        }
        String id = appSetIdInfo.getId();
        if (id.equals(str)) {
            return;
        }
        veVar.c(id);
        synchronized (this) {
            this.a.put(O6.M0, id);
        }
        mi.a("AppSetIdDataProvider: new id value has been received: " + id);
    }
}
