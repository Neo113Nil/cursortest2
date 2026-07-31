package com.five_corp.ad.internal.storage;

import com.five_corp.ad.internal.l;
import com.five_corp.ad.internal.m;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes12.dex */
public final class f implements Runnable {
    public final /* synthetic */ byte[] a;
    public final /* synthetic */ int b;
    public final /* synthetic */ i c;

    public f(i iVar, byte[] bArr, int i) {
        this.c = iVar;
        this.a = bArr;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.five_corp.ad.internal.util.b bVar;
        com.five_corp.ad.internal.util.b bVar2;
        com.five_corp.ad.internal.util.b bVar3;
        i iVar;
        l lVar;
        com.five_corp.ad.internal.http.auxcache.i iVar2;
        i iVar3 = this.c;
        FileOutputStream fileOutputStream = iVar3.h;
        if (fileOutputStream != null) {
            bVar2 = new com.five_corp.ad.internal.util.b(true, null, fileOutputStream);
        } else {
            if (iVar3.g) {
                bVar3 = new com.five_corp.ad.internal.util.b(false, new l(m.I2, null, null), null);
            } else {
                b bVar4 = iVar3.c;
                String str = iVar3.b;
                bVar4.getClass();
                try {
                    bVar = new com.five_corp.ad.internal.util.b(true, null, new FileOutputStream(new File(bVar4.a, str), true));
                } catch (FileNotFoundException e) {
                    bVar = new com.five_corp.ad.internal.util.b(false, new l(m.m3, null, e), null);
                }
                if (bVar.a) {
                    FileOutputStream fileOutputStream2 = (FileOutputStream) bVar.c;
                    iVar3.h = fileOutputStream2;
                    try {
                        fileOutputStream2.getChannel().truncate(iVar3.a);
                        bVar3 = new com.five_corp.ad.internal.util.b(true, null, iVar3.h);
                    } catch (IOException e2) {
                        bVar2 = new com.five_corp.ad.internal.util.b(false, new l(m.F2, null, e2), null);
                    }
                } else {
                    bVar3 = new com.five_corp.ad.internal.util.b(false, bVar.b, null);
                }
            }
            bVar2 = bVar3;
        }
        if (bVar2.a) {
            try {
                ((FileOutputStream) bVar2.c).write(this.a, 0, this.b);
                h hVar = this.c.e;
                return;
            } catch (IOException unused) {
                iVar = this.c;
                lVar = new l(m.G2, null, null);
                iVar2 = (com.five_corp.ad.internal.http.auxcache.i) iVar.e;
            }
        } else {
            iVar = this.c;
            lVar = bVar2.b;
            iVar2 = (com.five_corp.ad.internal.http.auxcache.i) iVar.e;
        }
        iVar2.a(lVar);
        iVar.a();
    }
}
