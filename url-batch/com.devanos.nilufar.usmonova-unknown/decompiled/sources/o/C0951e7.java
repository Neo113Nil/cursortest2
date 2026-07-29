package o;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: o.e7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0951e7 implements ObjectEncoder {
    public static final C0951e7 a = new C0951e7();
    public static final FieldDescriptor b = FieldDescriptor.of("eventTimeMs");
    public static final FieldDescriptor c = FieldDescriptor.of("eventCode");
    public static final FieldDescriptor d = FieldDescriptor.of("eventUptimeMs");
    public static final FieldDescriptor e = FieldDescriptor.of("sourceExtension");
    public static final FieldDescriptor f = FieldDescriptor.of("sourceExtensionJsonProto3");
    public static final FieldDescriptor g = FieldDescriptor.of("timezoneOffsetSeconds");
    public static final FieldDescriptor h = FieldDescriptor.of("networkConnectionInfo");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        C2202x7 c2202x7 = (C2202x7) ((AbstractC0759bB) obj);
        objectEncoderContext2.add(b, c2202x7.a);
        objectEncoderContext2.add(c, c2202x7.b);
        objectEncoderContext2.add(d, c2202x7.c);
        objectEncoderContext2.add(e, c2202x7.d);
        objectEncoderContext2.add(f, c2202x7.e);
        objectEncoderContext2.add(g, c2202x7.f);
        objectEncoderContext2.add(h, c2202x7.g);
    }
}
