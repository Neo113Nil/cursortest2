package com.google.firebase.functions;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.security.ProviderInstaller;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.emulators.EmulatedServiceSettings;
import com.google.firebase.functions.FirebaseFunctions;
import com.google.firebase.functions.FirebaseFunctionsException;
import com.google.firebase.functions.dagger.assisted.Assisted;
import com.google.firebase.functions.dagger.assisted.AssistedInject;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import io.ably.lib.http.HttpConstants;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.Executor;
import javax.inject.Named;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.apache.commons.io.IOUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.reactivestreams.Publisher;

/* compiled from: FirebaseFunctions.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 42\u00020\u0001:\u00014BG\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0005J\u000e\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cJ\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001eJ\u0016\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0015\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u0005H\u0001¢\u0006\u0002\b!J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0005H\u0007J\u0016\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020(J-\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010\u0019\u001a\u00020\u00052\b\u0010,\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001d\u001a\u00020-H\u0000¢\u0006\u0002\b.J-\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010,\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001d\u001a\u00020-H\u0000¢\u0006\u0002\b.J4\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0*2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010,\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010/2\u0006\u0010\u001d\u001a\u00020-H\u0002J-\u00100\u001a\b\u0012\u0004\u0012\u000202012\u0006\u0010\u0019\u001a\u00020\u00052\b\u0010,\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001d\u001a\u00020-H\u0000¢\u0006\u0002\b3J-\u00100\u001a\b\u0012\u0004\u0012\u000202012\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010,\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001d\u001a\u00020-H\u0000¢\u0006\u0002\b3R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/google/firebase/functions/FirebaseFunctions;", "", "context", "Landroid/content/Context;", "projectId", "", "regionOrCustomDomain", "contextProvider", "Lcom/google/firebase/functions/ContextProvider;", "executor", "Ljava/util/concurrent/Executor;", "uiExecutor", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/functions/ContextProvider;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V", "client", "Lokhttp3/OkHttpClient;", "serializer", "Lcom/google/firebase/functions/Serializer;", TtmlNode.TAG_REGION, "customDomain", "urlFormat", "emulatorSettings", "Lcom/google/firebase/emulators/EmulatedServiceSettings;", "getHttpsCallable", "Lcom/google/firebase/functions/HttpsCallableReference;", "name", "getHttpsCallableFromUrl", "url", "Ljava/net/URL;", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "Lcom/google/firebase/functions/HttpsCallableOptions;", "getURL", "function", "getURL$com_google_firebase_firebase_functions", "useFunctionsEmulator", "", "origin", "useEmulator", DiagnosticsTracker.HOST_KEY, "port", "", NotificationCompat.CATEGORY_CALL, "Lcom/google/android/gms/tasks/Task;", "Lcom/google/firebase/functions/HttpsCallableResult;", "data", "Lcom/google/firebase/functions/HttpsCallOptions;", "call$com_google_firebase_firebase_functions", "Lcom/google/firebase/functions/HttpsCallableContext;", "stream", "Lorg/reactivestreams/Publisher;", "Lcom/google/firebase/functions/StreamResponse;", "stream$com_google_firebase_firebase_functions", "Companion", "com.google.firebase-firebase-functions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FirebaseFunctions {
    private static boolean providerInstallStarted;
    private final OkHttpClient client;
    private final ContextProvider contextProvider;
    private String customDomain;
    private EmulatedServiceSettings emulatorSettings;
    private final Executor executor;
    private final String projectId;
    private String region;
    private final Serializer serializer;
    private String urlFormat;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final TaskCompletionSource<Void> providerInstalled = new TaskCompletionSource<>();

    @JvmStatic
    public static final FirebaseFunctions getInstance() {
        return INSTANCE.getInstance();
    }

    @JvmStatic
    public static final FirebaseFunctions getInstance(FirebaseApp firebaseApp) {
        return INSTANCE.getInstance(firebaseApp);
    }

    @JvmStatic
    public static final FirebaseFunctions getInstance(FirebaseApp firebaseApp, String str) {
        return INSTANCE.getInstance(firebaseApp, str);
    }

    @JvmStatic
    public static final FirebaseFunctions getInstance(String str) {
        return INSTANCE.getInstance(str);
    }

    @AssistedInject
    public FirebaseFunctions(Context context, @Named("projectId") String str, @Assisted String str2, ContextProvider contextProvider, @Lightweight Executor executor, @UiThread Executor uiExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(uiExecutor, "uiExecutor");
        this.executor = executor;
        this.client = new OkHttpClient();
        this.serializer = new Serializer();
        Object checkNotNull = Preconditions.checkNotNull(contextProvider);
        Intrinsics.checkNotNullExpressionValue(checkNotNull, "checkNotNull(...)");
        this.contextProvider = (ContextProvider) checkNotNull;
        Object checkNotNull2 = Preconditions.checkNotNull(str);
        Intrinsics.checkNotNullExpressionValue(checkNotNull2, "checkNotNull(...)");
        this.projectId = (String) checkNotNull2;
        this.urlFormat = "https://%1$s-%2$s.cloudfunctions.net/%3$s";
        try {
            new URL(str2);
            this.region = "us-central1";
            this.customDomain = str2;
        } catch (MalformedURLException unused) {
            this.region = str2;
            this.customDomain = null;
        }
        INSTANCE.maybeInstallProviders(context, uiExecutor);
    }

    public final HttpsCallableReference getHttpsCallable(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new HttpsCallableReference(this, name, new HttpsCallOptions());
    }

    public final HttpsCallableReference getHttpsCallableFromUrl(URL url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new HttpsCallableReference(this, url, new HttpsCallOptions());
    }

    public final HttpsCallableReference getHttpsCallable(String name, HttpsCallableOptions options) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(options, "options");
        return new HttpsCallableReference(this, name, new HttpsCallOptions(options));
    }

    public final HttpsCallableReference getHttpsCallableFromUrl(URL url, HttpsCallableOptions options) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(options, "options");
        return new HttpsCallableReference(this, url, new HttpsCallOptions(options));
    }

    public final URL getURL$com_google_firebase_firebase_functions(String function) {
        Intrinsics.checkNotNullParameter(function, "function");
        EmulatedServiceSettings emulatedServiceSettings = this.emulatorSettings;
        if (emulatedServiceSettings != null) {
            this.urlFormat = "http://" + emulatedServiceSettings.getHost() + AbstractJsonLexerKt.COLON + emulatedServiceSettings.getPort() + "/%2$s/%1$s/%3$s";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(this.urlFormat, Arrays.copyOf(new Object[]{this.region, this.projectId, function}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        if (this.customDomain != null && emulatedServiceSettings == null) {
            format = this.customDomain + IOUtils.DIR_SEPARATOR_UNIX + function;
        }
        try {
            return new URL(format);
        } catch (MalformedURLException e) {
            throw new IllegalStateException(e);
        }
    }

    @Deprecated(message = "Use useEmulator to connect to the emulator.")
    public final void useFunctionsEmulator(String origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Preconditions.checkNotNull(origin, "origin cannot be null");
        this.urlFormat = origin + "/%2$s/%1$s/%3$s";
    }

    public final void useEmulator(String host, int port) {
        Intrinsics.checkNotNullParameter(host, "host");
        this.emulatorSettings = new EmulatedServiceSettings(host, port);
    }

    public final Task<HttpsCallableResult> call$com_google_firebase_firebase_functions(final String name, final Object data, final HttpsCallOptions options) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(options, "options");
        Task<HttpsCallableResult> continueWithTask = providerInstalled.getTask().continueWithTask(this.executor, new Continuation() { // from class: com.google.firebase.functions.FirebaseFunctions$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task call$lambda$0;
                call$lambda$0 = FirebaseFunctions.call$lambda$0(FirebaseFunctions.this, options, task);
                return call$lambda$0;
            }
        }).continueWithTask(this.executor, new Continuation() { // from class: com.google.firebase.functions.FirebaseFunctions$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task call$lambda$1;
                call$lambda$1 = FirebaseFunctions.call$lambda$1(FirebaseFunctions.this, name, data, options, task);
                return call$lambda$1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(continueWithTask, "continueWithTask(...)");
        return continueWithTask;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task call$lambda$0(FirebaseFunctions firebaseFunctions, HttpsCallOptions httpsCallOptions, Task it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return firebaseFunctions.contextProvider.getContext(httpsCallOptions.limitedUseAppCheckTokens);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task call$lambda$1(FirebaseFunctions firebaseFunctions, String str, Object obj, HttpsCallOptions httpsCallOptions, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            Intrinsics.checkNotNull(exception);
            return Tasks.forException(exception);
        }
        return firebaseFunctions.call(firebaseFunctions.getURL$com_google_firebase_firebase_functions(str), obj, (HttpsCallableContext) task.getResult(), httpsCallOptions);
    }

    public final Task<HttpsCallableResult> call$com_google_firebase_firebase_functions(final URL url, final Object data, final HttpsCallOptions options) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(options, "options");
        Task<HttpsCallableResult> continueWithTask = providerInstalled.getTask().continueWithTask(this.executor, new Continuation() { // from class: com.google.firebase.functions.FirebaseFunctions$$ExternalSyntheticLambda3
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task call$lambda$2;
                call$lambda$2 = FirebaseFunctions.call$lambda$2(FirebaseFunctions.this, options, task);
                return call$lambda$2;
            }
        }).continueWithTask(this.executor, new Continuation() { // from class: com.google.firebase.functions.FirebaseFunctions$$ExternalSyntheticLambda4
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task call$lambda$3;
                call$lambda$3 = FirebaseFunctions.call$lambda$3(FirebaseFunctions.this, url, data, options, task);
                return call$lambda$3;
            }
        });
        Intrinsics.checkNotNullExpressionValue(continueWithTask, "continueWithTask(...)");
        return continueWithTask;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task call$lambda$2(FirebaseFunctions firebaseFunctions, HttpsCallOptions httpsCallOptions, Task it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return firebaseFunctions.contextProvider.getContext(httpsCallOptions.limitedUseAppCheckTokens);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task call$lambda$3(FirebaseFunctions firebaseFunctions, URL url, Object obj, HttpsCallOptions httpsCallOptions, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            Intrinsics.checkNotNull(exception);
            return Tasks.forException(exception);
        }
        return firebaseFunctions.call(url, obj, (HttpsCallableContext) task.getResult(), httpsCallOptions);
    }

    private final Task<HttpsCallableResult> call(URL url, Object data, HttpsCallableContext context, HttpsCallOptions options) {
        Preconditions.checkNotNull(url, "url cannot be null");
        HashMap hashMap = new HashMap();
        hashMap.put("data", this.serializer.encode(data));
        JSONObject jSONObject = new JSONObject(hashMap);
        MediaType parse = MediaType.INSTANCE.parse(HttpConstants.ContentTypes.JSON);
        RequestBody.Companion companion = RequestBody.INSTANCE;
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
        Request.Builder post = new Request.Builder().url(url).post(companion.create(jSONObject2, parse));
        Intrinsics.checkNotNull(context);
        if (context.getAuthToken() != null) {
            post = post.header("Authorization", "Bearer " + context.getAuthToken());
        }
        if (context.getInstanceIdToken() != null) {
            post = post.header("Firebase-Instance-ID-Token", context.getInstanceIdToken());
        }
        if (context.getAppCheckToken() != null) {
            post = post.header("X-Firebase-AppCheck", context.getAppCheckToken());
        }
        Call newCall = options.apply$com_google_firebase_firebase_functions(this.client).newCall(post.build());
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        newCall.enqueue(new Callback() { // from class: com.google.firebase.functions.FirebaseFunctions$call$5
            @Override // okhttp3.Callback
            public void onFailure(Call ignored, IOException e) {
                Intrinsics.checkNotNullParameter(ignored, "ignored");
                Intrinsics.checkNotNullParameter(e, "e");
                if (e instanceof InterruptedIOException) {
                    taskCompletionSource.setException(new FirebaseFunctionsException("DEADLINE_EXCEEDED", FirebaseFunctionsException.Code.DEADLINE_EXCEEDED, null, e));
                } else {
                    taskCompletionSource.setException(new FirebaseFunctionsException("INTERNAL", FirebaseFunctionsException.Code.INTERNAL, null, e));
                }
            }

            @Override // okhttp3.Callback
            public void onResponse(Call ignored, Response response) throws IOException {
                Serializer serializer;
                Serializer serializer2;
                Intrinsics.checkNotNullParameter(ignored, "ignored");
                Intrinsics.checkNotNullParameter(response, "response");
                FirebaseFunctionsException.Code fromHttpStatus = FirebaseFunctionsException.Code.INSTANCE.fromHttpStatus(response.code());
                ResponseBody body = response.body();
                Intrinsics.checkNotNull(body);
                String string = body.string();
                FirebaseFunctionsException.Companion companion2 = FirebaseFunctionsException.INSTANCE;
                serializer = this.serializer;
                FirebaseFunctionsException fromResponse$com_google_firebase_firebase_functions = companion2.fromResponse$com_google_firebase_firebase_functions(fromHttpStatus, string, serializer);
                if (fromResponse$com_google_firebase_firebase_functions != null) {
                    taskCompletionSource.setException(fromResponse$com_google_firebase_firebase_functions);
                    return;
                }
                try {
                    JSONObject jSONObject3 = new JSONObject(string);
                    Object opt = jSONObject3.opt("data");
                    if (opt == null) {
                        opt = jSONObject3.opt("result");
                    }
                    if (opt != null) {
                        serializer2 = this.serializer;
                        taskCompletionSource.setResult(new HttpsCallableResult(serializer2.decode(opt)));
                    } else {
                        taskCompletionSource.setException(new FirebaseFunctionsException("Response is missing data field.", FirebaseFunctionsException.Code.INTERNAL, null));
                    }
                } catch (JSONException e) {
                    taskCompletionSource.setException(new FirebaseFunctionsException("Response is not valid JSON object.", FirebaseFunctionsException.Code.INTERNAL, null, e));
                }
            }
        });
        Task<HttpsCallableResult> task = taskCompletionSource.getTask();
        Intrinsics.checkNotNullExpressionValue(task, "getTask(...)");
        return task;
    }

    public final Publisher<StreamResponse> stream$com_google_firebase_firebase_functions(String name, Object data, HttpsCallOptions options) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(options, "options");
        return stream$com_google_firebase_firebase_functions(getURL$com_google_firebase_firebase_functions(name), data, options);
    }

    public final Publisher<StreamResponse> stream$com_google_firebase_firebase_functions(URL url, Object data, final HttpsCallOptions options) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(options, "options");
        Task<TContinuationResult> continueWithTask = providerInstalled.getTask().continueWithTask(this.executor, new Continuation() { // from class: com.google.firebase.functions.FirebaseFunctions$$ExternalSyntheticLambda2
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task stream$lambda$4;
                stream$lambda$4 = FirebaseFunctions.stream$lambda$4(FirebaseFunctions.this, options, task);
                return stream$lambda$4;
            }
        });
        Intrinsics.checkNotNullExpressionValue(continueWithTask, "continueWithTask(...)");
        return new PublisherStream(url, data, options, this.client, this.serializer, continueWithTask, this.executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task stream$lambda$4(FirebaseFunctions firebaseFunctions, HttpsCallOptions httpsCallOptions, Task it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return firebaseFunctions.contextProvider.getContext(httpsCallOptions.limitedUseAppCheckTokens);
    }

    /* compiled from: FirebaseFunctions.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0007R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/google/firebase/functions/FirebaseFunctions$Companion;", "", "<init>", "()V", "providerInstalled", "Lcom/google/android/gms/tasks/TaskCompletionSource;", "Ljava/lang/Void;", "providerInstallStarted", "", "maybeInstallProviders", "", "context", "Landroid/content/Context;", "uiExecutor", "Ljava/util/concurrent/Executor;", "getInstance", "Lcom/google/firebase/functions/FirebaseFunctions;", "app", "Lcom/google/firebase/FirebaseApp;", "regionOrCustomDomain", "", "com.google.firebase-firebase-functions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void maybeInstallProviders(final Context context, Executor uiExecutor) {
            synchronized (FirebaseFunctions.providerInstalled) {
                if (FirebaseFunctions.providerInstallStarted) {
                    return;
                }
                Companion companion = FirebaseFunctions.INSTANCE;
                FirebaseFunctions.providerInstallStarted = true;
                Unit unit = Unit.INSTANCE;
                uiExecutor.execute(new Runnable() { // from class: com.google.firebase.functions.FirebaseFunctions$Companion$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        FirebaseFunctions.Companion.maybeInstallProviders$lambda$1(context);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void maybeInstallProviders$lambda$1(Context context) {
            ProviderInstaller.installIfNeededAsync(context, new ProviderInstaller.ProviderInstallListener() { // from class: com.google.firebase.functions.FirebaseFunctions$Companion$maybeInstallProviders$2$1
                @Override // com.google.android.gms.security.ProviderInstaller.ProviderInstallListener
                public void onProviderInstalled() {
                    FirebaseFunctions.providerInstalled.setResult(null);
                }

                @Override // com.google.android.gms.security.ProviderInstaller.ProviderInstallListener
                public void onProviderInstallFailed(int i, Intent intent) {
                    Log.d("FirebaseFunctions", "Failed to update ssl context");
                    FirebaseFunctions.providerInstalled.setResult(null);
                }
            });
        }

        @JvmStatic
        public final FirebaseFunctions getInstance(FirebaseApp app, String regionOrCustomDomain) {
            Intrinsics.checkNotNullParameter(app, "app");
            Intrinsics.checkNotNullParameter(regionOrCustomDomain, "regionOrCustomDomain");
            Preconditions.checkNotNull(app, "You must call FirebaseApp.initializeApp first.");
            Preconditions.checkNotNull(regionOrCustomDomain);
            FunctionsMultiResourceComponent functionsMultiResourceComponent = (FunctionsMultiResourceComponent) app.get(FunctionsMultiResourceComponent.class);
            Preconditions.checkNotNull(functionsMultiResourceComponent, "Functions component does not exist.");
            FirebaseFunctions firebaseFunctions = functionsMultiResourceComponent.get(regionOrCustomDomain);
            Intrinsics.checkNotNull(firebaseFunctions);
            return firebaseFunctions;
        }

        @JvmStatic
        public final FirebaseFunctions getInstance(FirebaseApp app) {
            Intrinsics.checkNotNullParameter(app, "app");
            return getInstance(app, "us-central1");
        }

        @JvmStatic
        public final FirebaseFunctions getInstance(String regionOrCustomDomain) {
            Intrinsics.checkNotNullParameter(regionOrCustomDomain, "regionOrCustomDomain");
            FirebaseApp firebaseApp = FirebaseApp.getInstance();
            Intrinsics.checkNotNullExpressionValue(firebaseApp, "getInstance(...)");
            return getInstance(firebaseApp, regionOrCustomDomain);
        }

        @JvmStatic
        public final FirebaseFunctions getInstance() {
            FirebaseApp firebaseApp = FirebaseApp.getInstance();
            Intrinsics.checkNotNullExpressionValue(firebaseApp, "getInstance(...)");
            return getInstance(firebaseApp, "us-central1");
        }
    }
}
