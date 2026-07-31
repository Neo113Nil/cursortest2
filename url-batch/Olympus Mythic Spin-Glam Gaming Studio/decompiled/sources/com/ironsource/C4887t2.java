package com.ironsource;

import android.text.TextUtils;
import com.ironsource.C4887t2;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.t2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4887t2 extends Og {

    @NotNull
    private final V0 e;

    @NotNull
    private final AbstractC4961x0 f;

    @NotNull
    private final C4905u2 g;

    @NotNull
    private final Wc h;

    @Nullable
    private InterfaceC4927v2 i;

    /* renamed from: com.ironsource.t2$a */
    public static final class a implements InterfaceC4927v2 {
        final /* synthetic */ E b;
        final /* synthetic */ Pg c;

        a(E e, Pg pg) {
            this.b = e;
            this.c = pg;
        }

        @Override // com.ironsource.InterfaceC4927v2
        public void a(@NotNull final List<C4834q2> newWaterfall, @NotNull final Map<String, I> adInstancePayloads, @NotNull final String auctionId, @Nullable final C4834q2 c4834q2, @Nullable final JSONObject jSONObject, @Nullable final JSONObject jSONObject2, final int i, final long j, final int i2, @Nullable final String str, @Nullable final B b) {
            Intrinsics.checkNotNullParameter(newWaterfall, "newWaterfall");
            Intrinsics.checkNotNullParameter(adInstancePayloads, "adInstancePayloads");
            Intrinsics.checkNotNullParameter(auctionId, "auctionId");
            V0 v0 = C4887t2.this.e;
            final C4887t2 c4887t2 = C4887t2.this;
            final E e = this.b;
            final Pg pg = this.c;
            v0.c(new Runnable() { // from class: com.ironsource.t2$a$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    C4887t2.a.a(C4887t2.this, e, pg, newWaterfall, adInstancePayloads, auctionId, c4834q2, jSONObject, jSONObject2, i, j, i2, str, b);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C4887t2 this$0, E adInstanceFactory, Pg waterfallFetcherListener, List newWaterfall, Map adInstancePayloads, String auctionId, C4834q2 c4834q2, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str, B b) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(adInstanceFactory, "$adInstanceFactory");
            Intrinsics.checkNotNullParameter(waterfallFetcherListener, "$waterfallFetcherListener");
            Intrinsics.checkNotNullParameter(newWaterfall, "$newWaterfall");
            Intrinsics.checkNotNullParameter(adInstancePayloads, "$adInstancePayloads");
            Intrinsics.checkNotNullParameter(auctionId, "$auctionId");
            this$0.i = null;
            this$0.a(adInstanceFactory, waterfallFetcherListener, newWaterfall, adInstancePayloads, auctionId, c4834q2, jSONObject, jSONObject2, i, j, i2, str, b);
        }

        @Override // com.ironsource.InterfaceC4927v2
        public void a(final int i, @Nullable final String str, final int i2, @NotNull final String auctionFallback, final long j, @Nullable final B b) {
            Intrinsics.checkNotNullParameter(auctionFallback, "auctionFallback");
            V0 v0 = C4887t2.this.e;
            final C4887t2 c4887t2 = C4887t2.this;
            final E e = this.b;
            final Pg pg = this.c;
            v0.c(new Runnable() { // from class: com.ironsource.t2$a$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    C4887t2.a.a(C4887t2.this, e, pg, i, str, i2, auctionFallback, j, b);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C4887t2 this$0, E adInstanceFactory, Pg waterfallFetcherListener, int i, String str, int i2, String auctionFallback, long j, B b) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(adInstanceFactory, "$adInstanceFactory");
            Intrinsics.checkNotNullParameter(waterfallFetcherListener, "$waterfallFetcherListener");
            Intrinsics.checkNotNullParameter(auctionFallback, "$auctionFallback");
            this$0.i = null;
            this$0.a(adInstanceFactory, waterfallFetcherListener, i, str, i2, auctionFallback, j, b);
        }

        @Override // com.ironsource.InterfaceC4927v2
        public void a(int i, @NotNull String errorReason) {
            Intrinsics.checkNotNullParameter(errorReason, "errorReason");
            this.c.a(i, errorReason);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4887t2(@NotNull V0 adTools, @NotNull AbstractC4961x0 adUnitData) {
        super(adTools, adUnitData);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.e = adTools;
        this.f = adUnitData;
        C4905u2 c4905u2 = new C4905u2(adTools, adUnitData);
        this.g = c4905u2;
        this.h = c4905u2.b();
    }

    @Override // com.ironsource.Og
    @NotNull
    public Wc a() {
        return this.h;
    }

    @Override // com.ironsource.Og
    public void a(@NotNull E adInstanceFactory, @NotNull Pg waterfallFetcherListener) {
        Intrinsics.checkNotNullParameter(adInstanceFactory, "adInstanceFactory");
        Intrinsics.checkNotNullParameter(waterfallFetcherListener, "waterfallFetcherListener");
        a aVar = new a(adInstanceFactory, waterfallFetcherListener);
        this.g.a(aVar);
        this.i = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(E e, Pg pg, List<C4834q2> list, Map<String, I> map, String str, C4834q2 c4834q2, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2, B b) {
        IronLog.INTERNAL.verbose(C4814p0.a(this.e, (String) null, (String) null, 3, (Object) null));
        C4780n2 c4780n2 = new C4780n2(str, jSONObject, c4834q2, i, "");
        if (!TextUtils.isEmpty(str2)) {
            this.e.f().h().a(i2, str2);
        }
        a(jSONObject2);
        Qg a2 = a(list, map, c4780n2, e, b);
        this.e.f().a(new W1(c4780n2));
        this.e.f().b().a(j, this.f.v() + ";wtf=" + a2.c());
        this.e.f().b().c(a2.d());
        a(a2, pg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(E e, Pg pg, int i, String str, int i2, String str2, long j, B b) {
        IronLog.INTERNAL.verbose(C4814p0.a(this.e, "Auction failed (error " + i + " - " + str + ")", (String) null, 2, (Object) null));
        if (b != null) {
            c();
        }
        boolean n = this.f.e().n();
        String a2 = C4538a2.a.a(n);
        C4780n2 c4780n2 = new C4780n2(a2, null, null, i2, str2);
        C5002z5 f = this.e.f();
        f.a(new W1(c4780n2));
        f.b().a(j, i, str);
        if (n) {
            a(e, pg, i2, str2, a2);
        } else {
            a(pg);
        }
    }

    private final void a(Qg qg, Pg pg) {
        this.e.h().a(qg);
        pg.a(qg);
    }

    private final void a(JSONObject jSONObject) {
        int i;
        try {
            if (jSONObject == null) {
                this.f.b(false);
                IronLog.INTERNAL.verbose(C4814p0.a(this.e, "loading configuration from auction response is null, using the following: " + this.f.v(), (String) null, 2, (Object) null));
                return;
            }
            try {
                if (jSONObject.has(com.ironsource.mediationsdk.d.x) && (i = jSONObject.getInt(com.ironsource.mediationsdk.d.x)) > 0) {
                    this.f.a(i);
                }
                if (jSONObject.has(com.ironsource.mediationsdk.d.y)) {
                    this.f.a(jSONObject.getBoolean(com.ironsource.mediationsdk.d.y));
                } else if (this.f.b().h() && Kb.u.d().h().l()) {
                    AbstractC4961x0 abstractC4961x0 = this.f;
                    abstractC4961x0.a(Math.max(2, abstractC4961x0.k()));
                }
                this.f.b(jSONObject.optBoolean(com.ironsource.mediationsdk.d.z, false));
                IronLog.INTERNAL.verbose(C4814p0.a(this.e, this.f.v(), (String) null, 2, (Object) null));
            } catch (JSONException e) {
                C4782n4.d().a(e);
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("failed to update loading configuration for" + this.f.b().a() + " Error: " + e.getMessage());
                ironLog.verbose(C4814p0.a(this.e, this.f.v(), (String) null, 2, (Object) null));
            }
        } catch (Throwable th) {
            IronLog.INTERNAL.verbose(C4814p0.a(this.e, this.f.v(), (String) null, 2, (Object) null));
            throw th;
        }
    }

    private final void a(E e, Pg pg, int i, String str, String str2) {
        IronLog.INTERNAL.verbose(C4814p0.a(this.e, "Moving to fallback waterfall", (String) null, 2, (Object) null));
        new Fc(this.e, this.f).a(pg, i, str, str2, e);
    }

    private final void a(Pg pg) {
        pg.a(509, "Mediation No fill");
    }
}
