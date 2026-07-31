package com.davidehrmann.vcdiff;

import com.davidehrmann.vcdiff.engine.HashedDictionary;
import com.davidehrmann.vcdiff.engine.JSONCodeTableWriter;
import com.davidehrmann.vcdiff.engine.VCDiffCodeTableWriterImpl;
import com.davidehrmann.vcdiff.engine.VCDiffStreamingEncoderImpl;
import com.davidehrmann.vcdiff.io.VCDiffOutputStream;
import java.io.OutputStream;
import java.util.EnumSet;

/* loaded from: classes3.dex */
public class VCDiffEncoderBuilder {
    protected boolean interleaved = false;
    protected boolean checksum = false;
    protected boolean targetMatches = true;
    protected byte[] dictionary = null;

    protected VCDiffEncoderBuilder() {
    }

    public synchronized VCDiffEncoderBuilder withChecksum(boolean z) {
        this.checksum = z;
        return this;
    }

    public synchronized VCDiffEncoderBuilder withInterleaving(boolean z) {
        this.interleaved = z;
        return this;
    }

    public synchronized VCDiffEncoderBuilder withDictionary(byte[] bArr) {
        this.dictionary = bArr;
        return this;
    }

    public synchronized VCDiffEncoderBuilder withTargetMatches(boolean z) {
        this.targetMatches = z;
        return this;
    }

    public synchronized VCDiffStreamingEncoder<OutputStream> buildStreaming() {
        EnumSet noneOf;
        if (this.dictionary == null) {
            throw new IllegalArgumentException("dictionary not set");
        }
        noneOf = EnumSet.noneOf(VCDiffFormatExtension.class);
        if (this.interleaved) {
            noneOf.add(VCDiffFormatExtension.GOOGLE_INTERLEAVED);
        }
        if (this.checksum) {
            noneOf.add(VCDiffFormatExtension.GOOGLE_CHECKSUM);
        }
        return new VCDiffStreamingEncoderImpl(new VCDiffCodeTableWriterImpl(this.interleaved), new HashedDictionary(this.dictionary), noneOf, this.targetMatches);
    }

    public VCDiffOutputStream buildOutputStream(OutputStream outputStream) {
        return new VCDiffOutputStream(outputStream, buildStreaming());
    }

    public synchronized VCDiffStreamingEncoder<Appendable> buildStreamingJson() {
        if (this.dictionary == null) {
            throw new IllegalArgumentException("dictionary not set");
        }
        if (this.interleaved) {
            throw new IllegalArgumentException("Interleaved not supported with JSON encoder");
        }
        if (this.checksum) {
            throw new IllegalArgumentException("Checksum not supported with JSON encoder");
        }
        return new VCDiffStreamingEncoderImpl(new JSONCodeTableWriter(), new HashedDictionary(this.dictionary), EnumSet.noneOf(VCDiffFormatExtension.class), this.targetMatches);
    }

    public VCDiffEncoder<OutputStream> buildSimple() {
        return new VCDiffEncoder<>(buildStreaming());
    }

    public VCDiffEncoder<Appendable> buildSimpleJson() {
        return new VCDiffEncoder<>(buildStreamingJson());
    }

    public static VCDiffEncoderBuilder builder() {
        return new VCDiffEncoderBuilder();
    }
}
