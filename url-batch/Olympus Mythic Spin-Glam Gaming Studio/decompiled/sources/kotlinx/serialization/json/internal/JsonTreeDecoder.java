package kotlinx.serialization.json.internal;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.internal.JsonInternalDependenciesKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.JsonSchemaCacheKt;

/* compiled from: TreeJsonDecoder.kt */
/* loaded from: classes6.dex */
class JsonTreeDecoder extends AbstractJsonTreeDecoder {
    private boolean forceNull;
    private final SerialDescriptor polyDescriptor;
    private int position;
    private final JsonObject value;

    public /* synthetic */ JsonTreeDecoder(Json json, JsonObject jsonObject, String str, SerialDescriptor serialDescriptor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(json, jsonObject, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : serialDescriptor);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    public JsonObject getValue() {
        return this.value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeDecoder(Json json, JsonObject value, String str, SerialDescriptor serialDescriptor) {
        super(json, value, str, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
        this.polyDescriptor = serialDescriptor;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeElementIndex(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        while (this.position < descriptor.getElementsCount()) {
            int i = this.position;
            this.position = i + 1;
            String tag = getTag(descriptor, i);
            int i2 = this.position - 1;
            this.forceNull = false;
            if (getValue().containsKey((Object) tag) || setForceNull(descriptor, i2)) {
                if (!this.configuration.getCoerceInputValues()) {
                    return i2;
                }
                Json json = getJson();
                boolean isElementOptional = descriptor.isElementOptional(i2);
                SerialDescriptor elementDescriptor = descriptor.getElementDescriptor(i2);
                if (!isElementOptional || elementDescriptor.isNullable() || !(currentElementOrNull(tag) instanceof JsonNull)) {
                    if (Intrinsics.areEqual(elementDescriptor.getKind(), SerialKind.ENUM.INSTANCE) && (!elementDescriptor.isNullable() || !(currentElementOrNull(tag) instanceof JsonNull))) {
                        JsonElement currentElementOrNull = currentElementOrNull(tag);
                        JsonPrimitive jsonPrimitive = currentElementOrNull instanceof JsonPrimitive ? (JsonPrimitive) currentElementOrNull : null;
                        String contentOrNull = jsonPrimitive != null ? JsonElementKt.getContentOrNull(jsonPrimitive) : null;
                        if (contentOrNull != null) {
                            int jsonNameIndex = JsonNamesMapKt.getJsonNameIndex(elementDescriptor, json, contentOrNull);
                            boolean z = !json.getConfiguration().getExplicitNulls() && elementDescriptor.isNullable();
                            if (jsonNameIndex == -3 && ((isElementOptional || z) && !setForceNull(descriptor, i2))) {
                            }
                        }
                    }
                    return i2;
                }
            }
        }
        return -1;
    }

    private final boolean setForceNull(SerialDescriptor serialDescriptor, int i) {
        boolean z = (getJson().getConfiguration().getExplicitNulls() || serialDescriptor.isElementOptional(i) || !serialDescriptor.getElementDescriptor(i).isNullable()) ? false : true;
        this.forceNull = z;
        return z;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder, kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        return !this.forceNull && super.decodeNotNullMark();
    }

    @Override // kotlinx.serialization.internal.NamedValueDecoder
    protected String elementName(SerialDescriptor descriptor, int i) {
        Object obj;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        JsonNamesMapKt.namingStrategy(descriptor, getJson());
        String elementName = descriptor.getElementName(i);
        if (!this.configuration.getUseAlternativeNames() || getValue().keySet().contains(elementName)) {
            return elementName;
        }
        Map deserializationNamesMap = JsonNamesMapKt.deserializationNamesMap(getJson(), descriptor);
        Iterator<T> it = getValue().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Integer num = (Integer) deserializationNamesMap.get((String) obj);
            if (num != null && num.intValue() == i) {
                break;
            }
        }
        String str = (String) obj;
        return str != null ? str : elementName;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    public JsonElement currentElement(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return (JsonElement) MapsKt.getValue(getValue(), tag);
    }

    public final JsonElement currentElementOrNull(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return (JsonElement) getValue().get((Object) tag);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder, kotlinx.serialization.encoding.Decoder
    public CompositeDecoder beginStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor == this.polyDescriptor) {
            Json json = getJson();
            JsonElement currentObject = currentObject();
            String serialName = this.polyDescriptor.getSerialName();
            if (currentObject instanceof JsonObject) {
                return new JsonTreeDecoder(json, (JsonObject) currentObject, getPolymorphicDiscriminator(), this.polyDescriptor);
            }
            throw JsonExceptionsKt.JsonDecodingException(-1, "Expected " + Reflection.getOrCreateKotlinClass(JsonObject.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(currentObject.getClass()).getSimpleName() + " as the serialized body of " + serialName + " at element: " + renderTagStack(), currentObject.toString());
        }
        return super.beginStructure(descriptor);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(SerialDescriptor descriptor) {
        Set plus;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (JsonNamesMapKt.ignoreUnknownKeys(descriptor, getJson()) || (descriptor.getKind() instanceof PolymorphicKind)) {
            return;
        }
        JsonNamesMapKt.namingStrategy(descriptor, getJson());
        if (this.configuration.getUseAlternativeNames()) {
            Set jsonCachedSerialNames = JsonInternalDependenciesKt.jsonCachedSerialNames(descriptor);
            Map map = (Map) JsonSchemaCacheKt.getSchemaCache(getJson()).get(descriptor, JsonNamesMapKt.getJsonDeserializationNamesKey());
            Set keySet = map != null ? map.keySet() : null;
            if (keySet == null) {
                keySet = SetsKt.emptySet();
            }
            plus = SetsKt.plus(jsonCachedSerialNames, (Iterable) keySet);
        } else {
            plus = JsonInternalDependenciesKt.jsonCachedSerialNames(descriptor);
        }
        for (String str : getValue().keySet()) {
            if (!plus.contains(str) && !Intrinsics.areEqual(str, getPolymorphicDiscriminator())) {
                throw JsonExceptionsKt.JsonDecodingException(-1, "Encountered an unknown key '" + str + "' at element: " + renderTagStack() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + ((Object) JsonExceptionsKt.minify$default(getValue().toString(), 0, 1, null)));
            }
        }
    }
}
