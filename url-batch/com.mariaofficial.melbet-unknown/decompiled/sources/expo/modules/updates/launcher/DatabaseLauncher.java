package expo.modules.updates.launcher;

import android.content.Context;
import android.net.Uri;
import com.facebook.common.util.UriUtil;
import expo.modules.interfaces.permissions.PermissionsResponse;
import expo.modules.updates.UpdatesConfiguration;
import expo.modules.updates.UpdatesUtils;
import expo.modules.updates.db.UpdatesDatabase;
import expo.modules.updates.db.dao.AssetDao;
import expo.modules.updates.db.dao.UpdateDao;
import expo.modules.updates.db.entity.AssetEntity;
import expo.modules.updates.db.entity.UpdateEntity;
import expo.modules.updates.db.enums.UpdateStatus;
import expo.modules.updates.loader.FileDownloader;
import expo.modules.updates.loader.LoaderFiles;
import expo.modules.updates.logging.UpdatesErrorCode;
import expo.modules.updates.logging.UpdatesLogger;
import expo.modules.updates.manifest.EmbeddedManifestUtils;
import expo.modules.updates.manifest.EmbeddedUpdate;
import expo.modules.updates.manifest.ManifestMetadata;
import expo.modules.updates.selectionpolicy.SelectionPolicy;
import expo.modules.updates.utils.AndroidResourceAssetUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import org.json.JSONObject;

