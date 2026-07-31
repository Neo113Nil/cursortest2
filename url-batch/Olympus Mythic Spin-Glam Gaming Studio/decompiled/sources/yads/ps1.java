package yads;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes3.dex */
public final class ps1 extends Lambda implements Function0 {
    public static final ps1 b = new ps1();

    public ps1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer));
    }
}
