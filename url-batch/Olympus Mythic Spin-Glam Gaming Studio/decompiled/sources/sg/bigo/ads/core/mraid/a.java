package sg.bigo.ads.core.mraid;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes4.dex */
final class a extends ContentObserver {
    private float a;
    private final Context b;
    private final InterfaceC1875a c;

    /* renamed from: sg.bigo.ads.core.mraid.a$a, reason: collision with other inner class name */
    public interface InterfaceC1875a {
        void a(float f);
    }

    a(Handler handler, Context context, InterfaceC1875a interfaceC1875a) {
        super(handler);
        this.a = -1.0f;
        this.b = context.getApplicationContext();
        this.c = interfaceC1875a;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        float streamVolume = ((AudioManager) this.b.getSystemService("audio")) != null ? 100.0f * (r4.getStreamVolume(3) / r4.getStreamMaxVolume(3)) : 100.0f;
        if (streamVolume != this.a) {
            this.a = streamVolume;
            String.format("Volume change, current value: %s", Float.valueOf(streamVolume));
            InterfaceC1875a interfaceC1875a = this.c;
            if (interfaceC1875a != null) {
                interfaceC1875a.a(this.a);
            }
        }
    }
}
