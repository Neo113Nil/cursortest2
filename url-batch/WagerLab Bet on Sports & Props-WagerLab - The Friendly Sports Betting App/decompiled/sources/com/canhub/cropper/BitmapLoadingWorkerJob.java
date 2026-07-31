package com.canhub.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;

/* compiled from: BitmapLoadingWorkerJob.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001fB!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0082@¢\u0006\u0002\u0010\u001dJ\u0006\u0010\u001e\u001a\u00020\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00050\u00050\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006 "}, d2 = {"Lcom/canhub/cropper/BitmapLoadingWorkerJob;", "Lkotlinx/coroutines/CoroutineScope;", "context", "Landroid/content/Context;", "cropImageView", "Lcom/canhub/cropper/CropImageView;", "uri", "Landroid/net/Uri;", "<init>", "(Landroid/content/Context;Lcom/canhub/cropper/CropImageView;Landroid/net/Uri;)V", "getUri$cropper_release", "()Landroid/net/Uri;", "width", "", "height", "cropImageViewReference", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "job", "Lkotlinx/coroutines/Job;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "start", "", "onPostExecute", "result", "Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;", "(Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancel", "Result", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BitmapLoadingWorkerJob implements CoroutineScope {
    private final Context context;
    private final WeakReference<CropImageView> cropImageViewReference;
    private final int height;
    private Job job;
    private final Uri uri;
    private final int width;

    public BitmapLoadingWorkerJob(Context context, CropImageView cropImageView, Uri uri) {
        CompletableJob Job$default;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cropImageView, "cropImageView");
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.context = context;
        this.uri = uri;
        this.cropImageViewReference = new WeakReference<>(cropImageView);
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.job = Job$default;
        double d = cropImageView.getResources().getDisplayMetrics().density > 1.0f ? 1.0d / r3.density : 1.0d;
        this.width = (int) (r3.widthPixels * d);
        this.height = (int) (r3.heightPixels * d);
    }

    /* renamed from: getUri$cropper_release, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return Dispatchers.getMain().plus(this.job);
    }

    public final void start() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getDefault(), null, new BitmapLoadingWorkerJob$start$1(this, null), 2, null);
        this.job = launch$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onPostExecute(Result result, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getMain(), new BitmapLoadingWorkerJob$onPostExecute$2(this, result, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    public final void cancel() {
        Job.DefaultImpls.cancel$default(this.job, (CancellationException) null, 1, (Object) null);
    }

    /* compiled from: BitmapLoadingWorkerJob.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\f\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J\u0016\u0010$\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\rHÆ\u0003¢\u0006\u0002\u0010\u001cJ^\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\rHÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020\n2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0007HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u001b\u0010\f\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\r¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001c¨\u0006,"}, d2 = {"Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;", "", "uri", "Landroid/net/Uri;", "bitmap", "Landroid/graphics/Bitmap;", "loadSampleSize", "", "degreesRotated", "flipHorizontally", "", "flipVertically", "error", "Lkotlin/Exception;", "Ljava/lang/Exception;", "<init>", "(Landroid/net/Uri;Landroid/graphics/Bitmap;IIZZLjava/lang/Exception;)V", "getUri", "()Landroid/net/Uri;", "getBitmap", "()Landroid/graphics/Bitmap;", "getLoadSampleSize", "()I", "getDegreesRotated", "getFlipHorizontally", "()Z", "getFlipVertically", "getError", "()Ljava/lang/Exception;", "Ljava/lang/Exception;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Landroid/net/Uri;Landroid/graphics/Bitmap;IIZZLjava/lang/Exception;)Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Result {
        private final Bitmap bitmap;
        private final int degreesRotated;
        private final Exception error;
        private final boolean flipHorizontally;
        private final boolean flipVertically;
        private final int loadSampleSize;
        private final Uri uri;

        public static /* synthetic */ Result copy$default(Result result, Uri uri, Bitmap bitmap, int i, int i2, boolean z, boolean z2, Exception exc, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                uri = result.uri;
            }
            if ((i3 & 2) != 0) {
                bitmap = result.bitmap;
            }
            if ((i3 & 4) != 0) {
                i = result.loadSampleSize;
            }
            if ((i3 & 8) != 0) {
                i2 = result.degreesRotated;
            }
            if ((i3 & 16) != 0) {
                z = result.flipHorizontally;
            }
            if ((i3 & 32) != 0) {
                z2 = result.flipVertically;
            }
            if ((i3 & 64) != 0) {
                exc = result.error;
            }
            boolean z3 = z2;
            Exception exc2 = exc;
            boolean z4 = z;
            int i4 = i;
            return result.copy(uri, bitmap, i4, i2, z4, z3, exc2);
        }

        /* renamed from: component1, reason: from getter */
        public final Uri getUri() {
            return this.uri;
        }

        /* renamed from: component2, reason: from getter */
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        /* renamed from: component3, reason: from getter */
        public final int getLoadSampleSize() {
            return this.loadSampleSize;
        }

        /* renamed from: component4, reason: from getter */
        public final int getDegreesRotated() {
            return this.degreesRotated;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getFlipHorizontally() {
            return this.flipHorizontally;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getFlipVertically() {
            return this.flipVertically;
        }

        /* renamed from: component7, reason: from getter */
        public final Exception getError() {
            return this.error;
        }

        public final Result copy(Uri uri, Bitmap bitmap, int loadSampleSize, int degreesRotated, boolean flipHorizontally, boolean flipVertically, Exception error) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            return new Result(uri, bitmap, loadSampleSize, degreesRotated, flipHorizontally, flipVertically, error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return Intrinsics.areEqual(this.uri, result.uri) && Intrinsics.areEqual(this.bitmap, result.bitmap) && this.loadSampleSize == result.loadSampleSize && this.degreesRotated == result.degreesRotated && this.flipHorizontally == result.flipHorizontally && this.flipVertically == result.flipVertically && Intrinsics.areEqual(this.error, result.error);
        }

        public int hashCode() {
            int hashCode = this.uri.hashCode() * 31;
            Bitmap bitmap = this.bitmap;
            int hashCode2 = (((((((((hashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + Integer.hashCode(this.loadSampleSize)) * 31) + Integer.hashCode(this.degreesRotated)) * 31) + Boolean.hashCode(this.flipHorizontally)) * 31) + Boolean.hashCode(this.flipVertically)) * 31;
            Exception exc = this.error;
            return hashCode2 + (exc != null ? exc.hashCode() : 0);
        }

        public String toString() {
            return "Result(uri=" + this.uri + ", bitmap=" + this.bitmap + ", loadSampleSize=" + this.loadSampleSize + ", degreesRotated=" + this.degreesRotated + ", flipHorizontally=" + this.flipHorizontally + ", flipVertically=" + this.flipVertically + ", error=" + this.error + ")";
        }

        public Result(Uri uri, Bitmap bitmap, int i, int i2, boolean z, boolean z2, Exception exc) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.uri = uri;
            this.bitmap = bitmap;
            this.loadSampleSize = i;
            this.degreesRotated = i2;
            this.flipHorizontally = z;
            this.flipVertically = z2;
            this.error = exc;
        }

        public final Uri getUri() {
            return this.uri;
        }

        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        public final int getLoadSampleSize() {
            return this.loadSampleSize;
        }

        public final int getDegreesRotated() {
            return this.degreesRotated;
        }

        public final boolean getFlipHorizontally() {
            return this.flipHorizontally;
        }

        public final boolean getFlipVertically() {
            return this.flipVertically;
        }

        public final Exception getError() {
            return this.error;
        }
    }
}
