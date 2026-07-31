package com.five_corp.ad.internal.storage;

import android.os.Handler;
import android.util.Log;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes12.dex */
public final class i {
    public final int a;
    public final String b;
    public final b c;
    public final Handler d;
    public final h e;
    public final com.five_corp.ad.internal.logger.a f;
    public boolean g = false;
    public FileOutputStream h = null;

    public i(int i, String str, b bVar, Handler handler, h hVar, com.five_corp.ad.internal.logger.a aVar) {
        this.a = i;
        this.b = str;
        this.c = bVar;
        this.d = handler;
        this.e = hVar;
        this.f = aVar;
    }

    public final void a() {
        if (this.g) {
            return;
        }
        this.g = true;
        FileOutputStream fileOutputStream = this.h;
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                com.five_corp.ad.internal.logger.a aVar = this.f;
                aVar.getClass();
                aVar.a.a(new com.five_corp.ad.internal.logger.b(6, null, null, e + " - " + Log.getStackTraceString(e)));
            }
            this.h = null;
        }
    }
}
