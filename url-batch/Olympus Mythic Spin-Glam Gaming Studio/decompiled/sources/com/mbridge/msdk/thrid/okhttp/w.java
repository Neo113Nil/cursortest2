package com.mbridge.msdk.thrid.okhttp;

import java.io.IOException;

/* compiled from: Protocol.java */
/* loaded from: classes13.dex */
public enum w {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");

    private final String a;

    w(String str) {
        this.a = str;
    }

    public static w a(String str) throws IOException {
        w wVar = HTTP_1_0;
        if (str.equals(wVar.a)) {
            return wVar;
        }
        w wVar2 = HTTP_1_1;
        if (str.equals(wVar2.a)) {
            return wVar2;
        }
        w wVar3 = H2_PRIOR_KNOWLEDGE;
        if (str.equals(wVar3.a)) {
            return wVar3;
        }
        w wVar4 = HTTP_2;
        if (str.equals(wVar4.a)) {
            return wVar4;
        }
        w wVar5 = SPDY_3;
        if (str.equals(wVar5.a)) {
            return wVar5;
        }
        w wVar6 = QUIC;
        if (str.equals(wVar6.a)) {
            return wVar6;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.a;
    }
}
