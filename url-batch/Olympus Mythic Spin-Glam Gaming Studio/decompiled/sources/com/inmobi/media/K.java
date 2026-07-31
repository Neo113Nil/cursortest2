package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public abstract class K {
    public static final ThreadPoolExecutor a;

    static {
        String simpleName = K.class.getSimpleName();
        C4277q4 c4277q4 = AbstractC4015g4.a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        AdConfig adConfig = (AdConfig) AbstractC4015g4.a.a(AdConfig.class);
        int maxPoolSize = adConfig.getMaxPoolSize();
        int maxPoolSize2 = adConfig.getMaxPoolSize();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        String name = simpleName + "-AD";
        Intrinsics.checkNotNullParameter(name, "name");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(maxPoolSize, maxPoolSize2, 5L, timeUnit, linkedBlockingQueue, new M9(name, false));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        a = threadPoolExecutor;
    }
}
