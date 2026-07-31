package com.davidehrmann.vcdiff.engine;

import com.davidehrmann.vcdiff.engine.VCDiffHeaderParser;
import com.davidehrmann.vcdiff.engine.VCDiffStreamingDecoderImpl;
import com.davidehrmann.vcdiff.util.Objects;
import com.davidehrmann.vcdiff.util.VarInt;
import com.davidehrmann.vcdiff.util.ZeroInitializedAdler32;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.Adler32;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: classes3.dex */
class VCDiffDeltaFileWindow {
    private static final Logger LOGGER = LoggerFactory.getLogger((Class<?>) VCDiffDeltaFileWindow.class);
    private ByteBuffer addressesForCopy;
    private ByteBuffer dataForAddAndRun;
    private boolean foundHeader;
    private boolean hasChecksum;
    private ByteBuffer instructionsAndSizes;
    private int interleavedBytesExpected;
    private final VCDiffStreamingDecoderImpl parent;
    private ByteBuffer sourceSegment;
    private Integer targetWindowLength;
    private int targetWindowStartPos;
    private final AtomicInteger sourceSegmentLength = new AtomicInteger(0);
    private final AtomicInteger expectedChecksum = new AtomicInteger(0);
    private final Adler32 adler32 = new ZeroInitializedAdler32();
    private VCDiffCodeTableReader reader = new VCDiffCodeTableReader();

    public VCDiffDeltaFileWindow(VCDiffStreamingDecoderImpl vCDiffStreamingDecoderImpl) {
        this.parent = (VCDiffStreamingDecoderImpl) Objects.requireNotNull(vCDiffStreamingDecoderImpl, "parent was null");
        Reset();
    }

    public void Reset() {
        this.foundHeader = false;
        VCDiffStreamingDecoderImpl vCDiffStreamingDecoderImpl = this.parent;
        this.targetWindowStartPos = vCDiffStreamingDecoderImpl != null ? vCDiffStreamingDecoderImpl.decodedTarget().size() : 0;
        this.targetWindowLength = 0;
        this.sourceSegment = null;
        this.sourceSegmentLength.set(0);
        this.instructionsAndSizes = null;
        this.dataForAddAndRun = null;
        this.addressesForCopy = null;
        this.interleavedBytesExpected = 0;
        this.hasChecksum = false;
        this.expectedChecksum.set(0);
    }

    public void useCodeTable(VCDiffCodeTableData vCDiffCodeTableData, short s) {
        this.reader = new VCDiffCodeTableReader(vCDiffCodeTableData, s);
    }

    public int DecodeWindow(ByteBuffer byteBuffer) throws IOException {
        if (!this.foundHeader) {
            if (readHeader(byteBuffer) == -2) {
                return -2;
            }
            this.parent.addrCache().Init();
        } else {
            if (!isInterleaved()) {
                throw new IOException("Internal error: Resumed decoding of a delta file window when interleaved format is not being used");
            }
            updateInterleavedSectionPointers(byteBuffer);
            this.reader.updatePointers(this.instructionsAndSizes);
        }
        if (decodeBody(byteBuffer) == -2) {
            if (moreDataExpected()) {
                return -2;
            }
            throw new IOException("End of data reached while decoding VCDIFF delta file");
        }
        Reset();
        return 0;
    }

    public boolean FoundWindowHeader() {
        return this.foundHeader;
    }

    public boolean moreDataExpected() {
        return isInterleaved() && this.interleavedBytesExpected > 0;
    }

    public int targetWindowStartPos() {
        return this.targetWindowStartPos;
    }

    public void setTargetWindowStartPos(int i) {
        this.targetWindowStartPos = i;
    }

    public int targetBytesRemaining() {
        if (this.targetWindowLength.intValue() == 0) {
            return 0;
        }
        return this.targetWindowLength.intValue() - targetBytesDecoded();
    }

