package io.intercom.android.sdk.lightcompressor.utils;

import android.util.Log;
import com.facebook.react.uimanager.ViewProps;
import io.intercom.android.sdk.lightcompressor.data.AtomsKt;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StreamableVideo.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J \u0010\u0015\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lio/intercom/android/sdk/lightcompressor/utils/StreamableVideo;", "", "<init>", "()V", "tag", "", "ATOM_PREAMBLE_SIZE", "", "start", "", "in", "Ljava/io/File;", "out", "convert", "infile", "Ljava/nio/channels/FileChannel;", "outfile", "safeClose", "", "closeable", "Ljava/io/Closeable;", "readAndFill", "buffer", "Ljava/nio/ByteBuffer;", ViewProps.POSITION, "", "intercom-sdk-lightcompressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class StreamableVideo {
    private static final int ATOM_PREAMBLE_SIZE = 8;
    public static final StreamableVideo INSTANCE = new StreamableVideo();
    private static final String tag = "StreamableVideo";

    private StreamableVideo() {
    }

    public final boolean start(File in, File out) throws IOException {
        FileOutputStream fileOutputStream;
        Intrinsics.checkNotNullParameter(out, "out");
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(in);
            try {
                FileChannel channel = fileInputStream2.getChannel();
                fileOutputStream = new FileOutputStream(out);
                try {
                    FileChannel channel2 = fileOutputStream.getChannel();
                    Intrinsics.checkNotNull(channel);
                    Intrinsics.checkNotNull(channel2);
                    boolean convert = convert(channel, channel2);
                    safeClose(fileInputStream2);
                    safeClose(fileOutputStream);
                    if (!convert) {
                        out.delete();
                    }
                    return convert;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    safeClose(fileInputStream);
                    safeClose(fileOutputStream);
                    out.delete();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00e2 A[LOOP:0: B:2:0x0018->B:103:0x00e2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00e7 A[EDGE_INSN: B:104:0x00e7->B:31:0x00e7 BREAK  A[LOOP:0: B:2:0x0018->B:103:0x00e2], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean convert(FileChannel infile, FileChannel outfile) throws IOException {
        boolean z;
        ByteBuffer byteBuffer;
        ByteBuffer order = ByteBuffer.allocate(8).order(ByteOrder.BIG_ENDIAN);
        long j = 0;
        ByteBuffer byteBuffer2 = null;
        int i = 0;
        long j2 = 0;
        while (true) {
            Intrinsics.checkNotNull(order);
            if (!readAndFill(infile, order)) {
                break;
            }
            j = NumbersUtilsKt.uInt32ToLong(order.getInt());
            i = order.getInt();
            if (i == AtomsKt.getFTYP_ATOM()) {
                int uInt32ToInt = NumbersUtilsKt.uInt32ToInt(j);
                ByteBuffer order2 = ByteBuffer.allocate(uInt32ToInt).order(ByteOrder.BIG_ENDIAN);
                order.rewind();
                order2.put(order);
                if (infile.read(order2) < uInt32ToInt - 8) {
                    byteBuffer2 = order2;
                    break;
                }
                order2.flip();
                j2 = infile.position();
                Unit unit = Unit.INSTANCE;
                byteBuffer2 = order2;
                z = 0;
                byteBuffer = order;
                if (i == AtomsKt.getFREE_ATOM() && i != AtomsKt.getJUNK_ATOM() && i != AtomsKt.getMDAT_ATOM() && i != AtomsKt.getMOOV_ATOM() && i != AtomsKt.getPNOT_ATOM() && i != AtomsKt.getSKIP_ATOM() && i != AtomsKt.getWIDE_ATOM() && i != AtomsKt.getPICT_ATOM() && i != AtomsKt.getUUID_ATOM() && i != AtomsKt.getFTYP_ATOM()) {
                    Log.wtf(tag, "encountered non-QT top-level atom (is this a QuickTime file?)");
                    break;
                }
                if (j >= 8) {
                    break;
                }
                order = byteBuffer;
            } else {
                if (j == 1) {
                    order.clear();
                    if (!readAndFill(infile, order)) {
                        break;
                    }
                    long uInt64ToLong = NumbersUtilsKt.uInt64ToLong(order.getLong());
                    z = 0;
                    infile.position((infile.position() + uInt64ToLong) - 16);
                    byteBuffer = order;
                    j = uInt64ToLong;
                } else {
                    z = 0;
                    byteBuffer = order;
                    infile.position((infile.position() + j) - 8);
                }
                if (i == AtomsKt.getFREE_ATOM()) {
                }
                if (j >= 8) {
                }
            }
        }
        z = 0;
        if (i != AtomsKt.getMOOV_ATOM()) {
            Log.wtf(tag, "last atom in file was not a moov atom");
            return z;
        }
        int uInt32ToInt2 = NumbersUtilsKt.uInt32ToInt(j);
        long j3 = uInt32ToInt2;
        long size = infile.size() - j3;
        ByteBuffer order3 = ByteBuffer.allocate(uInt32ToInt2).order(ByteOrder.BIG_ENDIAN);
        if (!readAndFill(infile, order3, size)) {
            throw new Exception("failed to read moov atom");
        }
        if (order3.getInt(12) == AtomsKt.getCMOV_ATOM()) {
            throw new Exception("this utility does not support compressed moov atoms yet");
        }
        for (int i2 = 8; order3.remaining() >= i2; i2 = 8) {
            int position = order3.position();
            int i3 = order3.getInt(position + 4);
            if (i3 != AtomsKt.getSTCO_ATOM() && i3 != AtomsKt.getCO64_ATOM()) {
                order3.position(order3.position() + 1);
            } else {
                int i4 = uInt32ToInt2;
                long j4 = size;
                if (NumbersUtilsKt.uInt32ToLong(order3.getInt(position)) > order3.remaining()) {
                    throw new Exception("bad atom size");
                }
                order3.position(position + 12);
                if (order3.remaining() < 4) {
                    throw new Exception("malformed atom");
                }
                int uInt32ToInt3 = NumbersUtilsKt.uInt32ToInt(order3.getInt());
                if (i3 == AtomsKt.getSTCO_ATOM()) {
                    Log.i(tag, "patching stco atom...");
                    if (order3.remaining() < uInt32ToInt3 * 4) {
                        throw new Exception("bad atom size/element count");
                    }
                    for (int i5 = z; i5 < uInt32ToInt3; i5++) {
                        int i6 = order3.getInt(order3.position());
                        int i7 = i6 + i4;
                        if (i6 < 0 && i7 >= 0) {
                            throw new Exception("This is bug in original qt-faststart.c: stco atom should be extended to co64 atom as new offset value overflows uint32, but is not implemented.");
                        }
                        order3.putInt(i7);
                    }
                } else if (i3 == AtomsKt.getCO64_ATOM()) {
                    Log.wtf(tag, "patching co64 atom...");
                    if (order3.remaining() < uInt32ToInt3 * 8) {
                        throw new Exception("bad atom size/element count");
                    }
                    for (int i8 = z; i8 < uInt32ToInt3; i8++) {
                        order3.putLong(order3.getLong(order3.position()) + j3);
                    }
                }
                uInt32ToInt2 = i4;
                size = j4;
            }
        }
        long j5 = size;
        infile.position(j2);
        if (byteBuffer2 != null) {
            Log.i(tag, "writing ftyp atom...");
            byteBuffer2.rewind();
            outfile.write(byteBuffer2);
        }
        Log.i(tag, "writing moov atom...");
        order3.rewind();
        outfile.write(order3);
        Log.i(tag, "copying rest of file...");
        infile.transferTo(j2, j5 - j2, outfile);
        return true;
    }

    private final void safeClose(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                Log.wtf(tag, "Failed to close file: ");
            }
        }
    }

    private final boolean readAndFill(FileChannel infile, ByteBuffer buffer) throws IOException {
        buffer.clear();
        int read = infile.read(buffer);
        buffer.flip();
        return read == buffer.capacity();
    }

    private final boolean readAndFill(FileChannel infile, ByteBuffer buffer, long position) throws IOException {
        buffer.clear();
        int read = infile.read(buffer, position);
        buffer.flip();
        return read == buffer.capacity();
    }
}
