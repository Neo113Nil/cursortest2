package com.fyber.inneractive.sdk.network;

import com.safedk.android.internal.partials.DTExchangeNetworkBridge;
import java.io.FilterInputStream;
import java.net.HttpURLConnection;
import java.util.Map;

/* loaded from: classes11.dex */
public final class j extends l {
    public final HttpURLConnection g;

    public j(HttpURLConnection httpURLConnection, int i, FilterInputStream filterInputStream, Map map, String str) {
        this.g = httpURLConnection;
        this.a = i;
        this.c = filterInputStream;
        this.d = map;
        this.e = str;
    }

    @Override // com.fyber.inneractive.sdk.network.l
    public final void a() {
        try {
            HttpURLConnection httpURLConnection = this.g;
            if (httpURLConnection != null) {
                DTExchangeNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            }
        } catch (Throwable unused) {
        }
        super.a();
    }
}
