package o;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: o.g7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1083g7 implements ObjectEncoder {
    public static final C1083g7 a = new C1083g7();
    public static final FieldDescriptor b = FieldDescriptor.of("networkType");
    public static final FieldDescriptor c = FieldDescriptor.of("mobileSubtype");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        A7 a7 = (A7) ((AbstractC1879sE) obj);
        objectEncoderContext2.add(b, a7.a);
        objectEncoderContext2.add(c, a7.b);
    }
}
