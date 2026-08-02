package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.PointerIconCompat;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzapb implements zzapa {
    protected static volatile zzaqe zza;
    protected MotionEvent zzb;
    protected double zzk;
    protected float zzl;
    protected float zzm;
    protected float zzn;
    protected float zzo;
    protected DisplayMetrics zzq;
    private double zzr;
    private double zzs;
    protected final LinkedList zzc = new LinkedList();
    protected long zzd = 0;
    protected long zze = 0;
    protected long zzf = 0;
    protected long zzg = 0;
    protected long zzh = 0;
    protected long zzi = 0;
    protected long zzj = 0;
    private boolean zzt = false;
    protected boolean zzp = false;

    protected zzapb(Context context) {
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzcw)).booleanValue()) {
                zzant.zzd();
            } else {
                zzaqf.zza(zza);
            }
            this.zzq = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    private final void zzj() {
        this.zzh = 0L;
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = 0L;
        this.zzg = 0L;
        this.zzi = 0L;
        this.zzj = 0L;
        if (this.zzc.size() > 0) {
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.zzc.clear();
        } else {
            MotionEvent motionEvent = this.zzb;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        this.zzb = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String zzm(Context context, String str, int i, View view, Activity activity, byte[] bArr) {
        zzaoz zzaozVar;
        String str2;
        int i2;
        Exception exc;
        int i3;
        int i4;
        String zza2;
        zzamk zzc;
        int i5;
        int i6;
        int i7 = i;
        long currentTimeMillis = System.currentTimeMillis();
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzcd)).booleanValue();
        zzamk zzamkVar = null;
        if (booleanValue) {
            zzaozVar = zza != null ? zza.zzd() : null;
            str2 = true != ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzcw)).booleanValue() ? "te" : "be";
        } else {
            zzaozVar = null;
            str2 = null;
        }
        try {
            if (i7 == 3) {
                zzamkVar = zzb(context, view, activity);
                try {
                    this.zzt = true;
                    i6 = 1002;
                } catch (Exception e) {
                    exc = e;
                    i2 = 3;
                    if (booleanValue && zzaozVar != null) {
                        if (i7 != i2) {
                            i4 = 1003;
                            i3 = 2;
                        } else {
                            i3 = 2;
                            if (i7 == 2) {
                                i4 = 1009;
                            } else {
                                i4 = 1001;
                                i7 = 1;
                            }
                        }
                        zzaozVar.zzc(i4, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
                        long currentTimeMillis2 = System.currentTimeMillis();
                        if (zzamkVar != null) {
                        }
                        zza2 = Integer.toString(5);
                        return zza2;
                    }
                    i3 = 2;
                    long currentTimeMillis22 = System.currentTimeMillis();
                    if (zzamkVar != null) {
                    }
                    zza2 = Integer.toString(5);
                    return zza2;
                }
            } else {
                if (i7 == 2) {
                    zzc = zzd(context, view, activity);
                    i5 = PointerIconCompat.TYPE_TEXT;
                } else {
                    zzc = zzc(context, null);
                    i5 = 1000;
                }
                zzamkVar = zzc;
                i6 = i5;
            }
            if (!booleanValue || zzaozVar == null) {
                i2 = 3;
            } else {
                i2 = 3;
                try {
                    zzaozVar.zzc(i6, -1, System.currentTimeMillis() - currentTimeMillis, str2, null);
                } catch (Exception e2) {
                    e = e2;
                    exc = e;
                    if (booleanValue) {
                        if (i7 != i2) {
                        }
                        zzaozVar.zzc(i4, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
                        long currentTimeMillis222 = System.currentTimeMillis();
                        if (zzamkVar != null) {
                        }
                        zza2 = Integer.toString(5);
                        return zza2;
                    }
                    i3 = 2;
                    long currentTimeMillis2222 = System.currentTimeMillis();
                    if (zzamkVar != null) {
                    }
                    zza2 = Integer.toString(5);
                    return zza2;
                }
            }
        } catch (Exception e3) {
            e = e3;
            i2 = 3;
        }
        i3 = 2;
        long currentTimeMillis22222 = System.currentTimeMillis();
        if (zzamkVar != null) {
            try {
            } catch (Exception e4) {
                zza2 = Integer.toString(7);
                if (booleanValue && zzaozVar != null) {
                    zzaozVar.zzc(i7 == i2 ? PointerIconCompat.TYPE_CROSSHAIR : i7 == i3 ? PointerIconCompat.TYPE_COPY : 1005, -1, System.currentTimeMillis() - currentTimeMillis22222, str2, e4);
                }
            }
            if (((zzana) zzamkVar.zzam()).zzay() != 0) {
                zza2 = zzant.zza((zzana) zzamkVar.zzam(), str);
                if (booleanValue && zzaozVar != null) {
                    zzaozVar.zzc(i7 == i2 ? PointerIconCompat.TYPE_CELL : i7 == i3 ? PointerIconCompat.TYPE_ALIAS : PointerIconCompat.TYPE_WAIT, -1, System.currentTimeMillis() - currentTimeMillis22222, str2, null);
                }
                return zza2;
            }
        }
        zza2 = Integer.toString(5);
        return zza2;
    }

    protected abstract long zza(StackTraceElement[] stackTraceElementArr) throws zzapv;

    protected abstract zzamk zzb(Context context, View view, Activity activity);

    protected abstract zzamk zzc(Context context, zzamd zzamdVar);

    protected abstract zzamk zzd(Context context, View view, Activity activity);

    @Override // com.google.android.gms.internal.ads.zzapa
    public final String zze(Context context, String str, View view) {
        return zzm(context, str, 3, view, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final String zzf(Context context, String str, View view, Activity activity) {
        return zzm(context, str, 3, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final String zzg(Context context) {
        if (zzaqh.zzf()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return zzm(context, null, 1, null, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final String zzh(Context context, View view, Activity activity) {
        return zzm(context, null, 2, view, activity, null);
    }

    protected abstract zzaqg zzi(MotionEvent motionEvent) throws zzapv;

    @Override // com.google.android.gms.internal.ads.zzapa
    public final synchronized void zzk(MotionEvent motionEvent) {
        Long l;
        if (this.zzt) {
            zzj();
            this.zzt = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.zzk = 0.0d;
            this.zzr = motionEvent.getRawX();
            this.zzs = motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = motionEvent.getRawX();
            double rawY = motionEvent.getRawY();
            double d = rawX - this.zzr;
            double d2 = rawY - this.zzs;
            this.zzk += Math.sqrt((d * d) + (d2 * d2));
            this.zzr = rawX;
            this.zzs = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 != 0) {
            try {
                if (action2 == 1) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    this.zzb = obtain;
                    this.zzc.add(obtain);
                    if (this.zzc.size() > 6) {
                        ((MotionEvent) this.zzc.remove()).recycle();
                    }
                    this.zzf++;
                    this.zzh = zza(new Throwable().getStackTrace());
                } else if (action2 == 2) {
                    this.zze += motionEvent.getHistorySize() + 1;
                    zzaqg zzi = zzi(motionEvent);
                    Long l2 = zzi.zzd;
                    if (l2 != null && zzi.zzg != null) {
                        this.zzi += l2.longValue() + zzi.zzg.longValue();
                    }
                    if (this.zzq != null && (l = zzi.zze) != null && zzi.zzh != null) {
                        this.zzj += l.longValue() + zzi.zzh.longValue();
                    }
                } else if (action2 == 3) {
                    this.zzg++;
                }
            } catch (zzapv unused) {
            }
        } else {
            this.zzl = motionEvent.getX();
            this.zzm = motionEvent.getY();
            this.zzn = motionEvent.getRawX();
            this.zzo = motionEvent.getRawY();
            this.zzd++;
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final synchronized void zzl(int i, int i2, int i3) {
        if (this.zzb != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzcb)).booleanValue()) {
                zzj();
            } else {
                this.zzb.recycle();
            }
        }
        DisplayMetrics displayMetrics = this.zzq;
        if (displayMetrics != null) {
            this.zzb = MotionEvent.obtain(0L, i3, 1, i * displayMetrics.density, this.zzq.density * i2, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.zzb = null;
        }
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public void zzn(View view) {
    }
}
