package o;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: o.c7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0820c7 implements ObjectEncoder {
    public static final C0820c7 a = new C0820c7();
    public static final FieldDescriptor b = FieldDescriptor.of("logRequest");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        objectEncoderContext.add(b, ((C1806r7) ((AbstractC0952e8) obj)).a);
    }
}
