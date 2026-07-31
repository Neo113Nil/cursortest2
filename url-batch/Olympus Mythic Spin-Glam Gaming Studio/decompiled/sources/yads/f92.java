package yads;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: classes13.dex */
public abstract class f92 {
    public static byte[] a(InputStream inputStream, int i, uq uqVar) {
        byte[] bArr;
        ag2 ag2Var = new ag2(uqVar, i);
        try {
            bArr = uqVar.a(1024);
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    ag2Var.write(bArr, 0, read);
                } catch (Throwable th) {
                    th = th;
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                        boolean z = lm3.a;
                        boolean z2 = ob1.a;
                    }
                    uqVar.a(bArr);
                    ag2Var.close();
                    throw th;
                }
            }
            byte[] byteArray = ag2Var.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                boolean z3 = lm3.a;
                boolean z4 = ob1.a;
            }
            uqVar.a(bArr);
            ag2Var.close();
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            bArr = null;
        }
    }

    public static u82 a(ro2 ro2Var, List list) {
        zq zqVar = ro2Var.p;
        if (zqVar == null) {
            return new u82(304, (byte[]) null, true, list);
        }
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(((sz0) it.next()).a);
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List list2 = zqVar.h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (sz0 sz0Var : zqVar.h) {
                    if (!treeSet.contains(sz0Var.a)) {
                        arrayList.add(sz0Var);
                    }
                }
            }
        } else if (!zqVar.g.isEmpty()) {
            for (Map.Entry entry : zqVar.g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new sz0((String) entry.getKey(), (String) entry.getValue()));
                }
            }
        }
        return new u82(304, zqVar.a, true, (List) arrayList);
    }
}
