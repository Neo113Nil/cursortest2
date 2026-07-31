package com.moloco.sdk.internal.ortb.model;

import android.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class j implements KSerializer {

    @NotNull
    public static final j a = new j();

    @NotNull
    public static final SerialDescriptor b = SerialDescriptorsKt.PrimitiveSerialDescriptor("Color", PrimitiveKind.STRING.INSTANCE);

    public long a(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return ColorKt.Color(Color.parseColor(decoder.decodeString()));
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return androidx.compose.ui.graphics.Color.m1441boximpl(a(decoder));
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        a(encoder, ((androidx.compose.ui.graphics.Color) obj).getValue());
    }

    public void a(@NotNull Encoder encoder, long j) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        throw new NotImplementedError("Color encoding is not supported");
    }
}
