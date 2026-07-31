package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;

/* compiled from: PluginGeneratedSerialDescriptor.kt */
/* loaded from: classes13.dex */
public class PluginGeneratedSerialDescriptor implements SerialDescriptor, CachedNames {
    private final Lazy _hashCode$delegate;
    private int added;
    private final Lazy childSerializers$delegate;
    private List classAnnotations;
    private final int elementsCount;
    private final boolean[] elementsOptionality;
    private final GeneratedSerializer generatedSerializer;
    private Map indices;
    private final String[] names;
    private final List[] propertiesAnnotations;
    private final String serialName;
    private final Lazy typeParameterDescriptors$delegate;

    public PluginGeneratedSerialDescriptor(String serialName, GeneratedSerializer generatedSerializer, int i) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.serialName = serialName;
        this.generatedSerializer = generatedSerializer;
        this.elementsCount = i;
        this.added = -1;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.names = strArr;
        int i3 = this.elementsCount;
        this.propertiesAnnotations = new List[i3];
        this.elementsOptionality = new boolean[i3];
        this.indices = MapsKt.emptyMap();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.childSerializers$delegate = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                KSerializer[] childSerializers_delegate$lambda$0;
                childSerializers_delegate$lambda$0 = PluginGeneratedSerialDescriptor.childSerializers_delegate$lambda$0(PluginGeneratedSerialDescriptor.this);
                return childSerializers_delegate$lambda$0;
            }
        });
        this.typeParameterDescriptors$delegate = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                SerialDescriptor[] typeParameterDescriptors_delegate$lambda$2;
                typeParameterDescriptors_delegate$lambda$2 = PluginGeneratedSerialDescriptor.typeParameterDescriptors_delegate$lambda$2(PluginGeneratedSerialDescriptor.this);
                return typeParameterDescriptors_delegate$lambda$2;
            }
        });
        this._hashCode$delegate = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                int _hashCode_delegate$lambda$3;
                _hashCode_delegate$lambda$3 = PluginGeneratedSerialDescriptor._hashCode_delegate$lambda$3(PluginGeneratedSerialDescriptor.this);
                return Integer.valueOf(_hashCode_delegate$lambda$3);
            }
        });
    }

    public /* synthetic */ PluginGeneratedSerialDescriptor(String str, GeneratedSerializer generatedSerializer, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : generatedSerializer, i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String getSerialName() {
        return this.serialName;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int getElementsCount() {
        return this.elementsCount;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialKind getKind() {
        return StructureKind.CLASS.INSTANCE;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List getAnnotations() {
        List list = this.classAnnotations;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    @Override // kotlinx.serialization.internal.CachedNames
    public Set getSerialNames() {
        return this.indices.keySet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer[] childSerializers_delegate$lambda$0(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        KSerializer[] childSerializers;
        GeneratedSerializer generatedSerializer = pluginGeneratedSerialDescriptor.generatedSerializer;
        return (generatedSerializer == null || (childSerializers = generatedSerializer.childSerializers()) == null) ? PluginHelperInterfacesKt.EMPTY_SERIALIZER_ARRAY : childSerializers;
    }

    private final KSerializer[] getChildSerializers() {
        return (KSerializer[]) this.childSerializers$delegate.getValue();
    }

    public final SerialDescriptor[] getTypeParameterDescriptors$kotlinx_serialization_core() {
        return (SerialDescriptor[]) this.typeParameterDescriptors$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor[] typeParameterDescriptors_delegate$lambda$2(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        ArrayList arrayList;
        KSerializer[] typeParametersSerializers;
        GeneratedSerializer generatedSerializer = pluginGeneratedSerialDescriptor.generatedSerializer;
        if (generatedSerializer == null || (typeParametersSerializers = generatedSerializer.typeParametersSerializers()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(typeParametersSerializers.length);
            for (KSerializer kSerializer : typeParametersSerializers) {
                arrayList.add(kSerializer.getDescriptor());
            }
        }
        return Platform_commonKt.compactArray(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int _hashCode_delegate$lambda$3(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        return PluginGeneratedSerialDescriptorKt.hashCodeImpl(pluginGeneratedSerialDescriptor, pluginGeneratedSerialDescriptor.getTypeParameterDescriptors$kotlinx_serialization_core());
    }

    private final int get_hashCode() {
        return ((Number) this._hashCode$delegate.getValue()).intValue();
    }

    public static /* synthetic */ void addElement$default(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        pluginGeneratedSerialDescriptor.addElement(str, z);
    }

    public final void addElement(String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        String[] strArr = this.names;
        int i = this.added + 1;
        this.added = i;
        strArr[i] = name;
        this.elementsOptionality[i] = z;
        this.propertiesAnnotations[i] = null;
        if (i == this.elementsCount - 1) {
            this.indices = buildIndices();
        }
    }

    public final void pushAnnotation(Annotation annotation) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        List list = this.propertiesAnnotations[this.added];
        if (list == null) {
            list = new ArrayList(1);
            this.propertiesAnnotations[this.added] = list;
        }
        list.add(annotation);
    }

    public final void pushClassAnnotation(Annotation a) {
        Intrinsics.checkNotNullParameter(a, "a");
        if (this.classAnnotations == null) {
            this.classAnnotations = new ArrayList(1);
        }
        List list = this.classAnnotations;
        Intrinsics.checkNotNull(list);
        list.add(a);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor getElementDescriptor(int i) {
        return getChildSerializers()[i].getDescriptor();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isElementOptional(int i) {
        return this.elementsOptionality[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List getElementAnnotations(int i) {
        List list = this.propertiesAnnotations[i];
        return list == null ? CollectionsKt.emptyList() : list;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String getElementName(int i) {
        return this.names[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementIndex(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = (Integer) this.indices.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    private final Map buildIndices() {
        HashMap hashMap = new HashMap();
        int length = this.names.length;
        for (int i = 0; i < length; i++) {
            hashMap.put(this.names[i], Integer.valueOf(i));
        }
        return hashMap;
    }

    public int hashCode() {
        return get_hashCode();
    }

    public String toString() {
        return PluginGeneratedSerialDescriptorKt.toStringImpl(this);
    }

    public boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof PluginGeneratedSerialDescriptor) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (Intrinsics.areEqual(getSerialName(), serialDescriptor.getSerialName()) && Arrays.equals(getTypeParameterDescriptors$kotlinx_serialization_core(), ((PluginGeneratedSerialDescriptor) obj).getTypeParameterDescriptors$kotlinx_serialization_core()) && getElementsCount() == serialDescriptor.getElementsCount()) {
                int elementsCount = getElementsCount();
                for (0; i < elementsCount; i + 1) {
                    i = (Intrinsics.areEqual(getElementDescriptor(i).getSerialName(), serialDescriptor.getElementDescriptor(i).getSerialName()) && Intrinsics.areEqual(getElementDescriptor(i).getKind(), serialDescriptor.getElementDescriptor(i).getKind())) ? i + 1 : 0;
                }
                return true;
            }
        }
        return false;
    }
}
