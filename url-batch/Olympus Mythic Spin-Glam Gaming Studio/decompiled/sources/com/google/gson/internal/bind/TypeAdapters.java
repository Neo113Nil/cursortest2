package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.ironsource.X3;
import com.pubmatic.sdk.common.POBCommonConstants;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import org.slf4j.Marker;

/* loaded from: classes13.dex */
public abstract class TypeAdapters {
    public static final TypeAdapter ATOMIC_BOOLEAN;
    public static final TypeAdapterFactory ATOMIC_BOOLEAN_FACTORY;
    public static final TypeAdapter ATOMIC_INTEGER;
    public static final TypeAdapter ATOMIC_INTEGER_ARRAY;
    public static final TypeAdapterFactory ATOMIC_INTEGER_ARRAY_FACTORY;
    public static final TypeAdapterFactory ATOMIC_INTEGER_FACTORY;
    public static final TypeAdapter BIG_DECIMAL;
    public static final TypeAdapter BIG_INTEGER;
    public static final TypeAdapter BIT_SET;
    public static final TypeAdapterFactory BIT_SET_FACTORY;
    public static final TypeAdapter BOOLEAN;
    public static final TypeAdapter BOOLEAN_AS_STRING;
    public static final TypeAdapterFactory BOOLEAN_FACTORY;
    public static final TypeAdapter BYTE;
    public static final TypeAdapterFactory BYTE_FACTORY;
    public static final TypeAdapter CALENDAR;
    public static final TypeAdapterFactory CALENDAR_FACTORY;
    public static final TypeAdapter CHARACTER;
    public static final TypeAdapterFactory CHARACTER_FACTORY;
    public static final TypeAdapter CLASS;
    public static final TypeAdapterFactory CLASS_FACTORY;
    public static final TypeAdapter CURRENCY;
    public static final TypeAdapterFactory CURRENCY_FACTORY;
    public static final TypeAdapter DOUBLE;
    public static final TypeAdapterFactory ENUM_FACTORY;
    public static final TypeAdapter FLOAT;
    public static final TypeAdapter INET_ADDRESS;
    public static final TypeAdapterFactory INET_ADDRESS_FACTORY;
    public static final TypeAdapter INTEGER;
    public static final TypeAdapterFactory INTEGER_FACTORY;
    public static final TypeAdapter JSON_ELEMENT;
    public static final TypeAdapterFactory JSON_ELEMENT_FACTORY;
    public static final TypeAdapter LOCALE;
    public static final TypeAdapterFactory LOCALE_FACTORY;
    public static final TypeAdapter LONG;
    public static final TypeAdapter NUMBER;
    public static final TypeAdapterFactory NUMBER_FACTORY;
    public static final TypeAdapter SHORT;
    public static final TypeAdapterFactory SHORT_FACTORY;
    public static final TypeAdapter STRING;
    public static final TypeAdapter STRING_BUFFER;
    public static final TypeAdapterFactory STRING_BUFFER_FACTORY;
    public static final TypeAdapter STRING_BUILDER;
    public static final TypeAdapterFactory STRING_BUILDER_FACTORY;
    public static final TypeAdapterFactory STRING_FACTORY;
    public static final TypeAdapterFactory TIMESTAMP_FACTORY;
    public static final TypeAdapter URI;
    public static final TypeAdapterFactory URI_FACTORY;
    public static final TypeAdapter URL;
    public static final TypeAdapterFactory URL_FACTORY;
    public static final TypeAdapter UUID;
    public static final TypeAdapterFactory UUID_FACTORY;

    static {
        TypeAdapter nullSafe = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.1
            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, Class cls) {
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
            }

