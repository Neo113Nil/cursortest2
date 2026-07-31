package io.bidmachine.util.file;

import android.os.Environment;
import android.os.StatFs;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.bidmachine.util.SdkDispatchers;
import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: StorageSpaceMonitor.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0004\u001e\u001f !B0\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\tø\u0001\u0000¢\u0006\u0002\u0010\nJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000eJ\b\u0010\u0018\u001a\u00020\u0016H\u0002J\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u000e\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000eJ\u0006\u0010\u001c\u001a\u00020\u0016J\u0006\u0010\u001d\u001a\u00020\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\u00020\u0007X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Lio/bidmachine/util/file/StorageSpaceMonitor;", "", "availableStorageSpaceThreshold", "", "sdkDispatchers", "Lio/bidmachine/util/SdkDispatchers;", "interval", "Lkotlin/time/Duration;", "storageSpaceStatExtractor", "Lio/bidmachine/util/file/StorageSpaceMonitor$StorageSpaceStatExtractor;", "(DLio/bidmachine/util/SdkDispatchers;JLio/bidmachine/util/file/StorageSpaceMonitor$StorageSpaceStatExtractor;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "listeners", "", "Lio/bidmachine/util/file/StorageSpaceMonitor$Listener;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "scope$delegate", "Lkotlin/Lazy;", "addListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "checkAndNotify", "getStorageSpaceStat", "Lio/bidmachine/util/file/StorageSpaceMonitor$StorageSpaceStat;", "removeListener", "start", "stop", "Listener", "StorageSpaceStat", "StorageSpaceStatExtractor", "StorageSpaceStatExtractorImpl", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class StorageSpaceMonitor {
    private final double availableStorageSpaceThreshold;
    private final long interval;

    @NotNull
    private final Set<Listener> listeners;

    /* renamed from: scope$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy scope;

    @NotNull
    private final StorageSpaceStatExtractor storageSpaceStatExtractor;

    /* compiled from: StorageSpaceMonitor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lio/bidmachine/util/file/StorageSpaceMonitor$Listener;", "", "onLowSpace", "", "storageSpaceStat", "Lio/bidmachine/util/file/StorageSpaceMonitor$StorageSpaceStat;", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface Listener {
        default void onLowSpace(@NotNull StorageSpaceStat storageSpaceStat) {
            Intrinsics.checkNotNullParameter(storageSpaceStat, "storageSpaceStat");
        }
    }

    /* compiled from: StorageSpaceMonitor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lio/bidmachine/util/file/StorageSpaceMonitor$StorageSpaceStatExtractor;", "", "getStorageSpaceStat", "Lio/bidmachine/util/file/StorageSpaceMonitor$StorageSpaceStat;", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface StorageSpaceStatExtractor {
        @Nullable
        StorageSpaceStat getStorageSpaceStat();
    }

    public /* synthetic */ StorageSpaceMonitor(double d, SdkDispatchers sdkDispatchers, long j, StorageSpaceStatExtractor storageSpaceStatExtractor, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, sdkDispatchers, j, storageSpaceStatExtractor);
    }

    private StorageSpaceMonitor(double d, final SdkDispatchers sdkDispatchers, long j, StorageSpaceStatExtractor storageSpaceStatExtractor) {
        this.interval = j;
        this.storageSpaceStatExtractor = storageSpaceStatExtractor;
        this.listeners = new CopyOnWriteArraySet();
        this.scope = LazyKt.lazy(new Function0() { // from class: io.bidmachine.util.file.StorageSpaceMonitor$scope$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final CoroutineScope mo4828invoke() {
                return CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(SdkDispatchers.this.getIo()));
            }
        });
        this.availableStorageSpaceThreshold = RangesKt.coerceIn(d, 0.0d, 1.0d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ StorageSpaceMonitor(double d, SdkDispatchers sdkDispatchers, long j, StorageSpaceStatExtractor storageSpaceStatExtractor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r0, r2, r3, r5, null);
        long j2;
        StorageSpaceStatExtractor storageSpaceStatExtractor2;
        double d2 = (i & 1) != 0 ? 0.1d : d;
        SdkDispatchers sdkDispatchers2 = (i & 2) != 0 ? SdkDispatchers.INSTANCE.getDefault() : sdkDispatchers;
        if ((i & 4) != 0) {
            Duration.Companion companion = Duration.Companion;
            j2 = DurationKt.toDuration(10, DurationUnit.SECONDS);
        } else {
            j2 = j;
        }
        if ((i & 8) != 0) {
            File dataDirectory = Environment.getDataDirectory();
            Intrinsics.checkNotNullExpressionValue(dataDirectory, "getDataDirectory()");
            storageSpaceStatExtractor2 = new StorageSpaceStatExtractorImpl(dataDirectory);
        } else {
            storageSpaceStatExtractor2 = storageSpaceStatExtractor;
        }
    }

    private final CoroutineScope getScope() {
        return (CoroutineScope) this.scope.getValue();
    }

    public final void addListener(@NotNull Listener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listeners.add(listener);
    }

    public final void removeListener(@NotNull Listener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listeners.remove(listener);
    }

    public final void start() {
        stop();
        BuildersKt__Builders_commonKt.launch$default(getScope(), null, null, new StorageSpaceMonitor$start$1(this, null), 3, null);
    }

    public final void stop() {
        JobKt__JobKt.cancelChildren$default(getScope().getCoroutineContext(), (CancellationException) null, 1, (Object) null);
    }

    @Nullable
    public final StorageSpaceStat getStorageSpaceStat() {
        return this.storageSpaceStatExtractor.getStorageSpaceStat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkAndNotify() {
        StorageSpaceStat storageSpaceStat = this.storageSpaceStatExtractor.getStorageSpaceStat();
        if (storageSpaceStat != null && storageSpaceStat.getAvailableStorageSpaceInPercent() < this.availableStorageSpaceThreshold) {
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((Listener) it.next()).onLowSpace(storageSpaceStat);
            }
        }
    }

    /* compiled from: StorageSpaceMonitor.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lio/bidmachine/util/file/StorageSpaceMonitor$StorageSpaceStatExtractorImpl;", "Lio/bidmachine/util/file/StorageSpaceMonitor$StorageSpaceStatExtractor;", "targetDir", "Ljava/io/File;", "(Ljava/io/File;)V", "getStorageSpaceStat", "Lio/bidmachine/util/file/StorageSpaceMonitor$StorageSpaceStat;", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class StorageSpaceStatExtractorImpl implements StorageSpaceStatExtractor {

        @NotNull
        private final File targetDir;

        public StorageSpaceStatExtractorImpl(@NotNull File targetDir) {
            Intrinsics.checkNotNullParameter(targetDir, "targetDir");
            this.targetDir = targetDir;
        }

        @Override // io.bidmachine.util.file.StorageSpaceMonitor.StorageSpaceStatExtractor
        @Nullable
        public StorageSpaceStat getStorageSpaceStat() {
            try {
                StatFs statFs = new StatFs(this.targetDir.getAbsolutePath());
                return new StorageSpaceStat(statFs.getTotalBytes(), statFs.getAvailableBytes());
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* compiled from: StorageSpaceMonitor.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007R\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0019"}, d2 = {"Lio/bidmachine/util/file/StorageSpaceMonitor$StorageSpaceStat;", "", "totalBytes", "", "availableBytes", "(JJ)V", "getAvailableBytes", "()J", "availableStorageSpaceInPercent", "", "getAvailableStorageSpaceInPercent", "()D", "getTotalBytes", "usedStorageSpaceInPercent", "getUsedStorageSpaceInPercent", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class StorageSpaceStat {
        private final long availableBytes;
        private final double availableStorageSpaceInPercent;
        private final long totalBytes;
        private final double usedStorageSpaceInPercent;

        public static /* synthetic */ StorageSpaceStat copy$default(StorageSpaceStat storageSpaceStat, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = storageSpaceStat.totalBytes;
            }
            if ((i & 2) != 0) {
                j2 = storageSpaceStat.availableBytes;
            }
            return storageSpaceStat.copy(j, j2);
        }

        /* renamed from: component1, reason: from getter */
        public final long getTotalBytes() {
            return this.totalBytes;
        }

        /* renamed from: component2, reason: from getter */
        public final long getAvailableBytes() {
            return this.availableBytes;
        }

        @NotNull
        public final StorageSpaceStat copy(long totalBytes, long availableBytes) {
            return new StorageSpaceStat(totalBytes, availableBytes);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StorageSpaceStat)) {
                return false;
            }
            StorageSpaceStat storageSpaceStat = (StorageSpaceStat) other;
            return this.totalBytes == storageSpaceStat.totalBytes && this.availableBytes == storageSpaceStat.availableBytes;
        }

        public int hashCode() {
            return (Long.hashCode(this.totalBytes) * 31) + Long.hashCode(this.availableBytes);
        }

        @NotNull
        public String toString() {
            return "StorageSpaceStat(totalBytes=" + this.totalBytes + ", availableBytes=" + this.availableBytes + ')';
        }

        public StorageSpaceStat(long j, long j2) {
            this.totalBytes = j;
            this.availableBytes = j2;
            double d = j == 0 ? 0.0d : j2 / j;
            this.availableStorageSpaceInPercent = d;
            this.usedStorageSpaceInPercent = 1 - d;
        }

        public final long getTotalBytes() {
            return this.totalBytes;
        }

        public final long getAvailableBytes() {
            return this.availableBytes;
        }

        public final double getAvailableStorageSpaceInPercent() {
            return this.availableStorageSpaceInPercent;
        }

        public final double getUsedStorageSpaceInPercent() {
            return this.usedStorageSpaceInPercent;
        }
    }
}
