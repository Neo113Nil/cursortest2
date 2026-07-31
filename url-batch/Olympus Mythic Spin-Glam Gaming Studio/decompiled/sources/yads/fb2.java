package yads;

import com.inmobi.media.core.config.models.AdConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public abstract class fb2 {
    public static ArrayList a(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(((((bArr[11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }
}
