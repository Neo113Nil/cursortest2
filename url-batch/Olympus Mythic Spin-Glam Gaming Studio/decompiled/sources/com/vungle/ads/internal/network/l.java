package com.vungle.ads.internal.network;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* loaded from: classes6.dex */
public final class l implements Callback {
    public final /* synthetic */ m a;
    public final /* synthetic */ a b;

    public l(m mVar, a aVar) {
        this.a = mVar;
        this.b = aVar;
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException e) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(e, "e");
        try {
            this.b.a(e);
        } catch (Throwable th) {
            h.a(th);
            boolean z = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("OkHttpCall", "Cannot pass failure to callback", th);
        }
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) {
        o a;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            a = this.a.a(response);
            try {
                this.b.a(a);
            } catch (Throwable th) {
                h.a(th);
                boolean z = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.a("OkHttpCall", "Cannot pass response to callback", th);
            }
        } catch (Throwable th2) {
            boolean z2 = com.vungle.ads.internal.util.u.a;
            StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("[enqueue] Failed to parse response: ");
            a2.append(th2.getLocalizedMessage());
            com.vungle.ads.internal.util.t.b("OkHttpCall", a2.toString());
            h.a(th2);
            try {
                this.b.a(th2);
            } catch (Throwable th3) {
                h.a(th3);
                boolean z3 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.a("OkHttpCall", "Cannot pass failure to callback", th3);
            }
        }
    }
}
