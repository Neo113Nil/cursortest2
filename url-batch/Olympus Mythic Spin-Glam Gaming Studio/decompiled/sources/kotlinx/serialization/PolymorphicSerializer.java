package kotlinx.serialization;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.ContextAwareKt;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;

/* compiled from: PolymorphicSerializer.kt */
/* loaded from: classes15.dex */
public final class PolymorphicSerializer extends AbstractPolymorphicSerializer {
    private List _annotations;
    private final KClass baseClass;
    private final Lazy descriptor$delegate;

    public PolymorphicSerializer(KClass baseClass) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        this.baseClass = baseClass;
        this._annotations = CollectionsKt.emptyList();
        this.descriptor$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: kotlinx.serialization.PolymorphicSerializer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                SerialDescriptor descriptor_delegate$lambda$1;
                descriptor_delegate$lambda$1 = PolymorphicSerializer.descriptor_delegate$lambda$1(PolymorphicSerializer.this);
                return descriptor_delegate$lambda$1;
            }
        });
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public KClass getBaseClass() {
        return this.baseClass;
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.descriptor$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor descriptor_delegate$lambda$1(final PolymorphicSerializer polymorphicSerializer) {
        return ContextAwareKt.withContext(SerialDescriptorsKt.buildSerialDescriptor("kotlinx.serialization.Polymorphic", PolymorphicKind.OPEN.INSTANCE, new SerialDescriptor[0], new Function1() { // from class: kotlinx.serialization.PolymorphicSerializer$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit descriptor_delegate$lambda$1$lambda$0;
                descriptor_delegate$lambda$1$lambda$0 = PolymorphicSerializer.descriptor_delegate$lambda$1$lambda$0(PolymorphicSerializer.this, (ClassSerialDescriptorBuilder) obj);
                return descriptor_delegate$lambda$1$lambda$0;
            }
        }), polymorphicSerializer.getBaseClass());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit descriptor_delegate$lambda$1$lambda$0(PolymorphicSerializer polymorphicSerializer, ClassSerialDescriptorBuilder buildSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        ClassSerialDescriptorBuilder.element$default(buildSerialDescriptor, "type", BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE).getDescriptor(), null, false, 12, null);
        ClassSerialDescriptorBuilder.element$default(buildSerialDescriptor, "value", SerialDescriptorsKt.buildSerialDescriptor$default("kotlinx.serialization.Polymorphic<" + polymorphicSerializer.getBaseClass().getSimpleName() + '>', SerialKind.CONTEXTUAL.INSTANCE, new SerialDescriptor[0], null, 8, null), null, false, 12, null);
        buildSerialDescriptor.setAnnotations(polymorphicSerializer._annotations);
        return Unit.INSTANCE;
    }

    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + getBaseClass() + ')';
    }
}
