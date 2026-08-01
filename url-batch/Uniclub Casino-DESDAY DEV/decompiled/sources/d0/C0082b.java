package d0;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* renamed from: d0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0082b {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f1878a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0085e f1879b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f1880c;
    public final File d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1881e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1882f = false;

    /* renamed from: g, reason: collision with root package name */
    public C0083c[] f1883g;
    public byte[] h;

    public C0082b(AssetManager assetManager, Executor executor, InterfaceC0085e interfaceC0085e, String str, File file) {
        this.f1878a = executor;
        this.f1879b = interfaceC0085e;
        this.f1881e = str;
        this.d = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i <= 34) {
            switch (i) {
                case 26:
                    bArr = AbstractC0086f.f1895g;
                    break;
                case 27:
                    bArr = AbstractC0086f.f1894f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = AbstractC0086f.f1893e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = AbstractC0086f.d;
                    break;
            }
        }
        this.f1880c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f1879b.m();
            }
            return null;
        }
    }

    public final void b(final int i, final Serializable serializable) {
        this.f1878a.execute(new Runnable() { // from class: d0.a
            @Override // java.lang.Runnable
            public final void run() {
                C0082b.this.f1879b.j(i, serializable);
            }
        });
    }
}
