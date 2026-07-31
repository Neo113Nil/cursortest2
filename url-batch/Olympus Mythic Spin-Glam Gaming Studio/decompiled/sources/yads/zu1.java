package yads;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes12.dex */
public final class zu1 extends Lambda implements Function0 {
    public static final zu1 b = new zu1();

    public zu1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer));
    }
}
