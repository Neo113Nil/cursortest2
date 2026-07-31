package yads;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.Json;

/* loaded from: classes3.dex */
public final class ua1 implements rm3 {
    public final t43 a;
    public final Json b;

    public ua1(t43 t43Var, Json json, mm3 mm3Var) {
        this.a = t43Var;
        this.b = json;
    }

    @Override // yads.rm3
    public final Object a(u82 u82Var) {
        int i = u82Var.a;
        zp2 zp2Var = new zp2(u82Var.b);
        Map map = u82Var.c;
        if (map == null) {
            map = MapsKt.emptyMap();
        }
        String str = (String) this.a.a(new yp2(i, zp2Var, map));
        if (str == null || StringsKt.isBlank(str)) {
            return null;
        }
        Json json = this.b;
        json.getSerializersModule();
        return (s80) json.decodeFromString(s80.Companion.serializer(), str);
    }
}
