package com.fyber.inneractive.sdk.network;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class r0 {
    public final InneractiveAdRequest a;
    public HashMap b;

    public r0(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.serverapi.d dVar) {
        this.a = inneractiveAdRequest;
    }

    public final void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.b.put(str, str2);
    }
}
