package expo.modules.devlauncher.helpers;

import android.net.Uri;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* compiled from: DevLauncherOkHttpExtensions.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086H¢\u0006\u0002\u0010\u0005\u001a\u001e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u001aG\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2*\u0010\u000b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00110\u0010\"\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0011¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"await", "Lokhttp3/Response;", "Lokhttp3/Request;", "okHttpClient", "Lokhttp3/OkHttpClient;", "(Lokhttp3/Request;Lokhttp3/OkHttpClient;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", RemoteConfigComponent.FETCH_FILE_NAME, "url", "Landroid/net/Uri;", FirebaseAnalytics.Param.METHOD, "", "headers", "Lokhttp3/Headers;", "post", "requestBody", "Lokhttp3/RequestBody;", "", "Lkotlin/Pair;", "(Landroid/net/Uri;Lokhttp3/RequestBody;[Lkotlin/Pair;)Lokhttp3/Request;", "expo-dev-launcher_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DevLauncherOkHttpExtensionsKt {
    public static final Request fetch(Uri url, String method, Headers headers) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Request.Builder method2 = new Request.Builder().method(method, null);
        String uri = url.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return method2.url(uri).headers(headers).build();
    }

    public static final Request post(Uri url, RequestBody requestBody, Pair<String, String>... headers) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Request.Builder method = new Request.Builder().method("POST", requestBody);
        String uri = url.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        Request.Builder url2 = method.url(uri);
        for (Pair<String, String> pair : headers) {
            url2.addHeader(pair.getFirst(), pair.getSecond());
        }
        return url2.build();
    }

    private static final Object await$$forInline(Request request, OkHttpClient okHttpClient, Continuation<? super Response> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        FirebasePerfOkHttpClient.enqueue(okHttpClient.newCall(request), new DevLauncherOkHttpExtensionsKt$await$2$1(cancellableContinuationImpl));
        Unit unit = Unit.INSTANCE;
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final Object await(Request request, OkHttpClient okHttpClient, Continuation<? super Response> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        FirebasePerfOkHttpClient.enqueue(okHttpClient.newCall(request), new DevLauncherOkHttpExtensionsKt$await$2$1(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
