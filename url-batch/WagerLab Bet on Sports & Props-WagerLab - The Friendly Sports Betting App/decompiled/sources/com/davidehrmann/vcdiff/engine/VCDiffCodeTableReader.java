package com.davidehrmann.vcdiff.engine;

import com.davidehrmann.vcdiff.util.Objects;
import com.davidehrmann.vcdiff.util.VarInt;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class VCDiffCodeTableReader {
    protected static final short NO_OPCODE = 256;
    private final VCDiffCodeTableData codeTableData;
    private ByteBuffer instructionsAndSizes;
    private int lastInstructionStart;
    private short lastPendingSecondInstruction;
    private short pendingSecondInstruction;

    public VCDiffCodeTableReader() {
        this.lastInstructionStart = -1;
        this.codeTableData = VCDiffCodeTableData.kDefaultCodeTableData;
    }

    public VCDiffCodeTableReader(VCDiffCodeTableData vCDiffCodeTableData, short s) {
        this.lastInstructionStart = -1;
        if (!vCDiffCodeTableData.Validate(s)) {
            throw new IllegalArgumentException("Invalid code table data.");
        }
        this.codeTableData = (VCDiffCodeTableData) Objects.requireNotNull(vCDiffCodeTableData, "codeTableData was null");
    }

    public void init(ByteBuffer byteBuffer) {
        this.instructionsAndSizes = byteBuffer;
        this.lastInstructionStart = -1;
        this.pendingSecondInstruction = (short) 256;
        this.lastPendingSecondInstruction = (short) 256;
    }

    public byte getNextInstruction(AtomicInteger atomicInteger, AtomicInteger atomicInteger2) throws IOException {
        byte b;
        byte b2;
        byte b3;
        ByteBuffer byteBuffer = this.instructionsAndSizes;
        if (byteBuffer == null) {
            throw new IllegalStateException("Internal error: getNextInstruction() called before init()");
        }
        this.lastInstructionStart = byteBuffer.position();
        this.lastPendingSecondInstruction = this.pendingSecondInstruction;
        while (true) {
            short s = this.pendingSecondInstruction;
            if (s != 256) {
                this.pendingSecondInstruction = (short) 256;
                int i = ((byte) s) & 255;
                b = this.codeTableData.inst2[i];
                b2 = this.codeTableData.size2[i];
                b3 = this.codeTableData.mode2[i];
                break;
            }
            if (!this.instructionsAndSizes.hasRemaining()) {
                return (byte) 5;
            }
            byte b4 = this.instructionsAndSizes.get();
            int i2 = b4 & 255;
            if (this.codeTableData.inst2[i2] != 0) {
                this.pendingSecondInstruction = b4;
            }
            b = this.codeTableData.inst1[i2];
            byte b5 = this.codeTableData.size1[i2];
            byte b6 = this.codeTableData.mode1[i2];
            if (b != 0) {
                b2 = b5;
                b3 = b6;
                break;
            }
        }
        if (b2 == 0) {
            try {
                atomicInteger.set(VarInt.getInt(this.instructionsAndSizes));
            } catch (VarInt.VarIntEndOfBufferException unused) {
                unGetInstruction();
                return (byte) 5;
            } catch (VarInt.VarIntParseException unused2) {
                throw new IOException("Instruction size is not a valid variable-length integer");
            }
        } else {
            atomicInteger.set(b2);
        }
        atomicInteger2.set(b3);
        return b;
    }

    public void unGetInstruction() {
        int i = this.lastInstructionStart;
        if (i >= 0) {
            if (i > this.instructionsAndSizes.position()) {
                throw new IllegalStateException("Internal error: last_instruction_start past end of instructions_and_sizes in unGetInstruction");
            }
            this.instructionsAndSizes.position(this.lastInstructionStart);
            if (this.pendingSecondInstruction != 256 && this.lastPendingSecondInstruction != 256) {
                throw new IllegalStateException("Internal error: two pending instructions in a row in unGetInstruction");
            }
            this.pendingSecondInstruction = this.lastPendingSecondInstruction;
        }
    }

    void updatePointers(ByteBuffer byteBuffer) {
        this.instructionsAndSizes = byteBuffer;
        this.lastInstructionStart = -1;
        this.lastPendingSecondInstruction = this.pendingSecondInstruction;
    }
}
