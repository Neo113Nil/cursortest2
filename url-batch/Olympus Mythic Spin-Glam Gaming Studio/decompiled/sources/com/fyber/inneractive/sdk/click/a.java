package com.fyber.inneractive.sdk.click;

import android.content.Context;
import android.net.Uri;
import com.pubmatic.sdk.common.POBCommonConstants;
import io.bidmachine.util.network.NetworkUtils;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class a {
    public static q a(Uri uri, q qVar) {
        if (uri == null) {
            return qVar;
        }
        String host = uri.getHost();
        String scheme = uri.getScheme();
        if (!NetworkUtils.PROTOCOL_MARKET.equalsIgnoreCase(scheme)) {
            if (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
                return qVar;
            }
            if (!POBCommonConstants.PLAY_STORE_DOMAIN.equalsIgnoreCase(host) && !"market.android.com".equalsIgnoreCase(host)) {
                return qVar;
            }
        }
        return q.OPEN_GOOGLE_STORE;
    }

    public abstract b a(Context context, Uri uri, List list);

    public abstract void a();

    public abstract boolean a(Uri uri, r rVar);
}
