package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.inmobi.media.ads.network.common.model.OmSdkInfo;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes10.dex */
public abstract class E6 {
    public final Rc a;
    public final AbstractC3984f1 b;

    public E6(Rc nativeAdUnitComponent, AbstractC3984f1 adSessionManager) {
        Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        Intrinsics.checkNotNullParameter(adSessionManager, "adSessionManager");
        this.a = nativeAdUnitComponent;
        this.b = adSessionManager;
    }

    public final InterfaceC4466x9 a() {
        return this.a.a.a.c;
    }

    public abstract Object a(Continuation continuation);

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, ContinuationImpl continuationImpl) {
        D6 d6;
        int i;
        OmSdkInfo omSdkInfo;
        List list2;
        InterfaceC4466x9 a;
        String customReferenceData;
        if (continuationImpl instanceof D6) {
            d6 = (D6) continuationImpl;
            int i2 = d6.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d6.e = i2 - Integer.MIN_VALUE;
                Object obj = d6.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = d6.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (list.isEmpty()) {
                        InterfaceC4466x9 a2 = a();
                        if (a2 != null) {
                            ((C4493y9) a2).a("ExperienceLoader", "OMID trackers are empty");
                        }
                        return Unit.INSTANCE;
                    }
                    MetaInfo metaInfo = this.a.a.b.d;
                    OmSdkInfo omsdkInfo = metaInfo != null ? metaInfo.getOmsdkInfo() : null;
                    boolean z = omsdkInfo != null && omsdkInfo.getOmidEnabled();
                    boolean omidEnabled = this.a.a.b.a.b.getViewability().getOmidConfig().getOmidEnabled();
                    if (z && omidEnabled) {
                        Df df = Df.a;
                        d6.a = list;
                        d6.b = omsdkInfo;
                        d6.e = 1;
                        Context context = AbstractC4002fj.a;
                        Object withContext = context == null ? "" : BuildersKt.withContext(Dispatchers.getIO(), new Bf(context, null), d6);
                        if (withContext == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        omSdkInfo = omsdkInfo;
                        obj = withContext;
                        list2 = list;
                    } else {
                        InterfaceC4466x9 a3 = a();
                        if (a3 != null) {
                            ((C4493y9) a3).a("ExperienceLoader", "OMID is not enabled");
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    omSdkInfo = d6.b;
                    List list3 = d6.a;
                    ResultKt.throwOnFailure(obj);
                    list2 = list3;
                }
                String str = (String) obj;
                String str2 = this.a.a.b.a.a.f;
                a = a();
                if (a != null) {
                    ((C4493y9) a).a("ExperienceLoader", "OM-SDK Session Initialize Called");
                }
                AbstractC3984f1 abstractC3984f1 = this.b;
                if (omSdkInfo != null || (r1 = omSdkInfo.getMacros()) == null) {
                    Map emptyMap = MapsKt.emptyMap();
                }
                abstractC3984f1.a(str, list2, emptyMap, str2, (omSdkInfo != null || (customReferenceData = omSdkInfo.getCustomReferenceData()) == null) ? "" : customReferenceData, omSdkInfo == null && omSdkInfo.getIsolateVerificationScripts());
                return Unit.INSTANCE;
            }
        }
        d6 = new D6(this, continuationImpl);
        Object obj2 = d6.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = d6.e;
        if (i != 0) {
        }
        String str3 = (String) obj2;
        String str22 = this.a.a.b.a.a.f;
        a = a();
        if (a != null) {
        }
        AbstractC3984f1 abstractC3984f12 = this.b;
        if (omSdkInfo != null) {
        }
        Map emptyMap2 = MapsKt.emptyMap();
        abstractC3984f12.a(str3, list2, emptyMap2, str22, (omSdkInfo != null || (customReferenceData = omSdkInfo.getCustomReferenceData()) == null) ? "" : customReferenceData, omSdkInfo == null && omSdkInfo.getIsolateVerificationScripts());
        return Unit.INSTANCE;
    }
}
