package com.davidehrmann.vcdiff;

import com.davidehrmann.vcdiff.engine.VCDiffStreamingDecoderImpl;
import com.davidehrmann.vcdiff.io.VCDiffInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class VCDiffDecoderBuilder {
    protected long maximumTargetFileSize = -1;
    protected int maximumTargetWindowSize = -1;
    protected boolean allowTargetMatches = true;

    protected VCDiffDecoderBuilder() {
    }

    public synchronized VCDiffDecoderBuilder withMaxTargetFileSize(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("maximumTargetFileSize can't be negative");
        }
        this.maximumTargetFileSize = j;
        return this;
    }

    public synchronized VCDiffDecoderBuilder withMaxTargetWindowSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("maximumTargetWindowSize can't be negative");
        }
        this.maximumTargetWindowSize = i;
        return this;
    }

    public synchronized VCDiffDecoderBuilder withAllowTargetMatches(boolean z) {
        this.allowTargetMatches = z;
        return this;
    }

    public VCDiffStreamingDecoder buildStreaming() {
        return buildStreaming(new VCDiffStreamingDecoderImpl());
    }

    public synchronized VCDiffStreamingDecoder buildStreaming(VCDiffStreamingDecoder vCDiffStreamingDecoder) {
        long j = this.maximumTargetFileSize;
        if (j >= 0) {
            vCDiffStreamingDecoder.setMaximumTargetFileSize(j);
        }
        int i = this.maximumTargetWindowSize;
        if (i >= 0) {
            vCDiffStreamingDecoder.setMaximumTargetWindowSize(i);
        }
        vCDiffStreamingDecoder.setAllowVcdTarget(this.allowTargetMatches);
        return vCDiffStreamingDecoder;
    }

    public VCDiffInputStream buildInputStream(InputStream inputStream, byte[] bArr) {
        return buildInputStream(inputStream, ByteBuffer.wrap(bArr));
    }

    public VCDiffInputStream buildInputStream(InputStream inputStream, ByteBuffer byteBuffer) {
        return new VCDiffInputStream(inputStream, byteBuffer, buildStreaming());
    }

    public VCDiffDecoder buildSimple() {
        return new VCDiffDecoder(buildStreaming());
    }

    public VCDiffDecoder buildSimple(VCDiffStreamingDecoder vCDiffStreamingDecoder) {
        return new VCDiffDecoder(buildStreaming(vCDiffStreamingDecoder));
    }

    public static VCDiffDecoderBuilder builder() {
        return new VCDiffDecoderBuilder();
    }
}
