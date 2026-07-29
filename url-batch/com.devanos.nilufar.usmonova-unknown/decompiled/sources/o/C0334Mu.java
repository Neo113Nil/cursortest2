package o;

import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import com.google.firebase.encoders.proto.ProtobufEncoder;

/* renamed from: o.Mu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0334Mu implements ObjectEncoder {
    public final /* synthetic */ int a;

    public /* synthetic */ C0334Mu(int i) {
        this.a = i;
    }

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        switch (this.a) {
            case 0:
                JsonDataEncoderBuilder.lambda$static$0(obj, objectEncoderContext2);
                break;
            default:
                ProtobufEncoder.Builder.lambda$static$0(obj, objectEncoderContext2);
                break;
        }
    }
}
