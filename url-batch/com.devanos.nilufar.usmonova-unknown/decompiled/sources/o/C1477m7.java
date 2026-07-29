package o;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: o.m7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1477m7 implements ObjectEncoder {
    public static final C1477m7 a = new C1477m7();
    public static final FieldDescriptor b = AbstractC1888sN.f(1, FieldDescriptor.builder("currentCacheSizeBytes"));
    public static final FieldDescriptor c = AbstractC1888sN.f(2, FieldDescriptor.builder("maxCacheSizeBytes"));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        PT pt = (PT) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(b, pt.a);
        objectEncoderContext2.add(c, pt.b);
    }
}
