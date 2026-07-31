package com.canhub.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.canhub.cropper.CropImageView;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
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

/* compiled from: BitmapCroppingWorkerJob.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001.B«\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u000e\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001f\u0010 J\u0006\u0010'\u001a\u00020(J\u0016\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020+H\u0082@¢\u0006\u0002\u0010,J\u0006\u0010-\u001a\u00020(R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006/"}, d2 = {"Lcom/canhub/cropper/BitmapCroppingWorkerJob;", "Lkotlinx/coroutines/CoroutineScope;", "context", "Landroid/content/Context;", "cropImageViewReference", "Ljava/lang/ref/WeakReference;", "Lcom/canhub/cropper/CropImageView;", "uri", "Landroid/net/Uri;", "bitmap", "Landroid/graphics/Bitmap;", "cropPoints", "", "degreesRotated", "", "orgWidth", "orgHeight", "fixAspectRatio", "", "aspectRatioX", "aspectRatioY", "reqWidth", "reqHeight", "flipHorizontally", "flipVertically", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "Lcom/canhub/cropper/CropImageView$RequestSizeOptions;", "saveCompressFormat", "Landroid/graphics/Bitmap$CompressFormat;", "saveCompressQuality", "customOutputUri", "<init>", "(Landroid/content/Context;Ljava/lang/ref/WeakReference;Landroid/net/Uri;Landroid/graphics/Bitmap;[FIIIZIIIIZZLcom/canhub/cropper/CropImageView$RequestSizeOptions;Landroid/graphics/Bitmap$CompressFormat;ILandroid/net/Uri;)V", "job", "Lkotlinx/coroutines/Job;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "start", "", "onPostExecute", "result", "Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;", "(Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancel", "Result", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BitmapCroppingWorkerJob implements CoroutineScope {
    private final int aspectRatioX;
    private final int aspectRatioY;
    private final Bitmap bitmap;
    private final Context context;
    private final WeakReference<CropImageView> cropImageViewReference;
    private final float[] cropPoints;
    private final Uri customOutputUri;
    private final int degreesRotated;
    private final boolean fixAspectRatio;
    private final boolean flipHorizontally;
    private final boolean flipVertically;
    private Job job;
    private final CropImageView.RequestSizeOptions options;
    private final int orgHeight;
    private final int orgWidth;
    private final int reqHeight;
    private final int reqWidth;
    private final Bitmap.CompressFormat saveCompressFormat;
    private final int saveCompressQuality;
    private final Uri uri;

    public BitmapCroppingWorkerJob(Context context, WeakReference<CropImageView> cropImageViewReference, Uri uri, Bitmap bitmap, float[] cropPoints, int i, int i2, int i3, boolean z, int i4, int i5, int i6, int i7, boolean z2, boolean z3, CropImageView.RequestSizeOptions options, Bitmap.CompressFormat saveCompressFormat, int i8, Uri uri2) {
        CompletableJob Job$default;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cropImageViewReference, "cropImageViewReference");
        Intrinsics.checkNotNullParameter(cropPoints, "cropPoints");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(saveCompressFormat, "saveCompressFormat");
        this.context = context;
        this.cropImageViewReference = cropImageViewReference;
        this.uri = uri;
        this.bitmap = bitmap;
        this.cropPoints = cropPoints;
        this.degreesRotated = i;
        this.orgWidth = i2;
        this.orgHeight = i3;
        this.fixAspectRatio = z;
        this.aspectRatioX = i4;
        this.aspectRatioY = i5;
        this.reqWidth = i6;
        this.reqHeight = i7;
        this.flipHorizontally = z2;
        this.flipVertically = z3;
        this.options = options;
        this.saveCompressFormat = saveCompressFormat;
        this.saveCompressQuality = i8;
        this.customOutputUri = uri2;
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.job = Job$default;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return Dispatchers.getMain().plus(this.job);
    }

    public final void start() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getDefault(), null, new BitmapCroppingWorkerJob$start$1(this, null), 2, null);
        this.job = launch$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onPostExecute(Result result, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getMain(), new BitmapCroppingWorkerJob$onPostExecute$2(this, result, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    public final void cancel() {
        Job.DefaultImpls.cancel$default(this.job, (CancellationException) null, 1, (Object) null);
    }

    /* compiled from: BitmapCroppingWorkerJob.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0016\u0010\u0018\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u0019\u001a\u00020\nHÆ\u0003JB\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\nHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0006\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;", "", "bitmap", "Landroid/graphics/Bitmap;", "uri", "Landroid/net/Uri;", "error", "Lkotlin/Exception;", "Ljava/lang/Exception;", "sampleSize", "", "<init>", "(Landroid/graphics/Bitmap;Landroid/net/Uri;Ljava/lang/Exception;I)V", "getBitmap", "()Landroid/graphics/Bitmap;", "getUri", "()Landroid/net/Uri;", "getError", "()Ljava/lang/Exception;", "Ljava/lang/Exception;", "getSampleSize", "()I", "component1", "component2", "component3", "component4", "copy", "(Landroid/graphics/Bitmap;Landroid/net/Uri;Ljava/lang/Exception;I)Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Result {
        private final Bitmap bitmap;
        private final Exception error;
        private final int sampleSize;
        private final Uri uri;

        public static /* synthetic */ Result copy$default(Result result, Bitmap bitmap, Uri uri, Exception exc, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                bitmap = result.bitmap;
            }
            if ((i2 & 2) != 0) {
                uri = result.uri;
            }
            if ((i2 & 4) != 0) {
                exc = result.error;
            }
            if ((i2 & 8) != 0) {
                i = result.sampleSize;
            }
            return result.copy(bitmap, uri, exc, i);
        }

        /* renamed from: component1, reason: from getter */
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        /* renamed from: component2, reason: from getter */
        public final Uri getUri() {
            return this.uri;
        }

        /* renamed from: component3, reason: from getter */
        public final Exception getError() {
            return this.error;
        }

        /* renamed from: component4, reason: from getter */
        public final int getSampleSize() {
            return this.sampleSize;
        }

        public final Result copy(Bitmap bitmap, Uri uri, Exception error, int sampleSize) {
            return new Result(bitmap, uri, error, sampleSize);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return Intrinsics.areEqual(this.bitmap, result.bitmap) && Intrinsics.areEqual(this.uri, result.uri) && Intrinsics.areEqual(this.error, result.error) && this.sampleSize == result.sampleSize;
        }

        public int hashCode() {
            Bitmap bitmap = this.bitmap;
            int hashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
            Uri uri = this.uri;
            int hashCode2 = (hashCode + (uri == null ? 0 : uri.hashCode())) * 31;
            Exception exc = this.error;
            return ((hashCode2 + (exc != null ? exc.hashCode() : 0)) * 31) + Integer.hashCode(this.sampleSize);
        }

        public String toString() {
            return "Result(bitmap=" + this.bitmap + ", uri=" + this.uri + ", error=" + this.error + ", sampleSize=" + this.sampleSize + ")";
        }

        public Result(Bitmap bitmap, Uri uri, Exception exc, int i) {
            this.bitmap = bitmap;
            this.uri = uri;
            this.error = exc;
            this.sampleSize = i;
        }

        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        public final Uri getUri() {
            return this.uri;
        }

        public final Exception getError() {
            return this.error;
        }

        public final int getSampleSize() {
            return this.sampleSize;
        }
    }
}
