package io.bidmachine.analytics.internal.A;

import com.ironsource.C4701ic;
import java.net.HttpURLConnection;
import java.net.URLConnection;

/* loaded from: classes.dex */
public enum c {
    Get(C4701ic.a),
    Post("POST");

    private final String a;

    c(String str) {
        this.a = str;
    }

    public final void a(URLConnection uRLConnection) {
        if (uRLConnection instanceof HttpURLConnection) {
            ((HttpURLConnection) uRLConnection).setRequestMethod(this.a);
        }
    }
}
