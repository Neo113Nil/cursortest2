package D;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class v extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f113b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Object obj, Handler handler, int i2) {
        super(handler);
        this.f112a = i2;
        this.f113b = obj;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.f112a) {
            case 0:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z2, Uri uri) {
        switch (this.f112a) {
            case 1:
                io.flutter.view.h hVar = (io.flutter.view.h) this.f113b;
                if (!hVar.f797t) {
                    if (Settings.Global.getFloat(hVar.f783f, "transition_animation_scale", 1.0f) == 0.0f) {
                        hVar.f788k |= 4;
                    } else {
                        hVar.f788k &= -5;
                    }
                    ((FlutterJNI) hVar.f779b.f14b).setAccessibilityFeatures(hVar.f788k);
                    break;
                }
                break;
            default:
                super.onChange(z2, uri);
                break;
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z2) {
        switch (this.f112a) {
            case 0:
                super.onChange(z2);
                y yVar = (y) this.f113b;
                if (yVar.f129j != null) {
                    yVar.d();
                    break;
                }
                break;
            default:
                onChange(z2, null);
                break;
        }
    }
}
