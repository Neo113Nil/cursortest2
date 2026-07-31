package yads;

import android.os.ConditionVariable;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public final class lz2 implements br {
    public static final HashSet j = new HashSet();
    public final File a;
    public final yd1 b;
    public final ds c;
    public final jr d;
    public final HashMap e;
    public final Random f;
    public final boolean g;
    public long h;
    public yq i;

    public lz2(File file, yd1 yd1Var, kn0 kn0Var) {
        boolean add;
        ds dsVar = new ds(kn0Var, file);
        jr jrVar = new jr(kn0Var);
        synchronized (lz2.class) {
            add = j.add(file.getAbsoluteFile());
        }
        if (!add) {
            throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
        }
        this.a = file;
        this.b = yd1Var;
        this.c = dsVar;
        this.d = jrVar;
        this.e = new HashMap();
        this.f = new Random();
        this.g = true;
        this.h = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new kz2(this, conditionVariable).start();
        conditionVariable.block();
    }

    public final synchronized void a() {
        yq yqVar = this.i;
        if (yqVar != null) {
            throw yqVar;
        }
    }

    public final synchronized void b(nz2 nz2Var) {
        ds dsVar = this.c;
        zr zrVar = (zr) dsVar.a.get(nz2Var.b);
        zrVar.getClass();
        long j2 = nz2Var.c;
        for (int i = 0; i < zrVar.d.size(); i++) {
            if (((yr) zrVar.d.get(i)).a == j2) {
                zrVar.d.remove(i);
                this.c.b(zrVar.b);
                notifyAll();
            }
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00e9 A[Catch: all -> 0x002a, TryCatch #1 {all -> 0x002a, IOException -> 0x006a, blocks: (B:4:0x0008, B:6:0x0017, B:7:0x0047, B:9:0x004c, B:15:0x0052, B:19:0x0066, B:20:0x0073, B:22:0x0085, B:24:0x008c, B:27:0x00e5, B:29:0x00e9, B:31:0x0110, B:33:0x0117, B:35:0x013b, B:37:0x015b, B:38:0x0160, B:39:0x00c8, B:41:0x0161, B:42:0x0166, B:44:0x006a, B:46:0x0167, B:47:0x016f, B:49:0x0177, B:51:0x0187, B:70:0x01aa, B:74:0x002f, B:76:0x0037, B:78:0x0043), top: B:3:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x015b A[Catch: all -> 0x002a, TRY_ENTER, TryCatch #1 {all -> 0x002a, IOException -> 0x006a, blocks: (B:4:0x0008, B:6:0x0017, B:7:0x0047, B:9:0x004c, B:15:0x0052, B:19:0x0066, B:20:0x0073, B:22:0x0085, B:24:0x008c, B:27:0x00e5, B:29:0x00e9, B:31:0x0110, B:33:0x0117, B:35:0x013b, B:37:0x015b, B:38:0x0160, B:39:0x00c8, B:41:0x0161, B:42:0x0166, B:44:0x006a, B:46:0x0167, B:47:0x016f, B:49:0x0177, B:51:0x0187, B:70:0x01aa, B:74:0x002f, B:76:0x0037, B:78:0x0043), top: B:3:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized nz2 c(String str, long j2, long j3) {
        nz2 b;
        int i;
        nz2 nz2Var;
        File file;
        try {
            a();
            zr zrVar = (zr) this.c.a.get(str);
            if (zrVar != null) {
                while (true) {
                    b = zrVar.b(j2, j3);
                    if (!b.e || b.f.length() == b.d) {
                        break;
                    }
                    c();
                }
            } else {
                b = new nz2(str, j2, j3, -9223372036854775807L, null);
            }
            i = 0;
        } catch (IOException unused) {
            gh1.d("SimpleCache", "Failed to update index with new touch timestamp.");
        } finally {
        }
        if (!b.e) {
            zr a = this.c.a(str);
            long j4 = b.d;
            while (i < a.d.size()) {
                yr yrVar = (yr) a.d.get(i);
                long j5 = yrVar.a;
                if (j5 > j2) {
                    nz2Var = b;
                    if (j4 != -1) {
                        if (j2 + j4 > j5) {
                        }
                        i++;
                        b = nz2Var;
                    }
                    return null;
                }
                nz2Var = b;
                long j6 = yrVar.b;
                if (j6 != -1) {
                    if (j5 + j6 > j2) {
                    }
                    i++;
                    b = nz2Var;
                }
                return null;
            }
            nz2 nz2Var2 = b;
            a.d.add(new yr(j2, j4));
            return nz2Var2;
        }
        if (this.g) {
            File file2 = b.f;
            file2.getClass();
            String name = file2.getName();
            long j7 = b.d;
            long currentTimeMillis = System.currentTimeMillis();
            jr jrVar = this.d;
            if (jrVar != null) {
                jrVar.a(name, j7, currentTimeMillis);
            } else {
                i = 1;
            }
            zr zrVar2 = (zr) this.c.a.get(str);
            if (!zrVar2.c.remove(b)) {
                throw new IllegalStateException();
            }
            File file3 = b.f;
            file3.getClass();
            if (i != 0) {
                File parentFile = file3.getParentFile();
                parentFile.getClass();
                long j8 = b.c;
                int i2 = zrVar2.a;
                Pattern pattern = nz2.h;
                File file4 = new File(parentFile, i2 + "." + j8 + "." + currentTimeMillis + ".v3.exo");
                if (file3.renameTo(file4)) {
                    file = file4;
                    if (b.e) {
                        throw new IllegalStateException();
                    }
                    nz2 nz2Var3 = new nz2(b.b, b.c, b.d, currentTimeMillis, file);
                    zrVar2.c.add(nz2Var3);
                    ArrayList arrayList = (ArrayList) this.e.get(b.b);
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            yd1 yd1Var = (yd1) arrayList.get(size);
                            yd1Var.b.remove(b);
                            yd1Var.c -= b.d;
                            yd1Var.b.add(nz2Var3);
                            yd1Var.c += nz2Var3.d;
                            yd1Var.a(this, 0L);
                        }
                    }
                    yd1 yd1Var2 = this.b;
                    yd1Var2.b.remove(b);
                    yd1Var2.c -= b.d;
                    yd1Var2.b.add(nz2Var3);
                    yd1Var2.c += nz2Var3.d;
                    yd1Var2.a(this, 0L);
                    b = nz2Var3;
                } else {
                    gh1.d("CachedContent", "Failed to rename " + file3 + " to " + file4);
                }
            }
            file = file3;
            if (b.e) {
            }
        }
        return b;
    }

    public final synchronized TreeSet a(String str) {
        TreeSet treeSet;
        try {
            zr zrVar = (zr) this.c.a.get(str);
            if (zrVar != null && !zrVar.c.isEmpty()) {
                treeSet = new TreeSet((Collection) zrVar.c);
            }
            treeSet = new TreeSet();
        } catch (Throwable th) {
            throw th;
        }
        return treeSet;
    }

    public final synchronized long a(String str, long j2, long j3) {
        long j4;
        long j5 = j3 == -1 ? Long.MAX_VALUE : j2 + j3;
        long j6 = j5 < 0 ? Long.MAX_VALUE : j5;
        long j7 = j2;
        j4 = 0;
        while (j7 < j6) {
            long b = b(str, j7, j6 - j7);
            if (b > 0) {
                j4 += b;
            } else {
                b = -b;
            }
            j7 += b;
        }
        return j4;
    }

    public final synchronized void a(String str, mz mzVar) {
        yq yqVar;
        a();
        ds dsVar = this.c;
        zr a = dsVar.a(str);
        zc0 zc0Var = a.e;
        zc0 a2 = zc0Var.a(mzVar);
        a.e = a2;
        if (!a2.equals(zc0Var)) {
            dsVar.e.a(a);
        }
        try {
            this.c.a();
        } finally {
        }
    }

    public final synchronized long b(String str, long j2, long j3) {
        zr zrVar;
        if (j3 == -1) {
            j3 = Long.MAX_VALUE;
        }
        zrVar = (zr) this.c.a.get(str);
        return zrVar != null ? zrVar.a(j2, j3) : -j3;
    }

    public final synchronized zc0 b(String str) {
        zc0 zc0Var;
        try {
            zr zrVar = (zr) this.c.a.get(str);
            if (zrVar != null) {
                zc0Var = zrVar.e;
            } else {
                zc0Var = zc0.c;
            }
        } catch (Throwable th) {
            throw th;
        }
        return zc0Var;
    }

    public final void b() {
        long j2;
        if (!this.a.exists()) {
            try {
                a(this.a);
            } catch (yq e) {
                this.i = e;
                return;
            }
        }
        File[] listFiles = this.a.listFiles();
        if (listFiles == null) {
            String str = "Failed to list cache directory files: " + this.a;
            gh1.b("SimpleCache", str);
            this.i = new yq(str);
            return;
        }
        int length = listFiles.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                j2 = -1;
                break;
            }
            File file = listFiles[i];
            String name = file.getName();
            if (name.endsWith(".uid")) {
                try {
                    j2 = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    gh1.b("SimpleCache", "Malformed UID file: " + file);
                    file.delete();
                }
            }
            i++;
        }
        this.h = j2;
        if (j2 == -1) {
            try {
                this.h = b(this.a);
            } catch (IOException e2) {
                String str2 = "Failed to create cache UID: " + this.a;
                gh1.b("SimpleCache", gh1.a(str2, e2));
                this.i = new yq(str2, e2);
                return;
            }
        }
        try {
            this.c.a(this.h);
            jr jrVar = this.d;
            if (jrVar != null) {
                jrVar.a(this.h);
                HashMap a = this.d.a();
                a(this.a, true, listFiles, a);
                this.d.a(a.keySet());
            } else {
                a(this.a, true, listFiles, null);
            }
            ds dsVar = this.c;
            wa3 it = q41.a(dsVar.a.keySet()).iterator();
            while (it.hasNext()) {
                dsVar.b((String) it.next());
            }
            try {
                this.c.a();
            } catch (Throwable th) {
                gh1.b("SimpleCache", gh1.a("Storing index file failed", th));
            }
        } catch (Throwable th2) {
            String str3 = "Failed to initialize cache indices: " + this.a;
            gh1.b("SimpleCache", gh1.a(str3, th2));
            this.i = new yq(str3, th2);
        }
    }

    public final void a(File file, boolean z, File[] fileArr, HashMap hashMap) {
        long j2;
        long j3;
        if (fileArr == null || fileArr.length == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z && name.indexOf(46) == -1) {
                a(file2, false, file2.listFiles(), hashMap);
            } else if (!z || (!name.startsWith("monetization_cached_content_index.exi") && !name.endsWith(".uid"))) {
                ir irVar = hashMap != null ? (ir) hashMap.remove(name) : null;
                if (irVar != null) {
                    j3 = irVar.a;
                    j2 = irVar.b;
                } else {
                    j2 = -9223372036854775807L;
                    j3 = -1;
                }
                nz2 a = nz2.a(file2, j3, j2, this.c);
                if (a != null) {
                    a(a);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final void a(nz2 nz2Var) {
        this.c.a(nz2Var.b).c.add(nz2Var);
        ArrayList arrayList = (ArrayList) this.e.get(nz2Var.b);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                yd1 yd1Var = (yd1) arrayList.get(size);
                yd1Var.b.add(nz2Var);
                yd1Var.c += nz2Var.d;
                yd1Var.a(this, 0L);
            }
        }
        yd1 yd1Var2 = this.b;
        yd1Var2.b.add(nz2Var);
        yd1Var2.c += nz2Var.d;
        yd1Var2.a(this, 0L);
    }

    public final void a(mr mrVar) {
        zr zrVar = (zr) this.c.a.get(mrVar.b);
        if (zrVar == null || !zrVar.c.remove(mrVar)) {
            return;
        }
        File file = mrVar.f;
        if (file != null) {
            file.delete();
        }
        if (this.d != null) {
            String name = mrVar.f.getName();
            try {
                jr jrVar = this.d;
                jrVar.b.getClass();
                try {
                    jrVar.a.getWritableDatabase().delete(jrVar.b, "name = ?", new String[]{name});
                } catch (Throwable th) {
                    throw new w30(th);
                }
            } catch (IOException unused) {
                jk1.a("Failed to remove file index entry for: ", name, "SimpleCache");
            }
        }
        this.c.b(zrVar.b);
        ArrayList arrayList = (ArrayList) this.e.get(mrVar.b);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                yd1 yd1Var = (yd1) arrayList.get(size);
                yd1Var.b.remove(mrVar);
                yd1Var.c -= mrVar.d;
            }
        }
        yd1 yd1Var2 = this.b;
        yd1Var2.b.remove(mrVar);
        yd1Var2.c -= mrVar.d;
    }

    public final synchronized void c(String str) {
        Iterator it = a(str).iterator();
        while (it.hasNext()) {
            a((mr) it.next());
        }
    }

    public final void c() {
        ArrayList arrayList = new ArrayList();
        Iterator it = Collections.unmodifiableCollection(this.c.a.values()).iterator();
        while (it.hasNext()) {
            Iterator it2 = ((zr) it.next()).c.iterator();
            while (it2.hasNext()) {
                mr mrVar = (mr) it2.next();
                if (mrVar.f.length() != mrVar.d) {
                    arrayList.add(mrVar);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            a((mr) arrayList.get(i));
        }
    }

    public static long b(File file) {
        long nextLong = new SecureRandom().nextLong();
        long abs = nextLong == Long.MIN_VALUE ? 0L : Math.abs(nextLong);
        File file2 = new File(file, Long.toString(abs, 16) + ".uid");
        if (file2.createNewFile()) {
            return abs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    public static void a(File file) {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        gh1.b("SimpleCache", str);
        throw new yq(str);
    }
}
