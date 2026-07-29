package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzcfi;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class AdActivity extends Activity {
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    private zzbxu zza;

    private final void zza() {
        zzbxu zzbxuVar = this.zza;
        if (zzbxuVar != null) {
            try {
                zzbxuVar.zzv();
            } catch (RemoteException e) {
                zzcfi.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        try {
            zzbxu zzbxuVar = this.zza;
            if (zzbxuVar != null) {
                zzbxuVar.zzg(i, i2, intent);
            }
        } catch (Exception e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            zzbxu zzbxuVar = this.zza;
            if (zzbxuVar != null) {
                if (!zzbxuVar.zzE()) {
                    return;
                }
            }
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
        }
        super.onBackPressed();
        try {
            zzbxu zzbxuVar2 = this.zza;
            if (zzbxuVar2 != null) {
                zzbxuVar2.zzh();
            }
        } catch (RemoteException e2) {
            zzcfi.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            zzbxu zzbxuVar = this.zza;
            if (zzbxuVar != null) {
                zzbxuVar.zzj(ObjectWrapper.wrap(configuration));
            }
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zzbxu zzn = zzaw.zza().zzn(this);
        this.zza = zzn;
        if (zzn == null) {
            zzcfi.zzl("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            zzn.zzk(bundle);
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        try {
            zzbxu zzbxuVar = this.zza;
            if (zzbxuVar != null) {
                zzbxuVar.zzl();
            }
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected final void onPause() {
        try {
            zzbxu zzbxuVar = this.zza;
            if (zzbxuVar != null) {
                zzbxuVar.zzn();
            }
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    protected final void onRestart() {
        super.onRestart();
        try {
            zzbxu zzbxuVar = this.zza;
            if (zzbxuVar != null) {
                zzbxuVar.zzo();
            }
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        try {
            zzbxu zzbxuVar = this.zza;
            if (zzbxuVar != null) {
                zzbxuVar.zzp();
            }
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        try {
            zzbxu zzbxuVar = this.zza;
            if (zzbxuVar != null) {
                zzbxuVar.zzq(bundle);
            }
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected final void onStart() {
        super.onStart();
        try {
            zzbxu zzbxuVar = this.zza;
            if (zzbxuVar != null) {
                zzbxuVar.zzr();
            }
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onStop() {
        try {
            zzbxu zzbxuVar = this.zza;
            if (zzbxuVar != null) {
                zzbxuVar.zzs();
            }
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    protected final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            zzbxu zzbxuVar = this.zza;
            if (zzbxuVar != null) {
                zzbxuVar.zzt();
            }
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        zza();
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        zza();
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        zza();
    }
}
