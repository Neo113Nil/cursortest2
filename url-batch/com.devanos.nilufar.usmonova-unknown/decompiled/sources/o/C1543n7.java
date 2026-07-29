package o;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: o.n7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1543n7 implements ObjectEncoder {
    public static final C1543n7 a = new C1543n7();
    public static final FieldDescriptor b = AbstractC1888sN.f(1, FieldDescriptor.builder("startMs"));
    public static final FieldDescriptor c = AbstractC1888sN.f(2, FieldDescriptor.builder("endMs"));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        LV lv = (LV) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(b, lv.a);
        objectEncoderContext2.add(c, lv.b);
    }
}
