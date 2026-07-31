package kotlinx.serialization.internal;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: Tagged.kt */
/* loaded from: classes5.dex */
public abstract class NamedValueDecoder extends TaggedDecoder {
    protected abstract String composeName(String str, String str2);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.TaggedDecoder
    public final String getTag(SerialDescriptor serialDescriptor, int i) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        return nested(elementName(serialDescriptor, i));
    }

    protected final String nested(String nestedName) {
        Intrinsics.checkNotNullParameter(nestedName, "nestedName");
        String str = (String) getCurrentTagOrNull();
        if (str == null) {
            str = "";
        }
        return composeName(str, nestedName);
    }

    protected String elementName(SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return descriptor.getElementName(i);
    }

    protected final String renderTagStack() {
        return getTagStack$kotlinx_serialization_core().isEmpty() ? "$" : CollectionsKt.joinToString$default(getTagStack$kotlinx_serialization_core(), ".", "$.", null, 0, null, null, 60, null);
    }
}
