package com.ogury.ad.internal;

import android.content.Context;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class u0 extends p1 {
    public final y7 c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u0(Context context, y7 webView) {
        super(webView.getMraidCommandExecutor(), monitoringEventLogger);
        r5 r5Var = u5.e;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        u5 monitoringEventLogger = r5Var.a(applicationContext);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(monitoringEventLogger, "monitoringEventLogger");
        this.c = webView;
    }

    @Override // com.ogury.ad.internal.p1
    public final void a(boolean z) {
        d();
    }

    @Override // com.ogury.ad.internal.p1
    public final void b(b ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        d();
    }

    @Override // com.ogury.ad.internal.p1
    public final void c(boolean z) {
        this.c.setShowSdkCloseButton(z);
    }

    public final void d() {
        y7 webView = this.c;
        t7 t7Var = webView.p;
        t7Var.getClass();
        Intrinsics.checkNotNullParameter(webView, "webView");
        t7Var.c.a(webView.getMraidCommandExecutor());
        y7 y7Var = this.c;
        v6 v6Var = y7Var.n;
        String cacheId = y7Var.a.b;
        v6Var.getClass();
        Intrinsics.checkNotNullParameter(cacheId, "cacheId");
        Iterator it = v6.b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (Intrinsics.areEqual(entry.getKey(), cacheId)) {
                it.remove();
                q8 q8Var = (q8) ((u6) entry.getValue()).a.get();
                if (q8Var != null) {
                    ((o0) q8Var).b(((u6) entry.getValue()).c);
                }
            }
        }
        z7 z7Var = y7Var.m;
        if (z7Var != null) {
            z7Var.a();
        }
    }
}
