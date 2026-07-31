package com.safedk.android.internal.partials;

import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.NetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.n;
import okhttp3.ResponseBody;
import okio.BufferedSource;

/* compiled from: OkHttpSourceFile */
/* loaded from: classes7.dex */
public class OkHttpNetworkBridge {
    public static BufferedSource retrofitExceptionCatchingRequestBody_source(ResponseBody targetInstance) {
        Logger.d("OkHttpNetwork|SafeDK: Partial-Network> Lcom/safedk/android/internal/partials/OkHttpNetworkBridge;->retrofitExceptionCatchingRequestBody_source(Lokhttp3/ResponseBody;)Lokio/BufferedSource;");
        BufferedSource bodySource = targetInstance.getBodySource();
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
            try {
                int identityHashCode = System.identityHashCode(targetInstance);
                Logger.d("SafeDKNetwork", "retrofit|retrofitExceptionCatchingRequestBody_source bodyId ", Integer.valueOf(identityHashCode), " retroReq ", NetworkBridge.d, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                NetworkBridge.RequestInfo requestInfo = NetworkBridge.d.get(Integer.valueOf(identityHashCode));
                if (requestInfo != null) {
                    bodySource = CreativeInfoManager.a(requestInfo.a(), requestInfo.b(), bodySource, identityHashCode);
                    Logger.d("SafeDKNetwork", "retrofit|retrofitExceptionCatchingRequestBody_source found responseBodyId:", Integer.valueOf(identityHashCode), ", RequestInfo:", requestInfo, ", returning Source: ", bodySource);
                    return bodySource;
                }
                return bodySource;
            } catch (Throwable th) {
                Logger.d("SafeDKNetwork", "retrofit|retrofitExceptionCatchingRequestBody_source error ", th.getMessage());
                return bodySource;
            }
        }
        return bodySource;
    }
}
