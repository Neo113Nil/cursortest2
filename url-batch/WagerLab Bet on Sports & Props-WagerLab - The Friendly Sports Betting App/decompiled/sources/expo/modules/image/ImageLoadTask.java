package expo.modules.image;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import expo.modules.image.records.ImageLoadOptions;
import expo.modules.image.records.SourceMap;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.exception.Exceptions;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* compiled from: ImageLoadTask.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\n\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lexpo/modules/image/ImageLoadTask;", "", "appContext", "Lexpo/modules/kotlin/AppContext;", "source", "Lexpo/modules/image/records/SourceMap;", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "Lexpo/modules/image/records/ImageLoadOptions;", "<init>", "(Lexpo/modules/kotlin/AppContext;Lexpo/modules/image/records/SourceMap;Lexpo/modules/image/records/ImageLoadOptions;)V", "load", "Lexpo/modules/image/Image;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public class ImageLoadTask {
    private final AppContext appContext;
    private final ImageLoadOptions options;
    private final SourceMap source;

    public ImageLoadTask(AppContext appContext, SourceMap source, ImageLoadOptions options) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(options, "options");
        this.appContext = appContext;
        this.source = source;
        this.options = options;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object load(Continuation<? super Image> continuation) {
        ImageLoadTask$load$1 imageLoadTask$load$1;
        int i;
        try {
            if (continuation instanceof ImageLoadTask$load$1) {
                imageLoadTask$load$1 = (ImageLoadTask$load$1) continuation;
                if ((imageLoadTask$load$1.label & Integer.MIN_VALUE) != 0) {
                    imageLoadTask$load$1.label -= Integer.MIN_VALUE;
                    Object obj = imageLoadTask$load$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = imageLoadTask$load$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Context reactContext = this.appContext.getReactContext();
                        if (reactContext == null) {
                            throw new Exceptions.ReactContextLost();
                        }
                        GlideModelProvider createGlideModelProvider = this.source.createGlideModelProvider(reactContext);
                        Object glideModel = createGlideModelProvider != null ? createGlideModelProvider.getGlideModel() : null;
                        CoroutineDispatcher io2 = Dispatchers.getIO();
                        ImageLoadTask$load$bitmap$1 imageLoadTask$load$bitmap$1 = new ImageLoadTask$load$bitmap$1(reactContext, glideModel, this, null);
                        imageLoadTask$load$1.label = 1;
                        obj = BuildersKt.withContext(io2, imageLoadTask$load$bitmap$1, imageLoadTask$load$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    Drawable drawable = (Drawable) obj;
                    Intrinsics.checkNotNull(drawable);
                    return new Image(drawable);
                }
            }
            if (i != 0) {
            }
            Drawable drawable2 = (Drawable) obj;
            Intrinsics.checkNotNull(drawable2);
            return new Image(drawable2);
        } catch (Exception e) {
            throw new ImageLoadFailed(e);
        }
        imageLoadTask$load$1 = new ImageLoadTask$load$1(this, continuation);
        Object obj2 = imageLoadTask$load$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = imageLoadTask$load$1.label;
    }
}
