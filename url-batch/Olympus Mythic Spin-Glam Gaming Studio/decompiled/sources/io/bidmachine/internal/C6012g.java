package io.bidmachine.internal;

import android.content.Context;
import io.bidmachine.util.SdkDispatchers;
import io.bidmachine.util.cache.MediaFileCacheManager;
import io.bidmachine.util.download.DownloadManagerImpl;
import io.bidmachine.util.file.StorageSpaceMonitor;
import io.bidmachine.utils.log.UtilsLoggerInstance;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.bidmachine.internal.g, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C6012g {
    public static final C6012g a = new C6012g();
    private static final AtomicBoolean b = new AtomicBoolean(false);
    private static final Lazy c = LazyKt.lazy(b.a);
    private static final Object d = new Object();
    private static volatile MediaFileCacheManager e;

    /* renamed from: io.bidmachine.internal.g$a */
    public static final class a implements StorageSpaceMonitor.Listener {
        final /* synthetic */ MediaFileCacheManager a;

        a(MediaFileCacheManager mediaFileCacheManager) {
            this.a = mediaFileCacheManager;
        }

        @Override // io.bidmachine.util.file.StorageSpaceMonitor.Listener
        public void onLowSpace(StorageSpaceMonitor.StorageSpaceStat storageSpaceStat) {
            Intrinsics.checkNotNullParameter(storageSpaceStat, "storageSpaceStat");
            this.a.onLowDiskSpace();
        }
    }

    /* renamed from: io.bidmachine.internal.g$b */
    static final class b extends Lambda implements Function0 {
        public static final b a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final StorageSpaceMonitor mo4828invoke() {
            return new StorageSpaceMonitor(0.0d, null, 0L, null, 15, null);
        }
    }

    private C6012g() {
    }

    private final StorageSpaceMonitor a() {
        return (StorageSpaceMonitor) c.getValue();
    }

    public final void b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (b.compareAndSet(false, true)) {
            a().addListener(new a(a(context)));
            a().start();
        }
    }

    public final void c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        a(context).onSessionStarted();
    }

    public static final MediaFileCacheManager a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        MediaFileCacheManager mediaFileCacheManager = e;
        if (mediaFileCacheManager != null) {
            return mediaFileCacheManager;
        }
        synchronized (d) {
            MediaFileCacheManager mediaFileCacheManager2 = e;
            if (mediaFileCacheManager2 != null) {
                return mediaFileCacheManager2;
            }
            File file = new File(context.getNoBackupFilesDir(), "bm/renderer/cache");
            File file2 = new File(context.getCacheDir(), "bm/renderer/temp");
            UtilsLoggerInstance utilsLoggerInstance = new UtilsLoggerInstance();
            SdkDispatchers sdkDispatchers = SdkDispatchers.INSTANCE.getDefault();
            MediaFileCacheManager mediaFileCacheManager3 = new MediaFileCacheManager(file, new DownloadManagerImpl(context, file2, null, sdkDispatchers, utilsLoggerInstance, 4, null), a.a(), sdkDispatchers, utilsLoggerInstance);
            e = mediaFileCacheManager3;
            return mediaFileCacheManager3;
        }
    }

    public final void a(Context context, MediaFileCacheManager.Configuration configuration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        a(context).configure(configuration);
    }
}
