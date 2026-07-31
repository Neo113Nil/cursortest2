package com.smaato.sdk.ng.utils.string;

import com.ironsource.X3;
import com.safedk.android.analytics.brandsafety.creatives.e;
import com.safedk.android.analytics.brandsafety.m;
import java.util.Collections;
import java.util.HashMap;
import org.slf4j.Marker;

/* loaded from: classes9.dex */
public class StringEscapeUtils {
    public static final String EMPTY = "";
    public static final CharSequenceTranslator ESCAPE_JAVA;
    public static final CharSequenceTranslator ESCAPE_XSI;
    public static final CharSequenceTranslator UNESCAPE_JAVA;

    public static final class Builder {
        private final StringBuilder a;
        private final CharSequenceTranslator b;

        private Builder(CharSequenceTranslator charSequenceTranslator) {
            this.a = new StringBuilder();
            this.b = charSequenceTranslator;
        }

        public Builder append(String str) {
            this.a.append(str);
            return this;
        }

        public Builder escape(String str) {
            this.a.append(this.b.translate(str));
            return this;
        }

        public String toString() {
            return this.a.toString();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("\"", "\\\"");
        hashMap.put("\\", "\\\\");
        ESCAPE_JAVA = new AggregateTranslator(new LookupTranslator(Collections.unmodifiableMap(hashMap)), new LookupTranslator(EntityArrays.JAVA_CTRL_CHARS_ESCAPE), JavaUnicodeEscaper.outsideOf(32, 127));
        HashMap hashMap2 = new HashMap();
        hashMap2.put(m.ad, "\\|");
        hashMap2.put(X3.j.c, "\\&");
        hashMap2.put(";", "\\;");
        hashMap2.put("<", "\\<");
        hashMap2.put(">", "\\>");
        hashMap2.put("(", "\\(");
        hashMap2.put(")", e.n);
        hashMap2.put("$", "\\$");
        hashMap2.put("`", "\\`");
        hashMap2.put("\\", "\\\\");
        hashMap2.put("\"", "\\\"");
        hashMap2.put("'", "\\'");
        hashMap2.put(" ", "\\ ");
        hashMap2.put("\t", "\\\t");
        hashMap2.put("\r\n", "");
        hashMap2.put("\n", "");
        hashMap2.put(Marker.ANY_MARKER, "\\*");
        hashMap2.put("?", "\\?");
        hashMap2.put(X3.j.d, "\\[");
        hashMap2.put("#", "\\#");
        hashMap2.put("~", "\\~");
        hashMap2.put("=", "\\=");
        hashMap2.put("%", "\\%");
        ESCAPE_XSI = new LookupTranslator(Collections.unmodifiableMap(hashMap2));
        HashMap hashMap3 = new HashMap();
        hashMap3.put("\\\\", "\\");
        hashMap3.put("\\\"", "\"");
        hashMap3.put("\\'", "'");
        hashMap3.put("\\", "");
        UNESCAPE_JAVA = new AggregateTranslator(new OctalUnescaper(), new UnicodeUnescaper(), new LookupTranslator(EntityArrays.JAVA_CTRL_CHARS_UNESCAPE), new LookupTranslator(Collections.unmodifiableMap(hashMap3)));
    }

    public static Builder builder(CharSequenceTranslator charSequenceTranslator) {
        return new Builder(charSequenceTranslator);
    }

    public static final String escapeJava(String str) {
        return ESCAPE_JAVA.translate(str);
    }

    public static final String unescapeJava(String str) {
        return UNESCAPE_JAVA.translate(str);
    }
}
