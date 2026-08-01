package e0;

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
    public final Executor f2105a;

    /* renamed from: b, reason: collision with root package name */
    public final e f2106b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f2107c;
    public final File d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2108e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2109f = false;

    /* renamed from: g, reason: collision with root package name */
    public c[] f2110g;
    public byte[] h;

    public b(AssetManager assetManager, Executor executor, e eVar, String str, File file) {
        this.f2105a = executor;
        this.f2106b = eVar;
        this.f2108e = str;
        this.d = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i <= 34) {
            switch (i) {
                case 26:
                    bArr = f.f2123g;
                    break;
                case 27:
                    bArr = f.f2122f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = f.f2121e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = f.d;
                    break;
            }
        }
        this.f2107c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f2106b.o();
            }
            return null;
        }
    }

    public final void b(final int i, final Serializable serializable) {
        this.f2105a.execute(new Runnable() { // from class: e0.a
            @Override // java.lang.Runnable
            public final void run() {
                b.this.f2106b.k(i, serializable);
            }
        });
    }
}
