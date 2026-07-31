package yads;

import com.inmobi.media.core.config.models.AdConfig;

/* loaded from: classes5.dex */
public final class dl2 extends mp {
    public dl2(m73 m73Var, long j, long j2) {
        super(new hp(), new cl2(m73Var), j, j + 1, 0L, j2, 188L, 1000);
    }

    public static int a(byte[] bArr, int i) {
        return (bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }
}
