package o;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: o.f7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1017f7 implements ObjectEncoder {
    public static final C1017f7 a = new C1017f7();
    public static final FieldDescriptor b = FieldDescriptor.of("requestTimeMs");
    public static final FieldDescriptor c = FieldDescriptor.of("requestUptimeMs");
    public static final FieldDescriptor d = FieldDescriptor.of("clientInfo");
    public static final FieldDescriptor e = FieldDescriptor.of("logSource");
    public static final FieldDescriptor f = FieldDescriptor.of("logSourceName");
    public static final FieldDescriptor g = FieldDescriptor.of("logEvent");
    public static final FieldDescriptor h = FieldDescriptor.of("qosTier");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        C2268y7 c2268y7 = (C2268y7) ((AbstractC0955eB) obj);
        objectEncoderContext2.add(b, c2268y7.a);
        objectEncoderContext2.add(c, c2268y7.b);
        objectEncoderContext2.add(d, c2268y7.c);
        objectEncoderContext2.add(e, c2268y7.d);
        objectEncoderContext2.add(f, c2268y7.e);
        objectEncoderContext2.add(g, c2268y7.f);
        objectEncoderContext2.add(h, EnumC1689pL.h);
    }
}
