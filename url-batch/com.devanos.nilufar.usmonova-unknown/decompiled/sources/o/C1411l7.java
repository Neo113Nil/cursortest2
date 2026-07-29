package o;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* renamed from: o.l7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1411l7 implements ObjectEncoder {
    public static final C1411l7 a = new C1411l7();

    static {
        FieldDescriptor.of("clientMetrics");
    }

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        if (obj != null) {
            throw new ClassCastException();
        }
        throw null;
    }
}
