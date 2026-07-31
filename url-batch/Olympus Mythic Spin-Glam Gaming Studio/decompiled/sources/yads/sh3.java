package yads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* loaded from: classes15.dex */
public final class sh3 {
    public static String a() {
        try {
            MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
            ArrayList arrayList = new ArrayList();
            for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                if (!mediaCodecInfo.isEncoder()) {
                    arrayList.add(mediaCodecInfo);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                String[] supportedTypes = ((MediaCodecInfo) next).getSupportedTypes();
                int length = supportedTypes.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (StringsKt.startsWith$default(supportedTypes[i], "video/", false, 2, (Object) null)) {
                        arrayList2.add(next);
                        break;
                    }
                    i++;
                }
            }
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((MediaCodecInfo) it2.next()).getName());
            }
            ArrayList arrayList4 = !arrayList3.isEmpty() ? arrayList3 : null;
            if (arrayList4 != null) {
                return CollectionsKt.joinToString$default(arrayList4, StringUtils.COMMA, null, null, 0, null, null, 62, null);
            }
            return null;
        } catch (Throwable unused) {
            boolean z = ob1.a;
            return null;
        }
    }
}
