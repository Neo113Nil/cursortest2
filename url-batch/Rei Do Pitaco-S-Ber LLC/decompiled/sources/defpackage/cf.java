package defpackage;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class cf {
    public final Executor a;
    public final ww b;
    public final byte[] c;
    public final File d;
    public final String e;
    public boolean f = false;
    public df[] g;
    public byte[] h;

    public cf(AssetManager assetManager, Executor executor, ww wwVar, String str, File file) {
        byte[] bArr;
        this.a = executor;
        this.b = wwVar;
        this.e = str;
        this.d = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 26:
                    bArr = m60.o;
                    break;
                case 27:
                    bArr = m60.n;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = m60.m;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = m60.l;
        }
        this.c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.b.b();
            return null;
        }
    }

    public final void b(final int i, final Serializable serializable) {
        this.a.execute(new Runnable() { // from class: bf
            @Override // java.lang.Runnable
            public final void run() {
                cf.this.b.c(i, serializable);
            }
        });
    }
}
