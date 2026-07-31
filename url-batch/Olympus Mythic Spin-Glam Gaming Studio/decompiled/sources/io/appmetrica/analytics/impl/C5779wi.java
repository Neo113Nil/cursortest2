package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import androidx.annotation.WorkerThread;
import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.wi, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5779wi implements InterfaceC5538nb {
    public final Context a;
    public final Wf b;
    public final Ji c;
    public final Handler d;
    public final C5342fm e;
    public final Nc f;
    public final LinkedHashMap g;
    public final Wn h;
    public final List i;
    public Dc j;
    public B6 k;

    public C5779wi(@NotNull Context context, @NotNull Wf wf, @NotNull Ji ji, @NotNull Handler handler, @NotNull C5342fm c5342fm) {
        this.a = context;
        this.b = wf;
        this.c = ji;
        this.d = handler;
        this.e = c5342fm;
        this.f = new Nc(context, wf, ji, c5342fm);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.g = linkedHashMap;
        this.h = new Wn(new C5831yi(linkedHashMap));
        this.i = CollectionsKt.listOf((Object[]) new String[]{"20799a27-fa80-4b36-b2db-0f8141f24180", "0e5e9c33-f8c3-4568-86c5-2e4f57523f72"});
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5538nb, io.appmetrica.analytics.impl.InterfaceC5564ob
    public final InterfaceC5538nb a() {
        return this;
    }

    @NotNull
    public final C5779wi b() {
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5538nb
    @NotNull
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized Dc b(@NotNull AppMetricaConfig appMetricaConfig, @NotNull PublicLogger publicLogger, @NotNull C5527n0 c5527n0) {
        Dc dc;
        try {
            dc = this.j;
            if (dc != null) {
                Nc nc = this.f;
                nc.getClass();
                publicLogger.info("Update anonymous config with value " + appMetricaConfig.toJson(), new Object[0]);
                nc.f.b.applyFromAnonymousConfig(appMetricaConfig);
            } else {
                this.h.a(appMetricaConfig.apiKey);
                Nc nc2 = this.f;
                nc2.getClass();
                publicLogger.info("Update anonymous config with value " + appMetricaConfig.toJson(), new Object[0]);
                nc2.f.b.applyFromAnonymousConfig(appMetricaConfig);
                dc = new Dc(this.f);
                dc.i = new Kb(this.d, dc);
                C5342fm c5342fm = this.e;
                Sh sh = dc.b;
                if (c5342fm != null) {
                    sh.b.setUuid(c5342fm.g());
                } else {
                    sh.getClass();
                }
                dc.a(appMetricaConfig, c5527n0);
                dc.k();
                this.c.f.c = new C5753vi(dc);
                this.g.put(appMetricaConfig.apiKey, dc);
                this.j = dc;
            }
        } catch (Throwable th) {
            throw th;
        }
        return dc;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5538nb
    @WorkerThread
    @NotNull
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final synchronized Dc a(@NotNull AppMetricaConfig appMetricaConfig, @NotNull PublicLogger publicLogger, @NotNull C5527n0 c5527n0) {
        Dc dc;
        try {
            dc = this.j;
            if (dc != null) {
                this.f.a(appMetricaConfig, publicLogger);
                dc.a(appMetricaConfig, c5527n0);
                C5661s4.l().getClass();
                this.g.put(appMetricaConfig.apiKey, dc);
            } else {
                this.h.a(appMetricaConfig.apiKey);
                this.f.a(appMetricaConfig, publicLogger);
                dc = new Dc(this.f);
                dc.i = new Kb(this.d, dc);
                C5342fm c5342fm = this.e;
                Sh sh = dc.b;
                if (c5342fm != null) {
                    sh.b.setUuid(c5342fm.g());
                } else {
                    sh.getClass();
                }
                dc.a(appMetricaConfig, c5527n0);
                dc.k();
                this.c.f.c = new C5753vi(dc);
                this.g.put(appMetricaConfig.apiKey, dc);
                C5661s4.l().getClass();
                this.j = dc;
            }
        } catch (Throwable th) {
            throw th;
        }
        return dc;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5538nb
    @NotNull
    public final synchronized InterfaceC5512mb b(@NotNull ReporterConfig reporterConfig) {
        InterfaceC5512mb interfaceC5512mb;
        try {
            interfaceC5512mb = (InterfaceC5512mb) this.g.get(reporterConfig.apiKey);
            if (interfaceC5512mb == null) {
                if (!this.i.contains(reporterConfig.apiKey)) {
                    this.e.i();
                }
                Context context = this.a;
                Tc tc = new Tc(context, this.b, reporterConfig, this.c, new C5382ha(context));
                tc.i = new Kb(this.d, tc);
                C5342fm c5342fm = this.e;
                Sh sh = tc.b;
                if (c5342fm != null) {
                    sh.b.setUuid(c5342fm.g());
                } else {
                    sh.getClass();
                }
                tc.k();
                this.g.put(reporterConfig.apiKey, tc);
                interfaceC5512mb = tc;
            }
        } catch (Throwable th) {
            throw th;
        }
        return interfaceC5512mb;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5538nb
    public final synchronized void a(@NotNull ReporterConfig reporterConfig) {
        try {
            if (this.g.containsKey(reporterConfig.apiKey)) {
                LoggerStorage.getOrCreatePublicLogger(reporterConfig.apiKey).warning("Reporter with apiKey=%s already exists.", ApiKeyUtils.createPartialApiKey(reporterConfig.apiKey));
            } else {
                b(reporterConfig);
                ImportantLogger.INSTANCE.info(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_APP_METRICA, "Activate reporter with APIKey " + ApiKeyUtils.createPartialApiKey(reporterConfig.apiKey), new Object[0]);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5538nb
    @NotNull
    public final synchronized InterfaceC5617qb a(@NotNull AppMetricaConfig appMetricaConfig) {
        B6 b6;
        try {
            b6 = this.k;
            if (b6 != null) {
                b6.a(appMetricaConfig);
            } else {
                B6 b62 = new B6(new C6(this.b, this.f.e, this.c, appMetricaConfig));
                this.k = b62;
                b6 = b62;
            }
        } catch (Throwable th) {
            throw th;
        }
        return b6;
    }
}
