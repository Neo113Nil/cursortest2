package org.chromium.net.apihelpers;

import androidx.annotation.Nullable;
import com.ironsource.X3;
import java.text.ParseException;
import java.util.AbstractMap;
import java.util.Map;

/* loaded from: classes12.dex */
final class ContentTypeParametersParser {
    private static final String TOKEN_ALLOWED_SPECIAL_CHARS = "!#$%&'*+-.^_`|~";
    private int mCurrentPosition;
    private final String mHeaderValue;

    private static boolean isAscii(char c) {
        return c <= 127;
    }

    private static boolean isWhitespace(char c) {
        return c == '\t' || c == ' ';
    }

    ContentTypeParametersParser(String str) {
        this.mHeaderValue = str;
        int indexOf = str.indexOf(59);
        this.mCurrentPosition = indexOf != -1 ? indexOf + 1 : str.length();
    }

    @Nullable
    Map.Entry<String, String> getNextParameter() throws ContentTypeParametersParserException {
        String nextToken;
        optionallySkipWhitespace();
        String nextToken2 = getNextToken();
        if (currentChar() != '=') {
            throw new ContentTypeParametersParserException("Invalid parameter format: expected = at " + this.mCurrentPosition + ": [" + this.mHeaderValue + X3.j.e, this.mCurrentPosition);
        }
        advance();
        if (currentChar() == '\"') {
            nextToken = getNextQuotedString();
        } else {
            nextToken = getNextToken();
        }
        optionallySkipWhitespace();
        if (hasMore()) {
            if (currentChar() != ';') {
                throw new ContentTypeParametersParserException("Invalid parameter format: expected ; at " + this.mCurrentPosition + ": [" + this.mHeaderValue + X3.j.e, this.mCurrentPosition);
            }
            advance();
        }
        return new AbstractMap.SimpleEntry(nextToken2, nextToken);
    }

    private String getNextQuotedString() throws ContentTypeParametersParserException {
        int i = this.mCurrentPosition;
        if (currentChar() != '\"') {
            throw new ContentTypeParametersParserException("Not a quoted string: expected \" at " + this.mCurrentPosition + ": [" + this.mHeaderValue + X3.j.e, this.mCurrentPosition);
        }
        advance();
        StringBuilder sb = new StringBuilder();
        while (true) {
            boolean z = false;
            while (hasMore()) {
                if (z) {
                    if (!isQuotedPairChar(currentChar())) {
                        throw new ContentTypeParametersParserException("Invalid character at " + this.mCurrentPosition + ": [" + this.mHeaderValue + X3.j.e, this.mCurrentPosition);
                    }
                    sb.append(currentChar());
                    advance();
                } else {
                    if (currentChar() == '\"') {
                        advance();
                        return sb.toString();
                    }
                    if (currentChar() == '\\') {
                        advance();
                        z = true;
                    } else {
                        if (!isQdtextChar(currentChar())) {
                            throw new ContentTypeParametersParserException("Invalid character at " + this.mCurrentPosition + ": [" + this.mHeaderValue + X3.j.e, this.mCurrentPosition);
                        }
                        sb.append(currentChar());
                        advance();
                    }
                }
            }
            throw new ContentTypeParametersParserException("Unterminated quoted string at " + i + ": [" + this.mHeaderValue + X3.j.e, i);
        }
    }

    private String getNextToken() throws ContentTypeParametersParserException {
        int i = this.mCurrentPosition;
        while (hasMore() && isTokenCharacter(currentChar())) {
            advance();
        }
        int i2 = this.mCurrentPosition;
        if (i == i2) {
            throw new ContentTypeParametersParserException("Token not found at position " + i + ": [" + this.mHeaderValue + X3.j.e, i);
        }
        return this.mHeaderValue.substring(i, i2);
    }

    boolean hasMore() {
        return this.mCurrentPosition < this.mHeaderValue.length();
    }

    private char currentChar() throws ContentTypeParametersParserException {
        if (!hasMore()) {
            throw new ContentTypeParametersParserException("End of header reached", this.mCurrentPosition);
        }
        return this.mHeaderValue.charAt(this.mCurrentPosition);
    }

    private void advance() throws ContentTypeParametersParserException {
        if (!hasMore()) {
            throw new ContentTypeParametersParserException("End of header reached", this.mCurrentPosition);
        }
        this.mCurrentPosition++;
    }

    private void optionallySkipWhitespace() throws ContentTypeParametersParserException {
        while (hasMore() && isWhitespace(currentChar())) {
            advance();
        }
    }

    private static boolean isQdtextChar(char c) {
        return (c == '\\' || c == '\"' || !isQuotedPairChar(c)) ? false : true;
    }

    private static boolean isQuotedPairChar(char c) {
        return isWhitespace(c) || ('!' <= c && c <= 255 && c != 127);
    }

    private static boolean isTokenCharacter(char c) {
        return isAscii(c) && (Character.isLetterOrDigit(c) || TOKEN_ALLOWED_SPECIAL_CHARS.indexOf(c) != -1);
    }

    static class ContentTypeParametersParserException extends ParseException {
        ContentTypeParametersParserException(String str, int i) {
            super(str, i);
        }
    }
}
