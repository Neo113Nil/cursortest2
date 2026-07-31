package com.my.tracker.obfuscated;

import com.my.tracker.obfuscated.s0;
import io.bidmachine.util.MimeTypes;
import java.io.OutputStream;

/* loaded from: classes13.dex */
public class r implements s0.a {
    private final q a;

    public r(q qVar) {
        this.a = qVar;
    }

    @Override // com.my.tracker.obfuscated.s0.a
    public String a() {
        return MimeTypes.APPLICATION_OCTET_STREAM;
    }

    @Override // com.my.tracker.obfuscated.s0.a
    public void a(OutputStream outputStream) {
        this.a.a(outputStream);
    }
}
