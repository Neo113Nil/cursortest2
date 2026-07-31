package com.yandex.div.core.view2.divs;

import android.content.Context;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.bytedance.adsdk.ugeno.bvs.fb.fs$$ExternalSyntheticApiModelOutline0;
import com.yandex.div.core.DivIdLoggingImageDownloadCallback;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ImageRepresentation;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivPlaceholderLoader;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivGifImageView;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.widget.AspectImageView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.logging.Severity;
import com.yandex.div2.Div;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivGifImage;
import com.yandex.div2.DivImageScale;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivGifImageBinder.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 &2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002&'B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ0\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014H\u0002J,\u0010\u0018\u001a\u00020\u000f*\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J&\u0010\u001e\u001a\u00020\u000f*\u00020\u00042\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u0003H\u0014J\u0014\u0010\"\u001a\u00020\u000f*\u00020\u00042\u0006\u0010#\u001a\u00020$H\u0003J0\u0010%\u001a\u00020\u000f*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/yandex/div/core/view2/divs/DivGifImageBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lcom/yandex/div2/Div$GifImage;", "Lcom/yandex/div2/DivGifImage;", "Lcom/yandex/div/core/view2/divs/widgets/DivGifImageView;", "baseBinder", "Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "imageLoader", "Lcom/yandex/div/core/images/DivImageLoader;", "placeholderLoader", "Lcom/yandex/div/core/view2/DivPlaceholderLoader;", "errorCollectors", "Lcom/yandex/div/core/view2/errors/ErrorCollectors;", "(Lcom/yandex/div/core/view2/divs/DivBaseBinder;Lcom/yandex/div/core/images/DivImageLoader;Lcom/yandex/div/core/view2/DivPlaceholderLoader;Lcom/yandex/div/core/view2/errors/ErrorCollectors;)V", "applyContentAlignment", "", "Lcom/yandex/div/internal/widget/AspectImageView;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "horizontalAlignment", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div2/DivAlignmentHorizontal;", "verticalAlignment", "Lcom/yandex/div2/DivAlignmentVertical;", "applyGifImage", "divView", "Lcom/yandex/div/core/view2/Div2View;", "div", "errorCollector", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", "bind", "bindingContext", "Lcom/yandex/div/core/view2/BindingContext;", "oldDiv", "loadDrawable", "cachedBitmap", "Lcom/yandex/div/core/images/CachedBitmap;", "observeContentAlignment", "Companion", "LoadDrawableOnPostPTask", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@DivScope
/* loaded from: classes9.dex */
public final class DivGifImageBinder extends DivViewBinder<Div.GifImage, DivGifImage, DivGifImageView> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String TAG = "DivGifImageBinder";

    @NotNull
    private final ErrorCollectors errorCollectors;

    @NotNull
    private final DivImageLoader imageLoader;

    @NotNull
    private final DivPlaceholderLoader placeholderLoader;

    public DivGifImageBinder(@NotNull DivBaseBinder divBaseBinder, @NotNull DivImageLoader divImageLoader, @NotNull DivPlaceholderLoader divPlaceholderLoader, @NotNull ErrorCollectors errorCollectors) {
        super(divBaseBinder);
        this.imageLoader = divImageLoader;
        this.placeholderLoader = divPlaceholderLoader;
        this.errorCollectors = errorCollectors;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(@NotNull final DivGifImageView divGifImageView, @NotNull BindingContext bindingContext, @NotNull final DivGifImage divGifImage, @Nullable DivGifImage divGifImage2) {
        final Div2View divView = bindingContext.getDivView();
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        final ErrorCollector orCreate = this.errorCollectors.getOrCreate(divView.getDataTag(), divView.getDivData());
        BaseDivViewExtensionsKt.applyDivActions(divGifImageView, bindingContext, divGifImage.action, divGifImage.actions, divGifImage.longtapActions, divGifImage.doubletapActions, divGifImage.hoverStartActions, divGifImage.hoverEndActions, divGifImage.pressStartActions, divGifImage.pressEndActions, divGifImage.actionAnimation, divGifImage.captureFocusOnAction);
        BaseDivViewExtensionsKt.bindAspectRatio(divGifImageView, divGifImage.aspect, divGifImage2 != null ? divGifImage2.aspect : null, expressionResolver);
        divGifImageView.addSubscription(divGifImage.scale.observeAndGet(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivGifImageBinder$bind$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DivImageScale) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull DivImageScale divImageScale) {
                DivGifImageView.this.setImageScale(DivUtilKt.toImageScale(divImageScale));
            }
        }));
        observeContentAlignment(divGifImageView, expressionResolver, divGifImage.contentAlignmentHorizontal, divGifImage.contentAlignmentVertical);
        divGifImageView.addSubscription(divGifImage.gifUrl.observeAndGet(expressionResolver, new Function1() { // from class: com.yandex.div.core.view2.divs.DivGifImageBinder$bind$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Uri) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Uri uri) {
                DivGifImageBinder.this.applyGifImage(divGifImageView, divView, expressionResolver, divGifImage, orCreate);
            }
        }));
    }

    private final void observeContentAlignment(final DivGifImageView divGifImageView, final ExpressionResolver expressionResolver, final Expression<DivAlignmentHorizontal> expression, final Expression<DivAlignmentVertical> expression2) {
        applyContentAlignment(divGifImageView, expressionResolver, expression, expression2);
        Function1 function1 = new Function1() { // from class: com.yandex.div.core.view2.divs.DivGifImageBinder$observeContentAlignment$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m7192invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7192invoke(@NotNull Object obj) {
                DivGifImageBinder.this.applyContentAlignment(divGifImageView, expressionResolver, expression, expression2);
            }
        };
        divGifImageView.addSubscription(expression.observe(expressionResolver, function1));
        divGifImageView.addSubscription(expression2.observe(expressionResolver, function1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyContentAlignment(AspectImageView aspectImageView, ExpressionResolver expressionResolver, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2) {
        aspectImageView.setGravity(DivUtilKt.evaluateGravity(expression.evaluate(expressionResolver), expression2.evaluate(expressionResolver)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyGifImage(final DivGifImageView divGifImageView, final Div2View div2View, ExpressionResolver expressionResolver, DivGifImage divGifImage, ErrorCollector errorCollector) {
        Uri uri = (Uri) divGifImage.gifUrl.evaluate(expressionResolver);
        if (Intrinsics.areEqual(uri, divGifImageView.getGifUrl())) {
            return;
        }
        divGifImageView.resetImageLoaded();
        LoadReference loadReference = divGifImageView.getLoadReference();
        if (loadReference != null) {
            loadReference.cancel();
        }
        DivPlaceholderLoader divPlaceholderLoader = this.placeholderLoader;
        Expression expression = divGifImage.preview;
        divPlaceholderLoader.applyPlaceholder(divGifImageView, errorCollector, expression != null ? (String) expression.evaluate(expressionResolver) : null, ((Number) divGifImage.placeholderColor.evaluate(expressionResolver)).intValue(), false, new Function1() { // from class: com.yandex.div.core.view2.divs.DivGifImageBinder$applyGifImage$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Drawable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Drawable drawable) {
                if (DivGifImageView.this.isImageLoaded() || DivGifImageView.this.isImagePreview()) {
                    return;
                }
                DivGifImageView.this.setPlaceholder(drawable);
            }
        }, new Function1() { // from class: com.yandex.div.core.view2.divs.DivGifImageBinder$applyGifImage$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ImageRepresentation) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull ImageRepresentation imageRepresentation) {
                if (DivGifImageView.this.isImageLoaded()) {
                    return;
                }
                if (imageRepresentation instanceof ImageRepresentation.Bitmap) {
                    DivGifImageView.this.setPreview(((ImageRepresentation.Bitmap) imageRepresentation).m7143unboximpl());
                } else if (imageRepresentation instanceof ImageRepresentation.PictureDrawable) {
                    DivGifImageView.this.setPreview(((ImageRepresentation.PictureDrawable) imageRepresentation).m7150unboximpl());
                }
                DivGifImageView.this.previewLoaded();
            }
        });
        divGifImageView.setGifUrl$div_release(uri);
        LoadReference loadImageBytes = this.imageLoader.loadImageBytes(uri.toString(), new DivIdLoggingImageDownloadCallback(div2View) { // from class: com.yandex.div.core.view2.divs.DivGifImageBinder$applyGifImage$reference$1
            @Override // com.yandex.div.core.images.DivImageDownloadCallback
            public void onSuccess(@NotNull CachedBitmap cachedBitmap) {
                super.onSuccess(cachedBitmap);
                if (Build.VERSION.SDK_INT >= 28) {
                    this.loadDrawable(divGifImageView, cachedBitmap);
                } else {
                    divGifImageView.setImage(cachedBitmap.getBitmap());
                    divGifImageView.imageLoaded();
                }
            }

            @Override // com.yandex.div.core.images.DivImageDownloadCallback
            public void onSuccess(@NotNull Drawable drawable) {
                super.onSuccess(drawable);
                divGifImageView.setImage(drawable);
                divGifImageView.imageLoaded();
            }

            @Override // com.yandex.div.core.images.DivImageDownloadCallback
            public void onError() {
                super.onError();
                divGifImageView.setGifUrl$div_release(null);
            }
        });
        div2View.addLoadReference(loadImageBytes, divGifImageView);
        divGifImageView.setLoadReference$div_release(loadImageBytes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi
    public final void loadDrawable(DivGifImageView divGifImageView, CachedBitmap cachedBitmap) {
        new LoadDrawableOnPostPTask(new WeakReference(divGifImageView), cachedBitmap).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* compiled from: DivGifImageBinder.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u000e\u001a\u00020\u0003H\u0002J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J'\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0016\u0010\u0012\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0013\"\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0002\u0010\u0014J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivGifImageBinder$LoadDrawableOnPostPTask;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "Landroid/graphics/drawable/Drawable;", "view", "Ljava/lang/ref/WeakReference;", "Lcom/yandex/div/core/view2/divs/widgets/DivGifImageView;", "cachedBitmap", "Lcom/yandex/div/core/images/CachedBitmap;", "(Ljava/lang/ref/WeakReference;Lcom/yandex/div/core/images/CachedBitmap;)V", "getCachedBitmap", "()Lcom/yandex/div/core/images/CachedBitmap;", "getView", "()Ljava/lang/ref/WeakReference;", "createDrawableFromBytes", "createSourceFromUri", "Landroid/graphics/ImageDecoder$Source;", "doInBackground", "params", "", "([Ljava/lang/Void;)Landroid/graphics/drawable/Drawable;", "onPostExecute", "", "result", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RequiresApi
    public static final class LoadDrawableOnPostPTask extends AsyncTask<Void, Void, Drawable> {

        @NotNull
        private final CachedBitmap cachedBitmap;

        @NotNull
        private final WeakReference<DivGifImageView> view;

        @NotNull
        public final WeakReference<DivGifImageView> getView() {
            return this.view;
        }

        @NotNull
        public final CachedBitmap getCachedBitmap() {
            return this.cachedBitmap;
        }

        public LoadDrawableOnPostPTask(@NotNull WeakReference<DivGifImageView> weakReference, @NotNull CachedBitmap cachedBitmap) {
            this.view = weakReference;
            this.cachedBitmap = cachedBitmap;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
        @Override // android.os.AsyncTask
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Drawable doInBackground(@NotNull Void... params) {
            ImageDecoder.Source createSourceFromUri;
            Drawable decodeDrawable;
            try {
                return createDrawableFromBytes();
            } catch (IOException e) {
                KLog kLog = KLog.INSTANCE;
                if (kLog.isAtLeast(Severity.ERROR)) {
                    kLog.print(6, DivGifImageBinder.TAG, "Failed writing bytes to temp file, exception: " + e.getMessage());
                }
                createSourceFromUri = createSourceFromUri();
                if (createSourceFromUri != null) {
                    return null;
                }
                try {
                    decodeDrawable = ImageDecoder.decodeDrawable(createSourceFromUri);
                    return decodeDrawable;
                } catch (IOException e2) {
                    KLog kLog2 = KLog.INSTANCE;
                    if (!kLog2.isAtLeast(Severity.ERROR)) {
                        return null;
                    }
                    kLog2.print(6, DivGifImageBinder.TAG, "Decode drawable from uri exception " + e2.getMessage());
                    return null;
                }
            } catch (IllegalStateException e3) {
                KLog kLog3 = KLog.INSTANCE;
                if (kLog3.isAtLeast(Severity.ERROR)) {
                    kLog3.print(6, DivGifImageBinder.TAG, "Failed create drawable from bytes, exception: " + e3.getMessage());
                }
                createSourceFromUri = createSourceFromUri();
                if (createSourceFromUri != null) {
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(@Nullable Drawable result) {
            super.onPostExecute((LoadDrawableOnPostPTask) result);
            if (result != null && fs$$ExternalSyntheticApiModelOutline0.m(result)) {
                DivGifImageView divGifImageView = this.view.get();
                if (divGifImageView != null) {
                    divGifImageView.setImage(result);
                }
            } else {
                DivGifImageView divGifImageView2 = this.view.get();
                if (divGifImageView2 != null) {
                    divGifImageView2.setImage(this.cachedBitmap.getBitmap());
                }
            }
            DivGifImageView divGifImageView3 = this.view.get();
            if (divGifImageView3 != null) {
                divGifImageView3.imageLoaded();
            }
        }

        private final Drawable createDrawableFromBytes() throws IOException, IllegalStateException {
            Context context;
            ImageDecoder.Source createSource;
            Drawable decodeDrawable;
            byte[] bytes = this.cachedBitmap.getBytes();
            if (bytes == null) {
                throw new IllegalStateException("no bytes stored in cached bitmap");
            }
            DivGifImageView divGifImageView = this.view.get();
            if (divGifImageView == null || (context = divGifImageView.getContext()) == null) {
                throw new IllegalStateException("failed retrieve context");
            }
            File createTempFile = File.createTempFile("if_u_see_me_in_file_system_plz_report", ".gif", context.getCacheDir());
            try {
                FilesKt.writeBytes(createTempFile, bytes);
                createSource = ImageDecoder.createSource(createTempFile);
                decodeDrawable = ImageDecoder.decodeDrawable(createSource);
                return decodeDrawable;
            } finally {
                createTempFile.delete();
            }
        }

        private final ImageDecoder.Source createSourceFromUri() {
            ImageDecoder.Source createSource;
            Uri cacheUri = this.cachedBitmap.getCacheUri();
            String path = cacheUri != null ? cacheUri.getPath() : null;
            if (path != null) {
                try {
                    createSource = ImageDecoder.createSource(new File(path));
                    return createSource;
                } catch (IOException e) {
                    if (!KLog.INSTANCE.isAtLeast(Severity.ERROR)) {
                        return null;
                    }
                    Log.e(DivGifImageBinder.TAG, "", e);
                    return null;
                }
            }
            KLog kLog = KLog.INSTANCE;
            if (!kLog.isAtLeast(Severity.ERROR)) {
                return null;
            }
            kLog.print(6, DivGifImageBinder.TAG, "No bytes or file in cache to decode gif drawable");
            return null;
        }
    }

    /* compiled from: DivGifImageBinder.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivGifImageBinder$Companion;", "", "()V", "TAG", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
