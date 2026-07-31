package com.ogury.ad.internal;

import android.net.Uri;
import com.ironsource.X3;
import com.ogury.core.internal.IntegrationLogger;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.SourceTag;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class pi extends z7 {
    public final /* synthetic */ qi a;

    public pi(qi qiVar) {
        this.a = qiVar;
    }

    @Override // com.ogury.ad.internal.z7
    public final void a(boolean z, Uri failingUri) {
        Intrinsics.checkNotNullParameter(failingUri, "failingUri");
        this.a.c.invoke(Boolean.valueOf(z), failingUri);
    }

    @Override // com.ogury.ad.internal.z7
    public final void b(y7 webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        y7 webView2 = this.a.d;
        if (webView2 != null) {
            t7 t7Var = webView2.p;
            t7Var.getClass();
            Intrinsics.checkNotNullParameter(webView2, "webView");
            t7Var.a.a(webView2.getMraidCommandExecutor());
        }
    }

    @Override // com.ogury.ad.internal.z7
    public final void a(String errorMessage) {
        y yVar;
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        LogTag logTag = LogTag.REQUESTS;
        SourceTag sourceTag = SourceTag.ADS;
        w wVar = x.c;
        b bVar = this.a.e;
        String str = (bVar == null || (yVar = bVar.n) == null) ? null : yVar.c;
        wVar.getClass();
        IntegrationLogger.w(logTag, sourceTag, X3.j.d + w.a(str) + "][Show] Error while showing ad: " + errorMessage);
    }
}
