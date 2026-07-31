package io.bidmachine.util.network;

import android.content.Context;
import com.safedk.android.internal.partials.BidMachineNetworkBridge;
import io.bidmachine.util.UtilsKt;
import io.bidmachine.util.file.FileUtilsKt;
import java.io.File;
import java.io.InputStream;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FileResponseProcessor.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\bJ\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lio/bidmachine/util/network/FileResponseProcessor;", "Lio/bidmachine/util/network/ResponseProcessor;", "Ljava/io/File;", "context", "Landroid/content/Context;", "file", "(Landroid/content/Context;Ljava/io/File;)V", "tempDir", "(Landroid/content/Context;Ljava/io/File;Ljava/io/File;)V", "applicationContext", "process", "urlConnection", "Ljava/net/URLConnection;", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class FileResponseProcessor implements ResponseProcessor<File> {

    @NotNull
    private final Context applicationContext;

    @NotNull
    private final File file;

    @Nullable
    private final File tempDir;

    public FileResponseProcessor(@NotNull Context context, @NotNull File file, @Nullable File file2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(file, "file");
        this.file = file;
        this.tempDir = file2;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.applicationContext = applicationContext;
    }

    public /* synthetic */ FileResponseProcessor(Context context, File file, File file2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, file, (i & 4) != 0 ? null : file2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FileResponseProcessor(@NotNull Context context, @NotNull File file) {
        this(context, file, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(file, "file");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.util.network.ResponseProcessor
    @NotNull
    public File process(@NotNull URLConnection urlConnection) throws Throwable {
        Intrinsics.checkNotNullParameter(urlConnection, "urlConnection");
        File file = this.tempDir;
        if (file == null) {
            file = this.applicationContext.getCacheDir();
        }
        if (file == null) {
            throw new IllegalStateException("Can't create temp file, temp dir is null");
        }
        file.mkdirs();
        if (!file.exists()) {
            throw new IllegalStateException(("Can't create temp dir " + file.getPath()).toString());
        }
        File createTempFile$default = FileUtilsKt.createTempFile$default(file, null, 1, null);
        long contentLength = urlConnection.getContentLength();
        try {
            InputStream urlConnectionGetInputStream = BidMachineNetworkBridge.urlConnectionGetInputStream(urlConnection);
            Intrinsics.checkNotNullExpressionValue(urlConnectionGetInputStream, "urlConnection.getInputStream()");
            if (UtilsKt.readIntoFile(urlConnectionGetInputStream, createTempFile$default) != contentLength) {
                throw new IllegalStateException("The downloaded file size does not match the stated size");
            }
            File parentFile = this.file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            File parentFile2 = this.file.getParentFile();
            if (parentFile2 == null || !parentFile2.exists()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Can't create target file dir ");
                File parentFile3 = this.file.getParentFile();
                sb.append(parentFile3 != null ? parentFile3.getPath() : null);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (!createTempFile$default.renameTo(this.file) && !FileUtilsKt.hasContent(this.file)) {
                throw new IllegalStateException("Can't rename temp file");
            }
            return this.file;
        } catch (Throwable th) {
            FileUtilsKt.deleteFile(createTempFile$default);
            throw th;
        }
    }
}
