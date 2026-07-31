package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.C4729k5;
import com.ironsource.EnumC4984y5;
import com.ironsource.J9;
import com.ironsource.P4;
import com.ironsource.U2;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.demandOnly.i;
import com.ironsource.mediationsdk.demandOnly.o;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes11.dex */
public class c implements i.a {
    private ConcurrentHashMap<String, d> a = new ConcurrentHashMap<>();
    private P4 b;

    public c(List<NetworkSettings> list, U2 u2, String str, String str2, P4 p4) {
        String d = IronSourceUtils.d();
        boolean k = u2.k();
        this.b = p4;
        com.ironsource.mediationsdk.e eVar = new com.ironsource.mediationsdk.e(new com.ironsource.mediationsdk.f(u2.d(), d));
        for (NetworkSettings networkSettings : list) {
            if (networkSettings.isIronSource()) {
                AbstractAdapter a = com.ironsource.mediationsdk.c.b().a(networkSettings, networkSettings.getBannerSettings(), true);
                if (a != null) {
                    d dVar = new d(str, str2, networkSettings, u2.b(), a, eVar);
                    dVar.a(k);
                    this.a.put(dVar.l(), dVar);
                }
            } else {
                IronLog.INTERNAL.error("cannot load " + networkSettings.getProviderTypeForReflection());
            }
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.a
    public void a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        d dVar = this.a.get(str);
        if (dVar != null) {
            dVar.a(iSDemandOnlyBannerLayout);
            return;
        }
        this.b.a(EnumC4984y5.BN_DO_INSTANCE_NOT_FOUND_IN_LOAD, str);
        IronSourceError buildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError("Banner");
        IronLog.API.error(buildNonExistentInstanceError.getErrorMessage());
        iSDemandOnlyBannerLayout.getListener().a(str, buildNonExistentInstanceError);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.a
    public void a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str, String str2) {
        d dVar = this.a.get(str);
        if (dVar == null) {
            this.b.a(EnumC4984y5.BN_DO_INSTANCE_NOT_FOUND_IN_LOAD, str);
            IronSourceError buildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError("Banner");
            IronLog.API.error(buildNonExistentInstanceError.getErrorMessage());
            iSDemandOnlyBannerLayout.getListener().a(str, buildNonExistentInstanceError);
            return;
        }
        dVar.a(iSDemandOnlyBannerLayout, new o.a(J9.b(C4729k5.b().c(), str2)));
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.a
    public synchronized void a(String str) {
        d dVar = this.a.get(str);
        if (dVar == null) {
            this.b.a(EnumC4984y5.BN_DO_INSTANCE_NOT_FOUND_IN_DESTROY, str);
            IronLog.API.error(ErrorBuilder.buildNonExistentInstanceError("Banner").getErrorMessage());
            return;
        }
        dVar.r();
    }
}
