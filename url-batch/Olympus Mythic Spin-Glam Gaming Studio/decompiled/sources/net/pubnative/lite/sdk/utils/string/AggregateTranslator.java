package net.pubnative.lite.sdk.utils.string;

import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes15.dex */
public class AggregateTranslator extends CharSequenceTranslator {
    private final List<CharSequenceTranslator> translators = new ArrayList();

    public AggregateTranslator(CharSequenceTranslator... charSequenceTranslatorArr) {
        if (charSequenceTranslatorArr != null) {
            for (CharSequenceTranslator charSequenceTranslator : charSequenceTranslatorArr) {
                if (charSequenceTranslator != null) {
                    this.translators.add(charSequenceTranslator);
                }
            }
        }
    }

    @Override // net.pubnative.lite.sdk.utils.string.CharSequenceTranslator
    public int translate(CharSequence charSequence, int i, Writer writer) {
        Iterator<CharSequenceTranslator> it = this.translators.iterator();
        while (it.hasNext()) {
            int translate = it.next().translate(charSequence, i, writer);
            if (translate != 0) {
                return translate;
            }
        }
        return 0;
    }
}
