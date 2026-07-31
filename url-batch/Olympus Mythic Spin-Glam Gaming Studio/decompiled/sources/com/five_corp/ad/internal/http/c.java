package com.five_corp.ad.internal.http;

import java.nio.charset.StandardCharsets;

/* loaded from: classes12.dex */
public final class c {
    public final int a;
    public final String b;
    public final byte[] c;

    public c(int i) {
        this.a = i;
        this.b = null;
        this.c = null;
    }

    public final String a() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        byte[] bArr = this.c;
        if (bArr != null) {
            return new String(bArr, StandardCharsets.UTF_8);
        }
        return null;
    }

    public c(int i, String str) {
        this.a = i;
        this.b = str;
        this.c = null;
    }

    public c(int i, byte[] bArr) {
        this.a = i;
        this.b = null;
        this.c = bArr;
    }
}
