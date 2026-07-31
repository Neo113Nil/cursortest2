package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ԇ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC0588 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final Set f974;

    static {
        StringFog.decrypt("2sEBRYre5C3kxxx1gQ==\n", "u6VwGuOwjVk=\n");
        StringFog.decrypt("/SBmk3P0g4H7KG2Oc/OJme0v\n", "iEEC4CyH5vI=\n");
        StringFog.decrypt("BXeFv/o3BSsedbS55jsuBA9/hbbhNQ==\n", "bBDr0IhSWls=\n");
        f974 = Collections.unmodifiableSet(new HashSet(Arrays.asList(StringFog.decrypt("BsQPlfh6fwg4whKl8w==\n", "Z6B+ypEUFnw=\n"), StringFog.decrypt("w7JTBmfX42DFulgbZ9DpeNO9\n", "ttM3dTikhhM=\n"))));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m4086(AbstractMap abstractMap, String str) {
        if (abstractMap.containsKey(str)) {
            return false;
        }
        int size = abstractMap.size();
        Iterator it = f974.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (abstractMap.containsKey((String) it.next())) {
                i++;
            }
        }
        return size >= i + 5;
    }
}
