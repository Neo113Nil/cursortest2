package o;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: o.b7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0755b7 implements ObjectEncoder {
    public static final C0755b7 a = new C0755b7();
    public static final FieldDescriptor b = FieldDescriptor.of("sdkVersion");
    public static final FieldDescriptor c = FieldDescriptor.of("model");
    public static final FieldDescriptor d = FieldDescriptor.of("hardware");
    public static final FieldDescriptor e = FieldDescriptor.of("device");
    public static final FieldDescriptor f = FieldDescriptor.of("product");
    public static final FieldDescriptor g = FieldDescriptor.of("osBuild");
    public static final FieldDescriptor h = FieldDescriptor.of("manufacturer");
    public static final FieldDescriptor i = FieldDescriptor.of("fingerprint");
    public static final FieldDescriptor j = FieldDescriptor.of("locale");
    public static final FieldDescriptor k = FieldDescriptor.of("country");
    public static final FieldDescriptor l = FieldDescriptor.of("mccMnc");
    public static final FieldDescriptor m = FieldDescriptor.of("applicationBuild");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        C1675p7 c1675p7 = (C1675p7) ((B2) obj);
        objectEncoderContext2.add(b, c1675p7.a);
        objectEncoderContext2.add(c, c1675p7.b);
        objectEncoderContext2.add(d, c1675p7.c);
        objectEncoderContext2.add(e, c1675p7.d);
        objectEncoderContext2.add(f, c1675p7.e);
        objectEncoderContext2.add(g, c1675p7.f);
        objectEncoderContext2.add(h, c1675p7.g);
        objectEncoderContext2.add(i, c1675p7.h);
        objectEncoderContext2.add(j, c1675p7.i);
        objectEncoderContext2.add(k, c1675p7.j);
        objectEncoderContext2.add(l, c1675p7.k);
        objectEncoderContext2.add(m, c1675p7.l);
    }
}
