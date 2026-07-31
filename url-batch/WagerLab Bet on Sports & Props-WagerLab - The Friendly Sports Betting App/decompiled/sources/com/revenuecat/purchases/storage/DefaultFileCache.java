package com.revenuecat.purchases.storage;

import android.content.Context;
import com.facebook.cache.disk.DefaultDiskStorage;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.models.Checksum;
import com.revenuecat.purchases.models.ChecksumKt;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* compiled from: DefaultFileRepository.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001&B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\"\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0018\u0010#\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0006H\u0002J \u0010%\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0010\u001a\u00020\u0011*\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012¨\u0006'"}, d2 = {"Lcom/revenuecat/purchases/storage/DefaultFileCache;", "Lcom/revenuecat/purchases/storage/LocalFileCache;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "cacheDir", "Ljava/io/File;", "getCacheDir", "()Ljava/io/File;", "cacheDir$delegate", "Lkotlin/Lazy;", "md", "Ljava/security/MessageDigest;", "getMd", "()Ljava/security/MessageDigest;", "md$delegate", "isFalse", "", "(Z)Z", "cachedContentExists", "uri", "Ljava/net/URI;", "generateLocalFilesystemURI", "remoteURL", "Ljava/net/URL;", "checksum", "Lcom/revenuecat/purchases/models/Checksum;", "md5Hex", "", "bytes", "", "saveData", "", "inputStream", "Ljava/io/InputStream;", "streamToFile", "file", "streamToFileAndCompareChecksum", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultFileCache implements LocalFileCache {
    private static final int BUFFER_SIZE = 262144;

    /* renamed from: cacheDir$delegate, reason: from kotlin metadata */
    private final Lazy cacheDir;
    private final Context context;

    /* renamed from: md$delegate, reason: from kotlin metadata */
    private final Lazy md;

    private final boolean isFalse(boolean z) {
        return !z;
    }

    public DefaultFileCache(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.md = LazyKt.lazy(new Function0<MessageDigest>() { // from class: com.revenuecat.purchases.storage.DefaultFileCache$md$2
            @Override // kotlin.jvm.functions.Function0
            public final MessageDigest invoke() {
                return MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
            }
        });
        this.cacheDir = LazyKt.lazy(new Function0<File>() { // from class: com.revenuecat.purchases.storage.DefaultFileCache$cacheDir$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final File invoke() {
                Context context2;
                context2 = DefaultFileCache.this.context;
                File file = new File(context2.getCacheDir(), "rc_files");
                if (!file.exists()) {
                    file.mkdirs();
                }
                return file;
            }
        });
    }

    private final MessageDigest getMd() {
        Object value = this.md.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-md>(...)");
        return (MessageDigest) value;
    }

    private final File getCacheDir() {
        return (File) this.cacheDir.getValue();
    }

    @Override // com.revenuecat.purchases.storage.LocalFileCache
    public URI generateLocalFilesystemURI(URL remoteURL, Checksum checksum) {
        String str;
        Intrinsics.checkNotNullParameter(remoteURL, "remoteURL");
        String url = remoteURL.toString();
        Intrinsics.checkNotNullExpressionValue(url, "remoteURL.toString()");
        byte[] bytes = url.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        StringBuilder append = new StringBuilder().append(new File(md5Hex(bytes)).getName());
        if (checksum == null || (str = checksum.getValue()) == null) {
            str = "";
        }
        String sb = append.append(str).toString();
        if (sb.length() == 0) {
            return null;
        }
        String path = remoteURL.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "remoteURL.path");
        return new File(getCacheDir(), sb + '.' + StringsKt.substringAfterLast(path, '.', "")).toURI();
    }

    @Override // com.revenuecat.purchases.storage.LocalFileCache
    public boolean cachedContentExists(URI uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return new File(uri).exists();
    }

    @Override // com.revenuecat.purchases.storage.LocalFileCache
    public void saveData(InputStream inputStream, URI uri, Checksum checksum) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(uri, "uri");
        File file = new File(uri);
        File tempFile = File.createTempFile("rc_download_", DefaultDiskStorage.FileType.TEMP, file.getParentFile());
        try {
            if (checksum != null) {
                Intrinsics.checkNotNullExpressionValue(tempFile, "tempFile");
                if (isFalse(streamToFileAndCompareChecksum(inputStream, tempFile, checksum))) {
                    return;
                }
            } else {
                Intrinsics.checkNotNullExpressionValue(tempFile, "tempFile");
                streamToFile(inputStream, tempFile);
            }
            if (!tempFile.renameTo(file)) {
                try {
                    FilesKt.copyTo$default(tempFile, file, true, 0, 4, null);
                } catch (Exception e) {
                    LogLevel logLevel = LogLevel.VERBOSE;
                    LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler.v("[Purchases] - " + logLevel.name(), "Failed to copy temp file to final file: " + e.getMessage());
                    }
                    file.delete();
                }
            }
        } finally {
            tempFile.delete();
        }
    }

    private final String md5Hex(byte[] bytes) {
        byte[] digest = getMd().digest(bytes);
        Intrinsics.checkNotNullExpressionValue(digest, "md.digest(bytes)");
        return ArraysKt.joinToString$default(digest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) new Function1<Byte, CharSequence>() { // from class: com.revenuecat.purchases.storage.DefaultFileCache$md5Hex$1
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

    private final void streamToFile(InputStream inputStream, File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            ByteStreamsKt.copyTo(inputStream, fileOutputStream, 262144);
            CloseableKt.closeFinally(fileOutputStream, null);
        } finally {
        }
    }

    private final boolean streamToFileAndCompareChecksum(InputStream inputStream, File file, Checksum checksum) throws IOException {
        MessageDigest messageDigest = MessageDigest.getInstance(checksum.getAlgorithm().getAlgorithmName());
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            FileOutputStream fileOutputStream2 = fileOutputStream;
            byte[] bArr = new byte[262144];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    messageDigest.update(bArr, 0, read);
                    fileOutputStream2.write(bArr, 0, read);
                } else {
                    fileOutputStream2.flush();
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileOutputStream, null);
                    byte[] hash = messageDigest.digest();
                    Checksum.Algorithm algorithm = checksum.getAlgorithm();
                    Intrinsics.checkNotNullExpressionValue(hash, "hash");
                    return Intrinsics.areEqual(checksum, new Checksum(algorithm, ChecksumKt.toHexString(hash)));
                }
            }
        } finally {
        }
    }
}
