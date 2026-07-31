package yads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* loaded from: classes15.dex */
public final class ok1 implements mk1 {
    public final int a;
    public MediaCodecInfo[] b;

    public ok1(boolean z, boolean z2) {
        this.a = (z || z2) ? 1 : 0;
    }

    @Override // yads.mk1
    public final boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // yads.mk1
    public final boolean b() {
        return true;
    }

    @Override // yads.mk1
    public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // yads.mk1
    public final int a() {
        if (this.b == null) {
            this.b = new MediaCodecList(this.a).getCodecInfos();
        }
        return this.b.length;
    }

    @Override // yads.mk1
    public final MediaCodecInfo a(int i) {
        if (this.b == null) {
            this.b = new MediaCodecList(this.a).getCodecInfos();
        }
        return this.b[i];
    }
}
