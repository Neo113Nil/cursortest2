package com.vungle.ads.internal.downloader;

import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Cache;
import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
public abstract class e {
    public static OkHttpClient a;

    public static OkHttpClient a(PathProvider pathProvider) {
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        OkHttpClient okHttpClient = a;
        if (okHttpClient != null) {
            return okHttpClient;
        }
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder followSslRedirects = builder.readTimeout(60L, timeUnit).connectTimeout(60L, timeUnit).cache(null).followRedirects(true).followSslRedirects(true);
        ConfigManager.INSTANCE.getClass();
        long e = ConfigManager.e();
        int d = ConfigManager.d();
        String absolutePath = pathProvider.getCleverCacheDir().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "pathProvider.getCleverCacheDir().absolutePath");
        long min = Math.min(e, (PathProvider.a(absolutePath) * d) / 100);
        if (min > 0) {
            followSslRedirects.cache(new Cache(pathProvider.getCleverCacheDir(), min));
        } else {
            boolean z = u.a;
            t.c("AssetDownloader", "cache disk capacity size <=0, no clever cache active.");
        }
        OkHttpClient build = followSslRedirects.build();
        a = build;
        return build;
    }
}
