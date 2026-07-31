package io.intercom.android.sdk.api;

import android.util.Log;
import com.facebook.react.modules.systeminfo.AndroidInfoHelpers;
import com.google.common.net.HttpHeaders;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: S3HostRedirectInterceptor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/api/S3HostRedirectInterceptor;", "Lokhttp3/Interceptor;", "<init>", "()V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class S3HostRedirectInterceptor implements Interceptor {
    public static final int $stable = 0;

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        HttpUrl url = request.url();
        if (Intrinsics.areEqual(url.host(), "uploads-development.s3.test")) {
            Log.d("IntercomUpload", "Intercepting S3 request: " + url);
            HttpUrl build = url.newBuilder().host(AndroidInfoHelpers.EMULATOR_LOCALHOST).port(80).build();
            Request build2 = request.newBuilder().url(build).header(HttpHeaders.HOST, "uploads-development.s3.test").build();
            Log.d("IntercomUpload", "Redirected to: " + build + " with Host: uploads-development.s3.test");
            return chain.proceed(build2);
        }
        return chain.proceed(request);
    }
}
