package yads;

import com.monetization.ads.mediation.base.MediatedAdapterInfo;
import com.monetization.ads.mediation.base.model.MediatedAdObject;
import com.pubmatic.sdk.common.POBCommonConstants;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes3.dex */
public final class yn1 {
    public final com.monetization.ads.mediation.base.a a;

    public yn1(com.monetization.ads.mediation.base.a aVar) {
        this.a = aVar;
    }

    public final MediatedAdObject a() {
        Object m8023constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(this.a.getAdObject());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8028isFailureimpl(m8023constructorimpl)) {
            m8023constructorimpl = null;
        }
        return (MediatedAdObject) m8023constructorimpl;
    }

    public final MediatedAdapterInfo b() {
        Object m8023constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(this.a.getAdapterInfo());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8026exceptionOrNullimpl(m8023constructorimpl) != null) {
            m8023constructorimpl = new MediatedAdapterInfo.Builder().setAdapterVersion(POBCommonConstants.NULL_VALUE).setNetworkName(POBCommonConstants.NULL_VALUE).setNetworkSdkVersion(POBCommonConstants.NULL_VALUE).build();
        }
        return (MediatedAdapterInfo) m8023constructorimpl;
    }
}
