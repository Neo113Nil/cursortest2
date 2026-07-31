package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.ironsource.F9;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class V0 {
    public static final V0 a = new V0();

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        U0 u0;
        int i;
        AdResponse adResponse;
        try {
            if (continuationImpl instanceof U0) {
                u0 = (U0) continuationImpl;
                int i2 = u0.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    u0.c = i2 - Integer.MIN_VALUE;
                    Object obj = u0.a;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = u0.c;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Intrinsics.checkNotNullParameter(AdResponse.class, "clazz");
                        Intrinsics.checkNotNullParameter(AdResponse.class, "type");
                        u0.c = 1;
                        JSONObject jsonObject = new JSONObject(str);
                        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
                        Intrinsics.checkNotNullParameter(AdResponse.class, "type");
                        obj = AdResponse.class.cast(AbstractC4494ya.a(jsonObject, AdResponse.class, null, null));
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    adResponse = (AdResponse) obj;
                    if (adResponse == null) {
                        return adResponse;
                    }
                    throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C4108jj(MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, Boxing.boxShort((short) 2232)))));
                }
            }
            if (i != 0) {
            }
            adResponse = (AdResponse) obj;
            if (adResponse == null) {
            }
        } catch (Exception e) {
            int i3 = !(e instanceof JSONException) ? e instanceof ClassCastException ? 2207 : F9.a.g : 2113;
            e.toString();
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C4108jj(MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, Boxing.boxShort((short) i3)))));
        }
        u0 = new U0(this, continuationImpl);
        Object obj2 = u0.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = u0.c;
    }
}
