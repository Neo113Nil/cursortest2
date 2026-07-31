package yads;

import android.content.Context;
import com.ironsource.O6;
import com.monetization.ads.mediation.base.model.MediatedAdObjectInfo;
import com.monetization.ads.quality.base.model.AdQualityVerificationBlockingReasons;
import com.monetization.ads.quality.base.model.AdQualityVerificationError;
import com.monetization.ads.quality.base.result.AdQualityVerificationResult;
import com.monetization.ads.quality.base.state.AdQualityVerificationState;
import com.pubmatic.sdk.common.POBCommonConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* loaded from: classes3.dex */
public final class r7 {
    public final v3 a;
    public final Context b;
    public final h7 c;
    public t8 d;
    public AdQualityVerificationResult e;
    public String f;
    public tn1 g;
    public final Lazy h;

    public r7(Context context, v3 v3Var, yu2 yu2Var) {
        h7 h7Var = new h7(v3Var, yu2Var);
        this.a = v3Var;
        this.b = context;
        this.c = h7Var;
        this.e = AdQualityVerificationResult.WaitingForVerification.INSTANCE;
        this.h = LazyKt.lazy(new p7(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, t8 t8Var, String str, MediatedAdObjectInfo mediatedAdObjectInfo, tn1 tn1Var, ContinuationImpl continuationImpl) {
        q7 q7Var;
        int i;
        AdQualityVerificationResult adQualityVerificationResult;
        AdQualityVerificationBlockingReasons adQualityVerificationBlockingReasons;
        if (continuationImpl instanceof q7) {
            q7Var = (q7) continuationImpl;
            int i2 = q7Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q7Var.d = i2 - Integer.MIN_VALUE;
                q7 q7Var2 = q7Var;
                Object obj2 = q7Var2.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = q7Var2.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    if (!b()) {
                        return u7.a;
                    }
                    this.d = t8Var;
                    this.f = str;
                    this.g = tn1Var;
                    y7 y7Var = (y7) this.h.getValue();
                    Context context = this.b;
                    v3 v3Var = this.a;
                    q7Var2.d = 1;
                    obj2 = y7Var.a(context, obj, t8Var, v3Var, str, mediatedAdObjectInfo, q7Var2);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj2);
                }
                adQualityVerificationResult = (AdQualityVerificationResult) obj2;
                this.e = adQualityVerificationResult;
                if (adQualityVerificationResult instanceof AdQualityVerificationResult.Verified) {
                    AdQualityVerificationState adQualityVerificationState = (AdQualityVerificationState) ((AdQualityVerificationResult.Verified) adQualityVerificationResult).getVerifiedAd().getVerificationResultStateFlow().getValue();
                    if (adQualityVerificationState instanceof AdQualityVerificationState.Blocked) {
                        adQualityVerificationBlockingReasons = ((AdQualityVerificationState.Blocked) adQualityVerificationState).getReason();
                    } else if (adQualityVerificationState instanceof AdQualityVerificationState.ShouldBeBlockedOnDisplay) {
                        adQualityVerificationBlockingReasons = ((AdQualityVerificationState.ShouldBeBlockedOnDisplay) adQualityVerificationState).getReason();
                    }
                    if (adQualityVerificationBlockingReasons != null || adQualityVerificationBlockingReasons.getBlockReasons().isEmpty()) {
                        return u7.a;
                    }
                    a();
                    return new s7(adQualityVerificationBlockingReasons);
                }
                adQualityVerificationBlockingReasons = null;
                if (adQualityVerificationBlockingReasons != null) {
                }
                return u7.a;
            }
        }
        q7Var = new q7(this, continuationImpl);
        q7 q7Var22 = q7Var;
        Object obj22 = q7Var22.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = q7Var22.d;
        if (i != 0) {
        }
        adQualityVerificationResult = (AdQualityVerificationResult) obj22;
        this.e = adQualityVerificationResult;
        if (adQualityVerificationResult instanceof AdQualityVerificationResult.Verified) {
        }
        adQualityVerificationBlockingReasons = null;
        if (adQualityVerificationBlockingReasons != null) {
        }
        return u7.a;
    }

    public final boolean b() {
        vw2 vw2Var;
        vw2 vw2Var2 = vw2.l;
        if (vw2Var2 == null) {
            synchronized (vw2.k) {
                vw2Var = vw2.l;
                if (vw2Var == null) {
                    vw2Var = new vw2();
                    vw2.l = vw2Var;
                }
            }
            vw2Var2 = vw2Var;
        }
        bu2 a = vw2Var2.a(this.b);
        d7 d7Var = a != null ? a.z0 : null;
        return d7Var != null && d7Var.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        io2 a;
        String str;
        String str2;
        c cVar;
        Map map;
        if (b()) {
            AdQualityVerificationResult adQualityVerificationResult = this.e;
            if (!(adQualityVerificationResult instanceof AdQualityVerificationResult.WaitingForVerification) || this.d != null) {
                h7 h7Var = this.c;
                Context context = this.b;
                t8 t8Var = this.d;
                String str3 = this.f;
                tn1 tn1Var = this.g;
                h7Var.getClass();
                if (!(adQualityVerificationResult instanceof AdQualityVerificationResult.NotImplemented)) {
                    t6 t6Var = h7Var.c;
                    v3 v3Var = h7Var.a;
                    t6Var.getClass();
                    if ((t8Var != null ? t8Var.m : null) == nz.b) {
                        Object obj = t8Var.t;
                        a = t6Var.b.a(v3Var, t8Var, obj instanceof s12 ? (s12) obj : null);
                    } else {
                        a = t6Var.a.a(v3Var, t8Var);
                    }
                    a.a(str3, "verification_network");
                    if (tn1Var != null) {
                        a.a(tn1Var.b.b, O6.G1);
                        no1 no1Var = t6Var.c;
                        yn1 yn1Var = tn1Var.c;
                        no1Var.getClass();
                        Map a2 = no1.a(yn1Var);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : a2.entrySet()) {
                            if (!Intrinsics.areEqual((String) entry.getValue(), POBCommonConstants.NULL_VALUE)) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                            a.a((String) entry2.getValue(), (String) entry2.getKey());
                        }
                    }
                    h7Var.d.getClass();
                    Map emptyMap = MapsKt.emptyMap();
                    if (!TypeIntrinsics.isMutableMap(emptyMap)) {
                        emptyMap = null;
                    }
                    if (emptyMap == null) {
                        emptyMap = new LinkedHashMap();
                    }
                    String a3 = j7.a(adQualityVerificationResult);
                    if (a3 == null) {
                        emptyMap.put("verification_status", "undefined");
                    } else {
                        emptyMap.put("verification_status", a3);
                    }
                    boolean z = adQualityVerificationResult instanceof AdQualityVerificationResult.Verified;
                    if (z) {
                        int i = i7.a[((AdQualityVerificationResult.Verified) adQualityVerificationResult).getVerifiedAd().getVerificationMode().ordinal()];
                        if (i != 1) {
                            if (i != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str = "longVerification";
                        } else {
                            str = "fastVerification";
                        }
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        emptyMap.put("verification_flow", "undefined");
                    } else {
                        emptyMap.put("verification_flow", str);
                    }
                    if (z) {
                        AdQualityVerificationState adQualityVerificationState = (AdQualityVerificationState) ((AdQualityVerificationResult.Verified) adQualityVerificationResult).getVerifiedAd().getVerificationResultStateFlow().getValue();
                        if ((adQualityVerificationState instanceof AdQualityVerificationState.Verified) || (adQualityVerificationState instanceof AdQualityVerificationState.Blocked) || (adQualityVerificationState instanceof AdQualityVerificationState.ShouldBeBlockedOnDisplay)) {
                            str2 = "success";
                            emptyMap.put("status", str2);
                            cVar = a.b;
                            if (cVar == null) {
                                cVar = null;
                            }
                            Map plus = MapsKt.plus(a.a, emptyMap);
                            map = TypeIntrinsics.isMutableMap(plus) ? plus : null;
                            if (map == null) {
                                map = new LinkedHashMap();
                            }
                            fo2 fo2Var = fo2.c;
                            ho2 ho2Var = new ho2("ad_verification_result", MapsKt.toMutableMap(map), cVar);
                            h7Var.b.getClass();
                            ud.a(context, new dq3(((nt3) h7Var.b).a)).a(ho2Var);
                        }
                    }
                    if (adQualityVerificationResult instanceof AdQualityVerificationResult.NotVerified) {
                        AdQualityVerificationError reason = ((AdQualityVerificationResult.NotVerified) adQualityVerificationResult).getReason();
                        if ((reason instanceof AdQualityVerificationError.DisabledError) || (reason instanceof AdQualityVerificationError.LowUsagePercent) || (reason instanceof AdQualityVerificationError.UnsupportedNetwork)) {
                            str2 = "verification not enabled";
                            emptyMap.put("status", str2);
                            cVar = a.b;
                            if (cVar == null) {
                            }
                            Map plus2 = MapsKt.plus(a.a, emptyMap);
                            if (TypeIntrinsics.isMutableMap(plus2)) {
                            }
                            if (map == null) {
                            }
                            fo2 fo2Var2 = fo2.c;
                            ho2 ho2Var2 = new ho2("ad_verification_result", MapsKt.toMutableMap(map), cVar);
                            h7Var.b.getClass();
                            ud.a(context, new dq3(((nt3) h7Var.b).a)).a(ho2Var2);
                        }
                    }
                    str2 = "error";
                    emptyMap.put("status", str2);
                    cVar = a.b;
                    if (cVar == null) {
                    }
                    Map plus22 = MapsKt.plus(a.a, emptyMap);
                    if (TypeIntrinsics.isMutableMap(plus22)) {
                    }
                    if (map == null) {
                    }
                    fo2 fo2Var22 = fo2.c;
                    ho2 ho2Var22 = new ho2("ad_verification_result", MapsKt.toMutableMap(map), cVar);
                    h7Var.b.getClass();
                    ud.a(context, new dq3(((nt3) h7Var.b).a)).a(ho2Var22);
                }
            }
            ((y7) this.h.getValue()).onInvalidated();
        }
    }
}
