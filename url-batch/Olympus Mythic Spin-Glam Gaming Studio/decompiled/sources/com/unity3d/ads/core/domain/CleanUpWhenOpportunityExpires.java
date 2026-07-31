package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.log.Logger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: CleanUpWhenOpportunityExpires.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/unity3d/ads/core/domain/CleanUpWhenOpportunityExpires;", "", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "logger", "Lcom/unity3d/ads/core/log/Logger;", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/log/Logger;)V", "coroutineExceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CleanUpWhenOpportunityExpires {

    @NotNull
    private final CoroutineExceptionHandler coroutineExceptionHandler;

    @NotNull
    private final CoroutineScope coroutineScope;

    @NotNull
    private final Logger logger;

    public CleanUpWhenOpportunityExpires(@NotNull CoroutineDispatcher defaultDispatcher, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.logger = logger;
        CleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1 cleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1 = new CleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key, this);
        this.coroutineExceptionHandler = cleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1;
        this.coroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(defaultDispatcher).plus(cleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1));
    }

    public final void invoke(@NotNull AdObject adObject) {
        final Job launch$default;
        CoroutineScope adScope;
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        if (adObject.getAdScope() != null) {
            launch$default = BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new CleanUpWhenOpportunityExpires$invoke$job$1(adObject, null), 3, null);
            AdPlayer adPlayer = adObject.getAdPlayer();
            if (adPlayer == null || (adScope = adPlayer.getScope()) == null) {
                adScope = adObject.getAdScope();
            }
            JobKt.getJob(adScope.getCoroutineContext()).invokeOnCompletion(new Function1() { // from class: com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$2;
                    invoke$lambda$2 = CleanUpWhenOpportunityExpires.invoke$lambda$2(Job.this, (Throwable) obj);
                    return invoke$lambda$2;
                }
            });
            return;
        }
        throw new IllegalArgumentException("AdObject does not have an adScope.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2(Job job, Throwable th) {
        Job.DefaultImpls.cancel$default(job, null, 1, null);
        return Unit.INSTANCE;
    }
}
