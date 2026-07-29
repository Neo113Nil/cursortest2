package com.google.firebase.internal;

import java.util.Arrays;
import o.C0208Hx;
import o.EB;

/* loaded from: classes.dex */
public class InternalTokenResult {
    private String zza;

    public InternalTokenResult(String str) {
        this.zza = str;
    }

    public boolean equals(Object obj) {
        if (obj instanceof InternalTokenResult) {
            return EB.o(this.zza, ((InternalTokenResult) obj).zza);
        }
        return false;
    }

    public String getToken() {
        return this.zza;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    public String toString() {
        C0208Hx c0208Hx = new C0208Hx(12, this);
        c0208Hx.H0(this.zza, "token");
        return c0208Hx.toString();
    }
}
