package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.FileNotFoundException;

/* loaded from: classes11.dex */
public final class q implements f0 {
    public final /* synthetic */ s a;

    public q(s sVar) {
        this.a = sVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z) {
        com.fyber.inneractive.sdk.flow.o oVar;
        com.fyber.inneractive.sdk.response.e eVar = (com.fyber.inneractive.sdk.response.e) obj;
        if (exc == null) {
            s sVar = this.a;
            sVar.a(sVar.e, eVar);
            return;
        }
        this.a.getClass();
        InneractiveErrorCode inneractiveErrorCode = exc instanceof k1 ? ((k1) exc).a == 204 ? InneractiveErrorCode.NO_FILL : InneractiveErrorCode.SERVER_INTERNAL_ERROR : exc instanceof FileNotFoundException ? InneractiveErrorCode.CONNECTION_ERROR : exc instanceof n0 ? InneractiveErrorCode.SERVER_INVALID_RESPONSE : InneractiveErrorCode.CONNECTION_ERROR;
        s sVar2 = this.a;
        InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(inneractiveErrorCode, com.fyber.inneractive.sdk.flow.i.NETWORK_ERROR, exc);
        InneractiveAdRequest inneractiveAdRequest = sVar2.e;
        if (sVar2.a == null) {
            return;
        }
        if (sVar2.b) {
            IAlog.e("IARemoteAdFetcher: ignoring response. Previous request was cancelled", new Object[0]);
        } else {
            if (sVar2.b || (oVar = sVar2.a) == null) {
                return;
            }
            oVar.a(inneractiveAdRequest, eVar, inneractiveInfrastructureError);
        }
    }
}
