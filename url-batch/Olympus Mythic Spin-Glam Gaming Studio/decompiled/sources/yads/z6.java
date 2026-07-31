package yads;

import android.content.Context;
import com.monetization.ads.mediation.base.model.MediatedAdObjectInfo;
import com.monetization.ads.quality.base.AdQualityVerificationStateFlow;
import com.monetization.ads.quality.base.AdQualityVerifierAdapter;
import com.monetization.ads.quality.base.model.AdQualityVerificationError;
import com.monetization.ads.quality.base.model.configuration.AdQualityVerifiableNetwork;
import com.monetization.ads.quality.base.model.configuration.AdQualityVerificationAdConfiguration;
import com.monetization.ads.quality.base.model.configuration.AdQualityVerifierAdType;
import com.monetization.ads.quality.base.model.configuration.AdQualityVerifierAdapterConfiguration;
import com.monetization.ads.quality.base.result.AdQualityVerificationResult;
import com.monetization.ads.quality.base.state.AdQualityVerificationState;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class z6 implements y7 {
    public final AdQualityVerifierAdapter a;
    public final AdQualityVerifierAdapterConfiguration b;
    public final long c;
    public final w7 d;
    public final l7 e;
    public final m7 f;

    public z6(AdQualityVerifierAdapter adQualityVerifierAdapter, AdQualityVerifierAdapterConfiguration adQualityVerifierAdapterConfiguration, long j, w7 w7Var, l7 l7Var) {
        m7 m7Var = new m7();
        this.a = adQualityVerifierAdapter;
        this.b = adQualityVerifierAdapterConfiguration;
        this.c = j;
        this.d = w7Var;
        this.e = l7Var;
        this.f = m7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x000c, B:12:0x0030, B:15:0x003b, B:16:0x0046, B:18:0x004c, B:22:0x005d, B:27:0x006b, B:29:0x0073, B:30:0x0085, B:32:0x0089, B:34:0x0092, B:36:0x009b, B:38:0x00a4, B:39:0x00ab, B:58:0x0021, B:60:0x0027, B:61:0x002a, B:62:0x002d), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x000c, B:12:0x0030, B:15:0x003b, B:16:0x0046, B:18:0x004c, B:22:0x005d, B:27:0x006b, B:29:0x0073, B:30:0x0085, B:32:0x0089, B:34:0x0092, B:36:0x009b, B:38:0x00a4, B:39:0x00ab, B:58:0x0021, B:60:0x0027, B:61:0x002a, B:62:0x002d), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x000c, B:12:0x0030, B:15:0x003b, B:16:0x0046, B:18:0x004c, B:22:0x005d, B:27:0x006b, B:29:0x0073, B:30:0x0085, B:32:0x0089, B:34:0x0092, B:36:0x009b, B:38:0x00a4, B:39:0x00ab, B:58:0x0021, B:60:0x0027, B:61:0x002a, B:62:0x002d), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x000c, B:12:0x0030, B:15:0x003b, B:16:0x0046, B:18:0x004c, B:22:0x005d, B:27:0x006b, B:29:0x0073, B:30:0x0085, B:32:0x0089, B:34:0x0092, B:36:0x009b, B:38:0x00a4, B:39:0x00ab, B:58:0x0021, B:60:0x0027, B:61:0x002a, B:62:0x002d), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x000c, B:12:0x0030, B:15:0x003b, B:16:0x0046, B:18:0x004c, B:22:0x005d, B:27:0x006b, B:29:0x0073, B:30:0x0085, B:32:0x0089, B:34:0x0092, B:36:0x009b, B:38:0x00a4, B:39:0x00ab, B:58:0x0021, B:60:0x0027, B:61:0x002a, B:62:0x002d), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009b A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x000c, B:12:0x0030, B:15:0x003b, B:16:0x0046, B:18:0x004c, B:22:0x005d, B:27:0x006b, B:29:0x0073, B:30:0x0085, B:32:0x0089, B:34:0x0092, B:36:0x009b, B:38:0x00a4, B:39:0x00ab, B:58:0x0021, B:60:0x0027, B:61:0x002a, B:62:0x002d), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x000c, B:12:0x0030, B:15:0x003b, B:16:0x0046, B:18:0x004c, B:22:0x005d, B:27:0x006b, B:29:0x0073, B:30:0x0085, B:32:0x0089, B:34:0x0092, B:36:0x009b, B:38:0x00a4, B:39:0x00ab, B:58:0x0021, B:60:0x0027, B:61:0x002a, B:62:0x002d), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0039  */
    @Override // yads.y7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, Object obj, t8 t8Var, v3 v3Var, String str, MediatedAdObjectInfo mediatedAdObjectInfo, q7 q7Var) {
        int ordinal;
        AdQualityVerifierAdType adQualityVerifierAdType;
        AdQualityVerifierAdType adQualityVerifierAdType2;
        String str2;
        Iterator<E> it;
        Object obj2;
        AdQualityVerifiableNetwork a;
        s12 s12Var;
        String str3;
        m7 m7Var = this.f;
        m7Var.getClass();
        try {
            Result.Companion companion = Result.INSTANCE;
            ordinal = v3Var.a.ordinal();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Object m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
            r4 = Result.m8028isFailureimpl(m8023constructorimpl) ? null : m8023constructorimpl;
        }
        if (ordinal == 0) {
            adQualityVerifierAdType = AdQualityVerifierAdType.BANNER;
        } else if (ordinal == 1) {
            adQualityVerifierAdType = AdQualityVerifierAdType.INTERSTITIAL;
        } else if (ordinal == 2) {
            adQualityVerifierAdType = AdQualityVerifierAdType.REWARDED;
        } else {
            if (ordinal != 3) {
                adQualityVerifierAdType2 = null;
                str2 = v3Var.c.a;
                String str4 = str != null ? "yandex" : str;
                c7.c.getClass();
                it = c7.e.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (Intrinsics.areEqual(((c7) obj2).b, str4)) {
                        break;
                    }
                }
                a = b7.a((c7) obj2);
                if (adQualityVerifierAdType2 != null && str2 != null && a != null) {
                    s12Var = t8Var == null ? (s12) t8Var.t : null;
                    if (s12Var == null) {
                        m7Var.a.getClass();
                        str3 = (String) CollectionsKt.firstOrNull((List) v12.b(s12Var));
                    } else {
                        str3 = null;
                    }
                    r4 = new AdQualityVerificationAdConfiguration(a, str2, obj, adQualityVerifierAdType2, mediatedAdObjectInfo == null ? mediatedAdObjectInfo.getAdContent() : null, mediatedAdObjectInfo == null ? mediatedAdObjectInfo.getAdUnitId() : null, str3, mediatedAdObjectInfo == null ? mediatedAdObjectInfo.getAdId() : null, mediatedAdObjectInfo == null ? mediatedAdObjectInfo.getExtraData() : null);
                }
                return r4 == null ? a(context, r4, q7Var) : new AdQualityVerificationResult.NotVerified(new AdQualityVerificationError.InternalError("Failed to create ad configuration for verification"));
            }
            adQualityVerifierAdType = AdQualityVerifierAdType.NATIVE;
        }
        adQualityVerifierAdType2 = adQualityVerifierAdType;
        str2 = v3Var.c.a;
        if (str != null) {
        }
        c7.c.getClass();
        it = c7.e.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        a = b7.a((c7) obj2);
        if (adQualityVerifierAdType2 != null) {
            if (t8Var == null) {
            }
            if (s12Var == null) {
            }
            r4 = new AdQualityVerificationAdConfiguration(a, str2, obj, adQualityVerifierAdType2, mediatedAdObjectInfo == null ? mediatedAdObjectInfo.getAdContent() : null, mediatedAdObjectInfo == null ? mediatedAdObjectInfo.getAdUnitId() : null, str3, mediatedAdObjectInfo == null ? mediatedAdObjectInfo.getAdId() : null, mediatedAdObjectInfo == null ? mediatedAdObjectInfo.getExtraData() : null);
        }
        if (r4 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Context context, AdQualityVerificationAdConfiguration adQualityVerificationAdConfiguration, ContinuationImpl continuationImpl) {
        x6 x6Var;
        int i;
        AdQualityVerificationState adQualityVerificationState;
        Object obj;
        AdQualityVerificationStateFlow verifiedAd;
        StateFlow verificationResultStateFlow;
        if (continuationImpl instanceof x6) {
            x6Var = (x6) continuationImpl;
            int i2 = x6Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x6Var.d = i2 - Integer.MIN_VALUE;
                Object obj2 = x6Var.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = x6Var.d;
                adQualityVerificationState = null;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    long millis = TimeUnit.SECONDS.toMillis(this.c);
                    y6 y6Var = new y6(this, context, adQualityVerificationAdConfiguration, null);
                    x6Var.d = 1;
                    obj2 = TimeoutKt.withTimeoutOrNull(millis, y6Var, x6Var);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj2);
                }
                obj = (AdQualityVerificationResult) obj2;
                if (obj == null) {
                    obj = new AdQualityVerificationResult.Verified(new v6(StateFlowKt.MutableStateFlow(new AdQualityVerificationState.Error(new AdQualityVerificationError.TimeoutError(this.c)))));
                }
                l7 l7Var = this.e;
                l7Var.getClass();
                verifiedAd = !(obj instanceof AdQualityVerificationResult.Verified) ? ((AdQualityVerificationResult.Verified) obj).getVerifiedAd() : null;
                if (verifiedAd != null && (verificationResultStateFlow = verifiedAd.getVerificationResultStateFlow()) != null) {
                    adQualityVerificationState = (AdQualityVerificationState) verificationResultStateFlow.getValue();
                }
                return ((adQualityVerificationState instanceof AdQualityVerificationState.Error) && l7Var.a.c) ? new AdQualityVerificationResult.Verified(new k7(verifiedAd.getVerificationMode(), ((AdQualityVerificationState.Error) adQualityVerificationState).getError())) : obj;
            }
        }
        x6Var = new x6(this, continuationImpl);
        Object obj22 = x6Var.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = x6Var.d;
        adQualityVerificationState = null;
        if (i != 0) {
        }
        obj = (AdQualityVerificationResult) obj22;
        if (obj == null) {
        }
        l7 l7Var2 = this.e;
        l7Var2.getClass();
        if (!(obj instanceof AdQualityVerificationResult.Verified)) {
        }
        if (verifiedAd != null) {
            adQualityVerificationState = (AdQualityVerificationState) verificationResultStateFlow.getValue();
        }
        if (adQualityVerificationState instanceof AdQualityVerificationState.Error) {
            return obj;
        }
    }

    @Override // yads.y7
    public final void onAdClicked() {
        try {
            Result.Companion companion = Result.INSTANCE;
            this.a.onAdClicked();
            Result.m8023constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Override // yads.y7
    public final void onAdClosed() {
        try {
            Result.Companion companion = Result.INSTANCE;
            this.a.onAdClosed();
            Result.m8023constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Override // yads.y7
    public final void onAdDisplayed() {
        try {
            Result.Companion companion = Result.INSTANCE;
            this.a.onAdDisplayed();
            Result.m8023constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Override // yads.y7
    public final void onInvalidated() {
        try {
            Result.Companion companion = Result.INSTANCE;
            this.a.onInvalidated();
            Result.m8023constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:22|23))(7:24|25|(2:27|(1:29))|12|13|(3:15|(1:17)|18)|19)|11|12|13|(0)|19))|32|6|7|(0)(0)|11|12|13|(0)|19) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0029, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0050, code lost:
    
        r6 = kotlin.Result.INSTANCE;
        r5 = kotlin.Result.m8023constructorimpl(kotlin.ResultKt.createFailure(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, AdQualityVerificationAdConfiguration adQualityVerificationAdConfiguration, ContinuationImpl continuationImpl) {
        w6 w6Var;
        int i;
        Throwable m8026exceptionOrNullimpl;
        Object a;
        if (continuationImpl instanceof w6) {
            w6Var = (w6) continuationImpl;
            int i2 = w6Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w6Var.d = i2 - Integer.MIN_VALUE;
                Object obj = w6Var.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = w6Var.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    a = this.d.a(adQualityVerificationAdConfiguration);
                    if (a == null) {
                        w6Var.d = 1;
                        obj = b(context, adQualityVerificationAdConfiguration, w6Var);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    Object m8023constructorimpl = Result.m8023constructorimpl(a);
                    m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
                    if (m8026exceptionOrNullimpl != null) {
                        String message = m8026exceptionOrNullimpl.getMessage();
                        if (message == null) {
                            message = "Unknown error with empty description";
                        }
                        m8023constructorimpl = new AdQualityVerificationResult.NotVerified(new AdQualityVerificationError.UnknownError(message));
                    }
                    return m8023constructorimpl;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                a = (AdQualityVerificationResult) obj;
                Object m8023constructorimpl2 = Result.m8023constructorimpl(a);
                m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl2);
                if (m8026exceptionOrNullimpl != null) {
                }
                return m8023constructorimpl2;
            }
        }
        w6Var = new w6(this, continuationImpl);
        Object obj2 = w6Var.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = w6Var.d;
        if (i != 0) {
        }
        a = (AdQualityVerificationResult) obj2;
        Object m8023constructorimpl22 = Result.m8023constructorimpl(a);
        m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl22);
        if (m8026exceptionOrNullimpl != null) {
        }
        return m8023constructorimpl22;
    }
}
