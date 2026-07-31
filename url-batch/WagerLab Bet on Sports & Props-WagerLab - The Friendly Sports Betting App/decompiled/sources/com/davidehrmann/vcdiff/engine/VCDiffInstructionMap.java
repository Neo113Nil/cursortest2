package com.davidehrmann.vcdiff.engine;

import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes3.dex */
class VCDiffInstructionMap {
    public static final VCDiffInstructionMap DEFAULT_INSTRUCTION_MAP = new VCDiffInstructionMap(VCDiffCodeTableData.kDefaultCodeTableData, VCDiffAddressCache.DefaultLastMode());
    private final FirstInstructionMap first_instruction_map_;
    private final SecondInstructionMap second_instruction_map_;

    public VCDiffInstructionMap(VCDiffCodeTableData vCDiffCodeTableData, byte b) {
        short LookupFirstOpcode;
        int i = b + 4;
        this.first_instruction_map_ = new FirstInstructionMap(i, FindMaxSize(vCDiffCodeTableData.size1));
        this.second_instruction_map_ = new SecondInstructionMap(i, FindMaxSize(vCDiffCodeTableData.size2));
        for (int i2 = 0; i2 < 256; i2++) {
            if (vCDiffCodeTableData.inst2[i2] == 0) {
                this.first_instruction_map_.Add(vCDiffCodeTableData.inst1[i2], vCDiffCodeTableData.size1[i2], vCDiffCodeTableData.mode1[i2], (byte) i2);
            } else if (vCDiffCodeTableData.inst1[i2] == 0) {
                this.first_instruction_map_.Add(vCDiffCodeTableData.inst2[i2], vCDiffCodeTableData.size2[i2], vCDiffCodeTableData.mode2[i2], (byte) i2);
            }
        }
        for (int i3 = 0; i3 < 256; i3++) {
            if (vCDiffCodeTableData.inst1[i3] != 0 && vCDiffCodeTableData.inst2[i3] != 0 && (LookupFirstOpcode = LookupFirstOpcode(vCDiffCodeTableData.inst1[i3], vCDiffCodeTableData.size1[i3], vCDiffCodeTableData.mode1[i3])) != 256) {
                this.second_instruction_map_.Add((byte) LookupFirstOpcode, vCDiffCodeTableData.inst2[i3], vCDiffCodeTableData.size2[i3], vCDiffCodeTableData.mode2[i3], (byte) i3);
            }
        }
    }

    public short LookupFirstOpcode(byte b, byte b2, byte b3) {
        return this.first_instruction_map_.Lookup(b, b2, b3);
    }

    public short LookupSecondOpcode(byte b, byte b2, byte b3, byte b4) {
        return this.second_instruction_map_.Lookup(b, b2, b3, b4);
    }

    private static int FindMaxSize(byte[] bArr) {
        int i = bArr[0] & 255;
        for (int i2 = 1; i2 < bArr.length; i2++) {
            byte b = bArr[i2];
            if ((b & 255) > i) {
                i = b & 255;
            }
        }
        return i;
    }

    private static class FirstInstructionMap {
        private final short[][] first_opcodes_;
        private final int max_size_1_;
        private final int num_instruction_type_modes_;

        public FirstInstructionMap(int i, int i2) {
            this.num_instruction_type_modes_ = i;
            this.max_size_1_ = i2;
            int[] iArr = {i, i2 + 1};
            short[][] sArr = (short[][]) Array.newInstance((Class<?>) Short.TYPE, iArr);
            this.first_opcodes_ = sArr;
            for (short[] sArr2 : sArr) {
                Arrays.fill(sArr2, VCDiffAddressCache.VCD_MAX_MODES);
            }
        }

        public void Add(byte b, byte b2, byte b3, byte b4) {
            short[] sArr = this.first_opcodes_[(b & 255) + (b3 & 255)];
            int i = b2 & 255;
            if (sArr[i] == 256) {
                sArr[i] = (short) (b4 & 255);
            }
        }

        public short Lookup(byte b, byte b2, byte b3) {
            int i = b2 & 255;
            return i > this.max_size_1_ ? VCDiffAddressCache.VCD_MAX_MODES : this.first_opcodes_[b == 3 ? (b & 255) + (b3 & 255) : b & 255][i];
        }
    }

    private static class SecondInstructionMap {
        private final int max_size_2_;
        private final int num_instruction_type_modes_;
        private final short[][][] second_opcodes_ = new short[256][][];

        public SecondInstructionMap(int i, int i2) {
            this.num_instruction_type_modes_ = i;
            this.max_size_2_ = i2;
        }

        public void Add(byte b, byte b2, byte b3, byte b4, byte b5) {
            short[][][] sArr = this.second_opcodes_;
            int i = b & 255;
            if (sArr[i] == null) {
                sArr[i] = new short[this.num_instruction_type_modes_][];
            }
            short[][] sArr2 = sArr[i];
            int i2 = (b2 & 255) + (b4 & 255);
            if (sArr2[i2] == null) {
                sArr2[i2] = new short[this.max_size_2_ + 1];
                Arrays.fill(sArr[i][i2], VCDiffAddressCache.VCD_MAX_MODES);
            }
            short[] sArr3 = this.second_opcodes_[i][i2];
            int i3 = b3 & 255;
            if (sArr3[i3] == 256) {
                sArr3[i3] = (short) (b5 & 255);
            }
        }

        public short Lookup(byte b, byte b2, byte b3, byte b4) {
            short[][] sArr;
            int i = b3 & 255;
            if (i > this.max_size_2_ || (sArr = this.second_opcodes_[b & 255]) == null) {
                return VCDiffAddressCache.VCD_MAX_MODES;
            }
            short[] sArr2 = sArr[b2 == 3 ? (b2 & 255) + (b4 & 255) : b2 & 255];
            return sArr2 == null ? VCDiffAddressCache.VCD_MAX_MODES : sArr2[i];
        }
    }
}
