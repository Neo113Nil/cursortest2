package yads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class v63 {
    public final Set a;

    public v63(Set set) {
        this.a = set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        if (r0 <= 100.0f) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final id3 a(String str) {
        Long l;
        id3 id3Var;
        Integer num;
        int parseInt;
        Float f;
        if (this.a.contains(t63.d) && Intrinsics.areEqual("start", str)) {
            return new id3(hd3.b, 0.0f);
        }
        if (this.a.contains(t63.e) && Intrinsics.areEqual("end", str)) {
            return new id3(hd3.c, 100.0f);
        }
        if (this.a.contains(t63.c) && StringsKt.endsWith$default(str, "%", false, 2, (Object) null)) {
            try {
                String substring = str.substring(0, StringsKt.getLastIndex(str));
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                f = StringsKt.toFloatOrNull(substring);
                if (f != null) {
                    float floatValue = f.floatValue();
                    if (0.0f <= floatValue) {
                    }
                }
            } catch (Throwable unused) {
            }
            f = null;
            if (f != null) {
                id3Var = new id3(hd3.c, f.floatValue());
                return id3Var;
            }
            return null;
        }
        if (!this.a.contains(t63.f) || !StringsKt.startsWith$default(str, "#", false, 2, (Object) null)) {
            if (this.a.contains(t63.b)) {
                try {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss", Locale.US);
                    l = Long.valueOf(simpleDateFormat.parse(str).getTime() - simpleDateFormat.parse("00:00:00").getTime());
                } catch (ParseException unused2) {
                    l = null;
                }
                if (l != null) {
                    id3Var = new id3(hd3.b, l.longValue());
                    return id3Var;
                }
            }
            return null;
        }
        try {
            String substring2 = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            parseInt = Integer.parseInt(substring2);
        } catch (Exception unused3) {
        }
        if (parseInt >= 1) {
            num = Integer.valueOf(parseInt);
            if (num != null) {
                id3Var = new id3(hd3.d, num.intValue());
                return id3Var;
            }
            return null;
        }
        num = null;
        if (num != null) {
        }
        return null;
    }
}
