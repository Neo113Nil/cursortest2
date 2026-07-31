package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes13.dex */
public final class Va extends P2 {
    public final Sa b;
    public final Sa c;
    public final Ua d;

    public Va(int i, int i2, int i3) {
        this(i, new Sa(i2), new Sa(i3));
    }

    public Va(int i, @NonNull Sa sa, @NonNull Sa sa2) {
        super(i);
        this.d = new Ua();
        this.b = sa;
        this.c = sa2;
    }

    @Override // io.appmetrica.analytics.impl.P2, io.appmetrica.analytics.impl.Ta
    @NonNull
    public final C5318eo a(@Nullable Map<String, String> map) {
        HashMap hashMap;
        int i;
        int i2 = 0;
        if (map != null) {
            hashMap = new HashMap();
            Set<Map.Entry<String, String>> entrySet = map.entrySet();
            Map.Entry[] entryArr = (Map.Entry[]) entrySet.toArray(new Map.Entry[entrySet.size()]);
            Arrays.sort(entryArr, this.d);
            int length = entryArr.length;
            i = 0;
            int i3 = 0;
            boolean z = false;
            int i4 = 0;
            while (i2 < length) {
                Map.Entry entry = entryArr[i2];
                C5318eo a = this.b.a((String) entry.getKey());
                C5318eo a2 = this.c.a((String) entry.getValue());
                int utf8BytesLength = StringUtils.getUtf8BytesLength((String) entry.getValue()) + StringUtils.getUtf8BytesLength((String) entry.getKey());
                int utf8BytesLength2 = StringUtils.getUtf8BytesLength((String) a2.a) + StringUtils.getUtf8BytesLength((String) a.a);
                if (z || utf8BytesLength2 + i4 > this.a) {
                    i3++;
                    i += utf8BytesLength;
                    z = true;
                } else {
                    i = a2.b.getBytesTruncated() + a.b.getBytesTruncated() + i;
                    int utf8BytesLength3 = StringUtils.getUtf8BytesLength((String) a2.a) + StringUtils.getUtf8BytesLength((String) a.a) + i4;
                    hashMap.put((String) a.a, (String) a2.a);
                    i4 = utf8BytesLength3;
                }
                i2++;
            }
            i2 = i3;
        } else {
            hashMap = null;
            i = 0;
        }
        return new C5318eo(hashMap, new E4(i2, i));
    }
}
