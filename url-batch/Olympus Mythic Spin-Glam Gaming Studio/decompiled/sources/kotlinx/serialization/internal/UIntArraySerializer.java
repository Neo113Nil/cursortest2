package kotlinx.serialization.internal;

import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes6.dex */
public final class UIntArraySerializer extends PrimitiveArraySerializer implements KSerializer {
    public static final UIntArraySerializer INSTANCE = new UIntArraySerializer();

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* bridge */ /* synthetic */ int collectionSize(Object obj) {
        return m8267collectionSizeajY9A(((UIntArray) obj).m8074unboximpl());
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* bridge */ /* synthetic */ Object empty() {
        return UIntArray.m8060boximpl(m8268emptyhP7Qyg());
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* bridge */ /* synthetic */ Object toBuilder(Object obj) {
        return m8269toBuilderajY9A(((UIntArray) obj).m8074unboximpl());
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* bridge */ /* synthetic */ void writeContent(CompositeEncoder compositeEncoder, Object obj, int i) {
        m8270writeContentCPlH8fI(compositeEncoder, ((UIntArray) obj).m8074unboximpl(), i);
    }

    private UIntArraySerializer() {
        super(BuiltinSerializersKt.serializer(UInt.Companion));
    }

    /* renamed from: collectionSize--ajY-9A, reason: not valid java name */
    protected int m8267collectionSizeajY9A(int[] collectionSize) {
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return UIntArray.m8067getSizeimpl(collectionSize);
    }

    /* renamed from: toBuilder--ajY-9A, reason: not valid java name */
    protected UIntArrayBuilder m8269toBuilderajY9A(int[] toBuilder) {
        Intrinsics.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new UIntArrayBuilder(toBuilder, null);
    }

    /* renamed from: empty--hP7Qyg, reason: not valid java name */
    protected int[] m8268emptyhP7Qyg() {
        return UIntArray.m8061constructorimpl(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer
    public void readElement(CompositeDecoder decoder, int i, UIntArrayBuilder builder, boolean z) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.m8265appendWZ4Q5Ns$kotlinx_serialization_core(UInt.m8055constructorimpl(decoder.decodeInlineElement(getDescriptor(), i).decodeInt()));
    }

    /* renamed from: writeContent-CPlH8fI, reason: not valid java name */
    protected void m8270writeContentCPlH8fI(CompositeEncoder encoder, int[] content, int i) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.encodeInlineElement(getDescriptor(), i2).encodeInt(UIntArray.m8066getpVg5ArA(content, i2));
        }
    }
}
