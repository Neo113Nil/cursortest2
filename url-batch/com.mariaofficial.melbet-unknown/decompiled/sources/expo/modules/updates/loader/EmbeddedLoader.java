package expo.modules.updates.loader;

import android.content.Context;
import expo.modules.updates.UpdatesConfiguration;
import expo.modules.updates.UpdatesUtils;
import expo.modules.updates.db.UpdatesDatabase;
import expo.modules.updates.db.entity.AssetEntity;
import expo.modules.updates.db.entity.UpdateEntity;
import expo.modules.updates.loader.FileDownloader;
import expo.modules.updates.loader.UpdateResponsePart;
import expo.modules.updates.logging.UpdatesLogger;
import expo.modules.updates.manifest.Update;
import expo.modules.updates.utils.AndroidResourceAssetUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmbeddedLoader.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eBC\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011B1\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0012J\u001e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u0094@¢\u0006\u0002\u0010\u0015J<\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0094@¢\u0006\u0002\u0010\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lexpo/modules/updates/loader/EmbeddedLoader;", "Lexpo/modules/updates/loader/Loader;", "context", "Landroid/content/Context;", "configuration", "Lexpo/modules/updates/UpdatesConfiguration;", "logger", "Lexpo/modules/updates/logging/UpdatesLogger;", "database", "Lexpo/modules/updates/db/UpdatesDatabase;", "updatesDirectory", "Ljava/io/File;", "loaderFiles", "Lexpo/modules/updates/loader/LoaderFiles;", "shouldCopyEmbeddedAssets", "", "<init>", "(Landroid/content/Context;Lexpo/modules/updates/UpdatesConfiguration;Lexpo/modules/updates/logging/UpdatesLogger;Lexpo/modules/updates/db/UpdatesDatabase;Ljava/io/File;Lexpo/modules/updates/loader/LoaderFiles;Z)V", "(Landroid/content/Context;Lexpo/modules/updates/UpdatesConfiguration;Lexpo/modules/updates/logging/UpdatesLogger;Lexpo/modules/updates/db/UpdatesDatabase;Ljava/io/File;)V", "loadRemoteUpdate", "Lexpo/modules/updates/loader/UpdateResponse;", "(Lexpo/modules/updates/db/UpdatesDatabase;Lexpo/modules/updates/UpdatesConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadAsset", "Lexpo/modules/updates/loader/FileDownloader$AssetDownloadResult;", "assetEntity", "Lexpo/modules/updates/db/entity/AssetEntity;", "requestedUpdate", "Lexpo/modules/updates/db/entity/UpdateEntity;", "embeddedUpdate", "(Lexpo/modules/updates/db/entity/AssetEntity;Ljava/io/File;Lexpo/modules/updates/UpdatesConfiguration;Lexpo/modules/updates/db/entity/UpdateEntity;Lexpo/modules/updates/db/entity/UpdateEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EmbeddedLoader extends Loader {
    public static final String BARE_BUNDLE_FILENAME = "index.android.bundle";
    public static final String BUNDLE_FILENAME = "app.bundle";
    private final UpdatesConfiguration configuration;
    private final LoaderFiles loaderFiles;
    private final boolean shouldCopyEmbeddedAssets;

    public /* synthetic */ EmbeddedLoader(Context context, UpdatesConfiguration updatesConfiguration, UpdatesLogger updatesLogger, UpdatesDatabase updatesDatabase, File file, LoaderFiles loaderFiles, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, updatesConfiguration, updatesLogger, updatesDatabase, file, loaderFiles, (i & 64) != 0 ? false : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbeddedLoader(Context context, UpdatesConfiguration configuration, UpdatesLogger logger, UpdatesDatabase database, File updatesDirectory, LoaderFiles loaderFiles, boolean z) {
        super(context, configuration, logger, database, updatesDirectory, loaderFiles, null, 64, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(updatesDirectory, "updatesDirectory");
        Intrinsics.checkNotNullParameter(loaderFiles, "loaderFiles");
        this.configuration = configuration;
        this.loaderFiles = loaderFiles;
        this.shouldCopyEmbeddedAssets = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmbeddedLoader(Context context, UpdatesConfiguration configuration, UpdatesLogger logger, UpdatesDatabase database, File updatesDirectory) {
        this(context, configuration, logger, database, updatesDirectory, new LoaderFiles(), false, 64, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(updatesDirectory, "updatesDirectory");
    }

    @Override // expo.modules.updates.loader.Loader
    protected Object loadRemoteUpdate(UpdatesDatabase updatesDatabase, UpdatesConfiguration updatesConfiguration, Continuation<? super UpdateResponse> continuation) {
        Update readEmbeddedUpdate = this.loaderFiles.readEmbeddedUpdate(getContext(), this.configuration);
        if (readEmbeddedUpdate != null) {
            return new UpdateResponse(null, new UpdateResponsePart.ManifestUpdateResponsePart(readEmbeddedUpdate), null);
        }
        throw new Exception("Embedded manifest is null");
    }

    @Override // expo.modules.updates.loader.Loader
    protected Object loadAsset(AssetEntity assetEntity, File file, UpdatesConfiguration updatesConfiguration, UpdateEntity updateEntity, UpdateEntity updateEntity2, Continuation<? super FileDownloader.AssetDownloadResult> continuation) {
        if (!this.shouldCopyEmbeddedAssets) {
            assetEntity.setDownloadTime(new Date());
            assetEntity.setRelativePath(AndroidResourceAssetUtils.INSTANCE.createEmbeddedFilenameForAsset(assetEntity));
            return new FileDownloader.AssetDownloadResult(assetEntity, true);
        }
        String createFilenameForAsset = UpdatesUtils.INSTANCE.createFilenameForAsset(assetEntity);
        File file2 = new File(file, createFilenameForAsset);
        if (this.loaderFiles.fileExists(getContext(), file, createFilenameForAsset)) {
            assetEntity.setRelativePath(createFilenameForAsset);
            return new FileDownloader.AssetDownloadResult(assetEntity, false);
        }
        try {
            assetEntity.setHash(this.loaderFiles.copyAssetAndGetHash(assetEntity, file2, getContext()));
            assetEntity.setDownloadTime(new Date());
            assetEntity.setRelativePath(createFilenameForAsset);
            return new FileDownloader.AssetDownloadResult(assetEntity, true);
        } catch (FileNotFoundException unused) {
            throw new AssertionError("APK bundle must contain the expected embedded asset " + (assetEntity.getEmbeddedAssetFilename() != null ? assetEntity.getEmbeddedAssetFilename() : assetEntity.getResourcesFilename()));
        }
    }
}
