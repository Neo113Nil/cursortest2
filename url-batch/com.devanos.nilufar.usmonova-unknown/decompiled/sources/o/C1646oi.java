package o;

import android.content.res.AssetManager;
import android.os.Build;
import com.google.firebase.database.core.ValidationPath;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* renamed from: o.oi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1646oi {
    public final Executor a;
    public final InterfaceC2346zJ b;
    public final byte[] c;
    public final File d;
    public final String e;
    public boolean f = false;
    public C1778qi[] g;
    public byte[] h;

    public C1646oi(AssetManager assetManager, Executor executor, InterfaceC2346zJ interfaceC2346zJ, String str, File file) {
        this.a = executor;
        this.b = interfaceC2346zJ;
        this.e = str;
        this.d = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i <= 34) {
            switch (i) {
                case 24:
                case 25:
                    bArr = EB.s;
                    break;
                case 26:
                    bArr = EB.r;
                    break;
                case 27:
                    bArr = EB.q;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = EB.p;
                    break;
                case 31:
                case ValidationPath.MAX_PATH_DEPTH /* 32 */:
                case 33:
                case 34:
                    bArr = EB.f35o;
                    break;
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
            this.b.h();
            return null;
        }
    }

    public final void b(int i, Serializable serializable) {
        this.a.execute(new RunnableC0342Nc(i, 2, this, serializable));
    }
}
