package com.davidehrmann.vcdiff.util;

import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.util.zip.Adler32;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.msgpack.core.MessagePack;

/* loaded from: classes3.dex */
public class ZeroInitializedAdler32 extends Adler32 {
    static final byte[] ADLER_ZERO = {-26, Ascii.VT, -99, -30, Ascii.ETB, -120, -6, -15, 8, 48, MessagePack.Code.TRUE, 112, 94, 116, -23, 86, -30, MessagePack.Code.FIXARRAY_PREFIX, -118, -90, -85, MessagePack.Code.ARRAY16, -69, -29, 124, 98, -120, MessagePack.Code.FALSE, 106, -80, 56, 33, MessagePack.Code.FALSE, -18, MessagePack.Code.FIXEXT1, 56, 40, 50, -22, Ascii.CR, 3, Ascii.DC2, -114, 45, Ascii.CAN, 122, -95, -104, 117, MessagePack.Code.NIL, 85, -4, MessagePack.Code.FIXARRAY_PREFIX, -11, -16, 38, -82, 125, MessagePack.Code.UINT64, -75, -119, -30, -83, Ascii.DLE, 44, -28, 37, -103, 34, MessagePack.Code.FIXEXT1, 116, 34, MessagePack.Code.UINT64, 33, -124, -97, Ascii.FS, 51, 37, Ascii.GS, 90, 119, -99, -13, 95, -70, 98, 54, -11, -69, 37, 113, 117, -6, Ascii.DC2, -107, -82, MessagePack.Code.FIXEXT4, 86, 46, 10, MessagePack.Code.FIXEXT4, -31, MessagePack.Code.FIXEXT8, -13, 70, 108, -16, 114, 5, -67, -115, Ascii.EM, -99, 41, -79, 35, -108, 90, -69, MessagePack.Code.STR8, 1, 82, 32, 54, 97, -81, 90, MessagePack.Code.UINT16, -85, 48, Ascii.US, -22, -95, 119, MessagePack.Code.FIXEXT4, -9, 104, Ascii.DLE, 70, 33, 90, -78, MessagePack.Code.FIXARRAY_PREFIX, 59, Ascii.ESC, MessagePack.Code.TRUE, 95, -30, -22, 33, 93, MessagePack.Code.NEGFIXINT_PREFIX, 57, Ascii.US, -24, MessagePack.Code.FIXEXT2, 126, MessagePack.Code.UINT16, 5, Ascii.DC4, 75, 124, -108, MessagePack.Code.FLOAT32, -100, Byte.MIN_VALUE, MessagePack.Code.BIN16, 101, 111, 55, MessagePack.Code.FLOAT32, 50, -102, 74, MessagePack.Code.UINT16, 72, MessagePack.Code.FIXEXT16, 50, 36, -92, 36, -2, MessagePack.Code.TRUE, -107, 74, 82, -14, 90, -70, -78, Utf8.REPLACEMENT_BYTE, 9, -97, 0, -75, -79, 47, 67, 77, MessagePack.Code.FALSE, 68, -87, -92, -83, 43, MessagePack.Code.UINT32, -18, MessagePack.Code.EXT8, -68, 62, 42, 114, -86, 56, -106, 126, Ascii.FS, -75, 101, MessagePack.Code.UINT8, 124, -88, -81, 52, -115, -122, -87, -88, MessagePack.Code.TRUE, 7, Ascii.NAK, -103, MessagePack.Code.UINT32, 46, -5, -103, 119, -121, -103, 65, -80, -81, -105, 84, -27, Ascii.EM, Byte.MAX_VALUE, 36, -104, Ascii.SO, 107, 52, 44, -11, -1, Ascii.RS, 0, MessagePack.Code.FIXEXT1, -103, -73, -65, Ascii.SYN, MessagePack.Code.EXT8, 112, -11, -114, -7, -2, -26, -69, 119, Base64.padSymbol, -102, 77, -108, 81, 60, -24, 35, Ascii.SO, -91, 39, 42, -103, 50, -29, MessagePack.Code.FIXEXT2, 79, MessagePack.Code.ARRAY32, -76, -83, -27, -117, -73, 9, MessagePack.Code.UINT64, -94, -111, MessagePack.Code.BIN8, -27, MessagePack.Code.MAP16, -76, 48, 68, 101, -31, 73, 114, Ascii.CAN, -19, 45, MessagePack.Code.BIN16, 43, MessagePack.Code.EXT8, MessagePack.Code.FLOAT64, 4, -9, -72, MessagePack.Code.STR32, 78, Ascii.SO, -19, Ascii.CR, 58, -113, 50, -124, Utf8.REPLACEMENT_BYTE, -68, 0, -123, 86, MessagePack.Code.EXT32, -71, 107, MessagePack.Code.ARRAY32, -10, 49, MessagePack.Code.MAP16, -66, MessagePack.Code.MAP32, 112, 68, MessagePack.Code.INT8, Ascii.DC2, -75, 118, 125, -30, -66, -73, -92, 122, 70, -31, -65, 52, MessagePack.Code.UINT64, MessagePack.Code.NEGFIXINT_PREFIX, 72, 43, -95, 100, 88, Ascii.SO, 17, MessagePack.Code.INT32, -111, 55, 6, 123, 62, -5, -71, Ascii.SI, -72, 67, -69, 83, Ascii.VT, 91, 60, 17, MessagePack.Code.FIXEXT16, 10, -119, 80, 124, -30, MessagePack.Code.FIXEXT4, MessagePack.Code.BIN16, 113, MessagePack.Code.FIXEXT16, Base64.padSymbol, -119, -12, Ascii.SYN, 6, Ascii.VT, -24, Ascii.SI, 40, 71, -6, MessagePack.Code.FIXEXT1, Ascii.DLE, 55, 4, -91, MessagePack.Code.FIXSTR_PREFIX, -118, -74, MessagePack.Code.FLOAT64, 122, -109, 115, -92, 125, -124, 120, -1, -113, MessagePack.Code.STR32, 67, -86, -99, Ascii.ESC, 49, 72, MessagePack.Code.MAP32, -65, 105, 103, 96, 107, -7, MessagePack.Code.INT8, -67, 100, Base64.padSymbol, 33, 44, 66, -121, -103, MessagePack.Code.NIL, -28, -4, 50, -22, -93, -68, -11, 66, MessagePack.Code.EXT32, 69, -119, -121, 68, Ascii.CAN, Ascii.FF, -28, -106, -99, 37, 116, Ascii.SI, 67, 89, 8, 62, -21, -98, 39, -92, -122, 45, 85, -85, -4, -100, -104, MessagePack.Code.FIXEXT4, 79, 43, 55, 56, 0, 93, MessagePack.Code.BIN16, 42, -79, MessagePack.Code.FLOAT32, 93, 55, Ascii.VT, 51, 46, 91, -31, MessagePack.Code.FIXEXT8, 57, 109, -107, 4, 89, MessagePack.Code.FIXEXT16, -70, -16, -125, -111};
    private static final int MOD_ADLER = 65521;
    private volatile int bytesUpdatedModAdler = 0;

