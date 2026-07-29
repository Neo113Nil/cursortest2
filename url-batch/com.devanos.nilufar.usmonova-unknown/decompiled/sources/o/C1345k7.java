package o;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: o.k7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1345k7 implements ObjectEncoder {
    public static final C1345k7 a = new C1345k7();
    public static final FieldDescriptor b = AbstractC1888sN.f(1, FieldDescriptor.builder("logSource"));
    public static final FieldDescriptor c = AbstractC1888sN.f(2, FieldDescriptor.builder("logEventDropped"));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        C1021fB c1021fB = (C1021fB) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(b, c1021fB.a);
        objectEncoderContext2.add(c, c1021fB.b);
    }
}
