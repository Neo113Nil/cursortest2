package com.smaato.sdk.ng.utils.string;

import java.io.IOException;
import java.io.Writer;
import java.security.InvalidParameterException;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class LookupTranslator extends CharSequenceTranslator {
    private final Map<String, String> b;
    private final BitSet c;
    private final int d;
    private final int e;

    public LookupTranslator(Map<CharSequence, CharSequence> map) {
        if (map == null) {
            throw new InvalidParameterException("lookupMap cannot be null");
        }
        this.b = new HashMap();
        this.c = new BitSet();
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        for (Map.Entry<CharSequence, CharSequence> entry : map.entrySet()) {
            this.b.put(entry.getKey().toString(), entry.getValue().toString());
            this.c.set(entry.getKey().charAt(0));
            int length = entry.getKey().length();
            i = length < i ? length : i;
            if (length > i2) {
                i2 = length;
            }
        }
        this.d = i;
        this.e = i2;
    }

    @Override // com.smaato.sdk.ng.utils.string.CharSequenceTranslator
    public int translate(CharSequence charSequence, int i, Writer writer) throws IOException {
        if (this.c.get(charSequence.charAt(i))) {
            int i2 = this.e;
            if (i + i2 > charSequence.length()) {
                i2 = charSequence.length() - i;
            }
            while (i2 >= this.d) {
                CharSequence subSequence = charSequence.subSequence(i, i + i2);
                String str = this.b.get(subSequence.toString());
                if (str != null) {
                    writer.write(str);
                    return Character.codePointCount(subSequence, 0, subSequence.length());
                }
                i2--;
            }
        }
        return 0;
    }
}
