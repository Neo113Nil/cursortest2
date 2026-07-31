package kotlinx.serialization.internal;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorKt;
import kotlinx.serialization.descriptors.SerialKind;

/* compiled from: PluginGeneratedSerialDescriptor.kt */
/* loaded from: classes8.dex */
public abstract class PluginGeneratedSerialDescriptorKt {
    public static final int hashCodeImpl(SerialDescriptor serialDescriptor, SerialDescriptor[] typeParams) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(typeParams, "typeParams");
        int hashCode = (serialDescriptor.getSerialName().hashCode() * 31) + Arrays.hashCode(typeParams);
        Iterable elementDescriptors = SerialDescriptorKt.getElementDescriptors(serialDescriptor);
        Iterator it = elementDescriptors.iterator();
        int i = 1;
        int i2 = 1;
        while (true) {
            int i3 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i4 = i2 * 31;
            String serialName = ((SerialDescriptor) it.next()).getSerialName();
            if (serialName != null) {
                i3 = serialName.hashCode();
            }
            i2 = i4 + i3;
        }
        Iterator it2 = elementDescriptors.iterator();
        while (it2.hasNext()) {
            int i5 = i * 31;
            SerialKind kind = ((SerialDescriptor) it2.next()).getKind();
            i = i5 + (kind != null ? kind.hashCode() : 0);
        }
        return (((hashCode * 31) + i2) * 31) + i;
    }

    public static final String toStringImpl(final SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        return CollectionsKt.joinToString$default(RangesKt.until(0, serialDescriptor.getElementsCount()), ", ", serialDescriptor.getSerialName() + '(', ")", 0, null, new Function1() { // from class: kotlinx.serialization.internal.PluginGeneratedSerialDescriptorKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CharSequence stringImpl$lambda$2;
                stringImpl$lambda$2 = PluginGeneratedSerialDescriptorKt.toStringImpl$lambda$2(SerialDescriptor.this, ((Integer) obj).intValue());
                return stringImpl$lambda$2;
            }
        }, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toStringImpl$lambda$2(SerialDescriptor serialDescriptor, int i) {
        return serialDescriptor.getElementName(i) + ": " + serialDescriptor.getElementDescriptor(i).getSerialName();
    }
}
