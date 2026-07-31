package expo.modules.devlauncher.launcher.manifest;

import android.net.Uri;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import expo.modules.devlauncher.helpers.DevLauncherOkHttpExtensionsKt;
import expo.modules.devlauncher.helpers.DevLauncherOkHttpExtensionsKt$await$2$1;
import expo.modules.manifests.core.Manifest;
import java.io.Closeable;
import java.io.Reader;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONObject;

/* compiled from: DevLauncherManifestParser.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\n\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\u00020\u000eH\u0082@¢\u0006\u0002\u0010\fJ\u000e\u0010\u000f\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\fJ\b\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lexpo/modules/devlauncher/launcher/manifest/DevLauncherManifestParser;", "", "httpClient", "Lokhttp3/OkHttpClient;", "url", "Landroid/net/Uri;", "installationID", "", "<init>", "(Lokhttp3/OkHttpClient;Landroid/net/Uri;Ljava/lang/String;)V", "isManifestUrl", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downloadManifest", "Ljava/io/Reader;", "parseManifest", "Lexpo/modules/manifests/core/Manifest;", "getHeaders", "Lokhttp3/Headers;", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DevLauncherManifestParser {
    public static final int $stable = 8;
    private final OkHttpClient httpClient;
    private final String installationID;
    private final Uri url;

    public DevLauncherManifestParser(OkHttpClient httpClient, Uri url, String str) {
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(url, "url");
        this.httpClient = httpClient;
        this.url = url;
        this.installationID = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object isManifestUrl(Continuation<? super Boolean> continuation) {
        DevLauncherManifestParser$isManifestUrl$1 devLauncherManifestParser$isManifestUrl$1;
        int i;
        boolean z;
        Response response;
        if (continuation instanceof DevLauncherManifestParser$isManifestUrl$1) {
            devLauncherManifestParser$isManifestUrl$1 = (DevLauncherManifestParser$isManifestUrl$1) continuation;
            if ((devLauncherManifestParser$isManifestUrl$1.label & Integer.MIN_VALUE) != 0) {
                devLauncherManifestParser$isManifestUrl$1.label -= Integer.MIN_VALUE;
                Object obj = devLauncherManifestParser$isManifestUrl$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = devLauncherManifestParser$isManifestUrl$1.label;
                z = true;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Request fetch = DevLauncherOkHttpExtensionsKt.fetch(this.url, FirebasePerformance.HttpMethod.HEAD, getHeaders());
                    OkHttpClient okHttpClient = this.httpClient;
                    devLauncherManifestParser$isManifestUrl$1.L$0 = fetch;
                    devLauncherManifestParser$isManifestUrl$1.L$1 = okHttpClient;
                    devLauncherManifestParser$isManifestUrl$1.label = 1;
                    DevLauncherManifestParser$isManifestUrl$1 devLauncherManifestParser$isManifestUrl$12 = devLauncherManifestParser$isManifestUrl$1;
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(devLauncherManifestParser$isManifestUrl$12), 1);
                    cancellableContinuationImpl.initCancellability();
                    FirebasePerfOkHttpClient.enqueue(okHttpClient.newCall(fetch), new DevLauncherOkHttpExtensionsKt$await$2$1(cancellableContinuationImpl));
                    obj = cancellableContinuationImpl.getResult();
                    if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(devLauncherManifestParser$isManifestUrl$12);
                    }
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                response = (Response) obj;
                String header$default = Response.header$default(response, "Content-Type", null, 2, null);
                if (response.isSuccessful() && response.header("Exponent-Server", null) == null && (header$default == null || StringsKt.startsWith$default(header$default, "text/html", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) header$default, (CharSequence) "/javascript", false, 2, (Object) null))) {
                    z = false;
                }
                return Boxing.boxBoolean(z);
            }
        }
        devLauncherManifestParser$isManifestUrl$1 = new DevLauncherManifestParser$isManifestUrl$1(this, continuation);
        Object obj2 = devLauncherManifestParser$isManifestUrl$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = devLauncherManifestParser$isManifestUrl$1.label;
        z = true;
        if (i != 0) {
        }
        response = (Response) obj2;
        String header$default2 = Response.header$default(response, "Content-Type", null, 2, null);
        if (response.isSuccessful()) {
            z = false;
        }
        return Boxing.boxBoolean(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object downloadManifest(Continuation<? super Reader> continuation) {
        DevLauncherManifestParser$downloadManifest$1 devLauncherManifestParser$downloadManifest$1;
        int i;
        Response response;
        if (continuation instanceof DevLauncherManifestParser$downloadManifest$1) {
            devLauncherManifestParser$downloadManifest$1 = (DevLauncherManifestParser$downloadManifest$1) continuation;
            if ((devLauncherManifestParser$downloadManifest$1.label & Integer.MIN_VALUE) != 0) {
                devLauncherManifestParser$downloadManifest$1.label -= Integer.MIN_VALUE;
                Object obj = devLauncherManifestParser$downloadManifest$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = devLauncherManifestParser$downloadManifest$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Request fetch = DevLauncherOkHttpExtensionsKt.fetch(this.url, "GET", getHeaders());
                    OkHttpClient okHttpClient = this.httpClient;
                    devLauncherManifestParser$downloadManifest$1.L$0 = fetch;
                    devLauncherManifestParser$downloadManifest$1.L$1 = okHttpClient;
                    devLauncherManifestParser$downloadManifest$1.label = 1;
                    DevLauncherManifestParser$downloadManifest$1 devLauncherManifestParser$downloadManifest$12 = devLauncherManifestParser$downloadManifest$1;
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(devLauncherManifestParser$downloadManifest$12), 1);
                    cancellableContinuationImpl.initCancellability();
                    FirebasePerfOkHttpClient.enqueue(okHttpClient.newCall(fetch), new DevLauncherOkHttpExtensionsKt$await$2$1(cancellableContinuationImpl));
                    obj = cancellableContinuationImpl.getResult();
                    if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(devLauncherManifestParser$downloadManifest$12);
                    }
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                response = (Response) obj;
                if (response.isSuccessful()) {
                    throw new Exception("Failed to open app.\n\nIf you are trying to load the app from a development server, check your network connectivity and make sure you can access the server from your device.\n\nIf you are trying to open a published project, install a compatible version of expo-updates and follow all setup and integration steps.");
                }
                ResponseBody body = response.getBody();
                Intrinsics.checkNotNull(body);
                return body.charStream();
            }
        }
        devLauncherManifestParser$downloadManifest$1 = new DevLauncherManifestParser$downloadManifest$1(this, continuation);
        Object obj2 = devLauncherManifestParser$downloadManifest$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = devLauncherManifestParser$downloadManifest$1.label;
        if (i != 0) {
        }
        response = (Response) obj2;
        if (response.isSuccessful()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object parseManifest(Continuation<? super Manifest> continuation) {
        DevLauncherManifestParser$parseManifest$1 devLauncherManifestParser$parseManifest$1;
        int i;
        try {
            if (continuation instanceof DevLauncherManifestParser$parseManifest$1) {
                devLauncherManifestParser$parseManifest$1 = (DevLauncherManifestParser$parseManifest$1) continuation;
                if ((devLauncherManifestParser$parseManifest$1.label & Integer.MIN_VALUE) != 0) {
                    devLauncherManifestParser$parseManifest$1.label -= Integer.MIN_VALUE;
                    Object obj = devLauncherManifestParser$parseManifest$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = devLauncherManifestParser$parseManifest$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        devLauncherManifestParser$parseManifest$1.label = 1;
                        obj = downloadManifest(devLauncherManifestParser$parseManifest$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    Closeable closeable = (Closeable) obj;
                    Manifest fromManifestJson = Manifest.INSTANCE.fromManifestJson(new JSONObject(TextStreamsKt.readText((Reader) closeable)));
                    CloseableKt.closeFinally(closeable, null);
                    return fromManifestJson;
                }
            }
            Manifest fromManifestJson2 = Manifest.INSTANCE.fromManifestJson(new JSONObject(TextStreamsKt.readText((Reader) closeable)));
            CloseableKt.closeFinally(closeable, null);
            return fromManifestJson2;
        } finally {
        }
        devLauncherManifestParser$parseManifest$1 = new DevLauncherManifestParser$parseManifest$1(this, continuation);
        Object obj2 = devLauncherManifestParser$parseManifest$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = devLauncherManifestParser$parseManifest$1.label;
        if (i != 0) {
        }
        Closeable closeable2 = (Closeable) obj2;
    }

    private final Headers getHeaders() {
        Map<String, String> mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("expo-platform", "android"), TuplesKt.to("accept", "application/expo+json,application/json"));
        String str = this.installationID;
        if (str != null) {
            mutableMapOf.put("expo-dev-client-id", str);
        }
        return Headers.INSTANCE.of(mutableMapOf);
    }
}
