package com.revenuecat.purchases.paywalls;

import android.content.Context;
import com.facebook.share.internal.ShareConstants;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.UiConfig;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.paywalls.fonts.DownloadableFontInfo;
import com.revenuecat.purchases.paywalls.fonts.DownloadableFontInfoKt;
import com.revenuecat.purchases.utils.DefaultUrlConnectionFactory;
import com.revenuecat.purchases.utils.Result;
import com.revenuecat.purchases.utils.UrlConnection;
import com.revenuecat.purchases.utils.UrlConnectionFactory;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* compiled from: FontLoader.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u0005H\u0002J\u0018\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0005H\u0002J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0005H\u0002J\u0010\u0010*\u001a\u0004\u0018\u00010\u00132\u0006\u0010+\u001a\u00020,J\u0010\u0010-\u001a\u00020\u00122\u0006\u0010.\u001a\u00020/H\u0002JC\u00100\u001a\b\u0012\u0004\u0012\u00020\u0005012\u0006\u0010%\u001a\u00020\u00122\u0006\u00102\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020!2\u0006\u0010+\u001a\u00020\u0015H\u0002J\u0018\u00107\u001a\u00020!2\u0006\u00108\u001a\u0002092\u0006\u0010#\u001a\u00020\u0005H\u0002R\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00170\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u000f\u001a\u0004\b\u001d\u0010\u001eR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006:"}, d2 = {"Lcom/revenuecat/purchases/paywalls/FontLoader;", "", "context", "Landroid/content/Context;", "providedCacheDir", "Ljava/io/File;", "ioScope", "Lkotlinx/coroutines/CoroutineScope;", "urlConnectionFactory", "Lcom/revenuecat/purchases/utils/UrlConnectionFactory;", "(Landroid/content/Context;Ljava/io/File;Lkotlinx/coroutines/CoroutineScope;Lcom/revenuecat/purchases/utils/UrlConnectionFactory;)V", "cacheDirectory", "getCacheDirectory", "()Ljava/io/File;", "cacheDirectory$delegate", "Lkotlin/Lazy;", "cachedFontFamilyByFamilyName", "", "", "Lcom/revenuecat/purchases/paywalls/DownloadedFontFamily;", "cachedFontFamilyByFontInfo", "Lcom/revenuecat/purchases/paywalls/fonts/DownloadableFontInfo;", "fontInfosForHash", "", "hasCheckedFoldersExist", "Ljava/util/concurrent/atomic/AtomicBoolean;", "lock", "md", "Ljava/security/MessageDigest;", "getMd", "()Ljava/security/MessageDigest;", "md$delegate", "addFileToCache", "", "urlHash", "file", "downloadToFile", "url", "outputFile", "ensureFoldersExist", "", "cacheDir", "getCachedFontFamilyOrStartDownload", "fontInfo", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;", "md5Hex", "bytes", "", "performDownloadAndCache", "Lkotlin/Result;", "expectedMd5", ShareConstants.MEDIA_EXTENSION, "performDownloadAndCache-yxL6bBk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/lang/Object;", "startFontDownload", "writeStream", MetricTracker.Object.INPUT, "Ljava/io/InputStream;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FontLoader {

    /* renamed from: cacheDirectory$delegate, reason: from kotlin metadata */
    private final Lazy cacheDirectory;
    private final Map<String, DownloadedFontFamily> cachedFontFamilyByFamilyName;
    private final Map<DownloadableFontInfo, String> cachedFontFamilyByFontInfo;
    private final Context context;
    private final Map<String, Set<DownloadableFontInfo>> fontInfosForHash;
    private AtomicBoolean hasCheckedFoldersExist;
    private final CoroutineScope ioScope;
    private final Object lock;

    /* renamed from: md$delegate, reason: from kotlin metadata */
    private final Lazy md;
    private final File providedCacheDir;
    private final UrlConnectionFactory urlConnectionFactory;

    public FontLoader(Context context, File file, CoroutineScope ioScope, UrlConnectionFactory urlConnectionFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ioScope, "ioScope");
        Intrinsics.checkNotNullParameter(urlConnectionFactory, "urlConnectionFactory");
        this.context = context;
        this.providedCacheDir = file;
        this.ioScope = ioScope;
        this.urlConnectionFactory = urlConnectionFactory;
        this.hasCheckedFoldersExist = new AtomicBoolean(false);
        this.cacheDirectory = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<File>() { // from class: com.revenuecat.purchases.paywalls.FontLoader$cacheDirectory$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final File invoke() {
                File file2;
                Context context2;
                file2 = FontLoader.this.providedCacheDir;
                if (file2 != null) {
                    return file2;
                }
                context2 = FontLoader.this.context;
                File cacheDir = context2.getCacheDir();
                if (cacheDir != null) {
                    return new File(cacheDir, "rc_paywall_fonts");
                }
                return null;
            }
        });
        this.md = LazyKt.lazy(new Function0<MessageDigest>() { // from class: com.revenuecat.purchases.paywalls.FontLoader$md$2
            @Override // kotlin.jvm.functions.Function0
            public final MessageDigest invoke() {
                return MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
            }
        });
        this.fontInfosForHash = new LinkedHashMap();
        this.lock = new Object();
        this.cachedFontFamilyByFontInfo = new LinkedHashMap();
        this.cachedFontFamilyByFamilyName = new LinkedHashMap();
    }

    public /* synthetic */ FontLoader(Context context, File file, CoroutineScope coroutineScope, DefaultUrlConnectionFactory defaultUrlConnectionFactory, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : file, (i & 4) != 0 ? CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO())) : coroutineScope, (i & 8) != 0 ? new DefaultUrlConnectionFactory() : defaultUrlConnectionFactory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getCacheDirectory() {
        return (File) this.cacheDirectory.getValue();
    }

    private final MessageDigest getMd() {
        Object value = this.md.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-md>(...)");
        return (MessageDigest) value;
    }

    public final DownloadedFontFamily getCachedFontFamilyOrStartDownload(UiConfig.AppConfig.FontsConfig.FontInfo.Name fontInfo) {
        Intrinsics.checkNotNullParameter(fontInfo, "fontInfo");
        Result downloadableFontInfo = DownloadableFontInfoKt.toDownloadableFontInfo(fontInfo);
        if (!(downloadableFontInfo instanceof Result.Success)) {
            if (!(downloadableFontInfo instanceof Result.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) ((Result.Error) downloadableFontInfo).getValue(), null);
            return null;
        }
        DownloadableFontInfo downloadableFontInfo2 = (DownloadableFontInfo) ((Result.Success) downloadableFontInfo).getValue();
        synchronized (this.lock) {
            DownloadedFontFamily downloadedFontFamily = this.cachedFontFamilyByFamilyName.get(this.cachedFontFamilyByFontInfo.get(downloadableFontInfo2));
            if (downloadedFontFamily != null) {
                return downloadedFontFamily;
            }
            Unit unit = Unit.INSTANCE;
            startFontDownload(downloadableFontInfo2);
            return null;
        }
    }

    private final void startFontDownload(DownloadableFontInfo fontInfo) {
        BuildersKt__Builders_commonKt.launch$default(this.ioScope, null, null, new FontLoader$startFontDownload$1(this, fontInfo.getUrl(), fontInfo.getExpectedMd5(), fontInfo, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addFileToCache(String urlHash, File file) {
        synchronized (this.lock) {
            Set<DownloadableFontInfo> set = this.fontInfosForHash.get(urlHash);
            if (set == null) {
                set = SetsKt.emptySet();
            }
            for (DownloadableFontInfo downloadableFontInfo : set) {
                String family = downloadableFontInfo.getFamily();
                if (this.cachedFontFamilyByFontInfo.get(downloadableFontInfo) == null) {
                    DownloadedFontFamily downloadedFontFamily = this.cachedFontFamilyByFamilyName.get(family);
                    if (downloadedFontFamily != null) {
                        this.cachedFontFamilyByFamilyName.put(family, new DownloadedFontFamily(downloadedFontFamily.getFamily(), CollectionsKt.plus((Collection<? extends DownloadedFont>) downloadedFontFamily.getFonts(), new DownloadedFont(downloadableFontInfo.getWeight(), downloadableFontInfo.getStyle(), file))));
                        this.cachedFontFamilyByFontInfo.put(downloadableFontInfo, family);
                    } else {
                        DownloadedFontFamily downloadedFontFamily2 = new DownloadedFontFamily(family, CollectionsKt.listOf(new DownloadedFont(downloadableFontInfo.getWeight(), downloadableFontInfo.getStyle(), file)));
                        this.cachedFontFamilyByFontInfo.put(downloadableFontInfo, family);
                        this.cachedFontFamilyByFamilyName.put(family, downloadedFontFamily2);
                    }
                } else {
                    LogLevel logLevel = LogLevel.VERBOSE;
                    LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler.v("[Purchases] - " + logLevel.name(), "Font already cached for " + family + ". Skipping download.");
                    }
                }
            }
            this.fontInfosForHash.remove(urlHash);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean ensureFoldersExist(File cacheDir) {
        boolean z = true;
        if (this.hasCheckedFoldersExist.get()) {
            return true;
        }
        if (cacheDir.exists() || cacheDir.mkdirs()) {
            if (!cacheDir.isDirectory()) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Remote fonts cache path exists but is not a directory: " + cacheDir.getAbsolutePath(), null);
            }
            this.hasCheckedFoldersExist.set(z);
            return z;
        }
        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Unable to create cache directory for remote fonts: " + cacheDir.getAbsolutePath(), null);
        z = false;
        this.hasCheckedFoldersExist.set(z);
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performDownloadAndCache-yxL6bBk, reason: not valid java name */
    public final Object m10618performDownloadAndCacheyxL6bBk(String url, String expectedMd5, String urlHash, String extension, File cacheDir) throws IOException {
        File file = new File(cacheDir, urlHash + '.' + extension);
        File tempFile = File.createTempFile("rc_paywall_font_download_", "." + extension, cacheDir);
        try {
            Intrinsics.checkNotNullExpressionValue(tempFile, "tempFile");
            downloadToFile(url, tempFile);
            String md5Hex = md5Hex(FilesKt.readBytes(tempFile));
            if (!StringsKt.equals(md5Hex, expectedMd5, true)) {
                tempFile.delete();
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Downloaded font file is corrupt for " + url + ". expected=" + expectedMd5 + ", actual=" + md5Hex, null);
                Result.Companion companion = kotlin.Result.INSTANCE;
                return kotlin.Result.m12363constructorimpl(ResultKt.createFailure(new IOException("Downloaded font file is corrupt for " + url)));
            }
            if (!tempFile.renameTo(file)) {
                FilesKt.copyTo$default(tempFile, file, true, 0, 4, null);
                tempFile.delete();
            }
            LogLevel logLevel = LogLevel.DEBUG;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.d("[Purchases] - " + logLevel.name(), "Font downloaded successfully from " + url);
            }
            Result.Companion companion2 = kotlin.Result.INSTANCE;
            return kotlin.Result.m12363constructorimpl(file);
        } catch (IOException e) {
            if (tempFile.exists()) {
                tempFile.delete();
            }
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error downloading font from " + url + ": " + e.getMessage(), null);
            Result.Companion companion3 = kotlin.Result.INSTANCE;
            return kotlin.Result.m12363constructorimpl(ResultKt.createFailure(e));
        }
    }

    private final void writeStream(InputStream input, File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            FileOutputStream fileOutputStream2 = fileOutputStream;
            byte[] bArr = new byte[8192];
            while (true) {
                int read = input.read(bArr);
                if (read >= 0) {
                    fileOutputStream2.write(bArr, 0, read);
                } else {
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileOutputStream, null);
                    return;
                }
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String md5Hex(byte[] bytes) {
        byte[] digest = getMd().digest(bytes);
        Intrinsics.checkNotNullExpressionValue(digest, "digest");
        return ArraysKt.joinToString$default(digest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) new Function1<Byte, CharSequence>() { // from class: com.revenuecat.purchases.paywalls.FontLoader$md5Hex$1
            public final CharSequence invoke(byte b) {
                String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                return format;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ CharSequence invoke(Byte b) {
                return invoke(b.byteValue());
            }
        }, 30, (Object) null);
    }

    private final void downloadToFile(String url, File outputFile) throws IOException {
        LogLevel logLevel = LogLevel.VERBOSE;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.v("[Purchases] - " + logLevel.name(), "Downloading remote font from " + url);
        }
        UrlConnection urlConnection = null;
        try {
            UrlConnection createConnection$default = UrlConnectionFactory.createConnection$default(this.urlConnectionFactory, url, null, 2, null);
            try {
                if (createConnection$default.getResponseCode() != 200) {
                    throw new IOException("HTTP " + createConnection$default.getResponseCode() + " when downloading paywall font: " + url);
                }
                InputStream inputStream = createConnection$default.getInputStream();
                try {
                    writeStream(inputStream, outputFile);
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(inputStream, null);
                    if (createConnection$default != null) {
                        createConnection$default.disconnect();
                    }
                } finally {
                }
            } catch (Throwable th) {
                th = th;
                urlConnection = createConnection$default;
                if (urlConnection != null) {
                    urlConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
