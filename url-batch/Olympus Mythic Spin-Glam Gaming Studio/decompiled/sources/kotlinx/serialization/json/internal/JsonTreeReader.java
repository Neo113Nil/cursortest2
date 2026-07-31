package kotlinx.serialization.json.internal;

import com.pubmatic.sdk.common.POBCommonConstants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.DeepRecursiveFunction;
import kotlin.DeepRecursiveKt;
import kotlin.DeepRecursiveScope;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* compiled from: JsonTreeReader.kt */
/* loaded from: classes.dex */
public final class JsonTreeReader {
    private final boolean isLenient;
    private final AbstractJsonLexer lexer;
    private int stackDepth;
    private final boolean trailingCommaAllowed;

    public JsonTreeReader(JsonConfiguration configuration, AbstractJsonLexer lexer) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        this.lexer = lexer;
        this.isLenient = configuration.isLenient();
        this.trailingCommaAllowed = configuration.getAllowTrailingComma();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0096 -> B:10:0x00a0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readObject(DeepRecursiveScope deepRecursiveScope, Continuation continuation) {
        JsonTreeReader$readObject$2 jsonTreeReader$readObject$2;
        int i;
        JsonTreeReader jsonTreeReader;
        LinkedHashMap linkedHashMap;
        JsonTreeReader$readObject$2 jsonTreeReader$readObject$22;
        byte b;
        DeepRecursiveScope deepRecursiveScope2;
        if (continuation instanceof JsonTreeReader$readObject$2) {
            jsonTreeReader$readObject$2 = (JsonTreeReader$readObject$2) continuation;
            int i2 = jsonTreeReader$readObject$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jsonTreeReader$readObject$2.label = i2 - Integer.MIN_VALUE;
                Object obj = jsonTreeReader$readObject$2.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = jsonTreeReader$readObject$2.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    byte consumeNextToken = this.lexer.consumeNextToken((byte) 6);
                    if (this.lexer.peekNextToken() == 4) {
                        AbstractJsonLexer.fail$default(this.lexer, "Unexpected leading comma", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                    jsonTreeReader = this;
                    linkedHashMap = new LinkedHashMap();
                    jsonTreeReader$readObject$22 = jsonTreeReader$readObject$2;
                    b = consumeNextToken;
                    deepRecursiveScope2 = deepRecursiveScope;
                    if (jsonTreeReader.lexer.canConsumeValue()) {
                    }
                    if (b == 6) {
                    }
                    return new JsonObject(linkedHashMap);
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str = (String) jsonTreeReader$readObject$2.L$3;
                linkedHashMap = (LinkedHashMap) jsonTreeReader$readObject$2.L$2;
                jsonTreeReader = (JsonTreeReader) jsonTreeReader$readObject$2.L$1;
                DeepRecursiveScope deepRecursiveScope3 = (DeepRecursiveScope) jsonTreeReader$readObject$2.L$0;
                ResultKt.throwOnFailure(obj);
                linkedHashMap.put(str, (JsonElement) obj);
                byte consumeNextToken2 = jsonTreeReader.lexer.consumeNextToken();
                if (consumeNextToken2 == 4) {
                    if (consumeNextToken2 != 7) {
                        AbstractJsonLexer.fail$default(jsonTreeReader.lexer, "Expected end of the object or comma", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                    b = consumeNextToken2;
                    if (b == 6) {
                        jsonTreeReader.lexer.consumeNextToken((byte) 7);
                    } else if (b == 4) {
                        if (!jsonTreeReader.trailingCommaAllowed) {
                            JsonExceptionsKt.invalidTrailingComma$default(jsonTreeReader.lexer, null, 1, null);
                            throw new KotlinNothingValueException();
                        }
                        jsonTreeReader.lexer.consumeNextToken((byte) 7);
                    }
                    return new JsonObject(linkedHashMap);
                }
                jsonTreeReader$readObject$22 = jsonTreeReader$readObject$2;
                b = consumeNextToken2;
                deepRecursiveScope2 = deepRecursiveScope3;
                if (jsonTreeReader.lexer.canConsumeValue()) {
                    String consumeStringLenient = jsonTreeReader.isLenient ? jsonTreeReader.lexer.consumeStringLenient() : jsonTreeReader.lexer.consumeString();
                    jsonTreeReader.lexer.consumeNextToken((byte) 5);
                    Unit unit = Unit.INSTANCE;
                    jsonTreeReader$readObject$22.L$0 = deepRecursiveScope2;
                    jsonTreeReader$readObject$22.L$1 = jsonTreeReader;
                    jsonTreeReader$readObject$22.L$2 = linkedHashMap;
                    jsonTreeReader$readObject$22.L$3 = consumeStringLenient;
                    jsonTreeReader$readObject$22.label = 1;
                    Object callRecursive = deepRecursiveScope2.callRecursive(unit, jsonTreeReader$readObject$22);
                    if (callRecursive == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    deepRecursiveScope3 = deepRecursiveScope2;
                    obj = callRecursive;
                    JsonTreeReader$readObject$2 jsonTreeReader$readObject$23 = jsonTreeReader$readObject$22;
                    str = consumeStringLenient;
                    jsonTreeReader$readObject$2 = jsonTreeReader$readObject$23;
                    linkedHashMap.put(str, (JsonElement) obj);
                    byte consumeNextToken22 = jsonTreeReader.lexer.consumeNextToken();
                    if (consumeNextToken22 == 4) {
                    }
                }
                if (b == 6) {
                }
                return new JsonObject(linkedHashMap);
            }
        }
        jsonTreeReader$readObject$2 = new JsonTreeReader$readObject$2(this, continuation);
        Object obj2 = jsonTreeReader$readObject$2.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = jsonTreeReader$readObject$2.label;
        if (i != 0) {
        }
    }

    private final JsonElement readObject() {
        byte consumeNextToken = this.lexer.consumeNextToken((byte) 6);
        if (this.lexer.peekNextToken() == 4) {
            AbstractJsonLexer.fail$default(this.lexer, "Unexpected leading comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (true) {
            if (!this.lexer.canConsumeValue()) {
                break;
            }
            String consumeStringLenient = this.isLenient ? this.lexer.consumeStringLenient() : this.lexer.consumeString();
            this.lexer.consumeNextToken((byte) 5);
            linkedHashMap.put(consumeStringLenient, read());
            consumeNextToken = this.lexer.consumeNextToken();
            if (consumeNextToken != 4) {
                if (consumeNextToken != 7) {
                    AbstractJsonLexer.fail$default(this.lexer, "Expected end of the object or comma", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        if (consumeNextToken == 6) {
            this.lexer.consumeNextToken((byte) 7);
        } else if (consumeNextToken == 4) {
            if (!this.trailingCommaAllowed) {
                JsonExceptionsKt.invalidTrailingComma$default(this.lexer, null, 1, null);
                throw new KotlinNothingValueException();
            }
            this.lexer.consumeNextToken((byte) 7);
        }
        return new JsonObject(linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonElement readArray() {
        byte consumeNextToken = this.lexer.consumeNextToken();
        if (this.lexer.peekNextToken() == 4) {
            AbstractJsonLexer.fail$default(this.lexer, "Unexpected leading comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        ArrayList arrayList = new ArrayList();
        while (this.lexer.canConsumeValue()) {
            arrayList.add(read());
            consumeNextToken = this.lexer.consumeNextToken();
            if (consumeNextToken != 4) {
                AbstractJsonLexer abstractJsonLexer = this.lexer;
                boolean z = consumeNextToken == 9;
                int i = abstractJsonLexer.currentPosition;
                if (!z) {
                    AbstractJsonLexer.fail$default(abstractJsonLexer, "Expected end of the array or comma", i, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        if (consumeNextToken == 8) {
            this.lexer.consumeNextToken((byte) 9);
        } else if (consumeNextToken == 4) {
            if (!this.trailingCommaAllowed) {
                JsonExceptionsKt.invalidTrailingComma(this.lexer, "array");
                throw new KotlinNothingValueException();
            }
            this.lexer.consumeNextToken((byte) 9);
        }
        return new JsonArray(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonPrimitive readValue(boolean z) {
        String consumeStringLenient;
        if (this.isLenient || !z) {
            consumeStringLenient = this.lexer.consumeStringLenient();
        } else {
            consumeStringLenient = this.lexer.consumeString();
        }
        String str = consumeStringLenient;
        return (z || !Intrinsics.areEqual(str, POBCommonConstants.NULL_VALUE)) ? new JsonLiteral(str, z, null, 4, null) : JsonNull.INSTANCE;
    }

    public final JsonElement read() {
        JsonElement readObject;
        byte peekNextToken = this.lexer.peekNextToken();
        if (peekNextToken == 1) {
            return readValue(true);
        }
        if (peekNextToken == 0) {
            return readValue(false);
        }
        if (peekNextToken == 6) {
            int i = this.stackDepth + 1;
            this.stackDepth = i;
            if (i == 200) {
                readObject = readDeepRecursive();
            } else {
                readObject = readObject();
            }
            this.stackDepth--;
            return readObject;
        }
        if (peekNextToken == 8) {
            return readArray();
        }
        AbstractJsonLexer.fail$default(this.lexer, "Cannot read Json element because of unexpected " + AbstractJsonLexerKt.tokenDescription(peekNextToken), 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final JsonElement readDeepRecursive() {
        return (JsonElement) DeepRecursiveKt.invoke(new DeepRecursiveFunction(new JsonTreeReader$readDeepRecursive$1(this, null)), Unit.INSTANCE);
    }
}
