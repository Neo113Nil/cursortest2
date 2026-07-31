package com.yandex.div.internal.util;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.div.core.annotations.InternalApi;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.Charset;

@InternalApi
/* loaded from: classes5.dex */
public final class IOUtils {
    private static final int BUFFER_SIZE = 2048;

    private IOUtils() {
    }

    public static void closeSilently(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void closeCursorSilently(@Nullable Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    public static void flushSilently(@Nullable OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.flush();
            } catch (IOException unused) {
            }
        }
    }

    @Nullable
    public static byte[] toByteArray(@Nullable InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[2048];
        while (true) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    @NonNull
    public static String toString(@NonNull InputStream inputStream) throws IOException {
        char[] cArr = new char[2048];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder(inputStream.available());
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read != -1) {
                sb.append(cArr, 0, read);
            } else {
                return sb.toString();
            }
        }
    }

    @NonNull
    public static String toString(@NonNull InputStream inputStream, @NonNull Charset charset) throws IOException {
        char[] cArr = new char[2048];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, charset));
        StringBuilder sb = new StringBuilder(inputStream.available());
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read != -1) {
                sb.append(cArr, 0, read);
            } else {
                return sb.toString();
            }
        }
    }
}
