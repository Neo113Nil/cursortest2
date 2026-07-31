package io.bidmachine;

import io.bidmachine.core.NetworkRequest;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
class z {
    private static volatile z c;
    private final Object a = new Object();
    final Map b = new HashMap();

    z() {
    }

    public static z a() {
        z zVar = c;
        if (zVar == null) {
            synchronized (z.class) {
                try {
                    zVar = c;
                    if (zVar == null) {
                        zVar = new z();
                        c = zVar;
                    }
                } finally {
                }
            }
        }
        return zVar;
    }

    public void a(String str, NetworkRequest networkRequest) {
        synchronized (this.a) {
            this.b.put(str, networkRequest);
        }
    }

    public NetworkRequest a(String str) {
        NetworkRequest networkRequest;
        synchronized (this.a) {
            networkRequest = (NetworkRequest) this.b.remove(str);
        }
        return networkRequest;
    }
}
