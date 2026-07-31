package yads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class zc0 implements lz {
    public static final zc0 c = new zc0(Collections.emptyMap());
    public int a;
    public final Map b;

    public zc0(Map map) {
        this.b = Collections.unmodifiableMap(map);
    }

    public final zc0 a(mz mzVar) {
        byte[] bArr;
        HashMap hashMap = new HashMap(this.b);
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(mzVar.b));
        for (int i = 0; i < unmodifiableList.size(); i++) {
            hashMap.remove(unmodifiableList.get(i));
        }
        HashMap hashMap2 = new HashMap(mzVar.a);
        for (Map.Entry entry : hashMap2.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr2 = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr2, bArr2.length));
            }
        }
        for (Map.Entry entry2 : Collections.unmodifiableMap(hashMap2).entrySet()) {
            String str = (String) entry2.getKey();
            Object value2 = entry2.getValue();
            if (value2 instanceof Long) {
                bArr = ByteBuffer.allocate(8).putLong(((Long) value2).longValue()).array();
            } else if (value2 instanceof String) {
                bArr = ((String) value2).getBytes(zt.c);
            } else {
                if (!(value2 instanceof byte[])) {
                    throw new IllegalArgumentException();
                }
                bArr = (byte[]) value2;
            }
            hashMap.put(str, bArr);
        }
        Map map = this.b;
        if (map.size() == hashMap.size()) {
            for (Map.Entry entry3 : map.entrySet()) {
                if (!Arrays.equals((byte[]) entry3.getValue(), (byte[]) hashMap.get(entry3.getKey()))) {
                }
            }
            return this;
        }
        return new zc0(hashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zc0.class != obj.getClass()) {
            return false;
        }
        Map map = this.b;
        Map map2 = ((zc0) obj).b;
        if (map.size() == map2.size()) {
            for (Map.Entry entry : map.entrySet()) {
                if (!Arrays.equals((byte[]) entry.getValue(), (byte[]) map2.get(entry.getKey()))) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.a == 0) {
            int i = 0;
            for (Map.Entry entry : this.b.entrySet()) {
                i += Arrays.hashCode((byte[]) entry.getValue()) ^ ((String) entry.getKey()).hashCode();
            }
            this.a = i;
        }
        return this.a;
    }

    public final String a() {
        byte[] bArr = (byte[]) this.b.get("exo_redir");
        if (bArr != null) {
            return new String(bArr, zt.c);
        }
        return null;
    }
}
