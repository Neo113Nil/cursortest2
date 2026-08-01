package e0;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* renamed from: e0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0109b {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f2526a;

    /* renamed from: b, reason: collision with root package name */
    public final e f2527b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f2528c;
    public final File d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2529e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2530f = false;

    /* renamed from: g, reason: collision with root package name */
    public C0110c[] f2531g;
    public byte[] h;

    public C0109b(AssetManager assetManager, Executor executor, e eVar, String str, File file) {
        this.f2526a = executor;
        this.f2527b = eVar;
        this.f2529e = str;
        this.d = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i <= 34) {
            switch (i) {
                case 26:
                    bArr = f.f2544g;
                    break;
                case 27:
                    bArr = f.f2543f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = f.f2542e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = f.d;
                    break;
            }
        }
        this.f2528c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f2527b.m();
            }
            return null;
        }
    }

    public final void b(final int i, final Serializable serializable) {
        this.f2526a.execute(new Runnable() { // from class: e0.a
            @Override // java.lang.Runnable
            public final void run() {
                C0109b.this.f2527b.i(i, serializable);
            }
        });
    }
}
