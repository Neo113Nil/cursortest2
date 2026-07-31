package com.davidehrmann.vcdiff.engine;

import com.davidehrmann.vcdiff.VCDiffCodeTableWriter;
import com.davidehrmann.vcdiff.VCDiffFormatExtension;
import java.io.IOException;
import java.util.EnumSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public class JSONCodeTableWriter implements VCDiffCodeTableWriter<Appendable> {
    private StringBuilder output = new StringBuilder(1024);
    private boolean outputCalled = false;
    private boolean opcodeAdded = false;

    @Override // com.davidehrmann.vcdiff.VCDiffCodeTableWriter
    public /* bridge */ /* synthetic */ void writeHeader(Appendable appendable, EnumSet enumSet) throws IOException {
        writeHeader2(appendable, (EnumSet<VCDiffFormatExtension>) enumSet);
    }

    @Override // com.davidehrmann.vcdiff.VCDiffCodeTableWriter
    public void init(int i) {
        this.output.append(AbstractJsonLexerKt.BEGIN_LIST);
        this.opcodeAdded = false;
    }

    @Override // com.davidehrmann.vcdiff.VCDiffCodeTableWriter
    public void add(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || (i3 = i2 + i) > bArr.length) {
            throw new IllegalArgumentException();
        }
        if (this.opcodeAdded) {
            this.output.append(AbstractJsonLexerKt.COMMA);
        }
        this.output.append('\"');
        while (i < i3) {
            JSONEscape(bArr[i], this.output);
            i++;
        }
        this.output.append('\"');
        this.opcodeAdded = true;
    }

    @Override // com.davidehrmann.vcdiff.VCDiffCodeTableWriter
    public void addChecksum(int i) {
        throw new UnsupportedOperationException("Checksum not supported");
    }

    @Override // com.davidehrmann.vcdiff.VCDiffCodeTableWriter
    public void copy(int i, int i2) {
        if (this.opcodeAdded) {
            this.output.append(AbstractJsonLexerKt.COMMA);
        }
        this.output.append(i);
        this.output.append(AbstractJsonLexerKt.COMMA);
        this.output.append(i2);
        this.opcodeAdded = true;
    }

    @Override // com.davidehrmann.vcdiff.VCDiffCodeTableWriter
    public void finishEncoding(Appendable appendable) throws IOException {
        if (this.outputCalled) {
            appendable.append(AbstractJsonLexerKt.END_LIST);
        }
    }

    @Override // com.davidehrmann.vcdiff.VCDiffCodeTableWriter
    public void output(Appendable appendable) throws IOException {
        this.outputCalled = true;
        appendable.append(this.output);
        this.output = new StringBuilder(1024);
    }

    @Override // com.davidehrmann.vcdiff.VCDiffCodeTableWriter
    public void run(int i, byte b) {
        if (this.opcodeAdded) {
            this.output.append(AbstractJsonLexerKt.COMMA);
        }
        this.output.append('\"');
        StringBuilder sb = new StringBuilder(8);
        JSONEscape(b, sb);
        for (int i2 = 0; i2 < i; i2++) {
            this.output.append((CharSequence) sb);
        }
        this.output.append('\"');
        this.opcodeAdded = true;
    }

    /* renamed from: writeHeader, reason: avoid collision after fix types in other method */
    public void writeHeader2(Appendable appendable, EnumSet<VCDiffFormatExtension> enumSet) throws IOException {
        if (!enumSet.isEmpty() && !EnumSet.of(VCDiffFormatExtension.GOOGLE_JSON).equals(enumSet)) {
            throw new IOException("VCDiffFormatExtensions " + enumSet + " no compatible with JSONCodeTableWritar");
        }
    }

    private static void JSONEscape(byte b, StringBuilder sb) {
        if (b == 12) {
            sb.append("\\f");
            return;
        }
        if (b == 13) {
            sb.append("\\r");
            return;
        }
        if (b == 34) {
            sb.append("\\\"");
            return;
        }
        if (b == 92) {
            sb.append("\\\\");
            return;
        }
        switch (b) {
            case 8:
                sb.append("\\b");
                break;
            case 9:
                sb.append("\\t");
                break;
            case 10:
                sb.append("\\n");
                break;
            default:
                if (b < 32 || b >= Byte.MAX_VALUE) {
                    sb.append(String.format("\\u%04x", Integer.valueOf(b & 65535)));
                    break;
                } else {
                    sb.append((char) b);
                    break;
                }
                break;
        }
    }
}
