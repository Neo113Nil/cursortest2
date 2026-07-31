package yads;

import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.StartupParamsItem;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes15.dex */
public final class xb0 implements StartupParamsCallback {
    public final /* synthetic */ List a;
    public final /* synthetic */ dg b;

    public xb0(List list, dg dgVar) {
        this.a = list;
        this.b = dgVar;
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onReceive(StartupParamsCallback.Result result) {
        Map<String, StartupParamsItem> map;
        StartupParamsItem startupParamsItem;
        List list = this.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(obj, (result == null || (map = result.parameters) == null || (startupParamsItem = map.get((String) obj)) == null) ? null : startupParamsItem.getId());
        }
        zf zfVar = this.b.a;
        uf ufVar = new uf((String) linkedHashMap.get(StartupParamsCallback.APPMETRICA_UUID), (String) linkedHashMap.get(StartupParamsCallback.APPMETRICA_DEVICE_ID), (String) linkedHashMap.get("appmetrica_get_ad_url"));
        if (zfVar.a.isActive()) {
            zfVar.a.resumeWith(Result.m8023constructorimpl(Result.m8022boximpl(Result.m8023constructorimpl(ufVar))));
        }
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onRequestError(StartupParamsCallback.Reason reason, StartupParamsCallback.Result result) {
        vf vfVar;
        tf tfVar = Intrinsics.areEqual(reason, StartupParamsCallback.Reason.NETWORK) ? tf.c : Intrinsics.areEqual(reason, StartupParamsCallback.Reason.INVALID_RESPONSE) ? tf.d : tf.b;
        zf zfVar = this.b.a;
        int ordinal = tfVar.ordinal();
        if (ordinal == 0) {
            vfVar = vf.b;
        } else if (ordinal == 1) {
            vfVar = vf.c;
        } else {
            if (ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            vfVar = vf.d;
        }
        if (zfVar.a.isActive()) {
            CancellableContinuationImpl cancellableContinuationImpl = zfVar.a;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuationImpl.resumeWith(Result.m8023constructorimpl(ResultKt.createFailure(new wf(vfVar))));
        }
    }
}
