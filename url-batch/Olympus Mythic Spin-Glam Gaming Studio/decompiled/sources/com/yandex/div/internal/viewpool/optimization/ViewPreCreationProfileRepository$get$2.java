package com.yandex.div.internal.viewpool.optimization;

import android.content.Context;
import android.util.Log;
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
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewPreCreationProfileRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/yandex/div/internal/viewpool/ViewPreCreationProfile;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository$get$2", f = "ViewPreCreationProfileRepository.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ViewPreCreationProfileRepository$get$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ String $id;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ViewPreCreationProfileRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ViewPreCreationProfileRepository$get$2(ViewPreCreationProfileRepository viewPreCreationProfileRepository, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = viewPreCreationProfileRepository;
        this.$id = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        ViewPreCreationProfileRepository$get$2 viewPreCreationProfileRepository$get$2 = new ViewPreCreationProfileRepository$get$2(this.this$0, this.$id, continuation);
        viewPreCreationProfileRepository$get$2.L$0 = obj;
        return viewPreCreationProfileRepository$get$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((ViewPreCreationProfileRepository$get$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m8023constructorimpl;
        ViewPreCreationProfile viewPreCreationProfile;
        ViewPreCreationProfile copy;
        ViewPreCreationProfileRepository.Companion companion;
        Context context;
        Object first;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ViewPreCreationProfileRepository viewPreCreationProfileRepository = this.this$0;
                String str = this.$id;
                Result.Companion companion2 = Result.INSTANCE;
                companion = ViewPreCreationProfileRepository.Companion;
                context = viewPreCreationProfileRepository.context;
                Flow data = companion.getStoreForId(context, str).getData();
                this.label = 1;
                first = FlowKt.first(data, this);
                if (first == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                first = obj;
            }
            m8023constructorimpl = Result.m8023constructorimpl((ViewPreCreationProfile) first);
        } catch (Throwable th) {
            Result.Companion companion3 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
        if (m8026exceptionOrNullimpl != null && KLog.INSTANCE.isAtLeast(Severity.ERROR)) {
            Log.e(ViewPreCreationProfileRepository.TAG, "", m8026exceptionOrNullimpl);
        }
        if (Result.m8028isFailureimpl(m8023constructorimpl)) {
            m8023constructorimpl = null;
        }
        ViewPreCreationProfile viewPreCreationProfile2 = (ViewPreCreationProfile) m8023constructorimpl;
        if (viewPreCreationProfile2 != null) {
            return viewPreCreationProfile2;
        }
        viewPreCreationProfile = this.this$0.defaultProfile;
        copy = viewPreCreationProfile.copy((r37 & 1) != 0 ? viewPreCreationProfile.id : this.$id, (r37 & 2) != 0 ? viewPreCreationProfile.text : null, (r37 & 4) != 0 ? viewPreCreationProfile.image : null, (r37 & 8) != 0 ? viewPreCreationProfile.gifImage : null, (r37 & 16) != 0 ? viewPreCreationProfile.overlapContainer : null, (r37 & 32) != 0 ? viewPreCreationProfile.linearContainer : null, (r37 & 64) != 0 ? viewPreCreationProfile.wrapContainer : null, (r37 & 128) != 0 ? viewPreCreationProfile.grid : null, (r37 & 256) != 0 ? viewPreCreationProfile.gallery : null, (r37 & 512) != 0 ? viewPreCreationProfile.pager : null, (r37 & 1024) != 0 ? viewPreCreationProfile.tab : null, (r37 & 2048) != 0 ? viewPreCreationProfile.state : null, (r37 & 4096) != 0 ? viewPreCreationProfile.custom : null, (r37 & 8192) != 0 ? viewPreCreationProfile.indicator : null, (r37 & 16384) != 0 ? viewPreCreationProfile.slider : null, (r37 & 32768) != 0 ? viewPreCreationProfile.input : null, (r37 & 65536) != 0 ? viewPreCreationProfile.select : null, (r37 & 131072) != 0 ? viewPreCreationProfile.video : null, (r37 & 262144) != 0 ? viewPreCreationProfile.switch : null);
        return copy;
    }
}
