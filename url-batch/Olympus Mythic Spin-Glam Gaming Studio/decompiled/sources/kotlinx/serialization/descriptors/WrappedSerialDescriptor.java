package kotlinx.serialization.descriptors;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptorKt;

/* compiled from: SerialDescriptors.kt */
/* loaded from: classes5.dex */
public final class WrappedSerialDescriptor implements SerialDescriptor {
    private final SerialDescriptor original;
    private final String serialName;

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List getAnnotations() {
        return this.original.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List getElementAnnotations(int i) {
        return this.original.getElementAnnotations(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor getElementDescriptor(int i) {
        return this.original.getElementDescriptor(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementIndex(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.original.getElementIndex(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String getElementName(int i) {
        return this.original.getElementName(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementsCount() {
        return this.original.getElementsCount();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialKind getKind() {
        return this.original.getKind();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isElementOptional(int i) {
        return this.original.isElementOptional(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return this.original.isInline();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isNullable() {
        return this.original.isNullable();
    }

    public WrappedSerialDescriptor(String serialName, SerialDescriptor original) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(original, "original");
        this.serialName = serialName;
        this.original = original;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String getSerialName() {
        return this.serialName;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WrappedSerialDescriptor)) {
            return false;
        }
        WrappedSerialDescriptor wrappedSerialDescriptor = (WrappedSerialDescriptor) obj;
        return Intrinsics.areEqual(getSerialName(), wrappedSerialDescriptor.getSerialName()) && Intrinsics.areEqual(this.original, wrappedSerialDescriptor.original);
    }

    public int hashCode() {
        return (getSerialName().hashCode() * 31) + this.original.hashCode();
    }

    public String toString() {
        return PluginGeneratedSerialDescriptorKt.toStringImpl(this);
    }
}
