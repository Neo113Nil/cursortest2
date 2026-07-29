package o;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: o.h7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1149h7 implements ObjectEncoder {
    public static final C1149h7 a = new C1149h7();
    public static final FieldDescriptor b = AbstractC1888sN.f(1, FieldDescriptor.builder("window"));
    public static final FieldDescriptor c = AbstractC1888sN.f(2, FieldDescriptor.builder("logSourceMetrics"));
    public static final FieldDescriptor d = AbstractC1888sN.f(3, FieldDescriptor.builder("globalMetrics"));
    public static final FieldDescriptor e = AbstractC1888sN.f(4, FieldDescriptor.builder("appNamespace"));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        C0160Gb c0160Gb = (C0160Gb) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(b, c0160Gb.a);
        objectEncoderContext2.add(c, c0160Gb.b);
        objectEncoderContext2.add(d, c0160Gb.c);
        objectEncoderContext2.add(e, c0160Gb.d);
    }
}
