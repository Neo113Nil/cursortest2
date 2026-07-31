package io.intercom.android.sdk.ui.preview.viewmodel;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PreviewViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.ui.preview.viewmodel.PreviewViewModel$saveImage$1", f = "PreviewViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class PreviewViewModel$saveImage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ IntercomPreviewFile.NetworkFile $file;
    int label;
    final /* synthetic */ PreviewViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PreviewViewModel$saveImage$1(PreviewViewModel previewViewModel, IntercomPreviewFile.NetworkFile networkFile, Context context, Continuation<? super PreviewViewModel$saveImage$1> continuation) {
        super(2, continuation);
        this.this$0 = previewViewModel;
        this.$file = networkFile;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PreviewViewModel$saveImage$1(this.this$0, this.$file, this.$context, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PreviewViewModel$saveImage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Bitmap prepareBitmap;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            prepareBitmap = this.this$0.prepareBitmap(this.$file.getUrl());
            if (prepareBitmap == null) {
                this.this$0.showFileSaveFailed(this.$context);
                return Unit.INSTANCE;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                this.this$0.saveImageOnApi29Above(prepareBitmap, this.$file.getUrl(), this.$file.getMimeType(), this.$context);
            } else {
                this.this$0.saveImageLegacy(prepareBitmap, this.$file.getUrl(), this.$file.getMimeType(), this.$context);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
