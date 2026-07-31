package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes13.dex */
public final class h {
    private final AtomicReference a = new AtomicReference();
    protected boolean b = false;

    protected static final class a {
        public static final boolean a;

        static {
            boolean z = false;
            try {
                if (AppSet.class.equals(AppSet.class) && AppSetIdClient.class.equals(AppSetIdClient.class)) {
                    if (AppSetIdInfo.class.equals(AppSetIdInfo.class)) {
                        z = true;
                    }
                }
            } catch (Throwable th) {
                x2.a("AppSetIdProvider: error occurred while working with App Set library classes", th);
            }
            a = z;
        }
    }

    private void b(Context context) {
        final p1 a2 = p1.a(context);
        final String d = a2.d();
        final int e = a2.e();
        if (!TextUtils.isEmpty(d)) {
            this.a.set(new g(d, e));
        }
        if (!a.a) {
            x2.a("AppSetIdProvider: app set library is not available");
            return;
        }
        try {
            AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(m.c, new OnSuccessListener() { // from class: com.my.tracker.obfuscated.h$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    h.this.a(e, a2, d, (AppSetIdInfo) obj);
                }
            });
        } catch (Throwable th) {
            x2.a("AppSetIdProvider: error occurred while trying to access app set id info", th);
        }
        a();
    }

    public g a(Context context) {
        if (!this.b) {
            b(context);
            this.b = true;
        }
        return (g) this.a.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i, p1 p1Var, String str, AppSetIdInfo appSetIdInfo) {
        int scope = appSetIdInfo.getScope();
        if (scope != i) {
            p1Var.a(scope);
        }
        String id = appSetIdInfo.getId();
        if (!id.equals(str)) {
            p1Var.f(id);
            x2.a("AppSetIdProvider: new id value has been received: " + id);
        }
        if (!TextUtils.isEmpty(id) && scope != -1) {
            this.a.set(new g(id, scope));
        } else {
            this.a.set(null);
        }
        synchronized (this.a) {
            this.a.notify();
        }
    }

    private void a() {
        try {
            g gVar = (g) this.a.get();
            if (gVar != null) {
                x2.a("AppSetIdProvider: app set id has been collected, value: " + gVar.a);
                return;
            }
            synchronized (this.a) {
                this.a.wait(300L);
            }
            x2.a("AppSetIdProvider: timeout for collecting id has exceeded");
        } catch (Throwable th) {
            x2.a("AppSetIdProvider: attempt to block thread retrieving app set id finished unsuccessfully", th);
        }
    }
}
