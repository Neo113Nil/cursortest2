package io.bidmachine.util.visibilitytracking;

import android.view.View;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VisibilityTrackerImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "io.bidmachine.util.visibilitytracking.VisibilityTrackerImpl$processOnPreDraw$1", f = "VisibilityTrackerImpl.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class VisibilityTrackerImpl$processOnPreDraw$1 extends SuspendLambda implements Function2 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ VisibilityTrackerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VisibilityTrackerImpl$processOnPreDraw$1(VisibilityTrackerImpl visibilityTrackerImpl, Continuation continuation) {
        super(2, continuation);
        this.this$0 = visibilityTrackerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        VisibilityTrackerImpl$processOnPreDraw$1 visibilityTrackerImpl$processOnPreDraw$1 = new VisibilityTrackerImpl$processOnPreDraw$1(this.this$0, continuation);
        visibilityTrackerImpl$processOnPreDraw$1.L$0 = obj;
        return visibilityTrackerImpl$processOnPreDraw$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((VisibilityTrackerImpl$processOnPreDraw$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:7:0x004a, B:9:0x0050, B:13:0x0056, B:15:0x005c, B:16:0x0063, B:26:0x0060), top: B:6:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0050 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:7:0x004a, B:9:0x0050, B:13:0x0056, B:15:0x005c, B:16:0x0063, B:26:0x0060), top: B:6:0x004a }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0045 -> B:5:0x0048). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        CoroutineScope coroutineScope;
        AtomicBoolean atomicBoolean;
        AtomicBoolean atomicBoolean2;
        View view;
        boolean check;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            atomicBoolean = this.this$0.isStarted;
            if (atomicBoolean.get()) {
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        coroutineScope = (CoroutineScope) this.L$0;
        ResultKt.throwOnFailure(obj);
        VisibilityTrackerImpl visibilityTrackerImpl = this.this$0;
        view = visibilityTrackerImpl.getView();
        if (view == null) {
            check = visibilityTrackerImpl.check(view);
            if (check) {
                visibilityTrackerImpl.notifyViewOnScreen();
            } else {
                visibilityTrackerImpl.notifyViewOutOfScreen();
            }
            Unit unit = Unit.INSTANCE;
            atomicBoolean = this.this$0.isStarted;
            if (atomicBoolean.get()) {
                atomicBoolean2 = this.this$0.isCheckerScheduled;
                if (atomicBoolean2.get()) {
                    this.L$0 = coroutineScope;
                    this.label = 1;
                    if (DelayKt.delay(100L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    VisibilityTrackerImpl visibilityTrackerImpl2 = this.this$0;
                    view = visibilityTrackerImpl2.getView();
                    if (view == null) {
                    }
                }
            }
            return Unit.INSTANCE;
        }
        visibilityTrackerImpl2.stop();
        return Unit.INSTANCE;
    }
}
