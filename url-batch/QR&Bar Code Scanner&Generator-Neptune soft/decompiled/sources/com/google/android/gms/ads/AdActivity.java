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
import com.google.android.gms.internal.ads.zzbzc;
import com.google.android.gms.internal.ads.zzcgp;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes.dex */
public final class AdActivity extends Activity {
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    private zzbzc zza;

    private final void zza() {
        zzbzc zzbzcVar = this.zza;
        if (zzbzcVar != null) {
            try {
                zzbzcVar.zzv();
            } catch (RemoteException e) {
                zzcgp.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        try {
            zzbzc zzbzcVar = this.zza;
            if (zzbzcVar != null) {
                zzbzcVar.zzg(i, i2, intent);
            }
        } catch (Exception e) {
            zzcgp.zzl("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            zzbzc zzbzcVar = this.zza;
            if (zzbzcVar != null) {
                if (!zzbzcVar.zzE()) {
                    return;
                }
            }
        } catch (RemoteException e) {
            zzcgp.zzl("#007 Could not call remote method.", e);
        }
        super.onBackPressed();
        try {
            zzbzc zzbzcVar2 = this.zza;
            if (zzbzcVar2 != null) {
                zzbzcVar2.zzh();
            }
        } catch (RemoteException e2) {
            zzcgp.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            zzbzc zzbzcVar = this.zza;
            if (zzbzcVar != null) {
                zzbzcVar.zzj(ObjectWrapper.wrap(configuration));
            }
        } catch (RemoteException e) {
            zzcgp.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zzbzc zzn = zzaw.zza().zzn(this);
        this.zza = zzn;
        if (zzn == null) {
            zzcgp.zzl("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            zzn.zzk(bundle);
        } catch (RemoteException e) {
            zzcgp.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        try {
            zzbzc zzbzcVar = this.zza;
            if (zzbzcVar != null) {
                zzbzcVar.zzl();
            }
        } catch (RemoteException e) {
            zzcgp.zzl("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected final void onPause() {
        try {
            zzbzc zzbzcVar = this.zza;
            if (zzbzcVar != null) {
                zzbzcVar.zzn();
            }
        } catch (RemoteException e) {
            zzcgp.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    protected final void onRestart() {
        super.onRestart();
        try {
            zzbzc zzbzcVar = this.zza;
            if (zzbzcVar != null) {
                zzbzcVar.zzo();
            }
        } catch (RemoteException e) {
            zzcgp.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        try {
            zzbzc zzbzcVar = this.zza;
            if (zzbzcVar != null) {
                zzbzcVar.zzp();
            }
        } catch (RemoteException e) {
            zzcgp.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        try {
            zzbzc zzbzcVar = this.zza;
            if (zzbzcVar != null) {
                zzbzcVar.zzq(bundle);
            }
        } catch (RemoteException e) {
            zzcgp.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected final void onStart() {
        super.onStart();
        try {
            zzbzc zzbzcVar = this.zza;
            if (zzbzcVar != null) {
                zzbzcVar.zzr();
            }
        } catch (RemoteException e) {
            zzcgp.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onStop() {
        try {
            zzbzc zzbzcVar = this.zza;
            if (zzbzcVar != null) {
                zzbzcVar.zzs();
            }
        } catch (RemoteException e) {
            zzcgp.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    protected final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            zzbzc zzbzcVar = this.zza;
            if (zzbzcVar != null) {
                zzbzcVar.zzt();
            }
        } catch (RemoteException e) {
            zzcgp.zzl("#007 Could not call remote method.", e);
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
