package com.smaato.sdk.ng.utils.string;

import java.io.IOException;
import java.io.Writer;

/* loaded from: classes3.dex */
public class UnicodeEscaper extends CodePointTranslator {
    private final int b;
    private final int c;
    private final boolean d;

    public UnicodeEscaper() {
        this(0, Integer.MAX_VALUE, true);
    }

    public static UnicodeEscaper above(int i) {
        return outsideOf(0, i);
    }

    public static UnicodeEscaper below(int i) {
        return outsideOf(i, Integer.MAX_VALUE);
    }

    public static UnicodeEscaper between(int i, int i2) {
        return new UnicodeEscaper(i, i2, true);
    }

    public static UnicodeEscaper outsideOf(int i, int i2) {
        return new UnicodeEscaper(i, i2, false);
    }

    protected String a(int i) {
        return "\\u" + CharSequenceTranslator.hex(i);
    }

    @Override // com.smaato.sdk.ng.utils.string.CodePointTranslator
    public boolean translate(int i, Writer writer) throws IOException {
        if (this.d) {
            if (i < this.b || i > this.c) {
                return false;
            }
        } else if (i >= this.b && i <= this.c) {
            return false;
        }
        if (i > 65535) {
            writer.write(a(i));
            return true;
        }
        writer.write("\\u");
        char[] cArr = CharSequenceTranslator.a;
        writer.write(cArr[(i >> 12) & 15]);
        writer.write(cArr[(i >> 8) & 15]);
        writer.write(cArr[(i >> 4) & 15]);
        writer.write(cArr[i & 15]);
        return true;
    }

    protected UnicodeEscaper(int i, int i2, boolean z) {
        this.b = i;
        this.c = i2;
        this.d = z;
    }
}
