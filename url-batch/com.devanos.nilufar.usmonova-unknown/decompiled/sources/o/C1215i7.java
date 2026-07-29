package o;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: o.i7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1215i7 implements ObjectEncoder {
    public static final C1215i7 a = new C1215i7();
    public static final FieldDescriptor b = AbstractC1888sN.f(1, FieldDescriptor.builder("storageMetrics"));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        objectEncoderContext.add(b, ((C0097Dq) obj).a);
    }
}
