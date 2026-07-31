package com.canhub.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.canhub.cropper.BitmapLoadingWorkerJob;
import com.canhub.cropper.BitmapUtils;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: BitmapLoadingWorkerJob.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.canhub.cropper.BitmapLoadingWorkerJob$start$1", f = "BitmapLoadingWorkerJob.kt", i = {}, l = {52, ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class BitmapLoadingWorkerJob$start$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BitmapLoadingWorkerJob this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BitmapLoadingWorkerJob$start$1(BitmapLoadingWorkerJob bitmapLoadingWorkerJob, Continuation<? super BitmapLoadingWorkerJob$start$1> continuation) {
        super(2, continuation);
        this.this$0 = bitmapLoadingWorkerJob;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BitmapLoadingWorkerJob$start$1 bitmapLoadingWorkerJob$start$1 = new BitmapLoadingWorkerJob$start$1(this.this$0, continuation);
        bitmapLoadingWorkerJob$start$1.L$0 = obj;
        return bitmapLoadingWorkerJob$start$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BitmapLoadingWorkerJob$start$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0096, code lost:
    
        if (r14 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b6, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b4, code lost:
    
        if (r14 != r1) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object onPostExecute;
        Context context;
        int i;
        int i2;
        Context context2;
        Object onPostExecute2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.label;
        try {
        } catch (Exception e) {
            this.label = 2;
            onPostExecute = this.this$0.onPostExecute(new BitmapLoadingWorkerJob.Result(this.this$0.getUri(), null, 0, 0, false, false, e), this);
        }
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            if (CoroutineScopeKt.isActive(coroutineScope)) {
                BitmapUtils bitmapUtils = BitmapUtils.INSTANCE;
                context = this.this$0.context;
                Uri uri = this.this$0.getUri();
                i = this.this$0.width;
                i2 = this.this$0.height;
                BitmapUtils.BitmapSampled decodeSampledBitmap = bitmapUtils.decodeSampledBitmap(context, uri, i, i2);
                if (CoroutineScopeKt.isActive(coroutineScope)) {
                    BitmapUtils bitmapUtils2 = BitmapUtils.INSTANCE;
                    Bitmap bitmap = decodeSampledBitmap.getBitmap();
                    context2 = this.this$0.context;
                    BitmapUtils.RotateBitmapResult orientateBitmapByExif = bitmapUtils2.orientateBitmapByExif(bitmap, context2, this.this$0.getUri());
                    this.label = 1;
                    onPostExecute2 = this.this$0.onPostExecute(new BitmapLoadingWorkerJob.Result(this.this$0.getUri(), orientateBitmapByExif.getBitmap(), decodeSampledBitmap.getSampleSize(), orientateBitmapByExif.getDegrees(), orientateBitmapByExif.getFlipHorizontally(), orientateBitmapByExif.getFlipVertically(), null), this);
                }
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