    private int readHeader(ByteBuffer byteBuffer) throws IOException {
        VCDiffStreamingDecoderImpl.DecoratedByteArrayOutputStream decodedTarget = this.parent.decodedTarget();
        VCDiffHeaderParser vCDiffHeaderParser = new VCDiffHeaderParser(byteBuffer.slice());
        VCDiffHeaderParser.DeltaWindowHeader parseWinIndicatorAndSourceSegment = vCDiffHeaderParser.parseWinIndicatorAndSourceSegment(this.parent.dictionary_ptr().limit(), decodedTarget.size(), this.parent.allowVcdTarget());
        if (parseWinIndicatorAndSourceSegment == null) {
            return vCDiffHeaderParser.getResult();
        }
        this.sourceSegmentLength.set(parseWinIndicatorAndSourceSegment.source_segment_length);
        this.hasChecksum = this.parent.allowChecksum() && (parseWinIndicatorAndSourceSegment.win_indicator & 4) != 0;
        Integer ParseWindowLengths = vCDiffHeaderParser.ParseWindowLengths();
        this.targetWindowLength = ParseWindowLengths;
        if (ParseWindowLengths == null) {
            return vCDiffHeaderParser.getResult();
        }
        this.parent.targetWindowWouldExceedSizeLimits(ParseWindowLengths.intValue());
        vCDiffHeaderParser.parseDeltaIndicator();
        int upWindowSections = setUpWindowSections(vCDiffHeaderParser);
        if (upWindowSections != 0) {
            return upWindowSections;
        }
        if ((parseWinIndicatorAndSourceSegment.win_indicator & 1) != 0) {
            ByteBuffer byteBuffer2 = (ByteBuffer) this.parent.dictionary_ptr().duplicate().rewind();
            this.sourceSegment = byteBuffer2;
            byteBuffer2.position(parseWinIndicatorAndSourceSegment.source_segment_position);
        } else if ((parseWinIndicatorAndSourceSegment.win_indicator & 2) != 0) {
            ByteBuffer byteBuffer3 = decodedTarget.toByteBuffer();
            this.sourceSegment = byteBuffer3;
            byteBuffer3.position(parseWinIndicatorAndSourceSegment.source_segment_position);
        }
        this.foundHeader = true;
        byteBuffer.position(byteBuffer.position() + vCDiffHeaderParser.unparsedData().position());
        this.parent.addToTotalTargetWindowSize(this.targetWindowLength.intValue());
        return 0;
    }

    private int setUpWindowSections(VCDiffHeaderParser vCDiffHeaderParser) throws IOException {
        VCDiffHeaderParser.SectionLengths parseSectionLengths = vCDiffHeaderParser.parseSectionLengths(this.hasChecksum);
        if (parseSectionLengths == null) {
            return vCDiffHeaderParser.getResult();
        }
        int calculateIntLength = VarInt.calculateIntLength(this.targetWindowLength.intValue()) + 1 + VarInt.calculateIntLength(parseSectionLengths.add_and_run_data_length) + VarInt.calculateIntLength(parseSectionLengths.addresses_length) + VarInt.calculateIntLength(parseSectionLengths.instructions_and_sizes_length) + parseSectionLengths.add_and_run_data_length + parseSectionLengths.addresses_length + parseSectionLengths.instructions_and_sizes_length;
        if (this.hasChecksum) {
            this.expectedChecksum.set(parseSectionLengths.checksum);
            calculateIntLength += VarInt.calculateIntLength(parseSectionLengths.checksum);
        }
        if (this.parent.allowInterleaved() && parseSectionLengths.add_and_run_data_length == 0 && parseSectionLengths.addresses_length == 0) {
            this.interleavedBytesExpected = parseSectionLengths.instructions_and_sizes_length;
            updateInterleavedSectionPointers(vCDiffHeaderParser.unparsedData());
        } else {
            if (vCDiffHeaderParser.unparsedData().remaining() < parseSectionLengths.add_and_run_data_length + parseSectionLengths.instructions_and_sizes_length + parseSectionLengths.addresses_length) {
                return -2;
            }
            ByteBuffer slice = vCDiffHeaderParser.unparsedData().slice();
            this.dataForAddAndRun = slice;
            slice.position(parseSectionLengths.add_and_run_data_length);
            ByteBuffer slice2 = this.dataForAddAndRun.slice();
            this.instructionsAndSizes = slice2;
            slice2.position(parseSectionLengths.instructions_and_sizes_length);
            ByteBuffer slice3 = this.instructionsAndSizes.slice();
            this.addressesForCopy = slice3;
            slice3.position(parseSectionLengths.addresses_length);
            this.dataForAddAndRun.flip();
            this.instructionsAndSizes.flip();
            this.addressesForCopy.flip();
            if (vCDiffHeaderParser.deltaEncodingLength.intValue() != calculateIntLength) {
                throw new IOException("The end of the instructions section does not match the end of the delta window");
            }
        }
        this.reader.init(this.instructionsAndSizes);
        return 0;
    }

