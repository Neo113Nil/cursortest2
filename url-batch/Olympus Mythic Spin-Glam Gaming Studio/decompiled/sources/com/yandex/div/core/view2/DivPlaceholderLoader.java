package com.yandex.div.core.view2;

import androidx.annotation.MainThread;
import com.yandex.div.core.DecodeBase64ImageTask;
import com.yandex.div.core.Div2ImageStubProvider;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.util.ImageRepresentation;
import com.yandex.div.core.view2.divs.widgets.LoadableImage;
import com.yandex.div.core.view2.errors.ErrorCollector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivPlaceholderLoader.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0011\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\\\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\b0\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\b0\u0014H\u0017J6\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0014\u0010\u001b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\b0\u0014H\u0012J0\u0010\u001c\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001d*\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0014\u0010\u001b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\b0\u0014H\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/yandex/div/core/view2/DivPlaceholderLoader;", "", "imageStubProvider", "Lcom/yandex/div/core/Div2ImageStubProvider;", "executorService", "Ljava/util/concurrent/ExecutorService;", "(Lcom/yandex/div/core/Div2ImageStubProvider;Ljava/util/concurrent/ExecutorService;)V", "applyPlaceholder", "", "imageView", "Lcom/yandex/div/core/view2/divs/widgets/LoadableImage;", "errorCollector", "Lcom/yandex/div/core/view2/errors/ErrorCollector;", "currentPreview", "", "currentPlaceholderColor", "", "synchronous", "", "onSetPlaceholder", "Lkotlin/Function1;", "Landroid/graphics/drawable/Drawable;", "onSetPreview", "Lcom/yandex/div/core/util/ImageRepresentation;", "enqueueDecoding", "preview", "loadableImage", "onDecoded", "decodeBase64", "Ljava/util/concurrent/Future;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@DivScope
/* loaded from: classes8.dex */
public class DivPlaceholderLoader {

    @NotNull
    private final ExecutorService executorService;

    @NotNull
    private final Div2ImageStubProvider imageStubProvider;

    public DivPlaceholderLoader(@NotNull Div2ImageStubProvider div2ImageStubProvider, @NotNull ExecutorService executorService) {
        this.imageStubProvider = div2ImageStubProvider;
        this.executorService = executorService;
    }

    @MainThread
    public void applyPlaceholder(@NotNull LoadableImage imageView, @NotNull final ErrorCollector errorCollector, @Nullable String currentPreview, final int currentPlaceholderColor, boolean synchronous, @NotNull final Function1 onSetPlaceholder, @NotNull final Function1 onSetPreview) {
        Unit unit;
        if (currentPreview != null) {
            enqueueDecoding(currentPreview, imageView, synchronous, new Function1() { // from class: com.yandex.div.core.view2.DivPlaceholderLoader$applyPlaceholder$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((ImageRepresentation) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable ImageRepresentation imageRepresentation) {
                    Div2ImageStubProvider div2ImageStubProvider;
                    if (imageRepresentation == null) {
                        ErrorCollector.this.logWarning(new Throwable("Preview doesn't contain base64 image"));
                        Function1 function1 = onSetPlaceholder;
                        div2ImageStubProvider = this.imageStubProvider;
                        function1.invoke(div2ImageStubProvider.getImageStubDrawable(currentPlaceholderColor));
                        return;
                    }
                    onSetPreview.invoke(imageRepresentation);
                }
            });
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            onSetPlaceholder.invoke(this.imageStubProvider.getImageStubDrawable(currentPlaceholderColor));
        }
    }

    private void enqueueDecoding(String preview, final LoadableImage loadableImage, boolean synchronous, final Function1 onDecoded) {
        Future<?> loadingTask = loadableImage.getLoadingTask();
        if (loadingTask != null) {
            loadingTask.cancel(true);
        }
        Future<?> decodeBase64 = decodeBase64(preview, synchronous, new Function1() { // from class: com.yandex.div.core.view2.DivPlaceholderLoader$enqueueDecoding$future$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ImageRepresentation) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable ImageRepresentation imageRepresentation) {
                Function1.this.invoke(imageRepresentation);
                loadableImage.cleanLoadingTask();
            }
        });
        if (decodeBase64 != null) {
            loadableImage.saveLoadingTask(decodeBase64);
        }
    }

    private Future<?> decodeBase64(String str, boolean z, Function1 function1) {
        DecodeBase64ImageTask decodeBase64ImageTask = new DecodeBase64ImageTask(str, z, function1);
        if (z) {
            decodeBase64ImageTask.run();
            return null;
        }
        return this.executorService.submit(decodeBase64ImageTask);
    }
}