/* compiled from: DatabaseLauncher.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 :2\u00020\u0001:\u0001:BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0086@¢\u0006\u0002\u00100J\u0018\u00101\u001a\u0004\u0018\u00010\u00172\u0006\u0010.\u001a\u00020/H\u0086@¢\u0006\u0002\u00100J\u0014\u00102\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001b0!H\u0002J2\u00103\u001a\u0004\u0018\u00010\u00072\u0006\u00104\u001a\u00020\"2\u0006\u0010.\u001a\u00020/2\b\u00105\u001a\u0004\u0018\u0001062\u0006\u00107\u001a\u000208H\u0087@¢\u0006\u0002\u00109R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u001b@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u001b@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR:\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001b\u0018\u00010!2\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001b\u0018\u00010!@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0016\u0010(\u001a\n\u0018\u00010)j\u0004\u0018\u0001`*X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lexpo/modules/updates/launcher/DatabaseLauncher;", "Lexpo/modules/updates/launcher/Launcher;", "context", "Landroid/content/Context;", "configuration", "Lexpo/modules/updates/UpdatesConfiguration;", "updatesDirectory", "Ljava/io/File;", "fileDownloader", "Lexpo/modules/updates/loader/FileDownloader;", "selectionPolicy", "Lexpo/modules/updates/selectionpolicy/SelectionPolicy;", "logger", "Lexpo/modules/updates/logging/UpdatesLogger;", PermissionsResponse.SCOPE_KEY, "Lkotlinx/coroutines/CoroutineScope;", "shouldCopyEmbeddedAssets", "", "<init>", "(Landroid/content/Context;Lexpo/modules/updates/UpdatesConfiguration;Ljava/io/File;Lexpo/modules/updates/loader/FileDownloader;Lexpo/modules/updates/selectionpolicy/SelectionPolicy;Lexpo/modules/updates/logging/UpdatesLogger;Lkotlinx/coroutines/CoroutineScope;Z)V", "loaderFiles", "Lexpo/modules/updates/loader/LoaderFiles;", "value", "Lexpo/modules/updates/db/entity/UpdateEntity;", "launchedUpdate", "getLaunchedUpdate", "()Lexpo/modules/updates/db/entity/UpdateEntity;", "", "launchAssetFile", "getLaunchAssetFile", "()Ljava/lang/String;", "bundleAssetName", "getBundleAssetName", "", "Lexpo/modules/updates/db/entity/AssetEntity;", "localAssetFiles", "getLocalAssetFiles", "()Ljava/util/Map;", "isUsingEmbeddedAssets", "()Z", "launchAssetException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "hasLaunched", "launch", "", "database", "Lexpo/modules/updates/db/UpdatesDatabase;", "(Lexpo/modules/updates/db/UpdatesDatabase;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLaunchableUpdate", "embeddedAssetFileMap", "ensureAssetExists", UriUtil.LOCAL_ASSET_SCHEME, "embeddedUpdate", "Lexpo/modules/updates/manifest/EmbeddedUpdate;", "extraHeaders", "Lorg/json/JSONObject;", "(Lexpo/modules/updates/db/entity/AssetEntity;Lexpo/modules/updates/db/UpdatesDatabase;Lexpo/modules/updates/manifest/EmbeddedUpdate;Lorg/json/JSONObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DatabaseLauncher implements Launcher {
    private static final String TAG = "DatabaseLauncher";
    private String bundleAssetName;
    private final UpdatesConfiguration configuration;
    private final Context context;
    private final FileDownloader fileDownloader;
    private boolean hasLaunched;
    private Exception launchAssetException;
    private String launchAssetFile;
    private UpdateEntity launchedUpdate;
    private final LoaderFiles loaderFiles;
    private Map<AssetEntity, String> localAssetFiles;
    private final UpdatesLogger logger;
    private final CoroutineScope scope;
    private final SelectionPolicy selectionPolicy;
    private final boolean shouldCopyEmbeddedAssets;
    private final File updatesDirectory;

    public DatabaseLauncher(Context context, UpdatesConfiguration configuration, File file, FileDownloader fileDownloader, SelectionPolicy selectionPolicy, UpdatesLogger logger, CoroutineScope scope, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(fileDownloader, "fileDownloader");
        Intrinsics.checkNotNullParameter(selectionPolicy, "selectionPolicy");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.context = context;
        this.configuration = configuration;
        this.updatesDirectory = file;
        this.fileDownloader = fileDownloader;
        this.selectionPolicy = selectionPolicy;
        this.logger = logger;
        this.scope = scope;
        this.shouldCopyEmbeddedAssets = z;
        this.loaderFiles = new LoaderFiles();
    }

    public /* synthetic */ DatabaseLauncher(Context context, UpdatesConfiguration updatesConfiguration, File file, FileDownloader fileDownloader, SelectionPolicy selectionPolicy, UpdatesLogger updatesLogger, CoroutineScope coroutineScope, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, updatesConfiguration, file, fileDownloader, selectionPolicy, updatesLogger, coroutineScope, (i & 128) != 0 ? false : z);
    }

    @Override // expo.modules.updates.launcher.Launcher
    public UpdateEntity getLaunchedUpdate() {
        return this.launchedUpdate;
    }

    @Override // expo.modules.updates.launcher.Launcher
    public String getLaunchAssetFile() {
        return this.launchAssetFile;
    }

    @Override // expo.modules.updates.launcher.Launcher
    public String getBundleAssetName() {
        return this.bundleAssetName;
    }

    @Override // expo.modules.updates.launcher.Launcher
    /* renamed from: getLocalAssetFiles */
    public Map<AssetEntity, String> mo770getLocalAssetFiles() {
        return this.localAssetFiles;
    }

    @Override // expo.modules.updates.launcher.Launcher
    public boolean isUsingEmbeddedAssets() {
        return mo770getLocalAssetFiles() == null;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object launch(UpdatesDatabase updatesDatabase, Continuation<? super Unit> continuation) {
        DatabaseLauncher$launch$1 databaseLauncher$launch$1;
        int i;
        Object obj;
        UpdatesDatabase updatesDatabase2;
        DatabaseLauncher databaseLauncher;
        String str;
        DatabaseLauncher$launch$1 databaseLauncher$launch$12;
        JSONObject jSONObject;
        EmbeddedUpdate embeddedUpdate;
        UpdatesDatabase updatesDatabase3;
        AssetEntity assetEntity;
        List<AssetEntity> assetEntityList;
        Object obj2;
        String embeddedAssetFilename;
        DatabaseLauncher databaseLauncher2;
        Map<AssetEntity, String> map;
        Map<AssetEntity, String> map2;
        String relativePath;
        Deferred async$default;
        DatabaseLauncher databaseLauncher3 = this;
        if (continuation instanceof DatabaseLauncher$launch$1) {
            databaseLauncher$launch$1 = (DatabaseLauncher$launch$1) continuation;
            if ((databaseLauncher$launch$1.label & Integer.MIN_VALUE) != 0) {
                databaseLauncher$launch$1.label -= Integer.MIN_VALUE;
                DatabaseLauncher$launch$1 databaseLauncher$launch$13 = databaseLauncher$launch$1;
                Object obj3 = databaseLauncher$launch$13.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = databaseLauncher$launch$13.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj3);
                    if (databaseLauncher3.hasLaunched) {
                        throw new AssertionError("DatabaseLauncher has already started. Create a new instance in order to launch a new version.");
                    }
                    databaseLauncher3.hasLaunched = true;
                    databaseLauncher$launch$13.L$0 = updatesDatabase;
                    databaseLauncher$launch$13.L$1 = databaseLauncher3;
                    databaseLauncher$launch$13.label = 1;
                    Object launchableUpdate = databaseLauncher3.getLaunchableUpdate(updatesDatabase, databaseLauncher$launch$13);
                    if (launchableUpdate != coroutine_suspended) {
                        obj = launchableUpdate;
                        updatesDatabase2 = updatesDatabase;
                        databaseLauncher = databaseLauncher3;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        databaseLauncher2 = (DatabaseLauncher) databaseLauncher$launch$13.L$2;
                        map = (Map) databaseLauncher$launch$13.L$1;
                        map2 = (Map) databaseLauncher$launch$13.L$0;
                        ResultKt.throwOnFailure(obj3);
                        for (Pair pair : (Iterable) obj3) {
                            AssetEntity assetEntity2 = (AssetEntity) pair.component1();
                            File file = (File) pair.component2();
                            if (file != null) {
                                map.put(assetEntity2, Uri.fromFile(file).toString());
                            }
                        }
                        databaseLauncher2.localAssetFiles = map2;
                        return Unit.INSTANCE;
                    }
                    JSONObject jSONObject2 = (JSONObject) databaseLauncher$launch$13.L$3;
                    EmbeddedUpdate embeddedUpdate2 = (EmbeddedUpdate) databaseLauncher$launch$13.L$2;
                    AssetEntity assetEntity3 = (AssetEntity) databaseLauncher$launch$13.L$1;
                    UpdatesDatabase updatesDatabase4 = (UpdatesDatabase) databaseLauncher$launch$13.L$0;
                    ResultKt.throwOnFailure(obj3);
                    assetEntity = assetEntity3;
                    databaseLauncher$launch$12 = databaseLauncher$launch$13;
                    jSONObject = jSONObject2;
                    embeddedUpdate = embeddedUpdate2;
                    updatesDatabase3 = updatesDatabase4;
                    if (obj3 != null) {
                        databaseLauncher3.launchAssetFile = obj3.toString();
                        AssetDao assetDao = updatesDatabase3.assetDao();
                        UpdateEntity launchedUpdate = databaseLauncher3.getLaunchedUpdate();
                        Intrinsics.checkNotNull(launchedUpdate);
                        List<AssetEntity> loadAssetsForUpdate = assetDao.loadAssetsForUpdate(launchedUpdate.getId());
                        Map<AssetEntity, String> embeddedAssetFileMap = databaseLauncher3.embeddedAssetFileMap();
                        ArrayList arrayList = new ArrayList();
                        for (AssetEntity assetEntity4 : loadAssetsForUpdate) {
                            if (assetEntity4.getId() != assetEntity.getId() && (relativePath = assetEntity4.getRelativePath()) != null) {
                                if (!AndroidResourceAssetUtils.INSTANCE.isAndroidResourceAsset(relativePath)) {
                                    CoroutineScope coroutineScope = databaseLauncher3.scope;
                                    databaseLauncher3 = this;
                                    async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new DatabaseLauncher$launch$2$job$1(this, assetEntity4, updatesDatabase3, embeddedUpdate, jSONObject, null), 3, null);
                                    Boxing.boxBoolean(arrayList.add(async$default));
                                } else {
                                    embeddedAssetFileMap.put(assetEntity4, relativePath);
                                }
                            }
                        }
                        databaseLauncher$launch$12.L$0 = embeddedAssetFileMap;
                        databaseLauncher$launch$12.L$1 = embeddedAssetFileMap;
                        databaseLauncher$launch$12.L$2 = databaseLauncher3;
                        databaseLauncher$launch$12.L$3 = null;
                        databaseLauncher$launch$12.label = 3;
                        obj3 = AwaitKt.awaitAll(arrayList, databaseLauncher$launch$12);
                        if (obj3 != coroutine_suspended) {
                            databaseLauncher2 = databaseLauncher3;
                            map = embeddedAssetFileMap;
                            map2 = map;
                            while (r2.hasNext()) {
                            }
                            databaseLauncher2.localAssetFiles = map2;
                            return Unit.INSTANCE;
                        }
                        return coroutine_suspended;
                    }
                    Exception exc = databaseLauncher3.launchAssetException;
                    if (exc == null) {
                        exc = new Exception("Launch asset file was null after download attempt");
                    }
                    throw exc;
                }
                databaseLauncher = (DatabaseLauncher) databaseLauncher$launch$13.L$1;
                UpdatesDatabase updatesDatabase5 = (UpdatesDatabase) databaseLauncher$launch$13.L$0;
                ResultKt.throwOnFailure(obj3);
                obj = obj3;
                updatesDatabase2 = updatesDatabase5;
                databaseLauncher.launchedUpdate = (UpdateEntity) obj;
                if (databaseLauncher3.getLaunchedUpdate() != null) {
                    throw new Exception("No launchable update was found. If this is a generic app, ensure expo-updates is configured correctly.");
                }
                UpdateDao updateDao = updatesDatabase2.updateDao();
                UpdateEntity launchedUpdate2 = databaseLauncher3.getLaunchedUpdate();
                Intrinsics.checkNotNull(launchedUpdate2);
                updateDao.markUpdateAccessed(launchedUpdate2);
                UpdateEntity launchedUpdate3 = databaseLauncher3.getLaunchedUpdate();
                Intrinsics.checkNotNull(launchedUpdate3);
                if (launchedUpdate3.getStatus() == UpdateStatus.DEVELOPMENT) {
                    return Unit.INSTANCE;
                }
                UpdateDao updateDao2 = updatesDatabase2.updateDao();
                UpdateEntity launchedUpdate4 = databaseLauncher3.getLaunchedUpdate();
                Intrinsics.checkNotNull(launchedUpdate4);
                AssetEntity loadLaunchAssetForUpdate = updateDao2.loadLaunchAssetForUpdate(launchedUpdate4.getId());
                if (loadLaunchAssetForUpdate == null) {
                    UpdateEntity launchedUpdate5 = databaseLauncher3.getLaunchedUpdate();
                    Intrinsics.checkNotNull(launchedUpdate5);
                    throw new Exception("Launch asset not found for update; this should never happen. Debug info: " + launchedUpdate5.debugInfo());
                }
                if (loadLaunchAssetForUpdate.getRelativePath() == null) {
                    UpdateEntity launchedUpdate6 = databaseLauncher3.getLaunchedUpdate();
                    Intrinsics.checkNotNull(launchedUpdate6);
                    throw new Exception("Launch asset relative path should not be null. Debug info: " + launchedUpdate6.debugInfo());
                }
                EmbeddedUpdate embeddedUpdate3 = EmbeddedManifestUtils.INSTANCE.getEmbeddedUpdate(databaseLauncher3.context, databaseLauncher3.configuration);
                JSONObject extraHeadersForRemoteAssetRequest = FileDownloader.INSTANCE.getExtraHeadersForRemoteAssetRequest(databaseLauncher3.getLaunchedUpdate(), embeddedUpdate3 != null ? embeddedUpdate3.getUpdateEntity() : null, databaseLauncher3.getLaunchedUpdate());
                if (!databaseLauncher3.shouldCopyEmbeddedAssets && embeddedUpdate3 != null && (assetEntityList = embeddedUpdate3.getAssetEntityList()) != null) {
                    Iterator<T> it = assetEntityList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (Intrinsics.areEqual(((AssetEntity) obj2).getKey(), loadLaunchAssetForUpdate.getKey())) {
                            break;
                        }
                    }
                    AssetEntity assetEntity5 = (AssetEntity) obj2;
                    if (assetEntity5 != null && (embeddedAssetFilename = assetEntity5.getEmbeddedAssetFilename()) != null) {
                        str = "assets://" + embeddedAssetFilename;
                        if (str != null) {
                            databaseLauncher$launch$13.L$0 = updatesDatabase2;
                            databaseLauncher$launch$13.L$1 = loadLaunchAssetForUpdate;
                            databaseLauncher$launch$13.L$2 = embeddedUpdate3;
                            databaseLauncher$launch$13.L$3 = extraHeadersForRemoteAssetRequest;
                            databaseLauncher$launch$13.label = 2;
                            Object ensureAssetExists = databaseLauncher3.ensureAssetExists(loadLaunchAssetForUpdate, updatesDatabase2, embeddedUpdate3, extraHeadersForRemoteAssetRequest, databaseLauncher$launch$13);
                            databaseLauncher$launch$12 = databaseLauncher$launch$13;
                            if (ensureAssetExists != coroutine_suspended) {
                                assetEntity = loadLaunchAssetForUpdate;
                                jSONObject = extraHeadersForRemoteAssetRequest;
                                embeddedUpdate = embeddedUpdate3;
                                updatesDatabase3 = updatesDatabase2;
                                obj3 = ensureAssetExists;
                            }
                            return coroutine_suspended;
                        }
                        databaseLauncher$launch$12 = databaseLauncher$launch$13;
                        jSONObject = extraHeadersForRemoteAssetRequest;
                        embeddedUpdate = embeddedUpdate3;
                        updatesDatabase3 = updatesDatabase2;
                        obj3 = str;
                        assetEntity = loadLaunchAssetForUpdate;
                        if (obj3 != null) {
                        }
                    }
                }
                str = null;
                if (str != null) {
                }
                if (obj3 != null) {
                }
            }
        }
        databaseLauncher$launch$1 = new DatabaseLauncher$launch$1(databaseLauncher3, continuation);
        DatabaseLauncher$launch$1 databaseLauncher$launch$132 = databaseLauncher$launch$1;
        Object obj32 = databaseLauncher$launch$132.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = databaseLauncher$launch$132.label;
        if (i != 0) {
        }
        databaseLauncher.launchedUpdate = (UpdateEntity) obj;
        if (databaseLauncher3.getLaunchedUpdate() != null) {
        }
    }

    public final Object getLaunchableUpdate(UpdatesDatabase updatesDatabase, Continuation<? super UpdateEntity> continuation) {
        UpdateEntity updateEntity;
        UpdateEntity updateEntity2;
        List<UpdateEntity> loadLaunchableUpdatesForScope = updatesDatabase.updateDao().loadLaunchableUpdatesForScope(this.configuration.getScopeKey());
        EmbeddedUpdate originalEmbeddedUpdate = EmbeddedManifestUtils.INSTANCE.getOriginalEmbeddedUpdate(this.context, this.configuration);
        ArrayList arrayList = new ArrayList();
        for (UpdateEntity updateEntity3 : loadLaunchableUpdatesForScope) {
            UUID uuid = null;
            if (updateEntity3.getStatus() == UpdateStatus.EMBEDDED) {
                if (!Intrinsics.areEqual((originalEmbeddedUpdate == null || (updateEntity2 = originalEmbeddedUpdate.getUpdateEntity()) == null) ? null : updateEntity2.getId(), updateEntity3.getId())) {
                }
            }
            if (!this.configuration.getHasEmbeddedUpdate()) {
                if (originalEmbeddedUpdate != null && (updateEntity = originalEmbeddedUpdate.getUpdateEntity()) != null) {
                    uuid = updateEntity.getId();
                }
                if (Intrinsics.areEqual(uuid, updateEntity3.getId())) {
                }
            }
            arrayList.add(updateEntity3);
        }
        return this.selectionPolicy.selectUpdateToLaunch(arrayList, ManifestMetadata.INSTANCE.getManifestFilters(updatesDatabase, this.configuration));
    }

    private final Map<AssetEntity, String> embeddedAssetFileMap() {
        List<AssetEntity> emptyList;
        EmbeddedUpdate embeddedUpdate = EmbeddedManifestUtils.INSTANCE.getEmbeddedUpdate(this.context, this.configuration);
        if (embeddedUpdate == null || (emptyList = embeddedUpdate.getAssetEntityList()) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        UpdatesLogger.info$default(this.logger, "embeddedAssetFileMap: embeddedAssets count = " + emptyList.size(), null, 2, null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AssetEntity assetEntity : emptyList) {
            if (!assetEntity.getIsLaunchAsset()) {
                if (!this.shouldCopyEmbeddedAssets) {
                    String createEmbeddedFilenameForAsset = AndroidResourceAssetUtils.INSTANCE.createEmbeddedFilenameForAsset(assetEntity);
                    if (createEmbeddedFilenameForAsset != null) {
                        assetEntity.setRelativePath(createEmbeddedFilenameForAsset);
                        linkedHashMap.put(assetEntity, createEmbeddedFilenameForAsset);
                        UpdatesLogger.info$default(this.logger, "embeddedAssetFileMap: " + assetEntity.getKey() + "," + assetEntity.getType() + " => " + linkedHashMap.get(assetEntity), null, 2, null);
                    } else {
                        this.logger.error("embeddedAssetFileMap: no file for " + assetEntity.getKey() + "," + assetEntity.getType(), new Exception("Missing embedded asset"), UpdatesErrorCode.AssetsFailedToLoad);
                    }
                } else {
                    String createFilenameForAsset = UpdatesUtils.INSTANCE.createFilenameForAsset(assetEntity);
                    assetEntity.setRelativePath(createFilenameForAsset);
                    File file = new File(this.updatesDirectory, createFilenameForAsset);
                    if (!file.exists()) {
                        this.loaderFiles.copyAssetAndGetHash(assetEntity, file, this.context);
                    }
                    if (file.exists()) {
                        linkedHashMap.put(assetEntity, Uri.fromFile(file).toString());
                        UpdatesLogger.info$default(this.logger, "embeddedAssetFileMap: " + assetEntity.getKey() + "," + assetEntity.getType() + " => " + linkedHashMap.get(assetEntity), null, 2, null);
                    } else {
                        this.logger.error("embeddedAssetFileMap: no file for " + assetEntity.getKey() + "," + assetEntity.getType(), new Exception("Missing embedded asset"), UpdatesErrorCode.AssetsFailedToLoad);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:19|20))(5:21|(1:23)|24|(3:27|(2:28|(2:30|(1:45)(1:35))(2:47|48))|(3:37|38|(1:40)))|(2:50|(1:52))(1:53))|12|(1:14)|15|16))|59|6|7|(0)(0)|12|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0038, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e9, code lost:
    
        r11.logger.error("Failed to load asset from disk or network", r0, expo.modules.updates.logging.UpdatesErrorCode.AssetsFailedToLoad);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f6, code lost:
    
        if (r12.getIsLaunchAsset() != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f8, code lost:
    
        r11.launchAssetException = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object ensureAssetExists(AssetEntity assetEntity, UpdatesDatabase updatesDatabase, EmbeddedUpdate embeddedUpdate, JSONObject jSONObject, Continuation<? super File> continuation) {
        DatabaseLauncher$ensureAssetExists$1 databaseLauncher$ensureAssetExists$1;
        int i;
        AssetEntity assetEntity2;
        File file;
        if (continuation instanceof DatabaseLauncher$ensureAssetExists$1) {
            databaseLauncher$ensureAssetExists$1 = (DatabaseLauncher$ensureAssetExists$1) continuation;
            if ((databaseLauncher$ensureAssetExists$1.label & Integer.MIN_VALUE) != 0) {
                databaseLauncher$ensureAssetExists$1.label -= Integer.MIN_VALUE;
                DatabaseLauncher$ensureAssetExists$1 databaseLauncher$ensureAssetExists$12 = databaseLauncher$ensureAssetExists$1;
                Object obj = databaseLauncher$ensureAssetExists$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = databaseLauncher$ensureAssetExists$12.label;
                File file2 = null;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    File file3 = this.updatesDirectory;
                    String relativePath = assetEntity.getRelativePath();
                    if (relativePath == null) {
                        relativePath = "";
                    }
                    File file4 = new File(file3, relativePath);
                    boolean exists = file4.exists();
                    if (!exists && embeddedUpdate != null) {
                        Iterator<AssetEntity> it = embeddedUpdate.getAssetEntityList().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                assetEntity2 = null;
                                break;
                            }
                            assetEntity2 = it.next();
                            if (assetEntity2.getKey() != null && Intrinsics.areEqual(assetEntity2.getKey(), assetEntity.getKey())) {
                                break;
                            }
                        }
                        if (assetEntity2 != null) {
                            try {
                                if (Arrays.equals(this.loaderFiles.copyAssetAndGetHash(assetEntity2, file4, this.context), assetEntity.getHash())) {
                                    exists = true;
                                }
                            } catch (Exception e) {
                                this.logger.error("Failed to copy matching embedded asset", e, UpdatesErrorCode.AssetsFailedToLoad);
                            }
                        }
                    }
                    if (exists) {
                        return file4;
                    }
                    FileDownloader fileDownloader = this.fileDownloader;
                    File file5 = this.updatesDirectory;
                    databaseLauncher$ensureAssetExists$12.L$0 = assetEntity;
                    databaseLauncher$ensureAssetExists$12.L$1 = updatesDatabase;
                    databaseLauncher$ensureAssetExists$12.label = 1;
                    obj = FileDownloader.downloadAsset$default(fileDownloader, assetEntity, file5, jSONObject, null, databaseLauncher$ensureAssetExists$12, 8, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    updatesDatabase = (UpdatesDatabase) databaseLauncher$ensureAssetExists$12.L$1;
                    ResultKt.throwOnFailure(obj);
                }
                FileDownloader.AssetDownloadResult assetDownloadResult = (FileDownloader.AssetDownloadResult) obj;
                updatesDatabase.assetDao().updateAsset(assetDownloadResult.getAssetEntity());
                File file6 = this.updatesDirectory;
                String relativePath2 = assetDownloadResult.getAssetEntity().getRelativePath();
                Intrinsics.checkNotNull(relativePath2);
                file = new File(file6, relativePath2);
                if (file.exists()) {
                    file2 = file;
                }
                return file2;
            }
        }
        databaseLauncher$ensureAssetExists$1 = new DatabaseLauncher$ensureAssetExists$1(this, continuation);
        DatabaseLauncher$ensureAssetExists$1 databaseLauncher$ensureAssetExists$122 = databaseLauncher$ensureAssetExists$1;
        Object obj2 = databaseLauncher$ensureAssetExists$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = databaseLauncher$ensureAssetExists$122.label;
        File file22 = null;
        if (i != 0) {
        }
        FileDownloader.AssetDownloadResult assetDownloadResult2 = (FileDownloader.AssetDownloadResult) obj2;
        updatesDatabase.assetDao().updateAsset(assetDownloadResult2.getAssetEntity());
        File file62 = this.updatesDirectory;
        String relativePath22 = assetDownloadResult2.getAssetEntity().getRelativePath();
        Intrinsics.checkNotNull(relativePath22);
        file = new File(file62, relativePath22);
        if (file.exists()) {
        }
        return file22;
    }
}
