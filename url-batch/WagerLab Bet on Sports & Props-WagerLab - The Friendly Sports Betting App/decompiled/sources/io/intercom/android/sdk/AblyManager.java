package io.intercom.android.sdk;

import com.intercom.twig.Twig;
import io.ably.lib.realtime.AblyRealtime;
import io.ably.lib.realtime.Channel;
import io.ably.lib.realtime.Connection;
import io.ably.lib.realtime.ConnectionState;
import io.ably.lib.realtime.ConnectionStateListener;
import io.ably.lib.rest.Auth;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.FeatureFlag;
import io.intercom.android.sdk.m5.conversation.data.ParsedAblyEvent;
import io.intercom.android.sdk.models.AblyAuthResponse;
import io.intercom.android.sdk.models.AblyConnectResponse;
import io.intercom.android.sdk.models.AblyEndpoint;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;

/* compiled from: AblyManager.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0017H\u0002J\u0006\u0010\u0018\u001a\u00020\u0019J(\u0010\u001a\u001a\u001c\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0018\u00010\u001bH\u0082@¢\u0006\u0002\u0010\u001fJ\b\u0010 \u001a\u00020!H\u0002J\u0006\u0010\"\u001a\u00020\u0019J\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lio/intercom/android/sdk/AblyManager;", "", "twig", "Lcom/intercom/twig/Twig;", "messengerApi", "Lio/intercom/android/sdk/api/MessengerApi;", "<init>", "(Lcom/intercom/twig/Twig;Lio/intercom/android/sdk/api/MessengerApi;)V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "ablyRealtime", "Lio/ably/lib/realtime/AblyRealtime;", "currentChannel", "Lio/ably/lib/realtime/Channel;", "messageListener", "Lio/ably/lib/realtime/Channel$MessageListener;", "connectionListener", "Lio/ably/lib/realtime/ConnectionStateListener;", "_sharedEventFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "Lio/intercom/android/sdk/m5/conversation/data/ParsedAblyEvent;", "getSharedEventFlow", "createAblyEventFlow", "Lkotlinx/coroutines/flow/Flow;", "connect", "", "getAblyConfiguration", "Lkotlin/Triple;", "", "", "Lio/intercom/android/sdk/models/AblyEndpoint;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createAuthCallback", "Lio/ably/lib/rest/Auth$TokenCallback;", "removeListeners", "isConnected", "", "disconnect", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AblyManager {
    public static final int $stable = 8;
    private SharedFlow<? extends ParsedAblyEvent> _sharedEventFlow;
    private AblyRealtime ablyRealtime;
    private ConnectionStateListener connectionListener;
    private Channel currentChannel;
    private Channel.MessageListener messageListener;
    private final MessengerApi messengerApi;
    private final CoroutineScope scope;
    private final Twig twig;

    public AblyManager(Twig twig, MessengerApi messengerApi) {
        Intrinsics.checkNotNullParameter(twig, "twig");
        Intrinsics.checkNotNullParameter(messengerApi, "messengerApi");
        this.twig = twig;
        this.messengerApi = messengerApi;
        this.scope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()));
    }

    public final SharedFlow<ParsedAblyEvent> getSharedEventFlow() {
        this.twig.d("AblyManager: getSharedEventFlow() called", new Object[0]);
        if (this._sharedEventFlow == null) {
            synchronized (this) {
                if (this._sharedEventFlow == null) {
                    this.twig.d("AblyManager: Creating new shared flow", new Object[0]);
                    this._sharedEventFlow = FlowKt.shareIn(createAblyEventFlow(), this.scope, SharingStarted.INSTANCE.getEagerly(), 0);
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        SharedFlow sharedFlow = this._sharedEventFlow;
        Intrinsics.checkNotNull(sharedFlow);
        return sharedFlow;
    }

    private final Flow<ParsedAblyEvent> createAblyEventFlow() {
        return FlowKt.callbackFlow(new AblyManager$createAblyEventFlow$1(this, null));
    }

    public final void connect() {
        if (!Injector.get().getAppConfigProvider().get().hasFeature(FeatureFlag.ABLY_REALTIME_DISABLED) && this.ablyRealtime == null) {
            BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new AblyManager$connect$1(this, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0085 A[Catch: Exception -> 0x0037, TryCatch #2 {Exception -> 0x0037, blocks: (B:12:0x0033, B:13:0x007f, B:15:0x0085, B:18:0x00ac, B:21:0x00a3, B:23:0x00b6, B:25:0x00bc), top: B:11:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bc A[Catch: Exception -> 0x0037, TRY_LEAVE, TryCatch #2 {Exception -> 0x0037, blocks: (B:12:0x0033, B:13:0x007f, B:15:0x0085, B:18:0x00ac, B:21:0x00a3, B:23:0x00b6, B:25:0x00bc), top: B:11:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065 A[Catch: Exception -> 0x004a, TRY_LEAVE, TryCatch #1 {Exception -> 0x004a, blocks: (B:34:0x0046, B:35:0x005f, B:37:0x0065, B:41:0x00c6), top: B:33:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c6 A[Catch: Exception -> 0x004a, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x004a, blocks: (B:34:0x0046, B:35:0x005f, B:37:0x0065, B:41:0x00c6), top: B:33:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getAblyConfiguration(Continuation<? super Triple<String, String, ? extends List<AblyEndpoint>>> continuation) {
        AblyManager$getAblyConfiguration$1 ablyManager$getAblyConfiguration$1;
        int i;
        AblyManager ablyManager;
        AblyManager ablyManager2;
        NetworkResponse networkResponse;
        AblyConnectResponse ablyConnectResponse;
        NetworkResponse networkResponse2;
        if (continuation instanceof AblyManager$getAblyConfiguration$1) {
            ablyManager$getAblyConfiguration$1 = (AblyManager$getAblyConfiguration$1) continuation;
            if ((ablyManager$getAblyConfiguration$1.label & Integer.MIN_VALUE) != 0) {
                ablyManager$getAblyConfiguration$1.label -= Integer.MIN_VALUE;
                Object obj = ablyManager$getAblyConfiguration$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = ablyManager$getAblyConfiguration$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        MessengerApi messengerApi = this.messengerApi;
                        ablyManager$getAblyConfiguration$1.L$0 = this;
                        ablyManager$getAblyConfiguration$1.label = 1;
                        obj = MessengerApi.DefaultImpls.getAblyConnectConfigSuspend$default(messengerApi, null, ablyManager$getAblyConfiguration$1, 1, null);
                        if (obj != coroutine_suspended) {
                            ablyManager2 = this;
                        }
                        return coroutine_suspended;
                    } catch (Exception e) {
                        e = e;
                        ablyManager = this;
                    }
                } else {
                    if (i == 1) {
                        ablyManager2 = (AblyManager) ablyManager$getAblyConfiguration$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (Exception e2) {
                            e = e2;
                            ablyManager = ablyManager2;
                        }
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ablyConnectResponse = (AblyConnectResponse) ablyManager$getAblyConfiguration$1.L$1;
                        ablyManager = (AblyManager) ablyManager$getAblyConfiguration$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            networkResponse2 = (NetworkResponse) obj;
                            if (networkResponse2 instanceof NetworkResponse.Success) {
                                ablyManager.twig.e("AblyManager: Failed to get auth token", new Object[0]);
                                return null;
                            }
                            String token = ((AblyAuthResponse) ((NetworkResponse.Success) networkResponse2).getBody()).getToken();
                            String channel = ablyConnectResponse.getChannel();
                            List<AblyEndpoint> endpoints = ablyConnectResponse.getEndpoints();
                            if (token.length() != 0 && channel.length() != 0) {
                                return new Triple(token, channel, endpoints);
                            }
                            ablyManager.twig.e("AblyManager: Missing token or channel", new Object[0]);
                            return null;
                        } catch (Exception e3) {
                            e = e3;
                        }
                    }
                    ablyManager.twig.e("AblyManager: Configuration error: " + e.getMessage(), new Object[0]);
                    return null;
                }
                networkResponse = (NetworkResponse) obj;
                if (networkResponse instanceof NetworkResponse.Success) {
                    ablyManager2.twig.e("AblyManager: Failed to get connect config", new Object[0]);
                    return null;
                }
                AblyConnectResponse ablyConnectResponse2 = (AblyConnectResponse) ((NetworkResponse.Success) networkResponse).getBody();
                MessengerApi messengerApi2 = ablyManager2.messengerApi;
                ablyManager$getAblyConfiguration$1.L$0 = ablyManager2;
                ablyManager$getAblyConfiguration$1.L$1 = ablyConnectResponse2;
                ablyManager$getAblyConfiguration$1.label = 2;
                Object ablyAuthTokenSuspend$default = MessengerApi.DefaultImpls.getAblyAuthTokenSuspend$default(messengerApi2, null, ablyManager$getAblyConfiguration$1, 1, null);
                if (ablyAuthTokenSuspend$default != coroutine_suspended) {
                    ablyConnectResponse = ablyConnectResponse2;
                    obj = ablyAuthTokenSuspend$default;
                    ablyManager = ablyManager2;
                    networkResponse2 = (NetworkResponse) obj;
                    if (networkResponse2 instanceof NetworkResponse.Success) {
                    }
                }
                return coroutine_suspended;
            }
        }
        ablyManager$getAblyConfiguration$1 = new AblyManager$getAblyConfiguration$1(this, continuation);
        Object obj2 = ablyManager$getAblyConfiguration$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = ablyManager$getAblyConfiguration$1.label;
        if (i != 0) {
        }
        networkResponse = (NetworkResponse) obj2;
        if (networkResponse instanceof NetworkResponse.Success) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Auth.TokenCallback createAuthCallback() {
        return new Auth.TokenCallback() { // from class: io.intercom.android.sdk.AblyManager$$ExternalSyntheticLambda0
            @Override // io.ably.lib.rest.Auth.TokenCallback
            public final Object getTokenRequest(Auth.TokenParams tokenParams) {
                Object createAuthCallback$lambda$1;
                createAuthCallback$lambda$1 = AblyManager.createAuthCallback$lambda$1(AblyManager.this, tokenParams);
                return createAuthCallback$lambda$1;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object createAuthCallback$lambda$1(AblyManager this$0, Auth.TokenParams tokenParams) {
        Object runBlocking$default;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new AblyManager$createAuthCallback$1$authResponse$1(this$0, null), 1, null);
            NetworkResponse networkResponse = (NetworkResponse) runBlocking$default;
            if (networkResponse instanceof NetworkResponse.Success) {
                this$0.twig.d("AblyManager: Auth callback got fresh token", new Object[0]);
                return ((AblyAuthResponse) ((NetworkResponse.Success) networkResponse).getBody()).getToken();
            }
            this$0.twig.e("AblyManager: Auth callback failed to get token", new Object[0]);
            throw new Exception("Failed to get auth token from server");
        } catch (Exception e) {
            this$0.twig.e("AblyManager: Auth callback error: " + e.getMessage(), new Object[0]);
            throw e;
        }
    }

    public final void removeListeners() {
        this.messageListener = null;
        this.connectionListener = null;
    }

    public final boolean isConnected() {
        Connection connection;
        ConnectionState connectionState;
        AblyRealtime ablyRealtime = this.ablyRealtime;
        return Intrinsics.areEqual((ablyRealtime == null || (connection = ablyRealtime.connection) == null || (connectionState = connection.state) == null) ? null : connectionState.name(), "connected");
    }

    public final void disconnect() {
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new AblyManager$disconnect$1(this, null), 3, null);
    }
}
