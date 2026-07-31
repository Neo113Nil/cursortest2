package com.pubmatic.sdk.common.service;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.log.POBLogConstants;
import com.pubmatic.sdk.common.network.POBHttpRequest;
import com.pubmatic.sdk.common.network.POBNetworkHandler;
import com.pubmatic.sdk.common.network.POBNetworkMonitor;
import com.pubmatic.sdk.common.network.POBNetworkResult;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.unity3d.services.core.fid.Constants;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001e\u001fB!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/pubmatic/sdk/common/service/POBDeviceIpUpdaterService;", "", "Landroid/content/Context;", "context", "", "publisherId", "", "profileId", "<init>", "(Landroid/content/Context;Ljava/lang/String;I)V", "", "a", "()V", "Lcom/pubmatic/sdk/common/service/POBDeviceIpUpdaterService$POBIpUpdateListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "registerListener", "(Lcom/pubmatic/sdk/common/service/POBDeviceIpUpdaterService$POBIpUpdateListener;)Z", "unregisterListener", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "goingOn", "Ljava/util/concurrent/CopyOnWriteArraySet;", "b", "Ljava/util/concurrent/CopyOnWriteArraySet;", "ipUpdateListeners", "Lcom/pubmatic/sdk/common/network/POBHttpRequest;", "c", "Lcom/pubmatic/sdk/common/network/POBHttpRequest;", "profileRequest", "Companion", "POBIpUpdateListener", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes13.dex */
public final class POBDeviceIpUpdaterService {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final String d = "POBUpdaterService";
    private static volatile POBDeviceIpUpdaterService e;

    /* renamed from: a, reason: from kotlin metadata */
    private final AtomicBoolean goingOn;

    /* renamed from: b, reason: from kotlin metadata */
    private final CopyOnWriteArraySet ipUpdateListeners;

