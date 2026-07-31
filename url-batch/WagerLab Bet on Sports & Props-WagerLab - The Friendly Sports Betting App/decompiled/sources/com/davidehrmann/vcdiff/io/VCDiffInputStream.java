package com.davidehrmann.vcdiff.io;

import com.davidehrmann.vcdiff.VCDiffDecoderBuilder;
import com.davidehrmann.vcdiff.VCDiffStreamingDecoder;
import com.davidehrmann.vcdiff.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class VCDiffInputStream extends InputStream {
    public static final boolean DEFAULT_ALLOW_VCD_TARGET = false;
    public static final int DEFAULT_MAX_TARGET_FILE_SIZE = 67108864;
    public static final int DEFAULT_MAX_TARGET_WINDOW_SIZE = 67108864;
    private volatile boolean closed;
    private volatile ByteBuffer decodedBuffer;
    private final VCDiffStreamingDecoder decoder;
    private volatile boolean decodingStarted;
    private final ByteBuffer dictionary;
    private final InputStream in;
    private final byte[] inBuffer;
    private final ByteArrayOutputStream tempDecoded;
    private volatile long totalBytesRead;

    @Override // java.io.InputStream
    public void mark(int i) {
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    public VCDiffInputStream(InputStream inputStream, byte[] bArr) {
        this(inputStream, bArr, 67108864L, 67108864, false);
    }

    public VCDiffInputStream(InputStream inputStream, byte[] bArr, long j, int i, boolean z) {
        this((InputStream) Objects.requireNotNull(inputStream, "in was null"), ByteBuffer.wrap((byte[]) ((byte[]) Objects.requireNotNull(bArr, "dictionary was null")).clone()), VCDiffDecoderBuilder.builder().withMaxTargetFileSize(j).withMaxTargetWindowSize(i).withAllowTargetMatches(z).buildStreaming());
    }

    public VCDiffInputStream(InputStream inputStream, byte[] bArr, VCDiffStreamingDecoder vCDiffStreamingDecoder) {
        this(inputStream, ByteBuffer.wrap((byte[]) ((byte[]) Objects.requireNotNull(bArr, "dictionary was null")).clone()), vCDiffStreamingDecoder);
    }

    public VCDiffInputStream(InputStream inputStream, ByteBuffer byteBuffer, VCDiffStreamingDecoder vCDiffStreamingDecoder) {
        this.inBuffer = new byte[4096];
        this.totalBytesRead = 0L;
        this.decodedBuffer = ByteBuffer.allocate(0);
        this.tempDecoded = new ByteArrayOutputStream();
        this.decodingStarted = false;
        this.closed = false;
        this.in = (InputStream) Objects.requireNotNull(inputStream, "in was null");
        this.decoder = (VCDiffStreamingDecoder) Objects.requireNotNull(vCDiffStreamingDecoder, "decoder was null");
        this.dictionary = (ByteBuffer) Objects.requireNotNull(byteBuffer, "dictionary was null");
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        fillDecodedBuffer();
        if (this.decodedBuffer.hasRemaining()) {
            return this.decodedBuffer.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        fillDecodedBuffer();
        if (!this.decodedBuffer.hasRemaining()) {
            return -1;
        }
        int min = Math.min(i2, this.decodedBuffer.remaining());
        this.decodedBuffer.get(bArr, i, min);
        return min;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        long j2 = 0;
        while (j2 < j) {
            fillDecodedBuffer();
            if (!this.decodedBuffer.hasRemaining()) {
                break;
            }
            if (this.decodedBuffer.remaining() + j2 < j) {
                j2 += this.decodedBuffer.remaining();
                this.decodedBuffer.position(this.decodedBuffer.position() + this.decodedBuffer.remaining());
            } else {
                this.decodedBuffer.position(this.decodedBuffer.position() + ((int) (j - j2)));
                return j;
            }
        }
        return j2;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.decodedBuffer.remaining();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            this.in.close();
        } finally {
            this.closed = true;
        }
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        throw new IOException("Mark not supported");
    }

    private void fillDecodedBuffer() throws IOException {
        if (this.closed) {
            throw new IOException("InputStream is closed");
        }
        while (!this.decodedBuffer.hasRemaining()) {
            int read = this.in.read(this.inBuffer);
            if (read >= 0) {
                long j = read;
                this.totalBytesRead += j;
                if (!this.decodingStarted) {
                    this.decoder.startDecoding(this.dictionary);
                    this.decodingStarted = true;
                }
                try {
                    this.decoder.decodeChunk(this.inBuffer, 0, read, this.tempDecoded);
                    if (this.tempDecoded.size() > 0) {
                        this.decodedBuffer = ByteBuffer.wrap(this.tempDecoded.toByteArray());
                        this.tempDecoded.reset();
                    }
                } catch (IOException e) {
                    throw new IOException(String.format("Error trying to decode data chunk starting at offset %d: %s", Long.valueOf(this.totalBytesRead - j), e.getMessage()), e);
                }
            } else {
                this.decoder.finishDecoding();
                return;
            }
        }
    }
}
