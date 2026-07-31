package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ľ, reason: contains not printable characters */
/* loaded from: classes12.dex */
public final class C0379 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static C0379 f196;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final ArrayList f199 = new ArrayList();

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final ArrayList f198 = new ArrayList();

    /* renamed from: ｋ, reason: contains not printable characters */
    public final C0417 f197 = new C0417(this);

    static {
        StringFog.decrypt("wrRb2THFYTjmqVDTO8B+NOerXN47\n", "ld01vV6yLVE=\n");
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static synchronized C0379 m3991() {
        C0379 c0379;
        synchronized (C0379.class) {
            try {
                if (f196 == null) {
                    f196 = new C0379();
                }
                c0379 = f196;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0379;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m3992(q qVar) {
        synchronized (this) {
            try {
                this.f198.remove(qVar);
                if (this.f198.size() == 0) {
                    C0756 m4155 = C0756.m4155();
                    C0417 c0417 = this.f197;
                    m4155.getClass();
                    AbstractC1026.m4313(new C0806(m4155, c0417));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m3993(q qVar) {
        synchronized (this) {
            this.f198.add(qVar);
        }
        C0756 m4155 = C0756.m4155();
        C0417 c0417 = this.f197;
        m4155.getClass();
        AbstractC1026.m4313(new C0808(m4155, c0417));
        AbstractC1026.m4313(new C0392(this, qVar));
    }
}
