package com.mobilefuse.sdk.internal;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mobilefuse.sdk.service.MobileFuseServices;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: MobileFuseBiddingTokenProvider_getTokenData.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000¨\u0006\u000b"}, d2 = {"buildTokenWithRequest", "", "", "request", "Lcom/mobilefuse/sdk/internal/IMobileFuseBiddingTokenRequest;", "getBiddingTokenData", "", "context", "Landroid/content/Context;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/mobilefuse/sdk/internal/TokenDataListener;", "mobilefuse-sdk-core_release"}, k = 2, mv = {1, 4, 3})
/* loaded from: classes13.dex */
public final class MobileFuseBiddingTokenProvider_getTokenDataKt {
    public static final void getBiddingTokenData(@NotNull final IMobileFuseBiddingTokenRequest request, @NotNull Context context, @NotNull final TokenDataListener listener) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        SdkInitializer.ensureSdkSetup(false);
        MobileFuseServices.requireAllServices(new Function0() { // from class: com.mobilefuse.sdk.internal.MobileFuseBiddingTokenProvider_getTokenDataKt$getBiddingTokenData$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                Map<String, String> buildTokenWithRequest;
                try {
                    buildTokenWithRequest = MobileFuseBiddingTokenProvider_getTokenDataKt.buildTokenWithRequest(IMobileFuseBiddingTokenRequest.this);
                    listener.onDataGenerated(buildTokenWithRequest);
                } catch (Throwable th) {
                    listener.onDataGenerationFailed("Failed to generate token with internal error: " + th.getMessage());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<String, String> buildTokenWithRequest(IMobileFuseBiddingTokenRequest iMobileFuseBiddingTokenRequest) {
        Map<String, Object> buildBaseDataMap = BiddingTokenUtils.INSTANCE.buildBaseDataMap(iMobileFuseBiddingTokenRequest);
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(buildBaseDataMap.size()));
        Iterator<T> it = buildBaseDataMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), entry.getValue().toString());
        }
        return linkedHashMap;
    }
}
