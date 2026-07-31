package io.intercom.android.sdk.m5.push;

import android.content.Context;
import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: IntercomPushBitmapUtils.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.push.IntercomPushBitmapUtilsKt$loadBitmaps$1$contentBitmapJob$1", f = "IntercomPushBitmapUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class IntercomPushBitmapUtilsKt$loadBitmaps$1$contentBitmapJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<Bitmap> $contentBitmap;
    final /* synthetic */ String $contentImageUrl;
    final /* synthetic */ Context $context;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IntercomPushBitmapUtilsKt$loadBitmaps$1$contentBitmapJob$1(Ref.ObjectRef<Bitmap> objectRef, Context context, String str, Continuation<? super IntercomPushBitmapUtilsKt$loadBitmaps$1$contentBitmapJob$1> continuation) {
        super(2, continuation);
        this.$contentBitmap = objectRef;
        this.$context = context;
        this.$contentImageUrl = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IntercomPushBitmapUtilsKt$loadBitmaps$1$contentBitmapJob$1(this.$contentBitmap, this.$context, this.$contentImageUrl, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((IntercomPushBitmapUtilsKt$loadBitmaps$1$contentBitmapJob$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, android.graphics.Bitmap] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ?? loadContentBitmapBlocking;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Ref.ObjectRef<Bitmap> objectRef = this.$contentBitmap;
        loadContentBitmapBlocking = IntercomPushBitmapUtilsKt.loadContentBitmapBlocking(this.$context, this.$contentImageUrl);
        objectRef.element = loadContentBitmapBlocking;
        return Unit.INSTANCE;
    }
}
