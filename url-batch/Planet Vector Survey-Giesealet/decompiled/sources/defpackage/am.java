package defpackage;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class am {
    public final Executor a;
    public final yh0 b;
    public final byte[] c;
    public final File d;
    public final String e;
    public boolean f = false;
    public bm[] g;
    public byte[] h;

    public am(AssetManager assetManager, Executor executor, yh0 yh0Var, String str, File file) {
        this.a = executor;
        this.b = yh0Var;
        this.e = str;
        this.d = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i >= 24) {
            if (i < 31) {
                switch (i) {
                    case 24:
                    case 25:
                        bArr = a50.n;
                        break;
                    case 26:
                        bArr = a50.m;
                        break;
                    case 27:
                        bArr = a50.l;
                        break;
                    case 28:
                    case 29:
                    case 30:
                        bArr = a50.k;
                        break;
                }
            } else {
                bArr = a50.j;
            }
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
        this.a.execute(new Runnable() { // from class: zl
            @Override // java.lang.Runnable
            public final void run() {
                am.this.b.d(i, serializable);
            }
        });
    }
}
