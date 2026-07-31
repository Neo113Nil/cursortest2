package com.ironsource.adqualitysdk.sdk.i;

import android.util.Log;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ɾ, reason: contains not printable characters */
/* loaded from: classes12.dex */
public abstract class AbstractC0441 extends RuntimeException {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final Throwable f312;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final AbstractC1005 f313;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f314;

    public AbstractC0441(String str, AbstractC1005 abstractC1005, Throwable th) {
        this.f314 = str;
        this.f313 = abstractC1005;
        this.f312 = th;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(mo4001());
        sb.append(StringFog.decrypt("daE=\n", "T4H7wK+CdxY=\n"));
        sb.append(this.f314);
        sb.append('\n');
        sb.append(this.f313);
        if (this.f312 != null) {
            str = StringFog.decrypt("MVeRLD7nrmRZbcp5\n", "OxTwWU2CykQ=\n") + Log.getStackTraceString(this.f312);
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public abstract String mo4001();

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m4002(String str) {
        AbstractC0844.m4219(str, this.f314, null, this);
    }
}
