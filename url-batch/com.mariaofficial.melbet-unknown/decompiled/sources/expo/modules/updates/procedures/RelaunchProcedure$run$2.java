package expo.modules.updates.procedures;

import android.app.Activity;
import com.facebook.imagepipeline.transcoder.JpegTranscoderUtils;
import com.facebook.react.ReactApplication;
import expo.modules.updates.reloadscreen.ReloadScreenManager;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: RelaunchProcedure.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.updates.procedures.RelaunchProcedure$run$2", f = "RelaunchProcedure.kt", i = {}, l = {JpegTranscoderUtils.DEFAULT_JPEG_QUALITY}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class RelaunchProcedure$run$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ReactApplication $reactApplication;
    int label;
    final /* synthetic */ RelaunchProcedure this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RelaunchProcedure$run$2(RelaunchProcedure relaunchProcedure, ReactApplication reactApplication, Continuation<? super RelaunchProcedure$run$2> continuation) {
        super(2, continuation);
        this.this$0 = relaunchProcedure;
        this.$reactApplication = reactApplication;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RelaunchProcedure$run$2(this.this$0, this.$reactApplication, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RelaunchProcedure$run$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: RelaunchProcedure.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "expo.modules.updates.procedures.RelaunchProcedure$run$2$1", f = "RelaunchProcedure.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: expo.modules.updates.procedures.RelaunchProcedure$run$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ReactApplication $reactApplication;
        int label;
        final /* synthetic */ RelaunchProcedure this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(RelaunchProcedure relaunchProcedure, ReactApplication reactApplication, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = relaunchProcedure;
            this.$reactApplication = reactApplication;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$reactApplication, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ReloadScreenManager reloadScreenManager;
            WeakReference weakReference;
            WeakReference weakReference2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                reloadScreenManager = this.this$0.reloadScreenManager;
                if (reloadScreenManager != null) {
                    weakReference2 = this.this$0.weakActivity;
                    reloadScreenManager.show(weakReference2 != null ? (Activity) weakReference2.get() : null);
                }
                ReactApplication reactApplication = this.$reactApplication;
                weakReference = this.this$0.weakActivity;
                RestartReactAppExtensionsKt.restart(reactApplication, weakReference != null ? (Activity) weakReference.get() : null, "Restart from RelaunchProcedure");
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(this.this$0, this.$reactApplication, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