    private int decodeBody(ByteBuffer byteBuffer) throws IOException {
        int decodeAdd;
        isInterleaved();
        while (targetBytesDecoded() < this.targetWindowLength.intValue()) {
            AtomicInteger atomicInteger = new AtomicInteger(0);
            AtomicInteger atomicInteger2 = new AtomicInteger(0);
            byte nextInstruction = this.reader.getNextInstruction(atomicInteger, atomicInteger2);
            if (nextInstruction == 5) {
                updateInstructionPointer(byteBuffer);
                return -2;
            }
            int i = atomicInteger.get();
            if (i > this.targetWindowLength.intValue() || targetBytesDecoded() + i > this.targetWindowLength.intValue()) {
                throw new IOException(String.format("%s with size %d plus existing %d bytes of target data exceeds length of target window (%d bytes)", VCDiffCodeTableData.VCDiffInstructionName(nextInstruction), Integer.valueOf(i), Integer.valueOf(targetBytesDecoded()), this.targetWindowLength));
            }
            if (nextInstruction == 1) {
                decodeAdd = decodeAdd(i);
            } else if (nextInstruction == 2) {
                decodeAdd = decodeRun(i);
            } else if (nextInstruction == 3) {
                decodeAdd = decodeCopy(i, (short) atomicInteger2.get());
            } else {
                throw new IOException("Unexpected instruction type " + ((int) nextInstruction) + " in opcode stream");
            }
            if (decodeAdd == -2) {
                this.reader.unGetInstruction();
                updateInstructionPointer(byteBuffer);
                return -2;
            }
        }
        if (targetBytesDecoded() != this.targetWindowLength.intValue()) {
            throw new IOException(String.format("Decoded target window size (%d bytes) does not match expected size (%d bytes)", Integer.valueOf(targetBytesDecoded()), this.targetWindowLength));
        }
        if (this.hasChecksum) {
            this.adler32.update(this.parent.decodedTarget().getBuffer(), this.targetWindowStartPos, this.targetWindowLength.intValue());
            int value = (int) this.adler32.getValue();
            this.adler32.reset();
            if (value != this.expectedChecksum.get()) {
                throw new IOException("Target data does not match checksum; this could mean that the wrong dictionary was used");
            }
        }
        if (this.instructionsAndSizes.hasRemaining()) {
            throw new IOException("Excess instructions and sizes left over after decoding target window");
        }
        if (!isInterleaved()) {
            if (this.dataForAddAndRun.hasRemaining()) {
                throw new IOException("Excess ADD/RUN data left over after decoding target window");
            }
            if (this.addressesForCopy.hasRemaining()) {
                throw new IOException("Excess COPY addresses left over after decoding target window");
            }
            byteBuffer.position(byteBuffer.position() + this.instructionsAndSizes.limit() + this.dataForAddAndRun.limit() + this.addressesForCopy.limit());
        } else {
            updateInstructionPointer(byteBuffer);
        }
        return 0;
    }