            @Override // com.google.gson.TypeAdapter
            public Class read(JsonReader jsonReader) {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }
        }.nullSafe();
        CLASS = nullSafe;
        CLASS_FACTORY = newFactory(Class.class, nullSafe);
        TypeAdapter nullSafe2 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.2
            /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
            
                if (java.lang.Integer.parseInt(r1) != 0) goto L23;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
            
                r5 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
            
                if (r8.nextInt() != 0) goto L23;
             */
            @Override // com.google.gson.TypeAdapter
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public BitSet read(JsonReader jsonReader) {
                BitSet bitSet = new BitSet();
                jsonReader.beginArray();
                JsonToken peek = jsonReader.peek();
                int i = 0;
                while (peek != JsonToken.END_ARRAY) {
                    int i2 = AnonymousClass36.$SwitchMap$com$google$gson$stream$JsonToken[peek.ordinal()];
                    boolean z = true;
                    if (i2 != 1) {
                        if (i2 == 2) {
                            z = jsonReader.nextBoolean();
                        } else if (i2 == 3) {
                            String nextString = jsonReader.nextString();
                            try {
                            } catch (NumberFormatException unused) {
                                throw new JsonSyntaxException("Error: Expecting: bitset number value (1, 0), Found: " + nextString);
                            }
                        } else {
                            throw new JsonSyntaxException("Invalid bitset value type: " + peek);
                        }
                        if (z) {
                            bitSet.set(i);
                        }
                        i++;
                        peek = jsonReader.peek();
                    }
                }
                jsonReader.endArray();
                return bitSet;
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, BitSet bitSet) {
                jsonWriter.beginArray();
                int length = bitSet.length();
                for (int i = 0; i < length; i++) {
                    jsonWriter.value(bitSet.get(i) ? 1L : 0L);
                }
                jsonWriter.endArray();
            }
        }.nullSafe();
        BIT_SET = nullSafe2;
        BIT_SET_FACTORY = newFactory(BitSet.class, nullSafe2);
        TypeAdapter typeAdapter = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.3
            @Override // com.google.gson.TypeAdapter
            public Boolean read(JsonReader jsonReader) {
                JsonToken peek = jsonReader.peek();
                if (peek == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                if (peek == JsonToken.STRING) {
                    return Boolean.valueOf(Boolean.parseBoolean(jsonReader.nextString()));
                }
                return Boolean.valueOf(jsonReader.nextBoolean());
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, Boolean bool) {
                jsonWriter.value(bool);
            }
        };
        BOOLEAN = typeAdapter;
        BOOLEAN_AS_STRING = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.4
            @Override // com.google.gson.TypeAdapter
            public Boolean read(JsonReader jsonReader) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return Boolean.valueOf(jsonReader.nextString());
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, Boolean bool) {
                jsonWriter.value(bool == null ? POBCommonConstants.NULL_VALUE : bool.toString());
            }
        };
        BOOLEAN_FACTORY = newFactory(Boolean.TYPE, Boolean.class, typeAdapter);
        TypeAdapter typeAdapter2 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.5
            @Override // com.google.gson.TypeAdapter
            public Number read(JsonReader jsonReader) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return Byte.valueOf((byte) jsonReader.nextInt());
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException(e);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, Number number) {
                jsonWriter.value(number);
            }
        };
        BYTE = typeAdapter2;
        BYTE_FACTORY = newFactory(Byte.TYPE, Byte.class, typeAdapter2);
        TypeAdapter typeAdapter3 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.6
            @Override // com.google.gson.TypeAdapter
            public Number read(JsonReader jsonReader) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return Short.valueOf((short) jsonReader.nextInt());
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException(e);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, Number number) {
                jsonWriter.value(number);
            }
        };
        SHORT = typeAdapter3;
        SHORT_FACTORY = newFactory(Short.TYPE, Short.class, typeAdapter3);
        TypeAdapter typeAdapter4 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.7
            @Override // com.google.gson.TypeAdapter
            public Number read(JsonReader jsonReader) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return Integer.valueOf(jsonReader.nextInt());
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException(e);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, Number number) {
                jsonWriter.value(number);
            }
        };
        INTEGER = typeAdapter4;
        INTEGER_FACTORY = newFactory(Integer.TYPE, Integer.class, typeAdapter4);
        TypeAdapter nullSafe3 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.8
            @Override // com.google.gson.TypeAdapter
            public AtomicInteger read(JsonReader jsonReader) {
                try {
                    return new AtomicInteger(jsonReader.nextInt());
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException(e);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, AtomicInteger atomicInteger) {
                jsonWriter.value(atomicInteger.get());
            }
        }.nullSafe();
        ATOMIC_INTEGER = nullSafe3;
        ATOMIC_INTEGER_FACTORY = newFactory(AtomicInteger.class, nullSafe3);
        TypeAdapter nullSafe4 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.9
            @Override // com.google.gson.TypeAdapter
            public AtomicBoolean read(JsonReader jsonReader) {
                return new AtomicBoolean(jsonReader.nextBoolean());
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, AtomicBoolean atomicBoolean) {
                jsonWriter.value(atomicBoolean.get());
            }
        }.nullSafe();
        ATOMIC_BOOLEAN = nullSafe4;
        ATOMIC_BOOLEAN_FACTORY = newFactory(AtomicBoolean.class, nullSafe4);
        TypeAdapter nullSafe5 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.10
            @Override // com.google.gson.TypeAdapter
            public AtomicIntegerArray read(JsonReader jsonReader) {
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    try {
                        arrayList.add(Integer.valueOf(jsonReader.nextInt()));
                    } catch (NumberFormatException e) {
                        throw new JsonSyntaxException(e);
                    }
                }
                jsonReader.endArray();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i = 0; i < size; i++) {
                    atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, AtomicIntegerArray atomicIntegerArray) {
                jsonWriter.beginArray();
                int length = atomicIntegerArray.length();
                for (int i = 0; i < length; i++) {
                    jsonWriter.value(atomicIntegerArray.get(i));
                }
                jsonWriter.endArray();
            }
        }.nullSafe();
        ATOMIC_INTEGER_ARRAY = nullSafe5;
        ATOMIC_INTEGER_ARRAY_FACTORY = newFactory(AtomicIntegerArray.class, nullSafe5);
        LONG = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.11
            @Override // com.google.gson.TypeAdapter
            public Number read(JsonReader jsonReader) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return Long.valueOf(jsonReader.nextLong());
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException(e);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, Number number) {
                jsonWriter.value(number);
            }
        };
        FLOAT = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.12
            @Override // com.google.gson.TypeAdapter
            public Number read(JsonReader jsonReader) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return Float.valueOf((float) jsonReader.nextDouble());
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, Number number) {
                jsonWriter.value(number);
            }
        };
        DOUBLE = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.13
            @Override // com.google.gson.TypeAdapter
            public Number read(JsonReader jsonReader) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return Double.valueOf(jsonReader.nextDouble());
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, Number number) {
                jsonWriter.value(number);
            }
        };
        TypeAdapter typeAdapter5 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.14
            @Override // com.google.gson.TypeAdapter
            public Number read(JsonReader jsonReader) {
                JsonToken peek = jsonReader.peek();
                int i = AnonymousClass36.$SwitchMap$com$google$gson$stream$JsonToken[peek.ordinal()];
                if (i == 1 || i == 3) {
                    return new LazilyParsedNumber(jsonReader.nextString());
                }
                if (i == 4) {
                    jsonReader.nextNull();
                    return null;
                }
                throw new JsonSyntaxException("Expecting number, got: " + peek);
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, Number number) {
                jsonWriter.value(number);
            }
        };
        NUMBER = typeAdapter5;
        NUMBER_FACTORY = newFactory(Number.class, typeAdapter5);
        TypeAdapter typeAdapter6 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.15
            @Override // com.google.gson.TypeAdapter
            public Character read(JsonReader jsonReader) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String nextString = jsonReader.nextString();
                if (nextString.length() != 1) {
                    throw new JsonSyntaxException("Expecting character, got: " + nextString);
                }
                return Character.valueOf(nextString.charAt(0));
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, Character ch) {
                jsonWriter.value(ch == null ? null : String.valueOf(ch));
            }
        };
        CHARACTER = typeAdapter6;
        CHARACTER_FACTORY = newFactory(Character.TYPE, Character.class, typeAdapter6);
        TypeAdapter typeAdapter7 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.16
            @Override // com.google.gson.TypeAdapter
            public String read(JsonReader jsonReader) {
                JsonToken peek = jsonReader.peek();
                if (peek == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                if (peek == JsonToken.BOOLEAN) {
                    return Boolean.toString(jsonReader.nextBoolean());
                }
                return jsonReader.nextString();
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, String str) {
                jsonWriter.value(str);
            }
        };
        STRING = typeAdapter7;
        BIG_DECIMAL = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.17
            @Override // com.google.gson.TypeAdapter
            public BigDecimal read(JsonReader jsonReader) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return new BigDecimal(jsonReader.nextString());
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException(e);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, BigDecimal bigDecimal) {
                jsonWriter.value(bigDecimal);
            }
        };
        BIG_INTEGER = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.18
            @Override // com.google.gson.TypeAdapter
            public BigInteger read(JsonReader jsonReader) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return new BigInteger(jsonReader.nextString());
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException(e);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, BigInteger bigInteger) {
                jsonWriter.value(bigInteger);
            }
        };
        STRING_FACTORY = newFactory(String.class, typeAdapter7);
        TypeAdapter typeAdapter8 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.19
            @Override // com.google.gson.TypeAdapter
            public StringBuilder read(JsonReader jsonReader) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return new StringBuilder(jsonReader.nextString());
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, StringBuilder sb) {
                jsonWriter.value(sb == null ? null : sb.toString());
            }
        };
        STRING_BUILDER = typeAdapter8;
        STRING_BUILDER_FACTORY = newFactory(StringBuilder.class, typeAdapter8);
        TypeAdapter typeAdapter9 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.20
            @Override // com.google.gson.TypeAdapter
            public StringBuffer read(JsonReader jsonReader) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return new StringBuffer(jsonReader.nextString());
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, StringBuffer stringBuffer) {
                jsonWriter.value(stringBuffer == null ? null : stringBuffer.toString());
            }
        };
        STRING_BUFFER = typeAdapter9;
        STRING_BUFFER_FACTORY = newFactory(StringBuffer.class, typeAdapter9);
        TypeAdapter typeAdapter10 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.21
            @Override // com.google.gson.TypeAdapter
            public URL read(JsonReader jsonReader) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String nextString = jsonReader.nextString();
                if (POBCommonConstants.NULL_VALUE.equals(nextString)) {
                    return null;
                }
                return new URL(nextString);
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, URL url) {
                jsonWriter.value(url == null ? null : url.toExternalForm());
            }
        };
        URL = typeAdapter10;
        URL_FACTORY = newFactory(URL.class, typeAdapter10);
        TypeAdapter typeAdapter11 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.22
            @Override // com.google.gson.TypeAdapter
            public URI read(JsonReader jsonReader) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    String nextString = jsonReader.nextString();
                    if (POBCommonConstants.NULL_VALUE.equals(nextString)) {
                        return null;
                    }
                    return new URI(nextString);
                } catch (URISyntaxException e) {
                    throw new JsonIOException(e);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, URI uri) {
                jsonWriter.value(uri == null ? null : uri.toASCIIString());
            }
        };
        URI = typeAdapter11;
        URI_FACTORY = newFactory(URI.class, typeAdapter11);
        TypeAdapter typeAdapter12 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.23
            @Override // com.google.gson.TypeAdapter
            public InetAddress read(JsonReader jsonReader) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return InetAddress.getByName(jsonReader.nextString());
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, InetAddress inetAddress) {
                jsonWriter.value(inetAddress == null ? null : inetAddress.getHostAddress());
            }
        };
        INET_ADDRESS = typeAdapter12;
        INET_ADDRESS_FACTORY = newTypeHierarchyFactory(InetAddress.class, typeAdapter12);
        TypeAdapter typeAdapter13 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.24
            @Override // com.google.gson.TypeAdapter
            public UUID read(JsonReader jsonReader) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return UUID.fromString(jsonReader.nextString());
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, UUID uuid) {
                jsonWriter.value(uuid == null ? null : uuid.toString());
            }
        };
        UUID = typeAdapter13;
        UUID_FACTORY = newFactory(UUID.class, typeAdapter13);
        TypeAdapter nullSafe6 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.25
            @Override // com.google.gson.TypeAdapter
            public Currency read(JsonReader jsonReader) {
                return Currency.getInstance(jsonReader.nextString());
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, Currency currency) {
                jsonWriter.value(currency.getCurrencyCode());
            }
        }.nullSafe();
        CURRENCY = nullSafe6;
        CURRENCY_FACTORY = newFactory(Currency.class, nullSafe6);
        TIMESTAMP_FACTORY = new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.26
            @Override // com.google.gson.TypeAdapterFactory
            public TypeAdapter create(Gson gson, TypeToken typeToken) {
                if (typeToken.getRawType() != Timestamp.class) {
                    return null;
                }
                final TypeAdapter adapter = gson.getAdapter(Date.class);
                return new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.26.1
                    @Override // com.google.gson.TypeAdapter
                    public Timestamp read(JsonReader jsonReader) {
                        Date date = (Date) adapter.read(jsonReader);
                        if (date != null) {
                            return new Timestamp(date.getTime());
                        }
                        return null;
                    }

                    @Override // com.google.gson.TypeAdapter
                    public void write(JsonWriter jsonWriter, Timestamp timestamp) {
                        adapter.write(jsonWriter, timestamp);
                    }
                };
            }
        };
        TypeAdapter typeAdapter14 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.27
            @Override // com.google.gson.TypeAdapter
            public Calendar read(JsonReader jsonReader) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (jsonReader.peek() != JsonToken.END_OBJECT) {
                    String nextName = jsonReader.nextName();
                    int nextInt = jsonReader.nextInt();
                    if ("year".equals(nextName)) {
                        i = nextInt;
                    } else if ("month".equals(nextName)) {
                        i2 = nextInt;
                    } else if ("dayOfMonth".equals(nextName)) {
                        i3 = nextInt;
                    } else if ("hourOfDay".equals(nextName)) {
                        i4 = nextInt;
                    } else if ("minute".equals(nextName)) {
                        i5 = nextInt;
                    } else if ("second".equals(nextName)) {
                        i6 = nextInt;
                    }
                }
                jsonReader.endObject();
                return new GregorianCalendar(i, i2, i3, i4, i5, i6);
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, Calendar calendar) {
                if (calendar == null) {
                    jsonWriter.nullValue();
                    return;
                }
                jsonWriter.beginObject();
                jsonWriter.name("year");
                jsonWriter.value(calendar.get(1));
                jsonWriter.name("month");
                jsonWriter.value(calendar.get(2));
                jsonWriter.name("dayOfMonth");
                jsonWriter.value(calendar.get(5));
                jsonWriter.name("hourOfDay");
                jsonWriter.value(calendar.get(11));
                jsonWriter.name("minute");
                jsonWriter.value(calendar.get(12));
                jsonWriter.name("second");
                jsonWriter.value(calendar.get(13));
                jsonWriter.endObject();
            }
        };
        CALENDAR = typeAdapter14;
        CALENDAR_FACTORY = newFactoryForMultipleTypes(Calendar.class, GregorianCalendar.class, typeAdapter14);
        TypeAdapter typeAdapter15 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.28
            @Override // com.google.gson.TypeAdapter
            public Locale read(JsonReader jsonReader) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(jsonReader.nextString(), "_");
                String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                if (nextToken2 == null && nextToken3 == null) {
                    return new Locale(nextToken);
                }
                if (nextToken3 == null) {
                    return new Locale(nextToken, nextToken2);
                }
                return new Locale(nextToken, nextToken2, nextToken3);
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, Locale locale) {
                jsonWriter.value(locale == null ? null : locale.toString());
            }
        };
        LOCALE = typeAdapter15;
        LOCALE_FACTORY = newFactory(Locale.class, typeAdapter15);
        TypeAdapter typeAdapter16 = new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.29
            @Override // com.google.gson.TypeAdapter
            public JsonElement read(JsonReader jsonReader) {
                switch (AnonymousClass36.$SwitchMap$com$google$gson$stream$JsonToken[jsonReader.peek().ordinal()]) {
                    case 1:
                        return new JsonPrimitive(new LazilyParsedNumber(jsonReader.nextString()));
                    case 2:
                        return new JsonPrimitive(Boolean.valueOf(jsonReader.nextBoolean()));
                    case 3:
                        return new JsonPrimitive(jsonReader.nextString());
                    case 4:
                        jsonReader.nextNull();
                        return JsonNull.INSTANCE;
                    case 5:
                        JsonArray jsonArray = new JsonArray();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            jsonArray.add(read(jsonReader));
                        }
                        jsonReader.endArray();
                        return jsonArray;
                    case 6:
                        JsonObject jsonObject = new JsonObject();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            jsonObject.add(jsonReader.nextName(), read(jsonReader));
                        }
                        jsonReader.endObject();
                        return jsonObject;
                    default:
                        throw new IllegalArgumentException();
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, JsonElement jsonElement) {
                if (jsonElement == null || jsonElement.isJsonNull()) {
                    jsonWriter.nullValue();
                    return;
                }
                if (jsonElement.isJsonPrimitive()) {
                    JsonPrimitive asJsonPrimitive = jsonElement.getAsJsonPrimitive();
                    if (asJsonPrimitive.isNumber()) {
                        jsonWriter.value(asJsonPrimitive.getAsNumber());
                        return;
                    } else if (asJsonPrimitive.isBoolean()) {
                        jsonWriter.value(asJsonPrimitive.getAsBoolean());
                        return;
                    } else {
                        jsonWriter.value(asJsonPrimitive.getAsString());
                        return;
                    }
                }
                if (jsonElement.isJsonArray()) {
                    jsonWriter.beginArray();
                    Iterator it = jsonElement.getAsJsonArray().iterator();
                    while (it.hasNext()) {
                        write(jsonWriter, (JsonElement) it.next());
                    }
                    jsonWriter.endArray();
                    return;
                }
                if (jsonElement.isJsonObject()) {
                    jsonWriter.beginObject();
                    for (Map.Entry entry : jsonElement.getAsJsonObject().entrySet()) {
                        jsonWriter.name((String) entry.getKey());
                        write(jsonWriter, (JsonElement) entry.getValue());
                    }
                    jsonWriter.endObject();
                    return;
                }
                throw new IllegalArgumentException("Couldn't write " + jsonElement.getClass());
            }
        };
        JSON_ELEMENT = typeAdapter16;
        JSON_ELEMENT_FACTORY = newTypeHierarchyFactory(JsonElement.class, typeAdapter16);
        ENUM_FACTORY = new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.30
            @Override // com.google.gson.TypeAdapterFactory
            public TypeAdapter create(Gson gson, TypeToken typeToken) {
                Class rawType = typeToken.getRawType();
                if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                    return null;
                }
                if (!rawType.isEnum()) {
                    rawType = rawType.getSuperclass();
                }
                return new EnumTypeAdapter(rawType);
            }
        };
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$36, reason: invalid class name */
    static /* synthetic */ class AnonymousClass36 {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken;

        static {
            int[] iArr = new int[JsonToken.values().length];
            $SwitchMap$com$google$gson$stream$JsonToken = iArr;
            try {
                iArr[JsonToken.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    private static final class EnumTypeAdapter extends TypeAdapter {
        private final Map nameToConstant = new HashMap();
        private final Map constantToName = new HashMap();

        public EnumTypeAdapter(Class cls) {
            try {
                for (final Field field : cls.getDeclaredFields()) {
                    if (field.isEnumConstant()) {
                        AccessController.doPrivileged(new PrivilegedAction() { // from class: com.google.gson.internal.bind.TypeAdapters.EnumTypeAdapter.1
                            @Override // java.security.PrivilegedAction
                            public Void run() {
                                field.setAccessible(true);
                                return null;
                            }
                        });
                        Enum r4 = (Enum) field.get(null);
                        String name = r4.name();
                        SerializedName serializedName = (SerializedName) field.getAnnotation(SerializedName.class);
                        if (serializedName != null) {
                            name = serializedName.value();
                            for (String str : serializedName.alternate()) {
                                this.nameToConstant.put(str, r4);
                            }
                        }
                        this.nameToConstant.put(name, r4);
                        this.constantToName.put(r4, name);
                    }
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public Enum read(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return (Enum) this.nameToConstant.get(jsonReader.nextString());
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, Enum r3) {
            jsonWriter.value(r3 == null ? null : (String) this.constantToName.get(r3));
        }
    }

    public static TypeAdapterFactory newFactory(final TypeToken typeToken, final TypeAdapter typeAdapter) {
        return new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.31
            @Override // com.google.gson.TypeAdapterFactory
            public TypeAdapter create(Gson gson, TypeToken typeToken2) {
                if (typeToken2.equals(TypeToken.this)) {
                    return typeAdapter;
                }
                return null;
            }
        };
    }

    public static TypeAdapterFactory newFactory(final Class cls, final TypeAdapter typeAdapter) {
        return new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.32
            @Override // com.google.gson.TypeAdapterFactory
            public TypeAdapter create(Gson gson, TypeToken typeToken) {
                if (typeToken.getRawType() == cls) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + ",adapter=" + typeAdapter + X3.j.e;
            }
        };
    }

    public static TypeAdapterFactory newFactory(final Class cls, final Class cls2, final TypeAdapter typeAdapter) {
        return new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.33
            @Override // com.google.gson.TypeAdapterFactory
            public TypeAdapter create(Gson gson, TypeToken typeToken) {
                Class rawType = typeToken.getRawType();
                if (rawType == cls || rawType == cls2) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls2.getName() + Marker.ANY_NON_NULL_MARKER + cls.getName() + ",adapter=" + typeAdapter + X3.j.e;
            }
        };
    }

    public static TypeAdapterFactory newFactoryForMultipleTypes(final Class cls, final Class cls2, final TypeAdapter typeAdapter) {
        return new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.34
            @Override // com.google.gson.TypeAdapterFactory
            public TypeAdapter create(Gson gson, TypeToken typeToken) {
                Class rawType = typeToken.getRawType();
                if (rawType == cls || rawType == cls2) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + Marker.ANY_NON_NULL_MARKER + cls2.getName() + ",adapter=" + typeAdapter + X3.j.e;
            }
        };
    }

    public static TypeAdapterFactory newTypeHierarchyFactory(final Class cls, final TypeAdapter typeAdapter) {
        return new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.35
            @Override // com.google.gson.TypeAdapterFactory
            public TypeAdapter create(Gson gson, TypeToken typeToken) {
                final Class<?> rawType = typeToken.getRawType();
                if (cls.isAssignableFrom(rawType)) {
                    return new TypeAdapter() { // from class: com.google.gson.internal.bind.TypeAdapters.35.1
                        @Override // com.google.gson.TypeAdapter
                        public void write(JsonWriter jsonWriter, Object obj) {
                            typeAdapter.write(jsonWriter, obj);
                        }

                        @Override // com.google.gson.TypeAdapter
                        public Object read(JsonReader jsonReader) {
                            Object read = typeAdapter.read(jsonReader);
                            if (read == null || rawType.isInstance(read)) {
                                return read;
                            }
                            throw new JsonSyntaxException("Expected a " + rawType.getName() + " but was " + read.getClass().getName());
                        }
                    };
                }
                return null;
            }

            public String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + typeAdapter + X3.j.e;
            }
        };
    }
}
