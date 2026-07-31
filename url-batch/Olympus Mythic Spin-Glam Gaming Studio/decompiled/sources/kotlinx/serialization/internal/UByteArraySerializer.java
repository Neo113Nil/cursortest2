package kotlinx.serialization.internal;

import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes6.dex */
public final class UByteArraySerializer extends PrimitiveArraySerializer implements KSerializer {
    public static final UByteArraySerializer INSTANCE = new UByteArraySerializer();

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* bridge */ /* synthetic */ int collectionSize(Object obj) {
        return m8259collectionSizeGBYM_sE(((UByteArray) obj).m8052unboximpl());
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* bridge */ /* synthetic */ Object empty() {
        return UByteArray.m8038boximpl(m8260emptyTcUX1vc());
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* bridge */ /* synthetic */ Object toBuilder(Object obj) {
        return m8261toBuilderGBYM_sE(((UByteArray) obj).m8052unboximpl());
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* bridge */ /* synthetic */ void writeContent(CompositeEncoder compositeEncoder, Object obj, int i) {
        m8262writeContentCoi6ktg(compositeEncoder, ((UByteArray) obj).m8052unboximpl(), i);
    }

    private UByteArraySerializer() {
        super(BuiltinSerializersKt.serializer(UByte.Companion));
    }

    /* renamed from: collectionSize-GBYM_sE, reason: not valid java name */
    protected int m8259collectionSizeGBYM_sE(byte[] collectionSize) {
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return UByteArray.m8045getSizeimpl(collectionSize);
    }

    /* renamed from: toBuilder-GBYM_sE, reason: not valid java name */
    protected UByteArrayBuilder m8261toBuilderGBYM_sE(byte[] toBuilder) {
        Intrinsics.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new UByteArrayBuilder(toBuilder, null);
    }

    /* renamed from: empty-TcUX1vc, reason: not valid java name */
    protected byte[] m8260emptyTcUX1vc() {
        return UByteArray.m8039constructorimpl(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer
    public void readElement(CompositeDecoder decoder, int i, UByteArrayBuilder builder, boolean z) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.m8257append7apg3OU$kotlinx_serialization_core(UByte.m8033constructorimpl(decoder.decodeInlineElement(getDescriptor(), i).decodeByte()));
    }

    /* renamed from: writeContent-Coi6ktg, reason: not valid java name */
    protected void m8262writeContentCoi6ktg(CompositeEncoder encoder, byte[] content, int i) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.encodeInlineElement(getDescriptor(), i2).encodeByte(UByteArray.m8044getw2LRezQ(content, i2));
        }
    }
}
