package expo.modules.devmenu.api;

import android.net.Uri;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import expo.modules.devmenu.helpers.DevMenuOkHttpExtensionKt$await$2$1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

/* compiled from: DevMenuMetroClient.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lexpo/modules/devmenu/api/DevMenuMetroClient;", "", "<init>", "()V", "httpClient", "Lokhttp3/OkHttpClient;", "openJSInspector", "", "metroHost", "", "applicationId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DevMenuMetroClient {
    public static final int $stable = 8;
    private final OkHttpClient httpClient = new OkHttpClient();

    public final Object openJSInspector(String str, String str2, Continuation<? super Unit> continuation) {
        Uri build = Uri.parse(str + "/_expo/debugger").buildUpon().appendQueryParameter("applicationId", str2).build();
        Request.Builder put = new Request.Builder().put(RequestBody.INSTANCE.create("", (MediaType) null));
        String uri = build.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        Request build2 = put.url(uri).build();
        OkHttpClient okHttpClient = this.httpClient;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        FirebasePerfOkHttpClient.enqueue(okHttpClient.newCall(build2), new DevMenuOkHttpExtensionKt$await$2$1(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }
}
