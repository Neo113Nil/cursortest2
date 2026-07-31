package com.davidehrmann.vcdiff.engine;

import com.davidehrmann.vcdiff.VCDiffCodeTableWriter;
import com.davidehrmann.vcdiff.VCDiffFormatExtension;
import com.davidehrmann.vcdiff.io.CountingOutputStream;
import com.davidehrmann.vcdiff.mina_buffer.IoBuffer;
import com.davidehrmann.vcdiff.util.VarInt;
import java.io.IOException;
import java.io.OutputStream;
import java.util.EnumSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.msgpack.core.MessagePack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: classes3.dex */
public class VCDiffCodeTableWriterImpl implements VCDiffCodeTableWriter<OutputStream> {
    static final int VCD_CHECKSUM = 4;
    static final int VCD_SOURCE = 1;
    static final int VCD_TARGET = 2;
    private boolean addChecksum;
    private final VCDiffAddressCache addraddressCachess_cache_;
    private IoBuffer addressesForCopy;
    private long checksum;
    private final VCDiffCodeTableData codeTableData;
    private IoBuffer dataForAddAndRun;
    private int dictionarySize;
    private VCDiffInstructionMap instructionMap;
    private IoBuffer instructionsAndSizes;
    private int lastOpcodeIndex;
    private final int maxMode;
    private final IoBuffer separateAddressesForCopy;
    private final IoBuffer separateDataForAddAndRun;
    private int targetLength;
    private static final Logger LOGGER = LoggerFactory.getLogger((Class<?>) VCDiffCodeTableWriterImpl.class);
    private static final byte[] HEADER_STANDARD_FORMAT = {MessagePack.Code.FIXEXT4, MessagePack.Code.TRUE, MessagePack.Code.BIN8, 0, 0};
    private static final byte[] HEADER_EXTENDED_FORMAT = {MessagePack.Code.FIXEXT4, MessagePack.Code.TRUE, MessagePack.Code.BIN8, 83, 0};

    @Override // com.davidehrmann.vcdiff.VCDiffCodeTableWriter
    public void finishEncoding(OutputStream outputStream) throws IOException {
    }

    @Override // com.davidehrmann.vcdiff.VCDiffCodeTableWriter
    public /* bridge */ /* synthetic */ void writeHeader(OutputStream outputStream, EnumSet enumSet) throws IOException {
        writeHeader2(outputStream, (EnumSet<VCDiffFormatExtension>) enumSet);
    }

    public VCDiffCodeTableWriterImpl(boolean z) {
        this.instructionsAndSizes = IoBuffer.allocate(1024);
        IoBuffer allocate = IoBuffer.allocate(1024);
        this.separateDataForAddAndRun = allocate;
        IoBuffer allocate2 = IoBuffer.allocate(1024);
        this.separateAddressesForCopy = allocate2;
        this.maxMode = VCDiffAddressCache.DefaultLastMode();
        this.dictionarySize = 0;
        this.targetLength = 0;
        this.codeTableData = VCDiffCodeTableData.kDefaultCodeTableData;
        this.instructionMap = null;
        this.lastOpcodeIndex = -1;
        this.addChecksum = false;
        this.checksum = 0L;
        this.addraddressCachess_cache_ = new VCDiffAddressCacheImpl();
        this.instructionsAndSizes.setAutoExpand(true);
        allocate.setAutoExpand(true);
        allocate2.setAutoExpand(true);
        initSectionPointers(z);
    }

    VCDiffCodeTableWriterImpl(boolean z, short s, short s2, VCDiffCodeTableData vCDiffCodeTableData, short s3) {
        this.instructionsAndSizes = IoBuffer.allocate(1024);
        this.separateDataForAddAndRun = IoBuffer.allocate(1024);
        this.separateAddressesForCopy = IoBuffer.allocate(1024);
        this.addraddressCachess_cache_ = new VCDiffAddressCacheImpl(s, s2);
        this.dictionarySize = 0;
        this.targetLength = 0;
        this.codeTableData = vCDiffCodeTableData;
        this.instructionMap = null;
        this.lastOpcodeIndex = -1;
        this.addChecksum = false;
        this.checksum = 0L;
        this.maxMode = s3;
        initSectionPointers(z);
    }

