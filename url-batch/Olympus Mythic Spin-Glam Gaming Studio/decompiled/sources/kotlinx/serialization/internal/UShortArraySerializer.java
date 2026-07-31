package kotlinx.serialization.internal;

import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes.dex */
public final class UShortArraySerializer extends PrimitiveArraySerializer implements KSerializer {
    public static final UShortArraySerializer INSTANCE = new UShortArraySerializer();

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* bridge */ /* synthetic */ int collectionSize(Object obj) {
        return m8283collectionSizerL5Bavg(((UShortArray) obj).m8118unboximpl());
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* bridge */ /* synthetic */ Object empty() {
        return UShortArray.m8104boximpl(m8284emptyamswpOA());
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* bridge */ /* synthetic */ Object toBuilder(Object obj) {
        return m8285toBuilderrL5Bavg(((UShortArray) obj).m8118unboximpl());
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* bridge */ /* synthetic */ void writeContent(CompositeEncoder compositeEncoder, Object obj, int i) {
        m8286writeContenteny0XGE(compositeEncoder, ((UShortArray) obj).m8118unboximpl(), i);
    }

    private UShortArraySerializer() {
        super(BuiltinSerializersKt.serializer(UShort.Companion));
    }

    /* renamed from: collectionSize-rL5Bavg, reason: not valid java name */
    protected int m8283collectionSizerL5Bavg(short[] collectionSize) {
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return UShortArray.m8111getSizeimpl(collectionSize);
    }

    /* renamed from: toBuilder-rL5Bavg, reason: not valid java name */
    protected UShortArrayBuilder m8285toBuilderrL5Bavg(short[] toBuilder) {
        Intrinsics.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new UShortArrayBuilder(toBuilder, null);
    }

    /* renamed from: empty-amswpOA, reason: not valid java name */
    protected short[] m8284emptyamswpOA() {
        return UShortArray.m8105constructorimpl(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer
    public void readElement(CompositeDecoder decoder, int i, UShortArrayBuilder builder, boolean z) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.m8281appendxj2QHRw$kotlinx_serialization_core(UShort.m8099constructorimpl(decoder.decodeInlineElement(getDescriptor(), i).decodeShort()));
    }

    /* renamed from: writeContent-eny0XGE, reason: not valid java name */
    protected void m8286writeContenteny0XGE(CompositeEncoder encoder, short[] content, int i) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.encodeInlineElement(getDescriptor(), i2).encodeShort(UShortArray.m8110getMh2AYeg(content, i2));
        }
    }
}
