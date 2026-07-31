package com.yandex.div.internal.viewpool.optimization;

import android.content.Context;
import android.util.Log;
import androidx.datastore.core.DataStore;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.viewpool.ViewPreCreationProfile;
import com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository;
import com.yandex.div.logging.Severity;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewPreCreationProfileRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository$save$2", f = "ViewPreCreationProfileRepository.kt", l = {39}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ViewPreCreationProfileRepository$save$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ ViewPreCreationProfile $profile;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ViewPreCreationProfileRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ViewPreCreationProfileRepository$save$2(ViewPreCreationProfileRepository viewPreCreationProfileRepository, ViewPreCreationProfile viewPreCreationProfile, Continuation continuation) {
        super(2, continuation);
        this.this$0 = viewPreCreationProfileRepository;
        this.$profile = viewPreCreationProfile;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        ViewPreCreationProfileRepository$save$2 viewPreCreationProfileRepository$save$2 = new ViewPreCreationProfileRepository$save$2(this.this$0, this.$profile, continuation);
        viewPreCreationProfileRepository$save$2.L$0 = obj;
        return viewPreCreationProfileRepository$save$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((ViewPreCreationProfileRepository$save$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m8023constructorimpl;
        ViewPreCreationProfileRepository.Companion companion;
        Context context;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ViewPreCreationProfileRepository viewPreCreationProfileRepository = this.this$0;
                ViewPreCreationProfile viewPreCreationProfile = this.$profile;
                Result.Companion companion2 = Result.INSTANCE;
                companion = ViewPreCreationProfileRepository.Companion;
                context = viewPreCreationProfileRepository.context;
                String id = viewPreCreationProfile.getId();
                Intrinsics.checkNotNull(id);
                DataStore<ViewPreCreationProfile> storeForId = companion.getStoreForId(context, id);
                ViewPreCreationProfileRepository$save$2$1$1 viewPreCreationProfileRepository$save$2$1$1 = new ViewPreCreationProfileRepository$save$2$1$1(viewPreCreationProfile, null);
                this.label = 1;
                obj = storeForId.updateData(viewPreCreationProfileRepository$save$2$1$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            m8023constructorimpl = Result.m8023constructorimpl((ViewPreCreationProfile) obj);
        } catch (Throwable th) {
            Result.Companion companion3 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
        if (m8026exceptionOrNullimpl != null && KLog.INSTANCE.isAtLeast(Severity.ERROR)) {
            Log.e(ViewPreCreationProfileRepository.TAG, "", m8026exceptionOrNullimpl);
        }
        return Boxing.boxBoolean(Result.m8029isSuccessimpl(m8023constructorimpl));
    }
}
