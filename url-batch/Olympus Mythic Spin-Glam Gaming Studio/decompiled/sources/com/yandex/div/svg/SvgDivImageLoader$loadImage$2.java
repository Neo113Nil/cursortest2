package com.yandex.div.svg;

import android.graphics.drawable.PictureDrawable;
import com.yandex.div.core.images.DivImageDownloadCallback;
import java.io.ByteArrayInputStream;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import okhttp3.Call;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SvgDivImageLoader.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.yandex.div.svg.SvgDivImageLoader$loadImage$2", f = "SvgDivImageLoader.kt", l = {36}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class SvgDivImageLoader$loadImage$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ Call $call;
    final /* synthetic */ DivImageDownloadCallback $callback;
    final /* synthetic */ String $imageUrl;
    int label;
    final /* synthetic */ SvgDivImageLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SvgDivImageLoader$loadImage$2(DivImageDownloadCallback divImageDownloadCallback, Call call, SvgDivImageLoader svgDivImageLoader, String str, Continuation continuation) {
        super(2, continuation);
        this.$callback = divImageDownloadCallback;
        this.$call = call;
        this.this$0 = svgDivImageLoader;
        this.$imageUrl = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new SvgDivImageLoader$loadImage$2(this.$callback, this.$call, this.this$0, this.$imageUrl, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((SvgDivImageLoader$loadImage$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: SvgDivImageLoader.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/PictureDrawable;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.yandex.div.svg.SvgDivImageLoader$loadImage$2$1", f = "SvgDivImageLoader.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.yandex.div.svg.SvgDivImageLoader$loadImage$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2 {
        final /* synthetic */ Call $call;
        final /* synthetic */ String $imageUrl;
        int label;
        final /* synthetic */ SvgDivImageLoader this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Call call, SvgDivImageLoader svgDivImageLoader, String str, Continuation continuation) {
            super(2, continuation);
            this.$call = call;
            this.this$0 = svgDivImageLoader;
            this.$imageUrl = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new AnonymousClass1(this.$call, this.this$0, this.$imageUrl, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            SvgDecoder svgDecoder;
            SvgCacheManager svgCacheManager;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Call call = this.$call;
            byte[] imageData = call == null ? this.this$0.getImageData(this.$imageUrl) : this.this$0.downloadImage(call);
            if (imageData == null) {
                return null;
            }
            svgDecoder = this.this$0.svgDecoder;
            PictureDrawable decode = svgDecoder.decode(new ByteArrayInputStream(imageData));
            if (decode == null) {
                return null;
            }
            svgCacheManager = this.this$0.svgCacheManager;
            svgCacheManager.set(this.$imageUrl, decode);
            return decode;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        Unit unit = null;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$call, this.this$0, this.$imageUrl, null);
            this.label = 1;
            obj = BuildersKt.withContext(io2, anonymousClass1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        PictureDrawable pictureDrawable = (PictureDrawable) obj;
        if (pictureDrawable != null) {
            this.$callback.onSuccess(pictureDrawable);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            this.$callback.onError();
        }
        return Unit.INSTANCE;
    }
}
