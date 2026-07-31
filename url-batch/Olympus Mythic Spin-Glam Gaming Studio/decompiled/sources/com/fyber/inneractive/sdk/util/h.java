package com.fyber.inneractive.sdk.util;

/* loaded from: classes6.dex */
public final class h {
    public final Long a;

    public h(String str) {
        Long l;
        try {
            l = Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            l = null;
        }
        this.a = l;
    }
}
