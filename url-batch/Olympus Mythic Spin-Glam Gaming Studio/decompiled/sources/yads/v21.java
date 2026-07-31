package yads;

import android.graphics.Bitmap;
import java.util.Map;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;

/* loaded from: classes4.dex */
public final class v21 implements z31 {
    public final /* synthetic */ ProducerScope a;

    public v21(ProducerScope producerScope) {
        this.a = producerScope;
    }

    @Override // yads.z31
    public final void a(Map map) {
        SendChannel.DefaultImpls.close$default(this.a.getChannel(), null, 1, null);
    }

    @Override // yads.z31
    public final void a(String str, Bitmap bitmap) {
        this.a.mo8216trySendJP2dKIU(new m21(str, bitmap));
    }
}