    @Override // com.davidehrmann.vcdiff.VCDiffCodeTableWriter
    public void init(int i) {
        this.dictionarySize = i;
        if (this.instructionMap == null) {
            if (this.codeTableData == VCDiffCodeTableData.kDefaultCodeTableData) {
                this.instructionMap = VCDiffInstructionMap.DEFAULT_INSTRUCTION_MAP;
            } else {
                this.instructionMap = new VCDiffInstructionMap(this.codeTableData, (byte) this.maxMode);
            }
        }
        this.addraddressCachess_cache_.Init();
        this.targetLength = 0;
        this.lastOpcodeIndex = -1;
    }

    @Override // com.davidehrmann.vcdiff.VCDiffCodeTableWriter
    public void add(byte[] bArr, int i, int i2) {
        if (i + i2 > bArr.length || i2 < 0) {
            throw new IllegalArgumentException();
        }
        encodeInstruction((byte) 1, i2);
        this.dataForAddAndRun.put(bArr, i, i2);
        this.targetLength += i2;
    }

    @Override // com.davidehrmann.vcdiff.VCDiffCodeTableWriter
    public void addChecksum(int i) {
        this.addChecksum = true;
        this.checksum = i & 4294967295L;
    }

    @Override // com.davidehrmann.vcdiff.VCDiffCodeTableWriter
    public void copy(int i, int i2) {
        if (this.instructionMap == null) {
            throw new IllegalStateException("copy called without calling init().");
        }
        AtomicInteger atomicInteger = new AtomicInteger(0);
        byte EncodeAddress = (byte) this.addraddressCachess_cache_.EncodeAddress(i, this.dictionarySize + this.targetLength, atomicInteger);
        encodeInstruction((byte) 3, i2, EncodeAddress);
        if (this.addraddressCachess_cache_.WriteAddressAsVarintForMode(EncodeAddress)) {
            this.addressesForCopy.expand(VarInt.calculateIntLength(atomicInteger.get()));
            VarInt.putInt(this.addressesForCopy.buf(), atomicInteger.get());
        } else {
            this.addressesForCopy.put((byte) atomicInteger.get());
        }
        this.targetLength += i2;
    }

    public int getDeltaWindowSize() {
        int calculateLengthOfTheDeltaEncoding = calculateLengthOfTheDeltaEncoding();
        return calculateLengthOfTheDeltaEncoding + 1 + VarInt.calculateIntLength(this.dictionarySize) + VarInt.calculateIntLength(0) + VarInt.calculateIntLength(calculateLengthOfTheDeltaEncoding);
    }

    @Override // com.davidehrmann.vcdiff.VCDiffCodeTableWriter
    public void output(OutputStream outputStream) throws IOException {
        if (this.instructionsAndSizes.position() == 0) {
            LOGGER.warn("Empty input; no delta window produced");
        } else {
            CountingOutputStream countingOutputStream = new CountingOutputStream(outputStream);
            if (this.addChecksum) {
                countingOutputStream.write(5);
            } else {
                countingOutputStream.write(1);
            }
            VarInt.writeInt(countingOutputStream, this.dictionarySize);
            VarInt.writeInt(countingOutputStream, 0);
            int calculateLengthOfTheDeltaEncoding = calculateLengthOfTheDeltaEncoding();
            VarInt.writeInt(countingOutputStream, calculateLengthOfTheDeltaEncoding);
            int bytesWritten = (int) countingOutputStream.getBytesWritten();
            VarInt.writeInt(countingOutputStream, this.targetLength);
            countingOutputStream.write(0);
            VarInt.writeInt(countingOutputStream, this.separateDataForAddAndRun.position());
            VarInt.writeInt(countingOutputStream, this.instructionsAndSizes.position());
            VarInt.writeInt(countingOutputStream, this.separateAddressesForCopy.position());
            if (this.addChecksum) {
                VarInt.writeLong(countingOutputStream, this.checksum);
            }
            countingOutputStream.write(this.separateDataForAddAndRun.array(), this.separateDataForAddAndRun.arrayOffset(), this.separateDataForAddAndRun.position());
            countingOutputStream.write(this.instructionsAndSizes.array(), this.instructionsAndSizes.arrayOffset(), this.instructionsAndSizes.position());
            countingOutputStream.write(this.separateAddressesForCopy.array(), this.separateAddressesForCopy.arrayOffset(), this.separateAddressesForCopy.position());
            int bytesWritten2 = ((int) countingOutputStream.getBytesWritten()) - bytesWritten;
            if (calculateLengthOfTheDeltaEncoding != bytesWritten2) {
                throw new IllegalStateException(String.format("Internal error: calculated length of the delta encoding (%d) does not match actual length (%d)", Integer.valueOf(calculateLengthOfTheDeltaEncoding), Integer.valueOf(bytesWritten2)));
            }
            this.separateDataForAddAndRun.clear();
            this.instructionsAndSizes.clear();
            this.separateAddressesForCopy.clear();
            if (this.targetLength == 0) {
                LOGGER.warn("Empty target window");
            }
        }
        init(this.dictionarySize);
    }

