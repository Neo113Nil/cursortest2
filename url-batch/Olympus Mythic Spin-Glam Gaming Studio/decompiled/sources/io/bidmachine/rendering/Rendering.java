package io.bidmachine.rendering;

import android.content.Context;
import io.bidmachine.iab.mraid.MraidLog;
import io.bidmachine.rendering.internal.f;
import io.bidmachine.rendering.internal.k;
import io.bidmachine.rendering.utils.NetworkRequestBuilder;
import io.bidmachine.rendering.utils.UserAgentProvider;
import io.bidmachine.util.SdkDispatchers;
import io.bidmachine.util.cache.MediaFileCacheManager;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0013\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0011¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R.\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010#\u001a\u0004\u0018\u00010\u000e8\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010\u0003\u001a\u0004\b&\u0010'R:\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b-\u0010\u0003\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lio/bidmachine/rendering/Rendering;", "", "<init>", "()V", "Lio/bidmachine/rendering/utils/UserAgentProvider;", "userAgentProvider", "", "setUserAgentProvider", "(Lio/bidmachine/rendering/utils/UserAgentProvider;)V", "", "getUserAgent", "()Ljava/lang/String;", "Landroid/content/Context;", "context", "Lio/bidmachine/rendering/utils/NetworkRequestBuilder;", "networkRequestBuilder", "Lkotlin/Function0;", "Lio/bidmachine/util/cache/MediaFileCacheManager;", "mediaFileCacheManagerProvider", "initialize", "(Landroid/content/Context;Lio/bidmachine/rendering/utils/NetworkRequestBuilder;Lkotlin/jvm/functions/Function0;)V", "", "isLoggingEnabled", "setLoggingEnabled", "(Z)V", "mediaFileCacheManager", "Lio/bidmachine/rendering/Repository;", "createRepository", "(Lio/bidmachine/util/cache/MediaFileCacheManager;)Lio/bidmachine/rendering/Repository;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "a", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isInitialized", "b", "Lio/bidmachine/rendering/utils/UserAgentProvider;", "<set-?>", "c", "Lio/bidmachine/rendering/utils/NetworkRequestBuilder;", "getNetworkRequestBuilder", "()Lio/bidmachine/rendering/utils/NetworkRequestBuilder;", "getNetworkRequestBuilder$annotations", "d", "Lkotlin/jvm/functions/Function0;", "getMediaFileCacheManagerProvider", "()Lkotlin/jvm/functions/Function0;", "getMediaFileCacheManagerProvider$annotations", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public final class Rendering {

    @NotNull
    public static final Rendering INSTANCE = new Rendering();

    /* renamed from: a, reason: from kotlin metadata */
    private static final AtomicBoolean isInitialized = new AtomicBoolean(false);

    /* renamed from: b, reason: from kotlin metadata */
    private static UserAgentProvider userAgentProvider;

    /* renamed from: c, reason: from kotlin metadata */
    private static NetworkRequestBuilder networkRequestBuilder;

    /* renamed from: d, reason: from kotlin metadata */
    private static volatile Function0 mediaFileCacheManagerProvider;

    static final class a extends Lambda implements Function0 {
        final /* synthetic */ MediaFileCacheManager a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(MediaFileCacheManager mediaFileCacheManager) {
            super(0);
            this.a = mediaFileCacheManager;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MediaFileCacheManager mo4828invoke() {
            return this.a;
        }
    }

    private Rendering() {
    }

    @Nullable
    public static final Function0 getMediaFileCacheManagerProvider() {
        return mediaFileCacheManagerProvider;
    }

    public static /* synthetic */ void getMediaFileCacheManagerProvider$annotations() {
    }

    @Nullable
    public static final NetworkRequestBuilder getNetworkRequestBuilder() {
        return networkRequestBuilder;
    }

    public static /* synthetic */ void getNetworkRequestBuilder$annotations() {
    }

    @Nullable
    public static final String getUserAgent() {
        UserAgentProvider userAgentProvider2 = userAgentProvider;
        if (userAgentProvider2 != null) {
            return userAgentProvider2.getUserAgent();
        }
        return null;
    }

    public static final void setUserAgentProvider(@Nullable UserAgentProvider userAgentProvider2) {
        userAgentProvider = userAgentProvider2;
    }

    @NotNull
    public final Repository createRepository(@NotNull MediaFileCacheManager mediaFileCacheManager) {
        Intrinsics.checkNotNullParameter(mediaFileCacheManager, "mediaFileCacheManager");
        return new io.bidmachine.rendering.internal.repository.a(new a(mediaFileCacheManager), CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(SdkDispatchers.INSTANCE.getDefault().getMain())), f.i.a());
    }

    public final void initialize(@NotNull Context context, @NotNull NetworkRequestBuilder networkRequestBuilder2, @NotNull Function0 mediaFileCacheManagerProvider2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(networkRequestBuilder2, "networkRequestBuilder");
        Intrinsics.checkNotNullParameter(mediaFileCacheManagerProvider2, "mediaFileCacheManagerProvider");
        if (isInitialized.compareAndSet(false, true)) {
            networkRequestBuilder = networkRequestBuilder2;
            mediaFileCacheManagerProvider = mediaFileCacheManagerProvider2;
        }
    }

    public final void setLoggingEnabled(boolean isLoggingEnabled) {
        k.a(isLoggingEnabled);
        MraidLog.setEnabled(isLoggingEnabled);
    }
}
