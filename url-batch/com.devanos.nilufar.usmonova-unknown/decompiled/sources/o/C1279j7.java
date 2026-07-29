package o;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: o.j7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1279j7 implements ObjectEncoder {
    public static final C1279j7 a = new C1279j7();
    public static final FieldDescriptor b = AbstractC1888sN.f(1, FieldDescriptor.builder("eventsDroppedCount"));
    public static final FieldDescriptor c = AbstractC1888sN.f(3, FieldDescriptor.builder("reason"));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        C0890dB c0890dB = (C0890dB) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(b, c0890dB.a);
        objectEncoderContext2.add(c, c0890dB.b);
    }
}