    @Override // java.util.zip.Adler32, java.util.zip.Checksum
    public void update(int i) {
        super.update(i);
        addAndModBytesUpdated(1);
    }

    @Override // java.util.zip.Adler32, java.util.zip.Checksum
    public void update(byte[] bArr, int i, int i2) {
        super.update(bArr, i, i2);
        addAndModBytesUpdated(i2);
    }

    @Override // java.util.zip.Adler32, java.util.zip.Checksum
    public void update(byte[] bArr) {
        super.update(bArr);
        addAndModBytesUpdated(bArr.length);
    }

    @Override // java.util.zip.Adler32, java.util.zip.Checksum
    public void update(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[2048];
        while (true) {
            int min = Math.min(2048, byteBuffer.remaining());
            if (min <= 0) {
                return;
            }
            byteBuffer.get(bArr, 0, min);
            update(bArr, 0, min);
        }
    }

    @Override // java.util.zip.Adler32, java.util.zip.Checksum
    public void reset() {
        super.reset();
        this.bytesUpdatedModAdler = 0;
    }

    @Override // java.util.zip.Adler32, java.util.zip.Checksum
    public long getValue() {
        int value = (int) super.getValue();
        int i = ((65535 & value) - 1) % MOD_ADLER;
        int i2 = ((value >>> 16) - this.bytesUpdatedModAdler) % MOD_ADLER;
        if (i2 < 0) {
            i2 += MOD_ADLER;
        }
        if (i < 0) {
            i += MOD_ADLER;
        }
        return ((i2 << 16) | i) & 4294967295L;
    }

    private void addAndModBytesUpdated(int i) {
        this.bytesUpdatedModAdler = (int) ((this.bytesUpdatedModAdler + i) % 65521);
    }
}
