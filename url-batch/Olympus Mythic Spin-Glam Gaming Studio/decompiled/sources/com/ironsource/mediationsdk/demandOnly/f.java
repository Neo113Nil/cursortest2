package com.ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import com.ironsource.C4729k5;
import com.ironsource.C4782n4;
import com.ironsource.E9;
import com.ironsource.EnumC4984y5;
import com.ironsource.J9;
import com.ironsource.P4;
import com.ironsource.X7;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.demandOnly.h;
import com.ironsource.mediationsdk.demandOnly.i;
import com.ironsource.mediationsdk.demandOnly.o;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes11.dex */
public class f implements i.b {
    private final P4 a;
    private final ConcurrentHashMap<String, g> b;
    private final X7<ISDemandOnlyInterstitialListener> c;

    public f(List<NetworkSettings> list, E9 e9, com.ironsource.mediationsdk.c cVar, X7<ISDemandOnlyInterstitialListener> x7, String str, String str2, P4 p4) {
        String d = IronSourceUtils.d();
        boolean j = e9.j();
        com.ironsource.mediationsdk.f fVar = new com.ironsource.mediationsdk.f(e9.g(), d);
        this.b = new ConcurrentHashMap<>();
        this.a = p4;
        this.c = x7;
        for (NetworkSettings networkSettings : list) {
            if (networkSettings.isIronSource()) {
                AbstractAdapter a = cVar.a(networkSettings, networkSettings.getInterstitialSettings(), true);
                if (a != null) {
                    g gVar = new g(str, str2, networkSettings, this.c.a(networkSettings.getSubProviderId()), e9.e(), a, new com.ironsource.mediationsdk.e(fVar));
                    gVar.a(j);
                    this.b.put(networkSettings.getSubProviderId(), gVar);
                }
            } else {
                IronLog.INTERNAL.error("cannot load " + networkSettings.getProviderTypeForReflection());
            }
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.b
    public void a(@NotNull h.d dVar) {
        String e = dVar.e();
        String b = dVar.b();
        try {
            g gVar = this.b.get(e);
            if (gVar == null) {
                this.a.a(EnumC4984y5.IS_DO_INSTANCE_NOT_FOUND_IN_LOAD, e);
                IronSourceError buildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError("Interstitial");
                IronLog.API.error(buildNonExistentInstanceError.getErrorMessage());
                this.c.a(e).onInterstitialAdLoadFailed(e, buildNonExistentInstanceError);
                return;
            }
            if (TextUtils.isEmpty(b)) {
                gVar.b();
            } else {
                gVar.a(new o.a(J9.b(C4729k5.b().c(), b)));
            }
        } catch (Exception e2) {
            C4782n4.d().a(e2);
            IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitial exception " + e2.getMessage());
            IronLog.API.error(buildLoadFailedError.getErrorMessage());
            this.c.a(e).onInterstitialAdLoadFailed(e, buildLoadFailedError);
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.b
    public boolean b(String str) {
        g gVar = this.b.get(str);
        if (gVar != null) {
            return gVar.a();
        }
        this.a.a(EnumC4984y5.IS_DO_INSTANCE_NOT_FOUND_IN_AVAILABILITY_CHECK, str);
        return false;
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.b
    public void a(String str) {
        try {
            g gVar = this.b.get(str);
            if (gVar == null) {
                this.a.a(EnumC4984y5.IS_DO_INSTANCE_NOT_FOUND_IN_SHOW, str);
                IronSourceError buildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError("Interstitial");
                IronLog.API.error(buildNonExistentInstanceError.getErrorMessage());
                this.c.a(str).onInterstitialAdShowFailed(str, buildNonExistentInstanceError);
                return;
            }
            gVar.e();
        } catch (Exception e) {
            C4782n4.d().a(e);
            IronSourceError buildShowFailedError = ErrorBuilder.buildShowFailedError("Interstitial", "showInterstitial exception " + e.getMessage());
            IronLog.API.error(buildShowFailedError.getErrorMessage());
            this.c.a(str).onInterstitialAdShowFailed(str, buildShowFailedError);
        }
    }

    public ConcurrentHashMap<String, g> a() {
        return this.b;
    }
}
