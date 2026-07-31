package com.fyber.inneractive.sdk.player.cache;

import com.safedk.android.internal.partials.DTExchangeFilesBridge;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* loaded from: classes11.dex */
public final class d {
    public final e a;
    public final boolean[] b;
    public boolean c;
    public final /* synthetic */ g d;

    public d(g gVar, e eVar) {
        this.d = gVar;
        this.a = eVar;
        this.b = eVar.c ? null : new boolean[gVar.g];
    }

    public final void a(byte[] bArr) {
        OutputStream outputStream;
        FileOutputStream fileOutputStreamCtor;
        g gVar = this.d;
        if (gVar.g <= 0) {
            throw new IllegalArgumentException("Expected index 0 to be greater than 0 and less than the maximum value count of " + this.d.g);
        }
        synchronized (gVar) {
            try {
                e eVar = this.a;
                if (eVar.d != this) {
                    throw new IllegalStateException();
                }
                if (!eVar.c) {
                    this.b[0] = true;
                }
                File b = eVar.b(0);
                try {
                    fileOutputStreamCtor = DTExchangeFilesBridge.fileOutputStreamCtor(b);
                } catch (FileNotFoundException unused) {
                    this.d.a.mkdirs();
                    try {
                        fileOutputStreamCtor = DTExchangeFilesBridge.fileOutputStreamCtor(b);
                    } catch (FileNotFoundException unused2) {
                        outputStream = g.q;
                    }
                }
                outputStream = new c(this, fileOutputStreamCtor);
            } finally {
            }
        }
        try {
            outputStream.write(bArr);
            Charset charset = l.a;
            try {
                outputStream.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused3) {
            }
        } catch (Throwable th) {
            Charset charset2 = l.a;
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (RuntimeException e2) {
                    throw e2;
                } catch (Exception unused4) {
                }
            }
            throw th;
        }
    }

    public final void a() {
        if (this.c) {
            g.a(this.d, this, false);
            this.d.c(this.a.a);
        } else {
            g.a(this.d, this, true);
        }
    }
}
