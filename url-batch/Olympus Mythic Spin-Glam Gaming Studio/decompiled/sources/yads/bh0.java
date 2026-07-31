package yads;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes14.dex */
public final class bh0 {
    public long a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final List h;

    public bh0(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.b = str;
        this.c = "".equals(str2) ? null : str2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = list;
    }

    public static bh0 a(ch0 ch0Var) {
        if (dh0.a(ch0Var) != 538247942) {
            throw new IOException();
        }
        String str = new String(dh0.a(ch0Var, dh0.b(ch0Var)), "UTF-8");
        String str2 = new String(dh0.a(ch0Var, dh0.b(ch0Var)), "UTF-8");
        long b = dh0.b(ch0Var);
        long b2 = dh0.b(ch0Var);
        long b3 = dh0.b(ch0Var);
        long b4 = dh0.b(ch0Var);
        int a = dh0.a(ch0Var);
        if (a < 0) {
            throw new IOException(gg2.a(a, "readHeaderList size="));
        }
        List emptyList = a == 0 ? Collections.emptyList() : new ArrayList();
        int i = 0;
        while (i < a) {
            emptyList.add(new sz0(new String(dh0.a(ch0Var, dh0.b(ch0Var)), "UTF-8").intern(), new String(dh0.a(ch0Var, dh0.b(ch0Var)), "UTF-8").intern()));
            i++;
            b4 = b4;
            b3 = b3;
        }
        return new bh0(str, str2, b, b2, b3, b4, emptyList);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bh0(String str, zq zqVar) {
        this(str, r2, r3, r5, r7, r9, r0);
        String str2 = zqVar.b;
        long j = zqVar.c;
        long j2 = zqVar.d;
        long j3 = zqVar.e;
        long j4 = zqVar.f;
        List list = zqVar.h;
        if (list == 0) {
            Map map = zqVar.g;
            list = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                list.add(new sz0((String) entry.getKey(), (String) entry.getValue()));
            }
        }
    }

    public final zq a(byte[] bArr) {
        zq zqVar = new zq();
        zqVar.a = bArr;
        zqVar.b = this.c;
        zqVar.c = this.d;
        zqVar.d = this.e;
        zqVar.e = this.f;
        zqVar.f = this.g;
        List<sz0> list = this.h;
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (sz0 sz0Var : list) {
            treeMap.put(sz0Var.a, sz0Var.b);
        }
        zqVar.g = treeMap;
        zqVar.h = Collections.unmodifiableList(this.h);
        return zqVar;
    }

    public final boolean a(BufferedOutputStream bufferedOutputStream) {
        try {
            dh0.a(bufferedOutputStream, 538247942);
            byte[] bytes = this.b.getBytes("UTF-8");
            dh0.a(bufferedOutputStream, bytes.length);
            bufferedOutputStream.write(bytes, 0, bytes.length);
            String str = this.c;
            if (str == null) {
                str = "";
            }
            byte[] bytes2 = str.getBytes("UTF-8");
            dh0.a(bufferedOutputStream, bytes2.length);
            bufferedOutputStream.write(bytes2, 0, bytes2.length);
            dh0.a(bufferedOutputStream, this.d);
            dh0.a(bufferedOutputStream, this.e);
            dh0.a(bufferedOutputStream, this.f);
            dh0.a(bufferedOutputStream, this.g);
            List<sz0> list = this.h;
            if (list != null) {
                dh0.a(bufferedOutputStream, list.size());
                for (sz0 sz0Var : list) {
                    byte[] bytes3 = sz0Var.a.getBytes("UTF-8");
                    dh0.a(bufferedOutputStream, bytes3.length);
                    bufferedOutputStream.write(bytes3, 0, bytes3.length);
                    byte[] bytes4 = sz0Var.b.getBytes("UTF-8");
                    dh0.a(bufferedOutputStream, bytes4.length);
                    bufferedOutputStream.write(bytes4, 0, bytes4.length);
                }
            } else {
                dh0.a(bufferedOutputStream, 0);
            }
            bufferedOutputStream.flush();
            return true;
        } catch (IOException unused) {
            boolean z = lm3.a;
            boolean z2 = ob1.a;
            return false;
        }
    }
}
