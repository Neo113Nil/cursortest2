package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.AdConfig;
import com.squareup.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import okhttp3.OkHttpClient;

/* renamed from: com.inmobi.media.gg, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4027gg {
    public static volatile Picasso a;
    public static final Mutex b = MutexKt.Mutex$default(false, 1, null);
    public static final ArrayList c = new ArrayList();
    public static final C3999fg d = new C3999fg();

    public static final Picasso a(Context context) {
        C4277q4 c4277q4 = AbstractC4015g4.a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        Picasso build = new Picasso.Builder(context).downloader(new OkHttp3Downloader(new OkHttpClient.Builder().addInterceptor(new J8(((AdConfig) AbstractC4015g4.a.a(AdConfig.class)).getNative().getAssetConfig().getMaxImageSize() * 1024 * 1024)).build())).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    public static Picasso b(Context context) {
        Object runBlocking$default;
        Intrinsics.checkNotNullParameter(context, "context");
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new C3919cg(context, null), 1, null);
        return (Picasso) runBlocking$default;
    }
}