    @Override // com.davidehrmann.vcdiff.VCDiffCodeTableWriter
    public void run(int i, byte b) {
        encodeInstruction((byte) 2, i);
        this.dataForAddAndRun.put(b);
        this.targetLength += i;
    }

    /* renamed from: writeHeader, reason: avoid collision after fix types in other method */
    public void writeHeader2(OutputStream outputStream, EnumSet<VCDiffFormatExtension> enumSet) throws IOException {
        if (enumSet.isEmpty()) {
            outputStream.write(HEADER_STANDARD_FORMAT);
        } else {
            outputStream.write(HEADER_EXTENDED_FORMAT);
        }
    }

    public int targetLength() {
        return this.targetLength;
    }

    void initSectionPointers(boolean z) {
        if (z) {
            IoBuffer ioBuffer = this.instructionsAndSizes;
            this.dataForAddAndRun = ioBuffer;
            this.addressesForCopy = ioBuffer;
        } else {
            this.dataForAddAndRun = this.separateDataForAddAndRun;
            this.addressesForCopy = this.separateAddressesForCopy;
        }
    }

    private void encodeInstruction(byte b, int i, byte b2) {
        short LookupFirstOpcode;
        short LookupSecondOpcode;
        if (this.instructionMap == null) {
            throw new IllegalStateException("encodeInstruction() called without calling init()");
        }
        int i2 = this.lastOpcodeIndex;
        if (i2 >= 0) {
            byte b3 = this.instructionsAndSizes.get(i2);
            if (b == 1 && this.codeTableData.inst1[b3 & 255] == 1) {
                LOGGER.warn("encodeInstruction() called for two ADD instructions in a row");
            }
            if (i <= 255 && (LookupSecondOpcode = this.instructionMap.LookupSecondOpcode(b3, b, (byte) i, b2)) != 256) {
                this.instructionsAndSizes.put(this.lastOpcodeIndex, (byte) LookupSecondOpcode);
                this.lastOpcodeIndex = -1;
                return;
            }
            short LookupSecondOpcode2 = this.instructionMap.LookupSecondOpcode(b3, b, (byte) 0, b2);
            if (LookupSecondOpcode2 != 256) {
                this.instructionsAndSizes.put(this.lastOpcodeIndex, (byte) LookupSecondOpcode2);
                this.lastOpcodeIndex = -1;
                this.instructionsAndSizes.expand(VarInt.calculateIntLength(i));
                VarInt.putInt(this.instructionsAndSizes.buf(), i);
                return;
            }
        }
        if (i <= 255 && (LookupFirstOpcode = this.instructionMap.LookupFirstOpcode(b, (byte) i, b2)) != 256) {
            this.instructionsAndSizes.put((byte) LookupFirstOpcode);
            this.lastOpcodeIndex = this.instructionsAndSizes.position() - 1;
            return;
        }
        short LookupFirstOpcode2 = this.instructionMap.LookupFirstOpcode(b, (byte) 0, b2);
        if (LookupFirstOpcode2 == 256) {
            throw new IllegalStateException(String.format("No matching opcode found for inst %d, mode %d, size 0", Byte.valueOf(b), Byte.valueOf(b2)));
        }
        this.instructionsAndSizes.put((byte) LookupFirstOpcode2);
        this.lastOpcodeIndex = this.instructionsAndSizes.position() - 1;
        this.instructionsAndSizes.expand(VarInt.calculateIntLength(i));
        VarInt.putInt(this.instructionsAndSizes.buf(), i);
    }

    private void encodeInstruction(byte b, int i) {
        encodeInstruction(b, i, (byte) 0);
    }

    private int calculateLengthOfTheDeltaEncoding() {
        int calculateIntLength = VarInt.calculateIntLength(this.targetLength) + 1 + VarInt.calculateIntLength(this.separateDataForAddAndRun.position()) + VarInt.calculateIntLength(this.instructionsAndSizes.position()) + VarInt.calculateIntLength(this.separateAddressesForCopy.position()) + this.separateDataForAddAndRun.position() + this.instructionsAndSizes.position() + this.separateAddressesForCopy.position();
        return this.addChecksum ? calculateIntLength + VarInt.calculateLongLength(this.checksum) : calculateIntLength;
    }
}
