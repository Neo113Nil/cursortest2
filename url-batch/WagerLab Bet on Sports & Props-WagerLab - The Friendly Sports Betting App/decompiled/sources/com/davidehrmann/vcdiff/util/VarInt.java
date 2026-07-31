package com.davidehrmann.vcdiff.util;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: classes3.dex */
public final class VarInt {
    private static final Logger LOGGER = LoggerFactory.getLogger((Class<?>) VarInt.class);

    public static int calculateIntLength(int i) {
        int i2 = 0;
        for (int i3 = 28; i3 >= 0; i3 -= 7) {
            if ((i >> i3) != 0 || i3 == 0) {
                i2++;
            }
        }
        return i2;
    }

    public static int calculateLongLength(long j) {
        int i = 0;
        for (int i2 = 63; i2 >= 0; i2 -= 7) {
            if ((j >> i2) != 0 || i2 == 0) {
                i++;
            }
        }
        return i;
    }

    private VarInt() {
    }

    public static int getInt(ByteBuffer byteBuffer) throws VarIntParseException, VarIntEndOfBufferException {
        int position = byteBuffer.position();
        int i = 0;
        while (byteBuffer.hasRemaining()) {
            if (byteBuffer.position() - position >= 5) {
                throw new VarIntParseException("Data too long for a 32-bit int");
            }
            byte b = byteBuffer.get();
            int i2 = i + (b & Byte.MAX_VALUE);
            if ((b & 128) == 0) {
                return i2;
            }
            if (i2 > 16777215) {
                throw new VarIntParseException("Value too large to fit in an int");
            }
            i = i2 << 7;
        }
        throw new VarIntEndOfBufferException();
    }

    public static long getLong(ByteBuffer byteBuffer) throws VarIntParseException, VarIntEndOfBufferException {
        int position = byteBuffer.position();
        long j = 0;
        while (byteBuffer.hasRemaining()) {
            if (byteBuffer.position() - position >= 10) {
                throw new VarIntParseException("Data too long for a 64-bit int");
            }
            long j2 = j + (r5 & Byte.MAX_VALUE);
            if ((byteBuffer.get() & 128) == 0) {
                if (j2 < 0) {
                    new Exception().printStackTrace();
                }
                return j2;
            }
            if (j2 > 72057594037927935L) {
                throw new VarIntParseException("Value too large to fit in an int");
            }
            j = j2 << 7;
        }
        throw new VarIntEndOfBufferException();
    }

    public static void putInt(ByteBuffer byteBuffer, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(String.format("Value (%d) was negative", Integer.valueOf(i)));
        }
        int i2 = 28;
        while (i2 >= 0) {
            int i3 = i >> i2;
            if (i3 != 0 || i2 == 0) {
                byteBuffer.put((byte) ((i3 & 127) | (i2 == 0 ? 0 : 128)));
            }
            i2 -= 7;
        }
    }

    public static void writeInt(OutputStream outputStream, int i) throws IOException {
        if (i < 0) {
            throw new IllegalArgumentException(String.format("Value (%d) was negative", Integer.valueOf(i)));
        }
        int i2 = 28;
        while (i2 >= 0) {
            int i3 = i >> i2;
            if (i3 != 0 || i2 == 0) {
                outputStream.write((byte) ((i3 & 127) | (i2 == 0 ? 0 : 128)));
            }
            i2 -= 7;
        }
    }

    public static void putLong(ByteBuffer byteBuffer, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(String.format("Value (%d) was negative", Long.valueOf(j)));
        }
        int i = 63;
        while (i >= 0) {
            if ((j >> i) != 0 || i == 0) {
                byteBuffer.put((byte) ((r3 & 127) | (i == 0 ? 0 : 128)));
            }
            i -= 7;
        }
    }

    public static void writeLong(OutputStream outputStream, long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException(String.format("Value (%d) was negative", Long.valueOf(j)));
        }
        int i = 63;
        while (i >= 0) {
            if ((j >> i) != 0 || i == 0) {
                outputStream.write((byte) ((r3 & 127) | (i == 0 ? 0 : 128)));
            }
            i -= 7;
        }
    }

    public static class VarIntParseException extends Exception {
        private static final long serialVersionUID = 2648357489942607161L;

        protected VarIntParseException(String str) {
            super((String) Objects.requireNotNull(str));
        }
    }

    public static class VarIntEndOfBufferException extends Exception {
        private static final long serialVersionUID = -2989212562402509511L;

        protected VarIntEndOfBufferException() {
        }
    }
}
