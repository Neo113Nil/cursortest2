package com.smaato.sdk.ng.utils.string;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public class AggregateTranslator extends CharSequenceTranslator {
    private final List<CharSequenceTranslator> b = new ArrayList();

    public AggregateTranslator(CharSequenceTranslator... charSequenceTranslatorArr) {
        if (charSequenceTranslatorArr != null) {
            for (CharSequenceTranslator charSequenceTranslator : charSequenceTranslatorArr) {
                if (charSequenceTranslator != null) {
                    this.b.add(charSequenceTranslator);
                }
            }
        }
    }

    @Override // com.smaato.sdk.ng.utils.string.CharSequenceTranslator
    public int translate(CharSequence charSequence, int i, Writer writer) throws IOException {
        Iterator<CharSequenceTranslator> it = this.b.iterator();
        while (it.hasNext()) {
            int translate = it.next().translate(charSequence, i, writer);
            if (translate != 0) {
                return translate;
            }
        }
        return 0;
    }
}
