package com.smaato.sdk.ng.views.shape.path.parser;

import android.util.Log;
import com.smaato.sdk.ng.NextGen;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes6.dex */
class a {
    private static final String c = SvgToPath.n;
    private final InputStream a;
    private ByteArrayOutputStream b;

    public a(InputStream inputStream) {
        this.a = inputStream;
        try {
            a();
        } catch (IOException e) {
            NextGen.reportException((Exception) e);
            Log.w(c, "IOException in CopyInputStream " + e.toString());
        }
    }

    private void a() throws IOException {
        this.b = new ByteArrayOutputStream();
        byte[] bArr = new byte[256];
        while (true) {
            int read = this.a.read(bArr);
            if (-1 == read) {
                this.b.flush();
                return;
            }
            this.b.write(bArr, 0, read);
        }
    }

    public ByteArrayInputStream b() {
        return new ByteArrayInputStream(this.b.toByteArray());
    }
}
