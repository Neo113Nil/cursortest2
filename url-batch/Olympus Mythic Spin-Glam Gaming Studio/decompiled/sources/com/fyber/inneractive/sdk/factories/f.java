package com.fyber.inneractive.sdk.factories;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;

/* loaded from: classes14.dex */
public final class f {
    public final HashMap a = new HashMap();

    public final void a(com.fyber.inneractive.sdk.response.a aVar, e eVar) {
        if (this.a.containsKey(aVar)) {
            IAlog.f("Handler already exists for ad type %s! : %s", aVar, this.a.get(aVar));
        } else {
            this.a.put(aVar, eVar);
        }
    }
}