    /* renamed from: c, reason: from kotlin metadata */
    private final POBHttpRequest profileRequest;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/pubmatic/sdk/common/service/POBDeviceIpUpdaterService$Companion;", "", "()V", "INSTANCE", "Lcom/pubmatic/sdk/common/service/POBDeviceIpUpdaterService;", "TAG", "", Constants.GET_INSTANCE, "context", "Landroid/content/Context;", "publisherId", "profileId", "", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final POBDeviceIpUpdaterService getInstance(@NotNull Context context, @NotNull String publisherId, int profileId) {
            POBDeviceIpUpdaterService pOBDeviceIpUpdaterService;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(publisherId, "publisherId");
            POBDeviceIpUpdaterService pOBDeviceIpUpdaterService2 = POBDeviceIpUpdaterService.e;
            if (pOBDeviceIpUpdaterService2 != null) {
                return pOBDeviceIpUpdaterService2;
            }
            synchronized (this) {
                pOBDeviceIpUpdaterService = POBDeviceIpUpdaterService.e;
                if (pOBDeviceIpUpdaterService == null) {
                    pOBDeviceIpUpdaterService = new POBDeviceIpUpdaterService(context, publisherId, profileId, null);
                    POBDeviceIpUpdaterService.e = pOBDeviceIpUpdaterService;
                }
            }
            return pOBDeviceIpUpdaterService;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/pubmatic/sdk/common/service/POBDeviceIpUpdaterService$POBIpUpdateListener;", "", "onIpAddressFetched", "", "ipAddress", "", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface POBIpUpdateListener {
        void onIpAddressFetched(@NotNull String ipAddress);
    }

    public /* synthetic */ POBDeviceIpUpdaterService(Context context, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        if (this.goingOn.compareAndSet(false, true)) {
            POBLog.debug(d, "Requesting profile config with url - : %s", this.profileRequest.getUrl());
            POBInstanceProvider.getNetworkHandlerWithBackgroundThreadDelivery().sendRequest(this.profileRequest, new POBNetworkHandler.POBNetworkListener<String>() { // from class: com.pubmatic.sdk.common.service.POBDeviceIpUpdaterService$fetchDeviceIpFromProfileConfig$1
                @Override // com.pubmatic.sdk.common.network.POBNetworkHandler.POBNetworkListener
                public void onFailure(@NotNull POBError error) {
                    AtomicBoolean atomicBoolean;
                    String str;
                    POBHttpRequest pOBHttpRequest;
                    Intrinsics.checkNotNullParameter(error, "error");
                    atomicBoolean = POBDeviceIpUpdaterService.this.goingOn;
                    atomicBoolean.set(false);
                    str = POBDeviceIpUpdaterService.d;
                    Integer valueOf = Integer.valueOf(error.getErrorCode());
                    pOBHttpRequest = POBDeviceIpUpdaterService.this.profileRequest;
                    POBLog.debug(str, POBLogConstants.PROFILE_CONFIG_FAILED_STATUS, valueOf, pOBHttpRequest.getRequestTag());
                }

                @Override // com.pubmatic.sdk.common.network.POBNetworkHandler.POBNetworkListener
                public void onSuccess(@Nullable String response) {
                    AtomicBoolean atomicBoolean;
                    atomicBoolean = POBDeviceIpUpdaterService.this.goingOn;
                    atomicBoolean.set(false);
                }
            }, (POBNetworkHandler.POBNetworkRedirectListener) null, new POBNetworkHandler.POBNetworkResultListener() { // from class: com.pubmatic.sdk.common.service.POBDeviceIpUpdaterService$$ExternalSyntheticLambda0
                @Override // com.pubmatic.sdk.common.network.POBNetworkHandler.POBNetworkResultListener
                public final void onResult(POBNetworkResult pOBNetworkResult) {
                    POBDeviceIpUpdaterService.a(POBDeviceIpUpdaterService.this, pOBNetworkResult);
                }
            });
        }
    }

    @NotNull
    public static final POBDeviceIpUpdaterService getInstance(@NotNull Context context, @NotNull String str, int i) {
        return INSTANCE.getInstance(context, str, i);
    }

    public final boolean registerListener(@NotNull POBIpUpdateListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        return this.ipUpdateListeners.add(listener);
    }

    public final boolean unregisterListener(@NotNull POBIpUpdateListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        return this.ipUpdateListeners.remove(listener);
    }

    private POBDeviceIpUpdaterService(Context context, String str, int i) {
        this.goingOn = new AtomicBoolean(false);
        this.ipUpdateListeners = new CopyOnWriteArraySet();
        POBHttpRequest pOBHttpRequest = new POBHttpRequest();
        pOBHttpRequest.setUrl(POBUtils.buildConfigURL(str, i));
        pOBHttpRequest.setRequestTag(String.valueOf(i));
        pOBHttpRequest.setTimeout(5000);
        Map<String, String> headers = pOBHttpRequest.getHeaders();
        Intrinsics.checkNotNullExpressionValue(headers, "headers");
        headers.put(POBCommonConstants.REQ_CLIENT_IP, "true");
        this.profileRequest = pOBHttpRequest;
        POBInstanceProvider.getNetworkMonitor(context).registerConnectivityListener(new POBNetworkMonitor.POBConnectivityListener() { // from class: com.pubmatic.sdk.common.service.POBDeviceIpUpdaterService.1
            @Override // com.pubmatic.sdk.common.network.POBNetworkMonitor.POBConnectivityListener
            public void onNetworkConnectionChanged(boolean isConnected) {
                if (isConnected) {
                    POBDeviceIpUpdaterService.this.a();
                }
            }

            @Override // com.pubmatic.sdk.common.network.POBNetworkMonitor.POBConnectivityListener
            public void onNetworkPropertiesChanged() {
                POBDeviceIpUpdaterService.this.a();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(POBDeviceIpUpdaterService this$0, POBNetworkResult pOBNetworkResult) {
        Map<String, String> headers;
        String str;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (pOBNetworkResult == null || (headers = pOBNetworkResult.getHeaders()) == null || (str = headers.get(POBCommonConstants.CLIENT_IP)) == null) {
            return;
        }
        if (StringsKt.isBlank(str)) {
            str = null;
        }
        if (str != null) {
            Iterator it = this$0.ipUpdateListeners.iterator();
            while (it.hasNext()) {
                ((POBIpUpdateListener) it.next()).onIpAddressFetched(str);
            }
        }
    }
}
