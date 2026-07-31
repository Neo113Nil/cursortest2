package com.revenuecat.purchases.paywalls.components;

import com.facebook.react.devsupport.StackTraceHelper;
import com.revenuecat.purchases.paywalls.components.ButtonComponent;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: ButtonComponent.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/revenuecat/purchases/paywalls/components/ButtonComponent.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes7.dex */
public final class ButtonComponent$$serializer implements GeneratedSerializer<ButtonComponent> {
    public static final ButtonComponent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ButtonComponent$$serializer buttonComponent$$serializer = new ButtonComponent$$serializer();
        INSTANCE = buttonComponent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("button", buttonComponent$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("action", false);
        pluginGeneratedSerialDescriptor.addElement(StackTraceHelper.STACK_KEY, false);
        pluginGeneratedSerialDescriptor.addElement("transition", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ButtonComponent$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{ActionSerializer.INSTANCE, StackComponent$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(PaywallTransition$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public ButtonComponent deserialize(Decoder decoder) {
        int i;
        ButtonComponent.Action action;
        StackComponent stackComponent;
        PaywallTransition paywallTransition;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        ButtonComponent.Action action2 = null;
        if (beginStructure.decodeSequentially()) {
            ButtonComponent.Action action3 = (ButtonComponent.Action) beginStructure.decodeSerializableElement(descriptor2, 0, ActionSerializer.INSTANCE, null);
            StackComponent stackComponent2 = (StackComponent) beginStructure.decodeSerializableElement(descriptor2, 1, StackComponent$$serializer.INSTANCE, null);
            action = action3;
            paywallTransition = (PaywallTransition) beginStructure.decodeNullableSerializableElement(descriptor2, 2, PaywallTransition$$serializer.INSTANCE, null);
            stackComponent = stackComponent2;
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            StackComponent stackComponent3 = null;
            PaywallTransition paywallTransition2 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    action2 = (ButtonComponent.Action) beginStructure.decodeSerializableElement(descriptor2, 0, ActionSerializer.INSTANCE, action2);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    stackComponent3 = (StackComponent) beginStructure.decodeSerializableElement(descriptor2, 1, StackComponent$$serializer.INSTANCE, stackComponent3);
                    i2 |= 2;
                } else {
                    if (decodeElementIndex != 2) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    paywallTransition2 = (PaywallTransition) beginStructure.decodeNullableSerializableElement(descriptor2, 2, PaywallTransition$$serializer.INSTANCE, paywallTransition2);
                    i2 |= 4;
                }
            }
            i = i2;
            action = action2;
            stackComponent = stackComponent3;
            paywallTransition = paywallTransition2;
        }
        beginStructure.endStructure(descriptor2);
        return new ButtonComponent(i, action, stackComponent, paywallTransition, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, ButtonComponent value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        ButtonComponent.write$Self$purchases_defaultsBc8Release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
