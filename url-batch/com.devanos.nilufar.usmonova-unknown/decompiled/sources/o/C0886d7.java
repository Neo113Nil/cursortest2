package o;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: o.d7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0886d7 implements ObjectEncoder {
    public static final C0886d7 a = new C0886d7();
    public static final FieldDescriptor b = FieldDescriptor.of("clientType");
    public static final FieldDescriptor c = FieldDescriptor.of("androidClientInfo");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        C1872s7 c1872s7 = (C1872s7) ((AbstractC0134Fb) obj);
        c1872s7.getClass();
        objectEncoderContext2.add(b, EnumC0108Eb.h);
        objectEncoderContext2.add(c, c1872s7.a);
    }
}
