package kotlin.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FileReadWrite.kt */
/* loaded from: classes12.dex */
public abstract class FilesKt__FileReadWriteKt extends FilesKt__FilePathComponentsKt {
    public static byte[] readBytes(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i = (int) length;
            byte[] bArr = new byte[i];
            int i2 = i;
            int i3 = 0;
            while (i2 > 0) {
                int read = fileInputStream.read(bArr, i3, i2);
                if (read < 0) {
                    break;
                }
                i2 -= read;
                i3 += read;
            }
            if (i2 > 0) {
                bArr = Arrays.copyOf(bArr, i3);
                Intrinsics.checkNotNullExpressionValue(bArr, "copyOf(...)");
            } else {
                int read2 = fileInputStream.read();
                if (read2 != -1) {
                    ExposingBufferByteArrayOutputStream exposingBufferByteArrayOutputStream = new ExposingBufferByteArrayOutputStream(8193);
                    exposingBufferByteArrayOutputStream.write(read2);
                    ByteStreamsKt.copyTo$default(fileInputStream, exposingBufferByteArrayOutputStream, 0, 2, null);
                    int size = exposingBufferByteArrayOutputStream.size() + i;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] buffer = exposingBufferByteArrayOutputStream.getBuffer();
                    byte[] copyOf = Arrays.copyOf(bArr, size);
                    Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                    bArr = ArraysKt.copyInto(buffer, copyOf, i, 0, exposingBufferByteArrayOutputStream.size());
                }
            }
            CloseableKt.closeFinally(fileInputStream, null);
            return bArr;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static void writeBytes(File file, byte[] array) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(array);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileOutputStream, null);
        } finally {
        }
    }

    public static void appendBytes(File file, byte[] array) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            fileOutputStream.write(array);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileOutputStream, null);
        } finally {
        }
    }

    public static String readText(File file, Charset charset) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String readText = TextStreamsKt.readText(inputStreamReader);
            CloseableKt.closeFinally(inputStreamReader, null);
            return readText;
        } finally {
        }
    }

    public static /* synthetic */ String readText$default(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return FilesKt.readText(file, charset);
    }

    public static /* synthetic */ void writeText$default(File file, String str, Charset charset, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        FilesKt.writeText(file, str, charset);
    }

    public static void writeText(File file, String text, Charset charset) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            writeTextImpl(fileOutputStream, text, charset);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileOutputStream, null);
        } finally {
        }
    }

    public static final void writeTextImpl(OutputStream outputStream, String text, Charset charset) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (text.length() < 16384) {
            byte[] bytes = text.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            outputStream.write(bytes);
            return;
        }
        CharsetEncoder newReplaceEncoder = newReplaceEncoder(charset);
        CharBuffer allocate = CharBuffer.allocate(8192);
        Intrinsics.checkNotNull(newReplaceEncoder);
        ByteBuffer byteBufferForEncoding = byteBufferForEncoding(8192, newReplaceEncoder);
        int i = 0;
        int i2 = 0;
        while (i < text.length()) {
            int min = Math.min(8192 - i2, text.length() - i);
            int i3 = i + min;
            char[] array = allocate.array();
            Intrinsics.checkNotNullExpressionValue(array, "array(...)");
            text.getChars(i, i3, array, i2);
            allocate.limit(min + i2);
            i2 = 1;
            if (!newReplaceEncoder.encode(allocate, byteBufferForEncoding, i3 == text.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            outputStream.write(byteBufferForEncoding.array(), 0, byteBufferForEncoding.position());
            if (allocate.position() != allocate.limit()) {
                allocate.put(0, allocate.get());
            } else {
                i2 = 0;
            }
            allocate.clear();
            byteBufferForEncoding.clear();
            i = i3;
        }
    }

    public static final CharsetEncoder newReplaceEncoder(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "<this>");
        CharsetEncoder newEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        return newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }

    public static final ByteBuffer byteBufferForEncoding(int i, CharsetEncoder encoder) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        ByteBuffer allocate = ByteBuffer.allocate(i * ((int) Math.ceil(encoder.maxBytesPerChar())));
        Intrinsics.checkNotNullExpressionValue(allocate, "allocate(...)");
        return allocate;
    }

    public static final void forEachLine(File file, Charset charset, Function1 action) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(action, "action");
        TextStreamsKt.forEachLine(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), action);
    }

    public static /* synthetic */ List readLines$default(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return readLines(file, charset);
    }

    public static final List readLines(File file, Charset charset) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        final ArrayList arrayList = new ArrayList();
        forEachLine(file, charset, new Function1() { // from class: kotlin.io.FilesKt__FileReadWriteKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit readLines$lambda$9$FilesKt__FileReadWriteKt;
                readLines$lambda$9$FilesKt__FileReadWriteKt = FilesKt__FileReadWriteKt.readLines$lambda$9$FilesKt__FileReadWriteKt(arrayList, (String) obj);
                return readLines$lambda$9$FilesKt__FileReadWriteKt;
            }
        });
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit readLines$lambda$9$FilesKt__FileReadWriteKt(ArrayList arrayList, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        arrayList.add(it);
        return Unit.INSTANCE;
    }
}
