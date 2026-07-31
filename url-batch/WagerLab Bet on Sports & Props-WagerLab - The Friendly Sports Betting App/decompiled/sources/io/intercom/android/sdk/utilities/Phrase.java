package io.intercom.android.sdk.utilities;

import android.app.Fragment;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes8.dex */
public final class Phrase {
    private static final int EOF = 0;
    private char curChar;
    private int curCharIndex;
    private CharSequence formatted;
    private Token head;
    private final Set<String> keys = new HashSet();
    private final Map<String, CharSequence> keysToValues = new HashMap();
    private final CharSequence pattern;

    public static Phrase from(Fragment fragment, int i) {
        return from(fragment.getResources(), i);
    }

    public static Phrase from(View view, int i) {
        return from(view.getResources(), i);
    }

    public static Phrase from(Context context, int i) {
        return from(context.getResources(), i);
    }

    public static Phrase from(Resources resources, int i) {
        return from(resources.getText(i));
    }

    public static Phrase from(CharSequence charSequence) {
        return new Phrase(charSequence);
    }

    public Phrase put(String str, CharSequence charSequence) {
        if (!this.keys.contains(str)) {
            throw new IllegalArgumentException("Key '" + str + "' not found in '" + ((Object) this.pattern) + "'");
        }
        if (charSequence == null) {
            throw new IllegalArgumentException("Null value for '" + str + "' in '" + ((Object) this.pattern) + "'");
        }
        this.keysToValues.put(str, charSequence);
        this.formatted = null;
        return this;
    }

    public Phrase put(String str, int i) {
        return put(str, Integer.toString(i));
    }

    public Phrase putOptional(String str, CharSequence charSequence) {
        return this.keys.contains(str) ? put(str, charSequence) : this;
    }

    public Phrase putOptional(String str, int i) {
        return this.keys.contains(str) ? put(str, i) : this;
    }

    public CharSequence format() {
        if (this.formatted == null) {
            if (!this.keysToValues.keySet().containsAll(this.keys)) {
                HashSet hashSet = new HashSet(this.keys);
                hashSet.removeAll(this.keysToValues.keySet());
                throw new IllegalArgumentException("Missing keys: " + hashSet + " in '" + ((Object) this.pattern) + "'");
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.pattern);
            for (Token token = this.head; token != null; token = token.next) {
                token.expand(spannableStringBuilder, this.keysToValues);
            }
            this.formatted = spannableStringBuilder;
        }
        return this.formatted;
    }

    public void into(TextView textView) {
        if (textView == null) {
            throw new IllegalArgumentException("TextView must not be null.");
        }
        textView.setText(format());
    }

    public String toString() {
        return this.pattern.toString();
    }

    private Phrase(CharSequence charSequence) {
        this.curChar = charSequence.length() > 0 ? charSequence.charAt(0) : (char) 0;
        this.pattern = charSequence;
        Token token = null;
        while (true) {
            token = token(token);
            if (token == null) {
                return;
            }
            if (this.head == null) {
                this.head = token;
            }
        }
    }

    private Token token(Token token) {
        char c = this.curChar;
        if (c == 0) {
            return null;
        }
        if (c == '{') {
            char lookahead = lookahead();
            if (lookahead == '{') {
                return leftCurlyBracket(token);
            }
            if (lookahead >= 'a' && lookahead <= 'z') {
                return key(token);
            }
            throw new IllegalArgumentException("Unexpected character '" + lookahead + "'; expected key in '" + ((Object) this.pattern) + "'");
        }
        return text(token);
    }

    private KeyToken key(Token token) {
        char c;
        StringBuilder sb = new StringBuilder();
        consume();
        while (true) {
            c = this.curChar;
            if ((c < 'a' || c > 'z') && ((c < 'A' || c > 'Z') && c != '_' && (c < '0' || c > '9'))) {
                break;
            }
            sb.append(c);
            consume();
        }
        if (c != '}') {
            throw new IllegalArgumentException("Missing closing brace: } in '" + ((Object) this.pattern) + "'");
        }
        consume();
        if (sb.length() == 0) {
            throw new IllegalArgumentException("Empty key: {} in '" + ((Object) this.pattern) + "'");
        }
        String sb2 = sb.toString();
        this.keys.add(sb2);
        return new KeyToken(token, sb2);
    }

    private TextToken text(Token token) {
        int i = this.curCharIndex;
        while (true) {
            char c = this.curChar;
            if (c == '{' || c == 0) {
                break;
            }
            consume();
        }
        return new TextToken(token, this.curCharIndex - i);
    }

    private LeftCurlyBracketToken leftCurlyBracket(Token token) {
        consume();
        consume();
        return new LeftCurlyBracketToken(token);
    }

    private char lookahead() {
        if (this.curCharIndex < this.pattern.length() - 1) {
            return this.pattern.charAt(this.curCharIndex + 1);
        }
        return (char) 0;
    }

    private void consume() {
        int i = this.curCharIndex + 1;
        this.curCharIndex = i;
        this.curChar = i == this.pattern.length() ? (char) 0 : this.pattern.charAt(this.curCharIndex);
    }

    private static abstract class Token {
        Token next;
        private final Token prev;

        abstract void expand(SpannableStringBuilder spannableStringBuilder, Map<String, CharSequence> map);

        abstract int getFormattedLength();

        protected Token(Token token) {
            this.prev = token;
            if (token != null) {
                token.next = this;
            }
        }

        final int getFormattedStart() {
            Token token = this.prev;
            if (token == null) {
                return 0;
            }
            return token.getFormattedStart() + this.prev.getFormattedLength();
        }
    }

    private static class TextToken extends Token {
        private final int textLength;

        @Override // io.intercom.android.sdk.utilities.Phrase.Token
        void expand(SpannableStringBuilder spannableStringBuilder, Map<String, CharSequence> map) {
        }

        TextToken(Token token, int i) {
            super(token);
            this.textLength = i;
        }

        @Override // io.intercom.android.sdk.utilities.Phrase.Token
        int getFormattedLength() {
            return this.textLength;
        }
    }

    private static class LeftCurlyBracketToken extends Token {
        @Override // io.intercom.android.sdk.utilities.Phrase.Token
        int getFormattedLength() {
            return 1;
        }

        LeftCurlyBracketToken(Token token) {
            super(token);
        }

        @Override // io.intercom.android.sdk.utilities.Phrase.Token
        void expand(SpannableStringBuilder spannableStringBuilder, Map<String, CharSequence> map) {
            int formattedStart = getFormattedStart();
            spannableStringBuilder.replace(formattedStart, formattedStart + 2, "{");
        }
    }

    private static class KeyToken extends Token {
        private final String key;
        private CharSequence value;

        KeyToken(Token token, String str) {
            super(token);
            this.key = str;
        }

        @Override // io.intercom.android.sdk.utilities.Phrase.Token
        void expand(SpannableStringBuilder spannableStringBuilder, Map<String, CharSequence> map) {
            this.value = map.get(this.key);
            int formattedStart = getFormattedStart();
            spannableStringBuilder.replace(formattedStart, this.key.length() + formattedStart + 2, this.value);
        }

        @Override // io.intercom.android.sdk.utilities.Phrase.Token
        int getFormattedLength() {
            return this.value.length();
        }
    }
}
