package o;

import com.google.firebase.encoders.proto.ProtoEnum;

/* renamed from: o.cB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0824cB implements ProtoEnum {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);

    public final int h;

    EnumC0824cB(int i) {
        this.h = i;
    }

    @Override // com.google.firebase.encoders.proto.ProtoEnum
    public final int getNumber() {
        return this.h;
    }
}
