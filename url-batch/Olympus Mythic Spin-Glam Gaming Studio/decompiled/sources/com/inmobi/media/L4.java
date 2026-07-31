package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.ContextData;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;

/* loaded from: classes12.dex */
public final class L4 {
    public final ContextData a;
    public final long b;
    public final String c = L4.class.getSimpleName();
    public final T4 d = new T4();
    public long e = -1;
    public final AtomicBoolean f = new AtomicBoolean();
    public final AtomicBoolean g = new AtomicBoolean();

    public L4(ContextData contextData, long j) {
        this.a = contextData;
        this.b = j;
    }

    public final void a() {
        String TAG = this.c;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        ContextData contextData = this.a;
        if (contextData != null) {
            S4.a.a(contextData.getEnabled());
        }
        if (S4.e() && !this.f.getAndSet(true)) {
            this.e = System.currentTimeMillis();
            c();
            d();
            i();
            e();
            a(this.e / 1000);
        }
    }

    public final void b() {
        if (!S4.e()) {
            String TAG = this.c;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            return;
        }
        if (!this.f.get()) {
            String TAG2 = this.c;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            return;
        }
        a((int) (System.currentTimeMillis() - this.e));
        if (this.g.getAndSet(true)) {
            String TAG3 = this.c;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            return;
        }
        String TAG4 = this.c;
        Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.L4$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                L4.a(L4.this);
            }
        };
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        AbstractC4002fj.g.submit(runnable);
    }

    public final void c() {
        ContextData contextData;
        String advertisedContent;
        if (this.g.get() || (contextData = this.a) == null || (advertisedContent = contextData.getAdvertisedContent()) == null) {
            return;
        }
        T4 t4 = this.d;
        t4.getClass();
        Intrinsics.checkNotNullParameter(advertisedContent, "<set-?>");
        t4.a = advertisedContent;
        String TAG = this.c;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
    }

    public final void d() {
        ContextData contextData;
        Long bidderId;
        if (this.g.get() || (contextData = this.a) == null || (bidderId = contextData.getBidderId()) == null) {
            return;
        }
        this.d.b = bidderId.longValue();
        String TAG = this.c;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
    }

    public final void e() {
        ContextData contextData;
        if (this.g.get() || (contextData = this.a) == null) {
            return;
        }
        this.d.f = contextData.getCasAdTypeId();
        String TAG = this.c;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
    }

    public final void f() {
        if (this.g.get()) {
            return;
        }
        this.d.g = 1;
        String TAG = this.c;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
    }

    public final void g() {
        if (this.g.get()) {
            return;
        }
        this.d.i = 1;
        String TAG = this.c;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
    }

    public final void h() {
        if (this.g.get()) {
            return;
        }
        this.d.h = 1;
        String TAG = this.c;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
    }

    public final void i() {
        if (this.g.get()) {
            return;
        }
        this.d.e = this.b;
        String TAG = this.c;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
    }

    public final void a(long j) {
        if (this.g.get()) {
            return;
        }
        this.d.c = j;
        String TAG = this.c;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
    }

    public final void a(int i) {
        if (this.g.get()) {
            return;
        }
        this.d.d = i;
        String TAG = this.c;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
    }

    public static final void a(L4 l4) {
        S4 s4 = S4.a;
        T4 contextualDataModel = l4.d;
        Intrinsics.checkNotNullParameter(contextualDataModel, "contextualDataModel");
        synchronized (s4) {
            Intrinsics.checkNotNullExpressionValue("S4", "TAG");
            long currentTimeMillis = System.currentTimeMillis();
            long expiryTime = currentTimeMillis - (S4.c().getContextualData().getExpiryTime() * 1000);
            S4.a(expiryTime, S4.c().getContextualData().getMaxAdRecords() - 1);
            String jSONArray = U4.a(contextualDataModel, S4.c().getContextualData().getSkipFields()).toString();
            Intrinsics.checkNotNullExpressionValue(jSONArray, "toString(...)");
            C3961e6 c3961e6 = new C3961e6(AbstractC3989f6.a(jSONArray, S4.e), currentTimeMillis);
            S4.c.add(c3961e6);
            Object clone = S4.c.clone();
            Intrinsics.checkNotNull(clone, "null cannot be cast to non-null type java.util.LinkedList<com.inmobi.signals.contextualdata.EncryptedContextualData>");
            S4.d = (LinkedList) clone;
            BuildersKt__BuildersKt.runBlocking$default(null, new Q4(c3961e6, expiryTime, null), 1, null);
            Unit unit = Unit.INSTANCE;
        }
    }
}
