package io.appmetrica.analytics.coreutils.internal.io;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¨\u0006\t"}, d2 = {"Lio/appmetrica/analytics/coreutils/internal/io/InputStreamUtils;", "", "", "limit", "Lkotlin/Function0;", "Ljava/io/InputStream;", "inputStreamProvider", "", "readSafelyApprox", "core-utils_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class InputStreamUtils {

    @NotNull
    public static final InputStreamUtils INSTANCE = new InputStreamUtils();

    private InputStreamUtils() {
    }

    @NotNull
    public final byte[] readSafelyApprox(int limit, @NotNull Function0 inputStreamProvider) {
        try {
            InputStream inputStream = (InputStream) inputStreamProvider.mo4828invoke();
            if (inputStream != null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        try {
                            byte[] bArr = new byte[8192];
                            int i = 0;
                            while (true) {
                                int read = inputStream.read(bArr);
                                if (-1 == read || i > limit) {
                                    break;
                                }
                                if (read > 0) {
                                    byteArrayOutputStream.write(bArr, 0, read);
                                    i += read;
                                }
                            }
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            CloseableKt.closeFinally(byteArrayOutputStream, null);
                            CloseableKt.closeFinally(inputStream, null);
                            return byteArray;
                        } catch (Throwable unused) {
                            Unit unit = Unit.INSTANCE;
                            CloseableKt.closeFinally(byteArrayOutputStream, null);
                            CloseableKt.closeFinally(inputStream, null);
                        }
                    } finally {
                    }
                } finally {
                }
            }
        } catch (Throwable unused2) {
        }
        return new byte[0];
    }
}
