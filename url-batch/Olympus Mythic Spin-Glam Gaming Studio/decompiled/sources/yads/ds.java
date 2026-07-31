package yads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class ds {
    public final HashMap a = new HashMap();
    public final SparseArray b = new SparseArray();
    public final SparseBooleanArray c = new SparseBooleanArray();
    public final SparseBooleanArray d = new SparseBooleanArray();
    public final cs e;
    public cs f;

    public ds(kn0 kn0Var, File file) {
        as asVar = new as(kn0Var);
        bs bsVar = new bs(new File(file, "monetization_cached_content_index.exi"));
        this.e = asVar;
        this.f = bsVar;
    }

    public final void a(long j) {
        cs csVar;
        this.e.a(j);
        cs csVar2 = this.f;
        if (csVar2 != null) {
            csVar2.a(j);
        }
        if (this.e.a() || (csVar = this.f) == null || !csVar.a()) {
            this.e.a(this.a, this.b);
        } else {
            this.f.a(this.a, this.b);
            this.e.b(this.a);
        }
        cs csVar3 = this.f;
        if (csVar3 != null) {
            csVar3.b();
            this.f = null;
        }
    }

    public final void b(String str) {
        zr zrVar = (zr) this.a.get(str);
        if (zrVar != null && zrVar.c.isEmpty() && zrVar.d.isEmpty()) {
            this.a.remove(str);
            int i = zrVar.a;
            boolean z = this.d.get(i);
            this.e.a(zrVar, z);
            if (z) {
                this.b.remove(i);
                this.d.delete(i);
            } else {
                this.b.put(i, null);
                this.c.put(i, true);
            }
        }
    }

    public final void a() {
        this.e.a(this.a);
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            this.b.remove(this.c.keyAt(i));
        }
        this.c.clear();
        this.d.clear();
    }

    public final zr a(String str) {
        zr zrVar = (zr) this.a.get(str);
        if (zrVar != null) {
            return zrVar;
        }
        SparseArray sparseArray = this.b;
        int size = sparseArray.size();
        int i = 0;
        int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (keyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            keyAt = i;
        }
        zr zrVar2 = new zr(keyAt, str, zc0.c);
        this.a.put(str, zrVar2);
        this.b.put(keyAt, str);
        this.d.put(keyAt, true);
        this.e.a(zrVar2);
        return zrVar2;
    }

    public static zc0 a(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            String readUTF = dataInputStream.readUTF();
            int readInt2 = dataInputStream.readInt();
            if (readInt2 >= 0) {
                int min = Math.min(readInt2, 10485760);
                byte[] bArr = sb3.f;
                int i2 = 0;
                while (i2 != readInt2) {
                    int i3 = i2 + min;
                    bArr = Arrays.copyOf(bArr, i3);
                    dataInputStream.readFully(bArr, i2, min);
                    min = Math.min(readInt2 - i3, 10485760);
                    i2 = i3;
                }
                hashMap.put(readUTF, bArr);
            } else {
                throw new IOException(gg2.a(readInt2, "Invalid value size: "));
            }
        }
        return new zc0(hashMap);
    }
}
