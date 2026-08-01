package d0;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f1876a;

    /* renamed from: b, reason: collision with root package name */
    public final e f1877b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f1878c;
    public final File d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1879e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1880f = false;

    /* renamed from: g, reason: collision with root package name */
    public c[] f1881g;
    public byte[] h;

    public b(AssetManager assetManager, Executor executor, e eVar, String str, File file) {
        this.f1876a = executor;
        this.f1877b = eVar;
        this.f1879e = str;
        this.d = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i <= 34) {
            switch (i) {
                case 26:
                    bArr = f.f1893g;
                    break;
                case 27:
                    bArr = f.f1892f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = f.f1891e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = f.d;
                    break;
            }
        }
        this.f1878c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f1877b.m();
            }
            return null;
        }
    }

    public final void b(final int i, final Serializable serializable) {
        this.f1876a.execute(new Runnable() { // from class: d0.a
            @Override // java.lang.Runnable
            public final void run() {
                b.this.f1877b.j(i, serializable);
            }
        });
    }
}
