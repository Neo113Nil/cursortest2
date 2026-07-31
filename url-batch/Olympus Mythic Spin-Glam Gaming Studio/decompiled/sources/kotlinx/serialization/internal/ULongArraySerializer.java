package kotlinx.serialization.internal;

import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

/* compiled from: PrimitiveArraysSerializers.kt */
/* loaded from: classes13.dex */
public final class ULongArraySerializer extends PrimitiveArraySerializer implements KSerializer {
    public static final ULongArraySerializer INSTANCE = new ULongArraySerializer();

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* bridge */ /* synthetic */ int collectionSize(Object obj) {
        return m8275collectionSizeQwZRm1k(((ULongArray) obj).m8096unboximpl());
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* bridge */ /* synthetic */ Object empty() {
        return ULongArray.m8082boximpl(m8276emptyY2RjT0g());
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* bridge */ /* synthetic */ Object toBuilder(Object obj) {
        return m8277toBuilderQwZRm1k(((ULongArray) obj).m8096unboximpl());
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* bridge */ /* synthetic */ void writeContent(CompositeEncoder compositeEncoder, Object obj, int i) {
        m8278writeContent0q3Fkuo(compositeEncoder, ((ULongArray) obj).m8096unboximpl(), i);
    }

    private ULongArraySerializer() {
        super(BuiltinSerializersKt.serializer(ULong.Companion));
    }

    /* renamed from: collectionSize-QwZRm1k, reason: not valid java name */
    protected int m8275collectionSizeQwZRm1k(long[] collectionSize) {
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return ULongArray.m8089getSizeimpl(collectionSize);
    }

    /* renamed from: toBuilder-QwZRm1k, reason: not valid java name */
    protected ULongArrayBuilder m8277toBuilderQwZRm1k(long[] toBuilder) {
        Intrinsics.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new ULongArrayBuilder(toBuilder, null);
    }

    /* renamed from: empty-Y2RjT0g, reason: not valid java name */
    protected long[] m8276emptyY2RjT0g() {
        return ULongArray.m8083constructorimpl(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer
    public void readElement(CompositeDecoder decoder, int i, ULongArrayBuilder builder, boolean z) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.m8273appendVKZWuLQ$kotlinx_serialization_core(ULong.m8077constructorimpl(decoder.decodeInlineElement(getDescriptor(), i).decodeLong()));
    }

    /* renamed from: writeContent-0q3Fkuo, reason: not valid java name */
    protected void m8278writeContent0q3Fkuo(CompositeEncoder encoder, long[] content, int i) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.encodeInlineElement(getDescriptor(), i2).encodeLong(ULongArray.m8088getsVKNKU(content, i2));
        }
    }
}
