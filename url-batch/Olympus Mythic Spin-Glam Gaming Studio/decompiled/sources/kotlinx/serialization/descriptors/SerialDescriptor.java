package kotlinx.serialization.descriptors;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: SerialDescriptor.kt */
/* loaded from: classes9.dex */
public interface SerialDescriptor {
    List getElementAnnotations(int i);

    SerialDescriptor getElementDescriptor(int i);

    int getElementIndex(String str);

    String getElementName(int i);

    int getElementsCount();

    SerialKind getKind();

    String getSerialName();

    boolean isElementOptional(int i);

    default boolean isInline() {
        return false;
    }

    default boolean isNullable() {
        return false;
    }

    default List getAnnotations() {
        return CollectionsKt.emptyList();
    }
}
