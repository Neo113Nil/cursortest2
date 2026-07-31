package kotlinx.serialization.internal;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.StructureKind;

/* compiled from: Tuples.kt */
/* loaded from: classes12.dex */
public final class MapEntrySerializer extends KeyValueSerializer {
    private final SerialDescriptor descriptor;

    /* compiled from: Tuples.kt */
    private static final class MapEntry implements Map.Entry, KMappedMarker {
        private final Object key;
        private final Object value;

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MapEntry)) {
                return false;
            }
            MapEntry mapEntry = (MapEntry) obj;
            return Intrinsics.areEqual(this.key, mapEntry.key) && Intrinsics.areEqual(this.value, mapEntry.value);
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object obj = this.key;
            int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
            Object obj2 = this.value;
            return hashCode + (obj2 != null ? obj2.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public String toString() {
            return "MapEntry(key=" + this.key + ", value=" + this.value + ')';
        }

        public MapEntry(Object obj, Object obj2) {
            this.key = obj;
            this.value = obj2;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.value;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapEntrySerializer(final KSerializer keySerializer, final KSerializer valueSerializer) {
        super(keySerializer, valueSerializer, null);
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        this.descriptor = SerialDescriptorsKt.buildSerialDescriptor("kotlin.collections.Map.Entry", StructureKind.MAP.INSTANCE, new SerialDescriptor[0], new Function1() { // from class: kotlinx.serialization.internal.MapEntrySerializer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit descriptor$lambda$0;
                descriptor$lambda$0 = MapEntrySerializer.descriptor$lambda$0(KSerializer.this, valueSerializer, (ClassSerialDescriptorBuilder) obj);
                return descriptor$lambda$0;
            }
        });
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit descriptor$lambda$0(KSerializer kSerializer, KSerializer kSerializer2, ClassSerialDescriptorBuilder buildSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        ClassSerialDescriptorBuilder.element$default(buildSerialDescriptor, "key", kSerializer.getDescriptor(), null, false, 12, null);
        ClassSerialDescriptorBuilder.element$default(buildSerialDescriptor, "value", kSerializer2.getDescriptor(), null, false, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public Object getKey(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "<this>");
        return entry.getKey();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public Object getValue(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "<this>");
        return entry.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public Map.Entry toResult(Object obj, Object obj2) {
        return new MapEntry(obj, obj2);
    }
}
