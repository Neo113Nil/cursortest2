package io.bidmachine.util.network;

import android.net.Uri;
import android.os.SystemClock;
import androidx.annotation.AnyThread;
import androidx.annotation.WorkerThread;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mobilefuse.sdk.device.UserAgentInfo;
import com.pubmatic.sdk.video.POBVastError;
import com.safedk.android.analytics.events.RedirectEvent;
import com.safedk.android.internal.partials.BidMachineNetworkBridge;
import io.bidmachine.util.UtilsKt;
import io.bidmachine.util.taskmanager.CancelableTask;
import io.bidmachine.util.taskmanager.TaskManager;
import io.bidmachine.util.taskmanager.coroutine.CoroutineTaskManager;
import io.bidmachine.util.taskmanager.coroutine.NetworkTaskManager;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NetworkRequest.kt */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 e*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0006defghiB«\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\b\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\u0010\u0019J\u001a\u0010D\u001a\u0004\u0018\u00010E2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020\u000fH\u0002J\u0006\u0010I\u001a\u00020JJ\u0006\u0010'\u001a\u00020KJ&\u0010L\u001a\u00020J2\b\b\u0002\u0010M\u001a\u00020K2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010E2\u0006\u0010O\u001a\u00020PH\u0002J&\u0010L\u001a\u00020J2\b\b\u0002\u0010M\u001a\u00020K2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010E2\u0006\u0010Q\u001a\u00020RH\u0002J!\u0010S\u001a\u00020J2\b\u0010N\u001a\u0004\u0018\u00010E2\b\u0010T\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0002\u0010UJ7\u0010V\u001a\u00020J2\b\b\u0002\u0010M\u001a\u00020K2\b\u0010N\u001a\u0004\u0018\u00010E2\u0018\u0010W\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\u0004\u0012\u00020J0XH\u0082\bJ\u0010\u0010Y\u001a\u00020G2\u0006\u0010\u0003\u001a\u00020ZH\u0002J\b\u0010[\u001a\u00020JH\u0002J\u0012\u0010\\\u001a\u00020J2\b\b\u0002\u0010]\u001a\u00020+H\u0007J\b\u0010^\u001a\u00020JH\u0002J\b\u0010_\u001a\u00020JH\u0007J'\u0010`\u001a\u00020J2\u001c\u0010W\u001a\u0018\u0012\u000e\u0012\f0aR\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\u0004\u0012\u00020J0XH\u0082\bJ\b\u0010b\u001a\u00020JH\u0002J\b\u0010c\u001a\u00020JH\u0002R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001d\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f@BX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0010\u00102\u001a\u0004\u0018\u000103X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\b¢\u0006\b\n\u0000\u001a\u0004\b4\u0010$R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b5\u0010\u001bR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0010\u00108\u001a\u0004\u0018\u000109X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010@\u001a\u0004\b>\u0010?R\u0010\u0010A\u001a\u0004\u0018\u000103X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010C\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006j"}, d2 = {"Lio/bidmachine/util/network/NetworkRequest;", "ResponseType", "", "url", "", "method", "Lio/bidmachine/util/network/Method;", "headers", "", "queryParameters", RedirectEvent.b, "Lio/bidmachine/util/network/Redirect;", "timeoutMs", "", "connectTimeoutMs", "", "readTimeoutMs", "requestProcessor", "Lio/bidmachine/util/network/RequestProcessor;", "responseProcessor", "Lio/bidmachine/util/network/ResponseProcessor;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lio/bidmachine/util/network/NetworkRequest$Listener;", "metadataListener", "Lio/bidmachine/util/network/NetworkRequest$MetadataListener;", "(Ljava/lang/String;Lio/bidmachine/util/network/Method;Ljava/util/Map;Ljava/util/Map;Lio/bidmachine/util/network/Redirect;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Lio/bidmachine/util/network/RequestProcessor;Lio/bidmachine/util/network/ResponseProcessor;Lio/bidmachine/util/network/NetworkRequest$Listener;Lio/bidmachine/util/network/NetworkRequest$MetadataListener;)V", "getConnectTimeoutMs", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "connectionCount", "<set-?>", "Lkotlin/time/Duration;", "executionTime", "getExecutionTime-FghU774", "()Lkotlin/time/Duration;", "getHeaders", "()Ljava/util/Map;", "isDataReceived", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isDestroyed", "isNotified", "isSend", "lastTaskManager", "Lio/bidmachine/util/taskmanager/TaskManager;", "getListener", "()Lio/bidmachine/util/network/NetworkRequest$Listener;", "getMetadataListener", "()Lio/bidmachine/util/network/NetworkRequest$MetadataListener;", "getMethod", "()Lio/bidmachine/util/network/Method;", "processTask", "Lio/bidmachine/util/taskmanager/CancelableTask;", "getQueryParameters", "getReadTimeoutMs", "getRedirect", "()Lio/bidmachine/util/network/Redirect;", "requestData", "", "getRequestProcessor", "()Lio/bidmachine/util/network/RequestProcessor;", "getResponseProcessor", "()Lio/bidmachine/util/network/ResponseProcessor;", "getTimeoutMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "timeoutTask", "getUrl", "()Ljava/lang/String;", "createResponseMetadataOrNull", "Lio/bidmachine/util/network/ResponseMetadata;", "httpURLConnection", "Ljava/net/HttpURLConnection;", "responseCode", "destroy", "", "", "notifyError", "skipCheck", "responseMetadata", "networkError", "Lio/bidmachine/util/network/NetworkError;", "throwable", "", "notifySuccess", "response", "(Lio/bidmachine/util/network/ResponseMetadata;Ljava/lang/Object;)V", "notifyWithAction", "action", "Lkotlin/Function1;", "openConnection", "Ljava/net/URL;", "processTimeout", "send", "taskManager", "sendInternal", "sendSync", "sendWithAction", "Lio/bidmachine/util/network/NetworkRequest$ProcessTask;", "startTimeout", "stopTimeout", "Builder", "Companion", "Listener", "MetadataListener", "ProcessTask", "TimeoutTask", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class NetworkRequest<ResponseType> {

    @NotNull
    public static final String HEADER_USER_AGENT = "User-Agent";
    private static final int MAX_CONNECTION_COUNT = 20;

    @Nullable
    private final Integer connectTimeoutMs;
    private int connectionCount;

    @Nullable
    private Duration executionTime;

    @NotNull
    private final Map<String, String> headers;

    @NotNull
    private final AtomicBoolean isDataReceived;

    @NotNull
    private final AtomicBoolean isDestroyed;

    @NotNull
    private final AtomicBoolean isNotified;

    @NotNull
    private final AtomicBoolean isSend;

    @Nullable
    private TaskManager lastTaskManager;

    @Nullable
    private final Listener<ResponseType> listener;

    @Nullable
    private final MetadataListener metadataListener;

    @NotNull
    private final Method method;

    @Nullable
    private CancelableTask processTask;

    @NotNull
    private final Map<String, String> queryParameters;

    @Nullable
    private final Integer readTimeoutMs;

    @NotNull
    private final Redirect redirect;

    @Nullable
    private byte[] requestData;

    @Nullable
    private final RequestProcessor requestProcessor;

    @Nullable
    private final ResponseProcessor<ResponseType> responseProcessor;

    @Nullable
    private final Long timeoutMs;

    @Nullable
    private CancelableTask timeoutTask;

    @NotNull
    private final String url;

    @NotNull
    private static final TaskManager TASK_MANAGER = new NetworkTaskManager();

    @NotNull
    private static final TaskManager TIME_OUT_TASK_MANAGER = new CoroutineTaskManager(new CoroutineName("NetworkTimeOutTaskManager").plus(SupervisorKt.SupervisorJob$default(null, 1, null)).plus(Dispatchers.getIO()));

    /* compiled from: NetworkRequest.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00018\u0001H&¢\u0006\u0002\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lio/bidmachine/util/network/NetworkRequest$Listener;", "ResponseType", "", "onError", "", "networkError", "Lio/bidmachine/util/network/NetworkError;", "onSuccess", "response", "(Ljava/lang/Object;)V", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface Listener<ResponseType> {
        void onError(@NotNull NetworkError networkError);

        void onSuccess(@Nullable ResponseType response);
    }

    /* compiled from: NetworkRequest.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lio/bidmachine/util/network/NetworkRequest$MetadataListener;", "", "onReceived", "", "responseMetadata", "Lio/bidmachine/util/network/ResponseMetadata;", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface MetadataListener {
        void onReceived(@Nullable ResponseMetadata responseMetadata);
    }

    @AnyThread
    public final void send() {
        send$default(this, null, 1, null);
    }

    public NetworkRequest(@NotNull String url, @NotNull Method method, @NotNull Map<String, String> headers, @NotNull Map<String, String> queryParameters, @NotNull Redirect redirect, @Nullable Long l, @Nullable Integer num, @Nullable Integer num2, @Nullable RequestProcessor requestProcessor, @Nullable ResponseProcessor<ResponseType> responseProcessor, @Nullable Listener<ResponseType> listener, @Nullable MetadataListener metadataListener) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(queryParameters, "queryParameters");
        Intrinsics.checkNotNullParameter(redirect, "redirect");
        this.url = url;
        this.method = method;
        this.headers = headers;
        this.queryParameters = queryParameters;
        this.redirect = redirect;
        this.timeoutMs = l;
        this.connectTimeoutMs = num;
        this.readTimeoutMs = num2;
        this.requestProcessor = requestProcessor;
        this.responseProcessor = responseProcessor;
        this.listener = listener;
        this.metadataListener = metadataListener;
        this.isSend = new AtomicBoolean(false);
        this.isNotified = new AtomicBoolean(false);
        this.isDestroyed = new AtomicBoolean(false);
        this.isDataReceived = new AtomicBoolean(false);
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final Method getMethod() {
        return this.method;
    }

    public /* synthetic */ NetworkRequest(String str, Method method, Map map, Map map2, Redirect redirect, Long l, Integer num, Integer num2, RequestProcessor requestProcessor, ResponseProcessor responseProcessor, Listener listener, MetadataListener metadataListener, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, method, (i & 4) != 0 ? new HashMap() : map, (i & 8) != 0 ? new HashMap() : map2, (i & 16) != 0 ? Redirect.Manual : redirect, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : requestProcessor, (i & 512) != 0 ? null : responseProcessor, (i & 1024) != 0 ? null : listener, (i & 2048) != 0 ? null : metadataListener);
    }

    @NotNull
    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    @NotNull
    public final Map<String, String> getQueryParameters() {
        return this.queryParameters;
    }

    @NotNull
    public final Redirect getRedirect() {
        return this.redirect;
    }

    @Nullable
    public final Long getTimeoutMs() {
        return this.timeoutMs;
    }

    @Nullable
    public final Integer getConnectTimeoutMs() {
        return this.connectTimeoutMs;
    }

    @Nullable
    public final Integer getReadTimeoutMs() {
        return this.readTimeoutMs;
    }

    @Nullable
    public final RequestProcessor getRequestProcessor() {
        return this.requestProcessor;
    }

    @Nullable
    public final ResponseProcessor<ResponseType> getResponseProcessor() {
        return this.responseProcessor;
    }

    @Nullable
    public final Listener<ResponseType> getListener() {
        return this.listener;
    }

    @Nullable
    public final MetadataListener getMetadataListener() {
        return this.metadataListener;
    }

    @Nullable
    /* renamed from: getExecutionTime-FghU774, reason: not valid java name and from getter */
    public final Duration getExecutionTime() {
        return this.executionTime;
    }

    public static /* synthetic */ void send$default(NetworkRequest networkRequest, TaskManager taskManager, int i, Object obj) {
        if ((i & 1) != 0) {
            taskManager = TASK_MANAGER;
        }
        networkRequest.send(taskManager);
    }

    public final boolean isDestroyed() {
        return this.isDestroyed.get();
    }

    public final void destroy() {
        TaskManager taskManager;
        this.isDestroyed.set(true);
        stopTimeout();
        CancelableTask cancelableTask = this.processTask;
        if (cancelableTask != null && (taskManager = this.lastTaskManager) != null) {
            taskManager.cancel(cancelableTask);
        }
        this.lastTaskManager = null;
        this.processTask = null;
        this.requestData = null;
    }

    private final void sendWithAction(Function1 action) {
        if (isDestroyed()) {
            notifyError$default((NetworkRequest) this, true, (ResponseMetadata) null, (Throwable) new IllegalStateException("The Send method was called, but NetworkRequest has already been destroyed"), 2, (Object) null);
            return;
        }
        if (this.isSend.compareAndSet(false, true)) {
            startTimeout();
            try {
                ProcessTask processTask = new ProcessTask();
                action.invoke(processTask);
                this.processTask = processTask;
            } catch (Throwable th) {
                notifyError$default((NetworkRequest) this, false, (ResponseMetadata) null, th, 3, (Object) null);
            }
        }
    }

    @AnyThread
    public final void send(@NotNull TaskManager taskManager) {
        Intrinsics.checkNotNullParameter(taskManager, "taskManager");
        if (isDestroyed()) {
            notifyError$default((NetworkRequest) this, true, (ResponseMetadata) null, (Throwable) new IllegalStateException("The Send method was called, but NetworkRequest has already been destroyed"), 2, (Object) null);
            return;
        }
        if (this.isSend.compareAndSet(false, true)) {
            startTimeout();
            try {
                ProcessTask processTask = new ProcessTask();
                taskManager.execute(processTask);
                this.lastTaskManager = taskManager;
                this.processTask = processTask;
            } catch (Throwable th) {
                notifyError$default((NetworkRequest) this, false, (ResponseMetadata) null, th, 3, (Object) null);
            }
        }
    }

    @WorkerThread
    public final void sendSync() {
        if (isDestroyed()) {
            notifyError$default((NetworkRequest) this, true, (ResponseMetadata) null, (Throwable) new IllegalStateException("The Send method was called, but NetworkRequest has already been destroyed"), 2, (Object) null);
            return;
        }
        if (this.isSend.compareAndSet(false, true)) {
            startTimeout();
            try {
                ProcessTask processTask = new ProcessTask();
                processTask.run();
                this.processTask = processTask;
            } catch (Throwable th) {
                notifyError$default((NetworkRequest) this, false, (ResponseMetadata) null, th, 3, (Object) null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendInternal() {
        Throwable th;
        HttpURLConnection openConnection;
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        Function0 function0 = new Function0(this) { // from class: io.bidmachine.util.network.NetworkRequest$sendInternal$finishAction$1
            final /* synthetic */ NetworkRequest<ResponseType> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                if (this.this$0.getExecutionTime() == null) {
                    NetworkRequest<ResponseType> networkRequest = this.this$0;
                    Duration.Companion companion = Duration.Companion;
                    ((NetworkRequest) networkRequest).executionTime = Duration.m8137boximpl(DurationKt.toDuration(SystemClock.elapsedRealtime() - elapsedRealtime, DurationUnit.MILLISECONDS));
                }
            }
        };
        ResponseType responsetype = (ResponseType) null;
        try {
            openConnection = openConnection(new URL(NetworkUtils.appendQueryParameters(this.url, this.queryParameters)));
        } catch (RequestInDestroyedStateException unused) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (!isDestroyed()) {
                int httpUrlConnectionGetResponseCode = BidMachineNetworkBridge.httpUrlConnectionGetResponseCode(openConnection);
                if (!isDestroyed()) {
                    ResponseMetadata createResponseMetadataOrNull = createResponseMetadataOrNull(openConnection, httpUrlConnectionGetResponseCode);
                    if (httpUrlConnectionGetResponseCode == 200) {
                        ResponseProcessor<ResponseType> responseProcessor = this.responseProcessor;
                        if (responseProcessor != null) {
                            responsetype = responseProcessor.process(openConnection);
                        }
                        function0.mo4828invoke();
                        notifySuccess(createResponseMetadataOrNull, responsetype);
                    } else if (httpUrlConnectionGetResponseCode != 204) {
                        function0.mo4828invoke();
                        notifyError$default((NetworkRequest) this, false, createResponseMetadataOrNull, (Throwable) new IllegalResponseException(httpUrlConnectionGetResponseCode), 1, (Object) null);
                    } else {
                        function0.mo4828invoke();
                        notifySuccess(createResponseMetadataOrNull, null);
                    }
                    function0.mo4828invoke();
                    NetworkUtilsKt.disconnectSafely(openConnection);
                    return;
                }
            }
            function0.mo4828invoke();
            NetworkUtilsKt.disconnectSafely(openConnection);
        } catch (RequestInDestroyedStateException unused2) {
            responsetype = (ResponseType) openConnection;
        } catch (Throwable th3) {
            th = th3;
            responsetype = (ResponseType) openConnection;
            try {
                notifyError$default((NetworkRequest) this, false, (ResponseMetadata) null, th, 3, (Object) null);
            } finally {
                function0.mo4828invoke();
                NetworkUtilsKt.disconnectSafely(responsetype);
            }
        }
    }

    private final HttpURLConnection openConnection(URL url) throws Throwable {
        int i = this.connectionCount + 1;
        this.connectionCount = i;
        if (i > 20) {
            throw new IllegalStateException("The maximum number of connections for one request has been reached");
        }
        if (isDestroyed()) {
            throw new RequestInDestroyedStateException();
        }
        HttpURLConnection httpURLConnection = null;
        try {
            URLConnection openConnection = url.openConnection();
            Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) openConnection;
            httpURLConnection2.setInstanceFollowRedirects(this.redirect == Redirect.Native);
            httpURLConnection2.setDoInput(true);
            httpURLConnection2.setUseCaches(false);
            httpURLConnection2.setAllowUserInteraction(false);
            try {
                RequestProcessor requestProcessor = this.requestProcessor;
                if (requestProcessor != null) {
                    requestProcessor.setupConnection(httpURLConnection2);
                }
                httpURLConnection2.setRequestMethod(this.method.getNetworkName());
                for (Map.Entry<String, String> entry : this.headers.entrySet()) {
                    httpURLConnection2.setRequestProperty(entry.getKey(), entry.getValue());
                }
                Integer num = this.connectTimeoutMs;
                if (num != null && num.intValue() >= 0) {
                    httpURLConnection2.setConnectTimeout(this.connectTimeoutMs.intValue());
                }
                Integer num2 = this.readTimeoutMs;
                if (num2 != null && num2.intValue() >= 0) {
                    httpURLConnection2.setReadTimeout(this.readTimeoutMs.intValue());
                }
                if (this.isDataReceived.compareAndSet(false, true)) {
                    RequestProcessor requestProcessor2 = this.requestProcessor;
                    this.requestData = requestProcessor2 != null ? requestProcessor2.getBody() : null;
                }
                byte[] bArr = this.requestData;
                if (bArr != null) {
                    httpURLConnection2.setDoOutput(true);
                    OutputStream urlConnectionGetOutputStream = BidMachineNetworkBridge.urlConnectionGetOutputStream(httpURLConnection2);
                    Intrinsics.checkNotNullExpressionValue(urlConnectionGetOutputStream, "httpURLConnection.outputStream");
                    BufferedOutputStream bufferedOutputStream = urlConnectionGetOutputStream instanceof BufferedOutputStream ? (BufferedOutputStream) urlConnectionGetOutputStream : new BufferedOutputStream(urlConnectionGetOutputStream, 8192);
                    try {
                        bufferedOutputStream.write(bArr);
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(bufferedOutputStream, null);
                    } finally {
                    }
                }
                if (isDestroyed()) {
                    throw new RequestInDestroyedStateException();
                }
                if (this.redirect == Redirect.Manual) {
                    int httpUrlConnectionGetResponseCode = BidMachineNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection2);
                    switch (httpUrlConnectionGetResponseCode) {
                        case 301:
                        case 302:
                        case POBVastError.NO_VAST_RESPONSE /* 303 */:
                        case MRAID_BRIDGE_ERROR_VALUE:
                        case 307:
                        case 308:
                            String headerField = httpURLConnection2.getHeaderField(NetworkUtils.HEADER_LOCATION);
                            NetworkUtilsKt.disconnectSafely(httpURLConnection2);
                            if (headerField == null || headerField.length() == 0) {
                                throw new IllegalArgumentException("Location header url could not be null or empty when server responds with " + httpUrlConnectionGetResponseCode + " code");
                            }
                            URL url2 = new URL(url, headerField);
                            if (!NetworkUtilsKt.isHttp(url2)) {
                                throw new IllegalArgumentException("Location header url is not http or https, but has " + url2.getProtocol() + " protocol");
                            }
                            return openConnection(url2);
                    }
                }
                return httpURLConnection2;
            } catch (Throwable th) {
                th = th;
                httpURLConnection = httpURLConnection2;
                NetworkUtilsKt.disconnectSafely(httpURLConnection);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final void startTimeout() {
        stopTimeout();
        Long l = this.timeoutMs;
        if (l == null || l.longValue() <= 0) {
            return;
        }
        try {
            TimeoutTask timeoutTask = new TimeoutTask();
            TIME_OUT_TASK_MANAGER.scheduleSafely(timeoutTask, this.timeoutMs.longValue());
            this.timeoutTask = timeoutTask;
            Unit unit = Unit.INSTANCE;
        } catch (Throwable unused) {
        }
    }

    private final void stopTimeout() {
        CancelableTask cancelableTask = this.timeoutTask;
        if (cancelableTask != null) {
            TIME_OUT_TASK_MANAGER.cancel(cancelableTask);
        }
        this.timeoutTask = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processTimeout() {
        if (isDestroyed()) {
            return;
        }
        destroy();
        TaskManager taskManager = this.lastTaskManager;
        if (taskManager == null) {
            taskManager = TASK_MANAGER;
        }
        taskManager.executeSafely(new Runnable() { // from class: io.bidmachine.util.network.NetworkRequest$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                NetworkRequest.processTimeout$lambda$9(NetworkRequest.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void processTimeout$lambda$9(NetworkRequest this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        notifyError$default(this$0, true, (ResponseMetadata) null, new NetworkError(new TimeoutException("NetworkRequest timeout reached")), 2, (Object) null);
    }

    private final ResponseMetadata createResponseMetadataOrNull(HttpURLConnection httpURLConnection, int responseCode) {
        if (this.metadataListener == null) {
            return null;
        }
        URL url = httpURLConnection.getURL();
        Intrinsics.checkNotNullExpressionValue(url, "httpURLConnection.url");
        return new ResponseMetadata(url, responseCode, httpURLConnection.getHeaderFields());
    }

    static /* synthetic */ void notifyError$default(NetworkRequest networkRequest, boolean z, ResponseMetadata responseMetadata, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            responseMetadata = null;
        }
        networkRequest.notifyError(z, responseMetadata, th);
    }

    private final void notifyError(boolean skipCheck, ResponseMetadata responseMetadata, Throwable throwable) {
        notifyError(skipCheck, responseMetadata, new NetworkError(throwable));
    }

    static /* synthetic */ void notifyError$default(NetworkRequest networkRequest, boolean z, ResponseMetadata responseMetadata, NetworkError networkError, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            responseMetadata = null;
        }
        networkRequest.notifyError(z, responseMetadata, networkError);
    }

    private final void notifyError(boolean skipCheck, ResponseMetadata responseMetadata, NetworkError networkError) {
        if (this.isNotified.compareAndSet(false, true) || skipCheck) {
            if (!isDestroyed() || skipCheck) {
                MetadataListener metadataListener = getMetadataListener();
                if (metadataListener != null) {
                    metadataListener.onReceived(responseMetadata);
                }
                Listener<ResponseType> listener = getListener();
                if (listener != null) {
                    listener.onError(networkError);
                }
            }
        }
    }

    private final void notifySuccess(ResponseMetadata responseMetadata, ResponseType response) {
        if (this.isNotified.compareAndSet(false, true) && !isDestroyed()) {
            MetadataListener metadataListener = getMetadataListener();
            if (metadataListener != null) {
                metadataListener.onReceived(responseMetadata);
            }
            Listener<ResponseType> listener = getListener();
            if (listener != null) {
                listener.onSuccess(response);
            }
        }
    }

    private final void notifyWithAction(boolean skipCheck, ResponseMetadata responseMetadata, Function1 action) {
        if (this.isNotified.compareAndSet(false, true) || skipCheck) {
            if (!isDestroyed() || skipCheck) {
                MetadataListener metadataListener = getMetadataListener();
                if (metadataListener != null) {
                    metadataListener.onReceived(responseMetadata);
                }
                Listener<ResponseType> listener = getListener();
                if (listener != null) {
                    action.invoke(listener);
                }
            }
        }
    }

    static /* synthetic */ void notifyWithAction$default(NetworkRequest networkRequest, boolean z, ResponseMetadata responseMetadata, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if (networkRequest.isNotified.compareAndSet(false, true) || z) {
            if (!networkRequest.isDestroyed() || z) {
                MetadataListener metadataListener = networkRequest.getMetadataListener();
                if (metadataListener != null) {
                    metadataListener.onReceived(responseMetadata);
                }
                Listener listener = networkRequest.getListener();
                if (listener != null) {
                    function1.invoke(listener);
                }
            }
        }
    }

    /* compiled from: NetworkRequest.kt */
    @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\r\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u0017\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\nJ\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\tJ\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\tJ\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010$J\u0018\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00010$2\b\b\u0002\u0010&\u001a\u00020'H\u0007J\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010$J\u001b\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010*J\"\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010,J\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0011J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\"\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u00100\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010,J\u001b\u00101\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010*J\u0014\u00102\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u0017J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u001c\u00104\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001bJ\u001b\u00105\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\u0002\u00106J\u0016\u00107\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u00108\u001a\u0004\u0018\u00010\tR\u0012\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\rR\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001eR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lio/bidmachine/util/network/NetworkRequest$Builder;", "ResponseType", "", ShareConstants.MEDIA_URI, "Landroid/net/Uri;", "method", "Lio/bidmachine/util/network/Method;", "(Landroid/net/Uri;Lio/bidmachine/util/network/Method;)V", "url", "", "(Ljava/lang/String;Lio/bidmachine/util/network/Method;)V", "connectTimeoutMs", "", "Ljava/lang/Integer;", "headers", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lio/bidmachine/util/network/NetworkRequest$Listener;", "metadataListener", "Lio/bidmachine/util/network/NetworkRequest$MetadataListener;", "queryParameters", "readTimeoutMs", RedirectEvent.b, "Lio/bidmachine/util/network/Redirect;", "requestProcessor", "Lio/bidmachine/util/network/RequestProcessor;", "responseProcessor", "Lio/bidmachine/util/network/ResponseProcessor;", "timeoutMs", "", "Ljava/lang/Long;", "addHeader", "key", "value", "addQueryParameter", "build", "Lio/bidmachine/util/network/NetworkRequest;", "send", "taskManager", "Lio/bidmachine/util/taskmanager/TaskManager;", "sendSync", "setConnectTimeoutMs", "(Ljava/lang/Integer;)Lio/bidmachine/util/network/NetworkRequest$Builder;", "setHeaders", "", "setListener", "setMetadataListener", "setQueryParameters", "parameters", "setReadTimeoutMs", "setRedirect", "setRequestProcessor", "setResponseProcessor", "setTimeoutMs", "(Ljava/lang/Long;)Lio/bidmachine/util/network/NetworkRequest$Builder;", "setUserAgentHeader", UserAgentInfo.CACHE_USER_AGENT_VALUE_KEY, "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder<ResponseType> {

        @Nullable
        private Integer connectTimeoutMs;

        @NotNull
        private final Map<String, String> headers;

        @Nullable
        private Listener<ResponseType> listener;

        @Nullable
        private MetadataListener metadataListener;

        @NotNull
        private final Method method;

        @NotNull
        private final Map<String, String> queryParameters;

        @Nullable
        private Integer readTimeoutMs;

        @NotNull
        private Redirect redirect;

        @Nullable
        private RequestProcessor requestProcessor;

        @Nullable
        private ResponseProcessor<ResponseType> responseProcessor;

        @Nullable
        private Long timeoutMs;

        @NotNull
        private final String url;

        @NotNull
        public final NetworkRequest<ResponseType> send() {
            return send$default(this, null, 1, null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder(@NotNull Uri uri, @NotNull Method method) {
            this(r2, method);
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(method, "method");
            String uri2 = uri.toString();
            Intrinsics.checkNotNullExpressionValue(uri2, "uri.toString()");
        }

        public Builder(@NotNull String url, @NotNull Method method) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(method, "method");
            this.redirect = Redirect.Manual;
            this.url = url;
            this.method = method;
            this.headers = new HashMap();
            this.queryParameters = new HashMap();
        }

        @NotNull
        public final Builder<ResponseType> setHeaders(@Nullable Map<String, String> headers) {
            UtilsKt.setSafely(this.headers, headers);
            return this;
        }

        @NotNull
        public final Builder<ResponseType> addHeader(@NotNull String key, @NotNull String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.headers.put(key, value);
            return this;
        }

        @NotNull
        public final Builder<ResponseType> setUserAgentHeader(@Nullable String userAgent) {
            if (userAgent != null && userAgent.length() > 0) {
                addHeader("User-Agent", userAgent);
            }
            return this;
        }

        @NotNull
        public final Builder<ResponseType> setQueryParameters(@Nullable Map<String, String> parameters) {
            UtilsKt.setSafely(this.queryParameters, parameters);
            return this;
        }

        @NotNull
        public final Builder<ResponseType> addQueryParameter(@NotNull String key, @NotNull String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.queryParameters.put(key, value);
            return this;
        }

        @NotNull
        public final Builder<ResponseType> setRedirect(@NotNull Redirect redirect) {
            Intrinsics.checkNotNullParameter(redirect, "redirect");
            this.redirect = redirect;
            return this;
        }

        @NotNull
        public final Builder<ResponseType> setTimeoutMs(@Nullable Long timeoutMs) {
            this.timeoutMs = timeoutMs;
            return this;
        }

        @NotNull
        public final Builder<ResponseType> setConnectTimeoutMs(@Nullable Integer connectTimeoutMs) {
            this.connectTimeoutMs = connectTimeoutMs;
            return this;
        }

        @NotNull
        public final Builder<ResponseType> setReadTimeoutMs(@Nullable Integer readTimeoutMs) {
            this.readTimeoutMs = readTimeoutMs;
            return this;
        }

        @NotNull
        public final Builder<ResponseType> setRequestProcessor(@Nullable RequestProcessor requestProcessor) {
            this.requestProcessor = requestProcessor;
            return this;
        }

        @NotNull
        public final Builder<ResponseType> setResponseProcessor(@Nullable ResponseProcessor<ResponseType> responseProcessor) {
            this.responseProcessor = responseProcessor;
            return this;
        }

        @NotNull
        public final Builder<ResponseType> setListener(@Nullable Listener<ResponseType> listener) {
            this.listener = listener;
            return this;
        }

        @NotNull
        public final Builder<ResponseType> setMetadataListener(@Nullable MetadataListener metadataListener) {
            this.metadataListener = metadataListener;
            return this;
        }

        @NotNull
        public final NetworkRequest<ResponseType> build() {
            return new NetworkRequest<>(this.url, this.method, this.headers, this.queryParameters, this.redirect, this.timeoutMs, this.connectTimeoutMs, this.readTimeoutMs, this.requestProcessor, this.responseProcessor, this.listener, this.metadataListener);
        }

        public static /* synthetic */ NetworkRequest send$default(Builder builder, TaskManager taskManager, int i, Object obj) {
            if ((i & 1) != 0) {
                taskManager = NetworkRequest.TASK_MANAGER;
            }
            return builder.send(taskManager);
        }

        @NotNull
        public final NetworkRequest<ResponseType> send(@NotNull TaskManager taskManager) {
            Intrinsics.checkNotNullParameter(taskManager, "taskManager");
            NetworkRequest<ResponseType> build = build();
            build.send(taskManager);
            return build;
        }

        @NotNull
        public final NetworkRequest<ResponseType> sendSync() {
            NetworkRequest<ResponseType> build = build();
            build.sendSync();
            return build;
        }
    }

    /* compiled from: NetworkRequest.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lio/bidmachine/util/network/NetworkRequest$ProcessTask;", "Lio/bidmachine/util/taskmanager/CancelableTask;", "(Lio/bidmachine/util/network/NetworkRequest;)V", "runTask", "", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    private final class ProcessTask extends CancelableTask {
        public ProcessTask() {
        }

        @Override // io.bidmachine.util.taskmanager.CancelableTask
        public void runTask() {
            NetworkRequest.this.sendInternal();
        }
    }

    /* compiled from: NetworkRequest.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lio/bidmachine/util/network/NetworkRequest$TimeoutTask;", "Lio/bidmachine/util/taskmanager/CancelableTask;", "(Lio/bidmachine/util/network/NetworkRequest;)V", "runTask", "", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    private final class TimeoutTask extends CancelableTask {
        public TimeoutTask() {
        }

        @Override // io.bidmachine.util.taskmanager.CancelableTask
        public void runTask() {
            NetworkRequest.this.processTimeout();
        }
    }
}
