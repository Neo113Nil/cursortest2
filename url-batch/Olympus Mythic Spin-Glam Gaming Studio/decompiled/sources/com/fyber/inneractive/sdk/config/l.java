package com.fyber.inneractive.sdk.config;

import java.util.HashMap;

/* loaded from: classes5.dex */
public final class l {
    public final HashMap a = new HashMap();

    public final boolean a() {
        try {
            if (this.a.containsKey("dsos")) {
                return Boolean.parseBoolean((String) this.a.get("dsos"));
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
