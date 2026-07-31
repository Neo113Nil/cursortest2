package io.bidmachine.nativead;

import android.content.Context;
import android.net.Uri;
import io.bidmachine.AdProcessCallback;
import io.bidmachine.ImageData;
import io.bidmachine.MediaAssetType;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.iab.vast.VastRequest;
import io.bidmachine.internal.C6012g;
import io.bidmachine.nativead.tasks.DownloadImageTask;
import io.bidmachine.nativead.tasks.DownloadVastVideoTask;
import io.bidmachine.nativead.tasks.DownloadVideoTask;
import io.bidmachine.nativead.utils.NativeNetworkExecutor;
import io.bidmachine.rendering.Rendering;
import io.bidmachine.rendering.Repository;
import io.bidmachine.util.file.FileUtilsKt;
import io.bidmachine.utils.BMError;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0004\b\u0000\u0018\u0000 @2\u00020\u0001:\u0001@B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J-\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000f0\u0017H\u0002¢\u0006\u0004\b\u0014\u0010\u001aJ!\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b \u0010\u001eJ!\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u000fH\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u000fH\u0002¢\u0006\u0004\b*\u0010)J\u000f\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020+H\u0002¢\u0006\u0004\b.\u0010-J\u000f\u0010/\u001a\u00020+H\u0002¢\u0006\u0004\b/\u0010-J\u000f\u00100\u001a\u00020+H\u0002¢\u0006\u0004\b0\u0010-J\u0015\u00101\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b1\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00102R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00103R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00104R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00105R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00106R\u001b\u0010<\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020$0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006A"}, d2 = {"Lio/bidmachine/nativead/AssetLoader;", "", "Landroid/content/Context;", "context", "assetsHolder", "Lio/bidmachine/nativead/NativeAdRequestParameters;", "adRequestParameters", "Lio/bidmachine/AdProcessCallback;", "callback", "Lio/bidmachine/nativead/NativeData;", "nativeData", "Lio/bidmachine/nativead/NativeMediaPrivateData;", "nativeMediaData", "<init>", "(Landroid/content/Context;Ljava/lang/Object;Lio/bidmachine/nativead/NativeAdRequestParameters;Lio/bidmachine/AdProcessCallback;Lio/bidmachine/nativead/NativeData;Lio/bidmachine/nativead/NativeMediaPrivateData;)V", "", "startDownloadTask", "(Landroid/content/Context;)V", "Lio/bidmachine/ImageData;", "imageData", "createImageTask", "(Lio/bidmachine/ImageData;)V", "createIconTask", "Lkotlin/Function1;", "Landroid/net/Uri;", "onSuccess", "(Lio/bidmachine/ImageData;Lkotlin/jvm/functions/Function1;)V", "", "url", "createVideoTask", "(Landroid/content/Context;Ljava/lang/String;)V", "vastVideoAdm", "createVastVideoTask", "videoFileUri", "retrieveAndSaveImageFrame", "(Landroid/content/Context;Landroid/net/Uri;)V", "Ljava/lang/Runnable;", "task", "removePendingTask", "(Ljava/lang/Runnable;)V", "checkTasksCount", "()V", "notifyNativeCallback", "", "isAssetsValid", "()Z", "isIconValid", "isImageValid", "isVideoValid", "downloadNativeAdsImages", "Ljava/lang/Object;", "Lio/bidmachine/nativead/NativeAdRequestParameters;", "Lio/bidmachine/AdProcessCallback;", "Lio/bidmachine/nativead/NativeData;", "Lio/bidmachine/nativead/NativeMediaPrivateData;", "Lio/bidmachine/rendering/Repository;", "repository$delegate", "Lkotlin/Lazy;", "getRepository", "()Lio/bidmachine/rendering/Repository;", "repository", "", "pendingTasks", "Ljava/util/List;", "Companion", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AssetLoader {

    @NotNull
    private static final String DIR_NAME = "native_video_thumb";

    @NotNull
    private final NativeAdRequestParameters adRequestParameters;

    @NotNull
    private final Object assetsHolder;

    @NotNull
    private final AdProcessCallback callback;

    @NotNull
    private final NativeData nativeData;

    @NotNull
    private final NativeMediaPrivateData nativeMediaData;

    @NotNull
    private final List<Runnable> pendingTasks;

    /* renamed from: repository$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy repository;

    static final class a extends Lambda implements Function1 {
        a() {
            super(1);
        }

        public final void a(Uri imagePath) {
            Intrinsics.checkNotNullParameter(imagePath, "imagePath");
            AssetLoader.this.nativeMediaData.setIconUri(imagePath);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Uri) obj);
            return Unit.INSTANCE;
        }
    }

    static final class b extends Lambda implements Function1 {
        b() {
            super(1);
        }

        public final void a(Uri imagePath) {
            Intrinsics.checkNotNullParameter(imagePath, "imagePath");
            AssetLoader.this.nativeMediaData.setImageUri(imagePath);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Uri) obj);
            return Unit.INSTANCE;
        }
    }

    static final class c extends Lambda implements Function0 {
        final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context) {
            super(0);
            this.a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Repository mo4828invoke() {
            return Rendering.INSTANCE.createRepository(C6012g.a(this.a));
        }
    }

    public AssetLoader(@NotNull Context context, @NotNull Object assetsHolder, @NotNull NativeAdRequestParameters adRequestParameters, @NotNull AdProcessCallback callback, @NotNull NativeData nativeData, @NotNull NativeMediaPrivateData nativeMediaData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(assetsHolder, "assetsHolder");
        Intrinsics.checkNotNullParameter(adRequestParameters, "adRequestParameters");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(nativeData, "nativeData");
        Intrinsics.checkNotNullParameter(nativeMediaData, "nativeMediaData");
        this.assetsHolder = assetsHolder;
        this.adRequestParameters = adRequestParameters;
        this.callback = callback;
        this.nativeData = nativeData;
        this.nativeMediaData = nativeMediaData;
        this.repository = LazyKt.lazy(new c(context));
        this.pendingTasks = new CopyOnWriteArrayList();
    }

    private final void checkTasksCount() {
        if (this.pendingTasks.isEmpty()) {
            notifyNativeCallback();
        }
    }

    private final void createIconTask(ImageData imageData) {
        createImageTask(imageData, new a());
    }

    private final void createImageTask(ImageData imageData) {
        createImageTask(imageData, new b());
    }

    private final void createVastVideoTask(final Context context, String vastVideoAdm) {
        if (vastVideoAdm == null || vastVideoAdm.length() == 0) {
            return;
        }
        this.pendingTasks.add(new DownloadVastVideoTask(context, this.assetsHolder, getRepository(), new DownloadVastVideoTask.OnLoadedListener() { // from class: io.bidmachine.nativead.AssetLoader$createVastVideoTask$listener$1
            @Override // io.bidmachine.nativead.tasks.DownloadVastVideoTask.OnLoadedListener
            public void onVideoLoaded(@NotNull DownloadVastVideoTask task, @NotNull Uri videoFileUri, @NotNull VastRequest vastRequest) {
                Intrinsics.checkNotNullParameter(task, "task");
                Intrinsics.checkNotNullParameter(videoFileUri, "videoFileUri");
                Intrinsics.checkNotNullParameter(vastRequest, "vastRequest");
                AssetLoader.this.nativeMediaData.setVastRequest(vastRequest);
                AssetLoader.this.nativeMediaData.setVideoUri(videoFileUri);
                AssetLoader.this.retrieveAndSaveImageFrame(context, videoFileUri);
                AssetLoader.this.removePendingTask(task);
            }

            @Override // io.bidmachine.nativead.tasks.DownloadVastVideoTask.OnLoadedListener
            public void onVideoLoadingError(@NotNull DownloadVastVideoTask task) {
                Intrinsics.checkNotNullParameter(task, "task");
                AssetLoader.this.removePendingTask(task);
            }
        }, vastVideoAdm, null, 32, null));
    }

    private final void createVideoTask(final Context context, String url) {
        if (url == null || url.length() == 0) {
            return;
        }
        this.pendingTasks.add(new DownloadVideoTask(this.assetsHolder, getRepository(), new DownloadVideoTask.OnLoadedListener() { // from class: io.bidmachine.nativead.AssetLoader$createVideoTask$listener$1
            @Override // io.bidmachine.nativead.tasks.DownloadVideoTask.OnLoadedListener
            public void onVideoLoaded(@NotNull DownloadVideoTask task, @NotNull Uri videoFileUri) {
                Intrinsics.checkNotNullParameter(task, "task");
                Intrinsics.checkNotNullParameter(videoFileUri, "videoFileUri");
                AssetLoader.this.nativeMediaData.setVideoUri(videoFileUri);
                AssetLoader.this.retrieveAndSaveImageFrame(context, videoFileUri);
                AssetLoader.this.removePendingTask(task);
            }

            @Override // io.bidmachine.nativead.tasks.DownloadVideoTask.OnLoadedListener
            public void onVideoLoadingError(@NotNull DownloadVideoTask task) {
                Intrinsics.checkNotNullParameter(task, "task");
                AssetLoader.this.removePendingTask(task);
            }
        }, url, null, 16, null));
    }

    private final Repository getRepository() {
        return (Repository) this.repository.getValue();
    }

    private final boolean isAssetsValid() {
        try {
            if (isIconValid() && isImageValid()) {
                return isVideoValid();
            }
            return false;
        } catch (Exception e) {
            Logger.w(e);
            return false;
        }
    }

    private final boolean isIconValid() {
        return (this.adRequestParameters.containsAssetType(MediaAssetType.Icon) && this.nativeMediaData.getIconUri() == null && this.nativeMediaData.getIconDrawable() == null) ? false : true;
    }

    private final boolean isImageValid() {
        return (this.adRequestParameters.containsAssetType(MediaAssetType.Image) && this.nativeMediaData.getImageUri() == null && this.nativeMediaData.getImageDrawable() == null) ? false : true;
    }

    private final boolean isVideoValid() {
        if (this.adRequestParameters.containsAssetType(MediaAssetType.Video)) {
            return this.nativeData.getHasVideo();
        }
        return true;
    }

    private final synchronized void notifyNativeCallback() {
        try {
            if (!this.adRequestParameters.getIsValidateAssets() || isAssetsValid()) {
                this.callback.processLoadSuccess();
            } else {
                AdProcessCallback adProcessCallback = this.callback;
                BMError internal2 = BMError.internal("Native assets are invalid");
                Intrinsics.checkNotNullExpressionValue(internal2, "internal(\"Native assets are invalid\")");
                adProcessCallback.processLoadFail(internal2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removePendingTask(Runnable task) {
        this.pendingTasks.remove(task);
        checkTasksCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void retrieveAndSaveImageFrame(Context context, Uri videoFileUri) {
        String path;
        ImageData mainImageData = this.nativeData.getMainImageData();
        String remoteUrl = mainImageData != null ? mainImageData.getRemoteUrl() : null;
        if (videoFileUri == null || (path = videoFileUri.getPath()) == null) {
            return;
        }
        if ((remoteUrl == null || remoteUrl.length() == 0) && new File(path).exists()) {
            File retrieveAndSaveFrame = Utils.retrieveAndSaveFrame(context, videoFileUri, DIR_NAME);
            this.nativeMediaData.setImageUri(retrieveAndSaveFrame != null ? FileUtilsKt.toUri(retrieveAndSaveFrame) : null);
        }
    }

    private final void startDownloadTask(Context context) {
        String videoUrl = this.nativeData.getVideoUrl();
        String videoAdm = this.nativeData.getVideoAdm();
        if (this.adRequestParameters.containsAssetType(MediaAssetType.Icon)) {
            createIconTask(this.nativeData.getIconImageData());
        }
        if (this.adRequestParameters.containsAssetType(MediaAssetType.Image)) {
            createImageTask(this.nativeData.getMainImageData());
        }
        if (this.adRequestParameters.containsAssetType(MediaAssetType.Video)) {
            if (videoUrl != null && videoUrl.length() != 0) {
                createVideoTask(context, videoUrl);
            } else if (videoAdm != null && videoAdm.length() != 0) {
                createVastVideoTask(context, videoAdm);
            }
        }
        if (this.pendingTasks.isEmpty()) {
            checkTasksCount();
            return;
        }
        Iterator<T> it = this.pendingTasks.iterator();
        while (it.hasNext()) {
            NativeNetworkExecutor.getInstance().execute((Runnable) it.next());
        }
    }

    public final void downloadNativeAdsImages(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        startDownloadTask(context);
        checkTasksCount();
    }

    private final void createImageTask(ImageData imageData, final Function1 onSuccess) {
        String remoteUrl;
        if (imageData == null || imageData.getImage() != null || (remoteUrl = imageData.getRemoteUrl()) == null || remoteUrl.length() == 0) {
            return;
        }
        this.pendingTasks.add(new DownloadImageTask(this.assetsHolder, getRepository(), new DownloadImageTask.OnCacheImageListener() { // from class: io.bidmachine.nativead.AssetLoader$createImageTask$listener$1
            @Override // io.bidmachine.nativead.tasks.DownloadImageTask.OnCacheImageListener
            public void onFail(@NotNull DownloadImageTask task) {
                Intrinsics.checkNotNullParameter(task, "task");
                this.removePendingTask(task);
            }

            @Override // io.bidmachine.nativead.tasks.DownloadImageTask.OnCacheImageListener
            public void onPathSuccess(@NotNull DownloadImageTask task, @NotNull Uri imagePath) {
                Intrinsics.checkNotNullParameter(task, "task");
                Intrinsics.checkNotNullParameter(imagePath, "imagePath");
                Function1.this.invoke(imagePath);
                this.removePendingTask(task);
            }
        }, remoteUrl, null, 16, null));
    }
}
