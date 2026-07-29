package expo.modules.updates.loader;

import android.net.Uri;
import coil3.disk.DiskLruCache;
import com.facebook.common.util.UriUtil;
import expo.modules.manifests.core.Manifest;
import expo.modules.structuredheaders.Dictionary;
import expo.modules.structuredheaders.OuterList;
import expo.modules.structuredheaders.StringItem;
import expo.modules.updates.UpdatesConfiguration;
import expo.modules.updates.UpdatesUtils;
import expo.modules.updates.codesigning.CodeSigningConfiguration;
import expo.modules.updates.codesigning.ExpoProjectInformation;
import expo.modules.updates.codesigning.SignatureValidationResult;
import expo.modules.updates.codesigning.ValidationResult;
import expo.modules.updates.db.UpdatesDatabase;
import expo.modules.updates.db.entity.AssetEntity;
import expo.modules.updates.db.entity.UpdateEntity;
import expo.modules.updates.launcher.NoDatabaseLauncher;
import expo.modules.updates.loader.UpdateResponsePart;
import expo.modules.updates.logging.UpdatesErrorCode;
import expo.modules.updates.logging.UpdatesLogger;
import expo.modules.updates.manifest.ManifestMetadata;
import expo.modules.updates.manifest.ResponseHeaderData;
import expo.modules.updates.manifest.ResponsePartHeaderData;
import expo.modules.updates.manifest.ResponsePartInfo;
import expo.modules.updates.manifest.Update;
import expo.modules.updates.manifest.UpdateFactory;
import expo.modules.updates.selectionpolicy.SelectionPolicies;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.sequences.SequencesKt;
import kotlin.text.Charsets;
import kotlinx.coroutines.CancellableContinuationImpl;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.MultipartReader;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.brotli.BrotliInterceptor;
import okio.BufferedSource;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: FileDownloader.kt */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 K2\u00020\u0001:\u0003IJKB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bB1\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\n\u0010\u000eJ4\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0082@¢\u0006\u0002\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0000¢\u0006\u0002\b\u001cJ \u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\u001a\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0005H\u0002J$\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020%2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010&\u001a\u0004\u0018\u00010\u0005H\u0002J\u0018\u0010,\u001a\u00020\u00192\b\u0010-\u001a\u0004\u0018\u00010+H\u0086@¢\u0006\u0002\u0010.J@\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u00032\u0006\u0010-\u001a\u00020+2\u0016\b\u0002\u00104\u001a\u0010\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u000207\u0018\u000105H\u0086@¢\u0006\u0002\u00108J\"\u00109\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0082@¢\u0006\u0002\u0010:J\b\u0010;\u001a\u00020<H\u0002J\b\u0010=\u001a\u00020\u0003H\u0002J \u0010>\u001a\u00020\u00122\u0006\u0010?\u001a\u0002022\u0006\u0010-\u001a\u00020+2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007JL\u0010@\u001a\u00020(2\u0006\u0010A\u001a\u00020\u00052\u0006\u0010B\u001a\u00020+2\u0006\u0010 \u001a\u00020!2\u0006\u0010C\u001a\u00020D2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010&\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0016\u0010E\u001a\u00020F*\u00020F2\b\u0010G\u001a\u0004\u0018\u00010+H\u0002J\"\u0010H\u001a\u00020\u00122\b\u0010-\u001a\u0004\u0018\u00010+2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006L"}, d2 = {"Lexpo/modules/updates/loader/FileDownloader;", "", "filesDirectory", "Ljava/io/File;", "easClientID", "", "configuration", "Lexpo/modules/updates/UpdatesConfiguration;", "logger", "Lexpo/modules/updates/logging/UpdatesLogger;", "<init>", "(Ljava/io/File;Ljava/lang/String;Lexpo/modules/updates/UpdatesConfiguration;Lexpo/modules/updates/logging/UpdatesLogger;)V", "client", "Lokhttp3/OkHttpClient;", "(Ljava/io/File;Ljava/lang/String;Lexpo/modules/updates/UpdatesConfiguration;Lexpo/modules/updates/logging/UpdatesLogger;Lokhttp3/OkHttpClient;)V", "downloadAssetAndVerifyHashAndWriteToPath", "Lexpo/modules/updates/loader/FileDownloader$FileDownloadResult;", "request", "Lokhttp3/Request;", "expectedBase64URLEncodedSHA256Hash", "destination", "progressListener", "Lexpo/modules/updates/loader/FileDownloadProgressListener;", "(Lokhttp3/Request;Ljava/lang/String;Ljava/io/File;Lexpo/modules/updates/loader/FileDownloadProgressListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parseRemoteUpdateResponse", "Lexpo/modules/updates/loader/UpdateResponse;", "response", "Lokhttp3/Response;", "parseRemoteUpdateResponse$expo_updates_release", "parseMultipartRemoteUpdateResponse", "responseBody", "Lokhttp3/ResponseBody;", "responseHeaderData", "Lexpo/modules/updates/manifest/ResponseHeaderData;", "parseDirective", "Lexpo/modules/updates/loader/UpdateResponsePart$DirectiveUpdateResponsePart;", "directiveResponsePartInfo", "Lexpo/modules/updates/manifest/ResponsePartInfo;", "certificateChainFromManifestResponse", "parseManifest", "Lexpo/modules/updates/loader/UpdateResponsePart$ManifestUpdateResponsePart;", "manifestResponseInfo", "extensions", "Lorg/json/JSONObject;", "downloadRemoteUpdate", "extraHeaders", "(Lorg/json/JSONObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downloadAsset", "Lexpo/modules/updates/loader/FileDownloader$AssetDownloadResult;", UriUtil.LOCAL_ASSET_SCHEME, "Lexpo/modules/updates/db/entity/AssetEntity;", "destinationDirectory", "assetLoadProgressListener", "Lkotlin/Function1;", "", "", "(Lexpo/modules/updates/db/entity/AssetEntity;Ljava/io/File;Lorg/json/JSONObject;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downloadData", "(Lokhttp3/Request;Lexpo/modules/updates/loader/FileDownloadProgressListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCache", "Lokhttp3/Cache;", "getCacheDirectory", "createRequestForAsset", "assetEntity", "checkCodeSigningAndCreateManifest", "bodyString", "preManifest", "responsePartHeaderData", "Lexpo/modules/updates/manifest/ResponsePartHeaderData;", "addHeadersFromJSONObject", "Lokhttp3/Request$Builder;", "headers", "createRequestForRemoteUpdate", "FileDownloadResult", "AssetDownloadResult", "Companion", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FileDownloader {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private OkHttpClient client;
    private final UpdatesConfiguration configuration;
    private final String easClientID;
    private final File filesDirectory;
    private final UpdatesLogger logger;

    public FileDownloader(File filesDirectory, String easClientID, UpdatesConfiguration configuration, UpdatesLogger logger) {
        Intrinsics.checkNotNullParameter(filesDirectory, "filesDirectory");
        Intrinsics.checkNotNullParameter(easClientID, "easClientID");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.filesDirectory = filesDirectory;
        this.easClientID = easClientID;
        this.configuration = configuration;
        this.logger = logger;
        this.client = new OkHttpClient.Builder().cache(getCache()).connectTimeout(Math.max(configuration.getLaunchWaitMs(), 10000L), TimeUnit.MILLISECONDS).readTimeout(Math.max(configuration.getLaunchWaitMs(), 10000L), TimeUnit.MILLISECONDS).addInterceptor(BrotliInterceptor.INSTANCE).build();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FileDownloader(File filesDirectory, String easClientID, UpdatesConfiguration configuration, UpdatesLogger logger, OkHttpClient client) {
        this(filesDirectory, easClientID, configuration, logger);
        Intrinsics.checkNotNullParameter(filesDirectory, "filesDirectory");
        Intrinsics.checkNotNullParameter(easClientID, "easClientID");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
    }

    /* compiled from: FileDownloader.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lexpo/modules/updates/loader/FileDownloader$FileDownloadResult;", "", "file", "Ljava/io/File;", "hash", "", "<init>", "(Ljava/io/File;[B)V", "getFile", "()Ljava/io/File;", "getHash", "()[B", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FileDownloadResult {
        private final File file;
        private final byte[] hash;

        public static /* synthetic */ FileDownloadResult copy$default(FileDownloadResult fileDownloadResult, File file, byte[] bArr, int i, Object obj) {
            if ((i & 1) != 0) {
                file = fileDownloadResult.file;
            }
            if ((i & 2) != 0) {
                bArr = fileDownloadResult.hash;
            }
            return fileDownloadResult.copy(file, bArr);
        }

        /* renamed from: component1, reason: from getter */
        public final File getFile() {
            return this.file;
        }

        /* renamed from: component2, reason: from getter */
        public final byte[] getHash() {
            return this.hash;
        }

        public final FileDownloadResult copy(File file, byte[] hash) {
            Intrinsics.checkNotNullParameter(file, "file");
            Intrinsics.checkNotNullParameter(hash, "hash");
            return new FileDownloadResult(file, hash);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FileDownloadResult)) {
                return false;
            }
            FileDownloadResult fileDownloadResult = (FileDownloadResult) other;
            return Intrinsics.areEqual(this.file, fileDownloadResult.file) && Intrinsics.areEqual(this.hash, fileDownloadResult.hash);
        }

        public int hashCode() {
            return (this.file.hashCode() * 31) + Arrays.hashCode(this.hash);
        }

        public String toString() {
            return "FileDownloadResult(file=" + this.file + ", hash=" + Arrays.toString(this.hash) + ")";
        }

        public FileDownloadResult(File file, byte[] hash) {
            Intrinsics.checkNotNullParameter(file, "file");
            Intrinsics.checkNotNullParameter(hash, "hash");
            this.file = file;
            this.hash = hash;
        }

        public final File getFile() {
            return this.file;
        }

        public final byte[] getHash() {
            return this.hash;
        }
    }

    /* compiled from: FileDownloader.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, d2 = {"Lexpo/modules/updates/loader/FileDownloader$AssetDownloadResult;", "", "assetEntity", "Lexpo/modules/updates/db/entity/AssetEntity;", "isNew", "", "<init>", "(Lexpo/modules/updates/db/entity/AssetEntity;Z)V", "getAssetEntity", "()Lexpo/modules/updates/db/entity/AssetEntity;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AssetDownloadResult {
        private final AssetEntity assetEntity;
        private final boolean isNew;

        public static /* synthetic */ AssetDownloadResult copy$default(AssetDownloadResult assetDownloadResult, AssetEntity assetEntity, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                assetEntity = assetDownloadResult.assetEntity;
            }
            if ((i & 2) != 0) {
                z = assetDownloadResult.isNew;
            }
            return assetDownloadResult.copy(assetEntity, z);
        }

        /* renamed from: component1, reason: from getter */
        public final AssetEntity getAssetEntity() {
            return this.assetEntity;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsNew() {
            return this.isNew;
        }

        public final AssetDownloadResult copy(AssetEntity assetEntity, boolean isNew) {
            Intrinsics.checkNotNullParameter(assetEntity, "assetEntity");
            return new AssetDownloadResult(assetEntity, isNew);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AssetDownloadResult)) {
                return false;
            }
            AssetDownloadResult assetDownloadResult = (AssetDownloadResult) other;
            return Intrinsics.areEqual(this.assetEntity, assetDownloadResult.assetEntity) && this.isNew == assetDownloadResult.isNew;
        }

        public int hashCode() {
            return (this.assetEntity.hashCode() * 31) + Boolean.hashCode(this.isNew);
        }

        public String toString() {
            return "AssetDownloadResult(assetEntity=" + this.assetEntity + ", isNew=" + this.isNew + ")";
        }

        public AssetDownloadResult(AssetEntity assetEntity, boolean z) {
            Intrinsics.checkNotNullParameter(assetEntity, "assetEntity");
            this.assetEntity = assetEntity;
            this.isNew = z;
        }

        public final AssetEntity getAssetEntity() {
            return this.assetEntity;
        }

        public final boolean isNew() {
            return this.isNew;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c A[Catch: IOException -> 0x00d5, TryCatch #1 {IOException -> 0x00d5, blocks: (B:11:0x0036, B:12:0x0054, B:14:0x005c, B:16:0x0066, B:18:0x006e, B:19:0x0082, B:23:0x0083, B:27:0x009f, B:35:0x00a6, B:36:0x00a9, B:38:0x00ab, B:39:0x00d4, B:43:0x0045), top: B:7:0x0024, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object downloadAssetAndVerifyHashAndWriteToPath(Request request, String str, File file, FileDownloadProgressListener fileDownloadProgressListener, Continuation<? super FileDownloadResult> continuation) {
        FileDownloader$downloadAssetAndVerifyHashAndWriteToPath$1 fileDownloader$downloadAssetAndVerifyHashAndWriteToPath$1;
        int i;
        Response response;
        String str2;
        try {
            if (continuation instanceof FileDownloader$downloadAssetAndVerifyHashAndWriteToPath$1) {
                fileDownloader$downloadAssetAndVerifyHashAndWriteToPath$1 = (FileDownloader$downloadAssetAndVerifyHashAndWriteToPath$1) continuation;
                if ((fileDownloader$downloadAssetAndVerifyHashAndWriteToPath$1.label & Integer.MIN_VALUE) != 0) {
                    fileDownloader$downloadAssetAndVerifyHashAndWriteToPath$1.label -= Integer.MIN_VALUE;
                    Object obj = fileDownloader$downloadAssetAndVerifyHashAndWriteToPath$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = fileDownloader$downloadAssetAndVerifyHashAndWriteToPath$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        fileDownloader$downloadAssetAndVerifyHashAndWriteToPath$1.L$0 = request;
                        fileDownloader$downloadAssetAndVerifyHashAndWriteToPath$1.L$1 = str;
                        fileDownloader$downloadAssetAndVerifyHashAndWriteToPath$1.L$2 = file;
                        fileDownloader$downloadAssetAndVerifyHashAndWriteToPath$1.label = 1;
                        obj = downloadData(request, fileDownloadProgressListener, fileDownloader$downloadAssetAndVerifyHashAndWriteToPath$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        file = (File) fileDownloader$downloadAssetAndVerifyHashAndWriteToPath$1.L$2;
                        str = (String) fileDownloader$downloadAssetAndVerifyHashAndWriteToPath$1.L$1;
                        request = (Request) fileDownloader$downloadAssetAndVerifyHashAndWriteToPath$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    response = (Response) obj;
                    if (response.isSuccessful()) {
                        ResponseBody body = response.body();
                        if (body == null || (str2 = body.string()) == null) {
                            str2 = "Unknown error";
                        }
                        IOException iOException = new IOException(str2);
                        this.logger.error("Asset download request not successful", iOException, UpdatesErrorCode.AssetsFailedToLoad);
                        throw new IOException("Asset download request not successful", iOException);
                    }
                    try {
                        ResponseBody body2 = response.body();
                        Intrinsics.checkNotNull(body2);
                        InputStream byteStream = body2.byteStream();
                        try {
                            FileDownloadResult fileDownloadResult = new FileDownloadResult(file, UpdatesUtils.INSTANCE.verifySHA256AndWriteToFile(byteStream, file, str));
                            CloseableKt.closeFinally(byteStream, null);
                            return fileDownloadResult;
                        } finally {
                        }
                    } catch (Exception e) {
                        String str3 = "Failed to write asset file from " + request.url() + " to destination " + file;
                        this.logger.error(str3, e, UpdatesErrorCode.AssetsFailedToLoad);
                        throw new IOException(str3, e);
                    }
                }
            }
            if (i != 0) {
            }
            response = (Response) obj;
            if (response.isSuccessful()) {
            }
        } catch (IOException e2) {
            String str4 = "Failed to download asset from URL " + request.url();
            this.logger.error(str4, e2, UpdatesErrorCode.AssetsFailedToLoad);
            throw new IOException(str4, e2);
        }
        fileDownloader$downloadAssetAndVerifyHashAndWriteToPath$1 = new FileDownloader$downloadAssetAndVerifyHashAndWriteToPath$1(this, continuation);
        Object obj2 = fileDownloader$downloadAssetAndVerifyHashAndWriteToPath$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fileDownloader$downloadAssetAndVerifyHashAndWriteToPath$1.label;
    }

    static /* synthetic */ Object downloadAssetAndVerifyHashAndWriteToPath$default(FileDownloader fileDownloader, Request request, String str, File file, FileDownloadProgressListener fileDownloadProgressListener, Continuation continuation, int i, Object obj) {
        if ((i & 8) != 0) {
            fileDownloadProgressListener = null;
        }
        return fileDownloader.downloadAssetAndVerifyHashAndWriteToPath(request, str, file, fileDownloadProgressListener, continuation);
    }

    public final UpdateResponse parseRemoteUpdateResponse$expo_updates_release(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        Headers headers = response.headers();
        ResponseHeaderData responseHeaderData = new ResponseHeaderData(headers.get("expo-protocol-version"), headers.get("expo-server-defined-headers"), headers.get("expo-manifest-filters"));
        ResponseBody body = response.body();
        if (response.code() == 204 || body == null) {
            if (responseHeaderData.getProtocolVersion() != null && responseHeaderData.getProtocolVersion().intValue() > 0) {
                return new UpdateResponse(responseHeaderData, null, null);
            }
            IOException iOException = new IOException("Empty body");
            this.logger.error("Invalid update response", iOException, UpdatesErrorCode.UpdateFailedToLoad);
            throw new IOException("Invalid update response", iOException);
        }
        MediaType mediaType = body.get$contentType();
        if (Intrinsics.areEqual(mediaType != null ? mediaType.type() : null, "multipart")) {
            return parseMultipartRemoteUpdateResponse(response, body, responseHeaderData);
        }
        ResponsePartHeaderData responsePartHeaderData = new ResponsePartHeaderData(headers.get("expo-signature"));
        ResponseBody body2 = response.body();
        Intrinsics.checkNotNull(body2);
        return new UpdateResponse(responseHeaderData, parseManifest(new ResponsePartInfo(responseHeaderData, responsePartHeaderData, body2.string()), null, null), null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    private final UpdateResponse parseMultipartRemoteUpdateResponse(Response response, ResponseBody responseBody, ResponseHeaderData responseHeaderData) {
        Pair pair;
        String str;
        String str2;
        Pair pair2;
        String parseContentDispositionNameParameter;
        JSONObject jSONObject;
        if (response.peekBody(1L).bytes().length == 0) {
            pair = null;
            str = null;
            str2 = null;
            pair2 = null;
        } else {
            try {
                MultipartReader.Part multipartReader = new MultipartReader(responseBody);
                try {
                    MultipartReader multipartReader2 = multipartReader;
                    pair = null;
                    str = null;
                    str2 = null;
                    pair2 = null;
                    while (true) {
                        MultipartReader.Part nextPart = multipartReader2.nextPart();
                        if (nextPart == null) {
                            Unit unit = Unit.INSTANCE;
                            CloseableKt.closeFinally(multipartReader, null);
                        } else {
                            multipartReader = nextPart;
                            try {
                                MultipartReader.Part part = multipartReader;
                                Headers headers = part.getHeaders();
                                BufferedSource body = part.getBody();
                                String str3 = headers.get("content-disposition");
                                if (str3 != null && (parseContentDispositionNameParameter = UpdatesUtils.INSTANCE.parseContentDispositionNameParameter(str3)) != null) {
                                    switch (parseContentDispositionNameParameter.hashCode()) {
                                        case -1809421292:
                                            if (!parseContentDispositionNameParameter.equals("extensions")) {
                                                break;
                                            } else {
                                                str = body.readUtf8();
                                                break;
                                            }
                                        case -1044926951:
                                            if (!parseContentDispositionNameParameter.equals("certificate_chain")) {
                                                break;
                                            } else {
                                                str2 = body.readUtf8();
                                                break;
                                            }
                                        case -962590641:
                                            if (!parseContentDispositionNameParameter.equals("directive")) {
                                                break;
                                            } else {
                                                pair2 = new Pair(body.readUtf8(), headers);
                                                break;
                                            }
                                        case 130625071:
                                            if (!parseContentDispositionNameParameter.equals("manifest")) {
                                                break;
                                            } else {
                                                pair = new Pair(body.readUtf8(), headers);
                                                break;
                                            }
                                    }
                                }
                                Unit unit2 = Unit.INSTANCE;
                                CloseableKt.closeFinally(multipartReader, null);
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            } catch (Exception e) {
                this.logger.error("Error while reading multipart remote update response", e, UpdatesErrorCode.UpdateFailedToLoad);
                throw new IOException("Error while reading multipart remote update response", e);
            }
        }
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (Exception e2) {
                this.logger.error("Failed to parse multipart remote update extensions part", e2, UpdatesErrorCode.UpdateFailedToLoad);
                throw new IOException("Failed to parse multipart remote update extensions part", e2);
            }
        } else {
            jSONObject = null;
        }
        if (this.configuration.getEnableExpoUpdatesProtocolV0CompatibilityMode() && pair == null) {
            IOException iOException = new IOException("Multipart response missing manifest part. Manifest is required in version 0 of the expo-updates protocol. This may be due to the response being for a different protocol version.");
            this.logger.error("Invalid update response", iOException, UpdatesErrorCode.UpdateFailedToLoad);
            throw new IOException("Invalid update response", iOException);
        }
        ResponsePartInfo responsePartInfo = pair != null ? new ResponsePartInfo(responseHeaderData, new ResponsePartHeaderData(((Headers) pair.getSecond()).get("expo-signature")), (String) pair.getFirst()) : null;
        ResponsePartInfo responsePartInfo2 = (this.configuration.getEnableExpoUpdatesProtocolV0CompatibilityMode() || pair2 == null) ? null : new ResponsePartInfo(responseHeaderData, new ResponsePartHeaderData(((Headers) pair2.getSecond()).get("expo-signature")), (String) pair2.getFirst());
        return new UpdateResponse(responseHeaderData, responsePartInfo != null ? parseManifest(responsePartInfo, jSONObject, str2) : null, responsePartInfo2 != null ? parseDirective(responsePartInfo2, str2) : null);
    }

    private final UpdateResponsePart.DirectiveUpdateResponsePart parseDirective(ResponsePartInfo directiveResponsePartInfo, String certificateChainFromManifestResponse) {
        String body = directiveResponsePartInfo.getBody();
        try {
            CodeSigningConfiguration codeSigningConfiguration = this.configuration.getCodeSigningConfiguration();
            if (codeSigningConfiguration != null) {
                String signature = directiveResponsePartInfo.getResponsePartHeaderData().getSignature();
                byte[] bytes = body.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                SignatureValidationResult validateSignature = codeSigningConfiguration.validateSignature(signature, bytes, certificateChainFromManifestResponse);
                if (validateSignature.getValidationResult() == ValidationResult.INVALID) {
                    throw new IOException("Incorrect signature");
                }
                if (validateSignature.getValidationResult() != ValidationResult.SKIPPED) {
                    UpdateDirective fromJSONString = UpdateDirective.INSTANCE.fromJSONString(body);
                    ExpoProjectInformation expoProjectInformation = validateSignature.getExpoProjectInformation();
                    if (expoProjectInformation != null) {
                        String projectId = expoProjectInformation.getProjectId();
                        SigningInfo signingInfo = fromJSONString.getSigningInfo();
                        if (!Intrinsics.areEqual(projectId, signingInfo != null ? signingInfo.getEasProjectId() : null) || !Intrinsics.areEqual(expoProjectInformation.getScopeKey(), fromJSONString.getSigningInfo().getScopeKey())) {
                            throw new CertificateException("Code signing certificate project ID or scope key does not match project ID or scope key in response part");
                        }
                    }
                }
            }
            return new UpdateResponsePart.DirectiveUpdateResponsePart(UpdateDirective.INSTANCE.fromJSONString(body));
        } catch (Exception e) {
            this.logger.error("Code signing verification failed for directive", e, UpdatesErrorCode.UpdateCodeSigningError);
            throw new IOException("Code signing verification failed for directive", e);
        }
    }

    private final UpdateResponsePart.ManifestUpdateResponsePart parseManifest(ResponsePartInfo manifestResponseInfo, JSONObject extensions, String certificateChainFromManifestResponse) {
        return checkCodeSigningAndCreateManifest(manifestResponseInfo.getBody(), new JSONObject(manifestResponseInfo.getBody()), manifestResponseInfo.getResponseHeaderData(), manifestResponseInfo.getResponsePartHeaderData(), extensions, certificateChainFromManifestResponse, this.configuration, this.logger);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0059 A[Catch: Exception -> 0x0085, TryCatch #2 {Exception -> 0x0085, blocks: (B:15:0x0051, B:17:0x0059, B:19:0x0063, B:21:0x006b, B:22:0x007f, B:24:0x0080, B:36:0x004a), top: B:35:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080 A[Catch: Exception -> 0x0085, TRY_LEAVE, TryCatch #2 {Exception -> 0x0085, blocks: (B:15:0x0051, B:17:0x0059, B:19:0x0063, B:21:0x006b, B:22:0x007f, B:24:0x0080, B:36:0x004a), top: B:35:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object downloadRemoteUpdate(JSONObject jSONObject, Continuation<? super UpdateResponse> continuation) {
        FileDownloader$downloadRemoteUpdate$1 fileDownloader$downloadRemoteUpdate$1;
        int i;
        FileDownloader fileDownloader;
        Exception exc;
        Request createRequestForRemoteUpdate;
        Response response;
        String str;
        if (continuation instanceof FileDownloader$downloadRemoteUpdate$1) {
            fileDownloader$downloadRemoteUpdate$1 = (FileDownloader$downloadRemoteUpdate$1) continuation;
            if ((fileDownloader$downloadRemoteUpdate$1.label & Integer.MIN_VALUE) != 0) {
                fileDownloader$downloadRemoteUpdate$1.label -= Integer.MIN_VALUE;
                FileDownloader$downloadRemoteUpdate$1 fileDownloader$downloadRemoteUpdate$12 = fileDownloader$downloadRemoteUpdate$1;
                Object obj = fileDownloader$downloadRemoteUpdate$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fileDownloader$downloadRemoteUpdate$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        createRequestForRemoteUpdate = createRequestForRemoteUpdate(jSONObject, this.configuration, this.logger);
                        fileDownloader$downloadRemoteUpdate$12.label = 1;
                        fileDownloader = this;
                    } catch (Exception e) {
                        e = e;
                        fileDownloader = this;
                    }
                    try {
                        obj = downloadData$default(fileDownloader, createRequestForRemoteUpdate, null, fileDownloader$downloadRemoteUpdate$12, 2, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        exc = e;
                        fileDownloader.logger.error("Failed to download remote update", exc, UpdatesErrorCode.UpdateFailedToLoad);
                        throw new IOException("Failed to download remote update", exc);
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        ResultKt.throwOnFailure(obj);
                        fileDownloader = this;
                    } catch (Exception e3) {
                        exc = e3;
                        fileDownloader = this;
                        fileDownloader.logger.error("Failed to download remote update", exc, UpdatesErrorCode.UpdateFailedToLoad);
                        throw new IOException("Failed to download remote update", exc);
                    }
                }
                response = (Response) obj;
                if (response.isSuccessful()) {
                    ResponseBody body = response.body();
                    if (body == null || (str = body.string()) == null) {
                        str = "Unknown error";
                    }
                    IOException iOException = new IOException(str);
                    fileDownloader.logger.error("Remote update request not successful", iOException, UpdatesErrorCode.UpdateFailedToLoad);
                    throw new IOException("Remote update request not successful", iOException);
                }
                return parseRemoteUpdateResponse$expo_updates_release(response);
            }
        }
        fileDownloader$downloadRemoteUpdate$1 = new FileDownloader$downloadRemoteUpdate$1(this, continuation);
        FileDownloader$downloadRemoteUpdate$1 fileDownloader$downloadRemoteUpdate$122 = fileDownloader$downloadRemoteUpdate$1;
        Object obj2 = fileDownloader$downloadRemoteUpdate$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fileDownloader$downloadRemoteUpdate$122.label;
        if (i != 0) {
        }
        response = (Response) obj2;
        if (response.isSuccessful()) {
        }
    }

    public static /* synthetic */ Object downloadAsset$default(FileDownloader fileDownloader, AssetEntity assetEntity, File file, JSONObject jSONObject, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 8) != 0) {
            function1 = null;
        }
        return fileDownloader.downloadAsset(assetEntity, file, jSONObject, function1, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object downloadAsset(AssetEntity assetEntity, File file, JSONObject jSONObject, final Function1<? super Double, Unit> function1, Continuation<? super AssetDownloadResult> continuation) {
        FileDownloader$downloadAsset$1 fileDownloader$downloadAsset$1;
        int i;
        String createFilenameForAsset;
        FileDownloader fileDownloader;
        Request createRequestForAsset;
        String expectedHash;
        AssetEntity assetEntity2;
        Exception exc;
        FileDownloader$sam$expo_modules_updates_loader_FileDownloadProgressListener$0 fileDownloader$sam$expo_modules_updates_loader_FileDownloadProgressListener$0;
        FileDownloader$sam$expo_modules_updates_loader_FileDownloadProgressListener$0 fileDownloader$sam$expo_modules_updates_loader_FileDownloadProgressListener$02;
        Object downloadAssetAndVerifyHashAndWriteToPath;
        if (continuation instanceof FileDownloader$downloadAsset$1) {
            fileDownloader$downloadAsset$1 = (FileDownloader$downloadAsset$1) continuation;
            if ((fileDownloader$downloadAsset$1.label & Integer.MIN_VALUE) != 0) {
                fileDownloader$downloadAsset$1.label -= Integer.MIN_VALUE;
                FileDownloader$downloadAsset$1 fileDownloader$downloadAsset$12 = fileDownloader$downloadAsset$1;
                Object obj = fileDownloader$downloadAsset$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fileDownloader$downloadAsset$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (assetEntity.getUrl() == null) {
                        String str = "Failed to download asset " + assetEntity.getKey();
                        Exception exc2 = new Exception("Asset missing URL");
                        this.logger.error(str, exc2, UpdatesErrorCode.AssetsFailedToLoad);
                        throw new IOException(str, exc2);
                    }
                    createFilenameForAsset = UpdatesUtils.INSTANCE.createFilenameForAsset(assetEntity);
                    File file2 = new File(file, createFilenameForAsset);
                    if (file2.exists()) {
                        assetEntity.setRelativePath(createFilenameForAsset);
                        return new AssetDownloadResult(assetEntity, false);
                    }
                    try {
                        createRequestForAsset = createRequestForAsset(assetEntity, jSONObject, this.configuration);
                        expectedHash = assetEntity.getExpectedHash();
                        if (function1 != null) {
                            try {
                                fileDownloader$sam$expo_modules_updates_loader_FileDownloadProgressListener$0 = new FileDownloader$sam$expo_modules_updates_loader_FileDownloadProgressListener$0(new Function1() { // from class: expo.modules.updates.loader.FileDownloader$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        Unit downloadAsset$lambda$11$lambda$10;
                                        downloadAsset$lambda$11$lambda$10 = FileDownloader.downloadAsset$lambda$11$lambda$10(Function1.this, ((Double) obj2).doubleValue());
                                        return downloadAsset$lambda$11$lambda$10;
                                    }
                                });
                            } catch (Exception e) {
                                assetEntity2 = assetEntity;
                                exc = e;
                                fileDownloader = this;
                                String str2 = "Failed to download asset " + assetEntity2.getKey();
                                fileDownloader.logger.error(str2, exc, UpdatesErrorCode.AssetsFailedToLoad);
                                throw new IOException(str2, exc);
                            }
                        } else {
                            fileDownloader$sam$expo_modules_updates_loader_FileDownloadProgressListener$0 = null;
                        }
                        fileDownloader$sam$expo_modules_updates_loader_FileDownloadProgressListener$02 = fileDownloader$sam$expo_modules_updates_loader_FileDownloadProgressListener$0;
                        fileDownloader$downloadAsset$12.L$0 = assetEntity;
                        fileDownloader$downloadAsset$12.L$1 = createFilenameForAsset;
                        fileDownloader$downloadAsset$12.label = 1;
                        fileDownloader = this;
                    } catch (Exception e2) {
                        e = e2;
                        fileDownloader = this;
                        assetEntity2 = assetEntity;
                        exc = e;
                        String str22 = "Failed to download asset " + assetEntity2.getKey();
                        fileDownloader.logger.error(str22, exc, UpdatesErrorCode.AssetsFailedToLoad);
                        throw new IOException(str22, exc);
                    }
                    try {
                        downloadAssetAndVerifyHashAndWriteToPath = fileDownloader.downloadAssetAndVerifyHashAndWriteToPath(createRequestForAsset, expectedHash, file2, fileDownloader$sam$expo_modules_updates_loader_FileDownloadProgressListener$02, fileDownloader$downloadAsset$12);
                        if (downloadAssetAndVerifyHashAndWriteToPath == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        assetEntity2 = assetEntity;
                        exc = e;
                        String str222 = "Failed to download asset " + assetEntity2.getKey();
                        fileDownloader.logger.error(str222, exc, UpdatesErrorCode.AssetsFailedToLoad);
                        throw new IOException(str222, exc);
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str3 = (String) fileDownloader$downloadAsset$12.L$1;
                    assetEntity2 = (AssetEntity) fileDownloader$downloadAsset$12.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        createFilenameForAsset = str3;
                        assetEntity = assetEntity2;
                        downloadAssetAndVerifyHashAndWriteToPath = obj;
                        fileDownloader = this;
                    } catch (Exception e4) {
                        exc = e4;
                        fileDownloader = this;
                        String str2222 = "Failed to download asset " + assetEntity2.getKey();
                        fileDownloader.logger.error(str2222, exc, UpdatesErrorCode.AssetsFailedToLoad);
                        throw new IOException(str2222, exc);
                    }
                }
                assetEntity.setDownloadTime(new Date());
                assetEntity.setRelativePath(createFilenameForAsset);
                assetEntity.setHash(((FileDownloadResult) downloadAssetAndVerifyHashAndWriteToPath).getHash());
                return new AssetDownloadResult(assetEntity, true);
            }
        }
        fileDownloader$downloadAsset$1 = new FileDownloader$downloadAsset$1(this, continuation);
        FileDownloader$downloadAsset$1 fileDownloader$downloadAsset$122 = fileDownloader$downloadAsset$1;
        Object obj2 = fileDownloader$downloadAsset$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fileDownloader$downloadAsset$122.label;
        if (i != 0) {
        }
        assetEntity.setDownloadTime(new Date());
        assetEntity.setRelativePath(createFilenameForAsset);
        assetEntity.setHash(((FileDownloadResult) downloadAssetAndVerifyHashAndWriteToPath).getHash());
        return new AssetDownloadResult(assetEntity, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit downloadAsset$lambda$11$lambda$10(Function1 function1, double d) {
        function1.invoke(Double.valueOf(d));
        return Unit.INSTANCE;
    }

    static /* synthetic */ Object downloadData$default(FileDownloader fileDownloader, Request request, FileDownloadProgressListener fileDownloadProgressListener, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            fileDownloadProgressListener = null;
        }
        return fileDownloader.downloadData(request, fileDownloadProgressListener, continuation);
    }

    private final Cache getCache() {
        return new Cache(getCacheDirectory(), 52428800);
    }

    private final File getCacheDirectory() {
        return new File(this.filesDirectory, "okhttp");
    }

    public final Request createRequestForAsset(AssetEntity assetEntity, JSONObject extraHeaders, UpdatesConfiguration configuration) {
        Intrinsics.checkNotNullParameter(assetEntity, "assetEntity");
        Intrinsics.checkNotNullParameter(extraHeaders, "extraHeaders");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Request.Builder builder = new Request.Builder();
        Uri url = assetEntity.getUrl();
        Intrinsics.checkNotNull(url);
        String uri = url.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        Request.Builder header = addHeadersFromJSONObject(addHeadersFromJSONObject(builder.url(uri), assetEntity.getExtraRequestHeaders()), extraHeaders).header("Expo-Platform", "android").header("Expo-Protocol-Version", DiskLruCache.VERSION).header("Expo-API-Version", DiskLruCache.VERSION).header("Expo-Updates-Environment", "BARE").header("EAS-Client-ID", this.easClientID);
        for (Map.Entry<String, String> entry : configuration.getRequestHeaders().entrySet()) {
            header.header(entry.getKey(), entry.getValue());
        }
        return header.build();
    }

    private final UpdateResponsePart.ManifestUpdateResponsePart checkCodeSigningAndCreateManifest(String bodyString, JSONObject preManifest, ResponseHeaderData responseHeaderData, ResponsePartHeaderData responsePartHeaderData, JSONObject extensions, String certificateChainFromManifestResponse, UpdatesConfiguration configuration, UpdatesLogger logger) {
        preManifest.put("isVerified", false);
        try {
            CodeSigningConfiguration codeSigningConfiguration = configuration.getCodeSigningConfiguration();
            if (codeSigningConfiguration != null) {
                String signature = responsePartHeaderData.getSignature();
                byte[] bytes = bodyString.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                SignatureValidationResult validateSignature = codeSigningConfiguration.validateSignature(signature, bytes, certificateChainFromManifestResponse);
                if (validateSignature.getValidationResult() == ValidationResult.INVALID) {
                    throw new IOException("Incorrect signature");
                }
                if (validateSignature.getValidationResult() != ValidationResult.SKIPPED) {
                    Manifest manifest = UpdateFactory.INSTANCE.getUpdate(preManifest, responseHeaderData, extensions, configuration).getManifest();
                    ExpoProjectInformation expoProjectInformation = validateSignature.getExpoProjectInformation();
                    if (expoProjectInformation != null && (!Intrinsics.areEqual(expoProjectInformation.getProjectId(), manifest.getEASProjectID()) || !Intrinsics.areEqual(expoProjectInformation.getScopeKey(), manifest.getScopeKey()))) {
                        throw new CertificateException("Code signing certificate project ID or scope key does not match project ID or scope key in response");
                    }
                    UpdatesLogger.info$default(logger, "Manifest code signing signature verified successfully", null, 2, null);
                    preManifest.put("isVerified", true);
                }
            }
            Update update = UpdateFactory.INSTANCE.getUpdate(preManifest, responseHeaderData, extensions, configuration);
            SelectionPolicies selectionPolicies = SelectionPolicies.INSTANCE;
            UpdateEntity updateEntity = update.getUpdateEntity();
            Intrinsics.checkNotNull(updateEntity);
            if (!selectionPolicies.matchesFilters(updateEntity, responseHeaderData.getManifestFilters())) {
                throw new Exception("Manifest filters do not match manifest content for downloaded manifest");
            }
            return new UpdateResponsePart.ManifestUpdateResponsePart(update);
        } catch (Exception e) {
            logger.error("Code signing verification failed for manifest", e, UpdatesErrorCode.UpdateCodeSigningError);
            throw new IOException("Code signing verification failed for manifest", e);
        }
    }

    private final Request.Builder addHeadersFromJSONObject(Request.Builder builder, JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
            for (String str : SequencesKt.asSequence(keys)) {
                Intrinsics.checkNotNull(str);
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                    String string = jSONObject.getString(str);
                    if (string == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                    }
                    jSONObject2 = string;
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                    jSONObject2 = Double.valueOf(jSONObject.getDouble(str));
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                    jSONObject2 = Integer.valueOf(jSONObject.getInt(str));
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                    jSONObject2 = Long.valueOf(jSONObject.getLong(str));
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                    jSONObject2 = Boolean.valueOf(jSONObject.getBoolean(str));
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONArray.class))) {
                    JSONArray jSONArray = jSONObject.getJSONArray(str);
                    if (jSONArray == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                    }
                    jSONObject2 = jSONArray;
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(JSONObject.class))) {
                    JSONObject jSONObject3 = jSONObject.getJSONObject(str);
                    if (jSONObject3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                    }
                    jSONObject2 = jSONObject3;
                } else {
                    jSONObject2 = jSONObject.get(str);
                    if (jSONObject2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                    }
                }
                builder.header(str, jSONObject2.toString());
            }
        }
        return builder;
    }

    public final Request createRequestForRemoteUpdate(JSONObject extraHeaders, UpdatesConfiguration configuration, UpdatesLogger logger) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Request.Builder builder = new Request.Builder();
        String uri = configuration.getUpdateUrl().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        Request.Builder header = addHeadersFromJSONObject(builder.url(uri), extraHeaders).header("Accept", "multipart/mixed,application/expo+json,application/json").header("Expo-Platform", "android").header("Expo-Protocol-Version", DiskLruCache.VERSION).header("Expo-API-Version", DiskLruCache.VERSION).header("Expo-Updates-Environment", "BARE").header("Expo-JSON-Error", "true").header("EAS-Client-ID", this.easClientID);
        String runtimeVersionRaw = configuration.getRuntimeVersionRaw();
        String str = runtimeVersionRaw;
        if (str != null && str.length() != 0) {
            header.header("Expo-Runtime-Version", runtimeVersionRaw);
        }
        String consumeErrorLog = NoDatabaseLauncher.INSTANCE.consumeErrorLog(this.filesDirectory, logger);
        if (consumeErrorLog != null) {
            String substring = consumeErrorLog.substring(0, Math.min(1024, consumeErrorLog.length()));
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            header.header("Expo-Fatal-Error", substring);
        }
        for (Map.Entry<String, String> entry : configuration.getRequestHeaders().entrySet()) {
            header.header(entry.getKey(), entry.getValue());
        }
        CodeSigningConfiguration codeSigningConfiguration = configuration.getCodeSigningConfiguration();
        if (codeSigningConfiguration != null) {
            header.header("expo-expect-signature", codeSigningConfiguration.getAcceptSignatureHeader());
        }
        return header.build();
    }

    /* compiled from: FileDownloader.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ$\u0010\r\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b¨\u0006\u000f"}, d2 = {"Lexpo/modules/updates/loader/FileDownloader$Companion;", "", "<init>", "()V", "getExtraHeadersForRemoteUpdateRequest", "Lorg/json/JSONObject;", "database", "Lexpo/modules/updates/db/UpdatesDatabase;", "configuration", "Lexpo/modules/updates/UpdatesConfiguration;", "launchedUpdate", "Lexpo/modules/updates/db/entity/UpdateEntity;", "embeddedUpdate", "getExtraHeadersForRemoteAssetRequest", "requestedUpdate", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final JSONObject getExtraHeadersForRemoteUpdateRequest(UpdatesDatabase database, UpdatesConfiguration configuration, UpdateEntity launchedUpdate, UpdateEntity embeddedUpdate) {
            Intrinsics.checkNotNullParameter(database, "database");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            JSONObject serverDefinedHeaders = ManifestMetadata.getServerDefinedHeaders(database, configuration);
            if (serverDefinedHeaders == null) {
                serverDefinedHeaders = new JSONObject();
            }
            Map<String, String> extraParams = ManifestMetadata.INSTANCE.getExtraParams(database, configuration);
            if (extraParams != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(extraParams.size()));
                Iterator<T> it = extraParams.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), StringItem.valueOf((String) entry.getValue()));
                }
                serverDefinedHeaders.put("Expo-Extra-Params", Dictionary.valueOf(linkedHashMap).serialize());
            }
            if (launchedUpdate != null) {
                String uuid = launchedUpdate.getId().toString();
                Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                String lowerCase = uuid.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                serverDefinedHeaders.put("Expo-Current-Update-ID", lowerCase);
            }
            if (embeddedUpdate != null) {
                String uuid2 = embeddedUpdate.getId().toString();
                Intrinsics.checkNotNullExpressionValue(uuid2, "toString(...)");
                String lowerCase2 = uuid2.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                serverDefinedHeaders.put("Expo-Embedded-Update-ID", lowerCase2);
            }
            List<UUID> loadRecentUpdateIdsWithFailedLaunch = database.updateDao().loadRecentUpdateIdsWithFailedLaunch();
            if (!loadRecentUpdateIdsWithFailedLaunch.isEmpty()) {
                List<UUID> list = loadRecentUpdateIdsWithFailedLaunch;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(StringItem.valueOf(((UUID) it2.next()).toString()));
                }
                serverDefinedHeaders.put("Expo-Recent-Failed-Update-IDs", OuterList.valueOf(arrayList).serialize());
            }
            return serverDefinedHeaders;
        }

        public final JSONObject getExtraHeadersForRemoteAssetRequest(UpdateEntity launchedUpdate, UpdateEntity embeddedUpdate, UpdateEntity requestedUpdate) {
            JSONObject jSONObject = new JSONObject();
            if (launchedUpdate != null) {
                String uuid = launchedUpdate.getId().toString();
                Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                String lowerCase = uuid.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                jSONObject.put("Expo-Current-Update-ID", lowerCase);
            }
            if (embeddedUpdate != null) {
                String uuid2 = embeddedUpdate.getId().toString();
                Intrinsics.checkNotNullExpressionValue(uuid2, "toString(...)");
                String lowerCase2 = uuid2.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                jSONObject.put("Expo-Embedded-Update-ID", lowerCase2);
            }
            if (requestedUpdate != null) {
                String uuid3 = requestedUpdate.getId().toString();
                Intrinsics.checkNotNullExpressionValue(uuid3, "toString(...)");
                String lowerCase3 = uuid3.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
                jSONObject.put("Expo-Requested-Update-ID", lowerCase3);
            }
            return jSONObject;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object downloadData(Request request, FileDownloadProgressListener fileDownloadProgressListener, Continuation<? super Response> continuation) {
        ResponseBody body;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        final Call newCall = this.client.newCall(request);
        cancellableContinuationImpl2.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: expo.modules.updates.loader.FileDownloader$downloadData$2$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                Call.this.cancel();
            }
        });
        try {
            Response execute = newCall.execute();
            Response response = null;
            if (fileDownloadProgressListener != null && (body = execute.body()) != null) {
                response = execute.newBuilder().body(new FileDownloadProgressResponseBody(body, fileDownloadProgressListener)).build();
            }
            CancellableContinuationImpl cancellableContinuationImpl3 = cancellableContinuationImpl2;
            Result.Companion companion = Result.INSTANCE;
            if (response != null) {
                execute = response;
            }
            cancellableContinuationImpl3.resumeWith(Result.m790constructorimpl(execute));
        } catch (Exception e) {
            Result.Companion companion2 = Result.INSTANCE;
            cancellableContinuationImpl2.resumeWith(Result.m790constructorimpl(ResultKt.createFailure(e)));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
