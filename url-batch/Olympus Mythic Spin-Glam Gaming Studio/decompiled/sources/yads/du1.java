package yads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class du1 extends Lambda implements Function1 {
    public final /* synthetic */ eu1 b;
    public final /* synthetic */ Map c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du1(eu1 eu1Var, Map map) {
        super(1);
        this.b = eu1Var;
        this.c = map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        if (r4 == null) goto L21;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        byte[] bArr;
        ro2 ro2Var = (ro2) obj;
        eu1 eu1Var = this.b;
        e11 a = eu1Var.a(ro2Var, this.c);
        eu1Var.c.getClass();
        try {
            InputStream inputStream = a.d;
            if (inputStream == null) {
                inputStream = a.e != null ? new ByteArrayInputStream(a.e) : null;
            }
            if (inputStream != null) {
                try {
                    bArr = ByteStreamsKt.readBytes(inputStream);
                    CloseableKt.closeFinally(inputStream, null);
                } finally {
                }
            }
            bArr = new byte[0];
        } catch (Exception unused) {
            bArr = new byte[0];
        }
        int i = a.a;
        List unmodifiableList = Collections.unmodifiableList(a.b);
        e11 e11Var = new e11(i, unmodifiableList, bArr);
        xo2.a(System.currentTimeMillis(), ro2Var, new u82(i, bArr, true, Collections.unmodifiableList(unmodifiableList)));
        return e11Var;
    }
}