    private int targetBytesDecoded() {
        return this.parent.decodedTarget().size() - this.targetWindowStartPos;
    }

    private int decodeAdd(int i) {
        if (i > this.dataForAddAndRun.remaining()) {
            return -2;
        }
        copyBytes(this.dataForAddAndRun, i);
        return 0;
    }

    private int decodeRun(int i) {
        if (!this.dataForAddAndRun.hasRemaining()) {
            return -2;
        }
        runByte(this.dataForAddAndRun.get(), i);
        return 0;
    }

    private int decodeCopy(int i, short s) throws IOException {
        int targetBytesDecoded = targetBytesDecoded();
        int i2 = this.sourceSegmentLength.get() + targetBytesDecoded;
        try {
            int DecodeAddress = this.parent.addrCache().DecodeAddress(i2, s, this.addressesForCopy);
            if (DecodeAddress == -2) {
                return -2;
            }
            if (DecodeAddress < 0 || DecodeAddress > i2) {
                throw new IllegalStateException(String.format("Internal error: unexpected address %d returned from DecodeAddress, with here_address = %d", Integer.valueOf(DecodeAddress), Integer.valueOf(i2)));
            }
            if (DecodeAddress + i <= this.sourceSegmentLength.get()) {
                copyBytes((ByteBuffer) this.sourceSegment.slice().position(DecodeAddress), i);
                return 0;
            }
            if (DecodeAddress < this.sourceSegmentLength.get()) {
                int i3 = this.sourceSegmentLength.get() - DecodeAddress;
                copyBytes((ByteBuffer) this.sourceSegment.slice().position(DecodeAddress), i3);
                targetBytesDecoded += i3;
                DecodeAddress += i3;
                i -= i3;
            }
            int i4 = DecodeAddress - this.sourceSegmentLength.get();
            ByteBuffer byteBuffer = this.parent.decodedTarget().toByteBuffer();
            byteBuffer.position(this.targetWindowStartPos);
            while (true) {
                int i5 = targetBytesDecoded - i4;
                if (i > i5) {
                    copyBytes((ByteBuffer) byteBuffer.slice().position(i4), i5);
                    targetBytesDecoded += i5;
                    i4 += i5;
                    i -= i5;
                    byteBuffer = this.parent.decodedTarget().toByteBuffer();
                    byteBuffer.position(this.targetWindowStartPos);
                } else {
                    copyBytes((ByteBuffer) byteBuffer.slice().position(i4), i);
                    return 0;
                }
            }
        } catch (IOException e) {
            new IOException("Unable to decode address for COPY").initCause(e);
            throw e;
        }
    }

    private void updateInterleavedSectionPointers(ByteBuffer byteBuffer) {
        ByteBuffer slice = byteBuffer.slice();
        this.instructionsAndSizes = slice;
        int remaining = slice.remaining();
        int i = this.interleavedBytesExpected;
        if (remaining > i) {
            this.instructionsAndSizes.limit(i);
        }
        ByteBuffer byteBuffer2 = this.instructionsAndSizes;
        this.dataForAddAndRun = byteBuffer2;
        this.addressesForCopy = byteBuffer2;
    }

    private boolean isInterleaved() {
        ByteBuffer byteBuffer = this.addressesForCopy;
        ByteBuffer byteBuffer2 = this.instructionsAndSizes;
        return byteBuffer == byteBuffer2 && this.dataForAddAndRun == byteBuffer2;
    }

    private void copyBytes(ByteBuffer byteBuffer, int i) {
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                return;
            }
            this.parent.decodedTarget().write(byteBuffer.get());
            i = i2;
        }
    }

    private void runByte(byte b, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            this.parent.decodedTarget().write(b);
        }
    }

    private void updateInstructionPointer(ByteBuffer byteBuffer) {
        if (isInterleaved()) {
            int position = this.instructionsAndSizes.position();
            this.interleavedBytesExpected -= position;
            byteBuffer.position(byteBuffer.position() + position);
        }
    }
}
