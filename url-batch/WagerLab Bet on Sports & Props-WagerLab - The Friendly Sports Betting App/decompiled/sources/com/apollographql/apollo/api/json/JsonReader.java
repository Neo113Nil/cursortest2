package com.apollographql.apollo.api.json;

import com.facebook.infer.annotation.ThreadConfined;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* compiled from: JsonReader.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001!J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0000H&J\b\u0010\u0006\u001a\u00020\u0000H&J\b\u0010\u0007\u001a\u00020\u0000H&J\b\u0010\b\u001a\u00020\u0000H&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\n\u0010\r\u001a\u0004\u0018\u00010\fH&J\b\u0010\u000e\u001a\u00020\nH&J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\b\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\u0014H&J\b\u0010\u0015\u001a\u00020\u0016H&J\b\u0010\u0017\u001a\u00020\u0018H&J\b\u0010\u0019\u001a\u00020\u001aH&J\u0016\u0010\u001b\u001a\u00020\u00122\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u001dH&J\b\u0010\u001e\u001a\u00020\u001aH&J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u001dH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\"À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/api/json/JsonReader;", "Ljava/io/Closeable;", "Lokio/Closeable;", "peek", "Lcom/apollographql/apollo/api/json/JsonReader$Token;", "beginArray", "endArray", "beginObject", "endObject", "hasNext", "", "nextName", "", "nextString", "nextBoolean", "nextNull", "", "nextInt", "", "nextDouble", "", "nextLong", "", "nextNumber", "Lcom/apollographql/apollo/api/json/JsonNumber;", "skipValue", "", "selectName", "names", "", "rewind", "getPath", "", "Token", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface JsonReader extends Closeable {
    JsonReader beginArray() throws IOException;

    JsonReader beginObject() throws IOException;

    JsonReader endArray() throws IOException;

    JsonReader endObject() throws IOException;

    List<Object> getPath();

    boolean hasNext() throws IOException;

    boolean nextBoolean() throws IOException;

    double nextDouble() throws IOException;

    int nextInt() throws IOException;

    long nextLong() throws IOException;

    String nextName() throws IOException;

    Void nextNull() throws IOException;

    JsonNumber nextNumber() throws IOException;

    String nextString() throws IOException;

    Token peek() throws IOException;

    void rewind();

    int selectName(List<String> names) throws IOException;

    void skipValue() throws IOException;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: JsonReader.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/apollographql/apollo/api/json/JsonReader$Token;", "", "<init>", "(Ljava/lang/String;I)V", "BEGIN_ARRAY", "END_ARRAY", "BEGIN_OBJECT", "END_OBJECT", "NAME", "STRING", "NUMBER", "LONG", "BOOLEAN", "NULL", "END_DOCUMENT", ThreadConfined.ANY, "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Token {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Token[] $VALUES;
        public static final Token BEGIN_ARRAY = new Token("BEGIN_ARRAY", 0);
        public static final Token END_ARRAY = new Token("END_ARRAY", 1);
        public static final Token BEGIN_OBJECT = new Token("BEGIN_OBJECT", 2);
        public static final Token END_OBJECT = new Token("END_OBJECT", 3);
        public static final Token NAME = new Token("NAME", 4);
        public static final Token STRING = new Token("STRING", 5);
        public static final Token NUMBER = new Token("NUMBER", 6);
        public static final Token LONG = new Token("LONG", 7);
        public static final Token BOOLEAN = new Token("BOOLEAN", 8);
        public static final Token NULL = new Token("NULL", 9);
        public static final Token END_DOCUMENT = new Token("END_DOCUMENT", 10);
        public static final Token ANY = new Token(ThreadConfined.ANY, 11);

        private static final /* synthetic */ Token[] $values() {
            return new Token[]{BEGIN_ARRAY, END_ARRAY, BEGIN_OBJECT, END_OBJECT, NAME, STRING, NUMBER, LONG, BOOLEAN, NULL, END_DOCUMENT, ANY};
        }

        public static EnumEntries<Token> getEntries() {
            return $ENTRIES;
        }

        private Token(String str, int i) {
        }

        static {
            Token[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static Token valueOf(String str) {
            return (Token) Enum.valueOf(Token.class, str);
        }

        public static Token[] values() {
            return (Token[]) $VALUES.clone();
        }
    }
}
