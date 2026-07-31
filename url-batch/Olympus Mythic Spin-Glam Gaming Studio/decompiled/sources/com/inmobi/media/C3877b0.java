package com.inmobi.media;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* renamed from: com.inmobi.media.b0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3877b0 {
    public final WeakReference a;
    public final String b;
    public final boolean c;
    public final AtomicBoolean d;
    public final String e;
    public C4493y9 f;

    public C3877b0(WeakReference adUnitEventListener, String adtype, boolean z) {
        Intrinsics.checkNotNullParameter(adUnitEventListener, "adUnitEventListener");
        Intrinsics.checkNotNullParameter(adtype, "adtype");
        this.a = adUnitEventListener;
        this.b = adtype;
        this.c = z;
        this.d = new AtomicBoolean(false);
        this.e = String.valueOf(Reflection.getOrCreateKotlinClass(C3877b0.class).getSimpleName());
    }

    public final void a(Fk fk) {
        Xh xh;
        Gk gk;
        AtomicBoolean atomicBoolean;
        if (!this.d.getAndSet(true)) {
            C4187mj c4187mj = C4187mj.a;
            String str = this.b;
            Boolean valueOf = Boolean.valueOf(this.c);
            c4187mj.getClass();
            C4187mj.a(str, valueOf);
            AbstractC4038h1 abstractC4038h1 = (AbstractC4038h1) this.a.get();
            if (abstractC4038h1 != null) {
                abstractC4038h1.a(fk);
            } else if (fk != null) {
                fk.b();
            }
            C4493y9 c4493y9 = this.f;
            if (c4493y9 != null) {
                c4493y9.a(this.e, "==== CHECKPOINT REACHED - IMPRESSION FIRED ====");
            }
            C4493y9 c4493y92 = this.f;
            if (c4493y92 == null || (xh = c4493y92.a) == null) {
                return;
            }
            xh.a();
            return;
        }
        C4493y9 c4493y93 = this.f;
        if (c4493y93 != null) {
            c4493y93.c(this.e, "skipping as Impression is already Called");
        }
        if (fk != null) {
            C4326s1 c4326s1 = fk.a;
            if (c4326s1 == null || (gk = c4326s1.b) == null || (atomicBoolean = gk.a) == null || !atomicBoolean.getAndSet(true)) {
                LinkedHashMap a = fk.a();
                a.put("networkType", F5.g());
                a.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2179);
                String str2 = fk.d;
                if (str2 == null) {
                    str2 = "";
                }
                a.put("impressionId", str2);
                C4425vk c4425vk = C4425vk.a;
                C4425vk.b("AdImpressionSuccessful", a, EnumC4530zk.a);
            }
        }
    }
}
