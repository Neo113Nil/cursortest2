package o;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import io.flutter.embedding.engine.FlutterJNI;

/* renamed from: o.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2060v0 extends ContentObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2060v0(Object obj, Handler handler, int i) {
        super(handler);
        this.a = i;
        this.b = obj;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.a) {
            case 1:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z, Uri uri) {
        switch (this.a) {
            case 0:
                io.flutter.view.b bVar = (io.flutter.view.b) this.b;
                if (!bVar.t) {
                    if (Settings.Global.getFloat(bVar.f, "transition_animation_scale", 1.0f) == 0.0f) {
                        bVar.k |= 4;
                    } else {
                        bVar.k &= -5;
                    }
                    ((FlutterJNI) bVar.b.j).setAccessibilityFeatures(bVar.k);
                    break;
                }
                break;
            case 1:
            default:
                super.onChange(z, uri);
                break;
            case 2:
                ((J8) this.b).f(C0782bY.a);
                break;
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        switch (this.a) {
            case 0:
                onChange(z, null);
                break;
            case 1:
                super.onChange(z);
                C0068Cn c0068Cn = (C0068Cn) this.b;
                if (c0068Cn.q != null) {
                    c0068Cn.d();
                    break;
                }
                break;
            default:
                super.onChange(z);
                break;
        }
    }
}
